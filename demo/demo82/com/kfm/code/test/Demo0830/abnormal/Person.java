package code.test.Demo0830.abnormal;
public class Person {
    private String name;
    private int age;
    Person(String name, int age) throws AgeNoneExpection {
        this.name = name;
        if (age<0 || age>150) {
            throw new AgeNoneExpection();
        }
    }
}
class Test
{
    public static void main(String[] args) {
        try {
            Person p = new Person("蔡徐坤",180);
        }
        catch (AgeNoneExpection a)
        {
            a.printStackTrace();
        }

    }
}
