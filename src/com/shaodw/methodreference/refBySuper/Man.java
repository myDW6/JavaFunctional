package com.shaodw.methodreference.refBySuper;

/**
 * 定义子类
 */
public class Man extends Human{
    //重写父类方法
    @Override
    public void sayHello() {
        System.out.println("hello i am man");
    }

    //定义一个方法 参数传递Grrrtable接口
    public void method(Greetable greet){
        greet.greet();
    }

    public void show(){
        //调用method方法 方法的参数是一个函数式接口 可传递lambda表达式
        method(()->{
            //创建父类
            Human h = new Human();
            //调用父类的sayHello方法
            h.sayHello();
        });
        //因为有子父类关系 所以可以使用super调用父类的成员方法
        method(()->super.sayHello());
        //方法引用 使用super引用父类的成员方法
        //super是已经存在的  成员方法也是存在的
        method(super::sayHello);
        method(this::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
