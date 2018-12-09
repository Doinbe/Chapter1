package net.println.kotlin.面向对象

//伴生对象
//在kotlin 中 类的静态方法 如下方式
class Forever private constructor(val value: Double){
    companion object {
        fun ofDouble(double: Double): Forever{
            return Forever(double)
        }
        @JvmStatic
        fun ofForever(forever:Forever): Forever{
            return Forever(forever.value)
        }
        @JvmField
        val TAG1 = "Forever111"

        val TAG = "Forever"
    }
}


fun main(args: Array<String>) {
    val q = minOf(1,3)//minOf 包级函数，在kotlin中，要使用静态方法，尽量使用这种包级函数

    // kotlin 类的静态方法（类似java中 什么方法函数都需要一个类给包起来）
    val forever = Forever.ofDouble(4.0)
    val forever1 = Forever.ofForever(forever)

    println(Forever.TAG)
}

// 总结 在需要时用到静态的函数方法，首先先考虑需不需要 类包裹的静态方法函数，如果不需要 那尽量使用包级函数