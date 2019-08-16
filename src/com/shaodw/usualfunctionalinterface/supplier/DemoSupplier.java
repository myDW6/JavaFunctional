package com.shaodw.usualfunctionalinterface.supplier;

import java.util.function.Supplier;

/**
 * java.util.function.Supplier<T> 包含一个无参的方法 T get() 用于获取泛型类型指定的对象数据
 * 该接口也被称为生产型接口， 指定接口的泛型 接口中的get方法会生产对应泛型的数据
 */
public class DemoSupplier {

    //定义一个方法 方法的参数为Supplier
    public static <T> T getT(Supplier<T> supplier){
        return supplier.get();
    }

    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }
    public static void main(String[] args) {
        //调用getT方法 参数可以传递一个lambda表达式
        Dog dog = getT(()-> new Dog(1, "dog"));
        System.out.println(dog);

        System.out.println(getString(()-> "hello"));

        int[] arr = {3,1,5,6,2,8,6,0};
        int m = getMax(()->{
            int max = arr[0];
            for (int i = 1 ; i < arr.length; i++){
                if (max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(m);
    }

    //使用supplier接口实现求数组中的最大值
    public static Integer getMax(Supplier<Integer> supplier){
        return supplier.get();
    }
}

class Dog{
    private int id;
    private String name;

    public Dog(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id;
    }


}
