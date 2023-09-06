package code.CodeTest.Demo0906.Task;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("a","蔡徐坤");
        table.put("c","蔡虚坤");
        table.put("w","蔡虚鲲");
        table.put("t","蔡坤坤");
        table.put("y","蔡坤坤");
        table.put("1","dsad");
        // 具有和迭代器相同的作用，但是不具备迭代器的删除功能
        Enumeration enumeration = table.keys();
        System.out.println(table);
    }
}
