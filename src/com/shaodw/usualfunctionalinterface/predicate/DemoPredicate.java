package com.shaodw.usualfunctionalinterface.predicate;

import java.util.function.Predicate;

/**
 * Predicate<T> 接口用于对某种数据类型的数据进行判断
 * boolean test( T t)
 */
public class DemoPredicate {
    //定义一个方法  传递一个String 传递一个Predict接口 泛型使用String 使用test方法进行判断
    public static boolean checkString(String s, Predicate predicate){
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String str = "hello word";
        System.out.println(checkString(str, s-> s.equals("hello world")));
    }
}
