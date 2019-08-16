package com.shaodw.stream;

import java.util.stream.Stream;

/**
 * limit方法 ： 截取前n个
 * 延迟方法
 */
public class MethodLimit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.limit(3).forEach(s-> System.out.println(s));
    }
}
