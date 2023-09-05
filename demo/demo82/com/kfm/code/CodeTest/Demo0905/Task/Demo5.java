package code.CodeTest.Demo0905.Task;

import java.util.List;
import java.util.Vector;

public class Demo5 {
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("b", "c", "d");
        Vector s = Unionset(list1,list2);
        System.out.println(s);
    }
    public static Vector Unionset(List l1,List l2)
    {
        Vector vector= new Vector();
        vector.addAll(l1);
        vector.addAll(l2);
        Vector a =intersection(l1,l2);
        for (int i = 0; i < a.size(); i++) {
            vector.remove(a.get(i));
        }
        return vector;
    }
    public static Vector intersection(List l1,List l2)
    {
        Vector vector = new Vector();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j)))
                {
                    vector.add(l1.get(i));
                }
            }
        }
        return vector;
    }
}
