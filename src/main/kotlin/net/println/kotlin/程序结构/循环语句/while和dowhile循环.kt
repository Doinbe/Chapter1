package net.println.kotlin.程序结构.循环语句

fun main(args: Array<String>) {
    var x = 5
    //先判断后执行
    while (x > 0){
        println(x)
        x--
    }
    //先执行后判断
    do {
        println(x)
        x--
    }while (x > 0)
}