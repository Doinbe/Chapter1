package net.println.kotlin.面向对象

interface Q{
    fun x(): Int = 1
}

interface S{
    fun x(): Int = 2
}

abstract class P{
    open fun x(): Int = 3
}

// 解决 父类和接口的 “方法名一样”，“返回值一样” 的情况
class O(val i:Int):P(), Q,S{
    override fun x(): Int {
        if (i > 100){
            return super<Q>.x()
        }else if (i > 50){
            return  super<S>.x()
        }else if (i > 10){
            return super<P>.x()
        }else{
            return i
        }
    }

}

fun main(args: Array<String>) {
    println(O(123).x())
    println(O(88).x())
    println(O(44).x())
    println(O(5).x())

}