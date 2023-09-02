package io.github.xenfork.zennbtedit.mixin;

import crafttweaker.api.item.IItemStack;
import crafttweaker.mc1120.item.MCItemStack;
import io.github.xenfork.zennbtedit.impl.INBT;
import io.github.xenfork.zennbtedit.impl.TagGS;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Debug(export = true)
@Mixin(MCItemStack.class)
public class MCItemStackMixin implements TagGS {


    @Shadow(remap = false) @Final private ItemStack stack;
    @Mutable
    @Final
    private INBT zueNbt;
    @Inject(method = "<init>(Lnet/minecraft/item/ItemStack;)V", at = @At("RETURN"), remap = false)
    private void init(ItemStack itemStack, CallbackInfo ci) {
        if (itemStack != null) {
            zueNbt = (INBT) itemStack.getTagCompound();
        } else {
            zueNbt = null;
        }

    }
    @Override
    public INBT getNbt() {
        return (INBT) stack.getTagCompound();
//        ItemStack itemStack = CraftTweakerMC.getItemStack(stack);
//        return (INBT)itemStack.getTagCompound();
    }
    @Override
    public IItemStack setNbt(INBT nbt) {
        ItemStack result = stack.copy();
        result.setTagCompound(nbt);
        return new MCItemStack(result);
    }
}
