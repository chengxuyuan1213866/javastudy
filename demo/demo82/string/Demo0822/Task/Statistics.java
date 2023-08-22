package string.Demo0822.Task;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        /* *
         * 统计个数
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入包含数字和字母的字符串");
        String s = scanner.next();
        String str = new String(s);
        int letter = 0;
        int figure = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( 'a'<=str.charAt(i) && str.charAt(i)<='z')
            {
                letter++;
            }
            else if ('A'<=str.charAt(i) && str.charAt(i)<='Z')
            {
                letter++;
            }
            else if ('0' <=str.charAt(i) && str.charAt(i)<='9'){
                figure ++;
            }
        }
        System.out.println("英文字符有：" + letter + "个");
        System.out.println("数字有：" + figure + "个");

    }
}
