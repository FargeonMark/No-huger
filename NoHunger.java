package nohunger.nohunger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class NoHunger extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[No Hunger] I have started");
        getServer().getPluginManager().registerEvents(this, this);
    }


    @EventHandler
    public void nohunger(FoodLevelChangeEvent event) {

            event.setCancelled(true);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
