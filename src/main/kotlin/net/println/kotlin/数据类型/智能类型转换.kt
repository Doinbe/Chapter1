package net.println.kotlin.数据类型

fun main(args: Array<String>) {
    val child: Parent = Child()
    if (child is Child) println(child.name)

    val string: String? = "Hello"
    if (string is String) println(string.length)

    val parent: Parent = Parent()
    //kotlin 中也会有类型转换错误
    //val child1: Child = parent as Child
    //kotlin 中智能类型转换（安全类型转换——转换成功就还回对象，失败就还回null不要报异常就行）
    val child1: Child? = parent as? Child
    println(child1)
    println(child1?.name)
}