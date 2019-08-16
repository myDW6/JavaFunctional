package com.shaodw.usualfunctionalinterface.predicate;

import java.util.function.Predicate;

/**
 *  Predicate接口中or默认方法
 *  * 判断一个字符串的长度是否大于5 是否包含a
 *  * 两个条件满足一个即可
 */
public class Predicate_Or {
    public static boolean checkString(String s, Predicate<String> p1, Predicate<String> p2){
        return p1.or(p2).test(s);
    }

    public static void main(String[] args) {
        String str = "held";
        System.out.println(checkString(str, s -> s.length() > 5, s -> s.contains("a")));
    }
}
