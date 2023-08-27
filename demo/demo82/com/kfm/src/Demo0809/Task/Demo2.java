package src.Demo0809.Task;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        // 数组排序
        // 设 names 数组中存放学生姓名
        String[] names = {"安琪拉", "王昭君", "蔡文姬", "妲己", "张良"};
        // 设 courses 数组中依次存放三门课程的名称
        String[] courses = {"C++", "Java", "Python"};
        // 设 scores 数组中依次存储的是 names 数组中各个学生的 C++ 、Java 、Python 课程的成绩
        int[][] scores = {
                {90, 89, 75},
                {59, 40, 100},
                {100, 99, 80},
                {80, 61, 61},
                {60, 100, 99},
        };

        // 按照Java程序进行降序排列
        for (int i = 0; i <= scores.length-1; i++) {
            for (int j = 0; j < scores.length-1-i; j++) {
                if (scores[j][1]<scores[j+1][1]) {
                    int[] score = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] =score;
                }

            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(Arrays.toString(scores[i]));
        }
        // 设计程序，根据学生总成绩进行排序(降序排列)，并输出学生姓名、每门课程的名称和
        //该学生的成绩、该学生的总成绩
        /*int[] sum = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum[i] += scores[i][j];
            }
        }
        // System.out.println(Arrays.toString(sum));
        for (int i = 0; i < sum.length-1; i++) {
            for (int j = 0; j < sum.length-1-i; j++) {
                if (sum[j]> sum[j+1])
                {
                    // 总成绩降序排列
                    int temp = sum[j];
                    sum[j] = sum[j+1];
                    sum[j+1] = temp;
                    //成绩降序排列
                    int[] tmp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = tmp;
                    //姓名降序排列
                    String ch = names[j];
                    names[j] = names[j+1];
                    names[j+1] = ch;
                }
            }
        }

*//*        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(names));*//*
        System.out.println("姓名 \t 各科成绩 \t\t 总成绩");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i] +"    "+ Arrays.toString(scores[i]) +"     "+ sum[i]);
        }*/



    }
}
