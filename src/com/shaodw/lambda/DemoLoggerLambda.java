package com.shaodw.lambda;

/**
 * 使用lambda优化：延迟加载
 * lambda使用前提：必须存在函数式接口
 */
public class DemoLoggerLambda {
    //定义一个显示日志的方法 参数为日志等级和函数式接口
    public static void showLog(int level, MessageBuilder messageBuilder){
        if (level == 1)
            System.out.println(messageBuilder.buildMessage());
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1, ()->{
            //返回一个拼接后的字符串
            System.out.println("不满足条件不执行");
            return msg1 + msg2 + msg3;
        });
        /**
         * 使用lambda表达式作为参数传递 仅仅是把参数传递到showLog方法中
         * 只有满足调节 即level == 1 才会调用接口中的抽象方法
         * 才会进行字符串的拼接
         * 主要是使用lambda对拼接方法进行重写
         * 如果条件不满足 level != 1 接口中的方法不会执行
         * 所以拼接字符串的代码不会执行  不存在性能浪费
         */
    }
}
