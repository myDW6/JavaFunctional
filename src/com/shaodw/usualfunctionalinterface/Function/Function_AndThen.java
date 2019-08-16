package com.shaodw.usualfunctionalinterface.Function;

import java.util.function.Function;

/**
 * 默认方法：andThen用来进行组合操作，
 * 把String 123 ——> Intrger 123 -> 再将转换后的结果 + 10 -> String xxx
 * 可以使用andthen方法组合这些操作
 */
public class Function_AndThen {
    public static String convert(String s, Function<String, Integer> f1, Function<Integer,String> f2){
        return f1.andThen(f2).apply(s);
    }

    public static void main(String[] args) {
        System.out.println("12131".equals(convert("12121", s->Integer.parseInt(s) + 10, s->s + "")) ? "yes" : "no");
    }
}
