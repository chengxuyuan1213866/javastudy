package com.kfm.code.Innerclass;

public class anonymity {
    abstract static class Zoon{
        abstract void play();

    }
    public static void main(String[] args) {
        class Cat extends Zoon{
            /**
             *
             */
            @Override
            void play() {
                System.out.println("猫1会叫");
            }
        }

        Zoon cat1 = new Cat();

        Zoon cat2 = new Zoon() {
            @Override
            void play() {
                System.out.println("猫2会叫");
            }
        };
        cat1.play();
        cat2.play();
    }
}
