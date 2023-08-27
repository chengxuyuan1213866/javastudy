package com.kfm.code.test.Simplequeue;

public class myqueue extends Queue{
    // 队首
    private int start;

    // 队尾
    private int end;

    // 队长
    private int length;
    //队内元素个数
    private int N;
    //队
    Object[] arr;
    public myqueue() {
        this.N = 0;
        this.start = 0;
        this.end = length-1;
        this.length = 10;
        this.arr = new Object[length];

    }

    @Override
    void enqueue(Object element) {
        // 判断队满
        if (N >= length-1) {
            System.out.println("队满");
            return;
        }
        else {
            System.arraycopy(arr,1,arr,0,end);
            N++;
            start = end-N;
            arr[arr.length-1] = element;
        }
    }

    @Override
    Object dequeue() {
        if (N == 0) {
            return null;
        }
        else {
            Object a = arr[start];
            arr[start] = 0;
            start--;
            return a;
        }


    }

    @Override
    Object peek() {
        return arr[start];
    }

    @Override
    boolean isEmpty() {
        return N==0;
    }

    @Override
    int size() {
        return N;
    }
}
