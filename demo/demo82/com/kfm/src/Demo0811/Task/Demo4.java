package src.Demo0811.Task;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class Demo4 {
    public static void main(String[] args) {
        char[] a = {'a','b','c','d','e'};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(char[] ch)
    {
        int len = ch.length;
        for (int i = 0; i <= len/2; i++) {
            char temp = ch[i];
            ch[i] = ch[len-1-i];
            ch[len-1-i] = temp;
        }

    }
}
