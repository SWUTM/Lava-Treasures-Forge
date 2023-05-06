
/*
 *    swutm note: This file will be REGENERATED on each build.
 */
package net.swutm.lavatreasures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.swutm.lavatreasures.item.ObsidianBowlItem;
import net.swutm.lavatreasures.item.LavaObsidianBowlItem;
import net.swutm.lavatreasures.item.LavaObsidianBowl2Item;
import net.swutm.lavatreasures.item.LavaObsidianBowl1Item;
import net.swutm.lavatreasures.item.FastObsidianBowlItem;
import net.swutm.lavatreasures.lavatreasures;

public class LavaTreasuresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, lavatreasures.MOD_ID);
	public static final RegistryObject<Item> OBSIDIAN_BOWL = REGISTRY.register("obsidian_bowl", () -> new ObsidianBowlItem());
	public static final RegistryObject<Item> LAVA_OBSIDIAN_BOWL = REGISTRY.register("lava_obsidian_bowl", () -> new LavaObsidianBowlItem());
	public static final RegistryObject<Item> LAVA_OBSIDIAN_BOWL_1 = REGISTRY.register("lava_obsidian_bowl_1", () -> new LavaObsidianBowl1Item());
	public static final RegistryObject<Item> LAVA_OBSIDIAN_BOWL_2 = REGISTRY.register("lava_obsidian_bowl_2", () -> new LavaObsidianBowl2Item());
	public static final RegistryObject<Item> FAST_OBSIDIAN_BOWL = REGISTRY.register("fast_obsidian_bowl", () -> new FastObsidianBowlItem());
}
