package code.test.Demo0830.abnormal1;

public class ejection {
    public static void main(String[] args) {
        try {
            test();
        }
        catch (Exception e)
        {
            System.out.println("你的异常信息是"+ e.getMessage());
            System.out.println("我稳稳接住你的异常");
        }
    }
    public static void test() throws Exception
    {
        System.out.println("我就想抛出异常");
        System.out.println(1/0);

    }

}
