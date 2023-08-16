package opp.Demo0816.Task;

public class Student {
    String name;
    Integer age;
    Double score;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }


    public Student()
    {
        this("狗狗", 18,99.99);
    }
    public Student(String name,int age,double score)
    {
        this.name = name;
        this.age = age;
        this.score = score;
    }


}
