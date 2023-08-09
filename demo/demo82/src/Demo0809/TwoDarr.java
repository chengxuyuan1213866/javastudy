package src.Demo0809;

import java.util.Arrays;

public class TwoDarr {
    public static void main(String[] args) {
        int[][] scores = {
                {88,85,22},
                {82,36,85},
                {74,58,69},
                {74,56,23},
                {96,78,96},};

        // 遍历二维数组
        int sum = 0;
        int arr[] = new int[scores.length];
        int max = 0;
        for (int i = 0; i < scores.length; i++) {

            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            arr[i] = sum;
            sum = 0;
        }
        // 对二维数组根据总成绩进行排序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < args.length-1-i; j++) {
                if (arr[j]<arr[j+1]) {
                    //交换成绩的和
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //交换二维数组中的成绩
                    int[] score = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = score;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < scores.length; i++) {
            System.out.println(Arrays.toString(scores[i]));
        }


    }
}
