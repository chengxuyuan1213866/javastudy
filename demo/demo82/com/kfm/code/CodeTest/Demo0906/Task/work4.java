package code.CodeTest.Demo0906.Task;

import java.util.HashMap;
import java.util.Map;

public class work4 {
    public static void main(String[] args) {
        Map<Short, String> map = new HashMap<>();
        for (short i = 0; i < 100; i ++){
            map.put(i, String.valueOf(i));
            map.remove(i - 1);
        }
        System.out.println(map.size());
    }
}
