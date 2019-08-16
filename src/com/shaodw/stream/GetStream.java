package com.shaodw.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 获取流
 */
public class GetStream {
    public static void main(String[] args) {
        // Collection -> Stream
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        //获取键 存储到一个Set集合
        Map<String, String> map = new HashMap<>();
        Set<String> keys = map.keySet();
        Stream<String> mapKeyStream = keys.stream();
        //获取值 存储到Collection中
        Collection<String> values = map.values();
        Stream<String> mapValueStream = values.stream();
        //获取键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> mapKeyValueStream = entries.stream();

        //数组->Stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5,6};
        Stream<Integer> arrayStream = Stream.of(arr);
    }
}
