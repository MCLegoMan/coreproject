package com.mclegoman.coreproject.common.config;

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
import com.mclegoman.legolib.common.config.LegoLibConfigProvider;
import com.mclegoman.legolib.common.config.SimpleConfig;
import com.mojang.datafixers.util.Pair;

public class CoreProjectConfigs {
    public static SimpleConfig CONFIG;
    private static LegoLibConfigProvider configs;

    /** Creates new config file **/
    private static void createConfigs() {
        configs.addComment("CoreProject 2.0.0");
        configs.addComment("https://github.com/MCLegoMan/coreproject");
        configs.addLineBreak();
        configs.addComment("Author: Daniel-Tayden Larsen (MCLegoMan)");
        configs.addComment("License: MCLM-OSL (2022)");
        configs.addLineBreak();
        configs.addLineBreak();
        configs.addComment("IMPORTANT: Make sure you have formatted this config correctly!");
        configs.addLineBreak();
        configs.addKeyValuePair(new Pair<>("hideArmour", true));
        configs.addKeyValuePair(new Pair<>("connectButtons", false));
        configs.addKeyValuePair(new Pair<>("infoButton", false));
        configs.addKeyValuePair(new Pair<>("serverOne_Name", "Server One"));
        configs.addKeyValuePair(new Pair<>("serverOne_IP", "127.0.0.1:25565"));
        configs.addKeyValuePair(new Pair<>("serverTwo_Name", "Server Two"));
        configs.addKeyValuePair(new Pair<>("serverTwo_IP", "127.0.0.1:25566"));
    }

    /** Assign StaticData variables with data from config **/
    private static void assignConfigs() {
        CoreProjectStaticData.CONFIG_HIDEARMOUR = CONFIG.getOrDefault("hideArmour", true);
        CoreProjectStaticData.CONFIG_CONNECTBUTTONS = CONFIG.getOrDefault("connectButtons", false);
        CoreProjectStaticData.CONFIG_INFOBUTTON = CONFIG.getOrDefault("infoButton", false);
        CoreProjectStaticData.CONFIG_SERVERONE_NAME = CONFIG.getOrDefault("serverOne_Name", "Server One");
        CoreProjectStaticData.CONFIG_SERVERONE_IP = CONFIG.getOrDefault("serverOne_IP", "127.0.0.1:25565");
        CoreProjectStaticData.CONFIG_SERVERTWO_NAME = CONFIG.getOrDefault("serverTwo_Name", "Server Two");
        CoreProjectStaticData.CONFIG_SERVERTWO_IP = CONFIG.getOrDefault("serverTwo_IP", "127.0.0.1:25566");
    }

    /** Executes code that creates new config files and assigns StaticData variables. **/

    public static void registerConfigs() {
        LegoLibStaticData.sendMessageToLog(LegoLibStaticData.PREFIX, "registering", "Config Files");
        configs = new LegoLibConfigProvider();
        createConfigs();
        CONFIG = SimpleConfig.of(CoreProjectStaticData.ID + "_config").provider(configs).request();
        assignConfigs();
    }
}