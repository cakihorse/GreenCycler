package fr.cakihorse.greencycler.enums;

import org.bukkit.Material;

public enum IsRecyclable {
    BLOCK1(Material.IRON_BLOCK),
    BLOCK2(Material.GOLD_BLOCK),
    BLOCK3(Material.GOLD_ORE),
    BLOCK4(Material.PAPER),

    ;


    private final Material material;

    IsRecyclable(Material material) {
        this.material = material;
    }


    public Material getMaterial() {
        return material;
    }
    }
