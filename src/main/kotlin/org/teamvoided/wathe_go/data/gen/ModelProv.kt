package org.teamvoided.wathe_go.data.gen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplate
import net.minecraft.data.models.model.TextureMapping
import net.minecraft.data.models.model.TextureSlot
import org.teamvoided.wathe_go.WatheGO.wId
import java.util.*

class ModelProv(o: FabricDataOutput) : FabricModelProvider(o) {

    override fun generateBlockStateModels(gen: BlockModelGenerators) = Unit

    override fun generateItemModels(gen: ItemModelGenerators) {
        listOf(
            "folly_stick",
            "jolly_stick",
            "sweet_tooth",
            "crystalline",
            "glass",
            "golden_shear",
            "roze",
            "makeshift",
            "missing_source",
            "nail",
            "cultist",
            "starlight",
            "dart",
            "icicle",
            "cosmic_stick",
            "injection",
            "stiletto"
        ).forEach { gen.knife(it) }

        listOf(
            "gay",
        ).forEach { gen.gun(it) }
    }

    fun ItemModelGenerators.knife(name: String) {
        val texture = TextureMapping().putForced(TextureSlot.LAYER0, wId("item/knife/$name"))
        TEMPLATE_KNIFE.create(wId("item/knife_${name}_in_hand"), texture, output)
        TEMPLATE_KNIFE.create(wId("item/knife_${name}"), texture, output)
    }

    fun ItemModelGenerators.gun(name: String) {
        val texture = TextureMapping().putForced(TextureSlot.LAYER0, wId("item/gun/$name"))
        TEMPLATE_PISTOL.create(wId("item/gun_${name}"), texture, output)
        TEMPLATE_PISTOL.create(wId("item/gun_${name}_in_hand"), texture, output)
    }

    companion object {

        val TEMPLATE_KNIFE = ModelTemplate(Optional.of(wId("item/template_knife")), Optional.empty())
        val TEMPLATE_PISTOL = ModelTemplate(Optional.of(wId("item/template_pistol")), Optional.empty())

    }
}