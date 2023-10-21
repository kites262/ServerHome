package xyz.xixuan.landmark;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.Configuration;

public class Mold {
    public static final String path_location_world = "location.world";
    public static final String path_location_x = "location.x";
    public static final String path_location_z = "location.y";
    public static final String path_location_y = "location.z";
    public static final String path_location_pitch = "location.pitch";
    public static final String path_location_yaw = "location.yaw";
    public static final String path_service = "service";
    Configuration config;
    Landmark plugin;
    Location location;
    public Mold(Landmark landmark){
        landmark.saveDefaultConfig();
        plugin = landmark;
        config = landmark.getConfig();
    }

    public String getString(String path){
        return String.valueOf(config.get(path));
    }

    public Double getDouble(String path){
        return Double.parseDouble(getString(path));
    }

    public Location getLocation(){
        location = new Location(
                Bukkit.getWorld(getString(path_location_world)),
                getDouble(path_location_x),
                getDouble(path_location_y),
                getDouble(path_location_z),
                Float.parseFloat(getString(path_location_yaw)),
                Float.parseFloat(getString(path_location_pitch)));
                return location;
    }
}
