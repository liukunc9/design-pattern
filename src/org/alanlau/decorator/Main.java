package org.alanlau.decorator;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/1 18:10
 */
public class Main {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();

        System.out.println("---------------------------------");

        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}

