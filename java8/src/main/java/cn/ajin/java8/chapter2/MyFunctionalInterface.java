package cn.ajin.java8.chapter2;

/**
 * 自定义函数式接口{@link FunctionalInterface}
 *
 * @author ajin
 */
@FunctionalInterface
public interface MyFunctionalInterface<T> {
    void execute(T t);

    default void appendOperate() {
        // do nothing
    }
}
