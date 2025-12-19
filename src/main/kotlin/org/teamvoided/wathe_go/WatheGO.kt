package org.teamvoided.wathe_go

import net.minecraft.resources.ResourceLocation
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Suppress("unused")
object WatheGO {
    const val MODID = "wathe_go"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(WatheGO::class.simpleName)

    fun init() {
        log.info("THIS PLACE IS A FUCKING SHITHOLE!")
        log.info("https://tenor.com/view/birmingham-brittish-brit-pov-sonder-gif-12430170985001984944")
    }

    fun id(namespace: String, path: String): ResourceLocation = ResourceLocation.fromNamespaceAndPath(namespace, path)
    fun mc(path: String): ResourceLocation = ResourceLocation.withDefaultNamespace(path)
    fun id(path: String) = id(MODID, path)
    fun wId(path: String) = id("wathe", path)
}
