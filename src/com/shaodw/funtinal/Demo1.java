package com.shaodw.funtinal;

/**
 * 函数式接口的使用：作为方法的参数和返回值类型
 */
public class Demo1 {
    //定义一个方法 参数为函数式接口
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show方法 方法的参数是一个接口 所以可以传递接口的实现类
        show(new MyFunctionalInterfaceImpl());

        //调用show方法 方法的参数是一个接口 所以可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //调用show方法 方法的参数是一个函数式接口 所以可以传递lambda表达式
        show(()->{
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });

        //简化lambda表达式
        show(()->System.out.println("使用lambda表达式重写接口中的抽象方法"));
    }
}
