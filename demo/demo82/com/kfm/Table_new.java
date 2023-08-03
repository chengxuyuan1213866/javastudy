package com.kfm;

public class Table_new {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.printf("| %d * %d = %d | \t",i,j,i*j);
            }
            System.out.println();

            for (int k = 0; k < i; k++) {
                System.out.printf("--------------");
            }


        }



    }





}
