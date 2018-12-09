package net.println.kotlin.程序结构

import java.lang.UnsupportedOperationException

fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入运算式（例如 3 + 2）：")
            val input = readLine() ?: break
            val options = input.trim().split(" ")//先去掉字符串两边的空格，然后在以空格分割字符串
            val arg1 = options[0].toDouble()
            val op = options[1]
            val arg2 = options[2].toDouble()
            println("$arg1 $op $arg2 = ${Operator(op).apply(arg1, arg2)}")
            println("需要再来计算一次吗?[Y]")
            val cmd = readLine()
            if (cmd == null || cmd.toLowerCase() != "y") break

        }catch (e: NumberFormatException){
            println("请输入以空格分割开的正确数字运算式！")
        }catch (e: IndexOutOfBoundsException){
            println("请输入以空格分割开的运算式！")
        }catch (e: UnsupportedOperationException){
            println("不支持此运算符进行运算")
        }catch (e: Exception){
            println("程序出现未知异常：${e.message}")
        }
    }
    println("感谢使用此计算器")
}

class Operator(op: String){
    //定义一个lambda表达式
    val opFun:(left: Double,right: Double) -> Double
    //在初始化时 给lambda表达式赋值
    init {
        opFun = when(op){
            "+" -> {l,r -> l+r}
            "-" -> {l,r -> l-r}
            "*" -> {l,r -> l*r}
            "/" -> {l,r -> l/r}
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }
    fun apply(left: Double,right: Double): Double{
        return opFun(left,right)
    }
}