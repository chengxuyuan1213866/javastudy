package com.kfm;

public class Table {
    public static void main(String[] args) {
        for (int i = 9;i>=1;i--){

            for (int j = i; j>=1; j--)
            {

                System.out.printf("| %d * %d = %d | \t",i,j,i*j);
            }
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

        }



    }


}
