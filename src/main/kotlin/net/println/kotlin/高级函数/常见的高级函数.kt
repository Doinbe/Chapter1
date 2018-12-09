package net.println.kotlin.高级函数


fun main(args: Array<String>) {
    val intArray = intArrayOf(1,2,3,4,5,6)

    /********forEach********/
    // 遍历集合数据
    //intArray.forEach(::println)


    /********map********/
    // 改变集合的每个成员
    //val intMapArry = intArray.map { it*2 } //返回值是一个 List<返回值类型>
    //val doubleMapArray = intArray.map(Int::toDouble)
    //intArray.map { "abc$it" }.forEach(::println)

    val listIntRange = listOf(
            1..5,
            10..20,
            50..100,
            6..9
    )
    //如果要把 整型集合的集合 --变成--> 整型集合

    /********flatMap********/
    // 打平集合成员
    //listIntRange.flatMap {
    //    it
    //}.forEach { println(it) }
    //改变每个成员
    //listIntRange.flatMap {
    //    it.map(Int::toDouble).map { "No.$it" }
    //}.forEach(::println)

    /********reduce********/
    // 迭代成员成员
    //成员之和
    //val sum = intArray.reduce { acc, i -> acc+i }
    //println("intArray成员的迭代之和：$sum")
    //(0..6).map(::factorial).forEach(::println)
    println("阶乘成员的迭代之和：${(0..6).map(::factorial).reduce { acc, i ->  acc+i}}")

    /********fold********/
    // 加初始值的迭代成员
    println("附上初始值3，阶乘成员的迭代之和：${(0..6).map(::factorial).fold(3){acc, i ->  acc+i}}")
    // fun <T, R> Iterable<T>.fold(initial: R, operation: (acc: R, T) -> R): R{}
    // 知道传入的类型没有限制
    // 可以做 数据的变换
    println("字符串拼接：${
        (0..6).map(::factorial).fold(StringBuilder()){acc, i -> acc.append(i).append(",")}
    }") // 例如 (0..6) -> String

    /********foldRight********/
    // 倒序迭代成员
    println("倒序字符串拼接：${
    (0..6).map(::factorial).foldRight(StringBuilder()){i, acc -> acc.append(i).append(",")}
    }")


    //字符串拼接，平常用到是 joinToString
    println((0..6).joinToString(""))

}

fun factorial(n: Int): Int{
    if (n == 0) return 1
    //阶乘
    return (1..n).reduce { acc, i -> acc * i }
}
