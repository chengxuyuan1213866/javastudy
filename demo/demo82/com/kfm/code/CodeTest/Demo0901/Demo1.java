package code.CodeTest.Demo0901;



/**
 * Record记录类
 * 专门用于描述内容不可变，记录数据的类
 *  记录类的对象不能调用初始化的字段
 *  但是记录类自动生成了getter方法
 *  可以访问到数据
 *
 *  2.记录类会自动重写
 *    hashCode()   toString()    equals()方法
 *   记录类定义时后面的的字段是 “private final” 修饰的
 *      在记录类里面写字段时必须是static修饰的
 *
 *
 *      此博客介绍的非常详细
 *  https://blog.csdn.net/m0_74421344/article/details/129204097
 *
 */
public record Demo1(int a,String na ) {
    static int aa = 10;
    public void fun()
    {
        System.out.println(aa);
        aa = 20;
        System.out.println(aa);
        System.out.println("实例方法fun");
    }
    public static void fun1()
    {
        System.out.println(aa);
        System.out.println("静态方法fun1");
    }

}



class TestA{
    public static void main(String[] args) {
        Demo1 d1 = new Demo1(1,"蔡徐坤");
        d1.fun();
        d1.a();
        d1.na();


    }
}












