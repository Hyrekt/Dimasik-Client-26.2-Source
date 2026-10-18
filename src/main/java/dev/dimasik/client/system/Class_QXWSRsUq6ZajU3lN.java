package dev.dimasik.client.system;

import com.google.common.base.Suppliers;
import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_QXWSRsUq6ZajU3lN implements Class_NzJrN63M7QBpmAbi, Class_b8v0o2NnCtANmOp9 {
   private final Map<Class_jZQ0pP9BTU3L7miy, Integer> f_12249 = new HashMap<>();
   private final VertexFormat f_12250;
   private final RenderPipeline f_12251;
   private final RenderPipeline f_12252;
   private RenderPipeline f_12253;
   private final Class_io22eRA7pjGbGIOA f_12254;
   private final Class_Trm8dR6i9vMfnZEG f_12255;
   private final Supplier<TextureTarget> f_12256;
   private final RenderTarget f_12257;
   private final List<GpuTextureView> f_12258;
   private final List<FilterMode> f_12259;
   private int f_12260;
   private boolean f_12261;
   private boolean f_12262;
   private boolean f_12263;
   private GpuTextureView f_12264;
   private final Class_PoKta0VE7AdhY1En f_12265;
   private BufferBuilder f_12266;
   private static final String f_12267 = "Position";
   private static final String f_12268 = "Color";
   private static final String f_12269 = "UV0";
   private static final String f_12270 = "UV1";
   private static final String f_12271 = "UV2";
   private static final String f_12272 = "dimasik/batch";
   private static final String f_12273 = "dimasik/batch_lightning";
   private static final String f_12274 = "dimasik";
   private static final String f_12275 = "batching";
   private static final int f_12276 = 2097152;
   private static final String f_12277 = "batch";
   private static final String f_12278 = "batch";
   private static final String f_12279 = "Sampler0";
   private static final String f_12280 = "Sampler1";
   private static final String f_12281 = "Sampler2";
   private static final String f_12282 = "Sampler3";
   private static final String f_12283 = "Sampler4";
   private static final String f_12284 = "Sampler5";
   private static final String f_12285 = "Sampler6";
   private static final String f_12286 = "Sampler10";
   private static final String f_12287 = "Sampler11";
   private static final String f_12288 = "Sampler12";
   private static final String f_12289 = "Sampler13";
   private static final float f_12290 = -1.0F;
   private static final float f_12291 = 255.0F;
   private static final float f_12292 = 255.0F;
   private static final float f_12293 = 255.0F;
   private static final float f_12294 = 255.0F;
   private static final float f_12295 = 32767.0F;
   private static final float f_12296 = 32767.0F;
   private static final float f_12297 = -1.0F;
   private static final float f_12298 = 255.0F;
   private static final float f_12299 = 255.0F;
   private static final float f_12300 = 255.0F;
   private static final float f_12301 = 255.0F;
   private static final float f_12302 = 32767.0F;
   private static final float f_12303 = 32767.0F;
   private static final float f_12304 = 0.5F;
   private static final float f_12305 = 0.5F;
   private static final float f_12306 = -1.0F;
   private static final float f_12307 = 255.0F;
   private static final float f_12308 = 32767.0F;
   private static final float f_12309 = 32767.0F;
   private static final float f_12310 = 30.0F;
   private static final float f_12311 = -1.0F;
   private static final float f_12312 = 255.0F;
   private static final float f_12313 = 32767.0F;
   private static final float f_12314 = 32767.0F;
   private static final float f_12315 = 4.0F;
   private static final float f_12316 = 20.0F;
   private static final float f_12317 = 4.0F;
   private static final float f_12318 = 4.0F;
   private static final float f_12319 = 4.0F;
   private static final float f_12320 = 4.0F;
   private static final String f_12321 = "Sampler10";
   private static final String f_12322 = "Sampler11";
   private static final String f_12323 = "Sampler12";
   private static final String f_12324 = "Sampler13";
   private static final int f_12325 = 16777215;
   private static final String f_12326 = "batchPass";
   private static final String f_12327 = "temp";

   public void m_4410(Class_jZQ0pP9BTU3L7miy... var1) {
      if (this.f_12260 <= 0) {
         this.f_12260 = 1;
         this.f_12263 = false;
         this.f_12249.clear();
         this.f_12255.m_5058();
         int var7 = 0;

         for (Class_jZQ0pP9BTU3L7miy var15 : var1) {
            this.f_12249.put(var15, var7++);
         }
      } else {
         this.f_12260++;
         boolean var2 = false;

         for (Class_jZQ0pP9BTU3L7miy var6 : var1) {
            if (!this.f_12249.containsKey(var6)) {
               var2 = true;
               break;
            }
         }

         if (var2 && (!this.f_12258.isEmpty() || this.f_12264 != null)) {
            this.m_4436(this.m_4412());
         }

         for (Class_jZQ0pP9BTU3L7miy var14 : var1) {
            this.f_12249.putIfAbsent(var14, this.f_12249.size());
         }
      }
   }

   public void m_4411(Class_jZQ0pP9BTU3L7miy... var1) {
      if (this.f_12260 > 0) {
         this.f_12260--;
      }

      if (this.f_12260 <= 0) {
         this.m_4436(this.m_4412());
         this.f_12249.clear();
      }
   }

   private Class_jZQ0pP9BTU3L7miy[] m_4412() {
      return this.f_12249.entrySet().stream().sorted(Entry.comparingByValue()).map(Entry::getKey).toArray(Class_jZQ0pP9BTU3L7miy[]::new);
   }

   public void m_4413(float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6, GpuTextureView var7) {
      this.m_4439(var1, var2, var3, var4, var5, new Vector4f(0.0F, 0.0F, 1.0F, 1.0F), var6, var7, false, FilterMode.LINEAR);
   }

   private void m_4414(float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6, Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC var7) {
      float var8 = Minecraft.getInstance().getWindow().getScreenWidth();
      float var9 = Minecraft.getInstance().getWindow().getScreenHeight();
      float var10 = 2.0F * var3 / var8;
      float var11 = 2.0F * var4 / var9;
      float var12 = f_12306 + var1 * 2.0F / var8;
      float var13 = 1.0F - var2 * 2.0F / var9 - var11;
      Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var6.x);
      Vector4f var15 = Class_BftdentXEtGbugJw.m_2298(var6.y);
      Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(var6.z);
      Vector4f var17 = Class_BftdentXEtGbugJw.m_2298(var6.w);
      float var18 = Class_Ssh31B3ljfKeWsvS.m_4821() / f_12307;
      var14.w *= var18;
      var15.w *= var18;
      var16.w *= var18;
      var17.w *= var18;
      int var19 = Math.round(Math.clamp(var3, 0.0F, f_12308));
      int var20 = Math.round(Math.clamp(var4, 0.0F, f_12309));
      int var21 = this.m_4440(var5.x, var5.y);
      int var22 = this.m_4440(var5.z, var5.w);
      float var23 = f_12310;
      float var24 = var7.m_5055();
      float var25 = var7.m_5056();
      float var26 = var7.vTop();
      float var27 = var7.vBottom();
      this.f_12266
         .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13, 0.0F)
         .setUv(var23 + var24, var23 + var27)
         .setColor(var14.x, var14.y, var14.z, var14.w)
         .setUv1(var21, var22)
         .setUv2(var20, var19);
      this.f_12266
         .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13, 0.0F)
         .setUv(var23 + var25, var23 + var27)
         .setColor(var15.x, var15.y, var15.z, var15.w)
         .setUv1(var21, var22)
         .setUv2(var20, var19);
      this.f_12266
         .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13 + var11, 0.0F)
         .setUv(var23 + var25, var23 + var26)
         .setColor(var16.x, var16.y, var16.z, var16.w)
         .setUv1(var21, var22)
         .setUv2(var20, var19);
      this.f_12266
         .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13 + var11, 0.0F)
         .setUv(var23 + var24, var23 + var26)
         .setColor(var17.x, var17.y, var17.z, var17.w)
         .setUv1(var21, var22)
         .setUv2(var20, var19);
   }

   public void m_4415(float var1, float var2, float var3, float var4, Vector4f var5, Vector4f var6, Vector4i var7, GpuTextureView var8) {
      this.m_4439(var1, var2, var3, var4, var5, var6, var7, var8, true, FilterMode.LINEAR);
   }

   public void m_4416(float var1, float var2, float var3, float var4, Vector4f var5, Vector4f var6, Vector4i var7, GpuTextureView var8) {
      this.m_4439(var1, var2, var3, var4, var5, var6, var7, var8, true, FilterMode.NEAREST);
   }

   public void m_4417(boolean var1) {
      RenderPipeline var2 = var1 ? this.f_12252 : this.f_12251;
      if (this.f_12253 != var2) {
         if (this.f_12266.vertices > 0) {
            this.m_4436(this.m_4412());
         }

         this.f_12253 = var2;
      }
   }

   public void m_4418(
      float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6, ItemStack var7, Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U var8
   ) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F) && (var6.x | var6.y | var6.z | var6.w) >>> 24 != 0) {
         Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC var9 = this.f_12255.m_5063(var7, var8);
         if (var9 != null) {
            this.m_4414(var1, var2, var3, var4, var5, var6, var9);
         }
      }
   }

   public void m_4420(float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6, ItemStack var7) {
      this.m_4422(var1, var2, var3, var4, var5, var6, var7, null);
   }

   public void m_4421(Class_jZQ0pP9BTU3L7miy var1, String var2, float var3, float var4, int var5, int var6) {
      Integer var7 = this.f_12249.get(var1);
      if (var7 != null) {
         var1.m_7383().m_2148(this.f_12266, var2, var5, var1.m_7383().m_2149().m_4101(), var7, 0.0F, var3, var4 + var1.m_7383().m_2151().m_4106() * var5, var6);
      }
   }

   public void m_4422(
      float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6, ItemStack var7, Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U var8
   ) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F) && (var6.x | var6.y | var6.z | var6.w) >>> 24 != 0) {
         Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC var9 = var8 == null ? this.f_12255.m_5067(var7) : this.f_12255.m_5063(var7, var8);
         if (var9 != null) {
            GpuTextureView var10 = this.f_12255.m_5062();
            float var11 = f_12304 / var10.getWidth(0);
            float var12 = f_12305 / var10.getHeight(0);
            Vector4f var13 = new Vector4f(
               var9.m_5055() + var11, var9.vTop() - var12, var9.m_5056() - var9.m_5055() - var11 * 2.0F, var9.vBottom() - var9.vTop() + var12 * 2.0F
            );
            this.m_4439(var1, var2, var3, var4, var5, var13, var6, var10, true, FilterMode.LINEAR);
         }
      }
   }

   private BufferBuilder m_4423() {
      return this.f_12265.m_4162(PrimitiveTopology.QUADS, this.f_12250);
   }

   public void m_4424(float var1, float var2, float var3, float var4, float var5, int var6, Vector4f var7, Vector4i var8) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F) && (var8.x | var8.y | var8.z | var8.w) >>> 24 != 0) {
         this.f_12261 |= var6 == 9;
         this.f_12262 |= var6 == 11;
         float var9 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var3;
         float var10 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var4;
         float var11 = f_12290 + var1 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
         float var12 = 1.0F - var2 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var10;
         Vector4f var13 = Class_BftdentXEtGbugJw.m_2298(var8.x);
         Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var8.y);
         Vector4f var15 = Class_BftdentXEtGbugJw.m_2298(var8.z);
         Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(var8.w);
         var13.w = var13.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12291);
         var14.w = var14.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12292);
         var15.w = var15.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12293);
         var16.w = var16.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12294);
         int var17 = Math.round(Math.clamp(var3, 0.0F, f_12295));
         int var18 = Math.round(Math.clamp(var4, 0.0F, f_12296));
         int var19 = this.m_4440(var7.x, var7.y);
         int var20 = this.m_4440(var7.z, var7.w);
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var11, var12, 0.0F)
            .setUv(var5, var6)
            .setColor(var13.x, var13.y, var13.z, var13.w)
            .setUv1(var19, var20)
            .setUv2(var18, var17);
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var11 + var9, var12, 0.0F)
            .setUv(var5, var6)
            .setColor(var14.x, var14.y, var14.z, var14.w)
            .setUv1(var19, var20)
            .setUv2(var18, var17);
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var11 + var9, var12 + var10, 0.0F)
            .setUv(var5, var6)
            .setColor(var15.x, var15.y, var15.z, var15.w)
            .setUv1(var19, var20)
            .setUv2(var18, var17);
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var11, var12 + var10, 0.0F)
            .setUv(var5, var6)
            .setColor(var16.x, var16.y, var16.z, var16.w)
            .setUv1(var19, var20)
            .setUv2(var18, var17);
      }
   }

   private float m_4425(
      Class_jZQ0pP9BTU3L7miy var1, BufferBuilder var2, String var3, float var4, float var5, float var6, int var7, int var8, float var9, float var10
   ) {
      if (var3.isEmpty()) {
         return var4;
      }

      if (Float.isFinite(var9) && Float.isFinite(var10)) {
         var1.m_7383().m_2155(var2, var3, var6, var1.m_7383().m_2149().m_4101(), var7, 0.0F, var4, var5, var8, var9, var10);
      } else {
         var1.m_7383().m_2148(var2, var3, var6, var1.m_7383().m_2149().m_4101(), var7, 0.0F, var4, var5, var8);
      }

      return var4 + var1.m_7383().m_2153(var3, var6, 0.0F, 1.0F);
   }

   private int m_4426(int var1, int var2) {
      return var2 << 24 | var1 & f_12325;
   }

   public void m_4427(float var1, float var2, float var3, float var4, float var5, int var6, Vector4f var7, int var8) {
      this.m_4424(var1, var2, var3, var4, var5, var6, var7, new Vector4i(var8));
   }

   private RenderPipeline m_4428(String var1, BlendFunction var2) {
      return Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(var1)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_12277))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_12278))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(this.f_12250, PrimitiveTopology.QUADS)
         .m_2732(var2)
         .m_2741(f_12279)
         .m_2741(f_12280)
         .m_2741(f_12281)
         .m_2741(f_12282)
         .m_2741(f_12283)
         .m_2741(f_12284)
         .m_2741(f_12285)
         .m_2741(f_12286)
         .m_2741(f_12287)
         .m_2741(f_12288)
         .m_2741(f_12289)
         .m_2725(false)
         .m_2722();
   }

   private float m_4429(
      Class_jZQ0pP9BTU3L7miy var1, BufferBuilder var2, String var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10, float var11
   ) {
      int var12 = var8;
      int var13 = 0;

      for (int var14 = 0; var14 < var3.length() - 1; var14++) {
         if (var3.charAt(var14) == 167) {
            if (var13 < var14) {
               var4 = this.m_4425(var1, var2, var3.substring(var13, var14), var4, var5, var6, var7, var12, var10, var11);
            }

            ChatFormatting var15 = ChatFormatting.getByCode(Character.toLowerCase(var3.charAt(var14 + 1)));
            if (var15 != null) {
               if (TextColor.fromLegacyFormat(var15) != null) {
                  Integer var16 = TextColor.fromLegacyFormat(var15).getValue();
                  if (var16 != null) {
                     var12 = this.m_4426(var16, var9);
                  }
               } else if (var15 == ChatFormatting.RESET) {
                  var12 = var8;
               }
            }

            var13 = ++var14 + 1;
         }
      }

      if (var13 < var3.length()) {
         var4 = this.m_4425(var1, var2, var13 == 0 ? var3 : var3.substring(var13), var4, var5, var6, var7, var12, var10, var11);
      }

      return var4;
   }

   public void m_4431() {
      try {
         if (this.f_12266.vertices > 0) {
            this.m_4436(this.m_4412());
         }
      } finally {
         this.f_12260 = 0;
         this.f_12261 = false;
         this.f_12262 = false;
         this.f_12263 = false;
         this.f_12249.clear();
         this.f_12264 = null;
         this.f_12258.clear();
         this.f_12259.clear();
         this.f_12253 = this.f_12251;
         if (this.f_12266.vertices > 0) {
            this.m_4432();
         }
      }
   }

   private void m_4432() {
      MeshData var1 = this.f_12266.build();
      if (var1 != null) {
         var1.close();
      }

      this.f_12266 = this.m_4423();
   }

   public void m_4433(float var1, float var2, float var3, float var4, Vector4f var5, Vector4f var6, Vector4i var7, Identifier var8) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F) && (var7.x | var7.y | var7.z | var7.w) >>> 24 != 0) {
         Class_io22eRA7pjGbGIOA.RPbo2rllLQHpk88Z var9 = this.f_12254.m_7316(var8);
         if (var9 != null) {
            float var10 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var3;
            float var11 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var4;
            float var12 = f_12297 + var1 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
            float var13 = 1.0F - var2 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var11;
            Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var7.x);
            Vector4f var15 = Class_BftdentXEtGbugJw.m_2298(var7.y);
            Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(var7.z);
            Vector4f var17 = Class_BftdentXEtGbugJw.m_2298(var7.w);
            var14.w = var14.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12298);
            var15.w = var15.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12299);
            var16.w = var16.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12300);
            var17.w = var17.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12301);
            int var18 = Math.round(Math.clamp(var3, 0.0F, f_12302));
            int var19 = Math.round(Math.clamp(var4, 0.0F, f_12303));
            int var20 = this.m_4440(var5.x, var5.y);
            int var21 = this.m_4440(var5.z, var5.w);
            float var22 = var9.m_7308() - var9.m_7309();
            float var23 = var9.m_7310() - var9.m_7311();
            float var24 = var9.m_7309() + var6.x * var22;
            float var25 = var9.m_7311() + var6.y * var23;
            float var26 = var24 + var6.z * var22;
            float var27 = var25 + var6.w * var23;
            this.f_12266
               .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13, 0.0F)
               .setUv(2.0F + var24, 2.0F + var27)
               .setColor(var14.x, var14.y, var14.z, var14.w)
               .setUv1(var20, var21)
               .setUv2(var19, var18);
            this.f_12266
               .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13, 0.0F)
               .setUv(2.0F + var26, 2.0F + var27)
               .setColor(var15.x, var15.y, var15.z, var15.w)
               .setUv1(var20, var21)
               .setUv2(var19, var18);
            this.f_12266
               .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12 + var10, var13 + var11, 0.0F)
               .setUv(2.0F + var26, 2.0F + var25)
               .setColor(var16.x, var16.y, var16.z, var16.w)
               .setUv1(var20, var21)
               .setUv2(var19, var18);
            this.f_12266
               .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var12, var13 + var11, 0.0F)
               .setUv(2.0F + var24, 2.0F + var25)
               .setColor(var17.x, var17.y, var17.z, var17.w)
               .setUv1(var20, var21)
               .setUv2(var19, var18);
         }
      }
   }

   public void m_4435() {
      this.f_12260 = 0;
      this.f_12261 = false;
      this.f_12262 = false;
      this.f_12263 = false;
      this.f_12249.clear();
      this.f_12264 = null;
      this.f_12258.clear();
      this.f_12259.clear();
      this.f_12253 = this.f_12251;
      if (this.f_12266.vertices > 0) {
         this.m_4432();
      }
   }

   public void m_4436(Class_jZQ0pP9BTU3L7miy... var1) {
      if (this.f_12266.vertices > 0) {
         this.f_12255.m_5060();
         this.f_12254.m_7320(4);
         CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
         GpuTextureView var3 = this.f_12254.m_7318().getTextureView();
         if (this.f_12261 || this.f_12262) {
            TextureTarget var4 = this.f_12256.get();
            if (var4.width != this.f_12257.width || var4.height != this.f_12257.height) {
               var4.resize(this.f_12257.width, this.f_12257.height);
               this.f_12263 = false;
            }

            if (this.f_12261 || !this.f_12263) {
               var2.copyTextureToTexture(this.f_12257.getColorTexture(), var4.getColorTexture(), 0, 0, 0, 0, 0, this.f_12257.width, this.f_12257.height);
               this.f_12263 = true;
            }

            var3 = var4.getColorTextureView();
         }

         RenderPass var13 = var2.createRenderPass(() -> f_12326, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var13);
         int var5 = 0;

         for (Class_jZQ0pP9BTU3L7miy var9 : var1) {
            var13.bindTexture("Sampler" + var5, var9.m_7383().m_2145().getTextureView(), var9.m_7383().m_2145().getSampler());
            var5++;
         }

         for (int var14 = 0; var14 < this.f_12258.size(); var14++) {
            var13.bindTexture("Sampler" + var5, this.f_12258.get(var14), RenderSystem.getSamplerCache().getClampToEdge(this.f_12259.get(var14)));
            var5++;
         }

         while (var5 < 7) {
            var13.bindTexture("Sampler" + var5, this.f_12254.m_7318().getTextureView(), this.f_12254.m_7318().getSampler());
            var5++;
         }

         var13.bindTexture(f_12321, var3, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         var13.bindTexture(f_12322, this.f_12254.m_7318().getTextureView(), this.f_12254.m_7318().getSampler());
         var13.bindTexture(
            f_12323,
            this.f_12264 == null ? this.f_12254.m_7318().getTextureView() : this.f_12264,
            RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR)
         );
         var13.bindTexture(f_12324, this.f_12255.m_5062(), RenderSystem.getSamplerCache().getRepeat(FilterMode.NEAREST));

         try {
            this.m_5998(this.f_12266, var13, this.f_12253);
         } finally {
            this.f_12266 = this.m_4423();
            this.f_12261 = false;
            this.f_12262 = false;
            this.f_12264 = null;
            this.f_12258.clear();
            this.f_12259.clear();
         }
      }
   }

   public void m_4437(Class_jZQ0pP9BTU3L7miy var1, Component var2, float var3, float var4, int var5, int var6, float var7, float var8) {
      Integer var9 = this.f_12249.get(var1);
      if (var9 != null) {
         float var10 = var4 + var1.m_7383().m_2151().m_4106() * var5;
         float[] var11 = new float[]{var3};
         int var12 = var6 >>> 24;
         float var13 = var3 + var7;
         float var14 = Math.max(var3, var13 - var8);
         var2.visit((var10x, var11x) -> {
            if (!var11x.isEmpty()) {
               int var12x = var10x.getColor() == null ? var6 : this.m_4426(var10x.getColor().getValue(), var12);
               var11[0] = this.m_4429(var1, this.f_12266, var11x, var11[0], var10, var5, var9, var12x, var12, var14, var13);
            }

            return Optional.empty();
         }, Style.EMPTY);
      }
   }

   public void m_4438(float var1, float var2, float var3, float var4, float var5, int var6, float var7, int var8) {
      this.m_4427(var1, var2, var3, var4, var5, var6, new Vector4f(var7), var8);
   }

   private void m_4439(
      float var1, float var2, float var3, float var4, Vector4f var5, Vector4f var6, Vector4i var7, GpuTextureView var8, boolean var9, FilterMode var10
   ) {
      if (var8 != null && !(var3 <= 0.0F) && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F) && var7.x >>> 24 != 0) {
         int var11 = -1;
         int var12 = Math.max(0, 7 - this.f_12249.size());
         if (var12 > 0) {
            for (int var13 = 0; var13 < this.f_12258.size(); var13++) {
               if (this.f_12258.get(var13) == var8) {
                  var11 = this.f_12249.size() + var13;
                  break;
               }
            }

            if (var11 < 0) {
               if (this.f_12258.size() >= var12) {
                  this.m_4436(this.m_4412());
               }

               this.f_12258.add(var8);
               this.f_12259.add(var10);
               var11 = this.f_12249.size() + this.f_12258.size() - 1;
            }
         } else {
            if (this.f_12264 != null && this.f_12264 != var8) {
               this.m_4436(this.m_4412());
            }

            this.f_12264 = var8;
         }

         float var29 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var3;
         float var14 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var4;
         float var15 = f_12311 + var1 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
         float var16 = 1.0F - var2 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var14;
         Vector4f var17 = Class_BftdentXEtGbugJw.m_2298(var7.x);
         var17.w = var17.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_12312);
         int var18 = Math.round(Math.clamp(var3, 0.0F, f_12313));
         int var19 = Math.round(Math.clamp(var4, 0.0F, f_12314));
         int var20 = this.m_4440(var5.x, var5.y);
         int var21 = this.m_4440(var5.z, var5.w);
         float var22 = var11 < 0 ? f_12315 : f_12316 + var11 * 2.0F;
         float var23 = var6.x;
         float var24 = var6.y;
         float var25 = var23 + var6.z;
         float var26 = var24 + var6.w;
         float var27 = var9 ? var26 : var24;
         float var28 = var9 ? var24 : var26;
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15, var16, 0.0F)
            .setUv(var22 + var23, f_12317 + var27)
            .setColor(var17.x, var17.y, var17.z, var17.w)
            .setUv1(var20, var21)
            .setUv2(var19, var18);
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15 + var29, var16, 0.0F)
            .setUv(var22 + var25, f_12318 + var27)
            .setColor(var17.x, var17.y, var17.z, var17.w)
            .setUv1(var20, var21)
            .setUv2(var19, var18);
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15 + var29, var16 + var14, 0.0F)
            .setUv(var22 + var25, f_12319 + var28)
            .setColor(var17.x, var17.y, var17.z, var17.w)
            .setUv1(var20, var21)
            .setUv2(var19, var18);
         this.f_12266
            .addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var15, var16 + var14, 0.0F)
            .setUv(var22 + var23, f_12320 + var28)
            .setColor(var17.x, var17.y, var17.z, var17.w)
            .setUv1(var20, var21)
            .setUv2(var19, var18);
      }
   }

   private int m_4440(float var1, float var2) {
      int var3 = Math.clamp(Math.round(var1), 0, 255);
      int var4 = Math.clamp(Math.round(var2), 0, 255);
      return var3 & 0xFF | (var4 & 0xFF) << 8;
   }

   public Class_QXWSRsUq6ZajU3lN() {
      this.f_12250 = VertexFormat.builder(0)
         .addAttribute(f_12267, GpuFormat.RGB32_FLOAT)
         .addAttribute(f_12268, GpuFormat.RGBA8_UNORM)
         .addAttribute(f_12269, GpuFormat.RG32_FLOAT)
         .addAttribute(f_12270, GpuFormat.RG16_SINT)
         .addAttribute(f_12271, GpuFormat.RG16_SINT)
         .build();
      this.f_12251 = this.m_4428(f_12272, BlendFunction.TRANSLUCENT);
      this.f_12252 = this.m_4428(f_12273, BlendFunction.LIGHTNING);
      this.f_12253 = this.f_12251;
      this.f_12254 = new Class_io22eRA7pjGbGIOA(Identifier.fromNamespaceAndPath(f_12274, f_12275), 4096);
      this.f_12255 = new Class_Trm8dR6i9vMfnZEG();
      this.f_12256 = Suppliers.memoize(() -> new TextureTarget(f_12327, 1920, 1024, false, GpuFormat.RGBA8_UNORM));
      this.f_12257 = f_11537.gameRenderer.mainRenderTarget();
      this.f_12258 = new ArrayList<>();
      this.f_12259 = new ArrayList<>();
      this.f_12265 = new Class_PoKta0VE7AdhY1En(f_12276);
      this.f_12266 = this.f_12265.m_4162(PrimitiveTopology.QUADS, this.f_12250);
   }

   public void m_4442(float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6, ItemStack var7) {
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F) && !(Class_Ssh31B3ljfKeWsvS.m_4821() <= 0.0F) && (var6.x | var6.y | var6.z | var6.w) >>> 24 != 0) {
         Class_Trm8dR6i9vMfnZEG.RP0DX1n0YDZ43moC var8 = this.f_12255.m_5067(var7);
         if (var8 != null) {
            this.m_4414(var1, var2, var3, var4, var5, var6, var8);
         }
      }
   }

   public void m_4443(Class_jZQ0pP9BTU3L7miy var1, Component var2, float var3, float var4, int var5, int var6) {
      this.m_4437(var1, var2, var3, var4, var5, var6, Float.NaN, Float.NaN);
   }
}
