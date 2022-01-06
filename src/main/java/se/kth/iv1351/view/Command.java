package se.kth.iv1351.view;

/**
 * Defines all commands that can be performed by a user of the chat application.
 */
public enum Command {
    CREATE,
    RENTAL,
    /**
     * Creates a new object
     */
    NEW,
    /**
     * Choose type to select
     */
    TYPE,
    /**
     * list specific object
     */
    LISTONE,
    /**
     * Lists all existing objects.
     */
    LIST,
    /**
     * Deletes the specified object.
     */
    DELETE,
    /**
     * Deposits the specified amount to the specified object
     */
    DEPOSIT,
    /**
     * Withdraws the specified amount from the specified object
     */
    WITHDRAW,
    /**
     * Lists the balance of the specified object.
     */
    BALANCE,
    /**
     * Lists all commands.
     */
    HELP,
    /**
     * Leave the chat application.
     */
    QUIT,
    /**
     *
     */
    LEASE,
    /**
     *
     */
    LESSON,
    /**
     *
     */
    PARENT,
    /**
     *
     */
    RENTALINSTRUMENT,
    /**
     *
     */
    REPORT,
    /**
     *
     */
    SIBLING,
    /**
     *
     */
    USERAPPLICATION,
    /**
     *
     */
    USERINSTRUMENT,
    /**
     *
     */
    USER,
    /**
     *
     */
    USERPAYMENT,
    /**
     * None of the valid commands above was specified.
     */
    ILLEGAL_COMMAND
}