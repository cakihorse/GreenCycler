package fr.cakihorse.greencycler;

import fr.cakihorse.greencycler.enums.isMetal;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TriGuiClickListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getHolder() instanceof TriGui) {
            // Empêche le joueur de déplacer l'item dans l'inventaire
            event.setCancelled(true);

            // Insérez ici le code pour gérer les actions du joueur en fonction des clics sur les éléments du GUI
            // Par exemple, vous pouvez vérifier si le joueur a cliqué sur la poubelle de tri jaune et exécuter l'action appropriée.
            Player player = (Player) event.getWhoClicked();
            Inventory inventory = player.getInventory();
            for (ItemStack item : inventory.getContents()) {
                if (item != null) {
                    for (isMetal metalBlock : isMetal.values()) {
                        if (item.getType() == metalBlock.getMaterial()) {
                            // Retirez le bloc métallique de l'inventaire
                            inventory.removeItem(item);
                            break; // Sortez de la boucle pour ne pas retirer le même bloc plusieurs fois
                        }
                    }
                }
            }
        }
    }




}
