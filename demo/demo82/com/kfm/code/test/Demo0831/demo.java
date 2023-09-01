package code.test.Demo0831;

public class demo {
    public static void main(String[] args) {
        System.out.println(fun(20));
    }
    public static int fun(int n)
    {
        if (n <=2) {
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return fun(n-1);
            }
        }
        else {
            return fun(n-1)+fun(n-2);
        }
        return 1;
    }
}
interface AA
{

}