package com.pixelfoundries.pixelplots;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import ninja.leaping.configurate.objectmapping.GuiceObjectMapperFactory;
import com.pixelfoundries.pixelplots.config.*;
import com.pixelfoundries.pixelplots.utils.*;
import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.GameReloadEvent;
import org.spongepowered.api.event.game.state.GamePostInitializationEvent;
import org.spongepowered.api.event.game.state.GameStoppingEvent;
import org.spongepowered.api.plugin.Plugin;

import java.io.File;
import java.util.*;

/**
 * Created by Caelin on 7/22/18.
 */

@Plugin(name = "PixelPlots",
        id = "pixelplots-sponge",
        authors = { "Caelin" })
public class PixelPlots {

    public static Logger logger;
    public static PixelPlots instance = null;
//    public static List<UUID> playersBusy = Lists.newArrayList();
//    public static Map<UUID, Quest> runningQuests = Maps.newHashMap();

//    private ConfigManager<TriggersCategory> triggersConfig;
//    private ConfigManager<ConfigCategory> mainConfig;
//    private ConfigManager<DatabaseCategory> db;

    @Inject
    @ConfigDir(sharedRoot = false)
    public File configDir;

    @Inject
    public GuiceObjectMapperFactory factory;

    @Inject
    public PixelPlots(Logger l) {
        logger = l;
    }

//    public static ConfigCategory getConfig() {
//        return instance.mainConfig.getConfig();
//    }
//
//    public static TriggersCategory getTriggers() {
//        return instance.triggersConfig.getConfig();
//    }

    @Listener
    public void onInit(GamePostInitializationEvent e) {
        instance = this;
//        this.triggersConfig = new ConfigManager<>(new TriggersCategory(), "Triggers.conf", true).load();
//        this.mainConfig = new ConfigManager<>(new ConfigCategory(), "PBQ.conf", false).load();
//        this.db = new ConfigManager<>(new DatabaseCategory(), "Storage.conf", true).load();

        logger.warn("PixelPlots is starting!");
//        Command.registerCommand();
//        Sponge.getEventManager().registerListeners(this, new Listeners());
//        Sponge.getEventManager().registerListeners(this, new ChatUtils());
    }

//    @Listener
//    public void onStop(GameStoppingEvent e) {
//        this.triggersConfig.cancelTask();
//    }
//
//    @Listener
//    public void onReload(GameReloadEvent e) {
//        this.mainConfig.load();
//    }
//
//    public static DatabaseCategory getDatabase() {
//        return instance.db.getConfig();
//    }

}
