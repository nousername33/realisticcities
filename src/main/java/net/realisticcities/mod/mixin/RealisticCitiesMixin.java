package net.realisticcities.mod.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.realisticcities.mod.RealisticCities;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class RealisticCitiesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		RealisticCities.LOGGER.info("RealisticCities loaded!");
	}
}
