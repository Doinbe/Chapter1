package net.println.kotlin.面向对象

import kotlin.reflect.KProperty

//如果一个类的 属性成员是 常量 val，但创建这个类时 才给这个成员赋值，这时候就需要 属性代理 by lazy{...}，这只是一种情况

class Delegates{
    val hello by lazy {
        "hello World"
    }
    //实现自己的 代理对象
    val hello2 by XX()
    // var 的对象也要代理呢？
    var hello3 by XX()

    override fun toString(): String {
        return this.javaClass.name
    }
}

//仿照 lazy 自己创建代理对象类
class XX{
    private var value: String?=null
    //在lazy 的接口类 中发现他有一个扩展方法 getValue()
    //依葫芦画瓢 自己也写个 getValue() 方法 （直接复制这个方法，改写参数）
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String{
        println("getValue: $thisRef -> 成员${property.name}")
        return value?:"null"
    }
    // var 变量也要代理，就得添加 setValue() 方法。
    operator fun setValue(thisRef: Any?, property: KProperty<*>,value: String){
        println("setValue: $thisRef -> 成员${property.name} = $value")
        this.value=value
    }
}

fun main(args: Array<String>) {
    val delegates = Delegates()
    println(delegates.hello)
    println(delegates.hello2)
    println(delegates.hello3)
    delegates.hello3 = "我是helloWorld3"
    println(delegates.hello3)
}