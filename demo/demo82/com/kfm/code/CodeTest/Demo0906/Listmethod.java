package code.CodeTest.Demo0906;


import java.util.Iterator;
import java.util.List;

public class Listmethod {
    public static void main(String[] args) {
        List<String> list = List.of("a","c","d","f","s","a");
        // List方法
        // listIterator 返回原顺序的迭代器对象，可传参，返回指定位置开始的迭代器对象
        Iterator iterator = list.listIterator(2);
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //replaceAll在List中不能用
/*        list.replaceAll(t->t+"s");
        System.out.println(list);*/

        // List不可变
/*        list.add("s");
        System.out.println(list);*/



    }
}
