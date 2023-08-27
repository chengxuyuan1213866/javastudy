package src.Demo0814;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class yhtriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = triangle(num);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static int[][] triangle(int row){
        int[][] triangle = new int[row][];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // 第一个
            triangle[i][i] = 1; // 最后一个
            for (int j = 1; j < i ; j++) {
                triangle[i][j] = triangle[i - 1][j] + triangle[i -1][j - 1];
            }
        }

        return triangle;
    }
}
