package code.test.Demo0830.abnormal;

public class chain {

    // 什么是异常
    // 什么是运行时异常
    // 如何处理异常
    // 什么是check异常
    // 构造方法抛出异常对子类的影响
    // throw和throws 的区别
    // 自己error异常
    // finally 的return
    // 为什么要自定义异常
    // 如何自定义异常
    // 链表增删改查
    // 实现双链表

    public static void main(String[] args) {

        try {
            Test3();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void Test1() throws MyNoneExpection
    {
            throw new MyNoneExpection("我是Test1的异常");
    }
    public static void Test2() throws Exception
    {
        try {
            Test1();
        }
        catch (Exception e)
        {
            throw new Exception("我是Test2的异常",e);
        }
    }
    public static void Test3() throws Exception
    {
        try {
            Test2();
        }
        catch (Exception e)
        {
            throw new Exception("我是Test3的异常",e);
        }
    }




}
