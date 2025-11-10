package marcus.willowspath.item;

import marcus.willowspath.WillowsPath;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WillowsPath.MOD_ID,"steel_ingot")))));

    public static final Item RAW_COBALT = registerItem("raw_cobalt", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WillowsPath.MOD_ID,"raw_cobalt")))));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WillowsPath.MOD_ID,"cobalt_ingot")))));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WillowsPath.MOD_ID,"bronze_ingot")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(WillowsPath.MOD_ID, name), item);
    }

    public static void RegisterModItems(){
        WillowsPath.LOGGER.info("Adding Mod Items for" + WillowsPath.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_INGOT);
            fabricItemGroupEntries.add(COBALT_INGOT);
            fabricItemGroupEntries.add(RAW_COBALT);
            fabricItemGroupEntries.add(BRONZE_INGOT);
        });
    }
}
