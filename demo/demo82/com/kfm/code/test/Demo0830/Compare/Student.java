package code.test.Demo0830.Compare;



public class Student implements Comparable{
    private String name;

    private int age;

    Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 在student类内部实现Comparable接口，实现两个对象之间的比较
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student stu) {
            if (this.name.equals(stu.name) && this.age == stu.age) {
                return 0;
            }
            else if (this.age > stu.age) {
                return 1;
            }
            else if (this.name.compareTo(stu.name) > 0) {
                return 1;
            }
            else
                return -1;
        }
        else {
            throw new RuntimeException("你输入的不是学生");
        }
    }
}

class Test
{
    public static void main(String[] args) {
        Student stu[] = {
                new Student("蔡虚坤",25),
                new Student("蔡徐坤",25),
                new Student("蔡虚鲲",25),
        };
        // 利用实现接口Comparable的CompareTo方法对对象进行排序
        // 冒泡排序
        for (int i = 0; i < stu.length-1; i++) {
            for (int j = 0; j < stu.length-i-1; j++) {
                if (stu[j].compareTo(stu[j+1])>0) {
                    Student temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].toString());
        }


        //System.out.println(stu[1].compareTo(stu[2]));

    }

}
