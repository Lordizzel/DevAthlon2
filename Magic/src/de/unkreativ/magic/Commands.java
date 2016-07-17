package de.unkreativ.magic;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Commands implements Listener, CommandExecutor{
	
	public String prefix = "§8[§3☆§bMagic§3☆§8] ";
	
	public Main plugin;
	
	public Commands(Main main) {
		this.plugin = main;
	}

		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player ) sender;
			
			Main.Partikel.add(p);
			
			p.sendMessage(prefix + "§7Du bist jetzt ein §bZauberer§7!");
			
			ItemStack Zauber = new ItemStack(Material.EMERALD);
			ItemMeta Zaubername = Zauber.getItemMeta();
			Zaubername.setDisplayName("§b§lMagischer §6§lZauberkristal");
			Zauber.setItemMeta(Zaubername);
			
			ItemStack Hut = new ItemStack(Material.ARMOR_STAND);
			ItemMeta Hutname = Hut.getItemMeta();
			Hutname.setDisplayName("§b§lZaubererhut");
			Hut.setItemMeta(Hutname);
			
			p.setItemInHand(Zauber);
			
			p.setDisplayName("§3" + p.getName() + "§f");
			p.setPlayerListName("§3Wizard §7| §3" + p.getName());
			p.getEquipment().setHelmet(Hut);
			
			return true;
		}
}
