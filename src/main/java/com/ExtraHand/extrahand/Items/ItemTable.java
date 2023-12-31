package com.ExtraHand.extrahand.Items;

import net.minecraft.item.Item;

public class ItemTable extends Item {
    private final String itemName = "ItemTable";
    private final String textureName = "extrahand:itemtable";

    public ItemTable(){
        super.setUnlocalizedName(this.itemName).setTextureName(this.textureName);
    }

}
