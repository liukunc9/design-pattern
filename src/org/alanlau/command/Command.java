package org.alanlau.command;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/2 21:48
 */
public abstract class Command {
    public abstract void doit();
    public abstract void undo();
}
