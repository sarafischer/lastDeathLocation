package com;

import com.commands.LastDeathLocation;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Timbuktu extends JavaPlugin {

    private static ArrayList<DeathLocations> deathLocationsArrayList = new ArrayList<>();

    private static Timbuktu instance;

    public static ArrayList<DeathLocations> getDeathLocationsArrayList() {
        return deathLocationsArrayList;
    }

    public static Timbuktu getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Last Death location Plugin loading");
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
        getCommand("lastDeathLocation").setExecutor(new LastDeathLocation());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
