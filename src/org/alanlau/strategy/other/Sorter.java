package org.alanlau.strategy.other;

/**
 * 排序类
 *
 * @author alan
 * @version 1.0
 * @date 2020/10/29 20:52
 */
public class Sorter {
    public static <T extends Comparable<T>> T[] sort(T[] src) {
        int len = src.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - i - 1; j++) {
                if (src[j].compareTo(src[j + 1]) > 0) {
                    T temp = src[j];
                    src[j] = src[j + 1];
                    src[j + 1] = temp;
                }
            }

            for (int j = len - 1 - (i + 1); j > i; j--) {
                if (src[j].compareTo(src[j - 1]) < 0) {
                    T temp = src[j];
                    src[j] = src[j - 1];
                    src[j - 1] = temp;
                }
            }
        }
        return src;
    }
}
