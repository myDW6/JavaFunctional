package com.shaodw.methodreference.refByConstructor;

/**
 * 定义一个创建person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //根据传递的姓名创建person对象
    public abstract Person createByName(String name);
}
