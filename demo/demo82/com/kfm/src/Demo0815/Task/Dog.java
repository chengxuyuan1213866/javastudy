package src.Demo0815.Task;

public class Dog {
    private static String color = "黑色";
    private static String breed = "藏獒";
    public void eat()
    {
        System.out.printf("%s的%s正在啃骨头......\n",color,breed);
    }
    public void catchMouse()
    {
        System.out.printf("%s的%s正在看家......\n",color,breed);
    }
    public Dog(String a,String b){
        color = a;
        breed = b;
    }
    public Dog(){
    }
}

