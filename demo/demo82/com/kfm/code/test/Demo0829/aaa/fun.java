package com.kfm.code.test.Demo0829.aaa;

@FunctionalInterface
interface fun {
    int A(Object o,int a);
}
@FunctionalInterface
interface fun1{
    int B(Object b,int c);
}
class dem implements fun{
    /**
     * @param o
     * @param a
     */
    @Override
    public int A(Object o, int a) {
        System.out.println(o);
        System.out.println(a);
        return 1;
    }
}
class test{
    public static void main(String[] args) {
        dem dem = new dem();
        dem.A(dem.A(1,2),2);
    }
}




