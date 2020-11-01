package org.alanlau.mediator;

/**
 * 抽象同事类
 */
abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 收到请求
     */
    public abstract void receive();

    /**
     * 发送请求
     */
    public abstract void send();
}
