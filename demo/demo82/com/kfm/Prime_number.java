package com.kfm;

public class Prime_number {
    public static void main(String[] args) {

        System.out.println("质数有：");
        out:for (int i = 1; i < 20; i++) {
                for (int j = 2; j < i; j++) {
                    if (i%j == 0){
                        continue out;
                    }
                }

            System.out.print(i + "  ");
        }
    }

}
