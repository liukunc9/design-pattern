package org.alanlau.bridge.v1;

/**
 * @author liukun
 * @version 1.0
 * @date 2020/11/4 18:52
 */
public class Main {
    public static void main(String[] args) {

    }
}

abstract class Gift {

}

class Book extends Gift {

}

class Flower extends Gift {

}

class MM {
    String name;
}

class GG {
    public void chase(MM mm) {
        Gift gift = new Book();
        give(mm, gift);
    }

    public void give(MM mm, Gift gift) {

    }
}