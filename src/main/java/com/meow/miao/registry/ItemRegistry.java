package com.meow.miao.registry;

import com.meow.miao.Miao;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Miao.MODID);
    public static final DeferredItem<Item> Miao_Item = ITEMS.register("miao_item", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Miao_Block_Item = ITEMS.register("miao_block_item", () -> new BlockItem(BlockRegistry.Miao_Block.get(), new Item.Properties()));
}
