package com.shaodw.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream中count方法:用于统计stream中元素的个数
 * 终结方法 返回long类型的数据
 */
public class MethodCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        long count = list.stream().count();
        System.out.println(count);
    }
}
