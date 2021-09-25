package com.commands;

import com.DeathLocations;
import com.Timbuktu;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class LastDeathLocation implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cOnly players can use this command."));
            return true;
        }
        Player player = (Player) commandSender;
        ArrayList<DeathLocations> deathList = Timbuktu.getDeathLocationsArrayList();
        if (deathList.size() > 0) {
            int counter = 0;
            for (DeathLocations dl : deathList) {
                DeathLocations temp = dl;
                if (player.getName().equals(temp.getDeadPlayer().getName())) {
                    counter++;
                    player.sendMessage("You (" + player.getName() + ") died at: X: " + temp.getXLocation() + " Y: " + temp.getYLocation() + " Z: " + temp.getZLocation() + "   death count: " + counter);
                }
            }
            return true;
        }
        commandSender.sendMessage("No deaths since last server restart");
        return true;

    }
}
