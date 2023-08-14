package com.kfm;

/**
 * @author Administrator
 */
public class Prime_number {
    public static void main(String[] args) {

        int n = 18;
        int a = n;
        while (n > 1) {
            out:
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        continue out;
                    }
                }
                System.out.print(i + " ");
                if (n % i == 0) {
                    n /= i;
                    break;
                }

            }
            System.out.println();
        }
    }
}
