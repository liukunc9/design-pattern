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

    public static void main(String[] args) {
        // 按照猫怪的体重进行排序
        Cat c1 = new Cat(50);
        Cat c2 = new Cat(51);
        Cat c3 = new Cat(41);
        Cat c4 = new Cat(11);
        Cat[] sort = Sorter.sort(new Cat[]{c1, c2, c3, c4});
        for (Cat cat : sort) {
            System.out.printf("%s, ", cat);
        }
    }
}
