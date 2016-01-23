package de.Finnthehorrible.github.confusion;

import de.Finnthehorrible.github.confusion.listener.AsyncPlayerChatListener;
import de.Finnthehorrible.github.confusion.listener.PlayerJoinListener;
import de.Finnthehorrible.github.confusion.listener.PlayerLeaveListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Confusion extends JavaPlugin {
    @Override
    public void onEnable(){
        instance = this;
    }
    @SuppressWarnings("unused")
    private void registerListener(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new AsyncPlayerChatListener(), this);
        pluginManager.registerEvents(new PlayerJoinListener(), this);
        pluginManager.registerEvents(new PlayerLeaveListener(), this);

    }
    @Override
    public void onDisable(){

    }
    private static Confusion instance;

    public static Confusion getInstance() {
        return instance;
    }
}
