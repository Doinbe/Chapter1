package net.println.kotlin.面向对象

//枚举类
//提高代码的表现力 ，但也有一定的缺陷 就是 内存的占用

enum class LogLevel{
    VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT
    //在kotlin 的字节码中可以看到如下
    //  public final static enum Lnet/println/kotlin/面向对象/LogLevel; VERBOSE
    //
    //  // access flags 0x4019
    //  public final static enum Lnet/println/kotlin/面向对象/LogLevel; DEBUG
    //
    //  // access flags 0x4019
    //  public final static enum Lnet/println/kotlin/面向对象/LogLevel; INFO
    //
    //  // access flags 0x4019
    //  public final static enum Lnet/println/kotlin/面向对象/LogLevel; WARN
    //
    //  // access flags 0x4019
    //  public final static enum Lnet/println/kotlin/面向对象/LogLevel; ERROR
    //
    //  // access flags 0x4019
    //  public final static enum Lnet/println/kotlin/面向对象/LogLevel; ASSERT

    // static <clinit>()V
    //    BIPUSH 6
    //    ANEWARRAY net/println/kotlin/面向对象/LogLevel
    //    DUP
    //    DUP
    //    ICONST_0
    //    NEW net/println/kotlin/面向对象/LogLevel
    //    DUP
    //    LDC "VERBOSE"
    //    ...................
    //可以明白 以上其实就是初始化的时候 创建了静态的LogLevel对象
}

//写个类似的 普通类 ,其实和上面的 枚举类 没什么区别
class LogLevel1 private constructor(){
    //在伴生对象中去创建静态对象
    companion object {
        val VERBOSE = LogLevel1()
        val DEBUG = LogLevel1()
        val INFO = LogLevel1()
        val WARN = LogLevel1()
        val ERROR = LogLevel1()
        val ASSERT = LogLevel1()
    }
}
// 枚举类 也可有构造方法
enum class LogLeve2(val id: Int){
    VERBOSE(0), DEBUG(1), INFO(2), WARN(3), ERROR(4), ASSERT(5);//结尾的“;” 可能是kotlin唯一一个必须要写的地方

    fun getTag(): String{
        return "$id $name"
    }

    override fun toString(): String {
        return "$name,$ordinal"
    }
}

fun main(args: Array<String>) {
    println(LogLeve2.DEBUG.getTag())
    println(LogLeve2.DEBUG.ordinal)// 静态成员也是有顺序的，ordinal 就是下标值
    println("//////////////////////")
    LogLeve2.values().map(::println)
    println("//////////////////////")
    //通过 成员名称 name(一模一样的名称值) 得到成员
//    println(LogLeve2.valueOf("warn"))
    println(LogLeve2.valueOf("WARN"))


}