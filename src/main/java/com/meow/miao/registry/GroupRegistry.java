package com.meow.miao.registry;

import com.meow.miao.Miao;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GroupRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Miao.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> Miao_Mod = CREATIVE_MODE_TABS.register("miao", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.miao"))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> ItemRegistry.Miao_Item.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.Miao_Item);
                output.accept(ItemRegistry.Miao_Block_Item);
            }).build());
}