package cn.ajin.java8.chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ajin
 */

public class AppleDemo {

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 100;
    }

    public static void main(String[] args) {
        List<Apple> apples = Collections.emptyList();
        // 筛选出青苹果
        filterApplesInJava8(apples, AppleDemo::isGreenApple);
        // 筛选出 重苹果
        filterApplesInJava8(apples, AppleDemo::isHeavyApple);
    }

    /**
     * 原生{@link Predicate}实现对苹果的筛选
     */
    public static List<Apple> filterApplesInJava8(List<Apple> appleList, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>(10);
        for (Apple apple : appleList) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * {@link Stream}实现对苹果集合的筛选
     */
    public static List<Apple> filterApplesInJava8OnStreamAPI(List<Apple> appleList, Predicate<Apple> predicate) {
//        return Stream
//                .of(appleList.toArray(new Apple[0]))
//                .filter(predicate)
//                .collect(Collectors.toList());
        return appleList.stream().filter(predicate).collect(Collectors.toList());
    }


    // 以下写法很笨重  复制粘贴编程 大量重复代码 一点都不清爽

    /**
     * 筛选出 颜色为绿色的苹果 < Java 8
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>(10);
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 筛选出 重的苹果
     */
    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>(10);
        for (Apple apple : inventory) {
            if (apple.getWeight() > 100) {
                result.add(apple);
            }
        }
        return result;
    }
}
