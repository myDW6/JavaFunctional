package com.shaodw.usualfunctionalinterface.consumer;

import java.util.function.Consumer;

/**
 * java.util.function.Consumer<T>消费一个指定泛型的数据
 * Consumer是一个消费型接口 泛型指定什么类型 就可以使用 默认的accept方法消费什么类型的数据
 * 具体使用需要自定义 （输出 计算）
 */
public class DemoConsumer {
    //定义一个方法  方法的参数是一个Consumer
    public static void consume(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        consume("zhangsan", (t)->{
            //对传递的字符串进行消费  进行反转输出
            String reName = new StringBuilder(t).reverse().toString();
            System.out.println(reName);
        });

        System.out.println("===============");

        useAndThen("hElLo", (s)->System.out.println(s.toLowerCase()), (s)-> System.out.println(s.toUpperCase()));

        useAccept("HELLO", (s)->System.out.println(s.toLowerCase()), (s)-> System.out.println(s.toUpperCase()));
    }

    //Consumer接口的默认方法andthen 需要两个Consumer接口 可以把两个接口组合到一起 再对数据进行消费
    /**
     * Consumer<String> con1;
     *         Consumer<String> con2;
     *         String s = "hhh";
     *         con1.accept(s);
     *         con2.accept(s);
     *         连接两个Consumer接口 再进行消费 谁在前谁先消费
     *         con1.andThen(con2).accept(s);
     */

    //定义一个方法 方法的参数传递一个字符串和两个consumer接口 使得两个接口分别对字符串进行消费
    //使用andthen方法 将两个接口连在一起 再消费数据
    public static void useAndThen(String s, Consumer<String> consumer1, Consumer<String> consumer2){
        consumer1.andThen(consumer2).accept(s);//con1连接con2 先使用con1消费 再con2消费
    }

    //定义一个方法 方法的参数传递一个字符串和两个consumer接口 使得两个接口分别对字符串进行消费
    public static void useAccept(String s, Consumer<String> consumer1, Consumer<String> consumer2){
        consumer1.accept(s);
        consumer2.accept(s);
    }




}
