package com;

import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public class DeathLocations{
    Player deadPlayer;
    int XLocation;
    int YLocation;
    int ZLocation;

    public DeathLocations(Player deadPlayer, int x, int y, int z) {
        this.deadPlayer = deadPlayer;
        this.XLocation = x;
        this.YLocation = y;
        this.ZLocation = z;
    }

    public Player getDeadPlayer() {
        return deadPlayer;
    }

    public int getXLocation() {
        return XLocation;
    }

    public int getYLocation() {
        return YLocation;
    }

    public int getZLocation() {
        return ZLocation;
    }
}
