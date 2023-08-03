package com.kfm;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <6 ; i++) {
            for (int k=i; k<=(2*i)+1; k++) {
                System.out.print(" ");
            }
            for (int j = 9;j>=2*i-1 ; j--) {
                System.out.format("*");
            }
            System.out.println();
        }
    }
}
