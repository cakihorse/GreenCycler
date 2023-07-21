package fr.cakihorse.greencycler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VotreCommandeExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (command.getName().equalsIgnoreCase("tri")) {
                openTriGui(player);
                return true;
            }
        }
        return false;
    }

    private void openTriGui(Player player) {
        TriGui triGui = new TriGui();
        player.openInventory(triGui.getInventory());
    }
}
