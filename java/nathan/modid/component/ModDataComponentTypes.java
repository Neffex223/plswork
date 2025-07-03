package nathan.modid.component;

import nathan.modid.LearningFabric;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {
        public static final ComponentType<BlockPos> COORDINATES =
                register("coordinates", builder -> builder.codec(BlockPos.CODEC));


    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> BuilderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(LearningFabric.MOD_ID, name),
                BuilderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        LearningFabric.LOGGER.info("registering data component types for " + LearningFabric.MOD_ID);
    }




}
