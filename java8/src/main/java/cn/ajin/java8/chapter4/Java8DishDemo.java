package cn.ajin.java8.chapter4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static cn.ajin.java8.chapter4.SharedConst.MENU;

/**
 * @author ajin
 * @see Java7DishDemo
 */

public class Java8DishDemo {


    public static List<String> getLowCategoryDishNames(List<Dish> menus) {
        return menus
                .parallelStream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .map(Dish::getName).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        getLowCategoryDishNames(MENU).forEach(System.out::println);

        List<String> collect = MENU.parallelStream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
