package org.alanlau.command;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/2 21:49
 */
public class InsertCommand extends Command {
    Content c;
    String strToInsert = "http://www.aaa.com";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + strToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
    }
}
