package com.github.al3dekev.advancedsword.util;


import com.github.al3dekev.advancedsword.Advancedsword;
import com.github.al3dekev.advancedsword.items.sword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.github.al3dekev.advancedsword.Advancedsword.Items.sword1;

public class advancedSwordTab extends CreativeTabs {

    public advancedSwordTab(){
        super("Advanced Sword");
        //this.setBackgroundImageName("golden");

    }



    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.GOLDEN_SWORD);
    }
}
