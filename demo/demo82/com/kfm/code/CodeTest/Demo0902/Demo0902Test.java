package code.CodeTest.Demo0902;


/**
 * 单例模式
 *
 * 第一步应该将构造方法私有
 *
 * 3种实现方式
 *
 * 1.“懒汉”  idler
 *
 * 2.“饿汉” Hungry
 *
 * 3.静态内部类
 *
 * 4.枚举
 */

public class Demo0902Test {
    public static void main(String[] args) {
        // 懒汉
/*        Hungry a = Hungry.getobject();
        Hungry b = Hungry.getobject();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);*/
        // 饿汉
/*        IdlerTest x = IdlerTest.getobject();
        IdlerTest y = IdlerTest.getobject();
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);*/
        // 静态内部类
        InnerClass a = InnerClass.getobject();
        InnerClass b = InnerClass.getobject();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        // 枚举
        OneObject object = OneObject.OBJECT;
        OneObject object1 = OneObject.OBJECT;
        System.out.println(object);
        System.out.println(object1);
        System.out.println(object==object1);

    }
}
