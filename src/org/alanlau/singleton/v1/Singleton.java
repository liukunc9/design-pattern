package org.alanlau.singleton.v1;

/**
 * 饿汉式
 *
 * @author liukun
 * @version 1.0
 * @date 2020/10/29 11:34
 */
public class Singleton {
    /**
     * 1、私有构造方法
     */
    private Singleton() {}

    /**
     * 2、私有静态实例
     */
    private static Singleton instance = new Singleton();

    /**
     * 3、公有获取单例方法
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
