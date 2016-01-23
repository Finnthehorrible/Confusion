package de.Finnthehorrible.github.confusion.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        event.setCancelled(true);
        Player p = event.getPlayer();
        String name = p.getDisplayName();
        String msg = event.getMessage();
        for(Player a : Bukkit.getOnlinePlayers()){
            if(p.hasPermission("rank.owner") || p.isOp()){
                a.sendMessage(ChatColor.DARK_RED + name + ChatColor.WHITE + msg);
            } else if(p.hasPermission("rank.owner") || p.isOp()){
                a.sendMessage(ChatColor.DARK_RED + name + ChatColor.WHITE + msg);
            } else if ( p.hasPermission("rank.admin") || p.isOp() ) {
                a.sendMessage(ChatColor.RED + name + ChatColor.WHITE + msg);
            } else if(p.hasPermission("rank.dev") || p.isOp()){
                a.sendMessage(ChatColor.DARK_BLUE + name + ChatColor.WHITE + msg);
            } else if ( p.hasPermission("rank.mod") || p.isOp() ) {
                a.sendMessage(ChatColor.BLUE + name + ChatColor.WHITE + msg);
            } else if(p.hasPermission("rank.premium") || p.isOp()){
                a.sendMessage(ChatColor.GOLD + name + ChatColor.WHITE + msg);
            } else {
                if ( p.hasPermission("rank.spieler") || p.isOp() ) {
                    a.sendMessage(ChatColor.GREEN + name + ChatColor.WHITE + msg);
                }
            }
        }
    }
}
