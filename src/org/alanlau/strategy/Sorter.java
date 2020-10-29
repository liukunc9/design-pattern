package org.alanlau.strategy;

/**
 * @author alan
 * @version 1.0
 * @date 2020/10/29 21:13
 */
public class Sorter {
    /**
     * 排序
     * @param src 数组
     * @param comparator 传一个该数组的比较器(这个比较器便是策略模式的体现）
     * @param <T> 泛型
     */
    public static <T> void sort(T[] src, Comparator<T> comparator) {
        int len = src.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - i - 1; j++) {
                if (comparator.compare(src[j], src[j + 1]) > 0) {
                    T temp = src[j];
                    src[j] = src[j + 1];
                    src[j + 1] = temp;
                }
            }

            for (int j = len - 1 - (i + 1); j > i; j--) {
                if (comparator.compare(src[j], src[j - 1]) < 0) {
                    T temp = src[j];
                    src[j] = src[j - 1];
                    src[j - 1] = temp;
                }
            }
        }
    }
}
