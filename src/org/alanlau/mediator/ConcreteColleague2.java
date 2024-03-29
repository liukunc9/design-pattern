package org.alanlau.mediator;

/**
 * 具体同事类
 */
class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        // 请求中介转发
        mediator.relay(this);
    }
}
