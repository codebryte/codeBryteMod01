package com.example.examplemod;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;

import com.example.examplemod.events.ModCommonEvents;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MODID = "examplemod";

    public static Collection<ItemStack> ITEM_STACK_COLLECTION = new ArrayList<ItemStack>();

    public ExampleMod() {


        // We use 2 Event Busses to do things when certain events occur
        // MinecraftForge.EVENT_BUS is the event bus for vanilla Minecraft events
        // Here, we register this mod (note @Mod class annotation above) with vanilla Minecraft
        MinecraftForge.EVENT_BUS.register(this);

        // Here we add a listener to send a message whenever a block is broken
        // (a vanilla Minecraft event) (sendMessage is defined below)
        // TODO: Add a Listener for the BreakEvent triggered when the Player breaks Blocks.
        


        // The other event bus is the Mod-specific event bus created here
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }























}
