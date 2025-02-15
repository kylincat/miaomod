package com.meow.miao.datagen;

import com.meow.miao.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.meow.miao.Miao.resourceLocation;

public class ModBlockState extends BlockStateProvider {
    public ModBlockState(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.horizontalBlock(BlockRegistry.Miao_Block.get(), new ModelFile.UncheckedModelFile(resourceLocation("block/miao_block")));
    }
}
