package io.github.geodesicraft.geodesicraft;

import org.bukkit.plugin.java.JavaPlugin;

public class GeodesicraftPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Geodesicraft has been enabled!");
        getCommand("geodesic").setExecutor(new GeodesicCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Geodesicraft has been disabled!");
    }

}