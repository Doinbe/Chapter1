package net.println.kotlin.面向对象

class People{

    val a: Int=5

    class Man{
        fun hello(){
//            println(a) //这直接取不到外部类People的成员属性a
            println(People().a)//要取到外部类People的成员a，需要先创建外部类的对象在取到成员的

            //由上可以得出 Man 是外部类People的 静态内部类

        }
    }

    inner class Woman{
        var a: Int=10
        fun hello(){
            println(this.a)
            println(this@People.a)
            //以上能直接拿到外部类People的成员属性a，也说明Woman是非静态内部类
        }
    }
}

fun main(args: Array<String>) {
    val man = People.Man()
    //以上在创建Man对象是并不需要外部People对象的实例
    // 所以Man是People的静态内部类，没有持有外部类People的引用

    val woman = People().Woman()
    //以上在创建Woman对象是需要外部People对象的实例
    // 所以Woman是People的非静态内部类，持有外部类People的引用
}