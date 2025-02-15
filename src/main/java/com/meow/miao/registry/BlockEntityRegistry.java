package com.meow.miao.registry;

import com.meow.miao.Miao;
import com.meow.miao.client.blockEntiy.MiaoBlockTE;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockEntityRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Miao.MODID);
    public static final Supplier<BlockEntityType<MiaoBlockTE>> MIAO_BLOCK = BLOCK_ENTITY_TYPES.register("miao_block", () -> BlockEntityType.Builder.of(MiaoBlockTE::new, BlockRegistry.Miao_Block.value()).build(null));
}
