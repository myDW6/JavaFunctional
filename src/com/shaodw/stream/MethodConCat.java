package com.shaodw.stream;

import java.util.stream.Stream;

/**
 * strem中的concat方法使用
 * 两个流合并成一个流
 */
public class MethodConCat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("h", "e", "l", "l", "o");
        Stream<String> stream2 = Stream.of("w", "o", "r", "l", "d");
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));

        System.out.println(Stream.concat(Stream.of("hello", "world"), Stream.of("1", "2")).count());
    }
}
