package com.kfm;

public class Christmas_tree {
    public static void main(String[] args) {

        for (int i = 1; i <7 ; i++) {
            for (int j = i; j <= 7 ; j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++) {
                System.out.format("\33[32;1m*");
            }
            System.out.println();
        }
        for (int i = 3; i <7 ; i++) {
            for (int j = i; j <= 7 ; j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++) {
                System.out.format("\33[32;1m*");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("\33[33;1m      ###");

        }

    }
}
