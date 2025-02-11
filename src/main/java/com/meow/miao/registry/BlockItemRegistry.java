package com.meow.miao.registry;

import com.meow.miao.Miao;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.meow.miao.registry.BlockRegistry.*;

public class BlockItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Miao.MODID);
    public static final DeferredHolder<Item, BlockItem> Miao_Block_Item;
    static {
        Miao_Block_Item = ITEMS.register("miao_block_item",
                () -> new BlockItem(Miao_Block.get(), new Item.Properties()));
    }
}
