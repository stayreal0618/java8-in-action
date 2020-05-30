package cn.ajin.java8.chapter2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件处理Demo
 *
 * @author ajin
 */

public class ProcessFileDemo {

    public static void main(String[] args) throws IOException {
        processFile((reader) -> reader.readLine() + reader.readLine());
    }

    /**
     * 未使用Lambda表达式
     */
    public static String processFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"));) {
            return reader.readLine();
        }
    }

    public static String processFile(BufferReaderProcessor processor) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"));) {
            return processor.process(reader);
        }
    }
}
