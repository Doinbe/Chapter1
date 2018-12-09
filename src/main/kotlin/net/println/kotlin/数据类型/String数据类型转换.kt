package net.println.kotlin.数据类型

/**
 * String 数据类型转换
 */

val string: String = "HelloWorld"
val stringChars: String = String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))


fun main(args: Array<String>) {
    println(string == stringChars)
    println(string === stringChars)
    println("我们输出：" + string)

    val aInt: Int = 2
    val bInt: Int = 2
    println(""+aInt+"+"+bInt+"="+(aInt+bInt))
    println("$aInt+$bInt=${aInt+bInt}")

    //Hello "Solin"
    val sayHello: String = "Hello \"Solin\""
    println(sayHello)
    val saraly: Int = 1000
    println(saraly)
    println("$saraly")
    println("\$saraly")

}