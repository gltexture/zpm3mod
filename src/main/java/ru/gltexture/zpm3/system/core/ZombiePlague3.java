package ru.gltexture.zpm3.system.core;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gltexture.zpm3.system.ZPSectionsLoader;
import ru.gltexture.zpm3.system.init.ZPItems;

public class ZombiePlague3 implements ModInitializer {
    public static final PROJECT_INFO MOD_INFO = new PROJECT_INFO("ZombiePlagueMod3", "zpm3", "In Development");
    private static final Logger logger = LogManager.getLogger();
    private final ZPSectionsLoader ZPSectionsLoader;

    public ZombiePlague3() {
        this.ZPSectionsLoader = new ZPSectionsLoader();
    }

    @Override
    public void onInitialize() {
        this.getSrfLoader().addSection(ZPItems.INSTANCE);
        ZombiePlague3.printConsole(ZombiePlague3.MOD_INFO.MOD_NAME() + " - " + ZombiePlague3.MOD_INFO.VERSION());
        this.getSrfLoader().startInit();
    }

    public ZPSectionsLoader getSrfLoader() {
        return this.ZPSectionsLoader;
    }

    public static void printConsole(String message) {
        ZombiePlague3.logger.log(Level.INFO, message);
    }

    public static void printConsole(Level level, String message) {
        ZombiePlague3.logger.log(level, message);
    }
}
