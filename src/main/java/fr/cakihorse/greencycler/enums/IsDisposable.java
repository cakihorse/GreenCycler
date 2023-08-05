package fr.cakihorse.greencycler.enums;

import org.bukkit.Material;

public enum IsDisposable {
    BLOCK1(Material.GRAVEL),
    ;


    private final Material material;

    IsDisposable(Material material) {
        this.material = material;
    }


    public Material getMaterial() {
        return material;
    }
}
