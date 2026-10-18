package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.setting.impl.StringSetting;
import dev.dimasik.client.system.Class_2UsRDX6cw62X5Rqa;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_sULPxrOl7TpPlaX6;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance.Attenuation;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.material.FogType;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Beautiful extends Module {
   private static final int f_33181 = 208;
   private static final Vec3[] f_33182 = new Vec3[]{
      new Vec3(Beautiful.f_33255, Beautiful.f_33256, 0.0),
      new Vec3(Beautiful.f_33257, Beautiful.f_33258, 0.0),
      new Vec3(0.0, Beautiful.f_33259, Beautiful.f_33260),
      new Vec3(0.0, Beautiful.f_33261, Beautiful.f_33262)
   };
   private final StringSetting f_33183;
   private final CheckboxSetting f_33184;
   private final SliderSetting f_33185;
   private final SliderSetting f_33186;
   private final MultiChoiceSetting f_33187;
   private final StringSetting f_33188;
   private final CheckboxSetting f_33189;
   private final SliderSetting f_33190;
   private final RenderPipeline f_33191;
   private final Matrix4f f_33192;
   private final Matrix4f f_33193;
   private final float[] f_33194;
   private final float[] f_33195;
   private final Class_gEPk7yDw6CwIte87<Class_2UsRDX6cw62X5Rqa> f_33196;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_33197;
   private TextureTarget f_33198;
   private GpuBuffer f_33199;
   private final Beautiful.x9KMS6OujxSFpXbI[] f_33200;
   private int f_33201;
   private static final String f_33202 = "Beautiful";
   private static final String f_33203 = "Мокрые поверхности, отражения и звуки дождя";
   private static final String f_33204 = "Мокрый мир";
   private static final String f_33205 = "Мокрые поверхности";
   private static final String f_33206 = "Отражение";
   private static final float f_33207 = 70.0F;
   private static final float f_33208 = 100.0F;
   private static final float f_33209 = 5.0F;
   private static final String f_33210 = "Количество влаги";
   private static final float f_33211 = 60.0F;
   private static final float f_33212 = 100.0F;
   private static final float f_33213 = 5.0F;
   private static final String f_33214 = "Качество влаги";
   private static final String f_33215 = "Низкое";
   private static final String f_33216 = "Среднее";
   private static final String f_33217 = "Высокое";
   private static final String f_33218 = "Атмосфера";
   private static final String f_33219 = "Звуки дождя";
   private static final String f_33220 = "Громкость дождя";
   private static final float f_33221 = 0.65F;
   private static final float f_33222 = 0.05F;
   private static final String f_33223 = "dimasik/beautiful_wet_world";
   private static final String f_33224 = "hands_fullscreen";
   private static final String f_33225 = "beautiful_wet_world";
   private static final String f_33226 = "WetWorld";
   private static final String f_33227 = "SceneSampler";
   private static final String f_33228 = "DepthSampler";
   private static final long f_33229 = 3600000L;
   private static final float f_33230 = 1000.0F;
   private static final String f_33231 = "Низкое";
   private static final float f_33232 = 14.0F;
   private static final String f_33233 = "Высокое";
   private static final float f_33234 = 40.0F;
   private static final float f_33235 = 24.0F;
   private static final float f_33236 = 100.0F;
   private static final float f_33237 = 100.0F;
   private static final float f_33238 = 0.35F;
   private static final float f_33239 = 0.45F;
   private static final float f_33240 = 0.98F;
   private static final float f_33241 = 24.0F;
   private static final String f_33242 = "Beautiful wet world";
   private static final String f_33243 = "WetWorld";
   private static final String f_33244 = "SceneSampler";
   private static final String f_33245 = "DepthSampler";
   private static final String f_33246 = "Beautiful scene backup";
   private static final float f_33247 = 0.45F;
   private static final float f_33248 = 0.6F;
   private static final float f_33249 = 0.9F;
   private static final float f_33250 = 255.0F;
   private static final float f_33251 = 255.0F;
   private static final float f_33252 = 255.0F;
   private static final float f_33253 = (float) (Math.PI / 180.0);
   private static final String f_33254 = "Beautiful wet world";
   private static final double f_33255 = -4.0;
   private static final double f_33256 = 1.5;
   private static final double f_33257 = 4.0;
   private static final double f_33258 = 1.5;
   private static final double f_33259 = 1.5;
   private static final double f_33260 = -4.0;
   private static final double f_33261 = 1.5;
   private static final double f_33262 = 4.0;

   private float[] m_9225(Camera var1, float var2) {
      float var3 = 0.0F;

      try {
         var3 = (Float)var1.attributeProbe().getValue(EnvironmentAttributes.SUN_ANGLE, var2) * f_33253;
      } catch (Throwable var5) {
      }

      this.f_33195[0] = -Mth.sin(var3);
      this.f_33195[1] = Mth.cos(var3);
      this.f_33195[2] = 0.0F;
      return this.f_33195;
   }

   private void m_9227(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.m_776()
         && this.f_33184.m_8768()
         && !Rain.m_6679()
         && f_11537.level != null
         && f_11537.player != null
         && f_11537.gameRenderer != null
         && var1.m_5007() != null
         && var1.m_5009() != null) {
         if (!(this.f_33185.m_8768() <= 0.0F) || !(this.f_33186.m_8768() <= 0.0F)) {
            Camera var2 = f_11537.gameRenderer.mainCamera();
            if (var2 != null && var2.getFluidInCamera() == FogType.NONE) {
               RenderTarget var3 = f_11537.gameRenderer.mainRenderTarget();
               if (var3 != null
                  && var3.getColorTexture() != null
                  && var3.getDepthTexture() != null
                  && var3.getColorTextureView() != null
                  && var3.getDepthTextureView() != null
                  && !var3.getDepthTexture().isClosed()) {
                  this.f_33192.set(var1.m_5009()).mul(var1.m_5007());
                  this.f_33193.set(this.f_33192).invert();
                  Vec3 var4 = var2.position();
                  float var5 = var1.m_5004();
                  CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
                  this.m_9232(var6, var3, var2, var4, var5);
               }
            }
         }
      }
   }

   private static void m_9228(CommandEncoder var0, RenderTarget var1, RenderTarget var2) {
      int var3 = Math.min(var1.width, var2.width);
      int var4 = Math.min(var1.height, var2.height);
      var0.copyTextureToTexture(var1.getColorTexture(), var2.getColorTexture(), 0, 0, 0, 0, 0, var3, var4);
   }

   private static GpuBuffer m_9230(GpuBuffer var0, String var1, int var2) {
      return var0 != null && !var0.isClosed() ? var0 : RenderSystem.getDevice().createBuffer(() -> var1, 136, var2);
   }

   private static void m_9231(GpuBuffer var0) {
      if (var0 != null && !var0.isClosed()) {
         var0.close();
      }
   }

   private void m_9232(CommandEncoder var1, RenderTarget var2, Camera var3, Vec3 var4, float var5) {
      this.m_9233(var2.width, var2.height);
      m_9228(var1, var2, this.f_33198);
      float var6 = (float)(System.currentTimeMillis() % f_33229) / f_33230;
      float var7 = this.f_33187.m_7568(f_33231) ? f_33232 : (this.f_33187.m_7568(f_33233) ? f_33234 : f_33235);
      float[] var8 = this.m_9234(var3, var5);
      float[] var9 = this.m_9225(var3, var5);
      boolean var10 = f_11537.level.dimensionType().hasSkyLight();
      MemoryStack var11 = MemoryStack.stackPush();

      try {
         ByteBuffer var12 = Std140Builder.onStack(var11, 208)
            .putMat4f(this.f_33192)
            .putMat4f(this.f_33193)
            .putVec4((float)var4.x, (float)var4.y, (float)var4.z, var6)
            .putVec4(var8[0], var8[1], var8[2], this.f_33185.m_8768() / f_33236)
            .putVec4(var9[0], var9[1], var9[2], this.f_33186.m_8768() / f_33237)
            .putVec4(f_33238, var10 ? f_33239 : 0.0F, var7, f_33240)
            .putVec4(f_33241, 1.0F, 0.0F, 0.0F)
            .get();
         this.f_33199 = m_9230(this.f_33199, f_33242, 208);
         var1.writeToBuffer(this.f_33199.slice(), var12);
      } catch (Throwable var17) {
         if (var11 != null) {
            try {
               var11.close();
            } catch (Throwable var15) {
               var17.addSuppressed(var15);
            }
         }

         throw var17;
      }

      if (var11 != null) {
         var11.close();
      }

      RenderPass var18 = var1.createRenderPass(() -> f_33254, var2.getColorTextureView(), Optional.empty());

      try {
         var18.setPipeline(this.f_33191);
         var18.setUniform(f_33243, this.f_33199);
         var18.bindTexture(f_33244, this.f_33198.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var18.bindTexture(f_33245, var2.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var18.draw(3, 1, 0, 0);
      } catch (Throwable var16) {
         if (var18 != null) {
            try {
               var18.close();
            } catch (Throwable var14) {
               var16.addSuppressed(var14);
            }
         }

         throw var16;
      }

      if (var18 != null) {
         var18.close();
      }
   }

   private void m_9233(int var1, int var2) {
      int var3 = Math.max(1, var1);
      int var4 = Math.max(1, var2);
      if (this.f_33198 == null) {
         this.f_33198 = new TextureTarget(f_33246, var3, var4, false, GpuFormat.RGBA8_UNORM);
      } else {
         if (this.f_33198.width != var3 || this.f_33198.height != var4) {
            this.f_33198.resize(var3, var4);
         }
      }
   }

   private float[] m_9234(Camera var1, float var2) {
      float[] var3 = this.f_33194;
      var3[0] = f_33247;
      var3[1] = f_33248;
      var3[2] = f_33249;

      try {
         Object var4 = var1.attributeProbe().getValue(EnvironmentAttributes.SKY_COLOR, var2);
         if (var4 instanceof Integer var5) {
            var3[0] = (var5 >> 16 & 0xFF) / f_33250;
            var3[1] = (var5 >> 8 & 0xFF) / f_33251;
            var3[2] = (var5 & 0xFF) / f_33252;
         } else if (var4 instanceof Vector3f var6) {
            var3[0] = var6.x;
            var3[1] = var6.y;
            var3[2] = var6.z;
         } else if (var4 instanceof Vector4f var7) {
            var3[0] = var7.x;
            var3[1] = var7.y;
            var3[2] = var7.z;
         }
      } catch (Throwable var8) {
      }

      return var3;
   }

   public void m_9235() {
      this.m_9236();
      this.m_9237();
      m_9231(this.f_33199);
      this.f_33199 = null;
   }

   public Beautiful() {
      super(f_33202, f_33203, Category.RENDER);
      this.f_33183 = new StringSetting(f_33204);
      this.f_33184 = new CheckboxSetting(f_33205, true);
      this.f_33185 = new SliderSetting(f_33206, f_33207, 0.0F, f_33208).m_828(f_33209).m_822(this.f_33184::m_8768);
      this.f_33186 = new SliderSetting(f_33210, f_33211, 0.0F, f_33212).m_828(f_33213).m_822(this.f_33184::m_8768);
      this.f_33187 = new MultiChoiceSetting(
            f_33214, 1, new Class_2ZaVm8TGDJ68TnJB(f_33215), new Class_2ZaVm8TGDJ68TnJB(f_33216), new Class_2ZaVm8TGDJ68TnJB(f_33217)
         )
         .m_822(this.f_33184::m_8768);
      this.f_33188 = new StringSetting(f_33218);
      this.f_33189 = new CheckboxSetting(f_33219, false);
      this.f_33190 = new SliderSetting(f_33220, f_33221, 0.0F, 1.0F).m_828(f_33222).m_822(this.f_33189::m_8768);
      this.f_33191 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_33223)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_33224))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_33225))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_33226, UniformType.UNIFORM_BUFFER)
         .m_2741(f_33227)
         .m_2741(f_33228)
         .m_2722();
      this.f_33192 = new Matrix4f();
      this.f_33193 = new Matrix4f();
      this.f_33194 = new float[3];
      this.f_33195 = new float[3];
      this.f_33196 = this::m_9227;
      this.f_33197 = var1 -> this.m_9238();
      this.f_33200 = new Beautiful.x9KMS6OujxSFpXbI[f_33182.length];
      this.m_795(this.f_33183, this.f_33184, this.f_33185, this.f_33186, this.f_33187, this.f_33188, this.f_33189, this.f_33190);
   }

   @Override
   public void m_732() {
      this.m_9235();
   }

   private void m_9236() {
      for (int var1 = 0; var1 < this.f_33200.length; var1++) {
         if (this.f_33200[var1] != null) {
            this.f_33200[var1].finish();
            f_11537.getSoundManager().stop(this.f_33200[var1]);
            this.f_33200[var1] = null;
         }
      }

      this.f_33201 = 0;
   }

   private void m_9237() {
      if (this.f_33198 != null) {
         this.f_33198.destroyBuffers();
         this.f_33198 = null;
      }
   }

   private void m_9238() {
      if (this.m_776() && this.f_33189.m_8768() && !(this.f_33190.m_8768() <= 0.0F) && f_11537.level != null && f_11537.player != null) {
         if (!f_11537.isPaused()) {
            SoundManager var1 = f_11537.getSoundManager();
            if (this.f_33201 > 0) {
               this.f_33201--;
            } else {
               for (int var2 = 0; var2 < this.f_33200.length; var2++) {
                  if (this.f_33200[var2] == null || !var1.isActive(this.f_33200[var2])) {
                     this.f_33200[var2] = new Beautiful.x9KMS6OujxSFpXbI(var2);
                     var1.play(this.f_33200[var2]);
                     this.f_33201 = 20;
                  }
               }
            }
         }
      } else {
         this.m_9236();
      }
   }

   private final class x9KMS6OujxSFpXbI extends AbstractTickableSoundInstance {
      public final ClientLevel f_33173 = Class_NzJrN63M7QBpmAbi.f_11537.level;
      public final Vec3 f_33174;
      public static final float f_33176 = 0.88F;
      public static final float f_33177 = 0.07F;
      public static final float f_33178 = 0.2F;
      public static final float f_33179 = 0.15F;
      public static final float f_33180 = 0.38F;

      public void finish() {
         this.stop();
      }

      public x9KMS6OujxSFpXbI(int var2) {
         super(SoundEvents.WEATHER_RAIN, SoundSource.MASTER, RandomSource.create());
         this.f_33174 = Beautiful.f_33182[var2];
         this.looping = true;
         this.delay = 0;
         this.relative = false;
         this.attenuation = Attenuation.LINEAR;
         this.pitch = f_33176 + var2 * f_33177;
         this.volume = 0.0F;
         this.updatePosition();
      }

      public void tick() {
         if (Class_NzJrN63M7QBpmAbi.f_11537.level == this.f_33173
            && Class_NzJrN63M7QBpmAbi.f_11537.player != null
            && Beautiful.this.m_776()
            && Beautiful.this.f_33189.m_8768()) {
            this.updatePosition();
            float var1 = Class_NzJrN63M7QBpmAbi.f_11537.gameRenderer.mainCamera().getFluidInCamera() == FogType.NONE ? 1.0F : f_33178;
            this.volume = Mth.lerp(f_33179, this.volume, Beautiful.this.f_33190.m_8768() * f_33180 * var1);
         } else {
            this.stop();
         }
      }

      public void updatePosition() {
         Vec3 var1 = Class_NzJrN63M7QBpmAbi.f_11537.gameRenderer.mainCamera().position().add(this.f_33174);
         this.x = var1.x;
         this.y = var1.y;
         this.z = var1.z;
      }

      public boolean canStartSilent() {
         return true;
      }
   }
}
