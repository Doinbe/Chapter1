package net.println.kotlin.程序结构.循环语句

/**
 * for 循环语句
 */

fun main(args: Array<String>) {
//    args.forEach(::println)
    for (arg in args) {
        println(arg)
    }
    for ((index,value) in args.withIndex()){
        println("$index -> $value")
    }
    for (vale in args.withIndex()){
        println("${vale.index} -> ${vale.value}")
    }

    //使用包装的list进行for循环
    val list = MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)
    for (i in list){ // for循环的 in 就是 Iterator 的 hasNext()判断判断有没有下一个元素；next() 返回下一个元素
        println(i)
    }

}


//for 循环的实现原理 Iterator

//包装了下Iterator
class MyIterator(var iterator: Iterator<Int>){
    operator fun next(): Int{ //返回下一个元素
        return iterator.next()
    }
    operator fun hasNext(): Boolean{ //判断有没有下一个元素
        return iterator.hasNext()
    }
}
//包装了list
class MyIntList{
    val intArray = ArrayList<Int>()
    fun add(i: Int){
        intArray.add(i)
    }
    fun remove(i: Int){
        intArray.remove(i)
    }
    operator fun iterator(): MyIterator{
        return MyIterator(intArray.iterator())
    }

}