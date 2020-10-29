package org.alanlau.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式
 *
 * @author liukun
 * @version 1.0
 * @date 2020/10/29 9:12
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        // 设置将JDK动态代理字节码保存
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable timeProxy = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new TimeHandler(tank));
        Movable tankProxy = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new LogHandler(timeProxy));
        tankProxy.move();
    }
}

class LogHandler implements InvocationHandler {
    Object object;

    public LogHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " start invoke....");
        Object res = method.invoke(object, args);
        System.out.println(method.getName() + " end invoke....");
        return res;
    }
}

class TimeHandler implements InvocationHandler {
    Object object;

    public TimeHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object o = method.invoke(object, args);
        System.out.println(object.getClass().getTypeName() + " -> " + method.getName() + " invoke cost " + (System.currentTimeMillis() - start) + " ms");
        return o;
    }
}

interface Movable {
    void move();
}