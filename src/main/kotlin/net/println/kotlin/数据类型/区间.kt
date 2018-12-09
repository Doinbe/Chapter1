package net.println.kotlin.数据类型

/**
 * 区间
 */

val rangeOne: IntRange = 0..1024 //[0,1024]
val rangeTwo: IntRange = 0 until 1024 //[0,1024)=[0,1023]
val rangeThree: IntRange = 0..-1

fun main(args: Array<String>) {
    println(rangeThree.isEmpty())
    println(rangeOne.contains(50))
    println(50 in rangeOne)
    println(rangeTwo.contains(1024))
    for (i in rangeTwo){
        println(i)
    }
}
