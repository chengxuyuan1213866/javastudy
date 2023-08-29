package com.kfm.code.test.Demo0829.Task;

public class LinkedTest {

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        link.add(6);
        System.out.println(link.show());
        System.out.println(link.edit(4, 9));
        link.delete(5);
        System.out.println(link.show());

    }


}
