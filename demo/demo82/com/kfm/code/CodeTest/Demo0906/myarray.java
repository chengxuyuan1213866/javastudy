package code.CodeTest.Demo0906;

import java.util.ArrayList;
import java.util.Iterator;

public class myarray {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
/*        for (int i = 0; i < list.size(); i++) {
            //修改操作
            list.remove(i);
            //添加操作
            list.add(2,"s");
        }*/
/*        for (String s:list)
        {
            list.add("d");
        }*/
        Iterator iterator = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            iterator.next();
            //list.remove(iterator.next());         --报错
            if ("a".equals(list.get(i)))
            {
                iterator.remove();
            }
        }

        System.out.println(list);


    }


}
