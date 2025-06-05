package ru.gltexture.zpm3.system;

import ru.gltexture.zpm3.assets.items.AcidBottleItem;
import ru.gltexture.zpm3.system.core.ZombiePlague3;
import ru.gltexture.zpm3.system.init.IZPSection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class ZPSectionsLoader {
    private final List<IZPSection> sectionList;
    public static final List<AcidBottleItem> toRegisterItems = new ArrayList<>();

    public ZPSectionsLoader() {
        this.sectionList = new ArrayList<>();
    }

    public void startInit() {
        this.getSectionList().sort(Comparator.comparing(IZPSection::priority));
        this.getSectionList().forEach(e -> {
            ZombiePlague3.printConsole("Start initializing: " + e.sectionName());
            e.initSection();
            ZombiePlague3.printConsole("End initializing: " + e.sectionName());
        });
    }

    public List<IZPSection> getSectionList() {
        return this.sectionList;
    }

    public void addSection(IZPSection IZPSection) {
        this.getSectionList().add(IZPSection);
    }
}
