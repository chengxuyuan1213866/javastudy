package code.CodeTest.Demo0906;

import java.util.HashSet;
import java.util.Set;

/**
 * Set的具体实现类
 */

public class SetimplmentClass {
    public static void main(String[] args) {
        //TreeSet
/*        Set set = new TreeSet();
        set.add("a");
        set.add("s");
        set.add("w");
        set.add("e");
        set.add("t");
        set.add("i");
        set.add("o");

        System.out.println(set);*/
        // HashSet
        Set set = new HashSet<>();
        set.add("a");
        set.add("s");
        set.add("w");
        set.add("e");
        set.add("t");
        set.add("i");
        set.add("o");
        System.out.println(set);

    }

}
