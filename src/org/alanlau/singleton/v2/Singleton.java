package org.alanlau.singleton.v2;

/**
 * 懒汉式
 *
 * @author liukun
 * @version 1.0
 * @date 2020/10/29 11:32
 */
public class Singleton {
    /**
     * 1、私有构造方法
     */
    private Singleton() {
    }

    /**
     * 2、私有静态实例
     */
    private static volatile Singleton instance;

    /**
     * 3、公有获取单例方法
     */
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
