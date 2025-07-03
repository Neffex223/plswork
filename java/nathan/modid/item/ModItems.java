package nathan.modid.item;

import nathan.modid.LearningFabric;
import nathan.modid.item.custom.GreenChiselItem;
import nathan.modid.item.custom.PinkChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PotionItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

        //pink garnet
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
        //green garnet
    public static final Item RAW_GREEN_GARNET = registerItem("raw_green_garnet", new Item(new Item.Settings()));
    public static final Item GREEN_GARNET = registerItem("green_garnet", new Item(new Item.Settings()));
        // potion / not potion
    public static final Item PINK_GARNET_POTION = registerItem("pink_garnet_potion", new HoneyBottleItem(new Item.Settings().food(ModFoodComponents.PINK_GARNET_POTION).maxCount(1)));
    public static final Item GREEN_GARNET_POTION = registerItem("green_garnet_potion", new HoneyBottleItem(new Item.Settings().food(ModFoodComponents.GREEN_GARNET_POTION).maxCount(1)));

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

        //food
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));
        //chisel
    public static final Item PINKCHISEL = registerItem("pink_chisel", new PinkChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item GREENCHISEL = registerItem("green_chisel", new GreenChiselItem(new Item.Settings().maxDamage(32)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(LearningFabric.MOD_ID, name), item);
    }


    public static void registerModItems(){
    LearningFabric.LOGGER.info("registering mod items for " + LearningFabric.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STARLIGHT_ASHES);
        });

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
        fabricItemGroupEntries.add(CAULIFLOWER);
    });


    }




}




