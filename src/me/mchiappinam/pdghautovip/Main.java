package me.mchiappinam.pdghautovip;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	  public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		schedulerStart();
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoVIP] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoVIP] §2Acesse: http://pdgh.com.br/");
	  }
	    
	  public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoVIP] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoVIP] §2Acesse: http://pdgh.com.br/");
	  }
		
	  @EventHandler
	  public void onPlayerJoin(final PlayerJoinEvent e) {
		    getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			      public void run() {
						e.getPlayer().sendMessage("§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-");
						e.getPlayer().sendMessage("§3§l[PDGH] §6Aniversário PDGH! 2 anos!");
						e.getPlayer().sendMessage("§3§l[PDGH] §6Adquira seu VIP e tenha itens imperdíveis como:");
						e.getPlayer().sendMessage("§3§l[PDGH] §6-Proteção §c§l6§6, Inquebrável §c§l4§6-");
						e.getPlayer().sendMessage("§3§l[PDGH] §6-Proteção §c§l5§6, Inquebrável §c§l3§6-");
						e.getPlayer().sendMessage("§3§l[PDGH] §6-Afiada §c§l7§6, Aspecto Flamejante §c§l4§6-");
						e.getPlayer().sendMessage("§3§l[PDGH] §6Corra, promoção até o dia §c§l31/05§6.");
						e.getPlayer().sendMessage("§3§l[PDGH] §6Mais informações acesse: §c§lwww.pdgh.com.br/promo");
						e.getPlayer().sendMessage("§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-§3§l=§6§l-");
			      }
			    }, 40L);
		    }
	    
	  public void schedulerStart() {
		  getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			  int timer = 1;
		      public void run() {
		    	  if(timer>1) {
			    	  getServer().broadcastMessage("§3§l[PDGH] §6Aniversário PDGH! 2 anos!");
			    	  getServer().broadcastMessage("§3§l[PDGH] §6Adquira seu VIP e tenha itens imperdíveis como:");
			    	  getServer().broadcastMessage("§3§l[PDGH] §6-Proteção §c§l6§6, Inquebrável §c§l4§6-");
			    	  getServer().broadcastMessage("§3§l[PDGH] §6-Proteção §c§l5§6, Inquebrável §c§l3§6-");
			    	  getServer().broadcastMessage("§3§l[PDGH] §6-Afiada §c§l7§6, Aspecto Flamejante §c§l4§6-");
			    	  getServer().broadcastMessage("§3§l[PDGH] §6Corra, promoção até o dia §c§l31/05§6.");
			    	  getServer().broadcastMessage("§3§l[PDGH] §6Mais informações acesse: §c§lwww.pdgh.com.br/promo");
		    	  }
		    	  timer++;
		      }
		  }, 0, 5*60*20);
	  }
	  
	  
	  
	  
	  
	  
	  
}