package com;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player deadPlayer = event.getEntity();
        Location lastDeathLocation = deadPlayer.getLocation();
        int X = (int) lastDeathLocation.getX();
        int Y = (int) lastDeathLocation.getY();
        int Z = (int) lastDeathLocation.getZ();

        Timbuktu.getDeathLocationsArrayList().add(new DeathLocations(deadPlayer, X, Y, Z));

        deadPlayer.sendMessage("You ("+deadPlayer.getName()+") died at " + "X: " + X + "  Y: " + Y + "  Z: " + Z);
        System.out.println(deadPlayer.getName() + " died at " + "X: " + X + "  Y: " + Y + "  Z: " + Z);
    }
}
