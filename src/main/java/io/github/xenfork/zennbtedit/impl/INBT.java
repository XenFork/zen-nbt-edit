package io.github.xenfork.zennbtedit.impl;

import crafttweaker.annotations.ZenRegister;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import org.jetbrains.annotations.Nullable;
import stanhebben.zenscript.annotations.*;

import java.util.Arrays;
import java.util.UUID;

@SuppressWarnings("unused")
@ZenClass("mods.zennbtedit.nbt")
@ZenRegister
public class INBT extends NBTTagCompound {
    @ZenMethod("info")
    public void info(String message) {
        LOGGER.info(message);
    }
    @ZenMethod("warn")
    public void warn(String message) {
        LOGGER.warn(message);

    }
    @ZenMethod("debug")
    public void debug(String message) {
        LOGGER.debug(message);
    }
    @ZenMethod("keys")
    public String[] keySet() {
        return getKeySet().toArray(new String[0]);
    }
    @ZenGetter("keyTag")
    public String[] getKeyTag() {
        String[] strings = Arrays.copyOf(keySet(), keySet().length);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i] + "-->" + getTag(strings[i]);
        }
        return strings;
    }

    @ZenGetter
    public int size() {
        return this.getSize();
    }

    @ZenGetter
    public int id() {
        return this.getId();
    }

    @ZenMethod("setString")
    public void putString(String key, String value) {
        this.setString(key, value);
    }

    @ZenGetter("asString")
    public String string(String key) {
        return this.getString(key);
    }
    @ZenMethod("tag")
    public void setTag(String key, Base base) {
        setTag(key, (NBTBase) base);
    }
    @ZenGetter("tag")
    public Base tag(String key) {
        return (Base) getTag(key);
    }

    @ZenMethod("setByte")
    public void byte_(String key, byte value) {
        super.setByte(key, value);
    }

    @ZenGetter("asByte")
    public byte byte_(String key) {
        return super.getByte(key);
    }

    @ZenMethod("setShort")
    public void short_(String key, short value) {
        super.setShort(key, value);
    }
    @ZenGetter("asShort")
    public short short_(String key) {
        return super.getShort(key);
    }
    @ZenMethod("setInt")
    public void int_(String key, int value) {
        super.setInteger(key, value);
    }
    @ZenGetter("asInt")
    public int int_(String key) {
        return super.getInteger(key);
    }
    @ZenMethod("setLong")
    public void long_(String key, long value) {
        super.setLong(key, value);
    }
    @ZenGetter("asLong")
    public long long_(String key) {
        return super.getLong(key);
    }

    @ZenMethod("uuid")
    public void uuid(String key, UUID value) {
        super.setUniqueId(key, value);
    }

    @Nullable
    @ZenGetter("uuid")
    public UUID uuid(String key) {
        return super.getUniqueId(key);
    }

    @ZenGetter("hasUuid")
    public boolean hasUuid(String key) {
        return super.hasUniqueId(key);
    }

    @ZenMethod("setFloat")
    public void float_(String key, float value) {
        super.setFloat(key, value);
    }

    @ZenGetter("asFloat")
    public float float_(String key) {
        return super.getFloat(key);
    }

    @ZenMethod("setBool")
    public void bool(String key, boolean value) {
        super.setBoolean(key, value);
    }

    @ZenGetter("asBool")
    public boolean bool(String key) {
        return super.getBoolean(key);
    }

    @ZenMethod("setDouble")
    public void double_(String key, double value) {
        super.setDouble(key, value);
    }

    @ZenGetter("asDouble")
    public double double_(String key) {
        return super.getDouble(key);
    }

    @ZenMethod("byteArray")
    public void byteArray(String key, byte[] value) {
        super.setByteArray(key, value);
    }

    @ZenGetter("byteArray")
    public byte[] byteArray(String key) {
        return super.getByteArray(key);
    }

    @ZenMethod("byteArray")
    public void intArray(String key, int[] value) {
        super.setIntArray(key, value);
    }

    @ZenGetter("byteArray")
    public int[] intArray(String key) {
        return super.getIntArray(key);
    }

    @ZenGetter("nbt")
    public INBT nbt(String key) {
        return (INBT) super.getCompoundTag(key);
    }
    @ZenMethod("remove")

    public void remove(String key) {
        super.removeTag(key);
    }
    @ZenGetter("copy")
    public INBT copy_() {
        return (INBT) super.copy();
    }
    @ZenOperator(value = OperatorType.EQUALS)
    public boolean is(Object o) {
        return super.equals(o);
    }

    @ZenOperator(OperatorType.ADD)
    public void merge_(INBT other) {
        super.merge(other);
    }
}
