package com.kfm.code.test.Demo0828.queue;

import java.util.Arrays;

public class myqueue extends Queue{

    // 定义记录数据的容器
    private Object[] arr;

    // 记录长度
    private int len;
    // 定义容器大小默认值
    private static final int DEFALUT_VALUE = 10;

    myqueue()
    {
        this.arr = new Object[DEFALUT_VALUE];
    }
    myqueue(int n)
    {
        arr = new Object[n];
    }

    //将element入队
    @Override
    void push(Object element) {
        if (len+1 > arr.length) {
            addscale();
        }
        arr[len] = element;
        len++;
    }

    private void addscale() {
        int old = arr.length;
        int newarr = arr.length+DEFALUT_VALUE;
        arr = Arrays.copyOf(arr,newarr);
    }

    //弹出队首并返回
    @Override
    Object pop() {
        Object a = arr[0];
        Object[] newArr = new Object[arr.length];
        System.arraycopy(arr,1,newArr,0,arr.length-1);
        newArr[arr.length-1] = null;
        len--;
        arr = newArr;
        return a;
    }

    // 返回队首元素
    @Override
    Object peek() {
        return arr[0];
    }

    @Override
    public String toString() {
        return "myqueue{" +
                "arr=" + Arrays.toString(arr) +
                ", len=" + len +
                '}';
    }

    //判断队列是否为空
    @Override
    boolean isEmpty() {
        return len == 0;
    }

    //查询队列长度
    @Override
    int size() {
        return len;
    }
}
