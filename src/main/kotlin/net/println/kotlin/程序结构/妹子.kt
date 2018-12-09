package net.println.kotlin.程序结构

class 妹子(性格: String,长相: String,声音: String){
    fun 唱歌(歌名: String){
        println("妹子正在唱歌：$歌名")
    }
    fun 跳舞(舞蹈: String){
        println("妹子正在跳舞：$舞蹈")
    }
}

fun main(args: Array<String>) {
    val 某个妹子 = 妹子("温柔","甜美","动听")
    某个妹子.唱歌("再也遇不到这么好的人")
    某个妹子.跳舞("hiphop")
}