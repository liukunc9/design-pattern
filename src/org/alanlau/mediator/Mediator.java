package org.alanlau.mediator;

/**
 * 抽象中介者
 */
abstract class Mediator {
    /**
     * 注册到中介
     *
     * @param colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     *
     * @param cl
     */
    public abstract void relay(Colleague cl);
}
