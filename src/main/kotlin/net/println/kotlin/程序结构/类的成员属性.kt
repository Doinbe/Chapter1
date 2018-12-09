package net.println.kotlin.程序结构

class X

//类的成员属性（类的构造方法中只要包含 var和val修饰的变量都是类的属性）
class B(var a: String,var b: Int,val d: X,f: String){
    //例如 class B 中的属性成员只有 a,b,d
    // f 没有用val 或var 修饰，所以不是成员属性，只能说是构造方法的参数
}

//类的内部也是可以定于成员属性  如下定义的这些成员
class A{
    var b = 0 //在kotlin中get和set是他默认实习的方法
    //如果需要重写他们的get和set方法
    get() {
        println("some one tries to get b")
        return field
    }
    set(value) {
        println("some one tries to set b")
        field = value
    }
    //以上就完全和java 的get和set 完全一样了

    //成员属性
    //在起初是不能确定值时定义属性
    // 1：可以给默认值；
    // 2：延迟初始化"lateinit",对于val常量需要 by lazy{}
    lateinit var c: String
    lateinit var d: X
    val e: X by lazy {
        println("init X")
        X()
    }
}

fun main(args: Array<String>) {
    var b = B("",0,X(),"我不是B的成员属性")
    var a = A()
    println(a.b)
    println(a.e)
    a.d = X()
    println(a.d)
    a.c = "Solin"
    println(a.c)
}