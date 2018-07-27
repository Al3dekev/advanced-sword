package com.github.al3dekev.advancedsword.proxy;

import com.github.al3dekev.advancedsword.Advancedsword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRender() {
        ModelLoader.setCustomModelResourceLocation(Advancedsword.sword1,0,new ModelResourceLocation(new ResourceLocation("advancedsword:sword1"),"inventory"));
    }
}