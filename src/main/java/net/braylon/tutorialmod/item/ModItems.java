package net.braylon.tutorialmod.item;

import net.braylon.tutorialmod.TutorialMod;
import net.braylon.tutorialmod.item.custom.FuelItem;
import net.braylon.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
// items-----------------------------------------------------------------------------------------
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties()));
// advanced items-----------------------------------------------------------------------------------------
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
// weapons/tools/3d stuff----------------------------------------------------------------------------------





    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
        () -> new SwordItem(ModToolTiers.SAPPHIRE, 5, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(ModToolTiers.ZIRCON, 3, 1, new Item.Properties()));
    public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZIRCON, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> ZIRCON_AXE = ITEMS.register("zircon_axe",
            () -> new AxeItem(ModToolTiers.ZIRCON, 8, 0, new Item.Properties()));
    public static final RegistryObject<Item> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(ModToolTiers.ZIRCON, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new HoeItem(ModToolTiers.ZIRCON, 1, 1, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));







// foods------------------------------------------------------------------------------------------.
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

//    fule items-----------------------------------------------------------------------------------------

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));



/*for fule items all you need to do is moditems lang item modle AND ITEM TEXTURE
* ADD TO THE CREATIVE TAB AND IN HERE give different name and burn time to make different ones
* make shure to have different textures aswell
* 200 = 1 items smelted 400 = 2 items smelted so every 200 = 1 more item smellted
 */
//    400 = 20 secconds for burn time







//---------------------------------------------------------------------------------------------------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
