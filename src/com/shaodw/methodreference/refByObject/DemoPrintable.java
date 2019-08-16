package com.shaodw.methodreference.refByObject;

public class DemoPrintable {
    //定义一个方法 参数传递printable接口 对字符串进行打印
    public static void printString(Printable p){
        p.print("hello world");
    }

    public static void main(String[] args) {
        //调用printString方法 方法的参数是一个函数式接口 可以传递一个lambda表达式
        printString((s)-> System.out.println(s));

        /**
         * lambda表达式的目的 打印参数传递的字符串
         * 把参数s传递给了System.out对象 调用out对象的println方法对字符串进行打印
         * 注意：System.out对象已经存咋
         * println方法已经存在
         * （对象和方法都已经存在）
         * 可以使用方法引用来优化lambda表达式
         * 可以使用System.out方法直接引用（调用）println（）方法
         */
        printString(System.out::println);
    }
}
