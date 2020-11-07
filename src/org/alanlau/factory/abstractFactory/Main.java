package org.alanlau.factory.abstractFactory;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/7 12:01
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.show();
        productB.test();
    }
}

interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

/**
 * 实际的工厂
 */
class ConcreteFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB();
    }
}

/**
 * 产品A
 */
interface ProductA {
    void show();
}

/**
 * 产品B
 */
interface ProductB {
    void test();
}

/**
 * 实际的产品A
 */
class ConcreteProductA implements ProductA {
    @Override
    public void show() {
        System.out.println("实际的产品A");
    }
}

/**
 * 实际的产品B
 */
class ConcreteProductB implements ProductB {
    @Override
    public void test() {
        System.out.println("实际的产品B");
    }
}