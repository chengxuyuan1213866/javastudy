package src.Demo0808;

import java.util.Scanner;

public class Lookup {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
        int flag = 0;
        int mark = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
            {
                flag = 1;
                mark = i;
                break;
            }
        }
        if (flag == 1)
        {
            System.out.println(num + "在数组中的下标为" + mark);
        }
        else
        {
            System.out.println(-1);
        }

    }
}
