package com.mclegoman.coreproject.common.util;

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
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.loader.api.FabricLoader;

public class CoreProjectLoader {
    public static Boolean isFabric;
    public static Boolean isQuilt;
    public static Boolean isOther;

    public static void detectLoader() {
        LegoLibStaticData.sendMessageToLog(CoreProjectStaticData.PREFIX, "info", "Detecting ModLoader...");
        if (FabricLoader.getInstance().getModContainer("quilt_loader").isPresent()){
            isQuilt = true;
            LegoLibStaticData.sendMessageToLog(CoreProjectStaticData.PREFIX, "info", "Detected ModLoader: Quilt");
        } else if (FabricLoader.getInstance().getModContainer("fabricloader").isPresent()){
            isFabric = true;
            LegoLibStaticData.sendMessageToLog(CoreProjectStaticData.PREFIX, "info", "Detected ModLoader: Fabric");
        } else {
            isOther = true;
            LegoLibStaticData.sendMessageToLog(CoreProjectStaticData.PREFIX, "info", "Detected ModLoader: Other");
        }
    }
}