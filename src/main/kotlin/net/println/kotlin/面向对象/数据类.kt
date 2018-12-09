package net.println.kotlin.面向对象


//kotlin 数据类 data class
data class Country(var name: String,var code: Int)

//自己定义 类也实现 component1() component2() component3() ... 方法
class ComponentX{
    operator fun component1(): String{
        return "hello 我是"
    }
    operator fun component2(): Int{
        return 1
    }
    operator fun component3(): Int{
        return 2
    }
    operator fun component4(): Int{
        return 0
    }
}

fun main(args: Array<String>) {
    val country = Country("中国",12)
    println(country)
    println(country.name)
    println(country.code)
    println(country.component1())
    println(country.component2())
    val country1= country.copy("美国",33)
    println("//////////////////")
    val (Name,Code)=country1
    println(Name)
    println(Code)
    println("//////////////////")
    val (a,b,c,d) = ComponentX()
    println("$a$b$c$d")
}

//为了 能像javabean 一样用  得添加两个插件 noArg 和 allOpen
// 这个两个插件（将 data class 的类 在编译期 创建了无参构造方法，并且将这个类改变成了非fine类）