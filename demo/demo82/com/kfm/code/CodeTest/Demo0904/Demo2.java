package code.CodeTest.Demo0904;

import java.util.Comparator;
import java.util.Objects;
import java.util.Vector;

public class Demo2 {

    public static void main(String[] args) {
        // 初始化元素
        Vector list = new Vector();
        // 比较器
        Comparator comstu = new Comparator() {
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

        list.add(new Student("大娃",1));
        list.add(new Student("大娃",2));
        list.add(new Student("大娃",9));
        list.add(new Student("大娃",5));
        list.add(new Student("大娃",7));
        Student temp = (Student) list.get(3);
        temp.name = "三娃";

        list.add(4,new Student("五娃",20));
        list.add(5,new Student("五娃",22));
        System.out.println(list);
        list.remove(list.size()-1);

        sort(list,comstu);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Student stu = (Student) list.get(i);
            System.out.println(stu.name);


        }


    }





    /**
     *
     * @param l  -- 要排序的LIst
     * @param c  -- 传入比较器
     */

    public static void sort(Vector l,Comparator c)
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

class Student
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

    public Student(String name, int age) {
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


