package cn.ajin.java8.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * {@link Function} Demo
 *
 * @author ajin
 */

public class FunctionDemo {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("123.0", "456.3");
        map(stringList, Double::parseDouble).forEach(System.out::println);
    }

    /**
     * @param list     List
     * @param function
     */
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>(10);
        for (T t : list) {
            R apply = function.apply(t);
            result.add(apply);
        }
        return Collections.unmodifiableList(result);
    }
}
