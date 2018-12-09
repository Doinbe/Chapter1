package net.println.kotlin.程序结构

// 具名参数 变长参数 默认参数

fun main(args: Array<String>) {
    println("**************具名参数******************")
    /**
     * 具名参数
     */
    //给函数的实参附上形参
    function1(arg1 = 2,arg2 = 4)
    //既然给函数的每个参数指定的值，参数的位置当然也就可以变换了
    function1(arg2 = 3,arg1 = 5)

    println("**************变长参数******************")

    /**
     * 变长参数
     */
    //函数的某个参数可以接收多个值
    //由于kotlin中有具名参数，所以变长参数可以在参数的任意位置
    function2(1,2,3,string = "solin")
    function3(3.0,1,2,3,string = "luckyman")


    println("***************默认参数*****************")

    /**
     * 默认参数
     */
    //在创建函数时给参数附上默认值
    function4(5.0,1,2,3)

    println("***************Spread Operator(“*”)*****************")
    //既然变长参数是多个参数，那就会有传入参数列表的情况
    /**
     * Spread Operator “*”
     */
    //只支持展开Array 只用于变长参数列表的实参
    val intArray = intArrayOf(1,2,3)
    val ints = arrayListOf(1,2,3)
    //function5(int = *ints) 可见目前只支持展开Array，可能kotlin以后会支持
    function5(int = *intArray)

}

fun function1(arg1: Int,arg2: Int){
    println("arg1:$arg1 arg2:$arg2")
}

fun function2(vararg int: Int,string: String){
    int.forEach(::println)
    println("string:$string")
}

fun function3(double: Double,vararg int: Int,string: String){
    println("double:$double")
    int.forEach(::println)
    println("string:$string")
}

fun function4(double: Double,vararg int: Int,string: String = "LuckyMan"){
    println("double:$double")
    int.forEach(::println)
    println("string:$string")
}

fun function5(double: Double = 6.0,vararg int: Int,string: String = "LuckyMan"){
    println("double:$double")
    int.forEach(::println)
    println("string:$string")
}