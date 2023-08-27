package string.Demo0822.Task.Person;

public class Person {
    private String name;

    private Character gender;

    private Integer age;

    public Person(String name, Character gender, Integer age, Boolean marry) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.marry = marry;
    }

    private Boolean marry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarry() {
        return marry;
    }

    public void setMarry(Boolean marry) {
        this.marry = marry;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", marry=" + marry +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Person per) {
            if (per.name.equals(this.name) && this.age == per.age && per.marry.equals(this.marry))
            {
                return true;
            }
        }
        return false;



    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (marry != null ? marry.hashCode() : 0);
        return result;
    }
}
