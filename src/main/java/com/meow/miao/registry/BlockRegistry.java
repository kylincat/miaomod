package com.meow.miao.registry;

import com.meow.miao.Miao;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Miao.MODID);
    public static final DeferredHolder<Block,Block> Miao_Block;
    static {
        Miao_Block = BLOCKS.register("miao_block",
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(2F, 1.5F)));
    }
}
