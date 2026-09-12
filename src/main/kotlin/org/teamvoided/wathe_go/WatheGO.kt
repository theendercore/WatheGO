package org.teamvoided.wathe_go

import dev.doctor4t.wathe.index.WatheCosmetics.KNIFE_SKINS_MANAGER
import dev.doctor4t.wathe.index.WatheCosmetics.REVOLVER_SKINS_MANAGER
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.phys.Vec3
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

        newKnife("folly_stick", 0xff004f, "Folly Stick")
        newKnife("jolly_stick", 0xfbf5f5, "Jolly Stick")
        newKnife("sweet_tooth", 0xd6070f, "Sweet Tooth")
        newKnife("crystalline", 0x6f4fab, "Crystalline")
        newKnife("glass", 0x8bc1cd, "Glass Shard")
        newKnife("golden_shear", 0xe28634, "Golden Shear")
        newKnife("roze", 0x8c004d, "Roze")
        newKnife("makeshift", 0xd79635, "Makeshift")
        newKnife("missing_source", 0xff00ff, "Missing Source")
        newKnife("nail", 0x727272, "Nail")
        newKnife("cultist", 0xb92929, "Cultist")
        newKnife("starlight", 0x621c9c, "Starlight")
        newKnife("dart", 0xa62530, "Dart")
        newKnife("icicle", 0x70a4fc, "Icicle")
        newKnife("cosmic_stick", 0x1f1433, "Cosmic Stick")
        newKnife("injection", 0x31292a, "Injection")
        newKnife("stiletto", 0x9c1017, "Stiletto")
    }

    fun newKnife(name: String, color: Int, tooltipName: String) {
        KNIFE_SKINS_MANAGER.registerKnifeSkin(name, color, tooltipName)
    }

    fun newGun(name: String, color: Int, tooltipName: String, offest: Vec3? = null) {
        REVOLVER_SKINS_MANAGER.registerRevolverSkin(name, color, tooltipName, offest)
    }

    fun id(namespace: String, path: String): ResourceLocation = ResourceLocation.fromNamespaceAndPath(namespace, path)
    fun mc(path: String): ResourceLocation = ResourceLocation.withDefaultNamespace(path)
    fun id(path: String) = id(MODID, path)
    fun wId(path: String) = id("wathe", path)

}