package de.unkreativ.magic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.minecraft.server.v1_10_R1.LootTableInfo.EntityTarget;

public class InteractListener implements Listener {
	
	public List<Material> Magie = new ArrayList<>();
	
	public Inventory Magical = null;
	
	private Main plugin;
	
	public InteractListener(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@SuppressWarnings("deprecation")
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		Magie.add(Material.IRON_BLOCK);
		Magie.add(Material.DIAMOND_BLOCK);
		Magie.add(Material.STAINED_GLASS);
		Magie.add(Material.GRASS);
		Magie.add(Material.EMERALD_BLOCK);
		Magie.add(Material.DIRT);
		Magie.add(Material.GOLD_BLOCK);
		Magie.add(Material.NETHER_BRICK); 
		Magie.add(Material.COBBLESTONE); 
		Magie.add(Material.HARD_CLAY);
		Magie.add(Material.BRICK_STAIRS);  
		Magie.add(Material.WOOL);
		Magie.add(Material.END_BRICKS);
		Magie.add(Material.MAGMA);
		Magie.add(Material.QUARTZ_BLOCK);
		Magie.add(Material.COAL_BLOCK); 
		Magie.add(Material.GLOWSTONE); 
		Magie.add(Material.SOUL_SAND); 
		Magie.add(Material.SNOW_BLOCK); 
		Magie.add(Material.BOOKSHELF); 
		
		Random r = new Random();
		Material result = null;
		result = Magie.get(r.nextInt(Magie.size()));
		
		Inventory Magical = Bukkit.getServer().createInventory(null, 27, "§6Zauberinventar"); 
		
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(p.getItemInHand().getType()  == Material.EMERALD) {
 
				p.playEffect(p.getLocation(), Effect.WITCH_MAGIC, 11);
				
				ArrayList<String> lore1 = new ArrayList<>();
				lore1.add("§7Mit Rechtsklick beschwört man einen Blitz");
				
				ArrayList<String> lore2 = new ArrayList<>();
				lore2.add("§7Ein Rechtsklick ändert die Zeit zu Tag oder Nacht");
				
				ArrayList<String> lore3 = new ArrayList<>();
				lore3.add("§7Mit Rechtsklick können Blöcke verändert werden");
				
				ArrayList<String> lore4 = new ArrayList<>();
				lore4.add("§cNICHT FUNKTIONSTÜCHTIG");
				
				ArrayList<String> lore5 = new ArrayList<>();
				lore5.add("§7Mit Rechtsklick wird man hochgeschleudert");
				
				ItemStack Blitz = new ItemStack(Material.BLAZE_ROD);
				ItemMeta Blitzname = Blitz.getItemMeta();
				Blitzname.setDisplayName("§c§lBlitzzauber");
				Blitz.setItemMeta(Blitzname);
				
				ItemStack Time = new ItemStack(Material.WATCH);
				ItemMeta Timename = Time.getItemMeta();
				Timename.setDisplayName("§e§lZeitzauber");
				Time.setItemMeta(Timename);
				
				ItemStack Stab = new ItemStack(Material.STICK);
				Stab.containsEnchantment(null);
				ItemMeta Stabname = Stab.getItemMeta();
				Stabname.setDisplayName("§6§lZauberstab");
				Stab.setItemMeta(Stabname);
				
				ItemStack Flug = new ItemStack(Material.EYE_OF_ENDER);
				ItemMeta Flugname = Flug.getItemMeta();
				Flugname.setDisplayName("§4§lFlugzauber");
				Flug.setItemMeta(Flugname);
				
				ItemStack Throw = new ItemStack(Material.ANVIL);
				ItemMeta Throwname = Throw.getItemMeta();
				Throwname.setDisplayName("§b§lWurfzauber");
				Throw.setItemMeta(Throwname);
				
				ItemStack Erklärung1 = new ItemStack(Material.PAPER);
				ItemMeta Erklärungsname1 = Erklärung1.getItemMeta();
				Erklärungsname1.setLore(lore1);
				Erklärungsname1.setDisplayName("§cErklärung");
				Erklärung1.setItemMeta(Erklärungsname1);
				
				ItemStack Erklärung2 = new ItemStack(Material.PAPER);
				ItemMeta Erklärungsname2 = Erklärung2.getItemMeta();
				Erklärungsname2.setLore(lore2);
				Erklärungsname2.setDisplayName("§cErklärung");
				Erklärung2.setItemMeta(Erklärungsname2);
				
				ItemStack Erklärung3 = new ItemStack(Material.PAPER);
				ItemMeta Erklärungsname3 = Erklärung3.getItemMeta();
				Erklärungsname3.setLore(lore3);
				Erklärungsname3.setDisplayName("§cErklärung");
				Erklärung3.setItemMeta(Erklärungsname3);
				
				ItemStack Erklärung4 = new ItemStack(Material.PAPER);
				ItemMeta Erklärungsname4 = Erklärung4.getItemMeta();
				Erklärungsname4.setLore(lore5);
				Erklärungsname4.setDisplayName("§cErklärung");
				Erklärung4.setItemMeta(Erklärungsname4);
				
				ItemStack Erklärung5 = new ItemStack(Material.PAPER);
				ItemMeta Erklärungsname5 = Erklärung5.getItemMeta();
				Erklärungsname5.setLore(lore4);
				Erklärungsname5.setDisplayName("§cErklärung");
				Erklärung5.setItemMeta(Erklärungsname5);
				 
				Magical.setItem(9, Flug);
				Magical.setItem(11, Blitz);
				Magical.setItem(13, Stab);
				Magical.setItem(15, Time);
				Magical.setItem(17, Throw);
				
				Magical.setItem(18, Erklärung4);
				Magical.setItem(20, Erklärung1);
				Magical.setItem(22, Erklärung3);
				Magical.setItem(24, Erklärung2);
				Magical.setItem(26, Erklärung5);
				
				p.openInventory(Magical);
			}
			
			if(p.getItemInHand().getType() == Material.WATCH) {
			       World w = p.getWorld();
			       
			       if(w.getTime() > 10000) {
			       w.setTime(0);
			       } else if(w.getTime() < 10000) {
			    	   w.setTime(20000);
			       }
			       
			       
			}
			if(p.getItemInHand().getType() == Material.BLAZE_ROD) {
				World w = p.getWorld();
				w.strikeLightning(e.getClickedBlock().getLocation());
				p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 10);
				
			}
			
