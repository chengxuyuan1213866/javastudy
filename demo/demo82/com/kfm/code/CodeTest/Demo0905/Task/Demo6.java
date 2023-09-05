package code.CodeTest.Demo0905.Task;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Demo6 {
    public static void main(String[] args) {
        Set<String> set = Set.of("dasd","dad","fgefesf","dsddd","da");
        Vector a = move(set);
        System.out.println(a);

    }
    public static Vector move(Set s)
    {
        Iterator iterator = s.iterator();
        Vector vector = new Vector();
        while (iterator.hasNext())
        {
            String str = (String) iterator.next();
            if (str.length()%2 ==0)
            {
                vector.add(str);
            }
        }
        return vector;
    }
}
