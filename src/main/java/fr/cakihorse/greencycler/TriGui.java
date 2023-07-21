package fr.cakihorse.greencycler;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class TriGui implements InventoryHolder {
    private Inventory inventory;

    public TriGui() {
        // Créez l'inventaire du GUI avec 9 emplacements (1 rangée)
        inventory = Bukkit.createInventory(this, 9, "Poubelle de Tri Jaune");
        // Remplissez l'inventaire avec les éléments souhaités, y compris la poubelle de tri jaune
        // Vous pouvez utiliser ItemStacks personnalisés ici pour représenter la poubelle de tri jaune
        inventory.setItem(4, createYellowTrashItem()); // Exemple : Place la poubelle de tri jaune au milieu de l'inventaire
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    // Méthode pour créer un ItemStack personnalisé pour la poubelle de tri jaune
    private ItemStack createYellowTrashItem() {
        // Créez un nouvel ItemStack en fonction de votre choix (voir les APIs de Bukkit/Spigot)
        return new ItemStack(Material.YELLOW_FLOWER);
    }

    // Ajoutez des méthodes supplémentaires pour gérer les clics sur les éléments du GUI si nécessaire
}
