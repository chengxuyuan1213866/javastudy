package com.kfm.string.Demo0825;

public class Regular {
    public static void main(String[] args) {
        // 正则表达式
        String s = "8";
        String s1 = "[0-5[7-9]]";
        boolean b = s.matches(s1);
        System.out.println(b);

    }
}
