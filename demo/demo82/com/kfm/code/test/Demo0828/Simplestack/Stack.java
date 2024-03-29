package code.test.Demo0828.Simplestack;

public abstract class Stack {

    /**
     * 将元素压入栈顶
     * 入栈
     * @param element 要压入的元素
     */
    abstract void push(Object element);

    /**
     * 弹出栈顶元素并返回
     * 出栈
     * @return 弹出的栈顶元素，如果为空栈返回null
     */
    abstract Object pop();

    /**
     * 返回栈顶元素，但不弹出
     * @return 栈顶元素
     */
    abstract Object peek();

    /**
     * 检查栈是否为空
     * @return 如果为空返回true，否则返回false
     */

    abstract boolean isEmpty();

    /**
     * 返回栈中元素个数
     * @return 栈中元素个数
     */

    abstract int size();
}

