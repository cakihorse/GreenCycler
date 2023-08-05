package fr.cakihorse.greencycler;

import fr.cakihorse.greencycler.enums.IsDisposable;
import fr.cakihorse.greencycler.enums.IsVegetable;
import fr.cakihorse.greencycler.enums.IsRecyclable;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TriGuiClickListener implements Listener {

    private static Economy econ = null;
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getHolder() instanceof TriGui) {
            // Empêche le joueur de déplacer l'item dans l'inventaire
            event.setCancelled(true);


            // Récupérez l'emplacement (slot) sur lequel le joueur a cliqué
            int slotClicked = event.getRawSlot();

            // Obtenez l'item sur lequel le joueur a cliqué
            ItemStack clickedItem = event.getCurrentItem();

            // Insérez ici le code pour gérer les actions du joueur en fonction des clics sur les éléments du GUI
            // Par exemple, vous pouvez vérifier si le joueur a cliqué sur la poubelle de tri jaune et exécuter l'action appropriée.
            Player player = (Player) event.getWhoClicked();
            Inventory inventory = player.getInventory();
            if (slotClicked == 5) {
                for (ItemStack item : inventory.getContents()) {
                    if (item != null) {
                        for (IsVegetable vegetable : IsVegetable.values()) {
                            if (item.getType() == vegetable.getMaterial()) {
                                // Retirez le bloc métallique de l'inventaire
                                inventory.removeItem(item);
                                Main.getInstance().ajouterArgent(player, 8);
                                break; // Sortez de la boucle pour ne pas retirer le même bloc plusieurs fois
                            }
                        }
                    }

                }

            }

            if (slotClicked == 4) {
                for (ItemStack item : inventory.getContents()) {
                    if (item != null) {
                        for (IsRecyclable metalBlock : IsRecyclable.values()) {
                            if (item.getType() == metalBlock.getMaterial()) {
                                // Retirez le bloc métallique de l'inventaire
                                inventory.removeItem(item);
                                Main.getInstance().ajouterArgent(player, 10);
                                break; // Sortez de la boucle pour ne pas retirer le même bloc plusieurs fois
                            }
                        }


                    }
                }
            }

            if (slotClicked == 3) {
                for (ItemStack item : inventory.getContents()) {
                    if (item != null) {
                        for (IsDisposable disposable : IsDisposable.values()) {
                            if (item.getType() == disposable.getMaterial()) {
                                // Retirez le bloc métallique de l'inventaire
                                inventory.removeItem(item);
                                Main.getInstance().ajouterArgent(player, 2);
                                break; // Sortez de la boucle pour ne pas retirer le même bloc plusieurs fois
                            }
                        }


                    }
                }
            }
        }
    }




}
