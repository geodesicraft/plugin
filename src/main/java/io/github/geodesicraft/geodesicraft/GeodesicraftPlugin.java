package io.github.geodesicraft.geodesicraft;

import org.bukkit.plugin.java.JavaPlugin;

public class GeodesicraftPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Geodesicraft has been enabled!");
        // Register event listeners or commands here
    }

    @Override
    public void onDisable() {
        getLogger().info("Geodesicraft has been disabled!");
    }

}