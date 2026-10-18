package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_EndlYW7bFBb6ZTsy;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.ItemAttributeModifiers.Entry;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

public class Jesus extends Module {
   private final MultiChoiceSetting f_11691;
   private final ItemListSetting f_11692;
   private final SliderSetting f_11693;
   private final SliderSetting f_11694;
   private final SliderSetting f_11695;
   private final SliderSetting f_11696;
   private long f_11697;
   private long f_11698;
   private float f_11699;
   private long f_11700;
   private boolean f_11701;
   private Boolean f_11702;
   private long f_11703;
   private float f_11704;
   private float f_11705;
   private int f_11706;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_11707;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_11708;
   private final Class_gEPk7yDw6CwIte87<Class_EndlYW7bFBb6ZTsy> f_11709;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_11710;
   private static final String f_11711 = "Jesus";
   private static final String f_11712 = "Ходьба по воде";
   private static final String f_11713 = "Mode";
   private static final String f_11714 = "MetaHvH";
   private static final String f_11715 = "Дополнения";
   private static final String f_11716 = "Авто буст";
   private static final String f_11717 = "Интервал бустов";
   private static final float f_11718 = 1200.0F;
   private static final float f_11719 = 800.0F;
   private static final float f_11720 = 2000.0F;
   private static final float f_11721 = 50.0F;
   private static final String f_11722 = "Сила авто буста";
   private static final float f_11723 = 0.1F;
   private static final float f_11724 = 0.05F;
   private static final float f_11725 = 1.5F;
   private static final float f_11726 = 0.01F;
   private static final String f_11727 = "Длительность буста";
   private static final float f_11728 = 300.0F;
   private static final float f_11729 = 200.0F;
   private static final float f_11730 = 1000.0F;
   private static final float f_11731 = 50.0F;
   private static final String f_11732 = "Антифлаг";
   private static final float f_11733 = 4000.0F;
   private static final float f_11734 = 2000.0F;
   private static final float f_11735 = 15000.0F;
   private static final float f_11736 = 500.0F;
   private static final String f_11737 = "minecraft:generic.armor";
   private static final String f_11738 = "minecraft:armor";
   private static final String f_11739 = "generic.armor";
   private static final double f_11740 = 3.5;
   private static final String f_11741 = "minecraft:generic.armor_toughness";
   private static final String f_11742 = "minecraft:armor_toughness";
   private static final String f_11743 = "generic.armor_toughness";
   private static final double f_11744 = 3.0;
   private static final String f_11745 = "minecraft:generic.attack_damage";
   private static final String f_11746 = "minecraft:attack_damage";
   private static final String f_11747 = "generic.attack_damage";
   private static final double f_11748 = 3.0;
   private static final String f_11749 = "minecraft:generic.movement_speed";
   private static final String f_11750 = "minecraft:movement_speed";
   private static final String f_11751 = "generic.movement_speed";
   private static final double f_11752 = 0.1;
   private static final String f_11753 = "minecraft:generic.movement_speed";
   private static final String f_11754 = "minecraft:movement_speed";
   private static final String f_11755 = "generic.movement_speed";
   private static final float f_11756 = 2.1F;
   private static final long f_11757 = 30L;
   private static final float f_11758 = 0.36F;
   private static final float f_11759 = 0.2F;
   private static final float f_11760 = 0.15F;
   private static final float f_11761 = 1.25F;
   private static final float f_11762 = 0.8F;
   private static final String f_11763 = "Авто буст";
   private static final long f_11764 = 1500L;
   private static final double f_11765 = 0.25;
   private static final long f_11766 = 30L;
   private static final float f_11767 = 0.25F;
   private static final float f_11768 = 0.9445F;
   private static final float f_11769 = 1.012F;
   private static final float f_11770 = 0.595F;
   private static final float f_11771 = 0.2F;
   private static final float f_11772 = 0.15F;
   private static final float f_11773 = 1.25F;
   private static final String f_11774 = "MetaHvH";
   private static final double f_11775 = -0.01;
   private static final String f_11776 = "MetaHvH";
   private static final double f_11777 = 0.3F;
   private static final String f_11778 = "Smooth";
   private static final String f_11779 = "MetaHvH";
   private static final double f_11780 = -0.01;
   private static final double f_11781 = 0.1;
   private static final double f_11782 = 1.0E-4;
   private static final String f_11783 = "AttributeModifiers";
   private static final String f_11784 = "AttributeName";
   private static final String f_11785 = "Amount";
   private static final String f_11786 = "Operation";
   private static final String f_11787 = "Авто буст";
   private static final String f_11788 = "Авто буст";
   private static final String f_11789 = "Авто буст";
   private static final String f_11790 = "Авто буст";

