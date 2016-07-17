package de.unkreativ.magic;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static ArrayList<Player>Partikel = new ArrayList<Player>();
	
	@Override
	public void onEnable() {
		System.out.println("[Magic] Plugin erfolgreich aktiviert!");
		
		new InteractListener(this);
		new Move(this);
		new Commands(this);
		new Enderauge(this);
		new AmbossE(this);
		getCommand("magic").setExecutor(new Commands(this));
	}
	
	@Override
	public void onDisable() {
		System.out.println("[Magic] Plugin erfolgreich deaktiviert!");
	}
	
	

}
