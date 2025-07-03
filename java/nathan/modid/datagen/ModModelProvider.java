package nathan.modid.datagen;

import nathan.modid.block.ModBlocks;
import nathan.modid.block.costum.PinkGarnetLampBlock;
import nathan.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);

            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

            pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
            pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);

            blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
            blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

            pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
            pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);

            pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);
            pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
            pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);


            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_GREEN_GARNET_BLOCK);
            BlockStateModelGenerator.BlockTexturePool greenGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_GARNET_BLOCK);

            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_GARNET_ORE);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_GARNET_DEEPSLATE_ORE);

            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);



        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PINK_GARNET_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_GARNET_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);

            itemModelGenerator.register(ModItems.GREEN_GARNET, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_GREEN_GARNET, Models.GENERATED);

            itemModelGenerator.register(ModItems.PINKCHISEL, Models.GENERATED);
            itemModelGenerator.register(ModItems.GREENCHISEL, Models.GENERATED);

            itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);

            itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);

            itemModelGenerator.register(ModItems.PINK_GARNET_POTION, Models.GENERATED);
            itemModelGenerator.register(ModItems.GREEN_GARNET_POTION, Models.GENERATED);
    }
}
