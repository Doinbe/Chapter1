package net.println.kotlin.面向对象

import net.println.kotlin.数据类型.string
import java.util.ArrayList

class Overloads{
//    fun a(): Int{
//        return 0
//    }
//    fun a(i: Int):Int{
//        return i
//    }
//    fun a(str: String):String{
//        return str
//    }
    //以上就是方法重载。 方法名相同   方法参数不一样
    //通过以下这个方法，可以知道方法重载和方法的返回参数没关系
//    fun a():String{
//        return "这就不行了"
//    }

    //如果 给方法加上默认参数 ,就可以把以上所有重载方法写成一个方法  如下
    @JvmOverloads //@JvmOverloads这个标注是 重载方法有默认参数，为了能在Java中调用不传参数
    fun a(i: Int = 0,str: String=""):Int{
        if (!str.equals("")){
            return str.length
        }else{
            return i
        }
    }

}

fun main(args: Array<String>) {
    val overloads = Overloads()
    println(overloads.a())
    println(overloads.a(i = 2))
    println(overloads.a(str = "具名参数"))


    //将java 存在bug 的移到kotlin中 看先
    val lists = ArrayList<Int>()
    lists.add(12)
    lists.add(2)
    lists.add(3)
    lists.add(23)
    lists.add(5)
    lists.add(50)
    lists.add(500)
    println(lists)
    lists.removeAt(1) //如果是以下标移除成员  removeAt
    lists.remove(5) //如果是以成员移除 remove
    println(lists)

    //[12, 2, 3, 23, 5, 50, 500]
    //[12, 3, 23, 50, 500]

}

// 由于 kotlin中 有具名函数这一性质
// 所以在kotlin中重载方法 可以用 默认参数 把重载方法简写到 一个方法