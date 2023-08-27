package com.kfm.code.test;

import java.util.Arrays;
import java.util.Objects;

public class mystack extends Stack{

    // 记录栈中元素个数
    private int N;

    // 栈的长度
    private int length;
    // 存储元素
    private Object[] arr;

    public mystack() {
        this.length = 10;
        this.arr = new Object[length];
        this.N=0;
    }

    @Override
    void push(Object element) {
        if (N == 0)
        {
            arr[N] = element;
            N++;
        }
        else if (N>10)
        {
            System.out.println("栈溢出");
        }
        else
        {
                System.arraycopy(arr,0,arr,1,length-1);
            arr[0] = element;
            N++;
        }
    }

    @Override
    Object pop() {
        if (N==0) return null;
        else
        {
            Object a = arr[0];
            System.arraycopy(arr,1,arr,0,length-1);
            return a;
        }
    }

    @Override
    Object peek() {
        return arr[0];
    }

    @Override
    boolean isEmpty() {
        return N==0;
    }

    @Override
    int size() {
        return N;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mystack mystack = (mystack) o;
        return N == mystack.N && length == mystack.length && Arrays.equals(arr, mystack.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(N, length);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    @Override
    public String toString() {
        return "mystack{" +
                "N=" + N +
                ", length=" + length +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
