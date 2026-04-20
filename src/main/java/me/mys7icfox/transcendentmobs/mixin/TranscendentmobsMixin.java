package me.mys7icfox.transcendentmobs.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class TranscendentmobsMixin {
    @Inject(at = @At("HEAD"), method = "loadWorld")
    private void loadWorld(CallbackInfo info) {
        // inject @ start of server load world
    }
}
