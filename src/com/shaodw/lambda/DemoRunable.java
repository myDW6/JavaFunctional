package com.shaodw.lambda;

/**
 * Runable本身是一个函数式接口
 * 有一个startThread方法使用Runable接口作为参数 那么可以使用lambda进行传参
 * 这种情况和Thread的构造方法参数为Runable没有本质区别
 */

public class DemoRunable {
    public static void startThread(Runnable run) {
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用startThread方法 方法的参数是一个函数式接口 可以传递这个接口的匿名内部类、
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "---" + "线程启动了");
            }
        });

        //使用lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + "---" + "线程启动了");
        });

        //简化lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName() + "---" + "线程启动了"));
    }
}
