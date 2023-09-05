package code.CodeTest.Demo0905.Task;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {
    public static void main(String[] args) {
        List s = List.of("dahndsajdjas");
        distanceelement(s);
    }
    public static void distanceelement(List s)
    {
        String str = (String) s.get(0);
        ArrayList arrayList = new ArrayList();
        out:for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (j!=i && str.charAt(i) == str.charAt(j))
                {
                    continue out;
                }
            }
            arrayList.add(str.charAt(i));
        }
        int[] arr = new int[arrayList.size()];
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (arrayList.get(i).equals(str.charAt(j)))
                {
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
/*        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);*/
        show(arr,arrayList);
        /*while (s.retainAll())*/
    }
    public static void show(int[] a,ArrayList s)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(s.get(i)+ "出现了" + a[i]+"次");
        }
    }





    /**
     * 找出集合中最长元素
     * @param s -- 将要查找的集合
     * @return  -- 返回最长的字符串
     */
/*    public static String longelemnet(Set s)
    {
        Iterator iterator = s.iterator();
        String str = new String();
        while (iterator.hasNext())
        {
            String ss = (String) iterator.next();
            if (ss.length() > str.length())
            {
                str = ss;
            }
        }
        return str;
    }*/
}
