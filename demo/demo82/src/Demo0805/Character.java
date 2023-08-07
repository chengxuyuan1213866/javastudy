package src.Demo0805;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            if (i==1 || i == n)
            {
                System.out.print(" # ");
                for (int j= 2;j<=n-1;j++){
                    System.out.print(" @ ");
                }
                System.out.print(" # ");
            }
            if (i<n && i>1)
            {
                System.out.print(" @ ");
                for (int j= 2;j<=n-1;j++){
                    System.out.print(" * ");
                }
                System.out.print(" @ ");
            }
            System.out.println();
        }
    }
}
