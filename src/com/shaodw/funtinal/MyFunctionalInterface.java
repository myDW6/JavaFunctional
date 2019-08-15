package com.shaodw.funtinal;

/**
 * 函数式接口：有且仅有一个抽象方法的接口
 * 对其他方法没有要求(默认 私有 静态)
 */
@FunctionalInterface //检测接口是否是函数式接口
public interface MyFunctionalInterface {

    //抽象方法
    public abstract void method();
}
