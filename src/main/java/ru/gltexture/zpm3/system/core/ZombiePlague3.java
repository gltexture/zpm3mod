package ru.gltexture.zpm3.system.core;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gltexture.zpm3.assets.listing.ZPItemsList;
import ru.gltexture.zpm3.assets.listing.ZPTabsList;

public class ZombiePlague3 implements ModInitializer {
    public static final Project MOD_INFO = new Project("ZombiePlagueMod3", "zpm3", "In Development");
    private static final Logger logger = LogManager.getLogger();

    private final ZPRegistry zpRegistry;

    public ZombiePlague3() {
        this.zpRegistry = new ZPRegistry();
    }

    @Override
    public void onInitialize() {
        this.getZpRegistry().addClassWithRegistry(ZPItemsList.class);
        this.getZpRegistry().addClassWithRegistry(ZPTabsList.class);

        ZombiePlague3.info(ZombiePlague3.MOD_INFO.MOD_NAME() + " - " + ZombiePlague3.MOD_INFO.VERSION());
        this.getZpRegistry().launch();
    }

    public ZPRegistry getZpRegistry() {
        return this.zpRegistry;
    }

    public static void info(String message) {
        ZombiePlague3.log(Level.INFO, message);
    }

    public static void warn(String message) {
        ZombiePlague3.log(Level.WARN, message);
    }

    public static void error(String message) {
        ZombiePlague3.log(Level.ERROR, message);
    }

    private static void log(Level level, String message) {
        ZombiePlague3.logger.log(level, message);
    }
}
