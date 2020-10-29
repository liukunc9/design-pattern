package org.alanlau.iterator;

/**
 * 迭代器
 *
 * @author alan
 * @version 1.0
 * @date 2020/1/11 19:48
 */
public interface Iterator<E> {
    /**
     * 是否还有下一个
     * @return
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     * @return
     */
    E next();
}