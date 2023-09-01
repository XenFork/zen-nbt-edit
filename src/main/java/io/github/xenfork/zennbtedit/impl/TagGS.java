package io.github.xenfork.zennbtedit.impl;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import net.minecraft.item.ItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenMethod;

@SuppressWarnings("unused")
@ZenClass("mods.zennbtedit.TagGS")
@ZenRegister
public class TagGS {
    @ZenMethod("nbt")
    public static INBT getNbt(IItemStack stack) {
        ItemStack itemStack = CraftTweakerMC.getItemStack(stack);
        return (INBT)itemStack.getTagCompound();
    }
    @ZenMethod("nbt")
    public static IItemStack setNbt(IItemStack stack, INBT nbt) {
        ItemStack itemStack = CraftTweakerMC.getItemStack(stack);
        itemStack.setTagCompound(nbt);
        stack = CraftTweakerMC.getIItemStack(itemStack);
        return stack;
    }
}
