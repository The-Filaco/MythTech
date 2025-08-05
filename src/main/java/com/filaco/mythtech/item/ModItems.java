package com.filaco.mythtech.item;

import com.filaco.mythtech.MythTech;
import com.filaco.mythtech.util.GetIdentifier;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static void register() {
        MythTech.LOGGER.info("MythTech is now loading items");
    };

    public static Item TESTER_ITEM = registerModItem(new Item.Settings(), "tester");



    private static Item registerModItem(Item.Settings itemSettings, String name) {
        Identifier id = GetIdentifier.getIdentifier(name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        Item.Settings settings = itemSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));

    }


}
