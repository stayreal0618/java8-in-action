package cn.ajin.java8.chapter5;

import cn.ajin.java8.chapter4.Dish;

import java.util.stream.Collectors;

import static cn.ajin.java8.chapter4.SharedConst.MENU;

/**
 * 筛选Demo
 *
 * @author ajin
 */

public class FilterDemo {

    public static void main(String[] args) {
        MENU.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
    }
}
