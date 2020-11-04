package org.alanlau.bridge.v4;

/**
 * 使用桥接模式：
 * 分离抽象与具体实现，让他们可以独自发展
 * Gift -> WarmGift ColdGift WildGift
 * GiftImpl -> Flower Ring Car
 *
 * @author liukun
 * @version 1.0
 * @date 2020/11/4 18:52
 */
public class Main {
    public static void main(String[] args) {
        MM m = new MM("隔壁小花");
        GG g = new GG();
        g.chase(m);
    }
}

/**
 * 抽象的线路，各自向下发展
 */
abstract class Gift {
    protected GiftImpl impl;
}

/**
 * 实现的线路，各自向下发展
 */
class GiftImpl {
}

class Book extends GiftImpl {

}

class Flower extends GiftImpl {

}

class WildGift extends Gift {
    public WildGift(GiftImpl impl) {
        this.impl = impl;
    }
}

class WarmGift extends Gift {
    public WarmGift(GiftImpl impl) {
        this.impl = impl;
    }
}


class MM {
    String name;

    public MM(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class GG {
    public void chase(MM mm) {
        // 温暖的花
        Gift gift = new WarmGift(new Flower());
        give(mm, gift);
    }

    public void give(MM mm, Gift gift) {
        System.out.println(mm + " gived!");
    }
}