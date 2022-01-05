package se.kth.iv1351.view;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import se.kth.iv1351.cliController.UserController;
import se.kth.iv1351.model.UserData;

import java.util.List;
import java.util.Scanner;
@Service
public class BlockingInterpreter {
    private static final String PROMPT = "> ";
    private final Scanner console = new Scanner(System.in);
    private boolean keepReceivingCmds = false;

    private UserController userController;

    public BlockingInterpreter() {
        
    }

    public BlockingInterpreter(UserController userController) {
        this.userController = userController;
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
                        userController.createUser(cmdLine.getParameter(0));
                        break;
                    case DELETE:
                        userController.deleteUser(cmdLine.getParameter(0));
                        break;
                    case LIST:
                        List<UserData> users = null;
                        users = userController.getAllUsers();
                        for (UserData user : users) {
                            System.out.println("id: " + user.getId() + ", "
                                    + "name: " + user.getName() + ", "
                                    + "role: " + user.getRole());
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