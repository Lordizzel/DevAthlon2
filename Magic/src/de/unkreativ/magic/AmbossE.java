package de.unkreativ.magic;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import de.unkreativ.magic.Main;

public class AmbossE implements Listener{
	
	public AmbossE(Main main) {
	
	}

	@EventHandler
	public void InteractEntity(PlayerInteractEntityEvent e) {
		Player p = (Player) e.getPlayer();
		Entity en = (Entity) e.getRightClicked();
		
		
		if(p.getItemInHand().getType() == Material.ANVIL) {
			p.setPassenger(p);
			
		
		}
	}

}
