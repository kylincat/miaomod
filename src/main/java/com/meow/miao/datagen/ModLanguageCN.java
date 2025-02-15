package com.meow.miao.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import com.meow.miao.registry.ItemRegistry;

public class ModLanguageCN extends LanguageProvider {
    public ModLanguageCN(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.miao", "喵");

        this.add(ItemRegistry.Miao_Item.get(), "喵物品");
        this.add(ItemRegistry.Miao_Block_Item.get(), "喵块");
    }
}