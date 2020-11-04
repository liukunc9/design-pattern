package org.alanlau.state.v2;

/**
 * 将状态抽象出来
 * @author liukun
 * @version 1.0
 * @date 2020/11/4 19:17
 */
public class MM {
    String name;
    MMState state = new MMHappyState();

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }

}

abstract class MMState {
    abstract void smile();
    abstract void cry();
    abstract void say();
}

class MMSadState extends MMState {
    @Override
    void smile() {

    }

    @Override
    void cry() {

    }

    @Override
    void say() {

    }
}

class MMNervousState extends MMState {
    @Override
    void smile() {

    }

    @Override
    void cry() {

    }

    @Override
    void say() {

    }
}

class MMHappyState extends MMState {
    @Override
    void smile() {
        System.out.println("happy smile");
    }

    @Override
    void cry() {

    }

    @Override
    void say() {

    }
}

