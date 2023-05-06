
package net.swutm.lavatreasures.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.swutm.lavatreasures.procedures.LavaObsidianBowl1RightclickedOnBlockProcedure;

public class LavaObsidianBowl1Item extends Item {
	public LavaObsidianBowl1Item() {
		super(new Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		LavaObsidianBowl1RightclickedOnBlockProcedure.execute(context.getPlayer());
		return retval;
	}
}
