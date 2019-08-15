package com.shaodw.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 如果一个方法的返回值是一个函数式接口 那么可以直接返回一个lambda表达式
 * 当需要一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时，就可以调该方法获取
 */
public class DemoComparator {
    //定义一个方法 方法的返回值类型是函数式接口 Comparator
    public static Comparator<String> getComparator1(){
        //可以返回这个接口的匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按长度降序排列
                return o2.length() - o1.length();
            }
        };
    }

    public static Comparator<String> getComparator2(){
        //可以返回lambda表达式
        return (String o1, String o2)->{
            return o2.length() - o1.length();
        };
    }

    public static Comparator<String> getComparator3(){
        //简化lambda表达式
        return (o1, o2)-> o2.length() - o1.length();
    }

    public static void main(String[] args) {
       String[] strs = {"aaa", "bbbb","ccccc", "d"};
       System.out.println(Arrays.toString(strs));
       Arrays.sort(strs, getComparator3());
       System.out.println(Arrays.toString(strs));

    }
}
