package com.github.al3dekev.advancedsword.items;

import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class sword extends ItemBase {

    public sword(String name){
        super(name);
        this.isDamageable();
        this.setFull3D();
        this.shouldRotateAroundWhenRendering();
        this.isRepairable();
        this.setHarvestLevel("sword",3);
        //isEnchantable();

    }


}
