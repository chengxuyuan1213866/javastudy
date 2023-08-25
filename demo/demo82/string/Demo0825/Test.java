package string.Demo0825;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        // 创建一个便是当前时间对象的Date对象
        Date date = new Date();
        System.out.println(date);  // Fri Aug 25 21:29:18 CST 2023
        // 获取date对象的时间
        long timeInMillis = date.getTime();
        System.out.println(timeInMillis);  // 1692970158599
        // 创建指定时间的Date对象
        Date date1 = new Date(1392978158599L); //Fri Feb 21 18:22:38 CST 2014
        System.out.println(date1);

    }
}
