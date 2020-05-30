package cn.ajin.java8.chapter4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static cn.ajin.java8.chapter4.SharedConst.MENU;

/**
 * 返回低热量的菜肴名称，按照卡路里排序
 *
 * @author ajin
 */

public class Java7DishDemo {

    public static void main(String[] args) {

        System.out.println(getLowCategoryDishNames(MENU));
    }

    public static List<String> getLowCategoryDishNames(List<Dish> menus) {
        List<Dish> lowCategoryDishes = getLowCategoryDishes(menus);

        Collections.sort(lowCategoryDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        List<String> lowCategoryDishNames = new ArrayList<>(10);
        for (Dish lowCategoryDish : lowCategoryDishes) {
            lowCategoryDishNames.add(lowCategoryDish.getName());
        }

        return lowCategoryDishNames;
    }

    /**
     * 获取低热量的菜
     */
    public static List<Dish> getLowCategoryDishes(List<Dish> menus) {
        List<Dish> lowCategoryDishes = new ArrayList<>(10);

        for (Dish menu : menus) {
            if (menu.getCalories() < 400) {
                lowCategoryDishes.add(menu);
            }
        }
        return lowCategoryDishes;
    }
}
