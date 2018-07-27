package com.github.al3dekev.advancedsword.items;

import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class sword extends ItemBase {

    public sword(){
        super("Advanced Sword");

        isDamageable();
        setFull3D();
        shouldRotateAroundWhenRendering();
        isRepairable();
        setHarvestLevel("sword",3);
        //isEnchantable();
        setCreativeTab(Advancedsword.advancedSwordCTab);

    }


}
