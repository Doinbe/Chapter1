package net.println.kotlin.程序结构

//中缀表达式
// *一个函数只有一个参数，可以用“infix”去修饰这个函数，这样就可以去掉"." 和 "()"来调用这个函数了。
//例如:
class Book{
    infix fun on(string: String){
        println(string)
    }
}

//分支表达式
//（最常见的 if ）
const val USERNAME = "solin"
const val PASSWORD = "solin"
const val ADMIN_USERNAME = "admin"
const val ADMIN_PASSWORD = "admin"
const val USER = 0
const val DUBG = 1



fun main(args: Array<String>) {
    //终追表达式
    Book() on "中缀表达式"

    //分支表达式
//    var mode = USER // 以java的思路 因为mode 是可变的，所以 var 定义变量
//    if (args.isNotEmpty()&&args[0]=="1") mode = DUBG  //这是之前在Java常见的写法

    //在kotlin中这样的语句可以这样写  这也就是kotlin的分支表达式了
//    val mode =if (args.isNotEmpty()&&args[0]=="1") {
//        println("管理员在登录")
//        DUBG
//    }else{
//        println("用户在登录")
//        USER
//    }
    //可见 if 语句在kotlin中不仅是判断语句，它还是带返回值的也就是分支的最后一行
    //简化
    val mode =if (args.isNotEmpty()&&args[0]=="1") DUBG else USER

    println("请输入用户名：")
    var userName = readLine()
    println("亲输入密码：")
    var passWord = readLine()
    if (mode == USER && userName == USERNAME && passWord == PASSWORD){
        println("登录成功")
    }else if (mode == DUBG && userName == ADMIN_USERNAME && passWord == ADMIN_PASSWORD){
        println("管理员登录成功")
    }else{
        println("登录失败")
    }


    //When 判断语句 相当于java的switch语句
    //加强版的 switch 并且支持任意类型
    when(mode){
        is Int -> println("x is $mode")
        in 1..100 -> println("$mode in 1..100")
        !in 1..100 -> println("$mode is not in 1..100")
        args[0].toInt() -> println("args[0]=mode")
        else -> println("这是When表达式")
    }
    //when 语句也是有返回值的，所以也就有了如下的when表达式了
    // When 表达式
    val type = when{
        args.isNotEmpty() && args[0].toInt() == 1 -> DUBG
        else -> USER
    }
    println("when表达式 判断得到用户类型的值：$type")

    //try...catch表达式 异常捕获中会看到

}