package com.kfm.code.test.Demo0828;


import java.util.Arrays;

public class mystcak extends Stack {

    // 存元素的地方
    private Object[] arr;

    // 存元素的个数
    private int length;
    // 默认大小
    private static final int DEFAULT_VALUE = 10;

    mystcak()
    {
        this.arr = new Object[DEFAULT_VALUE];
    }
    mystcak(int a)
    {
        arr = new Object[DEFAULT_VALUE];
    }
    /**
     * @param element 要压入的元素
     */
    @Override
    void push(Object element) {
        // 判断是否要进行扩容
        if (length+1 >= arr.length) {
            dilatation();
        }
        arr[length] = element;
        length++;

    }

    private void dilatation() {
        int old = arr.length;
        int newarr = arr.length+DEFAULT_VALUE;
        arr = Arrays.copyOf(arr,newarr);
    }
    /**
     * @return
     */
    @Override
    Object pop() {
        if (length == 0)
        {
            return null;
        }
        Object temp = arr[length-1];
        arr[length-1] = null;
        length--;
        return temp;
    }

    /**
     * @return
     */
    @Override
    Object peek() {
        return arr[length-1];
    }

    /**
     * @return
     */
    @Override
    boolean isEmpty() {
        return length==0;
    }

    /**
     * @return
     */
    @Override
    int size() {
        return length;
    }

    @Override
    public String toString() {
        return "mystcak{" +
                "arr=" + Arrays.toString(arr) +
                ", length=" + length +
                '}';
    }
}
