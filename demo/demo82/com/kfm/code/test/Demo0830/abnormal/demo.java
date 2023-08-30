package code.test.Demo0830.abnormal;

public class demo {

    public static void main(String[] args) {
        try {
            throw new MyNoneExpection("我就主动抛出异常");
        }
        catch (Exception e)
        {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
