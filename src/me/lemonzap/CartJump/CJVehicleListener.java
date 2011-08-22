package me.lemonzap.CartJump;

import java.util.logging.Logger;
import org.bukkit.entity.Minecart;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.event.vehicle.VehicleListener;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.util.Vector;

public class CJVehicleListener extends VehicleListener{

    Logger log = Logger.getLogger("Minecraft");

    public static CartJump plugin;

    public CJVehicleListener(CartJump instance) {
        plugin = instance;
    }


    public void onVehicleMove (VehicleMoveEvent event) {
        Minecart cart = (Minecart) event.getVehicle(); // Changed Vehicle cart to Minecart cart. Also added a 'cast to Minecart' by using (Minecart) before event.getVehicle();
        
        Vector vel = new Vector(5 , 1 , 10);
        cart.setFlyingVelocityMod(vel);

    }
}