package opp.Demo0815;

/**
 * @author Administrator
 */
public class Homework {

    {
        printA();   // 0
        a = 5;
    }

    int a = 1;

    {
        printA(); // 1
    }

    public Homework(int a){
        printA(); // 1
        this.a = a;
        printA(); //6
    }


    public void printA(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        new Homework(6);
    }
}