package src.Demo0805;
import java.lang.Math;
public class Beggar {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            int a = (int) Math.pow(2,i-1);
            System.out.printf("第%d天要了%d\n",i,a);
        }
    }
}
