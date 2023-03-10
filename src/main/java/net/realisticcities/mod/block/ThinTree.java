package net.realisticcities.mod.block;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.FenceBlock;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

public class ThinTree extends FenceBlock {
    public ThinTree(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, @Nullable BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("This block acts as a fence for now, sorry ;-;").formatted(Formatting.GRAY));
        }
        else {
            tooltip.add(Text.translatable("Hold SHIFT for more info!").formatted(Formatting.GOLD));
        }

        super.appendTooltip(itemStack, world, tooltip, tooltipContext);
    }
}

