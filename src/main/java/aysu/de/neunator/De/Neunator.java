package aysu.de.neunator.De;

import aysu.de.neunator.De.commands.Speed10;
import aysu.de.neunator.De.listeners.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Neunator extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("start").setExecutor(new Speed10());




        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
