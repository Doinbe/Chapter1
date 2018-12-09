package net.println.kotlin.高级函数

// 闭包函数
// 函数的运行环境
// 持有函数的运行状态
// 函数内部可以定义函数
// 函数内部也可以定义类

fun makeFun(): () -> Unit{
    var count = 0
    return fun(){
        println(++count)
    }
}

fun numAddNum(): () -> Long{
    var numOne = 0L
    var numTwo = 1L
    return fun(): Long{
        val result = numTwo
        numTwo += numOne
        numOne = numTwo - numOne
        return result
    }
}

fun numAddNum1(): Iterable<Long>{ //Iterable 就是for循环的实现原理 看前面的for循环
    var numOne = 0L
    var numTwo = 1L
    return Iterable {
        object: LongIterator(){
            override fun hasNext(): Boolean {
                return true
            }

            override fun nextLong(): Long {
                val result = numTwo
                numTwo += numOne
                numOne = numTwo - numOne
                return result
            }

        }
    }

}

fun add(x: Int) = fun(y: Int) = x+y
//上面的 add 闭包函数 就是是下面 add1 这种
fun add1(x: Int): (Int) -> Int{
    return fun(y: Int): Int{
        return x+y
    }
}

fun main(args: Array<String>) {
//    val x = makeFun()
//    x()
//    x()
//    x()
//    x()

//    val num = numAddNum()
//    println(num())
//    println(num())
//    println(num())
//    println(num())
//    println(num())

//    for (i in numAddNum1()){
//        println(i)
//        if (i>100) break
//    }

    val add5= add(5)
    println(add5(3))
    println(add5(5))

    val add2= add1(5)
    println(add2(3))
    println(add2(5))


}