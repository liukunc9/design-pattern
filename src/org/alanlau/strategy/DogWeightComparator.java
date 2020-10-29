package org.alanlau.strategy;

/**
 * 狗怪体重比较器
 *
 * @author alan
 * @version 1.0
 * @date 2020/10/29 21:29
 */
public class DogWeightComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
}
