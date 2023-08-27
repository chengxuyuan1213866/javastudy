package src.Demo0811.Task;

public class Demo3 {
    public static void main(String[] args) {
        int a = 4;
        boolean b = primenumber(8);
        System.out.println(b);
    }
    public static boolean primenumber(int n)
    {
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
