package com.meow.miao.registry;

import com.meow.miao.Miao;
import com.meow.miao.client.block.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Miao.MODID);
    public static final DeferredBlock<Block> Miao_Block = BLOCKS.register("miao_block", MiaoBlock::new);
}
