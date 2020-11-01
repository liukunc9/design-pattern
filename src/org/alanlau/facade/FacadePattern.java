package org.alanlau.facade;

/**
 * 外观模式
 *
 * @author alan
 * @version 1.0
 * @date 2020/11/1 17:52
 */
public class FacadePattern {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.method("1");
        f.method("2");
        f.method("3");
    }
}

/**
 * 外观角色
 */
class Facade
{
    private SubSystem01 obj1=new SubSystem01();
    private SubSystem02 obj2=new SubSystem02();
    private SubSystem03 obj3=new SubSystem03();

    public void method(String systemName)
    {
        switch (systemName) {
            case "1":
                obj1.method1();
                break;
            case "2":
                obj2.method2();
                break;
            case "3":
                obj3.method3();
                break;
            default:
                obj1.method1();
        }
    }
}

/**
 * 子系统角色
 */
class SubSystem01
{
    public  void method1()
    {
        System.out.println("子系统01的method1()被调用！");
    }
}

/**
 * 子系统角色
 */
class SubSystem02
{
    public  void method2()
    {
        System.out.println("子系统02的method2()被调用！");
    }
}

/**
 * 子系统角色
 */
class SubSystem03
{
    public  void method3()
    {
        System.out.println("子系统03的method3()被调用！");
    }
}