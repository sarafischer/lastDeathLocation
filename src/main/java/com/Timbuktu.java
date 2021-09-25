package com;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.SQLOutput;

public final class Timbuktu extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Last Death location Plugin loading");
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
