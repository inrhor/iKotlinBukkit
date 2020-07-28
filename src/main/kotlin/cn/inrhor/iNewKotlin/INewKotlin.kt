package cn.inrhor.iNewKotlin

import cn.inrhor.iNewKotlin.utils.Logger
import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.loader.PluginRedefine
import io.izzel.taboolib.module.config.TConfig
import io.izzel.taboolib.module.inject.TInject
import io.izzel.taboolib.module.locale.logger.TLogger

@Plugin.Version(5.3) // 选择TabooLib版本
object INewKotlin : PluginRedefine() {

    @TInject
    lateinit var config: TConfig // config.yml 变量
        private set // 相当于final

    @TInject("goodBoy.yml") // 当然可以是指其它文件
    lateinit var other: TConfig // goodBoy.yml 变量
        private set

    @TInject
    lateinit var logger: TLogger // 输出
        private set

    override fun onStarting() {
        logger.info("Kotlin语言牛逼，大家一起来学"+Logger.getDouble(10));
        Logger.run()
    }
}