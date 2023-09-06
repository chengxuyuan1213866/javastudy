package code.CodeTest.Demo0905.Task;


import java.util.List;
import java.util.Vector;

/**
 * 差集计算
 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("b", "c", "d");

        Vector a = DifferenceSet(list1,list2);
        System.out.println(a);
    }
    public static Vector DifferenceSet(List l1,List l2)
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
