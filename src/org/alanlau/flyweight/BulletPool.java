package org.alanlau.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 子弹池
 *
 * @author alan
 * @version 1.0
 * @date 2020/11/2 21:30
 */
public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();

    {
        for (int i = 0; i < 5; i++) {
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (b.living) {
                return b;
            }
        }

        return new Bullet();
    }

    public void reset() {
        for (Bullet bullet : bullets) {
            bullet.living = true;
        }
    }

    public static void main(String[] args) {
        BulletPool bp = new BulletPool();

        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            if (i == 6) {
                bp.reset();
            }
            System.out.println(b);
            b.living = false;
        }
    }

}

/**
 * 子弹
 *
 * @author alan
 * @version 1.0
 * @date 2020/11/2 21:31
 */
class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                '}';
    }
}
