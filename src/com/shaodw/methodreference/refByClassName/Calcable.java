package com.shaodw.methodreference.refByClassName;

/**
 * 计算的函数式接口
 */
@FunctionalInterface
public interface Calcable {
    //传递一个整数 对整数进行绝对值计算 并返回
    public abstract int calAbs(int num );
}
