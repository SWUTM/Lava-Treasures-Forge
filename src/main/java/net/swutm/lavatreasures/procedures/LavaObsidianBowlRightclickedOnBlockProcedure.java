package net.swutm.lavatreasures.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.swutm.lavatreasures.init.LavaTreasuresModItems;

public class LavaObsidianBowlRightclickedOnBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(LavaTreasuresModItems.LAVA_OBSIDIAN_BOWL.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(LavaTreasuresModItems.LAVA_OBSIDIAN_BOWL_1.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
