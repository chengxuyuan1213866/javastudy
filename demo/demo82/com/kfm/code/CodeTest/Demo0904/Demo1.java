package code.CodeTest.Demo0904;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {
        // 初始化元素
        List list = List.of(
                new Student("张三", 112),
                new Student("张1",17),
                new Student("张2",15),
                new Student("张7",177)
                );
        // 比较器
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student stu1 = (Student) o1;
                Student stu2 = (Student) o2;
                if (stu1.age > stu2.age) {
                    return 1;
                }
                else
                    return -1;
            }
        };



        System.out.println(list);
        sort(list,com);
        System.out.println(list);
    }
    public static void sort(List l,Comparator c)
    {
        // 冒泡排序
        for (int i = 0; i < l.size()-1; i++) {
            for (int j = 0; j < l.size()-i-1; j++) {
                //利用比较器比较两个对象
                int result = c.compare(l.get(j),l.get(j+1));
                if (result>0)
                {
                    //交换顺序
                    Object temp = l.get(j);
                    l.set(j,l.get(j+1));
                    l.set(j+1,temp);
                }
            }
        }
    }

}
class Student1
{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (age != student.age) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
