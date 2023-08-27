package com.kfm.string.Demo0825;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
/*        // 创建一个便是当前时间对象的Date对象
        Date date = new Date();
        System.out.println(date);  // Fri Aug 25 21:29:18 CST 2023
        // 获取date对象的时间
        long timeInMillis = date.getTime();
        System.out.println(timeInMillis);  // 1692970158599
        // 创建指定时间的Date对象
        Date date1 = new Date(1392978158599L); //Fri Feb 21 18:22:38 CST 2014
        System.out.println(date1);*/
/*        //格式化Date对象
        Date date = new Date();
        //创建Simple对象并指定格式化模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化Date对象为字符串
        String s = sdf.format(date);
        System.out.println(s);*/

        /*//Calendar 类
        // 获取当前时间和日期的Calendar对象
        Calendar calenar =  Calendar.getInstance();
        // 设置指定时间和日期
        calenar.set(1970,1,1);
        // 获取年份
        int year = calenar.get(Calendar.YEAR);
        // 获取月份
        int month = calenar.get(Calendar.MONTH);
        System.out.println(month);
        // 获取是当月第几天
        int day = calenar.get(Calendar.DAY_OF_MONTH);
        // 在月份上+1
        calenar.add(Calendar.MONTH,1);
        // 输出Calendar对象
        System.out.println(calenar.getTime());
        // 将Calendar对象转换为Date对象
        Date date = calenar.getTime();
        System.out.println(date);
*/

        // LocalDate对象
        LocalDate ld = LocalDate.now();
        LocalDate sd = LocalDate.of(1970,1,1);
        // 解析字符串为LocalDate对象
        LocalDate parseDate = LocalDate.parse("1949-10-01");
        System.out.println(parseDate);
        // 获取日期信息
        int year = sd.getYear();
        int month = sd.getMonthValue();
        int day = sd.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        // 增加/减少日期
        LocalDate sdNew = sd.plusDays(2);
        LocalDate sdNew1 = sd.plusDays(-1);
        System.out.println(sdNew1);
        // 判断日期关系
        boolean before = sd.isBefore(ld);
        boolean after = ld.isAfter(sd);
        boolean equals = sd.isEqual(ld);
        System.out.println(before);
        System.out.println(after);
        System.out.println(equals);
        // 格式化日期
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String foma = sd.format(formatter);
        System.out.println(foma);

    }
}
