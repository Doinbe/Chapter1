package net.println.kotlin.面向对象

//开车接口
interface Driver{
    fun driver()
}
//编写接口
interface Writer{
    fun writer()
}

//驾驶员
class CarDriver: Driver{
    override fun driver() {
        println("我会开车")
    }
}
//编写员
class PPTWriter: Writer{
    override fun writer() {
        println("我会编写PPT")
    }

}


//经理 需要自己实现 开车 和 编写 的接口，并实现其方法
class Manager:Driver,Writer{
    override fun driver() {

    }
    override fun writer() {

    }

}
//超级经理 给他配置 会开车驾驶员 和 会编写PPT的人员
//class SeniorManager(val driver: Driver,val writer: Writer):Driver,Writer{
//    override fun driver() {
//        driver.driver()
//    }
//    override fun writer() {
//        writer.writer()
//    }
//}
//在kotlin中以上可以简化成如下
//这种语法叫： 接口代理
class SeniorManager(val driver: Driver,val writer: Writer):Driver by driver,Writer by writer


fun main(args: Array<String>) {
    val carDriver = CarDriver()
    val pptWriter = PPTWriter()
    val seniorManager = SeniorManager(carDriver,pptWriter)
    seniorManager.driver()
    seniorManager.writer()
}

