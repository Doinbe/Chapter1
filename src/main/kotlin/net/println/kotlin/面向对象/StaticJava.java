package net.println.kotlin.面向对象;

public class StaticJava {
    public static void main(String... args){
        //在java中调用kotlin类的静态方法
        Forever forever = Forever.Companion.ofDouble(5.0);
        //在java中调用kotlin类的静态变量
        System.out.println(Forever.Companion.getTAG());
        //如果不要.Companion 就得在方法加个标签 @JvmStatic
        Forever forever1 = Forever.ofForever(forever);
        //如果不要.Companion 就得在变量加个标签 @JvmField
        System.out.println(Forever.TAG1);


    }
}
