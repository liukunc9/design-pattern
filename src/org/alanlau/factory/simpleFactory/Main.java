package org.alanlau.factory.simpleFactory;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/7 10:41
 */
public class Main {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct(Const.PRODUCT_A);
        product.show();
    }
}

final class Const {
    static final int PRODUCT_A = 0;
    static final int PRODUCT_B = 1;
    static final int PRODUCT_C = 2;
}

class SimpleFactory {
    public static Product createProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }
}

/**
 * 抽象产品
 */
interface Product {
    void show();
}

/**
 * 具体产品：ProductA
 */
class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}

/**
 * 具体产品：ProductB
 */
class ConcreteProduct2 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}