package ru.gltexture.zpm3.system.core.registry.sections;

import ru.gltexture.zpm3.system.core.ZPRegistry;

public enum Section {
    ITEMS(ZPRegistry.DefaultRegistryConsumers.ITEM),
    TABS(ZPRegistry.DefaultRegistryConsumers.TAB);


    private final ZPRegistry.RegistryProcessor<?> consumer;

    Section(ZPRegistry.RegistryProcessor<?> consumer) {
        this.consumer = consumer;
    }

    public ZPRegistry.RegistryProcessor<?> getConsumer() {
        return this.consumer;
    }
}
