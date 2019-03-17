package com.direwolf20.buildinggadgets.api.template.building.tilesupport;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.registries.IForgeRegistryEntry;

public interface ITileDataSerializer extends IForgeRegistryEntry<ITileDataSerializer> {
    NBTTagCompound serialize(ITileEntityData data, boolean persisted);

    ITileEntityData deserialize(NBTTagCompound nbt, boolean persisted);
}
