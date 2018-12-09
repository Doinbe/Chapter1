package net.println.kotlin.程序结构.循环语句

val intList = intArrayOf(1,2,3,4,5,6,7)

fun main(args: Array<String>) {
    var x = 3
    var c = 6
    for (i in intList){
        if (i == x) continue //当 i=x 跳过 执行下面的循环
        if (i == c) break //当 i=c 跳出for循环
        println(i)
    }
}

// 跳过循环 continue
// 跳出循环 break