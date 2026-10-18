package dev.dimasik.client.system;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import net.minecraft.core.Holder;
import net.minecraft.core.Holder.Reference;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.ItemAttributeModifiers.Entry;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;

public final class Class_SluWNIC7qlm0dHwu implements Class_NzJrN63M7QBpmAbi {
   public static final List<Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP> f_13386 = List.of(
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13408,
         Items.SPLASH_POTION,
         m_4730(MobEffects.SLOWNESS, 10, 200),
         m_4730(MobEffects.SPEED, 5, 300),
         m_4730(MobEffects.BLINDNESS, 10, 100),
         m_4730(MobEffects.GLOWING, 1, 3600)
      ),
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13409,
         Items.SPLASH_POTION,
         m_4730(MobEffects.REGENERATION, 2, 900),
         m_4730(MobEffects.INVISIBILITY, 2, 12000),
         m_4730(MobEffects.INSTANT_HEALTH, 2, 0)
      ),
      m_4727(Class_SluWNIC7qlm0dHwu.f_13410, Items.SPLASH_POTION, m_4730(MobEffects.STRENGTH, 5, 600), m_4730(MobEffects.SLOWNESS, 4, 600)),
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13411,
         Items.SPLASH_POTION,
         m_4730(MobEffects.RESISTANCE, 1, 12000),
         m_4730(MobEffects.FIRE_RESISTANCE, 1, 12000),
         m_4730(MobEffects.HEALTH_BOOST, 3, 1200),
         m_4730(MobEffects.INVISIBILITY, 1, 18000)
      ),
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13412,
         Items.SPLASH_POTION,
         m_4730(MobEffects.STRENGTH, 4, 1200),
         m_4730(MobEffects.SPEED, 3, 6000),
         m_4730(MobEffects.HASTE, 1, 1200),
         m_4730(MobEffects.INSTANT_DAMAGE, 2, 0)
      ),
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13413,
         Items.SPLASH_POTION,
         m_4730(MobEffects.POISON, 2, 300),
         m_4730(MobEffects.WITHER, 2, 300),
         m_4730(MobEffects.SLOWNESS, 3, 300),
         m_4730(MobEffects.HUNGER, 5, 300),
         m_4730(MobEffects.GLOWING, 1, 300)
      ),
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13414,
         Items.SPLASH_POTION,
         m_4730(MobEffects.WEAKNESS, 2, 1800),
         m_4730(MobEffects.MINING_FATIGUE, 2, 200),
         m_4730(MobEffects.WITHER, 3, 1800),
         m_4730(MobEffects.BLINDNESS, 1, 200)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13415,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13416, Operation.ADD_VALUE),
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13417, Operation.ADD_VALUE),
         m_4728(Attributes.ARMOR_TOUGHNESS, Class_SluWNIC7qlm0dHwu.f_13418, Operation.ADD_VALUE),
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13419, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13420,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13421, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13422, Operation.ADD_VALUE),
         m_4728(Attributes.MOVEMENT_SPEED, Class_SluWNIC7qlm0dHwu.f_13423, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.ATTACK_SPEED, Class_SluWNIC7qlm0dHwu.f_13424, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13425, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13426,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13427, Operation.ADD_VALUE),
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13428, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13429, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13430,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13431, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13432, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13433,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13434, Operation.ADD_VALUE),
         m_4728(Attributes.MOVEMENT_SPEED, Class_SluWNIC7qlm0dHwu.f_13435, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.ATTACK_SPEED, Class_SluWNIC7qlm0dHwu.f_13436, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13437,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13438, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13439, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13440,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13441, Operation.ADD_VALUE),
         m_4728(Attributes.ATTACK_SPEED, Class_SluWNIC7qlm0dHwu.f_13442, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13443,
         Items.TOTEM_OF_UNDYING,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13444, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13445, Operation.ADD_VALUE),
         m_4728(Attributes.MOVEMENT_SPEED, Class_SluWNIC7qlm0dHwu.f_13446, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13447,
         Items.PLAYER_HEAD,
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13448, Operation.ADD_VALUE),
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13449, Operation.ADD_VALUE),
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13450, Operation.ADD_VALUE),
         m_4728(Attributes.MOVEMENT_SPEED, Class_SluWNIC7qlm0dHwu.f_13451, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.ATTACK_SPEED, Class_SluWNIC7qlm0dHwu.f_13452, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.GRAVITY, Class_SluWNIC7qlm0dHwu.f_13453, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13454,
         Items.PLAYER_HEAD,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13455, Operation.ADD_VALUE),
         m_4728(Attributes.JUMP_STRENGTH, Class_SluWNIC7qlm0dHwu.f_13456, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.ATTACK_SPEED, Class_SluWNIC7qlm0dHwu.f_13457, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13458,
         Items.PLAYER_HEAD,
         m_4728(Attributes.ARMOR, 1.0, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13459, Operation.ADD_VALUE),
         m_4728(Attributes.MOVEMENT_SPEED, Class_SluWNIC7qlm0dHwu.f_13460, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.ATTACK_SPEED, Class_SluWNIC7qlm0dHwu.f_13461, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13462,
         Items.PLAYER_HEAD,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13463, Operation.ADD_VALUE),
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13464, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13465, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13466,
         Items.PLAYER_HEAD,
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13467, Operation.ADD_VALUE),
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13468, Operation.ADD_VALUE),
         m_4728(Attributes.SUBMERGED_MINING_SPEED, Class_SluWNIC7qlm0dHwu.f_13469, Operation.ADD_MULTIPLIED_BASE),
         m_4728(Attributes.OXYGEN_BONUS, Class_SluWNIC7qlm0dHwu.f_13470, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13471,
         Items.PLAYER_HEAD,
         m_4728(Attributes.ATTACK_DAMAGE, Class_SluWNIC7qlm0dHwu.f_13472, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13473, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13474,
         Items.PLAYER_HEAD,
         m_4728(Attributes.LUCK, 1.0, Operation.ADD_VALUE),
         m_4728(Attributes.MAX_HEALTH, Class_SluWNIC7qlm0dHwu.f_13475, Operation.ADD_VALUE),
         m_4728(Attributes.BLOCK_INTERACTION_RANGE, 1.0, Operation.ADD_VALUE)
      ),
      m_4724(
         Class_SluWNIC7qlm0dHwu.f_13476,
         Items.PLAYER_HEAD,
         m_4728(Attributes.ARMOR, Class_SluWNIC7qlm0dHwu.f_13477, Operation.ADD_VALUE),
         m_4728(Attributes.ARMOR_TOUGHNESS, Class_SluWNIC7qlm0dHwu.f_13478, Operation.ADD_VALUE),
         m_4728(Attributes.MOVEMENT_SPEED, Class_SluWNIC7qlm0dHwu.f_13479, Operation.ADD_MULTIPLIED_BASE)
      ),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13480, Items.NETHERITE_SCRAP, m_4735(Class_SluWNIC7qlm0dHwu.f_13481)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13482, Items.SUGAR, m_4735(Class_SluWNIC7qlm0dHwu.f_13483)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13484, Items.SNOWBALL, m_4735(Class_SluWNIC7qlm0dHwu.f_13485)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13486, Items.PHANTOM_MEMBRANE, m_4735(Class_SluWNIC7qlm0dHwu.f_13487)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13488, Items.ENDER_EYE, m_4735(Class_SluWNIC7qlm0dHwu.f_13489)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13490, Items.DRIED_KELP, m_4735(Class_SluWNIC7qlm0dHwu.f_13491)),
      m_4737(
         Class_SluWNIC7qlm0dHwu.f_13492,
         Items.NETHERITE_SWORD,
         List.of(),
         List.of(m_4721(Enchantments.KNOCKBACK, 0)),
         List.of(
            m_4735(Class_SluWNIC7qlm0dHwu.f_13493),
            m_4732(Class_SluWNIC7qlm0dHwu.f_13494, 3),
            m_4732(Class_SluWNIC7qlm0dHwu.f_13495, 2),
            m_4732(Class_SluWNIC7qlm0dHwu.f_13496, 2),
            m_4732(Class_SluWNIC7qlm0dHwu.f_13497, 3),
            m_4732(Class_SluWNIC7qlm0dHwu.f_13498, 3)
         ),
         List.of(),
         List.of()
      ),
      m_4733(
         Class_SluWNIC7qlm0dHwu.f_13499,
         Items.MACE,
         m_4735(Class_SluWNIC7qlm0dHwu.f_13500),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13501, 3),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13502, 2),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13503, 2),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13504, 3),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13505, 3)
      ),
      m_4733(
         Class_SluWNIC7qlm0dHwu.f_13506,
         Items.TRIDENT,
         m_4735(Class_SluWNIC7qlm0dHwu.f_13507),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13508, 3),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13509, 3),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13510, 2),
         m_4735(Class_SluWNIC7qlm0dHwu.f_13511),
         m_4735(Class_SluWNIC7qlm0dHwu.f_13512)
      ),
      m_4733(
         Class_SluWNIC7qlm0dHwu.f_13513,
         Items.NETHERITE_PICKAXE,
         m_4735(Class_SluWNIC7qlm0dHwu.f_13514),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13515, 2),
         m_4732(Class_SluWNIC7qlm0dHwu.f_13516, 3),
         m_4735(Class_SluWNIC7qlm0dHwu.f_13517),
         m_4735(Class_SluWNIC7qlm0dHwu.f_13518),
         m_4735(Class_SluWNIC7qlm0dHwu.f_13519),
         m_4735(Class_SluWNIC7qlm0dHwu.f_13520)
      ),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13521, Items.CROSSBOW, m_4735(Class_SluWNIC7qlm0dHwu.f_13522)),
      m_4736(
         Class_SluWNIC7qlm0dHwu.f_13523,
         Items.NETHERITE_HELMET,
         m_4722(Enchantments.PROTECTION, 5),
         m_4722(Enchantments.FIRE_PROTECTION, 5),
         m_4722(Enchantments.BLAST_PROTECTION, 5),
         m_4722(Enchantments.PROJECTILE_PROTECTION, 5),
         m_4722(Enchantments.UNBREAKING, 5),
         m_4722(Enchantments.MENDING, 1),
         m_4722(Enchantments.AQUA_AFFINITY, 1),
         m_4722(Enchantments.RESPIRATION, 3),
         m_4721(Enchantments.THORNS, 0)
      ),
      m_4736(
         Class_SluWNIC7qlm0dHwu.f_13524,
         Items.NETHERITE_CHESTPLATE,
         m_4722(Enchantments.PROTECTION, 5),
         m_4722(Enchantments.FIRE_PROTECTION, 5),
         m_4722(Enchantments.BLAST_PROTECTION, 5),
         m_4722(Enchantments.PROJECTILE_PROTECTION, 5),
         m_4722(Enchantments.UNBREAKING, 5),
         m_4722(Enchantments.MENDING, 1),
         m_4721(Enchantments.THORNS, 0)
      ),
      m_4736(
         Class_SluWNIC7qlm0dHwu.f_13525,
         Items.NETHERITE_LEGGINGS,
         m_4722(Enchantments.PROTECTION, 5),
         m_4722(Enchantments.FIRE_PROTECTION, 5),
         m_4722(Enchantments.BLAST_PROTECTION, 5),
         m_4722(Enchantments.PROJECTILE_PROTECTION, 5),
         m_4722(Enchantments.UNBREAKING, 5),
         m_4722(Enchantments.MENDING, 1),
         m_4721(Enchantments.THORNS, 0)
      ),
      m_4736(
         Class_SluWNIC7qlm0dHwu.f_13526,
         Items.NETHERITE_BOOTS,
         m_4722(Enchantments.PROTECTION, 5),
         m_4722(Enchantments.FIRE_PROTECTION, 5),
         m_4722(Enchantments.BLAST_PROTECTION, 5),
         m_4722(Enchantments.PROJECTILE_PROTECTION, 5),
         m_4722(Enchantments.UNBREAKING, 5),
         m_4722(Enchantments.MENDING, 1),
         m_4722(Enchantments.FEATHER_FALLING, 4),
         m_4722(Enchantments.SOUL_SPEED, 3),
         m_4722(Enchantments.DEPTH_STRIDER, 3),
         m_4721(Enchantments.THORNS, 0)
      ),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13527, Items.TRIPWIRE_HOOK, m_4735(Class_SluWNIC7qlm0dHwu.f_13528)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13529, Items.GOLDEN_PICKAXE, m_4735(Class_SluWNIC7qlm0dHwu.f_13530)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13531, Items.GOLDEN_PICKAXE, m_4735(Class_SluWNIC7qlm0dHwu.f_13532)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13533, Items.CAMPFIRE, m_4735(Class_SluWNIC7qlm0dHwu.f_13534)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13535, Items.CAMPFIRE, m_4735(Class_SluWNIC7qlm0dHwu.f_13536)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13537, Items.SOUL_CAMPFIRE, m_4735(Class_SluWNIC7qlm0dHwu.f_13538)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13539, Items.PAPER, m_4735(Class_SluWNIC7qlm0dHwu.f_13540)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13541, Items.PAPER, m_4735(Class_SluWNIC7qlm0dHwu.f_13542)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13543, Items.STRUCTURE_BLOCK, m_4735(Class_SluWNIC7qlm0dHwu.f_13544)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13545, Items.STRUCTURE_BLOCK, m_4735(Class_SluWNIC7qlm0dHwu.f_13546)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13547, Items.STRUCTURE_BLOCK, m_4735(Class_SluWNIC7qlm0dHwu.f_13548)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13549, Items.CHAIN_COMMAND_BLOCK, m_4735(Class_SluWNIC7qlm0dHwu.f_13550)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13551, Items.REDSTONE_TORCH, m_4735(Class_SluWNIC7qlm0dHwu.f_13552)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13553, Items.JIGSAW, m_4735(Class_SluWNIC7qlm0dHwu.f_13554)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13555, Items.FEATHER, m_4735(Class_SluWNIC7qlm0dHwu.f_13556)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13557, Items.AMETHYST_SHARD, m_4735(Class_SluWNIC7qlm0dHwu.f_13558)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13559, Items.TRIAL_KEY, m_4735(Class_SluWNIC7qlm0dHwu.f_13560)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13561, Items.TRIAL_KEY, m_4735(Class_SluWNIC7qlm0dHwu.f_13562)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13563, Items.TNT, m_4735(Class_SluWNIC7qlm0dHwu.f_13564), m_4723(Class_SluWNIC7qlm0dHwu.f_13565)),
      m_4733(Class_SluWNIC7qlm0dHwu.f_13566, Items.TNT, m_4735(Class_SluWNIC7qlm0dHwu.f_13567)),
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13568,
         Items.TIPPED_ARROW,
         m_4730(MobEffects.WEAKNESS, 3, 60),
         m_4730(MobEffects.BLINDNESS, 1, 40),
         m_4730(MobEffects.MINING_FATIGUE, 1, 40),
         m_4730(MobEffects.NAUSEA, 1, 100)
      ),
      m_4727(Class_SluWNIC7qlm0dHwu.f_13569, Items.TIPPED_ARROW, m_4730(MobEffects.SLOWNESS, 10, 100), m_4730(MobEffects.MINING_FATIGUE, 3, 40)),
      m_4727(
         Class_SluWNIC7qlm0dHwu.f_13570,
         Items.TIPPED_ARROW,
         m_4730(MobEffects.SLOWNESS, 3, 100),
         m_4730(MobEffects.WITHER, 3, 100),
         m_4730(MobEffects.POISON, 3, 100)
      ),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13571, Items.GOLDEN_APPLE),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13572, Items.ENCHANTED_GOLDEN_APPLE),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13573, Items.SPAWNER),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13574, Items.EMERALD_ORE),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13575, Items.DRAGON_HEAD),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13576, Items.DRAGON_EGG),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13577, Items.ELYTRA),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13578, Items.BEACON),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13579, Items.VILLAGER_SPAWN_EGG),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13580, Items.ENDERMAN_SPAWN_EGG),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13581, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13582, Items.DIAMOND),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13583, Items.NETHER_STAR),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13584, Items.ANCIENT_DEBRIS),
      m_4726(Class_SluWNIC7qlm0dHwu.f_13585, Items.NETHERITE_INGOT)
   );
   private static final String f_13387 = "§.";
   private static final String f_13388 = "\\s+";
   private static final String f_13389 = "\\[\\d+x\\d+]";
   private static final String f_13390 = "⚡";
   private static final String f_13391 = "xxx";
   private static final String f_13392 = "[";
   private static final String f_13393 = "]";
   private static final String f_13394 = "★";
   private static final String f_13395 = "§.";
   private static final String f_13396 = "\\s+";
   private static final String f_13397 = "i";
   private static final String f_13398 = "ii";
   private static final String f_13399 = "iii";
   private static final String f_13400 = "iv";
   private static final String f_13401 = "v";
   private static final String f_13402 = "vi";
   private static final String f_13403 = "vii";
   private static final String f_13404 = "viii";
   private static final String f_13405 = "ix";
   private static final String f_13406 = "x";
   private static final String f_13407 = "[^0-9]";
   private static final String f_13408 = "[★] Хлопушка";
   private static final String f_13409 = "[★] Святая вода";
   private static final String f_13410 = "[★] Зелье Гнева";
   private static final String f_13411 = "[★] Зелье Палладина";
   private static final String f_13412 = "[★] Зелье Ассасина";
   private static final String f_13413 = "[★] Зелье Радиации";
   private static final String f_13414 = "[★] Снотворное";
   private static final String f_13415 = "[★] Талисман Крушителя";
   private static final double f_13416 = 4.0;
   private static final double f_13417 = 3.0;
   private static final double f_13418 = 2.0;
   private static final double f_13419 = 2.0;
   private static final String f_13420 = "[★] Талисман Раздора";
   private static final double f_13421 = 4.0;
   private static final double f_13422 = 2.0;
   private static final double f_13423 = 0.10000001817743467;
   private static final double f_13424 = 0.10000001817743467;
   private static final double f_13425 = -3.0;
   private static final String f_13426 = "[★] Талисман Тирана";
   private static final double f_13427 = 2.0;
   private static final double f_13428 = 2.0;
   private static final double f_13429 = -4.0;
   private static final String f_13430 = "[★] Талисман Ярости";
   private static final double f_13431 = 5.0;
   private static final double f_13432 = -4.0;
   private static final String f_13433 = "[★] Талисман Вихря";
   private static final double f_13434 = 2.0;
   private static final double f_13435 = 0.1500000347540806;
   private static final double f_13436 = 0.1500000347540806;
   private static final String f_13437 = "[★] Талисман Мрака";
   private static final double f_13438 = 1.5;
   private static final double f_13439 = 1.5;
   private static final String f_13440 = "[★] Талисман Демона";
   private static final double f_13441 = 2.5;
   private static final double f_13442 = 0.10000001817743467;
   private static final String f_13443 = "[★] Талисман Карателя xxx";
   private static final double f_13444 = 7.0;
   private static final double f_13445 = -4.0;
   private static final double f_13446 = 0.10000001817743467;
   private static final String f_13447 = "[★] Сфера Хаоса";
   private static final double f_13448 = -4.0;
   private static final double f_13449 = 1.5;
   private static final double f_13450 = 2.5;
   private static final double f_13451 = 0.07000004566537438;
   private static final double f_13452 = 0.13000000024761527;
   private static final double f_13453 = 0.09000001839414021;
   private static final String f_13454 = "[★] Сфера Сатира";
   private static final double f_13455 = 2.0;
   private static final double f_13456 = -0.10000000768432185;
   private static final double f_13457 = 0.1500000347540806;
   private static final String f_13458 = "[★] Сфера Бестии";
   private static final double f_13459 = 4.0;
   private static final double f_13460 = 0.10000001817743467;
   private static final double f_13461 = 0.10000001817743467;
   private static final String f_13462 = "[★] Сфера Ареса";
   private static final double f_13463 = 6.0;
   private static final double f_13464 = -2.0;
   private static final double f_13465 = -2.0;
   private static final String f_13466 = "[★] Сфера Гидры";
   private static final double f_13467 = 4.0;
   private static final double f_13468 = 2.0;
   private static final double f_13469 = 0.5;
   private static final double f_13470 = 0.5;
   private static final String f_13471 = "[★] Сфера Икара";
   private static final double f_13472 = 2.0;
   private static final double f_13473 = 2.0;
   private static final String f_13474 = "[★] Сфера Эрида";
   private static final double f_13475 = 2.0;
   private static final String f_13476 = "[★] Сфера Титана";
   private static final double f_13477 = 2.5;
   private static final double f_13478 = 2.5;
   private static final double f_13479 = -0.15000007945819008;
   private static final String f_13480 = "[★] Трапка";
   private static final String f_13481 = "Каст: Нерушимая клетка";
   private static final String f_13482 = "[★] Явная пыль";
   private static final String f_13483 = "Каст: Световая вспышка";
   private static final String f_13484 = "[★] Снежок заморозка";
   private static final String f_13485 = "Каст: Ледяная сфера";
   private static final String f_13486 = "[★] Божья аура";
   private static final String f_13487 = "Каст: Божественная аура";
   private static final String f_13488 = "[★] Дезориентация";
   private static final String f_13489 = "Каст: Звуковая волна";
   private static final String f_13490 = "[★] Пласт";
   private static final String f_13491 = "Каст: Нерушимая стена";
   private static final String f_13492 = "xxx Меч Крушителя xxx";
   private static final String f_13493 = "[★] Оригинальный предмет";
   private static final String f_13494 = "Опытный";
   private static final String f_13495 = "Вампиризм";
   private static final String f_13496 = "Окисление";
   private static final String f_13497 = "Яд";
   private static final String f_13498 = "Детекция";
   private static final String f_13499 = "xxx Булава Крушителя xxx";
   private static final String f_13500 = "[★] Оригинальный предмет";
   private static final String f_13501 = "Опытный";
   private static final String f_13502 = "Вампиризм";
   private static final String f_13503 = "Окисление";
   private static final String f_13504 = "Яд";
   private static final String f_13505 = "Детекция";
   private static final String f_13506 = "xxx Трезубец Крушителя xxx";
   private static final String f_13507 = "[★] Оригинальный предмет";
   private static final String f_13508 = "Скаут";
   private static final String f_13509 = "Ступор";
   private static final String f_13510 = "Притяжение";
   private static final String f_13511 = "Возвращение";
   private static final String f_13512 = "Подрывник";
   private static final String f_13513 = "xxx Кирка Крушителя xxx";
   private static final String f_13514 = "[★] Оригинальный предмет";
   private static final String f_13515 = "Бульдозер";
   private static final String f_13516 = "Опытный";
   private static final String f_13517 = "Магнит";
   private static final String f_13518 = "Авто-Плавка";
   private static final String f_13519 = "Паутина";
   private static final String f_13520 = "Пингер";
   private static final String f_13521 = "xxx Арбалет Крушителя xxx";
   private static final String f_13522 = "[★] Оригинальный предмет";
   private static final String f_13523 = "xxx Шлем Крушителя xxx";
   private static final String f_13524 = "xxx Нагрудник Крушителя xxx";
   private static final String f_13525 = "xxx Поножи Крушителя xxx";
   private static final String f_13526 = "xxx Ботинки Крушителя xxx";
   private static final String f_13527 = "[★] Отмычка к Сферам";
   private static final String f_13528 = "С Сферами";
   private static final String f_13529 = "[★] Божье касание";
   private static final String f_13530 = "Может добыть спавнер";
   private static final String f_13531 = "[★] Мощный удар";
   private static final String f_13532 = "Может разрушить бедрок";
   private static final String f_13533 = "Обычный мист";
   private static final String f_13534 = "Уровень лута: Обычный";
   private static final String f_13535 = "Богатый мист";
   private static final String f_13536 = "Уровень лута: Богатый";
   private static final String f_13537 = "Легендарный мист";
   private static final String f_13538 = "Уровень лута: Легендарный";
   private static final String f_13539 = "[★] Неизбежный скин";
   private static final String f_13540 = "получаете Неизбежный скин";
   private static final String f_13541 = "[★] Драконий скин";
   private static final String f_13542 = "получаете Драконий скин";
   private static final String f_13543 = "[★] Прогрузчик чанков [1x1]";
   private static final String f_13544 = "прогружаемой области (1x1)";
   private static final String f_13545 = "[★] Прогрузчик чанков [3x3]";
   private static final String f_13546 = "прогружаемой области (3x3)";
   private static final String f_13547 = "[★] Прогрузчик чанков [5x5]";
   private static final String f_13548 = "прогружаемой области (5x5)";
   private static final String f_13549 = "[★] Регион 25x25";
   private static final String f_13550 = "Размер: 25x25 блоков";
   private static final String f_13551 = "[★] Аирдроп";
   private static final String f_13552 = "призыва Аирдропа";
   private static final String f_13553 = "[★] Блок дамагер";
   private static final String f_13554 = "Каст: Нанесение урона";
   private static final String f_13555 = "[⚡] Модификатор полёта";
   private static final String f_13556 = "Доступ к /fly";
   private static final String f_13557 = "[⚡] Модификатор починки";
   private static final String f_13558 = "Доступ к /fix";
   private static final String f_13559 = "[★] Ключ от кейса с Привилегиями";
   private static final String f_13560 = "Открывает: Кейс с Привилегиями";
   private static final String f_13561 = "[★] Ключ от кейса с Токенами";
   private static final String f_13562 = "Открывает: Кейс с Токенами";
   private static final String f_13563 = "[★] Вайт";
   private static final String f_13564 = "в 10 раз сильнее обычного";
   private static final String f_13565 = "способен взорвать обсидиан";
   private static final String f_13566 = "[★] Блэк";
   private static final String f_13567 = "способен взорвать обсидиан";
   private static final String f_13568 = "Кровавая стрела";
   private static final String f_13569 = "Стрела обледенения";
   private static final String f_13570 = "Мучительная стрела";
   private static final String f_13571 = "Золотое яблоко";
   private static final String f_13572 = "Чарка";
   private static final String f_13573 = "Спавнер";
   private static final String f_13574 = "Изумрудная руда";
   private static final String f_13575 = "Голова дракона";
   private static final String f_13576 = "Яйцо дракона";
   private static final String f_13577 = "Элитры";
   private static final String f_13578 = "Маяк";
   private static final String f_13579 = "Яйцо призыва крестьянина";
   private static final String f_13580 = "Яйцо призыва эндермена";
   private static final String f_13581 = "Отделка незеритовая";
   private static final String f_13582 = "Алмаз";
   private static final String f_13583 = "Звезда Незера";
   private static final String f_13584 = "Древние обломки";
   private static final String f_13585 = "Незеритовый слиток";

   private static Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO m_4721(ResourceKey<Enchantment> var0, int var1) {
      return new Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO(var0, var1, true);
   }

   private static Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO m_4722(ResourceKey<Enchantment> var0, int var1) {
      return new Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO(var0, var1, false);
   }

   private static Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ m_4723(String var0) {
      return new Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ(var0, 0, true);
   }

   private static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_4724(String var0, Item var1, Class_SluWNIC7qlm0dHwu.mlsXZP0z72gruH7X... var2) {
      return m_4737(var0, var1, List.of(var2), List.of(), List.of(), List.of(), List.of());
   }

   private static String m_4725(String var0) {
      return var0.replaceAll(f_13389, "")
         .replace(f_13390, "")
         .replace(f_13391, "")
         .replace(f_13392, "")
         .replace(f_13393, "")
         .replace(f_13394, "")
         .replaceAll(f_13395, "")
         .toLowerCase()
         .replaceAll(f_13396, "")
         .trim();
   }

   private static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_4726(String var0, Item var1) {
      return m_4737(var0, var1, List.of(), List.of(), List.of(), List.of(), List.of());
   }

   private static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_4727(String var0, Item var1, Class_SluWNIC7qlm0dHwu.hfwnl1WoqTScPrcr... var2) {
      return m_4737(var0, var1, List.of(), List.of(), List.of(), List.of(), List.of(var2));
   }

   private Class_SluWNIC7qlm0dHwu() {
   }

   private static Class_SluWNIC7qlm0dHwu.mlsXZP0z72gruH7X m_4728(Holder<Attribute> var0, double var1, Operation var3) {
      return new Class_SluWNIC7qlm0dHwu.mlsXZP0z72gruH7X(var0, var1, var3);
   }

   private static String m_4729(String var0) {
      return var0.replaceAll(f_13387, "").toLowerCase().replaceAll(f_13388, "").trim();
   }

   private static Class_SluWNIC7qlm0dHwu.hfwnl1WoqTScPrcr m_4730(Holder<MobEffect> var0, int var1, int var2) {
      return new Class_SluWNIC7qlm0dHwu.hfwnl1WoqTScPrcr(var0, var1, var2);
   }

   public static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_4731(ItemStack var0) {
      for (Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var2 : f_13386) {
         if (var2.matches(var0)) {
            return var2;
         }
      }

      if (var0.getCustomName() == null) {
         return null;
      }

      String var4 = m_4725(var0.getCustomName().getString());

      for (Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var3 : f_13386) {
         if (var0.is(var3.item()) && m_4725(var3.name()).equals(var4)) {
            return var3;
         }
      }

      return null;
   }

   private static Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ m_4732(String var0, int var1) {
      return new Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ(var0, var1, false);
   }

   private static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_4733(String var0, Item var1, Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ... var2) {
      return m_4737(var0, var1, List.of(), List.of(), List.of(var2), List.of(), List.of());
   }

   private static int m_4734(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = m_4729(var0);
         String[] var2 = new String[]{f_13397, f_13398, f_13399, f_13400, f_13401, f_13402, f_13403, f_13404, f_13405, f_13406};

         for (int var3 = var2.length - 1; var3 >= 0; var3--) {
            if (var1.contains(var2[var3])) {
               return var3 + 1;
            }
         }

         String var5 = var1.replaceAll(f_13407, "");
         if (!var5.isEmpty()) {
            int var4 = Integer.parseInt(var5);
            if (var4 >= 1 && var4 <= 10) {
               return var4;
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   private static Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ m_4735(String var0) {
      return new Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ(var0, 0, false);
   }

   private static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_4736(String var0, Item var1, Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO... var2) {
      return m_4737(var0, var1, List.of(), List.of(var2), List.of(), List.of(), List.of());
   }

   private static Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP m_4737(
      String var0,
      Item var1,
      List<Class_SluWNIC7qlm0dHwu.mlsXZP0z72gruH7X> var2,
      List<Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO> var3,
      List<Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ> var4,
      List<Class_SluWNIC7qlm0dHwu.Class_3nIMZpm0kv6gqQl4> var5,
      List<Class_SluWNIC7qlm0dHwu.hfwnl1WoqTScPrcr> var6
   ) {
      return new Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP(var0, var1, var2, var3, var4, var5, var6);
   }

   private record Class_3nIMZpm0kv6gqQl4(String value) {
      public boolean matches(ItemStack var1) {
         if (Class_NzJrN63M7QBpmAbi.f_11537.level == null) {
            return false;
         }

         Tag var2 = (Tag)ItemStack.CODEC
            .encodeStart(Class_NzJrN63M7QBpmAbi.f_11537.level.registryAccess().createSerializationContext(NbtOps.INSTANCE), var1)
            .result()
            .orElse(null);
         return var2 != null && Class_SluWNIC7qlm0dHwu.m_4729(var2.toString()).contains(Class_SluWNIC7qlm0dHwu.m_4729(this.value));
      }
   }

   public record Class_3w2x36ewkoAH3rZP(
      String name,
      Item item,
      List<Class_SluWNIC7qlm0dHwu.mlsXZP0z72gruH7X> attributes,
      List<Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO> enchantments,
      List<Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ> descriptions,
      List<Class_SluWNIC7qlm0dHwu.Class_3nIMZpm0kv6gqQl4> nbt,
      List<Class_SluWNIC7qlm0dHwu.hfwnl1WoqTScPrcr> potions
   ) {
      public ItemStack stack() {
         ItemStack var1 = new ItemStack(this.item);
         if (this.potions.isEmpty()) {
            return var1;
         }

         Optional var2 = switch (this.name) {
            case "[★] Хлопушка" -> Optional.of(16711680);
            case "[★] Святая вода" -> Optional.of(16777215);
            case "[★] Зелье Гнева" -> Optional.of(10040115);
            case "[★] Зелье Палладина" -> Optional.of(65535);
            case "[★] Зелье Ассасина" -> Optional.of(3355443);
            case "[★] Зелье Радиации" -> Optional.of(3329330);
            case "[★] Снотворное" -> Optional.of(4737096);
            default -> Optional.empty();
         };
         List var5 = this.potions.stream().map(var0 -> new MobEffectInstance(var0.effect(), var0.duration(), var0.level() - 1)).toList();
         var1.set(DataComponents.POTION_CONTENTS, new PotionContents(Optional.empty(), var2, var5, Optional.empty()));
         return var1;
      }

      public boolean matches(ItemStack var1) {
         if (!var1.is(this.item)) {
            return false;
         }

         for (Class_SluWNIC7qlm0dHwu.mlsXZP0z72gruH7X var3 : this.attributes) {
            if (!var3.matches(var1)) {
               return false;
            }
         }

         for (Class_SluWNIC7qlm0dHwu.fuB2p3xIucctupIO var8 : this.enchantments) {
            if (!var8.matches(var1)) {
               return false;
            }
         }

         for (Class_SluWNIC7qlm0dHwu.klbLVeGNGD2tfvOZ var9 : this.descriptions) {
            if (!var9.matches(var1)) {
               return false;
            }
         }

         for (Class_SluWNIC7qlm0dHwu.Class_3nIMZpm0kv6gqQl4 var10 : this.nbt) {
            if (!var10.matches(var1)) {
               return false;
            }
         }

         for (Class_SluWNIC7qlm0dHwu.hfwnl1WoqTScPrcr var11 : this.potions) {
            if (!var11.matches(var1)) {
               return false;
            }
         }

         return true;
      }
   }

   private record fuB2p3xIucctupIO(ResourceKey<Enchantment> enchantment, int level, boolean denied) {
      public boolean matches(ItemStack var1) {
         Reference var2 = Class_NzJrN63M7QBpmAbi.f_11537.level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(this.enchantment);
         ItemEnchantments var3 = (ItemEnchantments)var1.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY);
         int var4 = var3.getLevel(var2);
         int var5 = this.level == 0 ? 1 : this.level;
         return this.denied ? var4 < var5 : !var3.isEmpty() && var4 >= var5;
      }
   }

   private record hfwnl1WoqTScPrcr(Holder<MobEffect> effect, int level, int duration) {
      public boolean matches(ItemStack var1) {
         PotionContents var2 = (PotionContents)var1.get(DataComponents.POTION_CONTENTS);
         return var2 == null
            ? false
            : StreamSupport.<MobEffectInstance>stream(var2.getAllEffects().spliterator(), false)
               .anyMatch(var1x -> var1x.getEffect().equals(this.effect) && var1x.getAmplifier() + 1 == this.level && var1x.getDuration() >= this.duration);
      }
   }

   private record klbLVeGNGD2tfvOZ(String description, int level, boolean denied) {
      public boolean matches(ItemStack var1) {
         String var2 = var1.getTooltipLines(TooltipContext.EMPTY, Class_NzJrN63M7QBpmAbi.f_11537.player, TooltipFlag.NORMAL)
            .stream()
            .skip(1L)
            .map(var0 -> Class_SluWNIC7qlm0dHwu.m_4729(var0.getString()))
            .collect(Collectors.joining(""));
         String var3 = Class_SluWNIC7qlm0dHwu.m_4729(this.description);
         if (this.denied) {
            return !var2.contains(var3);
         }

         if (!var2.contains(var3)) {
            return false;
         }

         if (this.level == 0) {
            return true;
         }

         String var4 = var2.substring(var2.indexOf(var3) + var3.length()).trim();
         int var5 = var4.indexOf(32);
         int var6 = var4.isEmpty() ? 0 : Class_SluWNIC7qlm0dHwu.m_4734(var5 > 0 ? var4.substring(0, var5) : var4);
         return Math.max(1, var6) >= this.level;
      }
   }

   private record mlsXZP0z72gruH7X(Holder<Attribute> attribute, double amount, Operation operation) {
      public boolean matches(ItemStack var1) {
         ItemAttributeModifiers var2 = (ItemAttributeModifiers)var1.getOrDefault(DataComponents.ATTRIBUTE_MODIFIERS, ItemAttributeModifiers.EMPTY);

         for (Entry var4 : var2.modifiers()) {
            if (var4.attribute().equals(this.attribute)
               && Math.abs(var4.modifier().amount() - this.amount) < 9.9999942618434E-4
               && var4.modifier().operation() == this.operation) {
               return true;
            }
         }

         return false;
      }
   }
}
