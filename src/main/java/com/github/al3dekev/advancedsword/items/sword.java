package com.github.al3dekev.advancedsword.items;

import com.github.al3dekev.advancedsword.Advancedsword;
import com.mojang.realmsclient.dto.PlayerInfo;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
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

/*    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }*/

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d aim = playerIn.getLookVec();
        EntityLargeFireball fireball = new EntityLargeFireball(worldIn,playerIn,1,1,1);

        fireball.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY+aim.y*1.5D, playerIn.posZ+aim.z*1.5D);
        fireball.accelerationX = aim.x*0.1;
        fireball.accelerationY = aim.y*0.1;
        fireball.accelerationZ = aim.z*0.1;
        worldIn.spawnEntity(fireball);

        item.damageItem(1,playerIn);

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS,item);
    }


}
