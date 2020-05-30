package cn.ajin.java8.chapter2;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author ajin
 */
@FunctionalInterface
public interface BufferReaderProcessor {

    String process(BufferedReader reader) throws IOException;
}
