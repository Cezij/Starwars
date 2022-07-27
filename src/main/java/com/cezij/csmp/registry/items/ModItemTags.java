package com.cezij.csmp.registry.items;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModItemTags {
    public static final TagKey<Item> BLASTER_FUEL = ModItemTags.of("blaster_fuel");



    private ModItemTags() {
    }

    private static TagKey<Item> of(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(id));
    }
}
