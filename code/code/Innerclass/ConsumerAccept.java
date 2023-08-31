package code.Innerclass;

import java.util.function.Consumer;

public class ConsumerAccept {

    public static void main(String[] args) {
        consumerAccept();
    }
    public static void consumerAccept() {

        Consumer c = (a) -> System.out.println(a);
        fun(123, c);
    }

    /**
     * Consumer 消费接口，传入一个泛型参数
     *
     * @param t        传入参数
     * @param consumer 消费
     * @param <T>      泛型
     */
    public static <T> void fun(T t, Consumer<T> consumer) {
        consumer.accept(t);
    }

}