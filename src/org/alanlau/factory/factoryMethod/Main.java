package org.alanlau.factory.factoryMethod;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/7 11:32
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        Product product1 = factory1.createProduct();
        product1.show();

        AbstractFactory factory2 = new ConcreteFactory2();
        Product product2 = factory2.createProduct();
        product2.show();
    }
}

/**
 * 抽象产品：提供了产品的接口
 */
interface Product {
    void show();
}

class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}

class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}

/**
 * 抽象工厂：提供了厂品的生成方法
 */
interface AbstractFactory {
    Product createProduct();
}

/**
 * 具体工厂1：实现了厂品的生成方法
 */
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product createProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}

/**
 * 具体工厂2：实现了厂品的生成方法
 */
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product createProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}