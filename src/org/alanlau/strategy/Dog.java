package org.alanlau.strategy;

/**
 * 狗怪
 *
 * @author alan
 * @version 1.0
 * @date 2020/10/29 21:19
 */
public class Dog {
    private int height;
    private int weight;

    public Dog(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
