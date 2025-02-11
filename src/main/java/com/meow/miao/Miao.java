package com.meow.miao;

import com.meow.miao.registry.*;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Miao.MODID)
public class Miao {
    public static final String MODID = "miao";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Miao(IEventBus modEventBus, ModContainer modContainer) {

        BlockRegistry.BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        GroupRegistry.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
