package com.github.al3dekev.advancedsword.util;


import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class advancedSwordTab extends CreativeTabs {

    public advancedSwordTab(){
        super("Advanced Sword");

    }

    @Override
    public ItemStack getTabIconItem() {
        // Ajouter les items ici
        return new ItemStack(Advancedsword.sword1);
    }
}
