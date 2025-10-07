package io.github.geodesicraft.geodesicraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GeodesicCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("geodesic")) {
                sender.sendMessage("Geodesic command has been run!");
            return true;
        }
        return false;
    }
}