package nathan.modid.item;

import nathan.modid.LearningFabric;
import nathan.modid.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LearningFabric.MOD_ID, "garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.learning-fabric.garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.GREEN_GARNET);
                        entries.add(ModItems.RAW_GREEN_GARNET);

                        entries.add(ModItems.PINK_GARNET_POTION);
                        entries.add(ModItems.GREEN_GARNET_POTION);


                        entries.add(ModItems.PINKCHISEL);
                        entries.add(ModItems.GREENCHISEL);


                        }).build());
    public static final ItemGroup GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LearningFabric.MOD_ID, "garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.learning-fabric.garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_STAIRS);

                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);

                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);

                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

                        entries.add(ModBlocks.PINK_GARNET_LAMP);

                        entries.add(ModBlocks.MAGIC_BLOCK);

                        entries.add(ModBlocks.GREEN_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_GREEN_GARNET_BLOCK);
                        entries.add(ModBlocks.GREEN_GARNET_ORE);
                        entries.add(ModBlocks.GREEN_GARNET_DEEPSLATE_ORE);


                    }).build());


public static void registerItemGroups(){
    LearningFabric.LOGGER.info("Registering Item Groups for " + LearningFabric.MOD_ID);
}

}
