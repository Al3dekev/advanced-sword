package com.github.al3dekev.advancedsword.items;

import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item {

    public ItemBase(String name){
        setCreativeTab(Advancedsword.advancedSwordCTab);
        setMaxStackSize(1);
        //setUnlocalizedName(name);
        setRegistryName(name);
    }


    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }






}
