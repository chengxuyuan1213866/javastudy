package code.CodeTest.Demo0905.Task;


import java.util.List;
import java.util.Vector;

/**
 *对称差集运算
 *
 */
public class Demo4 {

    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c","s");
        List<String> list2 = List.of("b", "c", "d");
        Vector a = DifferenceSet(list1,list2);
        Vector b = DifferenceSet(list2,list1);
        a.addAll(b);
        System.out.println(a.toString());
    }
    public static Vector DifferenceSet(List l1, List l2)
    {
        Vector vector = new Vector();
        for (int i = 0; i < l1.size(); i++) {
            if (l2.contains(l1.get(i)))
            {
                continue;
            }
            vector.add(l1.get(i));
        }
        return vector;
    }

}
