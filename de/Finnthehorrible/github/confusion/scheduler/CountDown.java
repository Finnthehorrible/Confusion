package de.Finnthehorrible.github.confusion.scheduler;

import de.Finnthehorrible.github.confusion.Confusion;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitTask;

public class CountDown implements Runnable {
    private static String header = ChatColor.GOLD + "[" + ChatColor.YELLOW + "Labyrinth" + ChatColor.GOLD + "]";

    private int countDown;

    private BukkitTask bukkitTask;

    public CountDown(int seconds){
        countDown = seconds + 1;
    }
    @Override
    public void run() {
        countDown--;
        start();
        if(countDown > 30){
            Bukkit.broadcastMessage(header + ChatColor.GOLD + "Das Spiel startet in " + ChatColor.YELLOW + countDown + ChatColor.GOLD + "sekunden!");
            if(countDown > 0){
                Bukkit.broadcastMessage(header + ChatColor.GOLD + "Das Spiel startet!");
            } else {
                Bukkit.broadcastMessage(header + ChatColor.RED + "Das Spiel startet nicht, bitte melde diesen Bug im Forum, ein Entwickler wird sich kümmern!");
                stop();
            }
        }
    }
    public void start(){
        bukkitTask = Bukkit.getScheduler().runTaskTimer(Confusion.getInstance(), this, 0, 20);
    }
    public void stop(){
        stop();
    }
}

