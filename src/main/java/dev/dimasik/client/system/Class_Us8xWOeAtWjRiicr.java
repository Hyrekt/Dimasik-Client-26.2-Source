package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.module.render.Hands;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemUseAnimation;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_Us8xWOeAtWjRiicr {
   public static final Class_Us8xWOeAtWjRiicr f_14920 = new Class_Us8xWOeAtWjRiicr();
   private static final int f_14921 = 48;
   private static final int f_14922 = 80;
   private static final float f_14923 = 0.001F;
   private final RenderPipeline f_14924 = m_5322(-1);
   private final RenderPipeline[] f_14925 = new RenderPipeline[6];
   private final RenderPipeline f_14926;
   private final RenderPipeline f_14927;
   private final RenderPipeline f_14928;
   private final RenderPipeline f_14929;
   private final RenderPipeline f_14930;
   private final RenderPipeline f_14931;
   private final RenderPipeline f_14932;
   private final RenderPipeline f_14933;
   private final RenderPipeline f_14934;
   private final RenderPipeline f_14935;
   private final RenderPipeline f_14936;
   private final RenderPipeline f_14937;
   private final RenderPipeline f_14938;
   private final RenderPipeline f_14939;
   private final RenderPipeline f_14940;
   private final RenderPipeline f_14941;
   private final RenderPipeline f_14942;
   private final RenderPipeline f_14943;
   private final RenderPipeline f_14944;
   private final RenderPipeline f_14945;
   private final RenderPipeline f_14946;
   private final RenderPipeline f_14947;
   private RenderTarget f_14948;
   private RenderTarget f_14949;
   private final Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR f_14950;
   private final Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR f_14951;
   private final Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR f_14952;
   private TextureTarget f_14953;
   private TextureTarget f_14954;
   private GpuBuffer f_14955;
   private GpuBuffer f_14956;
   private GpuBuffer f_14957;
   private GpuBuffer f_14958;
   private GpuBuffer f_14959;
   private GpuBuffer f_14960;
   private GpuBuffer f_14961;
   private long f_14962;
   private double f_14963;
   private int f_14964;
   private float f_14965;
   private float f_14966;
   private boolean f_14967;
   private float f_14968;
   private boolean f_14969;
   private float f_14970;
   private float f_14971;
   private boolean f_14972;
   private int f_14973;
   private boolean f_14974;
   private final Class_Us8xWOeAtWjRiicr.J6fV8uaRqaXhTRoo f_14975;
   private final Class_Us8xWOeAtWjRiicr.J6fV8uaRqaXhTRoo f_14976;
   private static final String f_14977 = "base";
   private static final String f_14978 = "hands_composite";
   private static final String f_14979 = "hands_composite";
   private static final String f_14980 = "HandsData";
   private static final String f_14981 = "HandSampler";
   private static final String f_14982 = "HandDepthSampler";
   private static final String f_14983 = "HandMaskSampler";
   private static final String f_14984 = "HandSupportSampler";
   private static final String f_14985 = "BlurredSceneSampler";
   private static final String f_14986 = "BloomSampler";
   private static final String f_14987 = "HANDS_STYLE";
   private static final String f_14988 = "_mask";
   private static final String f_14989 = "_item";
   private static final String f_14990 = "_scene";
   private static final String f_14991 = "hands_fullscreen";
   private static final String f_14992 = "Sampler0";
   private static final String f_14993 = "HANDS_MASK";
   private static final String f_14994 = "HandsBlur";
   private static final String f_14995 = "dimasik/hands_nothing_composite";
   private static final String f_14996 = "hands_composite";
   private static final String f_14997 = "hands_nothing_composite";
   private static final String f_14998 = "HandsData";
   private static final String f_14999 = "HandSampler";
   private static final String f_15000 = "HandMaskSampler";
   private static final String f_15001 = "BloomSampler";
   private static final String f_15002 = "dimasik/hands_mask";
   private static final String f_15003 = "hands_fullscreen";
   private static final String f_15004 = "hands_mask";
   private static final String f_15005 = "HandSampler";
   private static final String f_15006 = "HandDepthSampler";
   private static final String f_15007 = "hands_downsample";
   private static final String f_15008 = "hands_downsample";
   private static final String f_15009 = "hands_upsample";
   private static final String f_15010 = "hands_gaussian";
   private static final String f_15011 = "hands_gaussian";
   private static final String f_15012 = "hands_support";
   private static final String f_15013 = "hands_downsample";
   private static final String f_15014 = "hands_upsample";
   private static final String f_15015 = "hands_gaussian";
   private static final String f_15016 = "dimasik/hands_item_color";
   private static final String f_15017 = "hands_fullscreen";
   private static final String f_15018 = "hands_item_color";
   private static final String f_15019 = "HandSampler";
   private static final String f_15020 = "HandMaskSampler";
   private static final String f_15021 = "dimasik/hands_outer_glow";
   private static final String f_15022 = "hands_fullscreen";
   private static final String f_15023 = "hands_outer_glow";
   private static final String f_15024 = "HandsGlow";
   private static final String f_15025 = "BloomSampler";
   private static final String f_15026 = "HandMaskSampler";
   private static final String f_15027 = "dimasik/hands_outline";
   private static final String f_15028 = "hands_fullscreen";
   private static final String f_15029 = "hands_outline";
   private static final String f_15030 = "HandSampler";
   private static final String f_15031 = "HandsGlow";
   private static final String f_15032 = "BloomSampler";
   private static final String f_15033 = "HandMaskSampler";
   private static final String f_15034 = "dimasik/hands_glow_outline";
   private static final String f_15035 = "hands_fullscreen";
   private static final String f_15036 = "hands_glow_outline";
   private static final String f_15037 = "HandSampler";
   private static final String f_15038 = "HandsGlow";
   private static final String f_15039 = "BloomSampler";
   private static final String f_15040 = "HandMaskSampler";
   private static final String f_15041 = "dimasik/hands_trail_displace";
   private static final String f_15042 = "hands_fullscreen";
   private static final String f_15043 = "hands_trail_displace";
   private static final String f_15044 = "TrailDisplace";
   private static final String f_15045 = "TrailSampler";
   private static final String f_15046 = "dimasik/hands_trail_energy_displace";
   private static final String f_15047 = "hands_fullscreen";
   private static final String f_15048 = "hands_trail_energy_displace";
   private static final String f_15049 = "TrailDisplace";
   private static final String f_15050 = "TrailSampler";
   private static final String f_15051 = "dimasik/hands_trail_flame";
   private static final String f_15052 = "hands_fullscreen";
   private static final String f_15053 = "hands_trail_flame";
   private static final String f_15054 = "TrailFlame";
   private static final String f_15055 = "BloomSampler";
   private static final String f_15056 = "dimasik/hands_trail_energy";
   private static final String f_15057 = "hands_fullscreen";
   private static final String f_15058 = "hands_trail_energy";
   private static final String f_15059 = "TrailEnergy";
   private static final String f_15060 = "BloomSampler";
   private static final String f_15061 = "dimasik/hands_trail_ribbon_displace";
   private static final String f_15062 = "hands_fullscreen";
   private static final String f_15063 = "hands_trail_ribbon_displace";
   private static final String f_15064 = "TrailDisplace";
   private static final String f_15065 = "TrailSampler";
   private static final String f_15066 = "dimasik/hands_trail_ribbon";
   private static final String f_15067 = "hands_fullscreen";
   private static final String f_15068 = "hands_trail_ribbon";
   private static final String f_15069 = "TrailRibbon";
   private static final String f_15070 = "BloomSampler";
   private static final String f_15071 = "dimasik/hands_trail_blit";
   private static final String f_15072 = "hands_fullscreen";
   private static final String f_15073 = "hands_trail_blit";
   private static final String f_15074 = "TrailSampler";
   private static final String f_15075 = "hands-bloom";
   private static final String f_15076 = "hands-item-bloom";
   private static final String f_15077 = "hands-mirror";
   private static final float f_15078 = 0.001F;
   private static final float f_15079 = 0.001F;
   private static final float f_15080 = 0.001F;
   private static final float f_15081 = 0.001F;
   private static final float f_15082 = 0.6F;
   private static final float f_15083 = 3.8F;
   private static final float f_15084 = 0.25F;
   private static final String f_15085 = "hands-support";
   private static final float f_15086 = 5.0F;
   private static final float f_15087 = 3.0F;
   private static final float f_15088 = 1.5F;
   private static final float f_15089 = 2.5F;
   private static final float f_15090 = 0.75F;
   private static final double f_15091 = 0.5;
   private static final String f_15092 = "handsData";
   private static final float f_15093 = 0.001F;
   private static final String f_15094 = "HandSampler";
   private static final String f_15095 = "HandMaskSampler";
   private static final String f_15096 = "BloomSampler";
   private static final String f_15097 = "HandSupportSampler";
   private static final String f_15098 = "HandDepthSampler";
   private static final String f_15099 = "HandMaskSampler";
   private static final String f_15100 = "BlurredSceneSampler";
   private static final String f_15101 = "HandsData";
   private static final String f_15102 = "HandSampler";
   private static final String f_15103 = "HandDepthSampler";
   private static final float f_15104 = 0.75F;
   private static final String f_15105 = "HandSampler";
   private static final String f_15106 = "HandMaskSampler";
   private static final String f_15107 = "Sampler0";
   private static final String f_15108 = "HandsBlur";
   private static final String f_15109 = "handsOutlineData";
   private static final String f_15110 = "handsGlowData";
   private static final String f_15111 = "BloomSampler";
   private static final String f_15112 = "HandMaskSampler";
   private static final String f_15113 = "HandSampler";
   private static final String f_15114 = "HandsGlow";
   private static final float f_15115 = 0.1F;
   private static final float f_15116 = 1.0E9F;
   private static final float f_15117 = 0.016666668F;
   private static final long f_15118 = 100000000000L;
   private static final float f_15119 = 1.0E9F;
   private static final float f_15120 = (float) (Math.PI * 8.0 / 5.0);
   private static final float f_15121 = 0.035F;
   private static final float f_15122 = 0.018F;
   private static final float f_15123 = 180.0F;
   private static final float f_15124 = 360.0F;
   private static final float f_15125 = -180.0F;
   private static final float f_15126 = 360.0F;
   private static final float f_15127 = -0.25F;
   private static final float f_15128 = 0.25F;
   private static final float f_15129 = -0.25F;
   private static final float f_15130 = 0.25F;
   private static final float f_15131 = 0.045F;
   private static final float f_15132 = 0.15F;
   private static final float f_15133 = 0.048F;
   private static final float f_15134 = 0.4F;
   private static final float f_15135 = 0.012F;
   private static final float f_15136 = 0.45F;
   private static final float f_15137 = 0.32F;
   private static final String f_15138 = "handsTrailDisplaceData";
   private static final String f_15139 = "TrailSampler";
   private static final String f_15140 = "TrailDisplace";
   private static final String f_15141 = "TrailSampler";
   private static final String f_15142 = "handsTrailFlameData";
   private static final String f_15143 = "BloomSampler";
   private static final String f_15144 = "TrailFlame";
   private static final String f_15145 = "handsTrailEnergyData";
   private static final String f_15146 = "BloomSampler";
   private static final String f_15147 = "TrailEnergy";
   private static final float f_15148 = 0.001F;
   private static final String f_15149 = "handsTrailRibbonData";
   private static final String f_15150 = "BloomSampler";
   private static final String f_15151 = "TrailRibbon";
   private static final float f_15152 = 0.15F;
   private static final float f_15153 = 0.15F;
   private static final float f_15154 = 16.0F;
   private static final String f_15155 = "hands-trail-a";
   private static final String f_15156 = "hands-trail-b";
   private static final String f_15157 = "hands-mask";
   private static final float f_15158 = 255.0F;
   private static final float f_15159 = 255.0F;
   private static final float f_15160 = 255.0F;
   private static final float f_15161 = 255.0F;
   private static final String f_15162 = "handsTrailRibbon";
   private static final String f_15163 = "handsTrailEnergy";
   private static final String f_15164 = "handsTrailFlame";
   private static final String f_15165 = "handsTrailBlit";
   private static final String f_15166 = "handsTrailDisplace";
   private static final String f_15167 = "handsGlowOutline";
   private static final String f_15168 = "handsOutline";
   private static final String f_15169 = "handsOuterGlow";
   private static final String f_15170 = "handsBlur";
   private static final String f_15171 = "handsItemColor";
   private static final String f_15172 = "handsMask";
   private static final String f_15173 = "handsComposite";

   private void m_5293(CommandEncoder var1) {
      if (this.f_14953 != null && this.f_14954 != null) {
         var1.clearColorTexture(this.f_14953.getColorTexture(), new Vector4f(0.0F));
         var1.clearColorTexture(this.f_14954.getColorTexture(), new Vector4f(0.0F));
      }
   }

   private void m_5296(int var1, int var2, CommandEncoder var3) {
      if (this.f_14953 == null) {
         this.f_14953 = new TextureTarget(f_15155, var1, var2, false, GpuFormat.RGBA8_UNORM);
         this.f_14954 = new TextureTarget(f_15156, var1, var2, false, GpuFormat.RGBA8_UNORM);
         var3.clearColorTexture(this.f_14953.getColorTexture(), new Vector4f(0.0F));
         var3.clearColorTexture(this.f_14954.getColorTexture(), new Vector4f(0.0F));
      } else if (this.f_14953.width != var1 || this.f_14953.height != var2) {
         this.f_14953.resize(var1, var2);
         this.f_14954.resize(var1, var2);
         var3.clearColorTexture(this.f_14953.getColorTexture(), new Vector4f(0.0F));
         var3.clearColorTexture(this.f_14954.getColorTexture(), new Vector4f(0.0F));
      }
   }

   private void m_5298(RenderTarget var1, RenderTarget var2, RenderPipeline var3, GpuBuffer var4, CommandEncoder var5) {
      RenderPass var6 = var5.createRenderPass(() -> f_15170, var2.getColorTextureView(), Optional.empty());

      try {
         var6.setPipeline(var3);
         var6.bindTexture(f_15107, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         if (var4 != null) {
            var6.setUniform(f_15108, var4);
         }

         var6.draw(3, 1, 0, 0);
      } catch (Throwable var10) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if (var6 != null) {
         var6.close();
      }
   }

   private void m_5299(CommandEncoder var1, RenderTarget var2, Hands var3, float var4, float var5) {
      MemoryStack var6 = MemoryStack.stackPush();

      try {
         Std140Builder var7 = Std140Builder.onStack(var6, 64)
            .putVec4(var3.m_8116(), var3.m_8189() ? 1.0F : 0.0F, 0.0F, var4)
            .putVec4(var5, var3.m_8136(), var3.m_8112(), 0.0F);
         m_5304(var7, var3.m_8166());
         m_5304(var7, var3.m_8171());
         ByteBuffer var8 = var7.get();
         this.f_14960 = this.m_5329(this.f_14960, 64, f_15145);
         var1.writeToBuffer(this.f_14960.slice(), var8);
         RenderPass var9 = var1.createRenderPass(() -> f_15163, this.f_14954.getColorTextureView(), Optional.empty());

         try {
            var9.setPipeline(this.f_14944);
            var9.bindTexture(f_15146, var2.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var9.setUniform(f_15147, this.f_14960);
            var9.draw(3, 1, 0, 0);
         } catch (Throwable var14) {
            if (var9 != null) {
               try {
                  var9.close();
               } catch (Throwable var13) {
                  var14.addSuppressed(var13);
               }
            }

            throw var14;
         }

         if (var9 != null) {
            var9.close();
         }
      } catch (Throwable var15) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var12) {
               var15.addSuppressed(var12);
            }
         }

         throw var15;
      }

      if (var6 != null) {
         var6.close();
      }
   }

   private RenderTarget m_5300(
      RenderTarget var1, Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR var2, int var3, float var4, boolean var5, RenderTarget var6, CommandEncoder var7
   ) {
      RenderTarget var8 = var1;

      for (int var9 = 0; var9 < var3; var9++) {
         int var10 = Math.max(2, (var8.width + 1) / 2);
         int var11 = Math.max(2, (var8.height + 1) / 2);
         if (var2.f_14913.size() <= var9) {
            var2.f_14913.add(null);
         }

         RenderTarget var12 = this.m_5313(var2.f_14913.get(var9), var2.f_14910 + var9, var10, var11, var2.f_14912);
         var2.f_14913.set(var9, var12);
         if (var6 != null && var9 == 0) {
            this.m_5325(var6, var12, var7);
         } else {
            this.m_5298(var8, var12, var2.f_14911 ? this.f_14929 : (var2 == this.f_14951 ? this.f_14934 : this.f_14928), null, var7);
         }

         var8 = var12;
      }

      if (var2 != this.f_14952 && var3 == 1 && var4 <= f_15104) {
         return var8;
      } else {
         var2.f_14914 = this.m_5313(var2.f_14914, var2.f_14910 + "", var8.width, var8.height, var2.f_14912);
         this.m_5323(var2, var8.width, var8.height, var4, var7);
         RenderPipeline var13 = var2.f_14911 ? this.f_14932 : (var2 == this.f_14951 ? this.f_14936 : this.f_14931);
         this.m_5298(var8, var2.f_14914, var13, var2.f_14915, var7);
         this.m_5298(var2.f_14914, var8, var13, var2.f_14916, var7);
         if (var5 && var3 > 1) {
            RenderTarget var14 = var2.f_14913.getFirst();
            this.m_5298(var8, var14, var2 == this.f_14951 ? this.f_14935 : this.f_14930, null, var7);
            return var14;
         } else {
            return var8;
         }
      }
   }

   private static RenderPipeline m_5301(String var0, GpuFormat var1, boolean var2) {
      boolean var3 = var1 == GpuFormat.R8_UNORM;
      Class_GEnQMkY73qXewYpU var4 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(var0 + (var3 ? f_14988 : (var1 == GpuFormat.RGBA16_FLOAT ? f_14989 : f_14990)))
         .m_2714(var1)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_14991))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(var0))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2741(f_14992);
      if (var3) {
         var4.m_2736(f_14993);
      }

      if (var2) {
         var4.m_2729(f_14994, UniformType.UNIFORM_BUFFER);
      }

      return var4.m_2722();
   }

   public void m_5303() {
      if (this.f_14948 != null) {
         this.f_14948.destroyBuffers();
      }

      if (this.f_14949 != null) {
         this.f_14949.destroyBuffers();
      }

      this.f_14948 = null;
      this.f_14949 = null;
      this.m_5316(this.f_14950);
      this.m_5316(this.f_14951);
      this.m_5316(this.f_14952);
      if (this.f_14953 != null) {
         this.f_14953.destroyBuffers();
      }

      if (this.f_14954 != null) {
         this.f_14954.destroyBuffers();
      }

      this.f_14953 = null;
      this.f_14954 = null;
      this.m_5317();
      this.f_14973 = -1;
      this.f_14974 = false;
      this.f_14975.m_5290();
      this.f_14976.m_5290();
      this.m_5319(this.f_14955);
      this.m_5319(this.f_14956);
      this.m_5319(this.f_14957);
      this.m_5319(this.f_14958);
      this.m_5319(this.f_14959);
      this.m_5319(this.f_14960);
      this.m_5319(this.f_14961);
      this.f_14955 = null;
      this.f_14956 = null;
      this.f_14957 = null;
      this.f_14958 = null;
      this.f_14959 = null;
      this.f_14960 = null;
      this.f_14961 = null;
   }

   private static Std140Builder m_5304(Std140Builder var0, int var1) {
      return var0.putVec4((var1 >>> 16 & 0xFF) / f_15158, (var1 >>> 8 & 0xFF) / f_15159, (var1 & 0xFF) / f_15160, (var1 >>> 24 & 0xFF) / f_15161);
   }

   private RenderTarget m_5306(RenderTarget var1, Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR var2, int var3, float var4, boolean var5, CommandEncoder var6) {
      return this.m_5300(var1, var2, var3, var4, var5, null, var6);
   }

   private static RenderPipeline m_5307(String var0, boolean var1, boolean var2) {
      return m_5301(var0, var1 ? GpuFormat.R8_UNORM : GpuFormat.RGBA8_UNORM, var2);
   }

   private void m_5308(int var1, int var2) {
      if (this.f_14948 == null) {
         this.f_14948 = new Class_Us8xWOeAtWjRiicr.Class_0xVbyF0f4qLLt2lo(f_15157, var1, var2);
      } else if (this.f_14948.width != var1 || this.f_14948.height != var2) {
         this.f_14948.resize(var1, var2);
         this.f_14975.m_5290();
         this.f_14976.m_5290();
      }
   }

   private void m_5309(Hands var1, Minecraft var2, float var3) {
      float var4 = var1.m_8113();
      float var5 = 1.0F;
      boolean var6 = false;
      if (var2.player != null && var2.player.isUsingItem()) {
         ItemUseAnimation var7 = var2.player.getUseItem().getUseAnimation();
         var6 = var7 == ItemUseAnimation.EAT || var7 == ItemUseAnimation.DRINK;
      }

      if (var6) {
         var4 = var1.m_8145() ? var1.m_8121() : f_15152;
         var5 = var1.m_8145() ? var1.m_8138() : 0.0F;
      } else if (var2.player != null && var2.player.swinging) {
         var4 = var1.m_8124() ? var1.m_8118() : f_15153;
         var5 = var1.m_8124() ? var1.m_8150() : 0.0F;
      }

      float var8 = this.f_14967 ? (float)(-Math.expm1(-var3 * f_15154)) : 1.0F;
      this.f_14965 = this.f_14965 + (var4 - this.f_14965) * var8;
      this.f_14966 = this.f_14966 + (var5 - this.f_14966) * var8;
      this.f_14967 = true;
      this.f_14963 = this.f_14963 + var3 * var1.m_8164();
      this.f_14964 = this.f_14964 + 1 & 4095;
   }

   private void m_5310(RenderTarget var1, CommandEncoder var2) {
      RenderPass var3 = var2.createRenderPass(() -> f_15172, this.f_14948.getColorTextureView(), Optional.empty());

      try {
         var3.setPipeline(this.f_14927);
         var3.bindTexture(f_15102, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var3.bindTexture(f_15103, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var3.draw(3, 1, 0, 0);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }
   }

   private RenderTarget m_5313(RenderTarget var1, String var2, int var3, int var4, GpuFormat var5) {
      if (var1 == null) {
         return (RenderTarget)(var5 == GpuFormat.R8_UNORM
            ? new Class_Us8xWOeAtWjRiicr.Class_0xVbyF0f4qLLt2lo(var2, var3, var4)
            : new TextureTarget(var2, var3, var4, false, var5));
      }

      if (var1.width != var3 || var1.height != var4) {
         var1.resize(var3, var4);
      }

      return var1;
   }

   private void m_5314(CommandEncoder var1, RenderTarget var2, Hands var3, float var4) {
      MemoryStack var5 = MemoryStack.stackPush();

      try {
         Std140Builder var6 = Std140Builder.onStack(var5, 48).putVec4(var3.m_8116(), var3.m_8189() ? 1.0F : 0.0F, 0.0F, var4);
         m_5304(var6, var3.m_8166());
         m_5304(var6, var3.m_8171());
         ByteBuffer var7 = var6.get();
         this.f_14959 = this.m_5329(this.f_14959, 48, f_15142);
         var1.writeToBuffer(this.f_14959.slice(), var7);
         RenderPass var8 = var1.createRenderPass(() -> f_15164, this.f_14954.getColorTextureView(), Optional.empty());

         try {
            var8.setPipeline(this.f_14943);
            var8.bindTexture(f_15143, var2.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var8.setUniform(f_15144, this.f_14959);
            var8.draw(3, 1, 0, 0);
         } catch (Throwable var13) {
            if (var8 != null) {
               try {
                  var8.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }
            }

            throw var13;
         }

         if (var8 != null) {
            var8.close();
         }
      } catch (Throwable var14) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var11) {
               var14.addSuppressed(var11);
            }
         }

         throw var14;
      }

      if (var5 != null) {
         var5.close();
      }
   }

   private void m_5315(RenderTarget var1, RenderTarget var2, Hands var3, CommandEncoder var4) {
      this.m_5296(var1.width, var1.height, var4);
      boolean var5 = var3.m_8134();
      boolean var6 = var3.m_8153();
      if (this.f_14973 != var3.m_8193()) {
         this.m_5293(var4);
         this.f_14973 = var3.m_8193();
         this.m_5317();
      }

      long var7 = System.nanoTime();
      float var9 = this.f_14962 > 0L ? Math.min(f_15115, (float)(var7 - this.f_14962) / f_15116) : f_15117;
      this.f_14962 = var7;
      float var10 = var9;
      float var11 = (float)(var7 % f_15118) / f_15119;
      Minecraft var12 = Minecraft.getInstance();
      if (var6) {
         this.m_5309(var3, var12, var10);
         var11 = (float)this.f_14963;
      }

      float var13 = f_15120;
      float var14 = var3.m_8196();
      float var15 = var6 ? var3.m_8162() : (var5 ? f_15121 * var14 : var3.m_8149());
      float var16 = var6 ? 0.0F : (var5 ? f_15122 * var14 : var3.m_8139());
      float var17 = var6 ? var3.m_8174() : (var5 ? var3.m_8147() : var3.m_8148());
      float var18 = var15 * var10;
      float var19 = ((float)Math.sin(var11 * var13) - (float)Math.sin((var11 - var10) * var13)) * var16;
      float var20 = 0.0F;
      float var21 = 0.0F;
      Camera var22 = var12.gameRenderer != null ? var12.gameRenderer.mainCamera() : null;
      if (var22 != null) {
         float var23 = var22.yRot();
         float var24 = var22.xRot();
         if (this.f_14972) {
            float var25 = var23 - this.f_14970;

            while (var25 > f_15123) {
               var25 -= f_15124;
            }

            while (var25 < f_15125) {
               var25 += f_15126;
            }

            float var26 = var24 - this.f_14971;
            float var27 = Math.max(1.0F, ((Integer)var12.options.fov().get()).intValue());
            var20 = Math.clamp(-(var25 / var27) * var17, f_15127, f_15128);
            var21 = Math.clamp(var26 / var27 * var17, f_15129, f_15130);
         }

         this.f_14970 = var23;
         this.f_14971 = var24;
         this.f_14972 = true;
      }

      boolean var39 = var12.player != null && var12.player.swinging;
      boolean var40 = var3.m_8165() && var3.m_8144() && var39 && !this.f_14969;
      this.f_14969 = var39;
      if (var40) {
         this.f_14968 = 1.0F;
      }

      float var41 = (var6 ? f_15131 / Math.max(f_15132, this.f_14965) : (var5 ? f_15133 / Math.max(f_15134, var3.m_8167()) : var3.m_8161()))
         + this.f_14968 * var3.m_8177() * f_15135;
      this.f_14968 = Math.max(0.0F, this.f_14968 - var10 / f_15136);
      float var42 = var6 ? var3.m_8143() : (var5 ? f_15137 * var14 : var3.m_8179());
      float var43 = !var6 && !var5 ? var3.m_8169() : 0.0F;
      MemoryStack var28 = MemoryStack.stackPush();

      try {
         ByteBuffer var29 = Std140Builder.onStack(var28, 48)
            .putVec2(var19 + var20, var18 + var21)
            .putVec2(this.f_14953.width, this.f_14953.height)
            .putVec4(var41, var11, var10, var42)
            .putVec4(var6 ? var3.m_8164() : var43, var6 ? this.f_14964 : 0.0F, 0.0F, 0.0F)
            .get();
         this.f_14958 = this.m_5329(this.f_14958, 48, f_15138);
         var4.writeToBuffer(this.f_14958.slice(), var29);
         RenderPass var30 = var4.createRenderPass(() -> f_15166, this.f_14954.getColorTextureView(), Optional.of(new Vector4f(0.0F)));

         try {
            var30.setPipeline(var6 ? this.f_14945 : (var5 ? this.f_14942 : this.f_14941));
            var30.bindTexture(f_15139, this.f_14953.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var30.setUniform(f_15140, this.f_14958);
            var30.draw(3, 1, 0, 0);
         } catch (Throwable var37) {
            if (var30 != null) {
               try {
                  var30.close();
               } catch (Throwable var35) {
                  var37.addSuppressed(var35);
               }
            }

            throw var37;
         }

         if (var30 != null) {
            var30.close();
         }
      } catch (Throwable var38) {
         if (var28 != null) {
            try {
               var28.close();
            } catch (Throwable var34) {
               var38.addSuppressed(var34);
            }
         }

         throw var38;
      }

      if (var28 != null) {
         var28.close();
      }

      if (var6) {
         this.m_5330(var4, var1, var3, var10, var11);
      } else if (var5) {
         this.m_5299(var4, var1, var3, var10, var11);
      } else {
         this.m_5314(var4, var1, var3, var10);
      }

      RenderPass var44 = var4.createRenderPass(() -> f_15165, var2.getColorTextureView(), Optional.empty());

      try {
         var44.setPipeline(this.f_14947);
         var44.bindTexture(f_15141, this.f_14954.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         var44.draw(3, 1, 0, 0);
      } catch (Throwable var36) {
         if (var44 != null) {
            try {
               var44.close();
            } catch (Throwable var33) {
               var36.addSuppressed(var33);
            }
         }

         throw var36;
      }

      if (var44 != null) {
         var44.close();
      }

      TextureTarget var45 = this.f_14953;
      this.f_14953 = this.f_14954;
      this.f_14954 = var45;
   }

   private void m_5316(Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR var1) {
      for (RenderTarget var3 : var1.f_14913) {
         var3.destroyBuffers();
      }

      var1.f_14913.clear();
      if (var1.f_14914 != null) {
         var1.f_14914.destroyBuffers();
      }

      var1.f_14914 = null;
      this.m_5319(var1.f_14915);
      this.m_5319(var1.f_14916);
      var1.f_14915 = null;
      var1.f_14916 = null;
      var1.f_14919 = Float.NaN;
   }

   private void m_5317() {
      this.f_14962 = 0L;
      this.f_14968 = 0.0F;
      this.f_14969 = false;
      this.f_14972 = false;
      this.f_14963 = 0.0;
      this.f_14964 = 0;
      this.f_14967 = false;
   }

   private void m_5319(GpuBuffer var1) {
      if (var1 != null && !var1.isClosed()) {
         var1.close();
      }
   }

   public void m_5320(RenderTarget var1, RenderTarget var2, Hands var3) {
      CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
      if (this.f_14974 != var3.m_8189()) {
         this.f_14974 = var3.m_8189();
         this.f_14975.m_5290();
         this.f_14976.m_5290();
         this.m_5293(var4);
         this.m_5316(this.f_14974 ? this.f_14950 : this.f_14951);
      }

      boolean var5 = var3.m_8151();
      boolean var6 = var3.m_8186();
      boolean var7 = var3.m_8195() && var3.m_8116() > f_15078;
      boolean var8 = var3.m_8195() && (var7 || var3.m_8182() > f_15079 || var6);
      int var9 = var3.m_8155();
      boolean var10 = var3.m_8129() && var3.m_8160() > f_15080 && var9 >>> 24 != 0;
      boolean var11 = var7 && var10 && var9 >>> 24 == 255;
      RenderTarget var12 = var1;
      if (var5 && var3.m_8114() > f_15081) {
         var12 = this.m_5306(var2, this.f_14952, 2, (f_15082 + var3.m_8168() * f_15083) * f_15084, false, var4);
      }

      this.m_5308(var1.width, var1.height);
      this.m_5310(var1, var4);
      boolean var13 = var3.m_8127();
      if (!var13) {
         this.f_14949 = this.m_5321(this.f_14949, f_15085, Math.max(2, (var1.width + 1) / 2), Math.max(2, (var1.height + 1) / 2), true);
         this.m_5298(this.f_14948, this.f_14949, this.f_14933, null, var4);
      }

      if (!var6 && this.f_14973 != -1) {
         this.m_5293(var4);
         this.f_14973 = -1;
         this.m_5317();
      }

      RenderTarget var14 = null;
      if (var8) {
         float var15 = Math.clamp(var3.m_8133(), 1.0F, f_15086);
         if (var3.m_8134()) {
            var15 = Math.max(f_15087, var15);
         }

         int var16 = var15 <= 1.0F ? 1 : 2;
         float var17 = (f_15088 + (var15 - 1.0F) * f_15089) / (1 << var16);
         var14 = this.m_5328(var1, var3, var16, var17, var6, var4);
         if (var6) {
            this.m_5315(var14, var2, var3, var4);
         }

         if (var7 && !var11) {
            this.m_5324(var14, this.f_14948, var1, var2, var3, true, false, this.f_14938, var4);
         }
      }

      if (var10) {
         if (var14 == null) {
            var14 = this.m_5328(var1, var3, 1, f_15090, false, var4);
         }

         this.m_5324(var14, this.f_14948, var1, var2, var3, var11, true, var11 ? this.f_14940 : this.f_14939, var4);
      }

      MemoryStack var25 = MemoryStack.stackPush();

      try {
         float var27 = ((Integer)Minecraft.getInstance().options.fov().get()).intValue();
         float var30 = (float)Math.tan(Math.toRadians(var27) * f_15091);
         float var18 = (float)var2.width / Math.max(1, var2.height);
         Std140Builder var19 = Std140Builder.onStack(var25, 240)
            .putVec4(var3.m_8119(), var3.m_8159(), var3.m_8183(), var3.m_8152())
            .putVec4(var3.m_8137(), var3.m_8111(), var3.m_8188(), var3.m_8194())
            .putVec4(var3.m_8190() ? 1.0F : 0.0F, var3.m_8132() ? 1.0F : 0.0F, var3.m_8191() ? 1.0F : 0.0F, var3.m_8123() ? 1.0F : 0.0F)
            .putVec4(var3.m_8140(), var3.m_8172(), var3.m_8108(), var3.m_8156())
            .putVec4(var3.m_8114(), var3.m_8158(), var8 ? 1.0F : 0.0F, var3.m_8133())
            .putVec4(var3.m_8116(), var3.m_8189() ? 1.0F : 0.0F, 0.0F, var3.m_8182())
            .putVec4(var18, var30, var3.m_8109(), var3.m_8168());
         m_5304(var19, var3.m_8110());
         m_5304(var19, var3.m_8120());
         m_5304(var19, var3.m_8122());
         m_5304(var19, var3.m_8141());
         m_5304(var19, var3.m_8166());
         m_5304(var19, var3.m_8171());
         ByteBuffer var20 = var19.putVec2(var1.width, var1.height).get();
         this.f_14955 = this.m_5329(this.f_14955, 240, f_15092);
         var4.writeToBuffer(this.f_14955.slice(), var20);
      } catch (Throwable var23) {
         if (var25 != null) {
            try {
               var25.close();
            } catch (Throwable var22) {
               var23.addSuppressed(var22);
            }
         }

         throw var23;
      }

      if (var25 != null) {
         var25.close();
      }

      RenderPipeline var26 = var13 ? this.f_14926 : this.f_14924;
      if (!var13 && var3.m_8131() && var3.m_8188() > f_15093) {
         int var28 = Math.clamp(var3.m_8159(), 0, this.f_14925.length - 1);
         if (this.f_14925[var28] == null) {
            this.f_14925[var28] = m_5322(var28);
         }

         var26 = this.f_14925[var28];
      }

      RenderPass var29 = var4.createRenderPass(() -> f_15173, var2.getColorTextureView(), Optional.empty());

      try {
         RenderSystem.bindDefaultUniforms(var29);
         var29.bindTexture(f_15094, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         if (var13) {
            var29.bindTexture(f_15095, this.f_14948.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         }

         var29.bindTexture(
            f_15096, (var14 != null ? var14 : this.f_14948).getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR)
         );
         if (!var13) {
            var29.bindTexture(f_15097, this.f_14949.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var29.bindTexture(f_15098, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var29.bindTexture(f_15099, this.f_14948.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var29.bindTexture(f_15100, var12.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         }

         var29.setUniform(f_15101, this.f_14955);
         var29.setPipeline(var26);
         var29.draw(3, 1, 0, 0);
      } catch (Throwable var24) {
         if (var29 != null) {
            try {
               var29.close();
            } catch (Throwable var21) {
               var24.addSuppressed(var21);
            }
         }

         throw var24;
      }

      if (var29 != null) {
         var29.close();
      }
   }

   private RenderTarget m_5321(RenderTarget var1, String var2, int var3, int var4, boolean var5) {
      return this.m_5313(var1, var2, var3, var4, var5 ? GpuFormat.R8_UNORM : GpuFormat.RGBA8_UNORM);
   }

   private static RenderPipeline m_5322(int var0) {
      Class_GEnQMkY73qXewYpU var1 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726((var0 < 0 ? f_14977 : var0) + "")
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_14978))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_14979))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2720(true, true)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_14980, UniformType.UNIFORM_BUFFER)
         .m_2741(f_14981)
         .m_2741(f_14982)
         .m_2741(f_14983)
         .m_2741(f_14984)
         .m_2741(f_14985)
         .m_2741(f_14986);
      var1.m_2733(f_14987, var0);
      return var1.m_2722();
   }

   private void m_5323(Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR var1, int var2, int var3, float var4, CommandEncoder var5) {
      boolean var6 = var1.f_14915 != null && !var1.f_14915.isClosed() && var1.f_14916 != null && !var1.f_14916.isClosed();
      if (!var6 || var1.f_14917 != var2 || var1.f_14918 != var3 || Float.compare(var1.f_14919, var4) != 0) {
         var1.f_14915 = this.m_5329(var1.f_14915, 48, var1.f_14910 + "");
         var1.f_14916 = this.m_5329(var1.f_14916, 48, var1.f_14910 + "");
         float[] var7 = new float[7];
         float var8 = 1.0F;
         var7[0] = 1.0F;

         for (int var9 = 1; var9 < var7.length; var9++) {
            var7[var9] = (float)Math.exp(-(var9 * var9) / (2.0F * var4 * var4));
            var8 += var7[var9] * 2.0F;
         }

         float[] var16 = new float[3];
         float[] var10 = new float[3];

         for (int var11 = 0; var11 < var10.length; var11++) {
            int var12 = var11 * 2 + 1;
            float var13 = var7[var12] + var7[var12 + 1];
            var16[var11] = var12 + (var13 > 0.0F ? var7[var12 + 1] / var13 : 0.0F);
            var10[var11] = var13 / var8;
         }

         MemoryStack var17 = MemoryStack.stackPush();

         try {
            for (int var18 = 0; var18 < 2; var18++) {
               ByteBuffer var19 = Std140Builder.onStack(var17, 48)
                  .putVec4(var18 == 0 ? 1.0F / var2 : 0.0F, var18 == 1 ? 1.0F / var3 : 0.0F, 0.0F, 0.0F)
                  .putVec4(1.0F / var8, var10[0], var10[1], var10[2])
                  .putVec4(var16[0], var16[1], var16[2], 0.0F)
                  .get();
               var5.writeToBuffer((var18 == 0 ? var1.f_14915 : var1.f_14916).slice(), var19);
            }
         } catch (Throwable var15) {
            if (var17 != null) {
               try {
                  var17.close();
               } catch (Throwable var14) {
                  var15.addSuppressed(var14);
               }
            }

            throw var15;
         }

         if (var17 != null) {
            var17.close();
         }

         var1.f_14917 = var2;
         var1.f_14918 = var3;
         var1.f_14919 = var4;
      }
   }

   private void m_5324(
      RenderTarget var1,
      RenderTarget var2,
      RenderTarget var3,
      RenderTarget var4,
      Hands var5,
      boolean var6,
      boolean var7,
      RenderPipeline var8,
      CommandEncoder var9
   ) {
      float var10 = var6 ? var5.m_8116() : 0.0F;
      int var11 = var5.m_8166();
      int var12 = var5.m_8171();
      int var13 = var5.m_8155();
      float var14 = var7 ? var5.m_8160() : 0.0F;
      GpuBuffer var15 = var7 ? this.f_14957 : this.f_14956;
      GpuBuffer var16 = this.m_5329(var15, 80, var7 ? f_15109 : f_15110);
      Class_Us8xWOeAtWjRiicr.J6fV8uaRqaXhTRoo var17 = var7 ? this.f_14976 : this.f_14975;
      if (var16 != var15 || !var17.m_5291(var10, var11, var12, var13, var2.width, var2.height, var14, var7)) {
         MemoryStack var18 = MemoryStack.stackPush();

         try {
            Std140Builder var19 = Std140Builder.onStack(var18, 80).putVec4(var10, var5.m_8189() ? 1.0F : 0.0F, 0.0F, 0.0F);
            m_5304(var19, var11);
            m_5304(var19, var12);
            m_5304(var19, var13);
            ByteBuffer var20 = var19.putVec4(var2.width, var2.height, var14, var7 ? 1.0F : 0.0F).get();
            var9.writeToBuffer(var16.slice(), var20);
         } catch (Throwable var23) {
            if (var18 != null) {
               try {
                  var18.close();
               } catch (Throwable var22) {
                  var23.addSuppressed(var22);
               }
            }

            throw var23;
         }

         if (var18 != null) {
            var18.close();
         }

         var17.m_5289(var10, var11, var12, var13, var2.width, var2.height, var14, var7);
      }

      if (var7) {
         this.f_14957 = var16;
      } else {
         this.f_14956 = var16;
      }

      RenderPass var25 = var9.createRenderPass(() -> var6 && var7 ? f_15167 : (var7 ? f_15168 : f_15169), var4.getColorTextureView(), Optional.empty());

      try {
         var25.setPipeline(var8);
         var25.bindTexture(f_15111, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         var25.bindTexture(f_15112, var2.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         if (var7) {
            var25.bindTexture(f_15113, var3.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         }

         var25.setUniform(f_15114, var16);
         var25.draw(3, 1, 0, 0);
      } catch (Throwable var24) {
         if (var25 != null) {
            try {
               var25.close();
            } catch (Throwable var21) {
               var24.addSuppressed(var21);
            }
         }

         throw var24;
      }

      if (var25 != null) {
         var25.close();
      }
   }

   private void m_5325(RenderTarget var1, RenderTarget var2, CommandEncoder var3) {
      RenderPass var4 = var3.createRenderPass(() -> f_15171, var2.getColorTextureView(), Optional.empty());

      try {
         var4.setPipeline(this.f_14937);
         var4.bindTexture(f_15105, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var4.bindTexture(f_15106, this.f_14948.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var4.draw(3, 1, 0, 0);
      } catch (Throwable var8) {
         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var4 != null) {
         var4.close();
      }
   }

   private Class_Us8xWOeAtWjRiicr() {
      this.f_14926 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_14995)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_14996))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_14997))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2720(true, true)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_14998, UniformType.UNIFORM_BUFFER)
         .m_2741(f_14999)
         .m_2741(f_15000)
         .m_2741(f_15001)
         .m_2722();
      this.f_14927 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15002)
         .m_2714(GpuFormat.R8_UNORM)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15003))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15004))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2741(f_15005)
         .m_2741(f_15006)
         .m_2722();
      this.f_14928 = m_5307(f_15007, false, false);
      this.f_14929 = m_5307(f_15008, true, false);
      this.f_14930 = m_5307(f_15009, true, false);
      this.f_14931 = m_5307(f_15010, false, true);
      this.f_14932 = m_5307(f_15011, true, true);
      this.f_14933 = m_5307(f_15012, true, false);
      this.f_14934 = m_5301(f_15013, GpuFormat.RGBA16_FLOAT, false);
      this.f_14935 = m_5301(f_15014, GpuFormat.RGBA16_FLOAT, false);
      this.f_14936 = m_5301(f_15015, GpuFormat.RGBA16_FLOAT, true);
      this.f_14937 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15016)
         .m_2714(GpuFormat.RGBA16_FLOAT)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15017))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15018))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2741(f_15019)
         .m_2741(f_15020)
         .m_2722();
      this.f_14938 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15021)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15022))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15023))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.LIGHTNING)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15024, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15025)
         .m_2741(f_15026)
         .m_2722();
      this.f_14939 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15027)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15028))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15029))
         .m_2741(f_15030)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15031, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15032)
         .m_2741(f_15033)
         .m_2722();
      this.f_14940 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15034)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15035))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15036))
         .m_2741(f_15037)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15038, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15039)
         .m_2741(f_15040)
         .m_2722();
      this.f_14941 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15041)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15042))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15043))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15044, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15045)
         .m_2722();
      this.f_14942 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15046)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15047))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15048))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15049, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15050)
         .m_2722();
      this.f_14943 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15051)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15052))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15053))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15054, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15055)
         .m_2722();
      this.f_14944 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15056)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15057))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15058))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15059, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15060)
         .m_2722();
      this.f_14945 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15061)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15062))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15063))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15064, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15065)
         .m_2722();
      this.f_14946 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15066)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15067))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15068))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_15069, UniformType.UNIFORM_BUFFER)
         .m_2741(f_15070)
         .m_2722();
      this.f_14947 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_15071)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15072))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15073))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2741(f_15074)
         .m_2722();
      this.f_14950 = new Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR(f_15075, true);
      this.f_14951 = new Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR(f_15076, GpuFormat.RGBA16_FLOAT);
      this.f_14952 = new Class_Us8xWOeAtWjRiicr.LoLmBi3LPhwnPlIR(f_15077, false);
      this.f_14973 = -1;
      this.f_14975 = new Class_Us8xWOeAtWjRiicr.J6fV8uaRqaXhTRoo();
      this.f_14976 = new Class_Us8xWOeAtWjRiicr.J6fV8uaRqaXhTRoo();
   }

   private RenderTarget m_5328(RenderTarget var1, Hands var2, int var3, float var4, boolean var5, CommandEncoder var6) {
      return this.m_5300(this.f_14948, var2.m_8189() ? this.f_14951 : this.f_14950, var3, var4, var5, var2.m_8189() ? var1 : null, var6);
   }

   private GpuBuffer m_5329(GpuBuffer var1, int var2, String var3) {
      return var1 != null && !var1.isClosed() ? var1 : RenderSystem.getDevice().createBuffer(() -> var3, 136, var2);
   }

   private void m_5330(CommandEncoder var1, RenderTarget var2, Hands var3, float var4, float var5) {
      float var6 = var3.m_8116() * var3.m_8163() * this.f_14966;
      if (!(var6 <= f_15148)) {
         MemoryStack var7 = MemoryStack.stackPush();

         try {
            Std140Builder var8 = Std140Builder.onStack(var7, 64)
               .putVec4(var6, var5, var4, var3.m_8170())
               .putVec4(var3.m_8143(), (float)var2.width / Math.max(1, var2.height), var3.m_8189() ? 1.0F : 0.0F, 0.0F);
            m_5304(var8, var3.m_8166());
            m_5304(var8, var3.m_8171());
            this.f_14961 = this.m_5329(this.f_14961, 64, f_15149);
            var1.writeToBuffer(this.f_14961.slice(), var8.get());
            RenderPass var9 = var1.createRenderPass(() -> f_15162, this.f_14954.getColorTextureView(), Optional.empty());

            try {
               var9.setPipeline(this.f_14946);
               var9.bindTexture(f_15150, var2.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
               var9.setUniform(f_15151, this.f_14961);
               var9.draw(3, 1, 0, 0);
            } catch (Throwable var14) {
               if (var9 != null) {
                  try {
                     var9.close();
                  } catch (Throwable var13) {
                     var14.addSuppressed(var13);
                  }
               }

               throw var14;
            }

            if (var9 != null) {
               var9.close();
            }
         } catch (Throwable var15) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var12) {
                  var15.addSuppressed(var12);
               }
            }

            throw var15;
         }

         if (var7 != null) {
            var7.close();
         }
      }
   }

   private static final class Class_0xVbyF0f4qLLt2lo extends RenderTarget {
      public Class_0xVbyF0f4qLLt2lo(String var1, int var2, int var3) {
         super(var1, false, GpuFormat.R8_UNORM);
         this.resize(var2, var3);
      }

      public void createBuffers(int var1, int var2) {
         RenderSystem.assertOnRenderThread();
         GpuDevice var3 = RenderSystem.getDevice();
         int var4 = var3.getDeviceInfo().limits().maxTextureSize();
         if (var1 > 0 && var2 > 0 && var1 <= var4 && var2 <= var4) {
            this.width = var1;
            this.height = var2;
            this.colorTexture = var3.createTexture(() -> this.label + "", 13, GpuFormat.R8_UNORM, var1, var2, 1, 1);
            this.colorTextureView = var3.createTextureView(this.colorTexture);
         } else {
            throw new IllegalArgumentException("" + var1 + var2);
         }
      }
   }

   private static final class J6fV8uaRqaXhTRoo {
      public float f_14902 = Float.NaN;
      public int f_14903;
      public int f_14904;
      public int f_14905;
      public int f_14906 = -1;
      public int f_14907 = -1;
      public float f_14908 = Float.NaN;
      public boolean f_14909;

      public void m_5289(float var1, int var2, int var3, int var4, int var5, int var6, float var7, boolean var8) {
         this.f_14902 = var1;
         this.f_14903 = var2;
         this.f_14904 = var3;
         this.f_14905 = var4;
         this.f_14906 = var5;
         this.f_14907 = var6;
         this.f_14908 = var7;
         this.f_14909 = var8;
      }

      public void m_5290() {
         this.f_14902 = Float.NaN;
         this.f_14906 = -1;
         this.f_14907 = -1;
         this.f_14908 = Float.NaN;
      }

      public boolean m_5291(float var1, int var2, int var3, int var4, int var5, int var6, float var7, boolean var8) {
         return Float.compare(this.f_14902, var1) == 0
            && this.f_14903 == var2
            && this.f_14904 == var3
            && this.f_14905 == var4
            && this.f_14906 == var5
            && this.f_14907 == var6
            && Float.compare(this.f_14908, var7) == 0
            && this.f_14909 == var8;
      }

      public J6fV8uaRqaXhTRoo() {
      }
   }

   private static final class LoLmBi3LPhwnPlIR {
      public final String f_14910;
      public final boolean f_14911;
      public final GpuFormat f_14912;
      public final List<RenderTarget> f_14913 = new ArrayList<>(2);
      public RenderTarget f_14914;
      public GpuBuffer f_14915;
      public GpuBuffer f_14916;
      public int f_14917;
      public int f_14918;
      public float f_14919 = Float.NaN;

      public LoLmBi3LPhwnPlIR(String var1, boolean var2) {
         this(var1, var2 ? GpuFormat.R8_UNORM : GpuFormat.RGBA8_UNORM);
      }

      public LoLmBi3LPhwnPlIR(String var1, GpuFormat var2) {
         this.f_14910 = var1;
         this.f_14912 = var2;
         this.f_14911 = var2 == GpuFormat.R8_UNORM;
      }
   }
}
