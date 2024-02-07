package org.examplecock.gatssword;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;


public final class Gatssword extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("giveItem").setExecutor(new Items());

    }

    public class Items implements CommandExecutor {

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("Only players can use this command!");

                return true;
            }

            Player player = (Player) sender;
            ItemStack itemStack = new ItemStack(Material.AMETHYST_BLOCK);
            player.getInventory().addItem(itemStack);
            return true;

        }
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
