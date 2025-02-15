package com.meow.miao.datagen;

import com.meow.miao.registry.ItemRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


import java.util.Objects;

import static com.meow.miao.Miao.resourceLocation;


public class ModItem extends ItemModelProvider {
    public ModItem(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.basicItem(ItemRegistry.Miao_Item.get());
        this.basicItem(ItemRegistry.Miao_Block_Item.get());
    }

    public void blockItem(Item item, String path) {
        blockItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)), path);
    }

    public void blockItem(ResourceLocation item, String path) {
        getBuilder(item.toString())
                .transforms()
                .transform(ItemDisplayContext.GUI).rotation(30, 45, 0).scale(0.6F, 0.6F, 0.6F).end()
                .transform(ItemDisplayContext.GROUND).scale(0.23F, 0.25F, 0.25F).end()
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND).rotation(0, 45, 0).translation(0, 0, -8).end()
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND).rotation(0, 45, 0).translation(0, 0, -8).end()
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND).rotation(75, 135, 0).scale(0.4F, 0.4F, 0.4F).translation(0, 0, 0).end()
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND).rotation(75, 135, 0).scale(0.4F, 0.4F, 0.4F).translation(0, 0, 0).end()
                .end()
                .parent(new ModelFile.UncheckedModelFile(resourceLocation(path)));
    }

    public ItemModelBuilder localItem(Item item, String filePath) {
        return localItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)),filePath);
    }

    public ItemModelBuilder localItem(ResourceLocation item, String filePath) {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), "item/" + filePath + item.getPath()));
    }
}
