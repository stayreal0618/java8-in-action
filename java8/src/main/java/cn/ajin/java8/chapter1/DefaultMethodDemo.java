package cn.ajin.java8.chapter1;

/**
 * 接口默认方法demo
 *
 * @author ajin
 * @since jdk 1.8
 */

public class DefaultMethodDemo {

    interface Processor {
        default void process() {

        }

        static void util() {
            System.out.println("接口中的静态方法");
        }
    }
}
