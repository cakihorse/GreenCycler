package fr.cakihorse.greencycler.enums;

import org.bukkit.Material;

public enum IsVegetable {
    BLOCK1(Material.GRASS),
    BLOCK2(Material.DIRT),
    BLOCK3(Material.POTATO),
    BLOCK4(Material.WOOD),
    BLOCK5(Material.WOOD_AXE),
    BLOCK6(Material.WOOD_BUTTON),
    BLOCK7(Material.WOOD_DOOR),
    BLOCK8(Material.WOOD_HOE),
    BLOCK9(Material.WOOD_DOUBLE_STEP),
    BLOCK10(Material.WOOD_PICKAXE),
    BLOCK11(Material.WOOD_PLATE),
    BLOCK12(Material.WOOD_SPADE),
    BLOCK13(Material.WOOD_STAIRS),
    BLOCK14(Material.WOOD_STEP),
    BLOCK15(Material.WOOD_SWORD),
    BLOCK16(Material.SAPLING),
    ;


    private final Material material;

    IsVegetable(Material material) {
        this.material = material;
    }


    public Material getMaterial() {
        return material;
    }
}
