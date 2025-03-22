package com.vkv.tfcc.mixin;

import net.dries007.tfc.config.ServerConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ServerConfig.class)
public class TFCConfigMixin {
    @ModifyArg(method = "<init>(Lnet/dries007/tfc/config/ConfigBuilder;)V", at = @At(value = "INVOKE",
            target = "Lnet/dries007/tfc/config/ConfigBuilder;define(Ljava/lang/String;Z)Lnet/minecraftforge/common/ForgeConfigSpec$BooleanValue;"), index = 1)
    private boolean yes(boolean value) {
        return true;
    }
}
