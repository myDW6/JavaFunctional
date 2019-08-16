package com.shaodw.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 集合元素的处理
 * 使用传统方式和Strem方式实现以下操作
 * 1 第一个队伍只要名字为三个字的成员姓名，存储到一个新集合中
 * 2 第一个队伍筛选之后只要前三个人 存储到一个新集合中
 * 3 第二个队伍只要姓张的成员姓名 存储到一个新集合中
 * 4 第二个队伍筛选之后不要前两个人 存储到一个新集合中
 * 5 将两个队伍合并成一个队伍 存储到一个新集合中
 * 6 根据姓名创建Person对象 存储到一个新集合中
 * 7 打印整个队伍的Person对象信息
 */
public class Practice {
    public static void useStreamHandle(List<String> listA, List<String> listB){
        Stream<String> s1 = listA.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> s2 = listB.stream().filter(s -> s.startsWith("张")).skip(2);
        Stream.concat(s1,s2).map(s -> new Person(s)).forEach(s-> System.out.println(s));
    }

    public static void notUseStreamHandle(List<String> listA, List<String> listB){
        List<String> list1 = new ArrayList<>();
        for (String s : listA){
            if (s.length() == 3){
                list1.add(s);
            }
        }

        List<String> list2 = new ArrayList<>();
        for (int i = 0 ;i < 3; i++){
            list2.add(list1.get(i));
        }

        List<String> list3 = new ArrayList<>();
        for (String s : listB){
            if (s.startsWith("张")){
                list3.add(s);
            }
        }


        List<String> list4 = new ArrayList<>();
        for (int i = 2; i < list3.size(); i++){
                list4.add(list3.get(i));
        }


        List<String> total = new ArrayList<>();
        total.addAll(list2);
        total.addAll(list4);

        List<Person> persons = new ArrayList<>();
        for (String s : total){
            persons.add(new Person(s));
        }

        for (Person person : persons){
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        //第一个队伍
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        //第二个队伍
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("里古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");


        System.out.println("使用传统集合方式：");
        notUseStreamHandle(one, two);
        System.out.println("使用Stream方式：");
        useStreamHandle(one,two);

    }
}

class Person{
    private String name;

    public Person(){};

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:" + this.name ;
    }
}
