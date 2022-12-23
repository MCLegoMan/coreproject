package com.mclegoman.coreproject.common.mixins;

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
import com.mclegoman.legolib.client.screen.LegoLibLongMessageScreen;
import com.mclegoman.legolib.common.LegoLibStaticData;
import net.minecraft.client.gui.screen.ConnectScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class CoreProjectTitleScreen extends Screen {
    protected CoreProjectTitleScreen(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "initWidgetsNormal")
    private void addConnectButtons(int y, int spacingY, CallbackInfo ci) {
        if (CoreProjectStaticData.CONFIG_CONNECTBUTTONS){
            ServerInfo serverOne = new ServerInfo(CoreProjectStaticData.CONFIG_SERVERONE_NAME, CoreProjectStaticData.CONFIG_SERVERONE_IP, false);
            ServerInfo serverTwo = new ServerInfo(CoreProjectStaticData.CONFIG_SERVERTWO_NAME, CoreProjectStaticData.CONFIG_SERVERTWO_IP, false);
            this.addDrawableChild(ButtonWidget.builder(Text.of(CoreProjectStaticData.CONFIG_SERVERONE_NAME), (button) -> {
                assert this.client != null;
                try {
                    ConnectScreen.connect(this, this.client, ServerAddress.parse(CoreProjectStaticData.CONFIG_SERVERONE_IP), serverOne);
                } catch (Exception e) {
                    LegoLibStaticData.sendErrorMessageToLog(CoreProjectStaticData.PREFIX, "unknown");
                }
            }).dimensions(this.width / 2 - 100, y - (spacingY), 98, 20).build());
            this.addDrawableChild(ButtonWidget.builder(Text.of(CoreProjectStaticData.CONFIG_SERVERTWO_NAME), (button) -> {
                assert this.client != null;
                try {
                    ConnectScreen.connect(this, this.client, ServerAddress.parse(CoreProjectStaticData.CONFIG_SERVERTWO_IP), serverTwo);
                } catch (Exception e) {
                    LegoLibStaticData.sendErrorMessageToLog(CoreProjectStaticData.PREFIX, "unknown");
                }
            }).dimensions(this.width / 2 + 2, y - (spacingY), 98, 20).build());
        } if (CoreProjectStaticData.CONFIG_INFOBUTTON) {
            if (CoreProjectStaticData.CONFIG_CONNECTBUTTONS) {
                this.addDrawableChild(ButtonWidget.builder(Text.of("ⓘ"), (button) -> {
                    assert this.client != null;
                    try {
                        this.client.setScreen(new LegoLibLongMessageScreen(this, Text.of(LegoLibStaticData.COREPROJECT_TITLE), Text.of(LegoLibStaticData.COREPROJECT_DESC)));
                    } catch (Exception e) {
                        LegoLibStaticData.sendErrorMessageToLog(CoreProjectStaticData.PREFIX, "unknown");
                    }
                }).dimensions(this.width / 2 + 104, y - (spacingY), 20, 20).build());
            } else {
                this.addDrawableChild(ButtonWidget.builder(Text.of("ⓘ"), (button) -> {
                    assert this.client != null;
                    try {
                        this.client.setScreen(new LegoLibLongMessageScreen(this, Text.of(LegoLibStaticData.COREPROJECT_TITLE), Text.of(LegoLibStaticData.COREPROJECT_DESC)));
                    } catch (Exception e) {
                        LegoLibStaticData.sendErrorMessageToLog(CoreProjectStaticData.PREFIX, "unknown");
                    }
                }).dimensions(this.width / 2 + 104, y, 20, 20).build());
            }
        }
    }
}
