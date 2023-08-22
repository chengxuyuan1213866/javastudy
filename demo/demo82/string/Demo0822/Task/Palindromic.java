package string.Demo0822.Task;

import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        System.out.println(judgment(str));
    }
    public static Boolean judgment(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) == s.charAt(s.length()-i-1))
            {
                count++;
            }
        }
        if (count == s.length()/2)
        {
            return true;
        }
        else
            return false;
    }
}
