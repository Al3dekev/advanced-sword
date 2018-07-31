package com.github.al3dekev.advancedsword.util;


import com.github.al3dekev.advancedsword.Advancedsword;
import com.github.al3dekev.advancedsword.items.sword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import static com.github.al3dekev.advancedsword.Advancedsword.Items.sword1;

public class advancedSwordTab extends CreativeTabs {

    public advancedSwordTab(){
        super("Advanced Sword");

    }



    @Override
    public ItemStack createIcon() {
        return new ItemStack(sword1);
    }
}
