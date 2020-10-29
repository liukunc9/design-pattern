package org.alanlau.strategy;

/**
 * @author alan
 * @version 1.0
 * @date 2020/10/29 21:11
 */
public interface Comparator<T> {
    /**
     * 比较大小
     *
     * @param o1 对象1
     * @param o2 对象2
     * @return -1： o1 < o2; 0: o1 = o2; 1: o1 > o2
     */
    int compare(T o1, T o2);
}
