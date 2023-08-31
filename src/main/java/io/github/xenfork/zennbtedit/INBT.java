package io.github.xenfork.zennbtedit;

import crafttweaker.annotations.ZenRegister;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import org.jetbrains.annotations.Nullable;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenGetter;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenSetter;

import java.util.Arrays;
import java.util.UUID;

@ZenClass("mods.zen.nbt.util.nbt")
@ZenRegister()
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
    @ZenMethod("getKeyTag")
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
    public void setTag(String key, IBase base) {
        setTag(key, (NBTBase) base);
    }
    @ZenGetter("tag")
    public IBase tag(String key) {
        return (IBase) getTag(key);
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
}
