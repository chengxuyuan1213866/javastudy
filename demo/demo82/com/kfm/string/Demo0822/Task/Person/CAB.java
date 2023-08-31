package string.Demo0822.Task.Person;

public class CAB {
    Person p1 = new Person("张三",'男',18,false);
    Person p2 = new Person("花花",'女',18,false);

    public Boolean canMarry(Person p1,Person p2)
    {
        if (!p1.getGender().equals(p2.getGender()) && p1.getAge()>=18 && p1.getAge()>=18 && p1.getMarry() == false && p2.getMarry() == false) {
            return true;
        }
        return false;
    }
}
