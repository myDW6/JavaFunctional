package com.shaodw.methodreference.refByObject;

/**
 * 通过对象名引用成员方法
 * 使用前提是对象名是已经存在的 成员方法也是存在的
 * 就可以使用对象名来引用成员方法
 */
public class RefByObjectTest {
    //定义一个方法 方法的参数传递Printable接口
    public static void printString(Printable p){
        p.print("hello");
    }

    public static void main(String[] args) {
        //调用printString方法 方法的参数Printable是一个函数式接口 所以可以传递一个lambda表达式
        printString((s)->{
            //创建RefByObject对象
            RefByObject ref = new RefByObject();
            //调用该对象中的成员方法 把字符串按照大写输出
            ref.printUpperCase(s);
        });

        //使用方法引用优化lambda
        //对象存在
        //成员方法存在
        //可以使用对象名引用方法
        RefByObject ref = new RefByObject();
        printString(ref::printUpperCase);
    }
}
