package cn.ajin.java8.chapter6;

/**
 * @author ajin
 */

public class RuntimeDemo {
    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);
    }
}
