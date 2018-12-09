package net.println.kotlin.面向对象;

public class ExtendsJava {
    public static void main(String... args){
        //在java中  很多类似这样的静态方法
        if (UtilsJava.isEmpty(args)){

        }
        if (UtilsJava.isNoEmpty(args)){

        }

        //如果在java中使用自己写的扩展方法 如下
        System.out.println(扩展成员Kt.multiply("abc",5));
        System.out.println(扩展成员Kt.times("abc",10));

    }
}
