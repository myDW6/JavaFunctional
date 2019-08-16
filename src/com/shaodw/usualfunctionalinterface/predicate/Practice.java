package com.shaodw.usualfunctionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 存在一个字符串数组，通过predicate接口的拼装将复合要求的字符串筛选到集合ArrayList中
 * 需要同时满足条件：为女 姓名为4个字
 */
public class Practice {

    public static List<String> filtePer(String[] str, Predicate<String> p1, Predicate<String> p2 ){
        List<String> list = new ArrayList<String>();
        for (String arr : str) {
            if (p1.and(p2).test(arr)){
                list.add(arr);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女","马儿扎哈,男","赵丽颖,女"};
        List<String> list = filtePer(array, s -> s.split(",")[0].length() == 4, s -> s.split(",")[1].equals("女"));
        System.out.println(list);
    }
}
