package org.alanlau.strategy;

/**
 * @author alan
 * @version 1.0
 * @date 2020/10/29 20:47
 */
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog(20, 13);
        Dog d2 = new Dog(30, 11);
        Dog d3 = new Dog(10, 44);
        Dog d4 = new Dog(1, 32);
        Dog[] dogs = {d1, d2, d3, d4};
        System.out.println("\n---------------按身高比较-----------------");
        // 传入身高的策略
        Sorter.sort(dogs, new DogHeightComparator());
        show(dogs);

        System.out.println("\n\n---------------按体重比较-----------------");
        // 传入体重的策略
        Sorter.sort(dogs, new DogWeightComparator());
        show(dogs);

    }

    private static void show(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.printf("%s, ", dog);
        }
    }
}
