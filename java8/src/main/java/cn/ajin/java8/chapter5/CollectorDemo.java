package cn.ajin.java8.chapter5;

import cn.ajin.java8.chapter4.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.ajin.java8.chapter4.SharedConst.MENU;

/**
 * {@link java.util.stream.Collector} Demo
 *
 * @author ajin
 */

public class CollectorDemo {
    public static void main(String[] args) {
        Map<Dish.Type, List<Dish>> typeListMap =
                MENU.stream().collect(Collectors.groupingBy(Dish::getType));
    }
}
