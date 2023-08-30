package code.test.Demo0830.abnormal1;




public class demo {
    /**
     * 有return时的异常执行情况
     * @param args
     */

    public static void main(String[] args) {
        test();

    }

    public static void test()
    {
        try {
            System.out.println("异常前");
            System.out.println(1/0);

            System.out.println("异常后");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("这里是finally");
            return;

        }
    }






}
