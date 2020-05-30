package cn.ajin.java8.chapter2;

import cn.ajin.java8.chapter1.Apple;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * {@link Apple} {@link Comparator} Demo
 *
 * @author ajin
 */

public class AppleComparatorDemo {

    public static void main(String[] args) {
        List<Apple> appleList = Collections.emptyList();
        // lambda 低阶
        compareByWeight(appleList, (o1, o2) -> {
            return o1.getWeight()-o2.getWeight();
        });
        // lambda 高阶
        compareByWeight(appleList, Comparator.comparingInt(Apple::getWeight));
    }

    private static void compareByWeight(List<Apple> appleList, Comparator<Apple> comparator) {
        appleList.sort(comparator);
    }
}
