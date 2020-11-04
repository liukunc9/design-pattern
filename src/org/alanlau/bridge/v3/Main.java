package org.alanlau.bridge.v3;

/**
 * 如果礼物分为温柔的礼物和狂野的礼物
 * WarmGift WildGift
 * 这时Flower应该分为
 * WarmFlower WildFlower
 * WarmBook WildBook
 *
 * 如果再有别的礼物，比如抽象类型：ToughGift ColdGift
 * 或者具体的某种实现：Ring Car
 *
 * 就会产生类的爆炸
 * WarmCar ColdRing WildCar WildFlower ...
 *
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

class WildGift extends Gift {

}

class WarmGift extends Gift {

}

/**
 * 或者从WarmGift继承
 * 或者从Flower继承
 */
class WarmFlower extends Flower {
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