package src.Demo0805;

import java.util.Scanner;

public class Running {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int week = n / 7;
        int day  = n % 7;
        int sum = 0;
        if (week >=1) {
            sum += 2800+(week-1)*700;
            for (int i = 1; i <= day ; i++) {
                sum += (week+i)*100;
            }
        }
        else {
            for (int i=1; i<=day; i++)
            {
                sum+= i*100;
            }
        }
        System.out.println("李明跑了：" + sum);

    }
}
//2800     3500         4200




