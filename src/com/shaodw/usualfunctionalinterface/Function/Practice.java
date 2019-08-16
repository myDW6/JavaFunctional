package com.shaodw.usualfunctionalinterface.Function;

import java.util.function.Function;

/**
 * 使用Function进行函数模型的拼接 按照顺序执行的多个函数为：
 *  String str = "赵丽颖,20";
 *  1 截取数字部分
 *  2 转为int
 *  3 int + 100
 */
public class Practice {
    public static int convert(String s, Function<String, Integer> f1){
       return f1.apply(s);
    }

    public static int complexConvert(String s, Function<String,String > f1,Function<String,Integer> f2, Function<Integer, Integer> f3 ){
        return f1.andThen(f2).andThen(f3).apply(s);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        System.out.println(convert(str, s -> Integer.parseInt(s.split(",")[1]) + 100));
        System.out.println(complexConvert(str, s -> s.split(",")[1], s -> Integer.parseInt(s), s->s+100));
    }
}
