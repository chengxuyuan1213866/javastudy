package code.test.Demo0830.abnormal1;

public class ejection1 {

    public static void main(String[] args) {
        try {
            test();
        }
        catch (Exception e)
        {
            System.out.println("我稳稳接住你的异常");
            System.out.println("你的异常是"+e.getMessage());
        }

    }
    public static void test() throws Exception {
        throw new Exception("我就想抛出一个异常");
    }

}
