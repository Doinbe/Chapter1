package net.println.kotlin.数据类型;

/**
 * java 类型转换
 */

public class TapyCast {

    public static void main(String... args){
        Parent child = new Child();
        System.out.println(((Child) child).getName());

        if (child instanceof Child){
            System.out.println(((Child) child).getName());
        }

        //强制数据类型转换
        Parent parent = new Parent();
        //这肯定会报错
        System.out.println(((Child) parent).getName());

    }


}
