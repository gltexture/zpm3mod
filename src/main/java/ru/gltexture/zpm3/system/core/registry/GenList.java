package ru.gltexture.zpm3.system.core.registry;

import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;
import ru.gltexture.zpm3.assets.listing.ZPTabsList;
import ru.gltexture.zpm3.system.objects.ZPItem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class GenList {
    public static final @NotNull List<ZPItem> GEN_ITEMS = new ArrayList<>();
    public static final @NotNull List<ZPTabsList.ZpTab> GEN_TABS = new ArrayList<>();
}
