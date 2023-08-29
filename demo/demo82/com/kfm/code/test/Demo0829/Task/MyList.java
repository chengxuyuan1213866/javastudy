package com.kfm.code.test.Demo0829.Task;

import java.util.*;

public class MyList implements List {
    // 定义存储的容器
    private Object[] arr;
    //记录长度
    private int len;
    // 定义容器的默认长度
    private static final int DEFAULT_CONTAINER = 5;
    // 定义扩容的默认大小
    private static final int DEFAULT_ADDCONTAINER = 10;

    //定义扩容大小
    private int addcontainer;
    //定义容器大小
    private int container;
    public MyList() {
        this(DEFAULT_CONTAINER,DEFAULT_ADDCONTAINER);
    }


    //全参构造   参数1：容器大小  参数2：每次容器扩容的大小
    public MyList(int container,int add) {
        if (container < 0) {
            container = DEFAULT_CONTAINER;
        }
        if (add<0)
        {
            add = DEFAULT_ADDCONTAINER;
        }
        addcontainer = add;
        this.container = container;
    }
    /**
     * @param o element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(Object o) {
        dilatation(len + 1);
        arr[len++] = o;
        return true;
    }
    private void dilatation(int size) {
        if (size >arr.length)
        {
            int old = arr.length;
            int newArr = arr.length+addcontainer;
            arr = Arrays.copyOf(arr,newArr);
        }

    }

    /**
     * @return
     */
    @Override
    public int size() {
        return len;
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return len == 0;
    }

    /**
     * @param o element whose presence in this list is to be tested
     * @return
     */
    @Override
    public boolean contains(Object o) {
        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i < len ; i++) {
            if (o.equals(arr[i]) ) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param index index of the element to return
     * @return
     */
    @Override
    public Object get(int index) {
        if (isEmpty())
        {
            return -1;
        }
        return arr[index];
    }





    /**
     * @param o element to be removed from this list, if present
     * @return
     */
    @Override
    public boolean remove(Object o) {
        if (isEmpty()) {
            return false;
        }
        arr[indexOf(o)] = null;


        return false;
    }



    /**
     *
     */
    @Override
    public void clear() {
        Object[] newArr = new Object[];
        arr = newArr;
    }


    /**
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return
     */
    @Override
    public Object set(int index, Object element) {
        arr[index] = element;
        return null;
    }

    /**
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    @Override
    public void add(int index, Object element) {

        System.arraycopy(arr,0,arr,0,index);
        System.arraycopy(arr,index+1,arr,index+1,len-index);
        arr[index] = element;
    }

    /**
     * @param index the index of the element to be removed
     * @return
     */
    @Override
    public Object remove(int index) {
        System.arraycopy(arr,0,arr,0,index);
        System.arraycopy(arr,index+1,arr,index,len-index-1);
        len--;
        return true;
    }

    /**
     * @param o element to search for
     * @return
     */
    @Override
    public int indexOf(Object o) {
        if (isEmpty()) {
            return -1;
        }
        for (int i = 0; i < len; i++) {
            if (o.equals(arr[i]))
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param o element to search for
     * @return
     */
    @Override
    public int lastIndexOf(Object o) {
        if (isEmpty()) {
            return -1;
        }
        for (int i = len-1; i >= 0; i--) {
            if (o.equals(arr[i]))
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex   high endpoint (exclusive) of the subList
     * @return
     */
    @Override
    public List subList(int fromIndex, int toIndex) {

        return null;
    }


    // ------------------------------------------------------------------------------------------------------------



    /**
     * @param c collection containing elements to be added to this collection
     * @return
     */
    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    /**
     * @param index index at which to insert the first element from the
     *              specified collection
     * @param c     collection containing elements to be added to this list
     * @return
     */
    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    /**
     * @return
     */
    @Override
    public ListIterator listIterator() {
        return null;
    }

    /**
     * @param index index of the first element to be returned from the
     *              list iterator (by a call to {@link ListIterator#next next})
     * @return
     */
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }



    /**
     * @param c collection containing elements to be retained in this list
     * @return
     */
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    /**
     * @param c collection containing elements to be removed from this list
     * @return
     */
    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    /**
     * @param c collection to be checked for containment in this list
     * @return
     */
    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    /**
     * @param a the array into which the elements of this list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return
     */
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
