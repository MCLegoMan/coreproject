package com.mclegoman.coreproject.server;

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
import com.mclegoman.coreproject.common.registry.CoreProjectResources;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.api.ModInitializer;

public class CoreProjectServer implements ModInitializer {
    @Override
    public void onInitialize() {
        LegoLibStaticData.sendMessageToLog(CoreProjectStaticData.PREFIX, "info", "Initializing Server");
        CoreProjectStaticData.registerStaticData();
        CoreProjectResources.registerDatapacks();
    }
}
