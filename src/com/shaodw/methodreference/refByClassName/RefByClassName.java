package com.shaodw.methodreference.refByClassName;

/**
 * 使用类名引用方法
 * 前提：类存在
 * 静态成员方法存在
 */
public class RefByClassName {
    //定义一个方法 方法的参数传递要计算绝对值的整数 和函数式接口Calcable
    public static int method(int a, Calcable calcable){
        return calcable.calAbs(a);
    }

    public static void main(String[] args) {
        //调用method方法
        //使用lambda传递参数
        System.out.println(method(-111, s -> s >= 0 ? s : -s));
        System.out.println(method(-111, s -> Math.abs(s)));
        //使用方法引用简化lambda
        System.out.println(method(-111,Math::abs));
    }
}
