package de.unkreativ.magic;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import de.unkreativ.magic.Main;

public class Move implements Listener{
	
	
	public Move(Main main) {
	}

	@EventHandler
	public void onmove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		
		if(Main.Partikel.contains(p)){
		
		p.playEffect(p.getLocation(), Effect.WITCH_MAGIC, 11);
		}else{
			
		}
	}

}
