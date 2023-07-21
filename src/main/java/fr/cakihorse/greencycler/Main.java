package fr.cakihorse.greencycler;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Code exécuté lorsque le plugin est activé (chargé)
        System.out.println("GreenCycvle prêt");

        // Enregistrement des événements
        getServer().getPluginManager().registerEvents(new TriGuiClickListener(), this);

        // Enregistrement des commandes si vous en avez
        getCommand("tri").setExecutor(new VotreCommandeExecutor());
    }

    @Override
    public void onDisable() {
        // Code exécuté lorsque le plugin est désactivé (déchargé)
        System.out.println("GreenCycvle terminé !");
    }
}
