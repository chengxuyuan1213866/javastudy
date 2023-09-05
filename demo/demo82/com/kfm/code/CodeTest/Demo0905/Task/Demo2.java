package code.CodeTest.Demo0905.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo2 {
    /**
     * 交集计算
     * @param args
     */
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("b", "c", "d");
        ArrayList list3 = new ArrayList();
        ArrayList list4 = new ArrayList();
        list3.add("a");
        list4.add("a");
        list4.add("b");
        list4.retainAll(list3);
        System.out.println(list3);

       /* Vector a = intersection(list1,list2);
        System.out.println(a);*/
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
