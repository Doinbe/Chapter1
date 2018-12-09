package net.println.kotlin.数据类型

import sun.jvm.hotspot.HelloWorld

val FINAL_HELLO_WORLD: String = "Hello World"
var helloworld: String = FINAL_HELLO_WORLD
var nullableHelloWorld: String? = helloworld
val helloWorldArray: Array<Char> = arrayOf('H','e','l','l','o','W','o','r','l','d')
val helloWorldCharArray: CharArray = charArrayOf('H','e','l','l','o','W','o','r','l','d')
val helloWorldLength: Int = helloworld.length
val helloWorldLengthLong: Long = helloworld.length.toLong()

fun main(args: Array<String>) {
    println("FINAL_HELLO_WORLD: $FINAL_HELLO_WORLD")
    println("helloworld: $helloworld")
    println("nullableHelloWorld: $nullableHelloWorld")
    println("helloWorldArray: $helloWorldArray")
    println("helloWorldArray: ${helloWorldArray.joinToString("")}")
    println("helloWorldCharArray: $helloWorldCharArray")
    println("helloWorldCharArray: ${String(helloWorldCharArray)}")
    println("helloWorldLength: $helloWorldLength")
    println("helloWorldLengthLong: $helloWorldLengthLong")
    println("class name: ${HelloWorld::class.java.simpleName}")
    println("path class name: ${HelloWorld::class.java.name}")
    println("class name 截取片段: ${HelloWorld::class.java.simpleName.slice(2 until helloWorldLength-1)}")
}