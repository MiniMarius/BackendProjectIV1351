package se.kth.iv1351.view;

import org.apache.ibatis.session.SqlSessionFactory;
import se.kth.iv1351.controller.LeaseController;
import se.kth.iv1351.controller.ReportController;
import se.kth.iv1351.model.Lease;
import se.kth.iv1351.model.Report;

import java.util.List;
import java.util.Scanner;

public class BlockingInterpreter {
    private static final String PROMPT = "> ";
    private final Scanner console = new Scanner(System.in);
    private boolean keepReceivingCmds = false;
    SqlSessionFactory sqlSessionFactory;

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
                    case REPORT:
                        ReportController reportController = new ReportController(sqlSessionFactory);
                        String reportStartTime = cmdLine.getParameter(0);
                        List<Report> reportDataList = reportController.getReport(reportStartTime);
                        System.out.println(reportDataList);
                        break;

                    case RENTAL:
                        LeaseController leaseController = new LeaseController(sqlSessionFactory);
                        System.out.println("list create delete rentals");
                        CmdLine nestedCmdLine = new CmdLine(readNextLine());
                        switch (nestedCmdLine.getCmd()) {
                            case LIST:
                                System.out.println("Listing rental instruments");
                                System.out.println(leaseController.listRentalInstruments());
                                break;
                            case CREATE:
                                System.out.println("create a new rental");
                                String instrumentId = nestedCmdLine.getParameter(0);
                                String studentId = nestedCmdLine.getParameter(1);
                                String startTime = nestedCmdLine.getParameter(2);
                                String endTime = nestedCmdLine.getParameter(3);
                                Lease createdLease = leaseController.create(studentId, instrumentId, startTime, endTime);
                                System.out.println(createdLease);
                                break;
                            case DELETE:
                                System.out.println("terminate a rental");
                                String leaseId = nestedCmdLine.getParameter(0);
                                Lease lease = leaseController.terminateLease(leaseId);
                                System.out.println(lease);
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