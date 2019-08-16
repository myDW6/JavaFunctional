package com.shaodw.stream;

import java.util.stream.Stream;

/**
 * Stream的map方法 将当前流中T类型数据转化为另一种R类型的流
 */
public class MethodMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法 将字符串类型的整数 映射为Integer类型的整数
        stream.map(s->Integer.parseInt(s)).forEach(s-> System.out.println(s));
//        Stream<Integer> integerStream = stream.map((String name) -> {
//            return Integer.parseInt(name);
//        });
//        integerStream.forEach((Integer i)->{
//            System.out.println(i);
//        });
    }
}
