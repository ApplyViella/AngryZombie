package ru.belyimedved;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ru.belyimedved.listeners.ZombieSpawnEvent;

public final class Beber0task extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ZombieSpawnEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
