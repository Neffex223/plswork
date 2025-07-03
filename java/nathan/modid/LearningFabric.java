package nathan.modid;

import nathan.modid.block.ModBlocks;
import nathan.modid.component.ModDataComponentTypes;
import nathan.modid.item.ModItemGroups;
import nathan.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningFabric implements ModInitializer {
	public static final String MOD_ID = "learning-fabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);





	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);

	}
}