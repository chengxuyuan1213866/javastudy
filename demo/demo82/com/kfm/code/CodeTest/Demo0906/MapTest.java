package code.CodeTest.Demo0906;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap();
        map.put("鸡","蔡徐坤");
        map.put("鸡1","蔡虚坤");
        map.put("鸡5","蔡虚鲲");
        map.put("鸡3","蔡坤坤");
        map.put("鸡4","蔡坤坤");
        // 遍历map集合
        // 1.通过entrySet()方法
        for (Map.Entry entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // 2.通过 KeySet()方法
        for (String key: map.keySet())
        {
            System.out.println(key + " = " + map.get(key));
        }



        System.out.println(map);
/*        Map map1 = Map.of(1,"a",2,"b",5,"s");
        map1.remove(1);*/

    }
}
