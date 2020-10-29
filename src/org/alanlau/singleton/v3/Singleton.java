package org.alanlau.singleton.v3;

/**
 * 静态内部类单例（holder）
 *
 * @author liukun
 * @version 1.0
 * @date 2020/10/29 11:35
 */
public class Singleton {
    /**
     * 1、私有构造方法
     */
    private Singleton() {}

    /**
     * 3、公有获取单例方法
     */
    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * 2、私有静态内部类生成单例
     */
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
