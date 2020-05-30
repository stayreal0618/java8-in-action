package cn.ajin.java8.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * {@link Consumer} Demo
 *
 * @author ajin
 */

public class ConsumerDemo {

    public static void main(String[] args) {
        forEach(Arrays.asList(1, 2, 3), System.out::println);
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        // way1
//        list.forEach(consumer);
        // way2
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
