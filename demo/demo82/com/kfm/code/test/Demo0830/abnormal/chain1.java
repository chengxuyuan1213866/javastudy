package code.test.Demo0830.abnormal;

public class chain1 {

    public static void main(String[] args) {

        try {
            Test3();
        }
        catch (Exception e)
        {
            e.getCause().printStackTrace();
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
            Exception e1 = e;
            e1.initCause(e);
            throw new Exception("我是Test2的异常",e1);
        }
    }
    public static void Test3() throws Exception
    {
        try {
            Test2();
        }
        catch (Exception e)
        {
            Exception e1 = e;
            e1.initCause(e);
            throw new Exception("我是Test3的异常",e1);
        }
    }



}
