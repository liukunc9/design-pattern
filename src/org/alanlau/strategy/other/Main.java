package org.alanlau.strategy.other;

/**
 * @author liukun
 * @version 1.0
 * @date 2020/10/30 8:38
 */
public class Main {

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
