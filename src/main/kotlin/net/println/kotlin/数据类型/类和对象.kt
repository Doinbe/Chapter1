package net.println.kotlin.数据类型

/**
 * 类和对象
 */

open class 人 constructor(var 性格: String, var 长相: String, var 声音: String){
    init {
        println("我喜欢的${this.javaClass.simpleName}：性格$性格，长相$长相，声音$声音")
    }
}

class 妹子 constructor(性格: String, 长相: String, 声音: String): 人(性格,长相,声音)
//{
//    init {
//        println("我喜欢的妹子：性格$性格，长相$长相，声音$声音")
//    }
//}
class 帅哥 constructor(性格1: String, 长相1: String, 声音1: String): 人(性格1,长相1,声音1)
//{
//    init {
//        println("我欣赏的帅哥：性格$性格，长相$长相，声音$声音")
//    }
//}

fun main(args: Array<String>) {
    val 我喜欢的妹子: 妹子 = 妹子("古怪", "甜美", "戳心")
    val 我欣赏的帅哥: 帅哥 = 帅哥("高冷", "俊俏", "浑厚")
}
