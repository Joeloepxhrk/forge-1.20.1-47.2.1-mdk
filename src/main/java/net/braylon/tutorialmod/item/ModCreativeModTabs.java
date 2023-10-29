package net.braylon.tutorialmod.item;

import net.braylon.tutorialmod.TutorialMod;
import net.braylon.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TAB.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {

//                      normal items----------------------------------------

                        pOutput.accept(ModItems.SAPPHIRE.get());

                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModItems.ZIRCON.get());

                        pOutput.accept(ModItems.RAW_ZIRCON.get());

//                      mod blocks----------------------------------------

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.ZIRCON_BLOCK.get());

                        pOutput.accept(ModBlocks.RAW_ZIRCON_BLOCK.get());

//                      ores-------------------------------------------------

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.ZIRCON_ORE.get());

                        pOutput.accept(ModBlocks.DEEPSLATE_ZIRCON_ORE.get());

                        pOutput.accept(ModBlocks.NETHER_ZIRCON_ORE.get());

                        pOutput.accept(ModBlocks.END_STONE_ZIRCON_ORE.get());







//                        non block blocks----------------------------------------
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.ZIRCON_BUTTON.get());
                        pOutput.accept(ModBlocks.ZIRCON_SLAB.get());
                        pOutput.accept(ModBlocks.ZIRCON_STAIRS.get());
                        pOutput.accept(ModBlocks.ZIRCON_DOOR.get());
                        pOutput.accept(ModBlocks.ZIRCON_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ZIRCON_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ZIRCON_FENCE.get());
                        pOutput.accept(ModBlocks.ZIRCON_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ZIRCON_WALL.get());




                        pOutput.accept(ModBlocks.JAMES.get());
                        pOutput.accept(ModBlocks.AIDEN.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModItems.METAL_DETECTOR.get());

//                      foods----------------------------------------------------

                        pOutput.accept(ModItems.STRAWBERRY.get());

//                        full item----------------------------------------------
                        pOutput.accept(ModItems.PINE_CONE.get());





                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);

    }
}
