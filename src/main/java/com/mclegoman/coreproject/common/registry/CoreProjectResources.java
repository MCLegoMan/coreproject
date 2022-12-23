package com.mclegoman.coreproject.common.registry;

/*
 CoreProject 2.0.0
 https://github.com/MCLegoMan/coreproject

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreproject.common.CoreProjectStaticData;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CoreProjectResources {
    public static void registerResourcePacks() {
    }
    public static void registerDatapacks() {
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectStaticData.ID, "always_day_dp"), CoreProjectStaticData.CONTAINER, Text.translatable("pack.always_day.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectStaticData.ID, "always_night_dp"), CoreProjectStaticData.CONTAINER, Text.translatable("pack.always_night.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectStaticData.ID, "lives_three_dp"), CoreProjectStaticData.CONTAINER, Text.translatable("pack.lives_three.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectStaticData.ID, "lives_five_dp"), CoreProjectStaticData.CONTAINER, Text.translatable("pack.lives_five.data.title"), ResourcePackActivationType.NORMAL);
        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(CoreProjectStaticData.ID, "lives_ten_dp"), CoreProjectStaticData.CONTAINER, Text.translatable("pack.lives_ten.data.title"), ResourcePackActivationType.NORMAL);
    }
}
