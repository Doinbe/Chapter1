package net.println.kotlin.程序结构

/**
 * 运算符（单个运算符其实是一个函数-方法）
 */


//自己定义一个运算符
class Complex(var real: Double,var imag: Double){

    operator fun plus(other: Complex): Complex{
        return Complex(real+other.real,imag+other.imag)
    }
    //重写“+ plus”运算符，传入参数为Int
    operator fun plus(other: Int): Complex{
        return Complex(real+other,imag)
    }
    //重写“+ plus”运算符，返回参数为Int
    operator fun plus(other: Any): Int{
        return real.toInt()
    }
    //重写“() invoke()”方法 取模运算
    operator fun invoke(): Double{
        return Math.hypot(real,imag)//real平方+imag平方再开方的值
    }


    override fun toString(): String {
        return "$real+${imag}i"
    }

}

val array: Array<String> = arrayOf("name","solin","luckyman")

fun main(args: Array<String>) {
    val c1 = Complex(3.0,4.0)
    val c2 = Complex(2.0,6.0)
    println(c1 + c2)//5.0+10.0i
    println(c1 + 5)//8.0+4.0i
    println(c1 + "hello")//3
    println(c1.invoke())//5.0
    println(c1())//5.0

    //如国array数组有“solin”，就打印后一个成员
    if ("solin" in array){
        println(array[array.indexOf("solin") + 1])
    }
}

// *任何类可以定义或者重载父类的基本运算符

// *通过运算符对应的具名函数来定义 例如定义“+” 就写 plus() 函数

// *对参数的个数作要求，但对参数和返回值的类型不做要求

// *再kotlin中能够重载的运算符就那些(https://www.kotlincn.net/docs/reference/operator-overloading.html)，不能自己想定义什么运算符就什么运算符