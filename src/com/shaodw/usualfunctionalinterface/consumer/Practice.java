package com.shaodw.usualfunctionalinterface.consumer;

import java.util.function.Consumer;

/**
 * 格式化打印信息：
 * 字符串数组中存有多条信息 按照姓名：XX 性别：xx的格式打印
 * 要求将打印姓名的动作作为第一个Consumer接口的lambda实例
 *     将打印性别的动作作为第二个Consumer接口的lambda实例
 *     将两个Consumer接口按照顺序拼接在一起
 */
public class Practice {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女","马儿扎哈,男"};
        formatPrint(array, (s)-> System.out.print("姓名：" + s.split(",")[0] + " "), (s)-> System.out.println("性别：" + s.split(",")[1]));
    }

    public static void formatPrint(String[] array, Consumer<String> c1, Consumer<String> c2){
        for (String s : array){
            c1.andThen(c2).accept(s);
        }
    }
}
