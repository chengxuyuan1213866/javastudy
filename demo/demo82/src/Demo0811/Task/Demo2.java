package src.Demo0811.Task;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Factorial(4));

    }
    public static int Factorial(int n)
    {
        if (n == 1)
        {
            return n;
        }
        else
        {
            return n*Factorial(n-1);
        }

    }
}