   private boolean m_4127() {
      ItemStack var1 = f_11537.player.getItemBySlot(EquipmentSlot.FEET);
      return var1 != null && !var1.isEmpty();
   }

   private void m_4128() {
      if (!this.f_11692.m_7145(f_11763) || this.m_4151()) {
         this.f_11699 = 0.0F;
      } else if (this.f_11706 <= 0) {
         long var1 = System.currentTimeMillis();
         if (this.m_4136(var1)) {
            this.f_11699 = 0.0F;
         } else {
            long var3 = this.f_11701 ? f_11764 : this.f_11693.m_8768().longValue();
            if (var1 - this.f_11697 >= var3) {
               this.f_11697 = var1;
               this.f_11698 = var1 + this.f_11695.m_8768().longValue();
               this.f_11699 = this.f_11694.m_8768();
               this.f_11701 = false;
            }

            if (this.f_11698 > 0L && var1 >= this.f_11698) {
               this.f_11699 = 0.0F;
            }
         }
      }
   }

   private boolean m_4129() {
      BlockPos var1 = f_11537.player.blockPosition();
      return f_11537.level.getBlockState(var1).is(Blocks.WATER);
   }

   private void m_4131(Class_EndlYW7bFBb6ZTsy var1, double var2) {
      if (!Class_QBKwWNWLlChWViO9.m_4256()) {
         this.m_4154(var1, 0.0, 0.0);
      } else {
         Class_QBKwWNWLlChWViO9.m_4264(var2);
         Vec3 var4 = f_11537.player.getDeltaMovement();
         this.m_4154(var1, var4.x, var4.z);
      }
   }

   private void m_4133(Class_XzpX8S5F5zd9jbuE var1) {
      if (f_11537.player != null) {
         if (var1.m_5619() instanceof ClientboundPlayerPositionPacket) {
            this.f_11700 = System.currentTimeMillis();
            this.f_11699 = 0.0F;
            this.f_11706 = 5;
            this.f_11701 = true;
         }
      }
   }

