package com.kfm;

public class hear {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.format("\33[31;1m*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.format("\33[31;1m*");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.format("\33[31;1m*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.format("\33[31;1m*");
            }
            System.out.println();
        }

        for (int i = 0; i <=10 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = 10-i; k >= 1; k--) {
                System.out.format("\33[31;1m*");
            }
            for (int z = 10-i; z >= 1; z--) {
                System.out.format("\33[31;1m*");
            }
            System.out.println();
        }
    }

}
