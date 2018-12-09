package net.println.kotlin.高级函数

// 函数 柯里化
// 多元函数 变换成 一元函数调用链 的变换


fun hello(string: String,int: Int,double: Double){
    println("$string,$int,$double")
}

// 以下两种写法都是 函数柯里化

// 最基本的一种写法
fun curriedHello(string: String): (int: Int) -> (double: Double) -> Unit{
    return fun(int: Int): (double: Double) -> Unit{
        return fun(double: Double){
            println("$string,$int,$double")
        }
    }
}
// 简洁的写法
fun curriedHello1(string: String)
    = fun(int: Int)
    = fun(double:Double)
    = println("$string,$int,$double")


// 函数柯里化 不可能给每个函数都去写一遍吧
// 那上面的例子写个柯里化的扩展函数
fun <P1,P2,P3,R> Function3<P1,P2,P3,R>.curried()
    = fun(p1: P1)
    = fun(p2: P2)
    = fun(p3: P3)
    = this.invoke(p1, p2, p3)


fun main(args: Array<String>) {
    curriedHello("solin")(12)(34.0)
    curriedHello("solin1111111")(12)(34.0)
    ::hello.curried()("solin222222")(33)(44.0)
}