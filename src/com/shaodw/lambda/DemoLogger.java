package com.shaodw.lambda;

/**
 * 日志案例
 * 以下代码存在性能浪费的问题
 * 如果日志级别不是1 字符串就会白拼接
 */
public class DemoLogger {
    //根据日志的级别 显示日志信息的方法
    public static void showLog(int level, String msg){
        if (level == 1){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(2,msg1 + msg2 + msg3);
    }

}
