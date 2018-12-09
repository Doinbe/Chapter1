package net.println.kotlin.面向对象

abstract class A{
    var j: Int = 0
    fun hello(){
        println("抽象类A hello()：$j")
    }
    open fun hello1(){
        println("抽象类A hello1()：$j")
    }
    //抽象方法不能有函数体，具体实现需要到子类
    abstract fun hello2()
}

//抽象类W
abstract class W
//接口T
interface T
//接口Y
interface Y

interface B{
    var j: Int
    fun hello()
    //在java中并不能对接口方法进行实现的，而在kotlin中可以有默认实现的 如下
    fun hello1(){
        println("接口B：$j")
    }
}

//创建实现 接口B 的 类C
class C(override var j: Int) :B{
    override fun hello() {

    }

    // 实现类需要对 接口B 的 变量j 赋值
    // 需要对 接口B 没有默认实现方法 hello() 的实现
    // 有默认实现方法的 hello1() 可以不实现
}

//创建实现 继承 抽象类A 的类D
class D:A(){

    //子类必须实现 父类具有 abstract 关键字的方法(类似于接口中没有默认实现的方法)
    override fun hello2() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //可以重写 父类具有 open 关键字的方法
    override fun hello1() {
        super.hello1()
        //这可使用父类的属性
        var i = j

    }

    //父类具有 open 关键字的方法 子类可以重写这个方法
    //父类具有 abstract 关键字的抽象方法 子类必须实现这个方法
    //子类具有父类的所有特性
}

//class U:A(),W(){}
class U: W(),T,Y{

}
//由上可明白 子类只能继承单个父类，可以实现多个接口

fun main(args: Array<String>) {
    val u = U()
    if (u is W){
        println("U实现了抽象类W")
    }
    if (u is T){
        println("U实现了接口T")
    }
    if (u is Y){
        println("U实现了接口Y")
    }

    //子类可以充当 父类 和 实现的接口 使用
    val w:W = U()
    val t:T = U()
    val y:Y = U()

}
