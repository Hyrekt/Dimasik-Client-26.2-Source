package dev.dimasik.client.module.render;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_15puspGa4UwNUgkr;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.client.model.object.crystal.EndCrystalModel;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import org.lwjgl.system.MemoryStack;

public final class CustomCrystal extends Module {
   private static final int f_1173 = -1;
   private final MultiChoiceSetting f_1174;
   private final SliderSetting f_1175;
   private final CheckboxSetting f_1176;
   private final SliderSetting f_1177;
   private final SliderSetting f_1178;
   private final SliderSetting f_1179;
   private final SliderSetting f_1180;
   private final RenderPipeline f_1181;
   private boolean f_1182;
   private final Class_gEPk7yDw6CwIte87<Class_15puspGa4UwNUgkr> f_1183;
   private static final String f_1184 = "CustomCrystal";
   private static final String f_1185 = "Шейдер и анимация кристалла";
   private static final String f_1186 = "Режим";
   private static final String f_1187 = "Шейдер";
   private static final String f_1188 = "Заливка";
   private static final String f_1189 = "Размер";
   private static final float f_1190 = 0.2F;
   private static final float f_1191 = 3.0F;
   private static final float f_1192 = 0.05F;
   private static final String f_1193 = "Обводка темы";
   private static final String f_1194 = "Прозрачность";
   private static final float f_1195 = 85.0F;
   private static final float f_1196 = 10.0F;
   private static final float f_1197 = 100.0F;
   private static final String f_1198 = "Ширина оутлайна";
   private static final float f_1199 = 2.5F;
   private static final float f_1200 = 0.5F;
   private static final float f_1201 = 8.0F;
   private static final float f_1202 = 0.25F;
   private static final String f_1203 = "Прозрачность оутлайна";
   private static final float f_1204 = 65.0F;
   private static final float f_1205 = 5.0F;
   private static final float f_1206 = 100.0F;
   private static final String f_1207 = "Сила свечения";
   private static final float f_1208 = 0.7F;
   private static final float f_1209 = 0.2F;
   private static final float f_1210 = 0.05F;
   private static final String f_1211 = "dimasik/custom_crystal_composite";
   private static final String f_1212 = "hands_fullscreen";
   private static final String f_1213 = "custom_crystal_composite";
   private static final String f_1214 = "CustomCrystalComposite";
   private static final String f_1215 = "MaskSampler";
   private static final float f_1216 = 24.0F;
   private static final float f_1217 = 255.0F;
   private static final float f_1218 = 255.0F;
   private static final float f_1219 = 255.0F;
   private static final float f_1220 = 100.0F;
   private static final long f_1221 = 100000L;
   private static final float f_1222 = 1000.0F;
   private static final String f_1223 = "Шейдер";
   private static final float f_1224 = 100.0F;
   private static final String f_1225 = "MaskSampler";
   private static final String f_1226 = "CustomCrystalComposite";
   private static final String f_1227 = "customCrystalComposite";
   private static final String f_1228 = "customCrystalComposite";

   public void m_1192(RenderTarget var1, RenderTarget var2) {
      if (this.m_776() && var1 != null && var2 != null && var1.getColorTextureView() != null) {
         Color var3 = new Color(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), true);
         CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
         GpuBuffer var5 = null;

         try {
            MemoryStack var6 = MemoryStack.stackPush();

            try {
               ByteBuffer var7 = Std140Builder.onStack(var6, 64)
                  .putVec4(var3.getRed() / f_1217, var3.getGreen() / f_1218, var3.getBlue() / f_1219, this.f_1177.m_8768() / f_1220)
                  .putVec4(
                     (float)(System.currentTimeMillis() % f_1221) / f_1222, this.f_1176.m_8768() ? 1.0F : 0.0F, this.f_1174.m_7568(f_1223) ? 1.0F : 0.0F, 0.0F
                  )
                  .putVec4(this.f_1178.m_8768(), this.f_1179.m_8768() / f_1224, this.f_1180.m_8768(), 0.0F)
                  .putVec2(var1.width, var1.height)
                  .get();
               var5 = RenderSystem.getDevice().createBuffer(() -> f_1228, 128, var7);
               RenderPass var8 = var4.createRenderPass(() -> f_1227, var2.getColorTextureView(), Optional.empty());

               try {
                  RenderSystem.bindDefaultUniforms(var8);
                  var8.bindTexture(f_1225, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                  var8.setUniform(f_1226, var5);
                  var8.setPipeline(this.f_1181);
                  var8.draw(3, 1, 0, 0);
               } catch (Throwable var19) {
                  if (var8 != null) {
                     try {
                        var8.close();
                     } catch (Throwable var18) {
                        var19.addSuppressed(var18);
                     }
                  }

                  throw var19;
               }

               if (var8 != null) {
                  var8.close();
               }
            } catch (Throwable var20) {
               if (var6 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var17) {
                     var20.addSuppressed(var17);
                  }
               }

               throw var20;
            }

            if (var6 != null) {
               var6.close();
            }
         } finally {
            if (var5 != null) {
               var5.close();
            }
         }
      }
   }

   public void m_1193(PoseStack var1) {
      float var2 = this.f_1175.m_8768();
      var1.scale(var2, var2, var2);
   }

   @Override
   public void m_732() {
      this.f_1182 = false;
   }

   public boolean m_1194() {
      boolean var1 = this.f_1182;
      this.f_1182 = false;
      return var1;
   }

   public void m_1195(EndCrystalModel var1) {
      var1.cube.visible = false;
      var1.base.visible = false;
      var1.outerGlass.y = f_1216;
   }

   public void m_1196(EndCrystalModel var1, boolean var2, boolean var3, float var4) {
      var1.cube.visible = var2;
      var1.base.visible = var3;
      var1.outerGlass.y = var4;
   }

   private void m_1199(Class_15puspGa4UwNUgkr var1) {
      if (this.m_776() && var1.m_838() instanceof EndCrystal) {
         var1.m_837().outlineColor = -1;
         var1.m_837().isInvisible = true;
         this.f_1182 = true;
      }
   }

   public CustomCrystal() {
      super(f_1184, f_1185, Category.RENDER);
      this.f_1174 = new MultiChoiceSetting(f_1186, new Class_2ZaVm8TGDJ68TnJB(f_1187), new Class_2ZaVm8TGDJ68TnJB(f_1188));
      this.f_1175 = new SliderSetting(f_1189, 1.0F, f_1190, f_1191).m_828(f_1192);
      this.f_1176 = new CheckboxSetting(f_1193, true);
      this.f_1177 = new SliderSetting(f_1194, f_1195, f_1196, f_1197).m_828(1.0F);
      this.f_1178 = new SliderSetting(f_1198, f_1199, f_1200, f_1201).m_828(f_1202).m_822(this.f_1176::m_8768);
      this.f_1179 = new SliderSetting(f_1203, f_1204, f_1205, f_1206).m_828(1.0F).m_822(this.f_1176::m_8768);
      this.f_1180 = new SliderSetting(f_1207, f_1208, f_1209, 2.0F).m_828(f_1210).m_822(this.f_1176::m_8768);
      this.f_1181 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_1211)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_1212))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_1213))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_1214, UniformType.UNIFORM_BUFFER)
         .m_2741(f_1215)
         .m_2722();
      this.f_1183 = this::m_1199;
      this.m_795(this.f_1174, this.f_1175, this.f_1176, this.f_1177, this.f_1178, this.f_1179, this.f_1180);
   }
}
