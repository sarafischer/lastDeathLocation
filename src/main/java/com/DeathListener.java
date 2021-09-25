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
        double X = lastDeathLocation.getX();
        double Y = lastDeathLocation.getY();
        double Z = lastDeathLocation.getZ();

        System.out.println(deadPlayer.getName() + " died at " + "X: " + X + "  Y: " + Y + "  Z: " + Z);
    }
}
