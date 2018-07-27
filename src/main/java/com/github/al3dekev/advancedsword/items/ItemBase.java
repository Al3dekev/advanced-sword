package com.github.al3dekev.advancedsword.items;

import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name){
        setCreativeTab(Advancedsword.advancedSwordCTab);
        setMaxStackSize(1);
        setUnlocalizedName(name);
        setRegistryName(name);
    }


}
