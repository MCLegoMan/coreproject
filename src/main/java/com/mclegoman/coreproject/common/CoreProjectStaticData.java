package com.mclegoman.coreproject.common;

/*
 CoreProject 2.0.0
 https://github.com/MCLegoMan/coreproject

 Author: Daniel-Tayden Larsen (MCLegoMan)
 License: MCLM-OSL (2022)

 IMPORTANT:
 This notice must not be removed.
 When modifying this code, you must add a note stating that you modified it.
 */

import com.mclegoman.coreproject.common.config.CoreProjectConfigs;
import com.mclegoman.coreproject.common.util.CoreProjectLoader;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public class CoreProjectStaticData {
    public static final String ID = "coreproject";
    public static final String VERSION = "2.0.0";
    public static final String NAME = "Core Project";
    public static final String PREFIX = "[" + NAME + " " + VERSION + "] ";
    public static final ModContainer CONTAINER = FabricLoader.getInstance().getModContainer(ID).get();
    public static Boolean CONFIG_HIDEARMOUR;
    public static Boolean CONFIG_CONNECTBUTTONS;
    public static Boolean CONFIG_INFOBUTTON;
    public static String CONFIG_SERVERONE_NAME;
    public static String CONFIG_SERVERONE_IP;
    public static String CONFIG_SERVERTWO_NAME;
    public static String CONFIG_SERVERTWO_IP;

    public static void registerStaticData(){
        LegoLibStaticData.sendMessageToLog(PREFIX, "registering", "Static Data");
        CoreProjectConfigs.registerConfigs();
        CoreProjectLoader.detectLoader();
    }
}