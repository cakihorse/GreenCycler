package fr.cakihorse.greencycler.enums;

import org.bukkit.Material;

public enum isMetal {
    BLOCK1(Material.IRON_BLOCK),
    BLOCK2(Material.GOLD_BLOCK),
    BLOCK3(Material.GOLD_ORE),
    ;
    // Ajoutez d'autres blocs métalliques ici

    private final Material material;

    isMetal(Material material) {
        this.material = material;
    }


    public Material getMaterial() {
        return material;
    }
    }
