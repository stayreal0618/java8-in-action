package cn.ajin.java8.chapter2;

import java.util.concurrent.Callable;

/**
 * lambda表达式初体验
 *
 * @author ajin
 */

public class ExperienceLambdaDemo {

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println("hello");
        };
        processRunnable(r1);
        // do nothing
        processRunnable(() -> {

        });

    }

    public static void processRunnable(Runnable runnable) {
        runnable.run();
    }

    public static Callable<String> getCallable() {
        return () -> "";
    }
}
