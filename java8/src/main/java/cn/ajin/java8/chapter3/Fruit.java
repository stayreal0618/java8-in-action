package cn.ajin.java8.chapter3;

/**
 * 水果Entity
 *
 * @author ajin
 */

public class Fruit {
    protected Integer weight;

    public Fruit(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
