package dev.dimasik.client.module.render;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_qyFZUkNc6oUs6ojL;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder.Reference;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.arrow.ThrownTrident;
import net.minecraft.world.entity.projectile.hurtingprojectile.windcharge.AbstractWindCharge;
import net.minecraft.world.entity.projectile.throwableitemprojectile.AbstractThrownPotion;
import net.minecraft.world.entity.projectile.throwableitemprojectile.Snowball;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownEgg;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownEnderpearl;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownExperienceBottle;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.component.ChargedProjectiles;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Prediction extends Module {
   private static final float f_29001 = (float) (Math.PI / 180.0);
   private static final int f_29002 = 44;
   private static final double f_29003 = 0.1;
   private static final int f_29004 = 12;
   private static final int f_29005 = 400;
   private static final double f_29006 = 128.0;
   private static final float f_29007 = 10.0F;
   private static final float[] f_29008 = new float[]{Prediction.f_29183, 0.0F, Prediction.f_29184};
   private static final int f_29009 = Class_BftdentXEtGbugJw.m_2303(255, 0, 0, Prediction.f_29185);
   private static final Prediction.IxMiNx55UiYCltE1 f_29010 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29186, Prediction.kwpBmO3FObYwx0OS.THROWN, Prediction.f_29187, Prediction.f_29188, Prediction.f_29189, 0.0F, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29011 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29190, Prediction.kwpBmO3FObYwx0OS.THROWN, Prediction.f_29191, Prediction.f_29192, Prediction.f_29193, 0.0F, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29012 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29194, Prediction.kwpBmO3FObYwx0OS.THROWN, Prediction.f_29195, Prediction.f_29196, Prediction.f_29197, Prediction.f_29198, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29013 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29199, Prediction.kwpBmO3FObYwx0OS.THROWN, Prediction.f_29200, Prediction.f_29201, Prediction.f_29202, Prediction.f_29203, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29014 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29204, Prediction.kwpBmO3FObYwx0OS.STRAIGHT, 0.0, 1.0, Prediction.f_29205, 0.0F, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29015 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29206, Prediction.kwpBmO3FObYwx0OS.ARROW, Prediction.f_29207, Prediction.f_29208, Prediction.f_29209, 0.0F, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29016 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29210, Prediction.kwpBmO3FObYwx0OS.ARROW, Prediction.f_29211, Prediction.f_29212, Prediction.f_29213, 0.0F, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29017 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29214, Prediction.kwpBmO3FObYwx0OS.ARROW, Prediction.f_29215, Prediction.f_29216, 0.0F, 0.0F, false
   );
   private static final Prediction.IxMiNx55UiYCltE1 f_29018 = new Prediction.IxMiNx55UiYCltE1(
      Prediction.f_29217, Prediction.kwpBmO3FObYwx0OS.BOBBER, Prediction.f_29218, Prediction.f_29219, 0.0F, 0.0F, true
   );
   private static final float f_29019 = 0.5F;
   private final RenderPipeline f_29020;
   private final RenderPipeline f_29021;
   private final RenderPipeline f_29022;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_29023;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_29024;
   private final List<Prediction.UZPSwEAHff6Ihskq> f_29025;
   private final List<Prediction.UZPSwEAHff6Ihskq> f_29026;
   private long f_29027;
   private ClientLevel f_29028;
   private final Map<Integer, Prediction.Class_7KOg7jmMTWOePFn5> f_29029;
   private static final Identifier f_29030 = Identifier.fromNamespaceAndPath(Prediction.f_29220, Prediction.f_29221);
   private static final String f_29031 = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAIVBMVEUAAACM9OIszbE0mYglhHQbe2sQXlELTUIMNzAGOTEDJiC5a2thAAAAAXRSTlMAQObYZgAAAFtJREFUeNpjwAo4OqB0swmE1WyS5rIAJGAiVJ7mBWIYas4szwLJOM1aNb0MKLc4HchwAzKWgBhmQAaXe+XMIisGIMOtvFwRpJhhabozUAYktCxtFZACsVYh2wwA2BYa2KT1S0MAAAAASUVORK5CYII=";
   private DynamicTexture f_29032;
   private static final String f_29033 = "Prediction";
   private static final String f_29034 = "Траектория метательных предметов";
   private static final String f_29035 = "dimasik/prediction_trail";
   private static final String f_29036 = "dimasik/prediction_box";
   private static final String f_29037 = "dimasik/prediction_potions";
   private static final long f_29038 = Long.MIN_VALUE;
   private static final String f_29039 = "prediction_trail";
   private static final String f_29040 = "prediction_trail";
   private static final String f_29041 = "prediction_trail";
   private static final String f_29042 = "prediction_box";
   private static final long f_29043 = Long.MIN_VALUE;
   private static final float f_29044 = (float) (Math.PI / 180.0);
   private static final float f_29045 = (float) (Math.PI / 180.0);
   private static final float f_29046 = (float) (Math.PI / 180.0);
   private static final float f_29047 = (float) (Math.PI / 180.0);
   private static final float f_29048 = (float) (Math.PI / 180.0);
   private static final double f_29049 = 0.1;
   private static final float f_29050 = (float) (Math.PI / 180.0);
   private static final float f_29051 = (float) Math.PI;
   private static final float f_29052 = (float) (Math.PI / 180.0);
   private static final float f_29053 = (float) Math.PI;
   private static final float f_29054 = (float) (Math.PI / 180.0);
   private static final float f_29055 = (float) (Math.PI / 180.0);
   private static final float f_29056 = -5.0F;
   private static final float f_29057 = 5.0F;
   private static final double f_29058 = 1.0E-6;
   private static final double f_29059 = 0.3;
   private static final double f_29060 = 0.3;
   private static final double f_29061 = 0.6;
   private static final double f_29062 = 0.5;
   private static final float f_29063 = 0.1F;
   private static final double f_29064 = 0.05;
   private static final double f_29065 = 0.99;
   private static final float f_29066 = 3.0F;
   private static final double f_29067 = 1.0E-4;
   private static final double f_29068 = 16384.0;
   private static final double f_29069 = 0.8;
   private static final double f_29070 = Double.MAX_VALUE;
   private static final double f_29071 = 0.3;
   private static final double f_29072 = Double.MAX_VALUE;
   private static final double f_29073 = Double.MAX_VALUE;
   private static final double f_29074 = Double.MAX_VALUE;
   private static final double f_29075 = -Double.MAX_VALUE;
   private static final double f_29076 = -Double.MAX_VALUE;
   private static final double f_29077 = -Double.MAX_VALUE;
   private static final double f_29078 = 2.0;
   private static final long f_29079 = 600000L;
   private static final float f_29080 = 1000.0F;
   private static final double f_29081 = 1.0E-8;
   private static final float f_29082 = 0.25F;
   private static final double f_29083 = 0.025;
   private static final float f_29084 = 0.5F;
   private static final float f_29085 = 0.5F;
   private static final double f_29086 = 0.035;
   private static final double f_29087 = 0.035;
   private static final float f_29088 = 3.0F;
   private static final float f_29089 = 4.0F;
   private static final String f_29090 = "instant_damage";
   private static final String f_29091 = "poison";
   private static final String f_29092 = "slowness";
   private static final String f_29093 = "weakness";
   private static final String f_29094 = "invisibility";
   private static final String f_29095 = "instant_health";
   private static final String f_29096 = "regeneration";
   private static final String f_29097 = "fire_resistance";
   private static final String f_29098 = "strength";
   private static final String f_29099 = "water_breathing";
   private static final String f_29100 = "night_vision";
   private static final String f_29101 = "jump_boost";
   private static final String f_29102 = "speed";
   private static final int f_29103 = -44976;
   private static final int f_29104 = -11468976;
   private static final int f_29105 = -11513601;
   private static final int f_29106 = -6908266;
   private static final int f_29107 = -16726016;
   private static final int f_29108 = -38476;
   private static final int f_29109 = -16738616;
   private static final int f_29110 = -10223416;
   private static final int f_29111 = -16711786;
   private static final int f_29112 = -10158081;
   private static final int f_29113 = -16777216;
   private static final String f_29114 = ", ";
   private static final double f_29115 = 0.92;
   private static final double f_29116 = 1.0E-8;
   private static final double f_29117 = 0.02;
   private static final double f_29118 = 0.55F;
   private static final float f_29119 = 0.93F;
   private static final float f_29120 = 0.07F;
   private static final float f_29121 = 4.0F;
   private static final double f_29122 = 0.78;
   private static final double f_29123 = 0.004;
   private static final double f_29124 = 0.58;
   private static final float f_29125 = 0.5F;
   private static final float f_29126 = 0.9F;
   private static final double f_29127 = 0.65;
   private static final double f_29128 = 1.15;
   private static final double f_29129 = 0.93;
   private static final float f_29130 = 200.0F;
   private static final float f_29131 = (float) (Math.PI * 2);
   private static final float f_29132 = 44.0F;
   private static final float f_29133 = (float) (Math.PI * 2);
   private static final float f_29134 = 44.0F;
   private static final float f_29135 = 44.0F;
   private static final float f_29136 = 44.0F;
   private static final double f_29137 = 0.06;
   private static final double f_29138 = 1.0E-8;
   private static final double f_29139 = 1.0E-6;
   private static final double f_29140 = 0.012;
   private static final double f_29141 = 0.007;
   private static final float f_29142 = 0.05F;
   private static final float f_29143 = 0.45F;
   private static final float f_29144 = 1.1F;
   private static final float f_29145 = 0.58F;
   private static final float f_29146 = 0.42F;
   private static final float f_29147 = 13.0F;
   private static final float f_29148 = 6.0F;
   private static final float f_29149 = 255.0F;
   private static final String f_29150 = "Неизвестно";
   private static final float f_29151 = 0.01F;
   private static final float f_29152 = 0.01F;
   private static final float f_29153 = 20.0F;
   private static final float f_29154 = 255.0F;
   private static final String f_29155 = "%.1fс";
   private static final String f_29156 = "%.1f блоков";
   private static final String f_29157 = "%.1fс";
   private static final float f_29158 = 20.0F;
   private static final String f_29159 = " · ";
   private static final float f_29160 = 34.0F;
   private static final float f_29161 = 8.0F;
   private static final float f_29162 = 26.0F;
   private static final float f_29163 = 14.0F;
   private static final float f_29164 = 8.0F;
   private static final float f_29165 = 26.0F;
   private static final float f_29166 = 8.0F;
   private static final float f_29167 = 5.0F;
   private static final float f_29168 = 16.0F;
   private static final float f_29169 = 16.0F;
   private static final float f_29170 = 8.0F;
   private static final float f_29171 = 5.0F;
   private static final float f_29172 = 16.0F;
   private static final float f_29173 = 16.0F;
   private static final float f_29174 = 6.0F;
   private static final float f_29175 = 8.0F;
   private static final float f_29176 = 6.0F;
   private static final String f_29177 = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAIVBMVEUAAACM9OIszbE0mYglhHQbe2sQXlELTUIMNzAGOTEDJiC5a2thAAAAAXRSTlMAQObYZgAAAFtJREFUeNpjwAo4OqB0swmE1WyS5rIAJGAiVJ7mBWIYas4szwLJOM1aNb0MKLc4HchwAzKWgBhmQAaXe+XMIisGIMOtvFwRpJhhabozUAYktCxtFZACsVYh2wwA2BYa2KT1S0MAAAAASUVORK5CYII=";
   private static final String f_29178 = "Cannot decode bundled vanilla pearl";
   private static final String f_29179 = "Prediction vanilla pearl";
   private static final String f_29180 = "prediction";
   private static final String f_29181 = "predictionVertices";
   private static final double f_29182 = 0.3;
   private static final float f_29183 = -10.0F;
   private static final float f_29184 = 10.0F;
   private static final double f_29185 = 255.0;
   private static final String f_29186 = "Эндер жемчуг";
   private static final double f_29187 = 0.03;
   private static final double f_29188 = 0.99;
   private static final float f_29189 = 1.5F;
   private static final String f_29190 = "Снежки и яйца";
   private static final double f_29191 = 0.03;
   private static final double f_29192 = 0.99;
   private static final float f_29193 = 1.5F;
   private static final String f_29194 = "Зелья";
   private static final double f_29195 = 0.05;
   private static final double f_29196 = 0.99;
   private static final float f_29197 = 0.5F;
   private static final float f_29198 = -20.0F;
   private static final String f_29199 = "Бутыльки опыта";
   private static final double f_29200 = 0.07;
   private static final double f_29201 = 0.99;
   private static final float f_29202 = 0.7F;
   private static final float f_29203 = -20.0F;
   private static final String f_29204 = "Ветрозаряд";
   private static final float f_29205 = 1.5F;
   private static final String f_29206 = "Трезубец";
   private static final double f_29207 = 0.05;
   private static final double f_29208 = 0.99;
   private static final float f_29209 = 2.5F;
   private static final String f_29210 = "Арбалет";
   private static final double f_29211 = 0.05;
   private static final double f_29212 = 0.99;
   private static final float f_29213 = 3.15F;
   private static final String f_29214 = "Лук";
   private static final double f_29215 = 0.05;
   private static final double f_29216 = 0.99;
   private static final String f_29217 = "Удочка";
   private static final double f_29218 = 0.03;
   private static final double f_29219 = 0.92;
   private static final String f_29220 = "dimasik";
   private static final String f_29221 = "dynamic/prediction_vanilla_pearl";

   private int m_8227(BufferBuilder var1, Matrix4f var2, Vec3 var3, Entity var4) {
      AABB var5 = var4.getBoundingBox().inflate(f_29137);
      int var6 = f_29009;
      Vec3[] var7 = new Vec3[]{
         new Vec3(var5.minX, var5.minY, var5.minZ),
         new Vec3(var5.maxX, var5.minY, var5.minZ),
         new Vec3(var5.maxX, var5.minY, var5.maxZ),
         new Vec3(var5.minX, var5.minY, var5.maxZ)
      };
      Vec3[] var8 = new Vec3[]{
         new Vec3(var5.minX, var5.maxY, var5.minZ),
         new Vec3(var5.maxX, var5.maxY, var5.minZ),
         new Vec3(var5.maxX, var5.maxY, var5.maxZ),
         new Vec3(var5.minX, var5.maxY, var5.maxZ)
      };
      int var9 = 0;

      for (int var10 = 0; var10 < 4; var10++) {
         int var11 = (var10 + 1) % 4;
         var9 += this.m_8259(var1, var2, var3, var7[var10], var7[var11], var6);
         var9 += this.m_8259(var1, var2, var3, var8[var10], var8[var11], var6);
         var9 += this.m_8259(var1, var2, var3, var7[var10], var8[var10], var6);
      }

      return var9;
   }

   private int m_8228(BufferBuilder var1, Matrix4f var2, Vec3 var3, Prediction.UZPSwEAHff6Ihskq var4, float var5) {
      List var6 = var4.path();
      int var7 = var6.size();
      Vec3[] var8 = new Vec3[var7];
      int[] var9 = new int[var7];

      for (int var10 = 0; var10 < var7; var10++) {
         Vec3 var11 = (Vec3)var6.get(var10);
         Vec3 var12 = ((Vec3)var6.get(Math.min(var7 - 1, var10 + 1))).subtract((Vec3)var6.get(Math.max(0, var10 - 1)));
         Vec3 var13 = var11.subtract(var3);
         Vec3 var14 = var12.cross(var13);
         double var15 = var13.length();
         var8[var10] = (var14.lengthSqr() < f_29081 ? new Vec3(1.0, 0.0, 0.0) : var14.normalize())
            .scale(this.m_8261(var15) * (var4.spec() == f_29012 ? f_29082 : 1.0F));
         var9[var10] = var4.spec() == f_29012 ? this.m_8238((float)var10 / (var7 - 1)) : this.m_8249((float)var10 / (var7 - 1), var5, var15, var4.handheld());
      }

      byte var17 = 0;

      for (int var18 = 0; var18 < var7 - 1; var18++) {
         if (Class_BftdentXEtGbugJw.m_2297(var9[var18]) > 1 || Class_BftdentXEtGbugJw.m_2297(var9[var18 + 1]) > 1) {
            float var19 = (float)var18 / (var7 - 1);
            float var20 = (float)(var18 + 1) / (var7 - 1);
            Vec3 var21 = ((Vec3)var6.get(var18)).subtract(var3);
            Vec3 var22 = ((Vec3)var6.get(var18 + 1)).subtract(var3);
            this.m_8240(var1, var2, var21.add(var8[var18]), var19, 0.0F, var9[var18]);
            this.m_8240(var1, var2, var21.subtract(var8[var18]), var19, 1.0F, var9[var18]);
            this.m_8240(var1, var2, var22.subtract(var8[var18 + 1]), var20, 1.0F, var9[var18 + 1]);
            this.m_8240(var1, var2, var22.add(var8[var18 + 1]), var20, 0.0F, var9[var18 + 1]);
            var17 += 4;
         }
      }

      return var17;
   }

   private void m_8229() {
      for (Prediction.Class_7KOg7jmMTWOePFn5 var2 : this.f_29029.values()) {
         var2.f_28997 = false;
      }

      for (Prediction.UZPSwEAHff6Ihskq var11 : this.f_29025) {
         if (var11.spec() != f_29012 && !var11.handheld() && var11.source() != null && !var11.source().isRemoved() && var11.impact() != null) {
            Prediction.Class_7KOg7jmMTWOePFn5 var3 = this.f_29029
               .computeIfAbsent(var11.source().getId(), var2x -> new Prediction.Class_7KOg7jmMTWOePFn5(this.m_8241(var11.source())));
            var3.f_28995 = var11;
            var3.f_28997 = true;
            Entity var4 = ((Projectile)var11.source()).getOwner();
            var3.f_28996 = var4 == null ? f_29150 : var4.getName().getString();
         }
      }

      Iterator var10 = this.f_29029.values().iterator();

      while (var10.hasNext()) {
         Prediction.Class_7KOg7jmMTWOePFn5 var12 = (Prediction.Class_7KOg7jmMTWOePFn5)var10.next();
         var12.f_28993.m_9283(var12.f_28997 ? 1.0F : 0.0F);
         if (!var12.f_28997 && var12.f_28993.m_9288() <= f_29151) {
            var10.remove();
         } else {
            Vector2f var13 = Class_FvJXUGWpZo3zYBW4.m_2690(var12.f_28995.impact());
            if (var13 != null && !(var12.f_28993.m_9288() <= f_29152)) {
               float var14 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(false);
               float var5 = var12.f_28997 ? Math.max(0.0F, var12.f_28995.ticks() - var14) / f_29153 : 0.0F;
               Class_Ssh31B3ljfKeWsvS.m_4864(f_29154 * var12.f_28993.m_9288());

               try {
                  this.m_8258(var13, var12.f_28996, String.format(Locale.ROOT, f_29155, var5), var12.f_28994);
               } finally {
                  Class_Ssh31B3ljfKeWsvS.m_4844();
               }
            }
         }
      }

      this.m_8260();
   }

   private Prediction.QX6pmX0SMjEAzWM2 m_8230(Prediction.IxMiNx55UiYCltE1 var1, Vec3 var2, double var3, float var5, float var6) {
      float var7 = Mth.cos(-var6 * f_29050 - f_29051);
      float var8 = Mth.sin(-var6 * f_29052 - f_29053);
      float var9 = -Mth.cos(-var5 * f_29054);
      float var10 = Mth.sin(-var5 * f_29055);
      Vec3 var11 = new Vec3(-var8, Mth.clamp(-(var10 / var9), f_29056, f_29057), -var7);
      double var12 = var11.length();
      if (var12 < f_29058) {
         return null;
      }

      Vec3 var14 = new Vec3(var2.x - var8 * f_29059, var2.y + var3, var2.z - var7 * f_29060);
      return new Prediction.QX6pmX0SMjEAzWM2(var1, var14, var11.scale(f_29061 / var12 + f_29062), true, false);
   }

   public Prediction() {
      super(f_29033, f_29034, Category.RENDER);
      this.f_29020 = m_8236(f_29035, CompareOp.GREATER_THAN_OR_EQUAL);
      this.f_29021 = m_8267(f_29036, CompareOp.GREATER_THAN_OR_EQUAL);
      this.f_29022 = m_8267(f_29037, CompareOp.ALWAYS_PASS);
      this.f_29023 = this::m_8270;
      this.f_29024 = this::m_8250;
      this.f_29025 = new ArrayList<>();
      this.f_29026 = new ArrayList<>();
      this.f_29027 = f_29038;
      this.f_29029 = new LinkedHashMap<>();
   }

   private void m_8231(Matrix4f var1, Vec3 var2) {
      BufferBuilder var3 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var4 = 0;

      for (Prediction.UZPSwEAHff6Ihskq var6 : this.f_29025) {
         if (var6.spec() != f_29012 && var6.victim() != null) {
            var4 += this.m_8227(var3, var1, var2, var6.victim());
         }
      }

      this.m_8246(var3, var4, this.f_29021);
   }

   private void m_8232(float var1) {
      for (Prediction.QX6pmX0SMjEAzWM2 var3 : this.m_8237(var1)) {
         this.m_8262(this.f_29025, var3);
      }

      long var6 = f_11537.level.getGameTime();
      if (var6 != this.f_29027) {
         this.f_29027 = var6;
         this.m_8265();
      }

      for (Prediction.UZPSwEAHff6Ihskq var5 : this.f_29026) {
         if (var5.source() == null || !var5.source().isRemoved()) {
            this.f_29025.add(var5);
         }
      }
   }

   private boolean m_8233(ItemStack var1) {
      if (f_11537.level != null && var1 != null && !var1.isEmpty()) {
         Reference var2 = f_11537.level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MULTISHOT);
         return EnchantmentHelper.getItemEnchantmentLevel(var2, var1) > 0;
      } else {
         return false;
      }
   }

   private int m_8234(BufferBuilder var1, Matrix4f var2, Vec3 var3, Prediction.UZPSwEAHff6Ihskq var4) {
      Prediction.j9JQSWFPqFuDSo5c var5 = this.m_8257(var4.item());
      Vec3 var6 = var4.impact().subtract(var3).add(0.0, f_29083, 0.0);
      Vec3 var7 = new Vec3(1.0, 0.0, 0.0);
      Vec3 var8 = new Vec3(0.0, 0.0, 1.0);
      double var9 = var5.radius();
      int var11 = this.m_8242(var1, var2, var6, var7, var8, 0.0, var9, f_29084, f_29085, this.m_8274(var5.color(), 24));
      return var11 + this.m_8242(var1, var2, var6, var7, var8, var9 - f_29086, var9 + f_29087, 0.0F, 1.0F, this.m_8274(var5.color(), 200));
   }

   private void m_8235(Matrix4f var1, Vec3 var2, float var3) {
      BufferBuilder var4 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var5 = 0;

      for (Prediction.UZPSwEAHff6Ihskq var7 : this.f_29025) {
         if (var7.spec() == f_29012) {
            var5 += this.m_8228(var4, var1, var2, var7, var3);
            if (var7.impact() != null && this.m_8255(var7)) {
               var5 += this.m_8234(var4, var1, var2, var7);
            }
         }
      }

      this.m_8246(var4, var5, this.f_29022);
   }

   private static RenderPipeline m_8236(String var0, CompareOp var1) {
      return Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(var0)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_29039))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_29040))
         .m_2719(var1)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
   }

   private List<Prediction.QX6pmX0SMjEAzWM2> m_8237(float var1) {
      LocalPlayer var2 = f_11537.player;
      if (var2.isUsingItem()) {
         List var3 = this.m_8271(var2.getItemInHand(var2.getUsedItemHand()), true, var1);
         if (!var3.isEmpty()) {
            return var3;
         }
      }

      List var4 = this.m_8271(var2.getMainHandItem(), false, var1);
      return var4.isEmpty() ? this.m_8271(var2.getOffhandItem(), false, var1) : var4;
   }

   private int m_8238(float var1) {
      int var2 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var3 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO);
      return Class_BftdentXEtGbugJw.m_2302(var2, var3, Mth.clamp(var1, 0.0F, 1.0F));
   }

   private int m_8239(BufferBuilder var1, Matrix4f var2, Vec3 var3, Prediction.UZPSwEAHff6Ihskq var4, float var5) {
      Vec3 var6 = var4.normal() == null ? this.m_8256(var4.impact(), var3) : var4.normal();
      Vec3 var7 = var6.cross(Math.abs(var6.y) > f_29115 ? new Vec3(1.0, 0.0, 0.0) : new Vec3(0.0, 1.0, 0.0));
      if (var7.lengthSqr() < f_29116) {
         return 0;
      }

      var7 = var7.normalize();
      Vec3 var8 = var6.cross(var7).normalize();
      Vec3 var9 = var4.impact().add(var6.scale(f_29117)).subtract(var3);
      double var10 = f_29118;
      int var12 = this.m_8238(1.0F);
      int var13 = 0;
      float var14 = f_29119 + f_29120 * Mth.sin(var5 * f_29121);
      var13 += this.m_8242(var1, var2, var9, var7, var8, var10 * f_29122 * var14, var10 * var14, 0.0F, 1.0F, this.m_8274(var12, 235));
      var13 += this.m_8242(var1, var2, var9, var7, var8, f_29123, var10 * f_29124, f_29125, 0.0F, this.m_8274(var12, 110));
      float var15 = var5 * f_29126 % 1.0F;
      float var16 = 1.0F - var15;
      double var17 = var10 * (f_29127 + var15 * f_29128);
      return var13 + this.m_8242(var1, var2, var9, var7, var8, var17 * f_29129, var17, 0.0F, 1.0F, this.m_8274(var12, Math.round(f_29130 * var16 * var16)));
   }

   private void m_8240(BufferBuilder var1, Matrix4f var2, Vec3 var3, float var4, float var5, int var6) {
      Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var6);
      var1.addVertex(var2, (float)var3.x, (float)var3.y, (float)var3.z).setUv(var4, var5).setColor(var7.x, var7.y, var7.z, var7.w);
   }

   private ItemStack m_8241(Entity var1) {
      if (var1 instanceof ThrownEnderpearl) {
         return new ItemStack(Items.ENDER_PEARL);
      } else if (var1 instanceof ThrowableItemProjectile var3) {
         return var3.getItem().copyWithCount(1);
      } else if (var1 instanceof AbstractArrow var2) {
         return var2.getPickupItemStackOrigin().copyWithCount(1);
      } else if (var1 instanceof AbstractWindCharge) {
         return new ItemStack(Items.WIND_CHARGE);
      } else {
         return var1 instanceof FishingHook ? new ItemStack(Items.FISHING_ROD) : ItemStack.EMPTY;
      }
   }

   private int m_8242(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, Vec3 var5, double var6, double var8, float var10, float var11, int var12) {
      if (Class_BftdentXEtGbugJw.m_2297(var12) <= 1) {
         return 0;
      }

      byte var13 = 0;

      for (int var14 = 0; var14 < 44; var14++) {
         float var15 = f_29131 * var14 / f_29132;
         float var16 = f_29133 * (var14 + 1) / f_29134;
         Vec3 var17 = var4.scale(Mth.cos(var15)).add(var5.scale(Mth.sin(var15)));
         Vec3 var18 = var4.scale(Mth.cos(var16)).add(var5.scale(Mth.sin(var16)));
         float var19 = var14 / f_29135;
         float var20 = (var14 + 1) / f_29136;
         this.m_8240(var1, var2, var3.add(var17.scale(var6)), var19, var10, var12);
         this.m_8240(var1, var2, var3.add(var17.scale(var8)), var19, var11, var12);
         this.m_8240(var1, var2, var3.add(var18.scale(var8)), var20, var11, var12);
         this.m_8240(var1, var2, var3.add(var18.scale(var6)), var20, var10, var12);
         var13 += 4;
      }

      return var13;
   }

   private void m_8243() {
      this.f_29025.clear();
      this.f_29029.clear();
      this.f_29028 = f_11537.level;
      this.f_29026.clear();
      this.f_29027 = f_29043;
   }

   @Override
   public void m_732() {
      this.m_8243();
   }

   private void m_8246(BufferBuilder var1, int var2, RenderPipeline var3) {
      MeshData var4 = var1.build();
      if (var4 != null) {
         if (var2 == 0) {
            var4.close();
         } else {
            GpuBuffer var5 = null;

            try {
               DrawState var6 = var4.drawState();
               int var7 = var6.indexCount();
               AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
               GpuBuffer var9 = var8.getBuffer(var7);
               IndexType var10 = var8.type();
               var5 = RenderSystem.getDevice().createBuffer(() -> f_29181, 32, var4.vertexBuffer());
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
               RenderPass var13 = var12.createRenderPass(
                  () -> f_29180, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var13);
                  var13.setPipeline(var3);
                  var13.setVertexBuffer(0, var5.slice());
                  var13.setIndexBuffer(var9, var10);
                  var13.drawIndexed(var7, 1, 0, 0, 0);
               } catch (Throwable var21) {
                  if (var13 != null) {
                     try {
                        var13.close();
                     } catch (Throwable var20) {
                        var21.addSuppressed(var20);
                     }
                  }

                  throw var21;
               }

               if (var13 != null) {
                  var13.close();
               }
            } finally {
               if (var5 != null) {
                  var5.close();
               }

               var4.close();
            }
         }
      }
   }

   private Prediction.QX6pmX0SMjEAzWM2 m_8248(Prediction.IxMiNx55UiYCltE1 var1, Vec3 var2, double var3, float var5, float var6) {
      LocalPlayer var7 = f_11537.player;
      Vec3 var8 = var7.getDeltaMovement();
      Vec3 var9 = new Vec3(
         -Mth.sin(var6 * f_29044) * Mth.cos(var5 * f_29045), -Mth.sin((var5 + var1.roll()) * f_29046), Mth.cos(var6 * f_29047) * Mth.cos(var5 * f_29048)
      );
      Vec3 var10 = var9.normalize().scale(var1.speed()).add(var8.x, var7.onGround() ? 0.0 : var8.y, var8.z);
      return new Prediction.QX6pmX0SMjEAzWM2(var1, var2.add(0.0, var3 - f_29049, 0.0), var10, true, false);
   }

   private int m_8249(float var1, float var2, double var3, boolean var5) {
      float var6 = var5 ? Mth.clamp(var1 / f_29142, 0.0F, 1.0F) : 1.0F;
      float var7 = Mth.clamp(((float)var3 - f_29143) / f_29144, 0.0F, 1.0F);
      float var8 = f_29145 + f_29146 * Mth.sin(var1 * f_29147 - var2 * f_29148);
      return this.m_8274(this.m_8238(var1), Math.round(f_29149 * var6 * var7 * var8));
   }

   private void m_8250(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.level != null && f_11537.player != null && this.f_29028 == f_11537.level) {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            this.m_8229();
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
         }
      } else {
         this.m_8243();
      }
   }

   private void m_8252(Class_TZhU50s8XmBQCMP5 var1) {
      Vec3 var2 = f_11537.gameRenderer.mainCamera().position();
      Matrix4f var3 = var1.m_5006().last().pose();
      float var4 = (float)(System.currentTimeMillis() % f_29079) / f_29080;
      BufferBuilder var5 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var6 = 0;

      for (Prediction.UZPSwEAHff6Ihskq var8 : this.f_29025) {
         if (var8.spec() != f_29012) {
            var6 += this.m_8228(var5, var3, var2, var8, var4);
            if (var8.impact() != null) {
               var6 += this.m_8239(var5, var3, var2, var8, var4);
            }
         }
      }

      this.m_8246(var5, var6, this.f_29020);
      this.m_8231(var3, var2);
      this.m_8235(var3, var2, var4);
   }

   private Prediction.Class_48TN2fpxjRB8ccxR m_8253(List<Vec3> var1, Prediction.QX6pmX0SMjEAzWM2 var2) {
      Entity var3 = var2.source();
      Object var4 = var3 instanceof Projectile var5 ? var5.getOwner() : f_11537.player;
      List var18 = f_11537.level
         .getEntities(
            (Entity)(var3 == null ? f_11537.player : var3),
            this.m_8254(var1),
            var3x -> this.m_8272(var3x) && (var3x != var4 || !var3x.getBoundingBox().inflate(f_29182).contains(var2.origin()))
         );
      if (var18.isEmpty()) {
         return null;
      }

      for (int var6 = 0; var6 < var1.size() - 1; var6++) {
         Vec3 var7 = (Vec3)var1.get(var6);
         Vec3 var8 = (Vec3)var1.get(var6 + 1);
         Entity var9 = null;
         Vec3 var10 = null;
         double var11 = f_29070;

         for (Entity var14 : (Iterable<Entity>) (Iterable) var18) {
            Optional var15 = var14.getBoundingBox().inflate(f_29071).clip(var7, var8);
            if (!var15.isEmpty()) {
               double var16 = var7.distanceToSqr((Vec3)var15.get());
               if (!(var16 >= var11)) {
                  var9 = var14;
                  var10 = (Vec3)var15.get();
                  var11 = var16;
               }
            }
         }

         if (var9 != null) {
            return new Prediction.Class_48TN2fpxjRB8ccxR(var9, var10, var6);
         }
      }

      return null;
   }

   private AABB m_8254(List<Vec3> var1) {
      double var2 = f_29072;
      double var4 = f_29073;
      double var6 = f_29074;
      double var8 = f_29075;
      double var10 = f_29076;
      double var12 = f_29077;

      for (Vec3 var15 : var1) {
         var2 = Math.min(var2, var15.x);
         var4 = Math.min(var4, var15.y);
         var6 = Math.min(var6, var15.z);
         var8 = Math.max(var8, var15.x);
         var10 = Math.max(var10, var15.y);
         var12 = Math.max(var12, var15.z);
      }

      return new AABB(var2, var4, var6, var8, var10, var12).inflate(f_29078);
   }

   private boolean m_8255(Prediction.UZPSwEAHff6Ihskq var1) {
      return !var1.handheld() && var1.source() instanceof AbstractThrownPotion && !var1.source().isRemoved();
   }

   private Vec3 m_8256(Vec3 var1, Vec3 var2) {
      Vec3 var3 = var2.subtract(var1);
      return var3.lengthSqr() < f_29139 ? new Vec3(0.0, 1.0, 0.0) : var3.normalize();
   }

   private Prediction.j9JQSWFPqFuDSo5c m_8257(ItemStack var1) {
      PotionContents var2 = (PotionContents)var1.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
      ArrayList var3 = new ArrayList();
      String var4 = "";

      for (MobEffectInstance var6 : var2.getAllEffects()) {
         if (var3.isEmpty()) {
            var4 = BuiltInRegistries.MOB_EFFECT.getKey((MobEffect)var6.getEffect().value()).getPath();
         }

         var3.add(((MobEffect)var6.getEffect().value()).getDisplayName().getString() + (var6.getAmplifier() > 0 ? var6.getAmplifier() + 1 + "" : ""));
      }

      float var9 = var1.is(Items.LINGERING_POTION) ? f_29088 : f_29089;

      int var10 = switch (var4) {
         case f_29090 -> f_29103;
         case f_29091 -> f_29104;
         case f_29092 -> f_29105;
         case f_29093, f_29094 -> f_29106;
         case f_29095 -> f_29107;
         case f_29096 -> f_29108;
         case f_29097, f_29098 -> -29696;
         case f_29099 -> f_29109;
         case f_29100 -> f_29110;
         case f_29101 -> f_29111;
         case f_29102 -> f_29112;
         default -> f_29113 | var2.getColor();
      };
      return new Prediction.j9JQSWFPqFuDSo5c(var3.isEmpty() ? var1.getHoverName().getString() : String.join(f_29114, var3), var9, var10);
   }

   private void m_8258(Vector2f var1, String var2, String var3, ItemStack var4) {
      byte var5 = 12;
      byte var6 = 12;
      float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var2, var5);
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var3, var6);
      float var9 = f_29160 + var7 + f_29161 + var8;
      float var10 = f_29162;
      float var11 = Class_qyFZUkNc6oUs6ojL.m_8354();
      float var12 = var1.x - var9 * var11 / 2.0F;
      float var13 = var1.y - var10 * var11 - f_29163;
      Class_Ssh31B3ljfKeWsvS.m_4862(var12, var13);
      Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

      try {
         Class_U4Qsm43RVlUI3Pre.m_5188(var12, var13, var9, var10, f_29164);
         float var14 = var12 + f_29165;
         if (var4.is(Items.ENDER_PEARL)) {
            Class_U4Qsm43RVlUI3Pre.m_5194(
               var12 + f_29166,
               var13 + f_29167,
               f_29168,
               f_29169,
               new Vector4f(0.0F),
               new Vector4f(0.0F, 0.0F, 1.0F, 1.0F),
               new Vector4i(-1),
               this.m_8273().getTextureView()
            );
         } else {
            Class_U4Qsm43RVlUI3Pre.m_5205(var12 + f_29170, var13 + f_29171, f_29172, f_29173, new Vector4f(0.0F), new Vector4i(-1), var4);
         }

         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(), var2, var14 + 2.0F, var13 + f_29174, var5, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
         );
         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var3,
            var14 + var7 + f_29175,
            var13 + f_29176,
            var6,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
         );
      } finally {
         Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
         Class_Ssh31B3ljfKeWsvS.m_4831();
      }
   }

   private int m_8259(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, Vec3 var5, int var6) {
      Vec3 var7 = var4.subtract(var3);
      Vec3 var8 = var5.subtract(var3);
      Vec3 var9 = var8.subtract(var7).cross(var7);
      if (var9.lengthSqr() < f_29138) {
         return 0;
      }

      var9 = var9.normalize();
      Vec3 var10 = var9.scale(this.m_8261(var7.length()));
      Vec3 var11 = var9.scale(this.m_8261(var8.length()));
      this.m_8240(var1, var2, var7.add(var10), 0.0F, 0.0F, var6);
      this.m_8240(var1, var2, var7.subtract(var10), 0.0F, 1.0F, var6);
      this.m_8240(var1, var2, var8.subtract(var11), 1.0F, 1.0F, var6);
      this.m_8240(var1, var2, var8.add(var11), 1.0F, 0.0F, var6);
      return 4;
   }

   private void m_8260() {
      for (Prediction.UZPSwEAHff6Ihskq var2 : this.f_29025) {
         if (var2.spec() == f_29012 && var2.impact() != null && !var2.item().isEmpty() && (var2.source() == null || !var2.source().isRemoved())) {
            Vector2f var3 = Class_FvJXUGWpZo3zYBW4.m_2690(var2.impact());
            if (var3 != null) {
               Prediction.j9JQSWFPqFuDSo5c var4 = this.m_8257(var2.item());
               ArrayList var5 = new ArrayList();
               if (this.m_8255(var2)) {
                  var5.add(String.format(Locale.ROOT, f_29156, var4.radius()));
               }

               float var6 = var2.handheld() ? 0.0F : f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(false);
               var5.add(String.format(Locale.ROOT, f_29157, Math.max(0.0F, var2.ticks() - var6) / f_29158));
               this.m_8258(var3, var4.name(), String.join(f_29159, var5), var2.item());
            }
         }
      }
   }

   private double m_8261(double var1) {
      return Math.max(f_29140, f_29141 * var1);
   }

   private void m_8262(List<Prediction.UZPSwEAHff6Ihskq> var1, Prediction.QX6pmX0SMjEAzWM2 var2) {
      if (var2 != null) {
         Prediction.UZPSwEAHff6Ihskq var3 = this.m_8263(var2);
         if (var3.path().size() >= 2) {
            var1.add(var3);
         }
      }
   }

   private Prediction.UZPSwEAHff6Ihskq m_8263(Prediction.QX6pmX0SMjEAzWM2 var1) {
      Prediction.IxMiNx55UiYCltE1 var2 = var1.spec();
      Prediction.kwpBmO3FObYwx0OS var3 = var2.physics();
      ArrayList var4 = new ArrayList();
      var4.add(var1.origin());
      Vec3 var5 = var1.origin();
      Vec3 var6 = var1.velocity();
      Vec3 var7 = null;
      Fluid var8 = var2.stopsInWater() ? Fluid.ANY : Fluid.NONE;

      for (int var9 = 0; var9 < 400; var9++) {
         double var10 = var1.source() != null && var1.source().isNoGravity() ? 0.0 : var2.gravity();
         if (var3.f_28999) {
            var6 = var6.add(0.0, -var10, 0.0);
         }

         double var12 = (var2 == f_29010 || var2 == f_29012) && f_11537.level.getFluidState(BlockPos.containing(var5)).is(FluidTags.WATER)
            ? f_29069
            : var2.drag();
         if (var3.f_29000) {
            var6 = var6.scale(var12);
         }

         Vec3 var14 = var5.add(var6);
         BlockHitResult var15 = f_11537.level.clip(new ClipContext(var5, var14, Block.COLLIDER, var8, f_11537.player));
         boolean var16 = var15.getType() != Type.MISS;
         var5 = var16 ? var15.getLocation() : var14;
         var4.add(var5);
         if (var16) {
            var7 = var15.getDirection().getUnitVec3();
            break;
         }

         if (!var3.f_29000) {
            var6 = var6.scale(var12);
         }

         if (!var3.f_28999) {
            var6 = var6.add(0.0, -var10, 0.0);
         }

         if (var5.y < f_11537.level.getMinY() - 16) {
            break;
         }
      }

      Prediction.Class_48TN2fpxjRB8ccxR var17 = this.m_8253(var4, var1);
      if (var17 != null) {
         ArrayList var18 = new ArrayList(var4.subList(0, var17.step() + 1));
         var18.add(var17.position());
         return new Prediction.UZPSwEAHff6Ihskq(
            var2, var18, var17.position(), null, var17.entity(), var17.step() + 1, var1.handheld(), var1.info(), var1.source(), var1.item()
         );
      } else {
         return new Prediction.UZPSwEAHff6Ihskq(
            var2, var4, var7 == null ? null : var5, var7, null, var4.size() - 1, var1.handheld(), var1.info(), var1.source(), var1.item()
         );
      }
   }

   private Prediction.QX6pmX0SMjEAzWM2 m_8264(Entity var1) {
      Prediction.IxMiNx55UiYCltE1 var2 = this.m_8266(var1);
      if (var2 == null) {
         return null;
      } else {
         Vec3 var3 = var1.getDeltaMovement();
         if (var3.lengthSqr() < f_29067) {
            return null;
         } else if (!var2.stopsInWater() || !var1.isInWater() && !var1.onGround()) {
            return var1.distanceToSqr(f_11537.player) > f_29068
               ? null
               : new Prediction.QX6pmX0SMjEAzWM2(
                  var2, var1.position(), var3, false, true, var1, var1 instanceof ThrowableItemProjectile var4 ? var4.getItem().copy() : ItemStack.EMPTY
               );
         } else {
            return null;
         }
      }
   }

   private void m_8265() {
      this.f_29026.clear();

      for (Entity var2 : f_11537.level.entitiesForRendering()) {
         if (this.f_29026.size() >= 12) {
            break;
         }

         Prediction.QX6pmX0SMjEAzWM2 var3 = this.m_8264(var2);
         if (var3 != null) {
            this.m_8262(this.f_29026, var3.withInfo(true));
         }
      }
   }

   private Prediction.IxMiNx55UiYCltE1 m_8266(Entity var1) {
      if (var1 instanceof ThrownEnderpearl) {
         return f_29010;
      } else if (var1 instanceof Snowball || var1 instanceof ThrownEgg) {
         return f_29011;
      } else if (var1 instanceof AbstractThrownPotion) {
         return f_29012;
      } else if (var1 instanceof ThrownExperienceBottle) {
         return f_29013;
      } else if (var1 instanceof AbstractWindCharge) {
         return f_29014;
      } else if (var1 instanceof ThrownTrident) {
         return f_29015;
      } else if (var1 instanceof AbstractArrow) {
         return f_29017;
      } else {
         return var1 instanceof FishingHook ? f_29018 : null;
      }
   }

   private static RenderPipeline m_8267(String var0, CompareOp var1) {
      return Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(var0)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_29041))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_29042))
         .m_2719(var1)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
   }

   private Prediction.IxMiNx55UiYCltE1 m_8269(ItemStack var1, boolean var2) {
      Item var3 = var1.getItem();
      if (var3 == Items.ENDER_PEARL) {
         return f_29010;
      }

      if (var3 == Items.SNOWBALL || var3 == Items.EGG) {
         return f_29011;
      }

      if (var3 == Items.SPLASH_POTION || var3 == Items.LINGERING_POTION) {
         return f_29012;
      }

      if (var3 == Items.EXPERIENCE_BOTTLE) {
         return f_29013;
      }

      if (var3 == Items.WIND_CHARGE) {
         return f_29014;
      }

      if (var3 == Items.TRIDENT) {
         return f_29015;
      }

      if (var3 == Items.FISHING_ROD) {
         return f_29018;
      }

      if (var3 instanceof BowItem) {
         if (f_11537.player.getProjectile(var1).isEmpty() && !f_11537.player.hasInfiniteMaterials()) {
            return null;
         }

         float var5 = var2 ? BowItem.getPowerForTime(f_11537.player.getTicksUsingItem()) : 1.0F;
         return var5 < f_29063
            ? null
            : new Prediction.IxMiNx55UiYCltE1(f_29017.group(), Prediction.kwpBmO3FObYwx0OS.ARROW, f_29064, f_29065, var5 * f_29066, 0.0F, false);
      } else {
         if (!(var3 instanceof CrossbowItem)) {
            return null;
         }

         if (!CrossbowItem.isCharged(var1)) {
            return null;
         }

         ChargedProjectiles var4 = (ChargedProjectiles)var1.get(DataComponents.CHARGED_PROJECTILES);
         return var4 != null && var4.contains(Items.FIREWORK_ROCKET) ? null : f_29016;
      }
   }

   @Override
   public void m_778() {
      this.m_8243();
   }

   private void m_8270(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.f_29028 != f_11537.level || f_11537.player == null || f_11537.level == null) {
         this.m_8243();
      }

      this.f_29025.clear();
      if (f_11537.player != null && f_11537.level != null) {
         this.m_8232(var1.m_5005().getGameTimeDeltaPartialTick(true));
         if (!this.f_29025.isEmpty()) {
            this.m_8252(var1);
         }
      }
   }

   private List<Prediction.QX6pmX0SMjEAzWM2> m_8271(ItemStack var1, boolean var2, float var3) {
      Prediction.IxMiNx55UiYCltE1 var4 = this.m_8269(var1, var2);
      if (var4 == null) {
         return List.of();
      }

      LocalPlayer var5 = f_11537.player;
      float var6 = var5.getXRot();
      float var7 = var5.getYRot();
      Vec3 var8 = new Vec3(Mth.lerp(var3, var5.xo, var5.getX()), Mth.lerp(var3, var5.yo, var5.getY()), Mth.lerp(var3, var5.zo, var5.getZ()));
      double var9 = var5.getEyeY() - var5.getY();
      if (var4.physics() == Prediction.kwpBmO3FObYwx0OS.BOBBER) {
         Prediction.QX6pmX0SMjEAzWM2 var19 = this.m_8230(var4, var8, var9, var6, var7);
         return var19 == null ? List.of() : List.of(var19.withInfo(true));
      }

      boolean var11 = var4 == f_29016 && this.m_8233(var1);
      float[] var12 = var11 ? f_29008 : new float[]{0.0F};
      ArrayList var13 = new ArrayList(var12.length);

      for (float var17 : var12) {
         Prediction.QX6pmX0SMjEAzWM2 var18 = this.m_8248(var4, var8, var9, var6, var7 + var17);
         if (var18 != null) {
            var13.add(var18.withInfo(var17 == 0.0F).withItem(var1));
         }
      }

      return var13;
   }

   private boolean m_8272(Entity var1) {
      return var1.isAlive() && !var1.isSpectator() && var1.canBeHitByProjectile();
   }

   private DynamicTexture m_8273() {
      if (this.f_29032 == null) {
         try (ByteArrayInputStream var1 = new ByteArrayInputStream(Base64.getDecoder().decode(f_29177))) {
            NativeImage var2 = NativeImage.read(var1);
            this.f_29032 = new DynamicTexture(() -> f_29179, var2);
            f_11537.getTextureManager().register(f_29030, this.f_29032);
         } catch (IOException var6) {
            throw new IllegalStateException(f_29178, var6);
         }
      }

      return this.f_29032;
   }

   private int m_8274(int var1, int var2) {
      return Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var1), Class_BftdentXEtGbugJw.m_2299(var1), Class_BftdentXEtGbugJw.m_2308(var1), Mth.clamp(var2, 0, 255)
      );
   }

   private record Class_48TN2fpxjRB8ccxR(Entity entity, Vec3 position, int step) {
   }

   private static final class Class_7KOg7jmMTWOePFn5 {
      public final Class_w8fCJQ5ZtH5lQbWc f_28993;
      public final ItemStack f_28994;
      public Prediction.UZPSwEAHff6Ihskq f_28995;
      public String f_28996;
      public boolean f_28997;
      public static final float f_28998 = 10.0F;

      public Class_7KOg7jmMTWOePFn5(ItemStack var1) {
         this.f_28993 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_28998);
         this.f_28994 = var1;
      }
   }

   private record IxMiNx55UiYCltE1(
      String group, Prediction.kwpBmO3FObYwx0OS physics, double gravity, double drag, float speed, float roll, boolean stopsInWater
   ) {
   }

   private record QX6pmX0SMjEAzWM2(Prediction.IxMiNx55UiYCltE1 spec, Vec3 origin, Vec3 velocity, boolean handheld, boolean info, Entity source, ItemStack item) {
      public Prediction.QX6pmX0SMjEAzWM2 withItem(ItemStack var1) {
         return new Prediction.QX6pmX0SMjEAzWM2(this.spec, this.origin, this.velocity, this.handheld, this.info, this.source, var1.copy());
      }

      public Prediction.QX6pmX0SMjEAzWM2 withInfo(boolean var1) {
         return new Prediction.QX6pmX0SMjEAzWM2(this.spec, this.origin, this.velocity, this.handheld, var1, this.source, this.item);
      }

      public QX6pmX0SMjEAzWM2(Prediction.IxMiNx55UiYCltE1 var1, Vec3 var2, Vec3 var3, boolean var4, boolean var5) {
         this(var1, var2, var3, var4, var5, null, ItemStack.EMPTY);
      }
   }

   private record UZPSwEAHff6Ihskq(
      Prediction.IxMiNx55UiYCltE1 spec,
      List<Vec3> path,
      Vec3 impact,
      Vec3 normal,
      Entity victim,
      int ticks,
      boolean handheld,
      boolean info,
      Entity source,
      ItemStack item
   ) {
   }

   private record j9JQSWFPqFuDSo5c(String name, float radius, int color) {
   }

   private enum kwpBmO3FObYwx0OS {
      THROWN(true, true),
      ARROW(false, false),
      STRAIGHT(false, true),
      BOBBER(true, false);

      public final boolean f_28999;
      public final boolean f_29000;

      kwpBmO3FObYwx0OS(boolean var3, boolean var4) {
         this.f_28999 = var3;
         this.f_29000 = var4;
      }
   }
}