			if(p.getItemInHand().getType() == Material.STICK) {
				e.getClickedBlock().setType(result);
				
				p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 10);
				p.playEffect(p.getLocation(), Effect.SPELL, 10);
			}
			if(p.getItemInHand().getType() == Material.ANVIL) {
				e.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player)  e.getWhoClicked();
		
		ItemStack Blitz = new ItemStack(Material.BLAZE_ROD);
		ItemMeta Blitzname = Blitz.getItemMeta();
		Blitzname.setDisplayName("§cBlitzzauber");
		Blitz.setItemMeta(Blitzname);
		
		ItemStack Time = new ItemStack(Material.WATCH);
		ItemMeta Timename = Time.getItemMeta();
		Timename.setDisplayName("§eZeitzauber");
		Time.setItemMeta(Timename);
		
		ItemStack Stab = new ItemStack(Material.STICK);
		Stab.containsEnchantment(null);
		ItemMeta Stabname = Stab.getItemMeta();
		Stabname.setDisplayName("§6§lZauberstab");
		Stab.setItemMeta(Stabname);
		
		ItemStack Flug = new ItemStack(Material.EYE_OF_ENDER);
		ItemMeta Flugname = Flug.getItemMeta();
		Flugname.setDisplayName("§4Flugzauber");
		Flug.setItemMeta(Flugname);
		
		ItemStack Throw = new ItemStack(Material.ANVIL);
		ItemMeta Throwname = Throw.getItemMeta();
		Throwname.setDisplayName("§bWurfzauber");
		Throw.setItemMeta(Throwname);
		
			if(e.getInventory().getName().equalsIgnoreCase("§6Zauberinventar")) {
				e.setCancelled(true);
				
			if(e.getCurrentItem().getType() == Material.WATCH) {
					p.getInventory().addItem(Time);
				}
			
			if(e.getCurrentItem().getType() == Material.BLAZE_ROD) {
				p.getInventory().addItem(Blitz);
			}
			
			if(e.getCurrentItem().getType() == Material.STICK) {
				p.getInventory().addItem(Stab);
			}
			
			if(e.getCurrentItem().getType() == Material.EYE_OF_ENDER) {
				p.getInventory().addItem(Flug);
			}
			if(e.getCurrentItem().getType() == Material.ANVIL) {
				p.getInventory().addItem(Throw);
			}
			}
	}
	

	}
