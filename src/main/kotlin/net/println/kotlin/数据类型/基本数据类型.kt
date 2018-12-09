package net.println.kotlin.数据类型

/**
 * 基本数据类型
 */
val aBoolean: Boolean = true
val anotherBoolean: Boolean = false

val aInt: Int = 100
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

val aLong: Long = 2338989898
val otherLong: Long = 234
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0f
val otherFloat: Float = 1000f
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = Float.MIN_VALUE

val aDouble: Double = 3.0
val otherDouble: Double = 3.1415926
val maxDouble: Double = Double.MAX_VALUE
val minDouble: Double = Double.MIN_VALUE

fun main(args: Array<String>) {
    println(aBoolean)
    println(anotherBoolean)

    println(aInt)
    println(maxInt)
    println(minInt)

    println(aLong)
    println(otherLong)
    println(maxLong)
    println(minLong)
    println(55)
    println(55L)

    println(aFloat)
    println(otherFloat)
    println(maxFloat)
    println(minFloat)

    println(aDouble)
    println(otherDouble)
    println(maxDouble)
    println(minDouble)
}