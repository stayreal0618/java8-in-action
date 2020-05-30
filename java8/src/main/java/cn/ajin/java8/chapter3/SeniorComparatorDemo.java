package cn.ajin.java8.chapter3;

import cn.ajin.java8.chapter1.Apple;

import java.util.Comparator;

/**
 * {@link java.util.Comparator} 高级比较
 *
 * @author ajin
 */

public class SeniorComparatorDemo {

    public static void main(String[] args) {
        Comparator.comparing(Apple::getWeight);
    }
}
