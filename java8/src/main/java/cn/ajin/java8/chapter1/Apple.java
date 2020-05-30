package cn.ajin.java8.chapter1;

import cn.ajin.java8.chapter3.Fruit;
import lombok.Data;

/**
 * Entity Object
 *
 * @author ajin
 */
public class Apple extends Fruit {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(Integer weight) {
        super(weight);
    }
}
