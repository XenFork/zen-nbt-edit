package io.github.xenfork.zennbtedit;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
@ZenClass("mods.zen.nbt.edit.mc")
@ZenRegister
public class MC {
    @ZenMethod
    public static INBT getNbt(IItemStack stack) {
        ItemStack itemStack = CraftTweakerMC.getItemStack(stack);
        return (INBT)itemStack.getTagCompound();
    }

    @ZenMethod
    public static IItemStack setNbt(IItemStack stack,INBT nbt) {
        ItemStack itemStack = CraftTweakerMC.getItemStack(stack);
        itemStack.setTagCompound(nbt);
        return CraftTweakerMC.getIItemStack(itemStack);
    }
}
