package net.println.kotlin.面向对象

import java.lang.IllegalArgumentException

//创建 输入设备 接口
interface InputDevice{
    fun input(event: Any)
}
//创建 USB输入设备 接口
interface USBInputDevice: InputDevice
//创建 蓝牙输入设备 接口
interface BLEInputDevice: InputDevice

//创建 光电设备 接口
interface OpticaDevice{
    fun optica(event: Any)
}

//创建类 鼠标（具体的物品）
//一个类可以实现多个接口
//实现了输入设备接口，光电设备接口
//鼠标的品牌很多 这里可以把Mouse类写成抽象类  半成品
abstract class Mouse(var name: String): USBInputDevice, OpticaDevice{
    override fun optica(event: Any) {
        println("我是光电鼠标")
    }

    override fun input(event: Any) {
        println("我是支持 $event 的鼠标")
    }

    override fun toString(): String {
        return name
    }
}

//创建一个具体品牌的鼠标 苹果鼠标 成品
// AppleMouse(子类) 继承 Mouse(父类)
// AppleMouse(子类) 拥有 Mouse(父类) 所有特性
class AppleMouse: Mouse("苹果鼠标"){

}

//创建支持输入设备接口的电脑类
class Computer{
    fun addInputDevice(inputDevice: InputDevice){
        when(inputDevice){
            is USBInputDevice -> addUSBInputDevice(inputDevice)
            is BLEInputDevice -> addBLEInputDevice(inputDevice)
            else -> throw IllegalArgumentException("输入设备类型不支持")
        }
    }
    fun addUSBInputDevice(inputDevice: USBInputDevice){
        println("添加了USB输入设备：$inputDevice")
        inputDevice.input("USB协议")
    }
    fun addBLEInputDevice(inputDevice: BLEInputDevice){
        println("添加了蓝牙输入设备：$inputDevice")
        inputDevice.input("蓝牙协议")
    }
}

fun main(args: Array<String>) {
    val computer = Computer()
    val mouse = AppleMouse()
    computer.addInputDevice(mouse)
}

// 接口：好比是协议
// 类： 实现了协议的成品 能使用(能实例化使用)
// 抽象类：就是实现了一部分协议的半成品 不能直接使用(不能实例化使用)