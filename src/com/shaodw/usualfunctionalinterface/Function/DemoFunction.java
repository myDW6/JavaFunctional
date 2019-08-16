package com.shaodw.usualfunctionalinterface.Function;

import java.util.function.Function;

/**
 *  Function<T R> 根据一个类型的数据得到另一个类型的数据 前者称为前置条件 后者成为后置条件
 *  R apply(T t)
 *  将String转换为integer
 */
public class DemoFunction {

    public static Integer convertFromString(String str, Function<String, Integer> fun){
        return fun.apply(str);
    }

    public static void main(String[] args) {
        System.out.println(convertFromString("566", s -> Integer.parseInt(s)));
    }
}
