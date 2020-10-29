package org.alanlau.strategy;

/**
 * 狗怪身高比较器
 *
 * @author alan
 * @version 1.0
 * @date 2020/10/29 21:29
 */
public class DogHeightComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return 1;
        } else if (o1.getHeight() < o2.getHeight()) {
            return -1;
        }
        return 0;
    }
}
