
package net.mcreator.exnihilonatureminerals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.exnihilonatureminerals.ExnihilonaturemineralsModElements;

@ExnihilonaturemineralsModElements.ModElement.Tag
public class ChunkAstriteItem extends ExnihilonaturemineralsModElements.ModElement {
	@ObjectHolder("exnihilonatureminerals:chunk_astrite")
	public static final Item block = null;

	public ChunkAstriteItem(ExnihilonaturemineralsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("chunk_astrite");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
