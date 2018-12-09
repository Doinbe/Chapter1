package net.println.kotlin.程序结构

fun main(args: Array<String>) {
    try {
        val arg1 = args[0].toInt()
        val arg2 = args[1].toInt()
        println("$arg1 + $arg2 = ${sum(arg1,arg2)}")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("你确认你输入的是两个整数吗？")
    }catch (e: NumberFormatException){
        println("你确认输入的是整数吗？")
    }catch (e: Exception){
        println("程序出现未知异常:${e.message}")
    }finally {
        //这是抛异常之后，都会执行的代码
        println("感谢使用我们的程序")
    }

    // 表达式 （和 when if 语句一样 try...catch 也是表达式）
    val arg = try {
        args[0].toInt()/args[1].toInt()
    }catch (e: Exception){
        0
    }finally {
        println("这是try...catch表达式")
    }
    println("try...catch表达式的返回值：$arg")



}

fun sum(arg1: Int,arg2: Int): Int{
    return arg1+arg2
}
fun sum1(arg1: Int,arg2: Int): Int = arg1+arg2

val sum2 = fun(arg1: Int,arg2: Int): Int = arg1+arg2

val sum3 = {arg1: Int,arg2: Int -> arg1+arg2}

