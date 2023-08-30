package code.test.Demo0830.TwoLink;

import java.util.Arrays;

public class Linked {


    // 定义头结点
    private Node first;

    // 链表长度
    private int len;


    //特殊方法  显示指定元素的的前一个和后一个元素
    public String frelement(Object obj)
    {
        StringBuilder str = new StringBuilder();
        if (first == null) {
            return "";
        }
        if (obj == null)
        {

        }
        Node node = first;
        for (int i = 0; i < len; i++) {
            if (obj == null) {
                if (obj == node.value)
                {
                    try {
                        str.append("当前元素的前一个元素："+node.front.value);
                        str.append("当前元素："+node.value);
                        str.append("当前元素的后一个元素："+node.next.value);
                    }
                    catch (RuntimeException e)
                    {
                        str.append("当前元素的后一个元素："+null);
                    }

                    return str.toString();
                }
            }
            else {
                if (obj.equals(node.value)) {
                    str.append("当前元素的前一个元素："+node.front.value);
                    str.append("当前元素："+node.value);
                    str.append("当前元素的后一个元素："+node.next.value);
                    return str.toString();
                }
            }

            node= node.next;
        }
        return str.toString();


    }

    // 增加
    public boolean add(Object obj)
    {
        //创建需要加入的对象
        Node node = new Node(obj,null,null);

        if (len == 0)
        {
            first = node;
            len++;
            return true;
        }
        else {
            // 创建一个节点变量，为了找到最后一个节点，然后把上面的Node对象链在最后一个节点的next上,Node节点的front填入最后一个节点
            Node index = first;
            while (index.next != null)
            {
                index = index.next;
            }
            index.next = node;
            node.front = index;
            len++;
            return true;
        }
    }

    // 修改
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
    // 删除
    public boolean delete(Object obj)
    {
        if (first == null) {
            return false;
        }
        else if (obj.equals(first.value))
        {
            first = first.next;
            first.next.front = null;
            len--;
        }
        else {
            Node node = first;
            for (int i = 0; i < len; i++) {
                if (obj.equals(node.value)) {
                    node.front.next = node.next;
                    node.next.front = node.front;
                    node.next = null;
                    node.front = null;
                    len--;
                    return true;
                }
                node= node.next;
            }
        }

        return false;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node node = first;
        if (first.value == null)
        {
            return "Linked[]";
        }
        str.append("Linked[");
        while (node.next != null)
        {
            str.append(node.value);
            str.append(",");
            node = node.next;
        }
        str.append(node.value);
        str.append("]");
        return str.toString();
    }
    // 显示所有元素
    public String show()
    {
        if (len == 0) {
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


    /**
     * 双端节点
     *  节点内需要保存三个值
     *  1.值
     *  2.前一个节点的值
     *  3.后一个节点的值
     */
    private class Node
    {
        // 保存的值
        Object value;
        // 下一个节点
        Node next;
        // 上一个节点
        Node front;

        public Node(Object value, Node next,Node front) {
            this.value = value;
            this.next = next;
            this.front = front;
        }
    }




}
