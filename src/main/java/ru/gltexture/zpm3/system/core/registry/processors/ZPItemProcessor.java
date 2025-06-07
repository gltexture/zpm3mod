package ru.gltexture.zpm3.system.core.registry.processors;

import org.jetbrains.annotations.NotNull;
import ru.gltexture.zpm3.system.core.ZPRegistry;
import ru.gltexture.zpm3.system.core.registry.GenList;
import ru.gltexture.zpm3.system.objects.ZPItem;
import ru.gltexture.zpm3.utils.RegistryUtils;

import java.util.List;

public final class ZPItemProcessor implements ZPRegistry.RegistryProcessor<ZPItem> {
    @Override
    public void preProcessing() {

    }

    @Override
    public ZPRegistry.RegistryConsumer<ZPItem> registryConsumer() {
        return RegistryUtils::registerItem;
    }

    @Override
    public void postProcessing() {

    }

    @Override
    public @NotNull List<ZPItem> genCollector() {
        return GenList.GEN_ITEMS;
    }
}
