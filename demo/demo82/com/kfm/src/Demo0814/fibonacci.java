package src.Demo0814;

/**
 * @author Administrator
 */
public class fibonacci {
    public static void main(String[] args) {
        int a = fun(5);
        System.out.println(a);
    }
    public static int fun(int n) {
        if (n == 2)
        {
            return 1;
        }
        else if (n == 1){
            return 1;
        }

        return fun(n-1)+fun(n-2);
    }
}
