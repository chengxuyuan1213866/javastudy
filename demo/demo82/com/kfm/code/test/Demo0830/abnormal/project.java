package code.test.Demo0830.abnormal;

public class project {

    project() throws Exception
    {
        throw new Exception("我就想抛出一个异常");
    }

}
class test55 extends project{
    test55() throws Exception {
        super();
    }
    public void fun() throws Error
    {
        throw new Error("\"我牛逼，我抛出error\"");

    }
}

class test22
{
    public static void main(String[] args)  {
        try {
            test55 a = new test55();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            fun();
        }
        catch (Error a)
        {
            System.out.println(a.getMessage());
        }


    }
    public static void fun() throws Error
    {
        throw new Error("\"我牛逼，我抛出error\"");

    }
}