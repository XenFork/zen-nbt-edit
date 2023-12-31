package io.github.xenfork.zennbtedit.impl;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethod;

@SuppressWarnings("unused")
@ZenClass("mods.zennbtedit.tagGS")
@ZenExpansion("crafttweaker.item.IItemStack")
@ZenRegister
public interface TagGS {
    @ZenMethod("nbt")
    INBT getNbt();
    @ZenMethod("nbt")
    IItemStack setNbt(INBT nbt);
}
