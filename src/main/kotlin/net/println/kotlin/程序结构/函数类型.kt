package net.println.kotlin.程序结构

/**
 * 常量与变量
 */

val FINAL_HELLO_WORLD: String = "HelloWorld"
var helloWorld: String = "HelloWorld"
val FIANL_HELLO_CHINA = "HelloChina"

/**
 * kotlin的 val 与 java 的 final 只能说是用法上一样，实质上并不是完全一样
 *
 * java 中 final 定义的变量实质上是编译期间的常量
 * 编译期间的常量：编译器在编译的时候就知道这个个变量的值了，并且在代码中对这个变量的引用都替换成他的值了，不需要一个取值和赋值的过程
 *
 * 如果在 val 前加一个 const 那就完全一模一样了
 * 例如kotlin中 const val hello：String = "Hello"  与java中 final String hello = "Hello"；
 * 这就完全一样了
 *
 */


/**
 * 函数 （单一原则，一个函数只做一件事）
 */

fun main(args: Array<String>) { // (Array<String>) -> Unit
//    helloWorld = "HelloChina"
//    println(FIANL_HELLO_CHINA)
//
//    checkAge(args)
//    val arg1 = args[0].toInt()
//    val arg2 = args[1].toInt()
//    println("$arg1 + $arg2 = ${sum(arg1,arg2)}")
//    println(intToLong(3))
//    println(sum(1,3))
//    //() 是kotlin的运算符
//    //sum() 的括号相当于 sum.invoke()方法
//    println(sum.invoke(1,3))

//    for (i in args){
//        println(i)
//    }
//
//    args.forEach {
//        println(it)
//    }
//
//    args.forEach ({it -> println(it)})
//    args.forEach ({println(it)})
//    args.forEach (){println(it)}
//    args.forEach {println(it)}
//    args.forEach(::println)

//    args.forEach {
//        if (it == "q") return //这是lamdba 表达式 不是函数， return 是这个Main 函数
//        println(it)
//    }
    args.forEach ASD@{
        if (it == "q") return@ASD //return这是lamdba 表达式，可以加标签
        println(it)
    }

    println("The end") // (Any?) -> Unit
}

 fun checkAge(args: Array<String>){
     if (args.size < 2){
         printUsage()
         System.exit(0)
     }
 }

fun printUsage(){ // () -> Unit
    println("请传入两个参数，例如：1 2")
}

//最开始求和函数
//fun sum(arg1: Int,arg2: Int): Int{ //(Int,Int) -> Int
//    return  arg1+arg2
//}

//简写成如下
//fun sum(arg1: Int,arg2: Int) = arg1+arg2
//val sum = fun(arg1: Int,arg2: Int) = arg1 + arg2
//Lambda 表达式
//val sum = {arg1: Int,arg2: Int -> arg1 + arg2}
val sum = {arg1: Int,arg2: Int ->
    println("$arg1 + $arg2 = ${arg1+arg2}")
    arg1 + arg2
}

/**
 * 匿名函数(没有名字的函数) 但必须要一个变量来接收这个函数
 * 可以明白 函数 也是一种数据类型
 */
val intToLong = fun(x: Int): Long{ //(Int) -> Long
    return  x.toLong()
}
