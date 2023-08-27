package com.kfm.code.test.Simplestack;

public class Test {
    public static void main(String[] args) {
        mystack s = new mystack();
        s.push("aaa");
        s.push("bbb");
        s.push("bbb");
        s.push("bbb");
        s.push("bbb");
        s.push("bbb");
        s.push("bbb");
        s.push("bbb");
        s.push("bbb");
        s.push("bbb");

        System.out.println(s.toString());


/*        int[] arr = {1,2,3,4,0,0};
        int a = arr[0];
        System.arraycopy(arr,1,arr,0,arr.length-1);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));*/
    }
}
