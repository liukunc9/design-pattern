package org.alanlau.strategy.other;

/**
 * 猫怪
 *
 * @author alan
 * @version 1.0
 * @date 2020/10/29 20:48
 */
public class Cat implements Comparable<Cat> {
    /**
     * 猫怪的体重
     */
    private int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.weight > cat.weight) {
            return 1;
        } else if (this.weight < cat.weight) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
