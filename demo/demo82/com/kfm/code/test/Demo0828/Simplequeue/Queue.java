package code.test.Demo0828.Simplequeue;

public abstract class Queue {

    /**
     * 将元素插入队尾
     * @param element
     */
    abstract void enqueue(Object element);

    /**
     * 移除并返回队首元素
     * 删除第一个元素并返回
     * @return 队首元素，如果队列为空时，返回null
     */
    abstract Object dequeue();
    /**
     * 返回队首元素，但不移除
     * @return 队首元素
     */
    abstract Object peek();

    /**
     * 检查队列是否为空
     * @return 如果对列为空则返回true，否则返回false
     */
    abstract boolean isEmpty();

    /**
     * 返回对列中的元素个数
     * @return 队列中的元素个数
     */
    abstract int size();
}
