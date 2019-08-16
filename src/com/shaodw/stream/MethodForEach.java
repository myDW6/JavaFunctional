package com.shaodw.stream;

import java.util.stream.Stream;

public class MethodForEach {
    //forEach方法接受一个Consumer<T>接口  是一个终结方法 调用后不能再调用stream流中的其他方法
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用流中的forEach 对流中的数据进行遍历
        stream.forEach(s-> System.out.println(s));
    }
}
