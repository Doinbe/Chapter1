package net.println.kotlin.数据类型

/**
 * null 类型安全
 */
fun getName(): String?{
    return null
}

fun main(args: Array<String>) {

    val aOne: String? = null
    println(aOne?.length)

    val bOen: String? = "小明"
    println(bOen!!.length)


    val name: String = getName() ?: return
    println(name.length)


}

