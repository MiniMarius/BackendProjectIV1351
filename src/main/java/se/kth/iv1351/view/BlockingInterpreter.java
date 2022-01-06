package se.kth.iv1351.view;

import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.cliController.*;
import se.kth.iv1351.model.UserData;
import se.kth.iv1351.openapi.model.User;

import java.util.List;
import java.util.Scanner;

public class BlockingInterpreter {
    private static final String PROMPT = "> ";
    private final Scanner console = new Scanner(System.in);
    private boolean keepReceivingCmds = false;
    SqlSessionFactory sqlSessionFactory;

    private Controller ctrl;

    public BlockingInterpreter(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /**
     * Creates a new instance that will use the specified controller for all operations.
     *
     * @param ctrl The controller used by this instance.
     */

    /**
     * Stops the commend interpreter.
     */
    public void stop() {
        keepReceivingCmds = false;
    }

    /**
     * Interprets and performs user commands. This method will not return until the
     * UI has been stopped. The UI is stopped either when the user gives the
     * "quit" command, or when the method <code>stop()</code> is called.
     */
    public void handleCmds() {
        keepReceivingCmds = true;
        while (keepReceivingCmds) {
            try {
                CmdLine cmdLine = new CmdLine(readNextLine());
                switch (cmdLine.getCmd()) {
                    case HELP:
                        for (Command command : Command.values()) {
                            if (command == Command.ILLEGAL_COMMAND) {
                                continue;
                            }
                            System.out.println(command.toString().toLowerCase());
                        }
                        break;
                    case QUIT:
                        keepReceivingCmds = false;
                        break;
                    case NEW:
                        ctrl.insert(cmdLine.getParameter(0));
                        break;
                    case DELETE:
                        ctrl.delete(cmdLine.getParameter(0));
                        break;
                    case LISTONE:
                        Object object = ctrl.get(cmdLine.getParameter(0));
                        System.out.println(object);
                        break;
                    case TYPE:
                        System.out.println("Choose type to do operations on");
                        CmdLine nestedCmdLine = new CmdLine(readNextLine());
                        switch (nestedCmdLine.getCmd()) {
                            case USER:
                                System.out.println("user selected");
                                ctrl = new UserController(sqlSessionFactory);
                                break;
                            case LEASE:
                                System.out.println("lease selected");
                                ctrl = new LeaseController(sqlSessionFactory);
                            case LESSON:
                                System.out.println("lesson selected");
                                ctrl = new LessonController(sqlSessionFactory);
                                break;
                            case PARENT:
                                System.out.println("parent selected");
                                ctrl = new ParentController(sqlSessionFactory);
                                break;
                            case RENTALINSTRUMENT:
                                System.out.println("rental instrument selected");
                                ctrl = new RentalInstrumentController(sqlSessionFactory);
                                break;
                            case REPORT:
                                System.out.println("report selected");
                                ctrl = new ReportController(sqlSessionFactory);
                                break;
                            case SIBLING:
                                System.out.println("sibling selected");
                                ctrl = new SiblingController(sqlSessionFactory);
                                break;
                            case USERAPPLICATION:
                                System.out.println("user application selected");
                                ctrl = new UserApplicationController(sqlSessionFactory);
                                break;
                            case USERINSTRUMENT:
                                System.out.println("user instrument selected");
                                ctrl = new UserInstrumentController(sqlSessionFactory);
                                break;
                            case USERPAYMENT:
                                System.out.println("user payment selected");
                                ctrl = new UserPaymentController(sqlSessionFactory);
                                break;
                        }
                        break;
                    default:
                        System.out.println("illegal command");
                }
            } catch (Exception e) {
                System.out.println("Operation failed");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private String readNextLine() {
        System.out.print(PROMPT);
        return console.nextLine();
    }
}