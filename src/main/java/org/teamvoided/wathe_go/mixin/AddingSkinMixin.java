package org.teamvoided.wathe_go.mixin;

import dev.doctor4t.wathe.item.KnifeItem;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(KnifeItem.Skin.class)
public class AddingSkinMixin {

    @Mutable
    @Shadow
    @Final
    private static KnifeItem.Skin[] $VALUES;

   
    @Inject(method = "<clinit>", at = @At("RETURN"))
    private static void clInit(CallbackInfo ci) {
        register("FOLLY_STICK", 0xff004f, "Folly Stick");
        register("JOLLY_STICK", 0xfbf5f5, "Jolly Stick");
        register("SWEET_TOOTH", 0xd6070f, "Sweet Tooth");
        register("CRYSTALLINE", 0x6f4fab, "Crystalline");
        register("GLASS", 0x8bc1cd, "Glass Shard");
        register("GOLDEN_SHEAR", 0xe28634, "Golden Shear");
        register("ROZE", 0x8c004d, "Roze");
        register("MAKESHIFT", 0xd79635, "Makeshift");
        register("MISSING_SOURCE", 0xff00ff, "Missing Source");
        register("NAIL", 0x727272, "Nail");
        register("CULTIST", 0xb92929, "Cultist");
        register("STARLIGHT", 0x621c9c, "Starlight");
        register("DART", 0xa62530, "Dart");
    }

    @Invoker("<init>")
    private static KnifeItem.Skin invokeInit(String name, int id, int id2, String typeName) {
        throw new AssertionError();
    }

    @SuppressWarnings({"UnusedReturnValue", "SequencedCollectionMethodCanBeUsed"})
    @Unique
    private static KnifeItem.Skin register(String name, int color, @Nullable String tooltipName) {
        ArrayList<KnifeItem.Skin> values = new ArrayList<>(Arrays.asList($VALUES));
        KnifeItem.Skin skin = invokeInit(name, values.get(values.size() - 1).ordinal() + 1, color, tooltipName);
        values.add(skin);
        $VALUES = values.toArray(new KnifeItem.Skin[]{});
        return skin;
    }
}
