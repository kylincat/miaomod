package com.meow.miao.datagen;

import com.meow.miao.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageEN extends LanguageProvider {
    public ModLanguageEN(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup.miao", "MIAO");

        this.add(ItemRegistry.Miao_Item.get(), "MiaoItem");
        this.add(ItemRegistry.Miao_Block_Item.get(), "MiaoBlock");
    }
}
