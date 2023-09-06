package code.CodeTest.Demo0906;

import java.util.List;
import java.util.Vector;

public class ListimplementClass {
    public static void main(String[] args) {
        List<String> list = List.of("a","c","d","f","s","a");
        Vector vector = new Vector();
        vector.addAll(list);
        System.out.println(vector.get(0));
        vector.replaceAll(o-> "字母是:" + o);
        System.out.println(vector);
        List a = vector.subList(0,3);
        a.add("a");
        System.out.println(a);
        System.out.println(vector);

    }
}
