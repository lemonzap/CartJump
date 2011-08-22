package me.lemonzap.CartJump;


// I removed a heap of unnecessary imports here
import java.util.logging.Logger;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CartJump extends JavaPlugin {

    // Class Variables
    // I removed your variable CJVehicleListener VehicleListener = new CJVehicleListener(this)
    // I did this because 1 it was not needed. 2 - it conflicts with a class called VehicleListener (the one CJVehicleListener extends)
    public PluginManager pluginManager;
    public final Logger log = Logger.getLogger("Minecraft");

    public void onEnable() {

        // Output to console that we're loading
        log.info("[CartJump] Starting...");

        // Get the server's plugin manager so we can register commands and events
        PluginManager pm = getServer().getPluginManager(); 
        pm.registerEvent(Event.Type.VEHICLE_MOVE, new CJVehicleListener(this), Event.Priority.Normal, this);
        // Output to server console that the plugin is enabled
        log.info("[CartJump] Version " + this.getDescription().getVersion() + " enabled");

    }

    public void onDisable() {

        // Output to server console that the plugin is disabled
        log.info("[CartJump] Version " + this.getDescription().getVersion() + " disabled");

    }

}