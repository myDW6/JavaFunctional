package com.shaodw.methodreference.refByConstructor;

/**
 * 类的构造器引用（构造方法引用）
 */
public class Demo {
    //传递一个name 和 PersonBuilder接口 方法中通过姓名创建person对象
    public static void method(String name, PersonBuilder p){
        System.out.println(p.createByName(name).getName());
    }

    public static void main(String[] args) {
        method("张三",(s)-> new Person(s));
        //构造方法new Person（String name）创建对象new已知 可以使用Person引用new来创建对象
        method("李四",Person::new);
    }
}
