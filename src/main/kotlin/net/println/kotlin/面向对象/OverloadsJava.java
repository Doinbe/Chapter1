package net.println.kotlin.面向对象;

import java.util.ArrayList;
import java.util.List;

public class OverloadsJava {

    public static void main(String... args){
        //在java中存在一个Bug
        List<Integer> lists = new ArrayList<Integer>();
        lists.add(12);
        lists.add(2);
        lists.add(3);
        lists.add(23);
        lists.add(5);
        lists.add(50);
        lists.add(500);
        System.out.println(lists);
        lists.remove(1);
        lists.remove(5);
        System.out.println(lists);
        //[12, 2, 3, 23, 5, 50, 500] 最开始所有的成员
        //[12, 3, 23, 5, 50]  移除了 3 和 500 (移除3是没问题的，但 5 我是想移除 成员5 而不是下标为5的 成员500)
        //所以在java中就有这么一个bug


        //在kotlin中方法的重载 是有默认参数 在java调用呢？
        Overloads overloads = new Overloads();
        //overloads.a(); 直接调用 不写参数是不行的
        System.out.println(overloads.a()); //在kotlin中将重载方法添加上@JvmOverloads标注  这样就可以直接在java中调用并不传参数

    }



}
