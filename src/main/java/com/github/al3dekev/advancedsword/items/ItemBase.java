package com.github.al3dekev.advancedsword.items;

import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import static net.minecraft.item.Item.ToolMaterial.DIAMOND;

public class ItemBase extends ItemSword {

    public ItemBase(String name){
        super(DIAMOND);
        setCreativeTab(Advancedsword.advancedSwordCTab);
        setMaxStackSize(1);
        setRegistryName(Advancedsword.MOD_ID,name);
        setCreativeTab(Advancedsword.advancedSwordCTab);
    }


    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }






}
