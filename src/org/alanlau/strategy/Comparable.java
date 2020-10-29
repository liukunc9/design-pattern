package org.alanlau.strategy;

/**
 * @author liukun
 * @version 1.0
 * @date 2020/10/29 19:20
 */
public interface Comparable<T> {
    /**
     * 比较
     * @param t 比较的值
     * @return -1：比传入值小； 0： 相等； 1：比传入值大
     */
    int compareTo(T t);
}
