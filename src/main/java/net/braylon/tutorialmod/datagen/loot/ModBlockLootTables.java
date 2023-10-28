
package net.braylon.tutorialmod.datagen.loot;

        import net.braylon.tutorialmod.block.ModBlocks;
        import net.braylon.tutorialmod.item.ModItems;
        import net.minecraft.advancements.critereon.StatePropertiesPredicate;
        import net.minecraft.data.loot.BlockLootSubProvider;
        import net.minecraft.world.flag.FeatureFlagSet;
        import net.minecraft.world.flag.FeatureFlags;
        import net.minecraft.world.item.Item;
        import net.minecraft.world.item.Items;
        import net.minecraft.world.item.enchantment.Enchantments;
        import net.minecraft.world.level.block.Block;
        import net.minecraft.world.level.storage.loot.LootTable;
        import net.minecraft.world.level.storage.loot.entries.LootItem;
        import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
        import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
        import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
        import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
        import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
        import net.minecraftforge.registries.RegistryObject;

        import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.ZIRCON_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ZIRCON_BLOCK.get());
        this.dropSelf(ModBlocks.JAMES.get());
        this.dropSelf(ModBlocks.AIDEN.get());
        this.dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        this.dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());

        this.add(ModBlocks.SAPPHIRE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        this.add(ModBlocks.SAPPHIRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        this.dropSelf(ModBlocks.ZIRCON_STAIRS.get());
        this.dropSelf(ModBlocks.ZIRCON_BUTTON.get());
        this.dropSelf(ModBlocks.ZIRCON_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ZIRCON_TRAPDOOR.get());
        this.dropSelf(ModBlocks.ZIRCON_FENCE.get());
        this.dropSelf(ModBlocks.ZIRCON_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ZIRCON_WALL.get());

        this.add(ModBlocks.ZIRCON_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ZIRCON_SLAB.get()));
        this.add(ModBlocks.ZIRCON_DOOR.get(),
                block -> createDoorTable(ModBlocks.ZIRCON_DOOR.get()));




        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.END_STONE_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));
        this.add(ModBlocks.NETHER_ZIRCON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_ZIRCON_ORE.get(), ModItems.RAW_ZIRCON.get()));



    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}