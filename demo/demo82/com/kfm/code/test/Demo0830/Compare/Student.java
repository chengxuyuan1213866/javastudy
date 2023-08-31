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
                new Student("蔡徐坤",25),
                new Student("蔡虚坤",250),
                new Student("蔡虚鲲",2500),
        };
        System.out.println(stu[1].compareTo(stu[2]));

    }

}
