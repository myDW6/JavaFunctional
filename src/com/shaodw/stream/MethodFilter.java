package com.shaodw.stream;

import java.util.stream.Stream;

public class MethodFilter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "周芷若", "张无忌", "赵敏", "张翠山");
        //对stream中数据进行过滤
        stream.filter(s -> s.startsWith("张")).forEach(s-> System.out.println(s));

        /*
        Stream流属于管道流 只能被消费一次 第一个流调用完毕方法 数据就会流转到下一个流
        此时  第一个流使用完毕 就会关闭了 不能再调用方法
        Stream<String> stream1 = stream.filter(s -> s.startsWith("张"));
        stream.forEach(s -> System.out.println(s));
        Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        */
    }
}
