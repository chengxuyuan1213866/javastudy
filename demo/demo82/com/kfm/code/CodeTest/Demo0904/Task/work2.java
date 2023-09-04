package code.CodeTest.Demo0904.Task;


import java.util.Comparator;
import java.util.List;

/**
 * 学生管理
 * List集合表示学生列表
 */

public class work2 {

    public static void main(String[] args) {
        List list = List.of(
                new Student("张1",7.0),
                new Student("张2",757.0),
                new Student("张3",47.0),
                new Student("张4",77.0),
                new Student("张5",707.0),
                new Student("张6",57.0),
                new Student("张7",79.0),
                new Student("张8",87.0),
                new Student("张9",56.0),
                new Student("张10",81.0)
        );
        Object[] a = sort(list);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
        }

        System.out.println(AverageGrade(list));

    }
    public static Object[] sort(List l)
    {
        Object[] obj = new Object[l.size()];
        for (int i = 0; i < l.size(); i++) {
            obj[i] = l.get(i);
        }
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student stu1 && o2 instanceof Student stu2)
                    return (int)(stu1.getScore()-stu2.getScore());
                else return 0;
            }
        };
        for (int i = 0; i < obj.length-1; i++) {
            for (int j = 0; j < obj.length-1-i; j++) {
                if (comparator.compare(obj[j],obj[j+1])>0)
                {
                    Object temp = obj[j];
                    obj[j] = obj[j+1];
                    obj[j+1] = temp;
                }
            }
        }
        return obj;
    };
    public static double AverageGrade(List l)
    {
        double count = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) instanceof Student stu)
            {
                count += stu.getScore();
            }
        }
        return count/l.size()-1;
    }

}




class Student{
    private String name;
    private Double score;
// 省略其他代码


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!name.equals(student.name)) return false;
        return score.equals(student.score);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + score.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}