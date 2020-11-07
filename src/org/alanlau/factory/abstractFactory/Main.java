package org.alanlau.factory.abstractFactory;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/7 12:01
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        ProductA productA1 = factory.createProductA();
        ProductB productB1 = factory.createProductB();
        productA1.show();
        productB1.test();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.show();
        productB2.test();
    }
}

interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

/**
 * 实际的工厂1
 */
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

/**
 * 实际的工厂2
 */
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
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

class ConcreteProductA1 implements ProductA {
    @Override
    public void show() {
        System.out.println("实际的产品A1");
    }
}

class ConcreteProductA2 implements ProductA {
    @Override
    public void show() {
        System.out.println("实际的产品A2");
    }
}

class ConcreteProductB1 implements ProductB {
    @Override
    public void test() {
        System.out.println("实际的产品B1");
    }
}

class ConcreteProductB2 implements ProductB {
    @Override
    public void test() {
        System.out.println("实际的产品B2");
    }
}