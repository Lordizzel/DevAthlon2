package de.unkreativ.magic;

import javax.persistence.Entity;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.avaje.ebeaninternal.server.deploy.BeanDescriptor.EntityType;

public class Enderauge implements Listener{
	
	public Enderauge(Main main) {
		// TODO Auto-generated constructor stub
	}

	@EventHandler
	public void onclick(PlayerInteractEvent e){
		Player p = e.getPlayer();
	
			if(e.getPlayer().getItemInHand().getType() == Material.EYE_OF_ENDER){
				e.setCancelled(true);
				
				Location loc = p.getLocation();
				
				loc.add(1, 2, 1);
				p.teleport(loc);
			
				
				
				p.playEffect(p.getLocation(), Effect.WITCH_MAGIC, 11);
	
			}else{
				
			}
			
		

	}
	}
