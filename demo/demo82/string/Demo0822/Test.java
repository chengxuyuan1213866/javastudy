package opp.Demo0822;

public class Test {
    public static void main(String[] args) {
        char[] chs={'你','\0','好'};
        String a = "你把啥似的\0手打进度款";
        String str = new String(chs);
        String str1 = new String(a);
        System.out.println(str1);
        System.out.println(str);
    }
}
