package ru.gltexture.zpm3.system.core.registry.processors;

import org.jetbrains.annotations.NotNull;
import ru.gltexture.zpm3.assets.listing.ZPTabsList;
import ru.gltexture.zpm3.system.core.ZPRegistry;
import ru.gltexture.zpm3.system.core.registry.GenList;
import ru.gltexture.zpm3.system.objects.ZPItem;
import ru.gltexture.zpm3.utils.RegistryUtils;

import java.util.*;

public final class ZPTabProcessor implements ZPRegistry.RegistryProcessor<ZPTabsList.ZpTab> {
    private final Map<ZPTabsList.ZpTab, List<ZPTabsList.TabEntry>> tabListMap;

    public ZPTabProcessor() {
        this.tabListMap = new HashMap<>();
    }

    @Override
    public void preProcessing() {
        for (ZPItem zpItem : GenList.GEN_ITEMS) {
            if (zpItem.getZpTab() == null) {
                continue;
            }
            if (!this.tabListMap.containsKey(zpItem.getZpTab())) {
                this.tabListMap.put(zpItem.getZpTab(), new ArrayList<>());
            }
            this.tabListMap.get(zpItem.getZpTab()).add(zpItem);
        }
    }

    @Override
    public ZPRegistry.RegistryConsumer<ZPTabsList.ZpTab> registryConsumer() {
        return e -> RegistryUtils.registerTab(e, this.tabListMap.get(e));
    }

    @Override
    public void postProcessing() {

    }

    @Override
    public @NotNull List<ZPTabsList.ZpTab> genCollector() {
        return GenList.GEN_TABS;
    }
}
