package code.CodeTest.Demo0906.Task;

import java.util.*;

public class work1 {
    public static void main(String[] args) {
        Map<String, String> provinceMap = new HashMap<>();
        provinceMap.put("冀", "河北");
        provinceMap.put("晋", "山西");
        provinceMap.put("辽", "辽宁");
        provinceMap.put("吉", "吉林");
        provinceMap.put("黑", "黑龙江");
        provinceMap.put("苏", "江苏");
        provinceMap.put("浙", "浙江");
        provinceMap.put("皖", "安徽");
        provinceMap.put("闽", "福建");
        provinceMap.put("赣", "江西");
        provinceMap.put("鲁", "山东");
        provinceMap.put("豫", "河南");
        provinceMap.put("鄂", "湖北");
        provinceMap.put("湘", "湖南");
        provinceMap.put("粤", "广东");
        provinceMap.put("琼", "海南");
        provinceMap.put("川", "四川");
        provinceMap.put("贵", "贵州");
        provinceMap.put("云", "云南");
        provinceMap.put("陕", "陕西");
        provinceMap.put("秦", "陕西");
        provinceMap.put("甘", "甘肃");
        provinceMap.put("陇", "甘肃");
        provinceMap.put("青", "青海");
        provinceMap.put("台", "台湾");

        System.out.println(provinceMap.size());
        // 打印Map集合中的所有省份及简称
/*       for (Map.Entry<String, String> entry : provinceMap.entrySet()) {
            Map.Entry<String,String>  a = entry;
            if (a.getValue().contains("江"))
            {
                provinceMap.remove(a.getKey());
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

        Vector vector = new Vector();


        for (String key:provinceMap.keySet()) {
            if (provinceMap.get(key).contains("江"))
            {
                vector.add(key);
            }
        }
        // 删除
/*        for (int i = 0; i < vector.size(); i++) {
            provinceMap.remove(vector.get(i));
        }*/

/*        Iterator<String> iterator = provinceMap.keySet().iterator();

        while (iterator.hasNext())
        {
            String str = iterator.next();
            if (provinceMap.get(str).contains("江"))
            {
                provinceMap.remove(str);
            }
        }*/

        // 通过key遍历
/*        for (String key:provinceMap.keySet()) {
            System.out.println(key + "\t" + provinceMap.get(key));
        }*/
        System.out.println(provinceMap.size());
    }
}
