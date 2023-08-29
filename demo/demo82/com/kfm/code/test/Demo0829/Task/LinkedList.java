package com.kfm.code.test.Demo0829.Task;

import java.util.Arrays;

public class LinkedList {


    // 定义头结点
    private Node first;
    // 记录长度
    private int len;

    public LinkedList() {
    }

    //增加
    public void add(Object o)
    {
        //创建需要加入的Node对象
        Node node = new Node(o,null);

        // 判断头结点是否有值
        if (first == null) {
            first = node;
            len++;
        }
        else {
            // 创建一个节点变量，为了找到最后一个节点，然后把上面的Node对象链在最后一个节点的next上
            Node index = first;
            while (index.next!=null)
            {
                index = index.next;
            }
            index.next = node;
            len++;
            System.out.println("添加成功");
        }
    }
    //遍历所有
    //查询
    public String show() {
        if (first == null) {
            return null;
        }
        Object[] arr = new Object[len];
        Node node = first;

        for (int i = 0; i < len; i++) {
                arr[i] = node.value;
                node= node.next;
        }
        return Arrays.toString(arr);
    }


    //修改
    public boolean edit(Object obj,Object obj1)
    {
        if (first == null) {
            return false;
        }
        Node node = first;

        for (int i = 0; i < len; i++) {
            if (obj.equals(node.value)) {
                node.value = obj1;
                return true;
            }
            node= node.next;
        }
        return false;
    }




    //删除
    public boolean delete(Object obj)
    {
        if (first == null) {
            return false;
        }
        Node node = first;

        for (int i = 0; i < len; i++) {
            if (obj.equals(node.next.value)) {
                node.next = node.next.next;
                len--;
                return true;
            }
            node= node.next;
        }
        return false;
    }



    private class Node
    {
        Object value;
        Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



}
