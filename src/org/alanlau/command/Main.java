package org.alanlau.command;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/2 21:54
 */
public class Main {
    public static void main(String[] args) {
        Content c = new Content();

        InsertCommand insertCommand = new InsertCommand(c);
        insertCommand.doit();
        insertCommand.undo();

        CopyCommand copyCommand = new CopyCommand(c);
        copyCommand.doit();
        copyCommand.undo();

        DeleteCommand deleteCommand = new DeleteCommand(c);
        deleteCommand.doit();
        deleteCommand.undo();

        System.out.println(c.msg);
    }
}
