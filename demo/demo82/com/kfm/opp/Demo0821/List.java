package com.kfm.opp.Demo0821;

public class List {
    private Object[] objs;

    public boolean add(User obj){
        Object[] obj_new = new Object[objs.length+2];
        obj_new[objs.length] = obj;
        objs = obj_new;
        return true;
    }

    public Object remove(int index){
        for (int i = 0; i < objs.length; i++) {
            if (i == index) {
                objs[i] = null;
            }
        }
        return null;
    }

    public Object get(int index){
        for (int i = 0; i < objs.length; i++) {
            if (i == index) {
                System.out.println(objs[i]);
            }
        }
        return null;
    }
}
