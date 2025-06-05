package ru.gltexture.zpm3.system.core;

import ru.gltexture.zpm3.system.core.sections.ZPSection;
import ru.gltexture.zpm3.system.exceptions.ZPIOException;
import ru.gltexture.zpm3.system.objects.ZPItem;
import ru.gltexture.zpm3.utils.Pair;
import ru.gltexture.zpm3.utils.RegistryUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public final class ZPRegistry {
    private final List<Class<?>> classesWithRegistry;

    public ZPRegistry() {
        this.classesWithRegistry = new ArrayList<>();
    }

    public void addClassWithRegistry(Class<?> clazz) {
        this.classesWithRegistry.add(clazz);
    }

    void launch() {
        TreeSet<Pair<ZPSection, Class<?>>> priorityStructure = new TreeSet<>(Comparator.comparingInt((e) -> e.getFirst().priority()));
        for (Class<?> clazz : this.classesWithRegistry) {
            if (clazz.isAnnotationPresent(ZPSection.class)) {
                ZPSection zpSection = clazz.getAnnotation(ZPSection.class);
                priorityStructure.add(new Pair<>(zpSection, clazz));
            } else {
                ZombiePlague3.warn("Class: " + clazz.getName() + " is not presented as a section!");
            }
        }
        for (Pair<ZPSection, Class<?>> pair : priorityStructure) {
            final ZPSection zpSection = pair.getFirst();
            final Class<?> clazz = pair.getSecond();

            ZombiePlague3.info("Registry entry: " + zpSection.name());
            for (Field field : clazz.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    Object value = field.get(null);
                    zpSection.section().getConsumer().registerObj(value);
                } catch (ClassCastException | IllegalAccessException e) {
                    throw new ZPIOException(e);
                }
            }
        }
    }

    public static abstract class DefaultRegistryConsumers {
        public static final RegistryConsumer<ZPItem> ITEM = RegistryUtils::registerItem;
    }

    @FunctionalInterface
    public interface RegistryConsumer<T> {
        void register(T t);

        @SuppressWarnings("all")
        default void registerObj(Object object) {
            this.register((T) object);
        }
    }
}
