package dev.dimasik.client.module.render;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aimbot;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_2wfi3ocqYhcXQp1s;
import dev.dimasik.client.system.Class_7De9yWcJnhjtr53W;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_OoCoc3llSWHbEOIU;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_YwgaTrbsf7YCHgtS;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_sms8BVUwS0A8v5lZ;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public final class CatPet extends Module {
   private static final float f_35561 = 0.0625F;
   private final MultiChoiceSetting f_35562;
   private final MultiChoiceSetting f_35563;
   private final SliderSetting f_35564;
   private final SliderSetting f_35565;
   private final SliderSetting f_35566;
   private final SliderSetting f_35567;
   private final SliderSetting f_35568;
   private final RenderPipeline f_35569;
   private final RenderPipeline f_35570;
   private final Class_2wfi3ocqYhcXQp1s f_35571;
   private final Class_sms8BVUwS0A8v5lZ f_35572;
   private final Class_YwgaTrbsf7YCHgtS f_35573;
   private final Class_7De9yWcJnhjtr53W f_35574;
   private final Class_w8fCJQ5ZtH5lQbWc f_35575;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_35576;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_35577;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_35578;
   private int f_35579;
   private static final String f_35580 = "CatPet";
   private static final String f_35581 = "Кот-помощник Мачкин";
   private static final String f_35582 = "Окрас";
   private static final String f_35583 = "Machkin";
   private static final String f_35584 = "Jellie";
   private static final String f_35585 = "Tabby";
   private static final String f_35586 = "Black";
   private static final String f_35587 = "Red";
   private static final String f_35588 = "Siamese";
   private static final String f_35589 = "British";
   private static final String f_35590 = "Calico";
   private static final String f_35591 = "Persian";
   private static final String f_35592 = "Ragdoll";
   private static final String f_35593 = "White";
   private static final String f_35594 = "All Black";
   private static final String f_35595 = "Голос";
   private static final String f_35596 = "Скорость";
   private static final float f_35597 = 0.15F;
   private static final float f_35598 = 0.05F;
   private static final float f_35599 = 0.3F;
   private static final float f_35600 = 0.01F;
   private static final String f_35601 = "Размер";
   private static final float f_35602 = 0.95F;
   private static final float f_35603 = 0.3F;
   private static final float f_35604 = 1.5F;
   private static final float f_35605 = 0.05F;
   private static final String f_35606 = "Дистанция";
   private static final float f_35607 = 1.5F;
   private static final float f_35608 = 0.5F;
   private static final float f_35609 = 4.0F;
   private static final float f_35610 = 0.25F;
   private static final String f_35611 = "Ударов для мяу";
   private static final float f_35612 = 5.0F;
   private static final float f_35613 = 20.0F;
   private static final String f_35614 = "Громкость";
   private static final float f_35615 = 0.05F;
   private static final String f_35616 = "dimasik/cat_pet_skin";
   private static final String f_35617 = "cat_pet";
   private static final String f_35618 = "cat_pet_skin";
   private static final String f_35619 = "Sampler0";
   private static final String f_35620 = "dimasik/cat_pet_shadow";
   private static final String f_35621 = "cat_pet";
   private static final String f_35622 = "cat_pet_shadow";
   private static final float f_35623 = 2.6F;
   private static final float f_35624 = 0.02F;
   private static final float f_35625 = 0.0625F;
   private static final float f_35626 = 0.86F;
   private static final float f_35627 = 0.14F;
   private static final float f_35628 = 20.0F;
   private static final String f_35629 = "Jellie";
   private static final String f_35630 = "Tabby";
   private static final String f_35631 = "Black";
   private static final String f_35632 = "Red";
   private static final String f_35633 = "Siamese";
   private static final String f_35634 = "British";
   private static final String f_35635 = "Calico";
   private static final String f_35636 = "Persian";
   private static final String f_35637 = "Ragdoll";
   private static final String f_35638 = "White";
   private static final String f_35639 = "All Black";
   private static final String f_35640 = "minecraft";
   private static final String f_35641 = "textures/entity/cat/cat_jellie.png";
   private static final String f_35642 = "minecraft";
   private static final String f_35643 = "textures/entity/cat/cat_tabby.png";
   private static final String f_35644 = "minecraft";
   private static final String f_35645 = "textures/entity/cat/cat_black.png";
   private static final String f_35646 = "minecraft";
   private static final String f_35647 = "textures/entity/cat/cat_red.png";
   private static final String f_35648 = "minecraft";
   private static final String f_35649 = "textures/entity/cat/cat_siamese.png";
   private static final String f_35650 = "minecraft";
   private static final String f_35651 = "textures/entity/cat/cat_british_shorthair.png";
   private static final String f_35652 = "minecraft";
   private static final String f_35653 = "textures/entity/cat/cat_calico.png";
   private static final String f_35654 = "minecraft";
   private static final String f_35655 = "textures/entity/cat/cat_persian.png";
   private static final String f_35656 = "minecraft";
   private static final String f_35657 = "textures/entity/cat/cat_ragdoll.png";
   private static final String f_35658 = "minecraft";
   private static final String f_35659 = "textures/entity/cat/cat_white.png";
   private static final String f_35660 = "minecraft";
   private static final String f_35661 = "textures/entity/cat/cat_all_black.png";
   private static final String f_35662 = "dimasik";
   private static final String f_35663 = "textures/entity/cat/machkin.png";
   private static final double f_35664 = 0.5;
   private static final float f_35665 = 0.55F;
   private static final float f_35666 = 0.45F;
   private static final float f_35667 = 15.0F;

   private Identifier m_9697() {
      return switch (this.f_35562.m_7564().m_1181()) {
         case f_35629 -> Identifier.fromNamespaceAndPath(f_35640, f_35641);
         case f_35630 -> Identifier.fromNamespaceAndPath(f_35642, f_35643);
         case f_35631 -> Identifier.fromNamespaceAndPath(f_35644, f_35645);
         case f_35632 -> Identifier.fromNamespaceAndPath(f_35646, f_35647);
         case f_35633 -> Identifier.fromNamespaceAndPath(f_35648, f_35649);
         case f_35634 -> Identifier.fromNamespaceAndPath(f_35650, f_35651);
         case f_35635 -> Identifier.fromNamespaceAndPath(f_35652, f_35653);
         case f_35636 -> Identifier.fromNamespaceAndPath(f_35654, f_35655);
         case f_35637 -> Identifier.fromNamespaceAndPath(f_35656, f_35657);
         case f_35638 -> Identifier.fromNamespaceAndPath(f_35658, f_35659);
         case f_35639 -> Identifier.fromNamespaceAndPath(f_35660, f_35661);
         default -> Identifier.fromNamespaceAndPath(f_35662, f_35663);
      };
   }

   private void m_9698(Class_wjdoxQGtI8mFyL6U var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
            if (++this.f_35579 >= Math.round(this.f_35567.m_8768())) {
               this.f_35579 = 0;
               this.f_35572.m_8725();
               Class_OoCoc3llSWHbEOIU.m_4071(this.f_35563.m_7564().m_1181()).m_4073(this.f_35568.m_8768());
            }
         }
      }
   }

   public CatPet() {
      super(f_35580, f_35581, Category.RENDER);
      this.f_35562 = new MultiChoiceSetting(
         f_35582,
         new Class_2ZaVm8TGDJ68TnJB(f_35583),
         new Class_2ZaVm8TGDJ68TnJB(f_35584),
         new Class_2ZaVm8TGDJ68TnJB(f_35585),
         new Class_2ZaVm8TGDJ68TnJB(f_35586),
         new Class_2ZaVm8TGDJ68TnJB(f_35587),
         new Class_2ZaVm8TGDJ68TnJB(f_35588),
         new Class_2ZaVm8TGDJ68TnJB(f_35589),
         new Class_2ZaVm8TGDJ68TnJB(f_35590),
         new Class_2ZaVm8TGDJ68TnJB(f_35591),
         new Class_2ZaVm8TGDJ68TnJB(f_35592),
         new Class_2ZaVm8TGDJ68TnJB(f_35593),
         new Class_2ZaVm8TGDJ68TnJB(f_35594)
      );
      this.f_35563 = new MultiChoiceSetting(f_35595, Class_OoCoc3llSWHbEOIU.m_4070());
      this.f_35564 = new SliderSetting(f_35596, f_35597, f_35598, f_35599).m_828(f_35600);
      this.f_35565 = new SliderSetting(f_35601, f_35602, f_35603, f_35604).m_828(f_35605);
      this.f_35566 = new SliderSetting(f_35606, f_35607, f_35608, f_35609).m_828(f_35610);
      this.f_35567 = new SliderSetting(f_35611, f_35612, 1.0F, f_35613).m_828(1.0F);
      this.f_35568 = new SliderSetting(f_35614, 1.0F, 0.0F, 2.0F).m_828(f_35615);
      this.f_35569 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_35616)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_35617))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_35618))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(true)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_35619)
         .m_2722();
      this.f_35570 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_35620)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_35621))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_35622))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_35571 = new Class_2wfi3ocqYhcXQp1s();
      this.f_35572 = new Class_sms8BVUwS0A8v5lZ();
      this.f_35573 = new Class_YwgaTrbsf7YCHgtS();
      this.f_35574 = new Class_7De9yWcJnhjtr53W();
      this.f_35575 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_35623, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_35576 = this::m_9705;
      this.f_35577 = this::m_9698;
      this.f_35578 = this::m_9701;
      this.m_795(this.f_35562, this.f_35563, this.f_35564, this.f_35565, this.f_35566, this.f_35567, this.f_35568);
   }

   private boolean m_9699(LivingEntity var1) {
      return var1 != null && var1 != f_11537.player && var1.isAlive() && !var1.isRemoved();
   }

   private LivingEntity m_9700() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null) {
         ModuleManager var1 = DimasikClient.m_9057().m_9049().m_2801();
         if (var1 == null) {
            return null;
         }

         Aimbot var2 = var1.m_3527();
         Aura var3 = var1.m_3576();
         return var3 != null && var3.m_776() && this.m_9699(var3.m_1114()) ? var3.m_1114() : null;
      } else {
         return null;
      }
   }

   private void m_9701(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null && this.f_35571.m_1213()) {
         this.f_35575.m_9283(1.0F);
         float var2 = this.f_35575.m_9288();
         if (!(var2 <= f_35624)) {
            float var3 = var1.m_5005().getGameTimeDeltaPartialTick(true);
            CatPet.EYZe0UEGXOwDeTrT var4 = new CatPet.EYZe0UEGXOwDeTrT(
               var1.m_5006().last().pose(),
               f_11537.gameRenderer.mainCamera().position(),
               var3,
               f_35625 * this.f_35565.m_8768() * (f_35626 + f_35627 * var2),
               var2,
               ((float)f_11537.level.getGameTime() + var3) / f_35628,
               this.m_9704(var3)
            );
            this.m_9703(Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC.SHADOW, this.f_35570, var4, null);
            this.m_9703(Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC.SKIN, this.f_35569, var4, this.m_9702());
         }
      }
   }

   private AbstractTexture m_9702() {
      return f_11537.getTextureManager().getTexture(this.m_9697());
   }

   private void m_9703(Class_7De9yWcJnhjtr53W.yai0oZhjj58G7pDC var1, RenderPipeline var2, CatPet.EYZe0UEGXOwDeTrT var3, AbstractTexture var4) {
      this.f_35574.m_1623(var1, var3.matrix(), var3.show(), var3.luminance());

      try {
         this.f_35574
            .m_1620(
               (float)(this.f_35571.m_1211(var3.delta()) - var3.camera().x),
               (float)(this.f_35571.m_1209(var3.delta()) - var3.camera().y),
               (float)(this.f_35571.m_1208(var3.delta()) - var3.camera().z)
            );
         this.f_35574.m_1624(this.f_35571.m_1214(var3.delta()));
         this.f_35574.m_1614(var3.scale());
         this.f_35573.m_5757(this.f_35574, this.f_35572, var3.delta(), var3.time());
      } finally {
         this.f_35574.m_1617(var2, var4);
      }
   }

   private float m_9704(float var1) {
      BlockPos var2 = BlockPos.containing(this.f_35571.m_1211(var1), this.f_35571.m_1209(var1) + f_35664, this.f_35571.m_1208(var1));
      int var3 = f_11537.level.getBrightness(LightLayer.BLOCK, var2);
      int var4 = f_11537.level.getBrightness(LightLayer.SKY, var2);
      return f_35665 + f_35666 * (Math.max(var3, var4) / f_35667);
   }

   @Override
   public void m_778() {
      this.f_35579 = 0;
      this.f_35571.m_1216();
      this.f_35572.m_8715();
      this.f_35575.m_9281(0.0F);
   }

   @Override
   public void m_732() {
      this.f_35571.m_1216();
   }

   private void m_9705(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         this.f_35572.m_8719();
         double var2 = this.f_35571.m_1215(this.m_9700(), this.f_35564.m_8768(), this.f_35566.m_8768());
         this.f_35572.m_8726(var2, this.f_35564.m_8768());
      }
   }

   private record EYZe0UEGXOwDeTrT(Matrix4f matrix, Vec3 camera, float delta, float scale, float show, float time, float luminance) {
   }
}
