package com.shaodw.stream;

import java.util.stream.Stream;

/**
 * Stream的skip使用
 */
public class MethodSkip {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.skip(2).forEach(s -> System.out.println(s));
    }}
