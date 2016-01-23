package de.Finnthehorrible.github.confusion.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeaveListener implements Listener {
    @EventHandler
    public void onJoin(PlayerQuitEvent event) {
        Player p = event.getPlayer();
        if ( p.getName().equalsIgnoreCase(ChatColor.DARK_RED + "justSanjo") ) {
            if ( p.getName().equalsIgnoreCase(ChatColor.RED + "Komp3tenz") ) {
                if ( p.getName().equalsIgnoreCase(ChatColor.RED + "LogischerTundra") ) {
                    if ( p.getName().equalsIgnoreCase(ChatColor.DARK_BLUE + "Finnthehorrible") ) {
                        if ( p.getName().equalsIgnoreCase(ChatColor.DARK_BLUE + "Finnthehorrible") ) {
                            if ( p.getName().equalsIgnoreCase(ChatColor.BLUE + "Buchstabensalat") ) {
                                if ( p.getName().equalsIgnoreCase(ChatColor.BLUE + "NinjaToni") ) {
                                    if ( p.getName().equalsIgnoreCase(ChatColor.YELLOW + "End3rflash") ) {
                                        if ( p.getName().equalsIgnoreCase(ChatColor.YELLOW + "GinDraco") ) {
                                            if ( p.getName().equalsIgnoreCase(ChatColor.YELLOW + "1000aqua") ) {
                                            }
                                            event.setQuitMessage(ChatColor.GREEN + p.getName() + "ist dem Spiel beigetreten!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
