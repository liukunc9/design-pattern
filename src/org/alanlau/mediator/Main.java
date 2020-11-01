package org.alanlau.mediator;

/**
 * 中介者模式
 *
 * @author alan
 * @version 1.0
 * @date 2020/10/29 22:39
 */
public class Main {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
