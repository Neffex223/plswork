package nathan.modid.item.custom;

import nathan.modid.component.ModDataComponentTypes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class GreenChiselItem extends Item {
    private static final Map<Block, Block > GREENCHISEL_MAP =
            Map.of(
                    Blocks.CLAY, Blocks.BRICKS,
                    Blocks.COBBLESTONE, Blocks.STONE,
                    Blocks.NETHERRACK, Blocks.NETHER_BRICKS,
                    Blocks.COBBLED_DEEPSLATE, Blocks.DEEPSLATE

            );

    public GreenChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(GREENCHISEL_MAP.containsKey(clickedBlock)) {
            if(!world.isClient) {
                world.setBlockState(context.getBlockPos(), GREENCHISEL_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));


                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);
            context.getStack().set(ModDataComponentTypes.COORDINATES, context.getBlockPos());
            }

        }




            return ActionResult.SUCCESS;



    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.learning-fabric.green_chisel.shift_down"));
            tooltip.add(Text.translatable("tooltip.learning-fabric.green_chisel.shift_down1"));
            tooltip.add(Text.translatable("tooltip.learning-fabric.green_chisel.shift_down2"));
        } else {
            tooltip.add(Text.translatable("tooltip.learning-fabric.green_chisel"));
            tooltip.add(Text.translatable("tooltip.learning-fabric.green_chisel1"));

        }

        if (stack.get(ModDataComponentTypes.COORDINATES) != null) {
            tooltip.add(Text.literal("last changed block at " + stack.get(ModDataComponentTypes.COORDINATES)));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
