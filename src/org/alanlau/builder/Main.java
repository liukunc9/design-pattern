package org.alanlau.builder;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/1 20:49
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 18)
                .score(20)
                .weight(200)
                .loc("向阳路", "32号")
                .build();

        System.out.println(p);
    }
}
