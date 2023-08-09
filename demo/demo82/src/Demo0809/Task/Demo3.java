package src.Demo0809.Task;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n-1)
                {
                    arr[i][j]=1;
                }
                else {
                    if (i>=1)
                    {
                        arr[i][j] = arr[i-1][j]+arr[i-1][j+1];
                    }
                }



            }
        }
        for (int i = 0; i < n; i++) {
            for (int j =arr[0].length-1; j >=0 ; j--) {
                if (arr[i][j]==0)
                {
                    break;
                }
                System.out.print(arr[i][j]);
                //System.out.printf("%d%d\t",i,j);
            }
            System.out.println();
        }
    }

}
