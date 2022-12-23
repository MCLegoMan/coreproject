package com.mclegoman.coreproject.client;

/*
 CoreProject 2.0.0
 https://github.com/MCLegoMan/coreproject

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreproject.client.registry.CoreProjectRegistryClient;
import com.mclegoman.coreproject.common.CoreProjectStaticData;
import com.mclegoman.coreproject.common.registry.CoreProjectResources;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.api.ClientModInitializer;

public class CoreProjectClient implements ClientModInitializer {
    private static Boolean ClientInit = false;

    @Override
    public void onInitializeClient() {
        LegoLibStaticData.sendMessageToLog(CoreProjectStaticData.PREFIX, "info", "Initializing Client");
        CoreProjectRegistryClient.register();
        CoreProjectResources.registerResourcePacks();
        ClientInit = true;
    }
}
