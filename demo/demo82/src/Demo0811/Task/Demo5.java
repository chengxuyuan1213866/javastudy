package src.Demo0811.Task;

/**
 * @author Administrator
 */
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(palindrome(1231));
    }
    public static boolean palindrome(int n)
    {
        int len = 0;
        int m = n;
        while (m!=0)
        {
            m = m/10;
            len++;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            int x = (int) (n/Math.pow(10,i)%10);
            int y = (int) (n/Math.pow(10,len-i-1)%10);
            if (x == y)
            {
                count++;
            }

        }
        return count == len;

    }
}