   private void m_4134(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.m_4127()) {
            boolean var2 = this.m_4129() && this.f_11691.m_7568(f_11774) && this.m_4135() && !f_11537.player.isSwimming();
            if (var2) {
               this.m_4128();
               this.m_4152(f_11775);
            }

            this.m_4148(var2);
         }
      }
   }

   private boolean m_4135() {
      MobEffectInstance var1 = f_11537.player.getEffect(MobEffects.SLOWNESS);
      int var2 = var1 != null ? var1.getAmplifier() + 1 : 0;
      return var2 < 4;
   }

   private boolean m_4136(long var1) {
      long var3 = this.f_11696.m_8768().longValue();
      return var3 > 0L && var1 - this.f_11700 < var3;
   }

   private List<Jesus.d6NwZQmkCJTTThdr> m_4137(ItemStack var1) {
      ArrayList var2 = new ArrayList();
      if (var1 != null && !var1.isEmpty()) {
         ItemAttributeModifiers var3 = (ItemAttributeModifiers)var1.get(DataComponents.ATTRIBUTE_MODIFIERS);
         if (var3 != null) {
            for (Entry var5 : var3.modifiers()) {
               String var6 = var5.attribute().unwrapKey().map(var0 -> var0.identifier().toString()).orElse("");
               var2.add(new Jesus.d6NwZQmkCJTTThdr(var6, var5.modifier().amount(), this.m_4146(var5.modifier().operation())));
            }
         }

         CustomData var7 = (CustomData)var1.get(DataComponents.CUSTOM_DATA);
         if (var7 != null) {
            this.m_4140(var7.copyTag(), var2);
         }

         return var2;
      } else {
         return var2;
      }
   }

   private float m_4138(Holder<MobEffect> var1, float var2) {
      MobEffectInstance var3 = f_11537.player.getEffect(var1);
      return var3 != null ? var2 * (var3.getAmplifier() + 1) : 0.0F;
   }

   private void m_4140(CompoundTag var1, List<Jesus.d6NwZQmkCJTTThdr> var2) {
      Optional var3 = var1.getList(f_11783);
      if (!var3.isEmpty()) {
         for (Tag var5 : (ListTag)var3.get()) {
            if (var5 instanceof CompoundTag var6) {
               String var7 = var6.getString(f_11784).orElse("");
               double var8 = var6.getDouble(f_11785).orElse(0.0);
               int var10 = var6.getInt(f_11786).orElse(0);
               var2.add(new Jesus.d6NwZQmkCJTTThdr(var7, var8, var10));
            }
         }
      }
   }

   private float m_4141() {
      ItemStack var1 = f_11537.player.getOffhandItem();
      if (var1.isEmpty()) {
         return 0.0F;
      }

      for (Jesus.d6NwZQmkCJTTThdr var3 : this.m_4137(var1)) {
         if (var3.m_4126(f_11749, f_11750, f_11751)) {
            return switch (var3.operation()) {
               case 0 -> (float)(var3.amount() / f_11752);
               case 1, 2 -> (float)var3.amount();
               default -> 0.0F;
            };
         }
      }

      return 0.0F;
   }

   private void m_4142(Class_jfpiTZhNIuwDwqKr var1) {
      if (f_11537.player != null && f_11537.level != null) {
         boolean var2 = this.m_4129() && this.f_11691.m_7568(f_11779) && this.m_4135() && !f_11537.player.isSwimming();
         if (var2) {
            this.m_4128();
            this.m_4152(f_11780);
         }

         this.m_4148(var2);
      }
   }

   private void m_4143(Class_EndlYW7bFBb6ZTsy var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.m_4129() && this.f_11691.m_7568(f_11776) && this.m_4135() && !f_11537.player.isSwimming()) {
            double var2 = this.m_4150();
            if (var2 == f_11777 && !this.m_4151()) {
               this.m_4154(var1, 0.0, 0.0);
            }

            Aura var4 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
            if (f_11537.options.keyUp.isDown() && var4 != null && var4.m_1114() != null && var4.m_1115().m_7568(f_11778)) {
               double[] var5 = this.m_4149(var4.m_1114());
               this.m_4154(var1, var5[0] * var2, var5[1] * var2);
            } else {
               this.m_4131(var1, var2);
            }
         }
      }
   }

   private float m_4144() {
      ItemStack var1 = f_11537.player.getItemBySlot(EquipmentSlot.HEAD);
      if (var1 != null && !var1.isEmpty()) {
         for (Jesus.d6NwZQmkCJTTThdr var3 : this.m_4137(var1)) {
            if (var3.m_4126(f_11753, f_11754, f_11755) && var3.amount() < 0.0) {
               return (float)Math.abs(var3.amount());
            }
         }

         return 0.0F;
      } else {
         return 0.0F;
      }
   }

   private int m_4146(Operation var1) {
      return switch (var1) {
         case ADD_VALUE -> 0;
         case ADD_MULTIPLIED_BASE -> 1;
         case ADD_MULTIPLIED_TOTAL -> 2;
         default -> throw new MatchException(null, null);
      };
   }

   private boolean m_4147(ItemStack var1) {
      if (var1 != null && !var1.isEmpty() && var1.is(Items.PLAYER_HEAD)) {
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;

         for (Jesus.d6NwZQmkCJTTThdr var6 : this.m_4137(var1)) {
            if (var6.m_4126(f_11737, f_11738, f_11739) && var6.amount() == f_11740) {
               var2 = true;
            }

            if (var6.m_4126(f_11741, f_11742, f_11743) && var6.amount() == f_11744) {
               var3 = true;
            }

            if (var6.m_4126(f_11745, f_11746, f_11747) && var6.amount() == f_11748) {
               var4 = true;
            }
         }

         return var2 && var3 && var4;
      } else {
         return false;
      }
   }

   private void m_4148(boolean var1) {
      if (f_11537.options == null) {
         this.f_11702 = null;
      } else {
         if (var1) {
            if (this.f_11702 == null) {
               this.f_11702 = f_11537.options.keyJump.isDown();
            }

            f_11537.options.keyJump.setDown(true);
         } else if (this.f_11702 != null) {
            f_11537.options.keyJump.setDown(this.f_11702);
            this.f_11702 = null;
         }
      }
   }

   private double[] m_4149(LivingEntity var1) {
      if (var1 == null) {
         return new double[]{0.0, 0.0};
      }

      double var2 = f_11781;
      float var4 = var1.getYRot();
      double var5 = Math.toRadians(var4);
      double var7 = var1.getX() - Math.sin(var5) * var2;
      double var9 = var1.getZ() + Math.cos(var5) * var2;
      double var11 = var7 - f_11537.player.getX();
      double var13 = var9 - f_11537.player.getZ();
      double var15 = Math.hypot(var11, var13);
      return var15 < f_11782 ? new double[]{0.0, 0.0} : new double[]{var11 / var15, var13 / var15};
   }

   private double m_4150() {
      long var1 = System.currentTimeMillis();
      if (this.m_4136(var1)) {
         return this.m_4153();
      }

      if (this.f_11706 > 0) {
         this.f_11706--;
         return f_11765;
      }

      this.m_4128();
      if (this.m_4151()) {
         return this.m_4153();
      }

      if (var1 - this.f_11703 >= f_11766) {
         this.f_11704 = this.m_4141();
         this.f_11705 = this.m_4144();
         this.f_11703 = var1;
      }

      float var3 = f_11767;
      if (var1 < this.f_11698) {
         float var4 = this.f_11699;
         MobEffectInstance var5 = f_11537.player.getEffect(MobEffects.SPEED);
         if (var5 != null && var5.getAmplifier() >= 2) {
            var4 *= f_11768;
         }

         var4 *= f_11769 + this.f_11704 * f_11770;
         var4 += var4 * this.m_4138(MobEffects.SPEED, f_11771);
         var4 -= var4 * this.m_4138(MobEffects.SLOWNESS, f_11772);
         var4 -= var4 * this.f_11705 * f_11773;
         return var3 + var4;
      } else {
         return var3;
      }
   }

   public Jesus() {
      super(f_11711, f_11712, Category.MOVEMENT);
      this.f_11691 = new MultiChoiceSetting(f_11713, new Class_2ZaVm8TGDJ68TnJB(f_11714));
      this.f_11692 = new ItemListSetting(f_11715, new Class_2ZaVm8TGDJ68TnJB(f_11716, false));
      this.f_11693 = new SliderSetting(f_11717, f_11718, f_11719, f_11720).m_828(f_11721).m_822(() -> this.f_11692.m_7145(f_11790));
      this.f_11694 = new SliderSetting(f_11722, f_11723, f_11724, f_11725).m_828(f_11726).m_822(() -> this.f_11692.m_7145(f_11789));
      this.f_11695 = new SliderSetting(f_11727, f_11728, f_11729, f_11730).m_828(f_11731).m_822(() -> this.f_11692.m_7145(f_11788));
      this.f_11696 = new SliderSetting(f_11732, f_11733, f_11734, f_11735).m_828(f_11736).m_822(() -> this.f_11692.m_7145(f_11787));
      this.f_11707 = this::m_4133;
      this.f_11708 = this::m_4134;
      this.f_11709 = this::m_4143;
      this.f_11710 = this::m_4142;
      this.m_795(this.f_11691, this.f_11692, this.f_11694, this.f_11695, this.f_11693, this.f_11696);
   }

   private boolean m_4151() {
      return f_11537.player.hasEffect(MobEffects.DOLPHINS_GRACE);
   }

   @Override
   public void m_732() {
      this.m_4148(false);
      this.f_11699 = 0.0F;
      this.f_11703 = 0L;
      this.f_11704 = 0.0F;
      this.f_11705 = 0.0F;
      super.m_732();
   }

   private void m_4152(double var1) {
      Vec3 var3 = f_11537.player.getDeltaMovement();
      f_11537.player.setDeltaMovement(var3.x, var1, var3.z);
   }

   private float m_4153() {
      if (this.m_4151()) {
         return f_11756;
      }

      long var1 = System.currentTimeMillis();
      if (var1 - this.f_11703 >= f_11757) {
         this.f_11704 = this.m_4141();
         this.f_11705 = this.m_4144();
         this.f_11703 = var1;
      }

      float var3 = f_11758;
      var3 *= 1.0F + this.f_11704;
      var3 += var3 * this.m_4138(MobEffects.SPEED, f_11759);
      var3 -= var3 * this.m_4138(MobEffects.SLOWNESS, f_11760);
      var3 -= var3 * this.f_11705 * f_11761;
      if (this.f_11699 == 0.0F) {
         ItemStack var4 = f_11537.player.getItemBySlot(EquipmentSlot.HEAD);
         if (this.m_4147(var4)) {
            var3 *= f_11762;
         }
      }

      return var3;
   }

   private void m_4154(Class_EndlYW7bFBb6ZTsy var1, double var2, double var4) {
      Vec3 var6 = f_11537.player.getDeltaMovement();
      f_11537.player.setDeltaMovement(var2, var6.y, var4);
      Vec3 var7 = var1.m_2544();
      var1.m_2545(new Vec3(var2, var7.y, var4));
   }

   private record d6NwZQmkCJTTThdr(String name, double amount, int operation) {
      public boolean m_4126(String... var1) {
         String var2 = this.name == null ? "" : this.name.toLowerCase(Locale.ROOT);

         for (String var6 : var1) {
            String var7 = var6.toLowerCase(Locale.ROOT);
            if (var2.equals(var7) || var2.endsWith(":" + var7) || var2.endsWith("." + var7)) {
               return true;
            }
         }

         return false;
      }
   }
}
