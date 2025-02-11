package com.meow.miao.registry;

import com.meow.miao.Miao;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Miao.MODID);

    public static final String SULFUR_DUST_ID = "miao_item";
    public static final DeferredHolder<Item, Item> Miao_Item;

    static {
        Miao_Item = ITEMS.register(SULFUR_DUST_ID,
                () -> new Item(new Item.Properties()));
    }
}
