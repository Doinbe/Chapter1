package net.println.kotlin.数据类型

import net.println.kotlin.数据类型.市委书记.北京.市委书记


/**
 *Array 数组
 */

val arrayOfInt: IntArray = intArrayOf(0,1,2,3,4,5)
val arrayOfChar: CharArray = charArrayOf('H','e','l','l','o','W','o','r','l','d')
val arrayString: Array<String> = arrayOf("小明","小红","小林")
val arrayOf书记: Array<市委书记> = arrayOf(市委书记("张"), 市委书记("王"), 市委书记("李"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (i in arrayOfInt){
        println(i)
    }

    println(arrayOf书记[1])
    arrayOf书记[1] = 市委书记("方")
    println(arrayOf书记[1])


    println(arrayOfChar.joinToString())
    println(arrayOfChar.joinToString(""))
    println(arrayOfChar)


    //数组切片 取到其中一部分
    println(arrayOfInt.slice(1..3))
     for (i in arrayOfInt.slice(1..3)){
         println(i)
     }



}