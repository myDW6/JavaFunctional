package com.shaodw.stream;

import java.util.ArrayList;
import java.util.List;

public class NormalFilter {
    //集合的遍历传统方式 进行过滤

    /**
     * 一共使用了三个循环
     * @param
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张强");

         oriDemo(list);

        //使用Stream的方式
        //关注的是做什么 而不是怎么做

        //只要以张开头的String
        //在上述集合中只要姓名长度为3的人
        //打印复合要求的String
        System.out.println("使用Stream的方式");
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s -> System.out.println(s));
    }


    public static void oriDemo(List<String> list) {

        //只要以张开头的String
        List<String> zhangList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                zhangList.add(s);
            }
        }

        //在上述集合中只要姓名长度为3的人
        List<String> shortList = new ArrayList<>();
        for (String name : zhangList){
            if (name.length() == 3){
                shortList.add(name);
            }
        }

        //打印复合要求的String
        for (String name : shortList){
            System.out.println(name);
        }
    }
}
