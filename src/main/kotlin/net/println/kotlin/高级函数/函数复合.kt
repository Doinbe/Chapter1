package net.println.kotlin.高级函数



val add5 = {i:Int -> i+5} //g(x)
val playBy2 = {i:Int -> i*2} //f(x)

//add5和playBy2这两个函数复合  m(x) = f(g(x))
infix fun <P1,P2,R> Function1<P1,P2>.andThen(function: Function1<P2,R>): Function1<P1,R>{
    return fun(p1: P1): R{
        return function.invoke(this.invoke(p1))
    }
}
// 复合函数 用到很多东西
// （中缀表达式）infix 修饰的函数 这样就可以去掉"." 和 "()"来调用这个函数了
//  Function1<P1,P2>.andThen  给Function1 添加了一个扩展函数
// 函数内部用到 闭包函数
// 修饰符“()”  invoke 函数本身


//再写一个 m(x) = g(f(x))
infix fun <P1,P2,R> Function1<P2,R>.compose(function: Function1<P1,P2>): Function1<P1,R>{
    return fun(p1: P1): R{
        return this.invoke(function.invoke(p1))
    }
}


fun main(args: Array<String>) {
    println(add5.invoke(5))
    println(playBy2(add5(5)))

    val add5andThenPlayBy2 = add5 andThen playBy2
    println(add5andThenPlayBy2.invoke(4)) //m(x) = f(g(x))
    val add5composePlayBy2 = add5 compose playBy2
    println(add5composePlayBy2.invoke(4)) //m(x) = g(f(x))
}