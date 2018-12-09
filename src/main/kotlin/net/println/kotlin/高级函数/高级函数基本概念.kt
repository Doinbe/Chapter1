package net.println.kotlin.高级函数

//什么是高级函数？
// *传入或者返回函数的函数
//高级函数就是 把函数本身可以当做参数或者是返回值 的一类函数
//最常见得函数引用方式    ::函数名

fun main(args: Array<String>) {
    /*************第1种调用方式**************/
    //::方法名       引用包级函数的方式
    args.forEach(::println)
    //在 forEach(action: (T) -> Unit): Unit 传入的参数是一个(传入参是T，返回值是Unit)的Lambda表达式，还回了Unit
    //而println 函数类型是 （any: Any?） -> Unit
    //这个println的函数类型 正符合 forEach 传入的函数类型
    //所以可以知道 forEach并不是只要传入 (T) -> Unit 的Lambda表达式 ，而是说只要符合 传入参数 和 返回值 的任意函数都是可以的
    // println其中一种函数形式就符合

    /*************第2种调用方式**************/
    //类名::方法名     引用类的成员方法的方式
    val helloWorld= Hello::world
    // Hello的world()函数函数类型是：() -> Unit
    // 但在上面变量接收值可以看到
    // Hello::world 这种引用函数world() 实质函数类型是: (hellow: Hello) -> Unit  是传入了 Hello 的实例
    // Hello::world --相当于--> world(hello: Hello)

    args.filter(String::isNotEmpty)
    //在filter中可以看到 filter(predicate: (T) -> Boolean): List<T>  传入了一个(传入参数是T类型，返回值是布尔类型)的Lambda表达式，还回了List<T>
    //CharSequence.isNotEmpty(): Boolean 看上去isNotEmpty()的函数类型是：() ->Boolean ，并没有传入一个为T的参数
    //但是CharSequence.isNotEmpty()是通过CharSequence实例去调用的isNotEmpty()函数，相当于就是给isNotEmpty()函数传入了这么一个CharSequence实例
    //isNotEmpty()其实也是String类型的一个扩展函数
    //也就明白了 类的函数 其实是有默认的一个参数，这个参数就是调用这个扩展函数的实例本身
    // String::isNotEmpty() --相当于--> isNotEmpty(string: String)
    /**
     * 类名::方法名  注意：这种方式引用 有一个隐含的参数就是调用者本身的实例
     * **/

    /*************第3种调用方式**************/
    //调用者实例::方法名   引用调用者的方法的方式(这种调用方式在kotlin version 1.1 以后才支持的，包括版本1.1)
    //args.forEach(PDFptint::println)
    // 这种写法根本不行
    // PDFptint的函数println(any: Any)的类型是 (T) -> Unit 感觉是符合forEach传入的表达式的呀。
    //在上面 CharSequence.isNotEmpty() 知道调用isNotEmpty()函数其实默认传入了一个 CharSequence实例
    //那可以明白 PDFptint::println 这种调用其实是传入了两个参数,那这个函数类型就是: (pdFptint: PDFptint,any: Any) -> Unit
    val pdFptint= PDFptint::println //用个变量去接收，在前面类型也可以看出 DFptint::println 实质上是 (pdFptint: PDFptint,any: Any) -> Unit
    //然而 args.forEach() 传入的参数是一个(传入参是T，返回值是Unit)的Lambda表达式： (T) -> Unit
    //所以传入参数不符合 所以不行

    val pdf = PDFptint()::println
    //用 PDFptint的实例去调用println函数 可以看到 这个函数类型是：(any: Any) -> Unit
    //那这个样 PDFptint()::println  实例调用函数就符合forEach传入的函数表达式了
    args.forEach(PDFptint()::println) //这样就可以了


    val list = 1..5
    list.forEach(::println)

}

class PDFptint{
    fun println(any: Any){
        kotlin.io.println("PDFptint:$any")//调用kotlin函数的打印
    }
}

class Hello{
    fun world(){
        println("hello world")
    }
}

