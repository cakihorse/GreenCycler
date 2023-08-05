package fr.cakihorse.greencycler;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;



public class PickUpEvent implements Listener {
    private static Economy econ = null;
    @EventHandler
    public void OnDropItem(PlayerDropItemEvent e) {
        Player player = e.getPlayer();
        player.damage(1);
        Main.getInstance().retirerArgent(player, 5);
    }
    public static Economy getEconomy() {
        return econ;
    }
}
