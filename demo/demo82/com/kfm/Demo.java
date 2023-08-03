package com.kfm;


import static java.lang.Math.*;

public class Demo {
    public static void main(String[] args) {
            int size = 1;
            int cout = 0;
            for (float y = size; y > -size; y-=0.1)
            {
                cout++;
                for (float x = -size;  x< size; x += 0.05)
                {
                    float eq = (float) (x * x +pow(5.0*y/2.0-sqrt(abs(x)),2));
                    if (eq < size * size)
                    {
                        System.out.format("\33[31;1m*");
                    }
                    else
                    {
                        System.out.print(" ");;
                    }
                }
                System.out.println();
            }
        System.out.println(cout);
        }
    }

