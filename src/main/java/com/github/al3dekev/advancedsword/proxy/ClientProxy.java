package com.github.al3dekev.advancedsword.proxy;

import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.github.al3dekev.advancedsword.Advancedsword.Items.sword1;

//import static com.github.al3dekev.advancedsword.Advancedsword.sword1;

//import com.github.al3dekev.advancedsword.items.sword;
public class ClientProxy extends CommonProxy
{

    @Override
    @SideOnly(Side.CLIENT)
    public void registerRender() {
        //sword1.initModel();

        //ModelLoader.setCustomModelResourceLocation(sword1,0,new ModelResourceLocation(new ResourceLocation("advancedsword:sword1"),"inventory"));
    }


}