package net.println.kotlin.面向对象

//密封类  在java中没有这个
//密封类的子类是有限的 可数的

//例如 一个播放器
sealed class PlayerCmd{
    //怎么体现他的子类是有限的呢？
    /**
     * 在 version 1.1 版本之前 sealed class 密封类的子类只能定义在 它的内部。
     * 在 version 1.1 版本之后 sealed class 密封类的子类不仅可以定义在它的内部，还可以定义在同一个 文件中(同一个File)
     */

    //播放命令
    class Play(var url: String,var position: Long): PlayerCmd()
    //快进命令
    class Seek(var position: Long): PlayerCmd()
    //暂停命令
    object Pause : PlayerCmd()
    //继续播放命令
    object Resume: PlayerCmd()
    //停止命令
    object Stop: PlayerCmd()

    // 像以上 这种指令的 有的需要参数，就要用 sealed class 密封类
}

//播放状态  像这个样的状态 不需要任何的参数，只要一个实例就可以表达它的意思。  这种场景就比较适合用 枚举
enum class PlayerState{
    //状态也是可数的，有限的
    IDEA,PAUSE,PLAYING
}

/**
 * 在 version 1.1 版本之后 sealed class 密封类的子类不仅可以定义在它的内部，还可以定义在同一个 文件中(同一个File)
 * 如下...
 */
//class Play(var url: String,var position: Long): PlayerCmd()
//class Seek(var position: Long): PlayerCmd()
//object Pause : PlayerCmd()
//object Resume: PlayerCmd()
//object Stop: PlayerCmd()