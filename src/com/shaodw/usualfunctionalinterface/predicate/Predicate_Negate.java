package com.shaodw.usualfunctionalinterface.predicate;

import java.util.function.Predicate;

/**
 * negate取反
 * 判断一个字符串长度是否大于5
 * 如果大于5 返回false
 * 否则 返回true
 *
 */
public class Predicate_Negate {
    public static boolean checkString(String s, Predicate<String> p){
        return p.negate().test(s);
    }

    public static void main(String[] args) {
        String str = "ssssss";
        System.out.println(checkString(str, s -> s.length() > 5));
    }
}
