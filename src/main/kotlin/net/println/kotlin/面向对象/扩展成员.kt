package net.println.kotlin.面向对象

import kotlin.text.StringBuilder

//在java 中 我们都会写很多 utils （判断String 为不为空，类型的转换，时间日期格式转换 等等....）
//在kotlin中 解决这类问题 就是给对应的类添加 扩展方法

fun main(args: Array<String>) {
    //在kotlin中 扩展方法 就类似这种 如下
    if (args.isEmpty()){

    }
    if (args.isNotEmpty()){

    }

    //自己写个扩展方法
    //  例如 abc 打印成 adcabcabcabcabcabcabc
    println("abc".multiply(5))
    println("abc" * 10)
    println("abc".a)
    println("abc".i)
}

// 扩展方法
fun String.multiply(int: Int): String{
    val stringBuffer = StringBuilder()
    for (i in 0 until  int){
        stringBuffer.append(this)
    }
    return stringBuffer.toString()
}
// operator 运算符重载 的 扩展方法
operator fun String.times(int: Int): String{
    val stringBuffer = StringBuilder()
    for (i in 0 until  int){
        stringBuffer.append(this)
    }
    return stringBuffer.toString()
}
//扩展属性
val String.a: String
    get() = "abc"

var String.i: Int
    set(value) {

    }
    get() = 5