package src.Demo0815.Task;
public class Cat {
    private static String color = "花色";
    private static String breed = "波斯猫";
    public void eat()
    {
        System.out.printf("%s的%s正在吃鱼......\n",color,breed);
    }
   public void catchMouse()
    {
        System.out.printf("%s的%s正在逮老鼠......\n",color,breed);
    }
    public Cat(String a,String b){
        color = a;
        breed = b;
    }
    public Cat(){
    }
}
