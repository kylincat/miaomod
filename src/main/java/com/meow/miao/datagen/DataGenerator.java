package com.meow.miao.datagen;

import com.meow.miao.Miao;
import net.minecraft.data.DataProvider;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Miao.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var efh = event.getExistingFileHelper();
        var generator = event.getGenerator();

        //Language
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<ModLanguageEN>) pOutput -> new ModLanguageEN(pOutput, Miao.MODID, "en_us"));
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<ModLanguageCN>) pOutput -> new ModLanguageCN(pOutput, Miao.MODID, "zh_cn"));
        //ItemModel
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<ModItem>) pOutput -> new ModItem(pOutput, Miao.MODID, efh));
        //BlockState
        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<ModBlockState>) pOutput -> new ModBlockState(pOutput, Miao.MODID, efh)
        );
    }
}