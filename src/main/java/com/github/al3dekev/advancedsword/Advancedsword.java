package com.github.al3dekev.advancedsword;

import com.github.al3dekev.advancedsword.items.ItemBase;
import com.github.al3dekev.advancedsword.items.sword;
import com.github.al3dekev.advancedsword.proxy.CommonProxy;
import com.github.al3dekev.advancedsword.util.advancedSwordTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.event.RegistryEvent;

import static com.github.al3dekev.advancedsword.Advancedsword.Items.test_sword;
import static com.github.al3dekev.advancedsword.Advancedsword.Items.sword1;
import static com.github.al3dekev.advancedsword.Advancedsword.Items.test_sword;

//import cpw.mods.fml.common.Mod;

@Mod(
        modid = Advancedsword.MOD_ID,
        name = Advancedsword.MOD_NAME,
        version = Advancedsword.VERSION
)



public class Advancedsword {

    public static final String MOD_ID = "advancedsword";
    public static final String MOD_NAME = "Advanced Sword";
    public static final String VERSION = "1.0";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static Advancedsword INSTANCE;


    @SidedProxy(clientSide = "com.github.al3dekev.advancedsword.proxy.ClientProxy", serverSide = "com.github.al3dekev.advancedsword.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static advancedSwordTab advancedSwordCTab = new advancedSwordTab();





    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {


        //proxy.registerRender();
        //pas de rendu proxy

    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    /**
     * Forge will automatically look up and bind blocks to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
        // Vide
    }

    /**
     * Forge will automatically look up and bind items to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {

      //@GameRegistry.ObjectHolder("advancedSword1")
      public static final sword sword1 = new sword("advancedsword_1");

      public static final sword test_sword = new sword("testsword");
    }

    /**
     * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
     */
    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        /**
         * Listen for the register event for creating custom items
         */
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event){

            event.getRegistry().register(sword1);

            //event.getRegistry().register(test_sword);

        }

        /**
         * Listen for the register event for creating custom blocks
         */
        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
            // Vide
        }


        /***
         * Zone de gestion du modele
         * @param event
         */
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            //proxy.registerRender();
            sword1.initModel();
            test_sword.initModel();
        }

    }
}
