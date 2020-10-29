package org.alanlau.singleton.v4;

/**
 * 不仅可以解决线程同步，还可以防止反序列化
 *
 * @author alan
 * @version 1.0
 * @date 2020/10/29 22:07
 */
public enum  Singleton {
    INSTANCE;

    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE);
    }
}
