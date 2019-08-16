package com.shaodw.methodreference.refByThis;

/**
 * 通过this引用本类的成员方法
 */
public class Husband {
    //定义一个买房子的方法
    public void buyHouse(){
        System.out.println("北京二环买一套四合院");
    }

    //定义一个结婚的方法 参数传递Richable接口
    public void marry(Richable r){
        r.buy();
    }
    //定义一个高兴的方法
    public void soHappy(){
        //调用结婚的方法 方法的参数是一个函数式接口 可以传递一个lambda
        marry(()-> this.buyHouse());//使用this.成员方法，调用本类买房子的方法


        //使用方法引用
        //this已经存在 成员方法buyHouse已经存在 可以直接使用this引用本类的成员方法
        marry(this::buyHouse);
    }





    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
