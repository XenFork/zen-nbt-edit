package io.github.xenfork.zennbtedit.mixin;

import crafttweaker.mc1120.item.MCItemStack;
import io.github.xenfork.zennbtedit.impl.INBT;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MCItemStack.class)
public class MCItemStackMixin {
    private INBT zueNbt = null;
    @Inject(method = "<init>(Lnet/minecraft/item/ItemStack;)V", at = @At("RETURN"))
    private void init(ItemStack itemStack, CallbackInfo ci) {
        if (itemStack != null) {
            zueNbt = (INBT) itemStack.getTagCompound();
        }

    }
}
