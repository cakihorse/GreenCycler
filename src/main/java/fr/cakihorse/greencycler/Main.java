//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fr.cakihorse.greencycler;

import fr.cakihorse.greencycler.PickUpEvent;
import fr.cakihorse.greencycler.TriGuiClickListener;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public Economy economy;
    private static Main instance;

    public Main() {
    }

    public static Main getInstance() {
        return instance;
    }

    public void onEnable() {
        instance = this;
        RegisteredServiceProvider<Economy> rsp = this.getServer().getServicesManager().getRegistration(Economy.class);
        this.economy = (Economy)rsp.getProvider();
        super.onEnable();
        this.getServer().getPluginManager().registerEvents(new TriGuiClickListener(), this);
        this.getServer().getPluginManager().registerEvents(new PickUpEvent(), this);
        getCommand("tri").setExecutor(new VotreCommandeExecutor());
    }

    public void ajouterArgent(Player joueur, double montant) {
        EconomyResponse r = this.economy.depositPlayer(joueur, montant);
        if (r.transactionSuccess()) {
            joueur.sendMessage("Vous avez reÃ§u " + this.economy.format(montant) + ".");
        } else {
            joueur.sendMessage("Une erreur est survenue: " + r.errorMessage);
        }

    }

    public void retirerArgent(Player joueur, double montant) {
        EconomyResponse r = this.economy.withdrawPlayer(joueur, montant);
        if (r.transactionSuccess()) {
            joueur.sendMessage("Vous avez perdu " + this.economy.format(montant) + ".");
        } else {
            joueur.sendMessage("Une erreur est survenue: " + r.errorMessage);
        }

    }

    public boolean setUpEconomy() {
        RegisteredServiceProvider<Economy> eco = this.getServer().getServicesManager().getRegistration(Economy.class);
        if (eco != null) {
            this.economy = (Economy)eco.getProvider();
        }

        return this.economy != null;
    }

    public void onDisable() {
        super.onDisable();
    }
}
