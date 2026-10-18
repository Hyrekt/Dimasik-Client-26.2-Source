package dev.dimasik.client.system;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import lombok.Generated;
import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.Holder;
import net.minecraft.locale.Language;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.PlayerTeam;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class Class_QDKuoUmFaP1xpF1M implements Class_NzJrN63M7QBpmAbi {
   private static final long f_12003 = 1000L;
   private static final long f_12004 = 50L;
   private static final long f_12005 = 250L;
   private static final Vector4f f_12006 = new Vector4f(Class_QDKuoUmFaP1xpF1M.f_12103);
   private static final Vector4f f_12007 = new Vector4f(Class_QDKuoUmFaP1xpF1M.f_12104);
   private static final Vector4i f_12008 = new Vector4i(-1);
   private static final EquipmentSlot[] f_12009 = new EquipmentSlot[]{
      EquipmentSlot.OFFHAND, EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.MAINHAND
   };
   private static final Comparator<Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB> f_12010 = Comparator.comparingDouble(var0 -> -var0.f_11997.f_11968);
   private static final float f_12011 = 26.0F;
   private static final float f_12012 = 22.0F;
   private static final float f_12013 = 24.0F;
   private static final float f_12014 = 28.0F;
   private static final int f_12015 = Class_BftdentXEtGbugJw.m_2303(64, 255, 64, Class_QDKuoUmFaP1xpF1M.f_12105);
   private final Function<Entity, Class_y7LCUoWgFH6Mz8SR> f_12016;
   private final Map<Integer, Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB> f_12017 = new HashMap<>();
   private final List<Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB> f_12018 = new ArrayList<>();
   private long f_12019;
   private Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb f_12020;
   private ClientLevel f_12021;
   private static final float f_12022 = 0.001F;
   private static final float f_12023 = 0.001F;
   private static final float f_12024 = 0.001F;
   private static final long f_12025 = 50L;
   private static final float f_12026 = 100.0F;
   private static final float f_12027 = 0.5F;
   private static final float f_12028 = 256.0F;
   private static final float f_12029 = 0.5F;
   private static final float f_12030 = 26.0F;
   private static final float f_12031 = 24.0F;
   private static final float f_12032 = 18.0F;
   private static final float f_12033 = 26.0F;
   private static final float f_12034 = 0.001F;
   private static final float f_12035 = 0.5F;
   private static final float f_12036 = 0.5F;
   private static final float f_12037 = 7.0F;
   private static final float f_12038 = 7.0F;
   private static final float f_12039 = 0.22F;
   private static final float f_12040 = 5.0F;
   private static final float f_12041 = 4.0F;
   private static final String f_12042 = "N";
   private static final float f_12043 = 3.5F;
   private static final float f_12044 = 7.5F;
   private static final float f_12045 = 6.0F;
   private static final float f_12046 = 6.0F;
   private static final float f_12047 = 8.0F;
   private static final String f_12048 = "E";
   private static final float f_12049 = 5.0F;
   private static final float f_12050 = 3.0F;
   private static final float f_12051 = 6.0F;
   private static final float f_12052 = 8.0F;
   private static final String f_12053 = "Q";
   private static final float f_12054 = 6.0F;
   private static final float f_12055 = 6.0F;
   private static final float f_12056 = 6.0F;
   private static final float f_12057 = 0.5F;
   private static final float f_12058 = 11.0F;
   private static final float f_12059 = 22.0F;
   private static final float f_12060 = 4.0F;
   private static final float f_12061 = 5.0F;
   private static final float f_12062 = 3.0F;
   private static final float f_12063 = 28.0F;
   private static final float f_12064 = 24.0F;
   private static final float f_12065 = 0.5F;
   private static final float f_12066 = 24.0F;
   private static final float f_12067 = 6.0F;
   private static final float f_12068 = 28.0F;
   private static final float f_12069 = 24.0F;
   private static final float f_12070 = 24.0F;
   private static final float f_12071 = 12.0F;
   private static final float f_12072 = 12.0F;
   private static final float f_12073 = 10.0F;
   private static final double f_12074 = 255.0;
   private static final float f_12075 = 0.5F;
   private static final float f_12076 = 10.0F;
   private static final float f_12077 = 18.0F;
   private static final String f_12078 = "E";
   private static final String f_12079 = "|";
   private static final float f_12080 = 5.0F;
   private static final float f_12081 = 6.0F;
   private static final float f_12082 = 8.0F;
   private static final float f_12083 = 3.0F;
   private static final float f_12084 = 5.0F;
   private static final float f_12085 = 8.0F;
   private static final float f_12086 = 6.0F;
   private static final float f_12087 = 26.0F;
   private static final long f_12088 = 50L;
   private static final long f_12089 = 250L;
   private static final long f_12090 = 250L;
   private static final String f_12091 = " / ";
   private static final float f_12092 = 10.0F;
   private static final float f_12093 = 10.0F;
   private static final float f_12094 = 1.2F;
   private static final float f_12095 = 1.2F;
   private static final double f_12096 = 0.25;
   private static final double f_12097 = 0.25;
   private static final float f_12098 = 26.0F;
   private static final float f_12099 = 26.0F;
   private static final String f_12100 = "Sh";
   private static final String f_12101 = "Pr";
   private static final float f_12102 = 0.001F;
   private static final float f_12103 = 5.0F;
   private static final float f_12104 = 0.125F;
   private static final double f_12105 = 255.0;

   private void m_4309(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1, LivingEntity var2) {
      Class_y7LCUoWgFH6Mz8SR var3 = var1.f_11972;
      boolean var4 = var3.m_9601().m_8768();
      Class_QDKuoUmFaP1xpF1M.fYnboxEZOKR955Tf var5 = var4
         ? this.m_4312(var1, var2)
         : new Class_QDKuoUmFaP1xpF1M.fYnboxEZOKR955Tf(var1.f_11980, var1.f_11981, 0.0F, 0.0F);
      if (var3.m_9617() != null) {
         float var6 = var4 ? var5.y : var1.f_11981;
         this.m_4320(var1, var2, var6);
      }
   }

   private boolean m_4310(String var1, int var2) {
      return var1.equalsIgnoreCase(f_12100) && var2 > 5 || var1.equalsIgnoreCase(f_12101) && var2 > 4;
   }

   private boolean m_4311(Entity var1) {
      return var1 == f_11537.player && f_11537.options.getCameraType().isFirstPerson();
   }

   public Class_QDKuoUmFaP1xpF1M(Function<Entity, Class_y7LCUoWgFH6Mz8SR> var1) {
      this.f_12016 = var1;
   }

   private Class_QDKuoUmFaP1xpF1M.fYnboxEZOKR955Tf m_4312(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1, LivingEntity var2) {
      Class_QDKuoUmFaP1xpF1M.eumg7bFVzScVOdhZ var3 = var1.f_11962;
      if (var3 == null) {
         var1.f_11962 = var3 = this.m_4319(var1);
      }

      float var4 = var1.f_11980 - var3.width * f_12035;
      float var5 = var1.f_11981 - var3.height * f_12036;
      int var6 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var7 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT);
      int var8 = var1.m_4295() ? f_12015 : var6;
      Class_U4Qsm43RVlUI3Pre.m_5215(var4, var5, var3.width, var3.height, f_12037);
      if (var1.m_4295()) {
         Class_U4Qsm43RVlUI3Pre.m_5199(var4, var5, var3.width, var3.height, f_12038, Class_BftdentXEtGbugJw.m_2306(f_12015, f_12039));
      }

      float var9 = var4 + f_12040;
      GpuTextureView var10 = var1.f_11963;
      if (var2 instanceof Player && var10 != null && !var10.isClosed()) {
         Class_U4Qsm43RVlUI3Pre.m_5209(var9, var5 + f_12041, var3.headSize, var3.headSize, f_12006, f_12007, f_12008, var10);
      } else {
         this.m_4326(f_12042, var9 + f_12043, var5 + f_12044, var3.iconSize, var6);
      }

      var9 += var3.headSize + f_12045;
      this.m_4328(var1.f_11976, var9, var5 + f_12046, var3.fontSize, -1);
      var9 += var3.nameWidth + f_12047;
      this.m_4326(f_12048, var9, var5 + f_12049, var3.healthIconSize, var8);
      var9 += var3.healthIconWidth + f_12050;
      this.m_4331(var1.f_11977, var9, var5 + f_12051, var3.fontSize, var7);
      var9 += var3.healthWidth;
      if (!var1.f_11978.isEmpty()) {
         var9 += f_12052;
         this.m_4326(f_12053, var9, var5 + f_12054, var3.iconSize, var8);
         var9 += var3.pingIconWidth + f_12055;
         this.m_4331(var1.f_11978, var9, var5 + f_12056, var3.fontSize, var7);
      }

      return new Class_QDKuoUmFaP1xpF1M.fYnboxEZOKR955Tf(var4, var5, var3.width, var3.height);
   }

   private boolean m_4313(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1, float var2) {
      Entity var3 = var1.f_11971;
      double var4 = var3.xo + (var3.getX() - var3.xo) * var2;
      double var6 = var3.yo + (var3.getY() - var3.yo) * var2;
      double var8 = var3.zo + (var3.getZ() - var3.zo) * var2;
      if (var3 instanceof ItemEntity) {
         var1.m_4267(var4, var6 + var3.getBbHeight() * f_12094, var8);
         Vector2f var11 = Class_FvJXUGWpZo3zYBW4.m_2689(new Vec3(var4, var6 + var3.getBbHeight() * f_12095, var8), false);
         if (var11 == null) {
            return false;
         }

         var1.f_11980 = var11.x;
         var1.f_11981 = var11.y;
         var1.f_11974 = true;
         return true;
      } else {
         var1.m_4267(var4, var6 + var3.getBbHeight() + f_12096, var8);
         Vector2f var10 = Class_FvJXUGWpZo3zYBW4.m_2689(new Vec3(var4, var6 + var3.getBbHeight() + f_12097, var8), true);
         if (var10 == null) {
            return false;
         }

         var1.f_11980 = var10.x;
         var1.f_11981 = var10.y - f_12098;
         var1.f_11974 = true;
         return true;
      }
   }

   private boolean m_4314(Class_y7LCUoWgFH6Mz8SR var1) {
      return var1.m_9601().m_8768() ? true : var1.m_9617() != null && var1.m_9617().m_8768();
   }

   private void m_4315(Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY var1, float var2, float var3) {
      float var4 = var3;

      for (Class_QDKuoUmFaP1xpF1M.in84jWdYsZmcFqaA var6 : var1.f_12001) {
         int var7 = var6.overLevelled ? Class_BftdentXEtGbugJw.m_2303(212, 78, 74, f_12074) : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT);
         Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var6.text, var2 - var6.width * f_12075, var4, 10, var7);
         var4 -= f_12076;
      }
   }

   private float m_4316(Component var1, int var2) {
      float[] var3 = new float[]{0.0F};
      var1.visit((var2x, var3x) -> {
         var3[0] += Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var3x, var2, 0.0F);
         return Optional.empty();
      }, Style.EMPTY);
      return var3[0];
   }

   private Component m_4317(LivingEntity var1) {
      if (var1 instanceof Player var2 && Class_29BIBbZyd5QWCwS1.m_993()) {
         String var3 = var2.getGameProfile().name();
         String var4 = Class_29BIBbZyd5QWCwS1.m_997(var2);
         boolean var5 = f_11537.player != null && Objects.equals(var2.getUUID(), f_11537.player.getUUID());
         if (!Objects.equals(var3, var4)) {
            MutableComponent var6 = Component.literal(var4).setStyle(var2.getName().getStyle());
            MutableComponent var7 = PlayerTeam.formatNameForTeam(var2.getTeam(), var6);
            return (Component)(var5 ? Class_29BIBbZyd5QWCwS1.m_931(var7) : var7);
         } else {
            return var5 ? Class_29BIBbZyd5QWCwS1.m_931(var2.getDisplayName()) : var2.getDisplayName();
         }
      } else {
         return Class_29BIBbZyd5QWCwS1.m_933(var1.getDisplayName());
      }
   }

   private void m_4318(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1, LivingEntity var2, boolean var3) {
      if (var1.f_11972.m_9617() != null && var1.f_11972.m_9617().m_8768()) {
         boolean var4 = var1.f_11972.m_9622() != null && var1.f_11972.m_9622().m_8768();
         var1.f_11958.clear();
         var1.f_11967 = 0.0F;

         for (int var5 = 0; var5 < f_12009.length; var5++) {
            ItemStack var6 = var2.getItemBySlot(f_12009[var5]);
            Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY var7 = var1.f_11959[var5];
            if (var7 == null) {
               var1.f_11959[var5] = var7 = new Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY();
            }

            if (!ItemStack.matches(var6, var7.f_11999)) {
               var7.f_11999 = var6.copy();
               var7.f_12002 = false;
            }

            if (!var6.isEmpty()) {
               var1.f_11958.add(var7.f_11999);
               if (var4) {
                  if (!var7.f_12002 || var3) {
                     var7.f_12001 = this.m_4333(var7.f_11999);
                     var7.f_12002 = true;
                  }

                  var1.f_11967 = Math.max(var1.f_11967, var7.f_12001.size() * f_12093);
               }
            }
         }
      }
   }

   private Class_QDKuoUmFaP1xpF1M.eumg7bFVzScVOdhZ m_4319(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1) {
      byte var2 = 12;
      byte var3 = 13;
      byte var4 = 14;
      float var5 = f_12077;
      float var6 = this.m_4316(var1.f_11976, var2);
      float var7 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var1.f_11977, var2, 0.0F);
      float var8 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var1.f_11978, var2, 0.0F);
      float var9 = Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_12078, var3, 0.0F);
      float var10 = Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_12079, var3, 0.0F);
      float var11 = f_12080 + var5 + f_12081 + var6 + f_12082 + var9 + f_12083 + var7 + f_12084;
      if (!var1.f_11978.isEmpty()) {
         var11 += f_12085 + var10 + f_12086 + var8;
      }

      var1.f_11979 = var6;
      return new Class_QDKuoUmFaP1xpF1M.eumg7bFVzScVOdhZ(var11, f_12087, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private void m_4320(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1, LivingEntity var2, float var3) {
      Class_y7LCUoWgFH6Mz8SR var4 = var1.f_11972;
      boolean var5 = var4.m_9617() != null && var4.m_9617().m_8768();
      if (var5) {
         if (!var1.f_11958.isEmpty()) {
            float var6 = (var1.f_11958.size() - 1) * f_12063 + f_12064;
            float var7 = var1.f_11980 - var6 * f_12065;
            float var8 = var3 - f_12066 - f_12067;
            boolean var9 = var4.m_9622() != null && var4.m_9622().m_8768();
            int var10 = 0;

            for (Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY var14 : var1.f_11959) {
               if (var14 != null && !var14.f_11999.isEmpty()) {
                  float var15 = var7 + var10++ * f_12068;
                  Class_U4Qsm43RVlUI3Pre.m_5206(var15, var8, f_12069, f_12070, var14.f_11999, true, var14.f_12000);
                  if (var9) {
                     this.m_4315(var14, var15 + f_12071, var8 - f_12072);
                  }
               }
            }
         }
      }
   }

   private void m_4321(long var1) {
      if (var1 >= this.f_12019) {
         this.f_12019 = var1 + f_12025;

         for (Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB var4 : this.f_12017.values()) {
            var4.f_11998 = false;
         }

         for (Entity var8 : f_11537.level.entitiesForRendering()) {
            Class_y7LCUoWgFH6Mz8SR var5 = this.f_12016.apply(var8);
            if (var5 != null && var5.m_9635().m_8768() && this.m_4314(var5) && !var8.isRemoved() && !this.m_4311(var8)) {
               Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB var6 = this.f_12017.get(var8.getId());
               if (var6 == null || var6.f_11997.f_11971 != var8) {
                  var6 = new Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB(new Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb(var8));
                  this.f_12017.put(var8.getId(), var6);
               }

               var6.f_11998 = true;
               var6.f_11997.f_11972 = var5;
            }
         }
      }
   }

   private void m_4322(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1) {
      if (var1.f_11972.m_9601().m_8768()) {
         float var2 = var1.f_11966;
         float var3 = var1.f_11980 - var2 * f_12057;
         float var4 = var1.f_11981 - f_12058;
         Class_U4Qsm43RVlUI3Pre.m_5215(var3, var4, var2, f_12059, f_12060);
         Class_U4Qsm43RVlUI3Pre.m_5192(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var1.f_11965,
            var3 + f_12061,
            var4 + f_12062,
            12,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
         );
      }
   }

   private void m_4323(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1) {
      if (var1.f_11971 instanceof LivingEntity var2) {
         this.m_4309(var1, var2);
      } else {
         if (var1.f_11971 instanceof ItemEntity) {
            this.m_4322(var1);
         }
      }
   }

   private void m_4324(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1, long var2) {
      Language var4 = Language.getInstance();
      boolean var5 = var1.f_11960 != var4;
      boolean var6 = Class_29BIBbZyd5QWCwS1.m_993();
      boolean var7 = var6 != var1.f_11961;
      if (var5 || var7 || var2 >= var1.f_11969) {
         var1.f_11960 = var4;
         var1.f_11961 = var6;
         if (var5) {
            for (Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY var11 : var1.f_11959) {
               if (var11 != null) {
                  var11.f_12002 = false;
               }
            }
         }

         var1.f_11969 = var2 + f_12088;
         Entity var14 = var1.f_11971;
         if (var14 instanceof LivingEntity var16) {
            if (var1.f_11972.m_9601().m_8768()) {
               boolean var18 = var5 || var7 || var1.f_11962 == null;
               if (var18 || var2 >= var1.f_11970) {
                  var1.f_11970 = var2 + f_12089;
                  Component var20 = this.m_4317(var16);
                  String var12 = var16 instanceof Player var13 ? Math.max(0, Class_0Cok6juhnuCd9HBq.m_683(var13.getUUID())) + "" : "";
                  var18 |= !var1.f_11976.equals(var20) || !var1.f_11978.equals(var12);
                  var1.f_11976 = var20;
                  var1.f_11978 = var12;
                  var1.f_11963 = var16 instanceof Player ? Class_7CxJH622IPbYv0YY.m_1608(var16) : null;
               }

               int var21 = Math.max(0, Math.round(Class_g3Fg4YmMuzK7loFX.m_6757(var16)));
               if (var21 != var1.f_11989 || var1.f_11977.isEmpty()) {
                  var1.f_11989 = var21;
                  var1.f_11977 = Integer.toString(var21);
                  var18 = true;
               }

               if (var18) {
                  var1.f_11962 = this.m_4319(var1);
               }
            }

            this.m_4318(var1, var16, var5);
         } else {
            if (var14 instanceof ItemEntity var15) {
               ItemStack var17 = var15.getItem();
               if (var5 || var7 || var2 >= var1.f_11970 || !ItemStack.matches(var17, var1.f_11964)) {
                  var1.f_11970 = var2 + f_12090;
                  var1.f_11964 = var17.copy();
                  var1.f_11976 = Class_29BIBbZyd5QWCwS1.m_933(var17.getHoverName());
                  var1.f_11990 = var17.getCount();
                  MutableComponent var19 = var1.f_11976.copy();
                  if (var1.f_11990 > 1) {
                     var19.append(Component.literal(f_12091).setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_GRAY)));
                     var19.append(Component.literal(var1.f_11990 + "").setStyle(Style.EMPTY.withColor(ChatFormatting.RED)));
                  }

                  var1.f_11965 = var19;
                  var1.f_11966 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var19.getString(), 12) + f_12092;
               }
            }
         }
      }
   }

   public void m_4325(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.level != null && f_11537.player != null && var1.m_6083() != null) {
         if (this.f_12021 != f_11537.level) {
            this.m_4335();
            this.f_12021 = f_11537.level;
         }

         long var2 = System.currentTimeMillis();
         float var4 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         this.m_4321(var2);
         this.f_12018.clear();
         Vec3 var5 = f_11537.gameRenderer.mainCamera().position();
         Iterator var6 = this.f_12017.values().iterator();

         while (var6.hasNext()) {
            Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB var7 = (Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB)var6.next();
            Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var8 = var7.f_11997;
            if (this.m_4311(var8.f_11971)) {
               var8.m_4303();
               if (!var7.f_11998) {
                  var6.remove();
               }
            } else {
               boolean var9 = var7.f_11998 && this.m_4338(var8.f_11971) && var8.f_11972.m_9635().m_8768() && this.m_4314(var8.f_11972);
               boolean var10 = var9 && this.m_4313(var8, var4);
               var8.m_4268(var10, var2);
               var8.m_4299(var2);
               if (!var10 && var8.f_11982 > f_12022 && var8.f_11985) {
                  this.m_4334(var8);
               }

               if (var8.f_11982 > f_12023 && var8.f_11974 && this.m_4327(var8)) {
                  this.m_4324(var8, var2);
                  double var11 = var8.f_11986 - var5.x;
                  double var13 = var8.f_11987 - var5.y;
                  double var15 = var8.f_11988 - var5.z;
                  var8.f_11968 = var11 * var11 + var13 * var13 + var15 * var15;
                  this.f_12018.add(var7);
               }

               if (!var7.f_11998 && var8.f_11982 <= f_12024) {
                  var6.remove();
               }
            }
         }

         if (!this.f_12018.isEmpty()) {
            this.f_12018.sort(f_12010);
            Class_Ssh31B3ljfKeWsvS.m_4871();
            float var25 = Class_Ssh31B3ljfKeWsvS.m_4821();
            Class_U4Qsm43RVlUI3Pre.m_5207();
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

            try {
               for (Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB var27 : this.f_12018) {
                  Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var28 = var27.f_11997;
                  float var29 = Class_Ssh31B3ljfKeWsvS.m_4821();
                  Class_Ssh31B3ljfKeWsvS.m_4864(var29 * var28.f_11982);

                  try {
                     this.m_4323(var28);
                  } finally {
                     Class_Ssh31B3ljfKeWsvS.m_4864(var29);
                  }
               }
            } finally {
               Class_Ssh31B3ljfKeWsvS.m_4864(var25);
               Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            }
         }
      } else {
         this.m_4335();
      }
   }

   private void m_4326(String var1, float var2, float var3, int var4, int var5) {
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var2, var3, var4, var5);
   }

   private boolean m_4327(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1) {
      float var2 = Math.max(f_12026, var1.f_11973 ? var1.f_11966 * f_12027 : (var1.f_11962 == null ? f_12028 : var1.f_11962.width * f_12029));
      float var3 = var1.f_11981 - f_12030 - f_12031 - f_12032 - var1.f_11967;
      return var1.f_11980 + var2 >= 0.0F
         && var1.f_11980 - var2 <= f_11537.getWindow().getScreenWidth()
         && var1.f_11981 + f_12033 >= 0.0F
         && var3 <= f_11537.getWindow().getScreenHeight();
   }

   private void m_4328(Component var1, float var2, float var3, int var4, int var5) {
      Class_U4Qsm43RVlUI3Pre.m_5192(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2, var3, var4, var5);
   }

   private void m_4331(String var1, float var2, float var3, int var4, int var5) {
      Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2, var3, var4, var5);
   }

   public boolean m_4332(Entity var1) {
      Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB var2 = var1 == null ? null : this.f_12017.get(var1.getId());
      return var2 != null && var2.f_11997.f_11982 > f_12102;
   }

   private List<Class_QDKuoUmFaP1xpF1M.in84jWdYsZmcFqaA> m_4333(ItemStack var1) {
      Set var2 = EnchantmentHelper.getEnchantmentsForCrafting(var1).entrySet();
      if (var2.isEmpty()) {
         return List.of();
      }

      ArrayList var3 = new ArrayList(var2);
      var3.sort(Entry.comparingByValue(Comparator.reverseOrder()));
      ArrayList var4 = new ArrayList(var3.size());

      for (Object var6Obj : var3) {
         Entry var6 = (Entry) var6Obj;
         String var7 = Enchantment.getFullname((Holder)var6.getKey(), (Integer)var6.getValue()).getString();
         String var8 = var7.substring(0, Math.min(2, var7.length()));
         String var9 = var8 + var6.getValue();
         float var10 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var9, f_12073, 0.0F);
         var4.add(new Class_QDKuoUmFaP1xpF1M.in84jWdYsZmcFqaA(var9, var10, this.m_4310((String)var8, (Integer)var6.getValue())));
      }

      return var4;
   }

   private void m_4334(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1) {
      Vector2f var2 = Class_FvJXUGWpZo3zYBW4.m_2689(new Vec3(var1.f_11986, var1.f_11987, var1.f_11988), !var1.f_11973);
      if (var2 == null) {
         var1.f_11974 = false;
      } else {
         var1.f_11980 = var2.x;
         var1.f_11981 = var2.y - (var1.f_11973 ? 0.0F : f_12099);
         var1.f_11974 = true;
      }
   }

   public void m_4335() {
      this.f_12017.clear();
      this.f_12018.clear();
      this.f_12019 = 0L;
      this.f_12020 = null;
      this.f_12021 = null;
   }

   public void m_4336(Entity var1, Class_y7LCUoWgFH6Mz8SR var2, float var3, float var4, float var5) {
      if (var1 != null && var2 != null && !(var5 <= f_12034)) {
         if (this.f_12020 == null || this.f_12020.f_11971 != var1) {
            this.f_12020 = new Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb(var1);
         }

         Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var6 = this.f_12020;
         var6.f_11971 = var1;
         var6.f_11972 = var2;
         var6.f_11980 = var3;
         var6.f_11981 = var4;
         var6.f_11974 = true;
         var6.f_11982 = Math.clamp(var5, 0.0F, 1.0F);
         this.m_4324(var6, System.currentTimeMillis());
         float var7 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_U4Qsm43RVlUI3Pre.m_5207();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
         Class_Ssh31B3ljfKeWsvS.m_4864(var7 * var6.f_11982);

         try {
            this.m_4323(var6);
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4864(var7);
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
         }
      }
   }

   public Collection<Class_QDKuoUmFaP1xpF1M.icKfTjIMpkCANDhB> m_4337() {
      return List.copyOf(this.f_12017.values());
   }

   private boolean m_4338(Entity var1) {
      return !var1.isRemoved();
   }

   public static final class RX6hlk9wrwH9Qtlb {
      public final int f_11957;
      public final List<ItemStack> f_11958 = new ArrayList<>(6);
      public final Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY[] f_11959 = new Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY[Class_QDKuoUmFaP1xpF1M.f_12009.length];
      public Language f_11960;
      public boolean f_11961;
      public Class_QDKuoUmFaP1xpF1M.eumg7bFVzScVOdhZ f_11962;
      public GpuTextureView f_11963;
      public ItemStack f_11964 = ItemStack.EMPTY;
      public Component f_11965 = Component.empty();
      public float f_11966;
      public float f_11967;
      public double f_11968;
      public long f_11969;
      public long f_11970;
      public Entity f_11971;
      public Class_y7LCUoWgFH6Mz8SR f_11972;
      public boolean f_11973;
      public boolean f_11974;
      public boolean f_11975;
      public Component f_11976 = Component.empty();
      public String f_11977 = "";
      public String f_11978 = "";
      public float f_11979;
      public float f_11980;
      public float f_11981;
      public float f_11982;
      public float f_11983;
      public float f_11984;
      public boolean f_11985;
      public double f_11986;
      public double f_11987;
      public double f_11988;
      public int f_11989;
      public int f_11990;
      public long f_11991;
      public static final float f_11992 = 1000.0F;
      public static final float f_11993 = 6.0F;
      public static final float f_11994 = 15.0F;
      public static final float f_11995 = 10.0F;
      public static final String f_11996 = "players_friends";

      @Generated
      public float m_4266() {
         return this.f_11966;
      }

      public void m_4267(double var1, double var3, double var5) {
         this.f_11986 = var1;
         this.f_11987 = var3;
         this.f_11988 = var5;
         this.f_11985 = true;
      }

      public void m_4268(boolean var1, long var2) {
         if (var1) {
            this.m_4287();
         } else if (!(this.f_11971 instanceof Player)) {
            this.m_4303();
         } else if (this.f_11975 != var1) {
            this.m_4299(var2);
            this.f_11975 = false;
            this.f_11983 = this.f_11982;
            this.f_11984 = 0.0F;
            this.f_11991 = var2;
         }
      }

      @Generated
      public float m_4269() {
         return this.f_11967;
      }

      @Generated
      public Class_y7LCUoWgFH6Mz8SR m_4270() {
         return this.f_11972;
      }

      @Generated
      public double m_4271() {
         return this.f_11987;
      }

      @Generated
      public float m_4272() {
         return this.f_11982;
      }

      @Generated
      public long m_4273() {
         return this.f_11970;
      }

      @Generated
      public float m_4274() {
         return this.f_11984;
      }

      @Generated
      public int m_4275() {
         return this.f_11990;
      }

      @Generated
      public ItemStack m_4276() {
         return this.f_11964;
      }

      @Generated
      public float m_4277() {
         return this.f_11979;
      }

      @Generated
      public boolean m_4278() {
         return this.f_11985;
      }

      @Generated
      public Class_QDKuoUmFaP1xpF1M.ntP9l68AsaBJT5VY[] m_4279() {
         return this.f_11959;
      }

      @Generated
      public long m_4280() {
         return this.f_11991;
      }

      @Generated
      public Class_QDKuoUmFaP1xpF1M.eumg7bFVzScVOdhZ m_4281() {
         return this.f_11962;
      }

      @Generated
      public Component m_4282() {
         return this.f_11965;
      }

      @Generated
      public boolean m_4283() {
         return this.f_11961;
      }

      @Generated
      public float m_4284() {
         return this.f_11980;
      }

      @Generated
      public boolean m_4285() {
         return this.f_11973;
      }

      @Generated
      public boolean m_4286() {
         return this.f_11974;
      }

      public void m_4287() {
         if (!this.f_11975 || !(this.f_11982 >= 1.0F) || this.f_11991 != 0L) {
            this.f_11975 = true;
            this.f_11982 = 1.0F;
            this.f_11983 = 1.0F;
            this.f_11984 = 1.0F;
            this.f_11991 = 0L;
         }
      }

      @Generated
      public String m_4288() {
         return this.f_11977;
      }

      @Generated
      public int m_4289() {
         return this.f_11957;
      }

      @Generated
      public Entity m_4290() {
         return this.f_11971;
      }

      @Generated
      public float m_4291() {
         return this.f_11981;
      }

      @Generated
      public double m_4292() {
         return this.f_11968;
      }

      @Generated
      public double m_4293() {
         return this.f_11986;
      }

      @Generated
      public double m_4294() {
         return this.f_11988;
      }

      public boolean m_4295() {
         return this.f_11972 != null && f_11996.equals(this.f_11972.m_9602());
      }

      @Generated
      public long m_4296() {
         return this.f_11969;
      }

      @Generated
      public float m_4297() {
         return this.f_11983;
      }

      @Generated
      public List<ItemStack> m_4298() {
         return this.f_11958;
      }

      public void m_4299(long var1) {
         if (this.f_11991 == 0L) {
            this.f_11982 = this.f_11975 ? 1.0F : 0.0F;
         } else {
            float var3 = Math.clamp((float)(var1 - this.f_11991) / f_11992, 0.0F, 1.0F);
            float var4 = var3 * var3 * var3 * (var3 * (var3 * f_11993 - f_11994) + f_11995);
            this.f_11982 = this.f_11983 + (this.f_11984 - this.f_11983) * var4;
            if (var3 >= 1.0F) {
               this.f_11982 = this.f_11984;
               this.f_11991 = 0L;
            }
         }
      }

      @Generated
      public Language m_4300() {
         return this.f_11960;
      }

      @Generated
      public int m_4301() {
         return this.f_11989;
      }

      @Generated
      public GpuTextureView m_4302() {
         return this.f_11963;
      }

      public void m_4303() {
         this.f_11975 = false;
         this.f_11982 = 0.0F;
         this.f_11983 = 0.0F;
         this.f_11984 = 0.0F;
         this.f_11991 = 0L;
      }

      @Generated
      public Component m_4304() {
         return this.f_11976;
      }

      public RX6hlk9wrwH9Qtlb(Entity var1) {
         this.f_11971 = var1;
         this.f_11957 = var1.getId();
         this.f_11973 = var1 instanceof ItemEntity;
      }

      @Generated
      public String m_4305() {
         return this.f_11978;
      }

      @Generated
      public boolean m_4306() {
         return this.f_11975;
      }
   }

   private record eumg7bFVzScVOdhZ(
      float width,
      float height,
      int fontSize,
      int iconSize,
      int healthIconSize,
      float headSize,
      float nameWidth,
      float healthWidth,
      float pingWidth,
      float healthIconWidth,
      float pingIconWidth
   ) {
   }

   public record fYnboxEZOKR955Tf(float x, float y, float width, float height) {
   }

   public static final class icKfTjIMpkCANDhB {
      public final Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb f_11997;
      public boolean f_11998;

      @Generated
      public boolean m_4307() {
         return this.f_11998;
      }

      public icKfTjIMpkCANDhB(Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb var1) {
         this.f_11997 = var1;
      }

      @Generated
      public Class_QDKuoUmFaP1xpF1M.RX6hlk9wrwH9Qtlb m_4308() {
         return this.f_11997;
      }
   }

   private record in84jWdYsZmcFqaA(String text, float width, boolean overLevelled) {
   }

   private static final class ntP9l68AsaBJT5VY {
      public ItemStack f_11999 = ItemStack.EMPTY;
      public final Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U f_12000 = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U();
      public List<Class_QDKuoUmFaP1xpF1M.in84jWdYsZmcFqaA> f_12001 = List.of();
      public boolean f_12002;

      public ntP9l68AsaBJT5VY() {
      }
   }
}
