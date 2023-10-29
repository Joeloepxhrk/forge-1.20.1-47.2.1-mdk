package net.braylon.tutorialmod.datagen;



import net.braylon.tutorialmod.TutorialMod;
import net.braylon.tutorialmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_STONE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);

        blockWithItem(ModBlocks.ZIRCON_BLOCK);
        blockWithItem(ModBlocks.RAW_ZIRCON_BLOCK);

        blockWithItem(ModBlocks.ZIRCON_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ZIRCON_ORE);
        blockWithItem(ModBlocks.END_STONE_ZIRCON_ORE);
        blockWithItem(ModBlocks.NETHER_ZIRCON_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);
        blockWithItem(ModBlocks.JAMES);
        blockWithItem(ModBlocks.AIDEN);

        stairsBlock(((StairBlock) ModBlocks.SAPPHIRE_STAIRS.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.SAPPHIRE_SLAB.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.SAPPHIRE_BUTTON.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.SAPPHIRE_FENCE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SAPPHIRE_FENCE_GATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.SAPPHIRE_WALL.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.SAPPHIRE_DOOR.get()), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SAPPHIRE_TRAPDOOR.get()), modLoc("block/sapphire_trapdoor"), true, "cutout");




        stairsBlock(((StairBlock) ModBlocks.ZIRCON_STAIRS.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.ZIRCON_SLAB.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.ZIRCON_BUTTON.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ZIRCON_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.ZIRCON_FENCE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ZIRCON_FENCE_GATE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.ZIRCON_WALL.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.ZIRCON_DOOR.get()), modLoc("block/zircon_door_bottom"), modLoc("block/zircon_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ZIRCON_TRAPDOOR.get()), modLoc("block/zircon_trapdoor"), true, "cutout");

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}