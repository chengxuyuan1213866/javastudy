package code.CodeTest.Demo0906;

import java.util.Arrays;
import java.util.Set;

public class setmethod {


    public static void main(String[] args) {
        //of 和copy是Set的静态方法
        Set set = Set.of("dasd","ad","da","dadasdwa",'s');
        //Set的一些方法
        //toArray  将set集合转化成Object数组，无序
        System.out.println(Arrays.toString(set.toArray()));
        // contains 判断是否有指定字符或者字符序列 返回布尔值
        System.out.println(set.contains('s'));
        System.out.println(set.contains("da"));
        // retainAll(Collection<?> c) 仅仅保留c中存在的元素  交集
/*        Set set1 = Set.of('s');
        System.out.println(set.retainAll(set1));*/
        // 报错Set集合不可变

    }


}

