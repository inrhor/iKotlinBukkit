package cn.inrhor.iNewKotlin.utils

import cn.inrhor.iNewKotlin.INewKotlin

/**
 *  基于对比教程而学习
 *  https://github.com/MindorksOpenSource/from-java-to-kotlin/blob/master/README-ZH.md
 */

object Logger {
     fun run() {
         INewKotlin.logger.info("大喊奥利给")
    }

    fun getDouble(x: Int): Int {
        return 2 * x
    }

    fun printSend() {
        print("输出$name \n")
        print("不换行的输出  ")
        println("还能这样输出$nameGet")
    }

    var name = "可变"
    val nameGet = "只读"
}

// null 声明
var other : String? = null

// 字符串拼接
val p = "卡"
val q = "哇"
val u = "伊"
val message = "U name is $p $q $u"

fun main() {

    Logger.printSend()
    println("$other")
    println("输出拼接 $message")

}

