package ru.gltexture.zpm3.system.core.sections;

import ru.gltexture.zpm3.system.core.ZPRegistry;

public enum Section {
    ITEMS(ZPRegistry.DefaultRegistryConsumers.ITEM),
    TABS(ZPRegistry.DefaultRegistryConsumers.TAB);


    private final ZPRegistry.RegistryConsumer<?> consumer;

    Section(ZPRegistry.RegistryConsumer<?> consumer) {
        this.consumer = consumer;
    }

    public ZPRegistry.RegistryConsumer<?> getConsumer() {
        return this.consumer;
    }
}
