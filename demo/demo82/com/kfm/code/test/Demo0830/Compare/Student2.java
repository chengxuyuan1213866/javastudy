package code.test.Demo0830.Compare;


import java.util.Comparator;

/**
 * comparator接口实现比较器
 * 比较器
 */
public class Student2 extends Student implements Comparator {

    Student2(String name, int age) {
        super(name, age);
    }

    @Override
    public int compare(Object o1, Object o2) {
       return 0;
}


}

class Test2222 {
    public static void main(String[] args) {

         Student2 stu[] = {
                new Student2("蔡虚鲲", 25),
                new Student2("蔡虚坤", 25),
                new Student2("蔡徐坤", 25),
        };
        Comparator c = (o1, o2) ->
        {
            if (o1 instanceof Student2 stu1 && o2 instanceof Student2 stu2) {
                if (stu1.getName().equals(stu2.getName()) && stu1.getAge() == stu2.getAge()) {
                    return 0;
                } else if (stu1.getAge() > stu2.getAge()) {
                    return 1;
                } else if (stu1.getName().compareTo(stu2.getName()) > 0) {
                    return 1;
                } else
                    return -1;
            } else throw new RuntimeException("输入对象有误");

        };

        // 实现接口comparator接口实现比较器进行对象排序
        // 冒泡排序
        for (int i = 0; i < stu.length-1; i++) {
            for (int j = 0; j < stu.length-i-1; j++) {
                if (c.compare(stu[j],stu[j+1]) > 0) {
                    Student2 temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].toString());
        }
        System.out.println(c.compare(stu[0], stu[1]));



    }

}




