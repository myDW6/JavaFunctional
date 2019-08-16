package com.shaodw.methodreference.refByArrayConstructor;

/**
 * 一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    //创建int类型数组的方法 传递数组长度
    public abstract int[] createArray(int n);
}
