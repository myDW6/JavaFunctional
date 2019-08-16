package com.shaodw.usualfunctionalinterface.predicate;



import java.util.function.Predicate;

/**
 * Predicate接口中and默认方法
 * 判断一个字符串的长度是否大于5 是否包含a
 * 两个条件必须同时满足
 * Predicate接口中的and方法， 表示并且关系 可用于连接两个判断条件
 *
 *      default Predicate<T> and(Predicate<? super T> other) {
 *         Objects.requireNonNull(other);
 *         return (t) -> this.test(t) && other.test(t);
 *     }
 *     方法内部的条件也是使用&& 进行连接
 */
public class Predicate_And {

    public static boolean checkStringUseAnd(String s, Predicate<String> pre){
        //return pre.and(pre).test(s);
        return pre.test(s);
    }

    public static boolean checkStringNotUseAnd(String s,Predicate<String> p1, Predicate<String> p2){
        //return p1.test(s) && p2.test(s);
        return p1.and(p2).test(s);
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(checkStringUseAnd(str, s -> s.length() > 5 && s.indexOf('d') >= 0));
        System.out.println("==============");
        System.out.println(checkStringNotUseAnd(str, s -> s.length() > 5, s -> s.contains("d")));
    }
}
