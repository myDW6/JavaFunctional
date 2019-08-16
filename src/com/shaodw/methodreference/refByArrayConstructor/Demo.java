package com.shaodw.methodreference.refByArrayConstructor;

import java.util.Arrays;

/**
 * 数组的构造器引用
 */
public class Demo {
    //方法参数传递创建数组的长度 和 ArrayBuilder接口
    public static int[] createArray(int length, ArrayBuilder arrayBuilder){
        return arrayBuilder.createArray(length);
    }

    public static void main(String[] args) {
        System.out.println(createArray(4, s -> new int[s]).length);
        //使用方法引用
        //已知创建的是int[]的数组 长度已知 使用int[]引用new 根据传递的参数 创建长度为参数的数组
        System.out.println(Arrays.toString(createArray(5, int[]::new)));
    }
}
