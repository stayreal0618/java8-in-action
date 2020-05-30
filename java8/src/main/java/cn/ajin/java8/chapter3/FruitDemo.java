package cn.ajin.java8.chapter3;

import cn.ajin.java8.chapter1.Apple;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author ajin
 */

public class FruitDemo {

    static Map<String, Function<Integer, Fruit>> map = new HashMap<>(16);

    static {
        map.put("apple", Apple::new);
        map.put("orange", Orange::new);
    }

    public static Fruit giveMeFruit(String fruit, Integer weight) {
        return map.get(fruit).apply(weight);
    }
}
