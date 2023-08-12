package src.Demo0811;

/**
 * @author Administrator
 */
public class Method {


    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(myprint());;
        }
    }


    public static String myprint()
    {
        return "铁子666";
    }
// 在main方法中调用了myprint方法
}
