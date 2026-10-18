package dev.dimasik.client.module.render;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_RnKnITDbSPC9tZWL;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import dev.dimasik.client.system.Class_Y1xeT7bRYGLzwOe2;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;

public final class ViewModel extends Module {
   private static final float f_7980 = 0.65F;
   public static volatile boolean f_7981;
   public static RenderTarget f_7982;
   private static volatile ViewModel.g14Ur6BWKefyEL89 f_7983 = ViewModel.g14Ur6BWKefyEL89.ITEM;
   private final BooleanSetting f_7984;
   private final SliderSetting f_7985;
   private final SliderSetting f_7986;
   private final SliderSetting f_7987;
   private final SliderSetting f_7988;
   private final SliderSetting f_7989;
   private final SliderSetting f_7990;
   private final SliderSetting f_7991;
   private final SliderSetting f_7992;
   private final SliderSetting f_7993;
   private final SliderSetting f_7994;
   private final SliderSetting f_7995;
   private final SliderSetting f_7996;
   private final SliderSetting f_7997;
   private final SliderSetting f_7998;
   private final SliderSetting f_7999;
   private final SliderSetting f_8000;
   private final Class_gEPk7yDw6CwIte87<Class_RnKnITDbSPC9tZWL> f_8001;
   private boolean f_8002;
   private float f_8003;
   private float f_8004;
   private float f_8005;
   private float f_8006;
   private float f_8007;
   private float f_8008;
   private volatile boolean f_8009;
   private volatile boolean f_8010;
   private static final String f_8011 = "ViewModel";
   private static final String f_8012 = "Положение предметов в руках";
   private static final String f_8013 = "Настроить положение";
   private static final String f_8014 = "Основная рука X";
   private static final float f_8015 = -2.5F;
   private static final float f_8016 = 2.5F;
   private static final float f_8017 = 0.05F;
   private static final String f_8018 = "Основная рука Y";
   private static final float f_8019 = -2.5F;
   private static final float f_8020 = 2.5F;
   private static final float f_8021 = 0.05F;
   private static final String f_8022 = "Основная рука Z";
   private static final float f_8023 = -2.5F;
   private static final float f_8024 = 2.5F;
   private static final float f_8025 = 0.05F;
   private static final String f_8026 = "Основная рука масштаб";
   private static final float f_8027 = 0.35F;
   private static final float f_8028 = 0.05F;
   private static final String f_8029 = "Левая рука X";
   private static final float f_8030 = -2.5F;
   private static final float f_8031 = 2.5F;
   private static final float f_8032 = 0.05F;
   private static final String f_8033 = "Левая рука Y";
   private static final float f_8034 = -2.5F;
   private static final float f_8035 = 2.5F;
   private static final float f_8036 = 0.05F;
   private static final String f_8037 = "Левая рука Z";
   private static final float f_8038 = -2.5F;
   private static final float f_8039 = 2.5F;
   private static final float f_8040 = 0.05F;
   private static final String f_8041 = "Левая рука масштаб";
   private static final float f_8042 = 0.35F;
   private static final float f_8043 = 0.05F;
   private static final String f_8044 = "Основная рука отдельно X";
   private static final float f_8045 = -2.5F;
   private static final float f_8046 = 2.5F;
   private static final String f_8047 = "Основная рука отдельно Y";
   private static final float f_8048 = -2.5F;
   private static final float f_8049 = 2.5F;
   private static final String f_8050 = "Предмет основной руки X";
   private static final float f_8051 = -2.5F;
   private static final float f_8052 = 2.5F;
   private static final String f_8053 = "Предмет основной руки Y";
   private static final float f_8054 = -2.5F;
   private static final float f_8055 = 2.5F;
   private static final String f_8056 = "Левая рука отдельно X";
   private static final float f_8057 = -2.5F;
   private static final float f_8058 = 2.5F;
   private static final String f_8059 = "Левая рука отдельно Y";
   private static final float f_8060 = -2.5F;
   private static final float f_8061 = 2.5F;
   private static final String f_8062 = "Предмет левой руки X";
   private static final float f_8063 = -2.5F;
   private static final float f_8064 = 2.5F;
   private static final String f_8065 = "Предмет левой руки Y";
   private static final float f_8066 = -2.5F;
   private static final float f_8067 = 2.5F;
   private static final double f_8068 = 2.0;
   private static final double f_8069 = 0.5;
   private static final float f_8070 = 0.72F;
   private static final float f_8071 = 0.28F;
   private static final float f_8072 = 0.74F;

   private Vector2f m_2845(InteractionHand var1) {
      boolean var2 = var1 == InteractionHand.MAIN_HAND;
      SliderSetting var3 = var2 ? this.f_7985 : this.f_7989;
      SliderSetting var4 = var2 ? this.f_7986 : this.f_7990;
      float var5 = Math.max(1, f_11537.getWindow().getScreenWidth());
      float var6 = Math.max(1, f_11537.getWindow().getScreenHeight());
      float var7 = ((Integer)f_11537.options.fov().get()).intValue();
      float var8 = (float)(var6 / (f_8068 * Math.tan(Math.toRadians(var7) * f_8069)));
      float var9 = (var2 ? f_8070 : f_8071) + var3.m_8768() * var8 / var5;
      float var10 = f_8072 - var4.m_8768() * var8 / var6;
      return new Vector2f(var9, 1.0F - var10);
   }

   public static boolean m_2846() {
      return f_7981 && f_7983 == ViewModel.g14Ur6BWKefyEL89.ITEM;
   }

   public void m_2847(InteractionHand var1, ItemStack var2, PoseStack var3) {
      if (var1 != InteractionHand.MAIN_HAND || !(var2.getItem() instanceof CrossbowItem)) {
         if (var1 == InteractionHand.MAIN_HAND) {
            var3.translate(this.f_7985.m_8768(), this.f_7986.m_8768(), this.f_7987.m_8768());
         } else {
            var3.translate(this.f_7989.m_8768(), this.f_7990.m_8768(), this.f_7991.m_8768());
         }
      }
   }

   public void m_2848(InteractionHand var1, boolean var2, PoseStack var3) {
      boolean var4 = var1 == InteractionHand.MAIN_HAND;
      float var5 = (var2 ? (var4 ? this.f_7995 : this.f_7999) : (var4 ? this.f_7993 : this.f_7997)).m_8768();
      float var6 = (var2 ? (var4 ? this.f_7996 : this.f_8000) : (var4 ? this.f_7994 : this.f_7998)).m_8768();
      var3.translate(var5, var6, 0.0F);
   }

   public void m_2849(InteractionHand var1, boolean var2, PoseStack var3) {
      boolean var4 = var1 == InteractionHand.MAIN_HAND;
      float var5 = (var2 ? (var4 ? this.f_7995 : this.f_7999) : (var4 ? this.f_7993 : this.f_7997)).m_8768();
      float var6 = (var2 ? (var4 ? this.f_7996 : this.f_8000) : (var4 ? this.f_7994 : this.f_7998)).m_8768();
      Vector3f var7 = f_11537.gameRenderer.mainCamera().rotation().transform(new Vector3f(var5, var6, 0.0F));
      Matrix4f var8 = var3.last().pose();
      var8.m30(var8.m30() + var7.x);
      var8.m31(var8.m31() + var7.y);
      var8.m32(var8.m32() + var7.z);
   }

   public ViewModel() {
      super(f_8011, f_8012, Category.RENDER);
      this.f_7984 = new BooleanSetting(f_8013).m_1474(this::m_2857).m_1472();
      this.f_7985 = new SliderSetting(f_8014, 0.0F, f_8015, f_8016).m_828(f_8017);
      this.f_7986 = new SliderSetting(f_8018, 0.0F, f_8019, f_8020).m_828(f_8021);
      this.f_7987 = new SliderSetting(f_8022, 0.0F, f_8023, f_8024).m_828(f_8025);
      this.f_7988 = new SliderSetting(f_8026, 1.0F, f_8027, 2.0F).m_828(f_8028);
      this.f_7989 = new SliderSetting(f_8029, 0.0F, f_8030, f_8031).m_828(f_8032);
      this.f_7990 = new SliderSetting(f_8033, 0.0F, f_8034, f_8035).m_828(f_8036);
      this.f_7991 = new SliderSetting(f_8037, 0.0F, f_8038, f_8039).m_828(f_8040);
      this.f_7992 = new SliderSetting(f_8041, 1.0F, f_8042, 2.0F).m_828(f_8043);
      this.f_7993 = new SliderSetting(f_8044, 0.0F, f_8045, f_8046).m_822(() -> false);
      this.f_7994 = new SliderSetting(f_8047, 0.0F, f_8048, f_8049).m_822(() -> false);
      this.f_7995 = new SliderSetting(f_8050, 0.0F, f_8051, f_8052).m_822(() -> false);
      this.f_7996 = new SliderSetting(f_8053, 0.0F, f_8054, f_8055).m_822(() -> false);
      this.f_7997 = new SliderSetting(f_8056, 0.0F, f_8057, f_8058).m_822(() -> false);
      this.f_7998 = new SliderSetting(f_8059, 0.0F, f_8060, f_8061).m_822(() -> false);
      this.f_7999 = new SliderSetting(f_8062, 0.0F, f_8063, f_8064).m_822(() -> false);
      this.f_8000 = new SliderSetting(f_8065, 0.0F, f_8066, f_8067).m_822(() -> false);
      this.f_8001 = this::m_2859;
      this.m_795(
         this.f_7984,
         this.f_7985,
         this.f_7986,
         this.f_7987,
         this.f_7988,
         this.f_7989,
         this.f_7990,
         this.f_7991,
         this.f_7992,
         this.f_7993,
         this.f_7994,
         this.f_7995,
         this.f_7996,
         this.f_7997,
         this.f_7998,
         this.f_7999,
         this.f_8000
      );
   }

   public boolean m_2854() {
      if (f_11537.gui.screen() instanceof ViewModel.Class_9VlSiRZKcoNJNslR && !this.f_8002 && f_11537.gameRenderer.mainRenderTarget() != null) {
         RenderTarget var1 = f_11537.gameRenderer.mainRenderTarget();
         Class_Y1xeT7bRYGLzwOe2.f_16090.m_5629(Math.max(1, var1.width), Math.max(1, var1.height));
         f_7983 = f_7983 == ViewModel.g14Ur6BWKefyEL89.HAND ? ViewModel.g14Ur6BWKefyEL89.ITEM : ViewModel.g14Ur6BWKefyEL89.HAND;
         f_7982 = f_7983 == ViewModel.g14Ur6BWKefyEL89.HAND ? Class_Y1xeT7bRYGLzwOe2.f_16090.m_5625() : Class_Y1xeT7bRYGLzwOe2.f_16090.m_5621();
         f_7981 = f_7982 != null;
         this.f_8002 = f_7981;
         return f_7981;
      } else {
         return false;
      }
   }

   private void m_2857() {
      if (f_11537.player != null && f_11537.level != null) {
         if (!this.m_776()) {
            this.m_792();
         }

         f_11537.gui.setScreen(new ViewModel.Class_9VlSiRZKcoNJNslR(this));
      }
   }

   private void m_2858(InteractionHand var1, ItemStack var2, PoseStack var3) {
      if (var1 != InteractionHand.MAIN_HAND || !(var2.getItem() instanceof CrossbowItem)) {
         boolean var4 = var1 == InteractionHand.MAIN_HAND;
         float var5 = (var4 ? this.f_7985 : this.f_7989).m_8768();
         float var6 = (var4 ? this.f_7986 : this.f_7990).m_8768();
         float var7 = (var4 ? this.f_7987 : this.f_7991).m_8768();
         var3.translate(var5, var6, var7);
      }
   }

   private void m_2859(Class_RnKnITDbSPC9tZWL var1) {
      if (Class_X574GcHt0SazS9zo.m_5499()) {
         this.m_2847(var1.hand(), var1.stack(), var1.matrices());
      } else {
         this.m_2858(var1.hand(), var1.stack(), var1.matrices());
      }
   }

   @Override
   public void m_732() {
      f_7981 = false;
      f_7982 = null;
      this.f_8002 = false;
      this.f_8009 = false;
      this.f_8010 = false;
      Class_Y1xeT7bRYGLzwOe2.f_16090.m_5626();
   }

   public void m_2860() {
      if (this.f_8002) {
         f_7981 = false;
         f_7982 = null;
         this.f_8002 = false;
         if (f_11537.gui.screen() instanceof ViewModel.Class_9VlSiRZKcoNJNslR && f_11537.gameRenderer.mainRenderTarget() != null) {
            Class_Y1xeT7bRYGLzwOe2.f_16090
               .m_5628(Math.round(this.f_8007), Math.round(f_11537.gameRenderer.mainRenderTarget().height - this.f_8008 - 1.0F), var1 -> this.f_8009 = var1);
            Class_Y1xeT7bRYGLzwOe2.f_16090
               .m_5633(Math.round(this.f_8007), Math.round(f_11537.gameRenderer.mainRenderTarget().height - this.f_8008 - 1.0F), var1 -> this.f_8010 = var1);
            Class_Y1xeT7bRYGLzwOe2.f_16090
               .m_5632(
                  f_11537.gameRenderer.mainRenderTarget(),
                  this.f_8003,
                  this.f_8004,
                  this.f_8005,
                  this.f_8006,
                  this.m_2845(InteractionHand.MAIN_HAND),
                  this.m_2845(InteractionHand.OFF_HAND),
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
               );
         }
      }
   }

   public void m_2862(InteractionHand var1, PoseStack var2) {
      float var3 = var1 == InteractionHand.MAIN_HAND ? this.f_7988.m_8768() : this.f_7992.m_8768();
      var2.scale(var3, var3, var3);
   }

   public static boolean m_2864() {
      return f_7981 && f_7983 == ViewModel.g14Ur6BWKefyEL89.HAND;
   }

   private static final class Class_9VlSiRZKcoNJNslR extends ChatScreen {
      public final ViewModel f_7938;
      public final Class_w8fCJQ5ZtH5lQbWc f_7939;
      public final Class_w8fCJQ5ZtH5lQbWc f_7940;
      public final Class_w8fCJQ5ZtH5lQbWc f_7941;
      public final Class_w8fCJQ5ZtH5lQbWc f_7942;
      public InteractionHand f_7943;
      public ViewModel$vvA2B1vdDLGijcBY f_7944;
      public float f_7945;
      public float f_7946;
      public float f_7947;
      public float f_7948;
      public float f_7949;
      public float f_7950;
      public long f_7951;
      public static final float f_7952 = 10.0F;
      public static final float f_7953 = 10.0F;
      public static final float f_7954 = 10.0F;
      public static final float f_7955 = 10.0F;
      public static final float f_7956 = 600.0F;
      public static final float f_7957 = 0.5F;
      public static final float f_7958 = 24.0F;
      public static final String f_7959 = "Редактор ViewModel";
      public static final String f_7960 = "Тяни руку или предмет отдельно • Ctrl + наведение — выбрать и двигать вместе • колесо — масштаб";
      public static final float f_7961 = 0.5F;
      public static final float f_7962 = 11.0F;
      public static final double f_7963 = 255.0;
      public static final float f_7964 = 0.5F;
      public static final float f_7965 = 34.0F;
      public static final double f_7966 = 255.0;
      public static final double f_7967 = 2.0;
      public static final double f_7968 = 0.5;
      public static final float f_7969 = 0.65F;
      public static final float f_7970 = 0.1F;
      public static final float f_7971 = 0.1F;
      public static final float f_7972 = 310.0F;
      public static final float f_7973 = 370.0F;
      public static final float f_7974 = 0.5F;
      public static final float f_7975 = 0.5F;
      public static final float f_7976 = 0.016666668F;
      public static final float f_7977 = 1.0E9F;
      public static final float f_7978 = 0.05F;
      public static final float f_7979 = -15.0F;

      public InteractionHand ownerHand(float var1, float var2) {
         ViewModel$NhWhpWveQCbOyUER var3 = this.bounds(InteractionHand.MAIN_HAND);
         ViewModel$NhWhpWveQCbOyUER var4 = this.bounds(InteractionHand.OFF_HAND);
         return var3.distanceSquared(var1, var2) <= var4.distanceSquared(var1, var2) ? InteractionHand.MAIN_HAND : InteractionHand.OFF_HAND;
      }

      public boolean mouseDragged(MouseButtonEvent var1, double var2, double var4) {
         if (this.f_7943 == null) {
            return super.mouseDragged(var1, var2, var4);
         }

         Vector2f var6 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
         float var7 = var6.x - this.f_7945;
         float var8 = var6.y - this.f_7946;
         SliderSetting var9 = this.xSetting(this.f_7943, this.f_7944);
         SliderSetting var10 = this.ySetting(this.f_7943, this.f_7944);
         float var11 = Math.max(1, this.minecraft.getWindow().getScreenHeight());
         float var12 = ((Integer)this.minecraft.options.fov().get()).intValue();
         float var13 = (float)(var11 / (f_7967 * Math.tan(Math.toRadians(var12) * f_7968)));
         float var14 = f_7969 / Math.max(1.0F, var13);
         var9.m_818(this.f_7947 + var7 * var14);
         var10.m_818(this.f_7948 - var8 * var14);
         return true;
      }

      public boolean isPauseScreen() {
         return false;
      }

      public Class_9VlSiRZKcoNJNslR(ViewModel var1) {
         super("", false);
         this.f_7939 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7952, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_7940 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7953, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_7941 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7954, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_7942 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7955, Class_eXr9Fra2ad3yFXY8.f_19100);
         this.f_7938 = var1;
         this.f_7949 = var1.f_7988.m_8768();
         this.f_7950 = var1.f_7992.m_8768();
      }

      public SliderSetting xSetting(InteractionHand var1, ViewModel$vvA2B1vdDLGijcBY var2) {
         if (var2 == ViewModel$vvA2B1vdDLGijcBY.GROUP) {
            return var1 == InteractionHand.MAIN_HAND ? this.f_7938.f_7985 : this.f_7938.f_7989;
         } else if (var2 == ViewModel$vvA2B1vdDLGijcBY.ITEM) {
            return var1 == InteractionHand.MAIN_HAND ? this.f_7938.f_7995 : this.f_7938.f_7999;
         } else {
            return var1 == InteractionHand.MAIN_HAND ? this.f_7938.f_7993 : this.f_7938.f_7997;
         }
      }

      public void removed() {
         this.f_7938.f_8003 = 0.0F;
         this.f_7938.f_8004 = 0.0F;
         this.f_7938.f_8005 = 0.0F;
         this.f_7938.f_8006 = 0.0F;
         this.f_7938.f_8009 = false;
         this.f_7938.f_8010 = false;
         super.removed();
      }

      public boolean mouseReleased(MouseButtonEvent var1) {
         if (var1.button() == 0 && this.f_7943 != null) {
            this.f_7943 = null;
            this.f_7944 = null;
            return true;
         } else {
            return super.mouseReleased(var1);
         }
      }

      public void updateScaleAnimation() {
         long var1 = System.nanoTime();
         float var3 = this.f_7951 == 0L ? f_7976 : Math.clamp((float)(var1 - this.f_7951) / f_7977, 0.0F, f_7978);
         this.f_7951 = var1;
         float var4 = 1.0F - (float)Math.exp(f_7979 * var3);
         this.f_7938.f_7988.m_818(this.f_7938.f_7988.m_8768() + (this.f_7949 - this.f_7938.f_7988.m_8768()) * var4);
         this.f_7938.f_7992.m_818(this.f_7938.f_7992.m_8768() + (this.f_7950 - this.f_7938.f_7992.m_8768()) * var4);
      }

      public void drawHelp() {
         float var1 = this.minecraft.getWindow().getScreenWidth();
         float var2 = f_7956;
         float var3 = (var1 - var2) * f_7957;
         float var4 = f_7958;
         String var5 = Class_0p152hWffX3ippAf.m_801(f_7959);
         String var6 = Class_0p152hWffX3ippAf.m_801(f_7960);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var5,
            var3 + (var2 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var5, 15)) * f_7961,
            var4 + f_7962,
            15,
            Class_BftdentXEtGbugJw.m_2303(245, 247, 252, f_7963)
         );
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9590(),
            var6,
            var3 + (var2 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9590(), var6, 12)) * f_7964,
            var4 + f_7965,
            12,
            Class_BftdentXEtGbugJw.m_2303(172, 181, 198, f_7966)
         );
      }

      public SliderSetting ySetting(InteractionHand var1, ViewModel$vvA2B1vdDLGijcBY var2) {
         if (var2 == ViewModel$vvA2B1vdDLGijcBY.GROUP) {
            return var1 == InteractionHand.MAIN_HAND ? this.f_7938.f_7986 : this.f_7938.f_7990;
         } else if (var2 == ViewModel$vvA2B1vdDLGijcBY.ITEM) {
            return var1 == InteractionHand.MAIN_HAND ? this.f_7938.f_7996 : this.f_7938.f_8000;
         } else {
            return var1 == InteractionHand.MAIN_HAND ? this.f_7938.f_7994 : this.f_7938.f_7998;
         }
      }

      public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
         super.extractRenderState(var1, var2, var3, var4);
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         Class_Ssh31B3ljfKeWsvS.m_4830();
         this.updateScaleAnimation();
         Vector2f var5 = Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3);
         this.f_7938.f_8007 = var5.x;
         this.f_7938.f_8008 = var5.y;
         ViewModel$AQBS6FLfnMZtoPGZ var6 = this.hoveredSelection(var5.x, var5.y);
         boolean var7 = var6 != null && var6.hand == InteractionHand.MAIN_HAND;
         boolean var8 = var6 != null && var6.hand == InteractionHand.OFF_HAND;
         boolean var9 = var6 != null && var6.part == ViewModel$vvA2B1vdDLGijcBY.GROUP;
         this.f_7939
            .m_9283(
               (!var7 || !var9 && var6.part != ViewModel$vvA2B1vdDLGijcBY.HAND)
                     && (
                        this.f_7943 != InteractionHand.MAIN_HAND
                           || this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.GROUP && this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.HAND
                     )
                  ? 0.0F
                  : 1.0F
            );
         this.f_7940
            .m_9283(
               (!var7 || !var9 && var6.part != ViewModel$vvA2B1vdDLGijcBY.ITEM)
                     && (
                        this.f_7943 != InteractionHand.MAIN_HAND
                           || this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.GROUP && this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.ITEM
                     )
                  ? 0.0F
                  : 1.0F
            );
         this.f_7941
            .m_9283(
               (!var8 || !var9 && var6.part != ViewModel$vvA2B1vdDLGijcBY.HAND)
                     && (
                        this.f_7943 != InteractionHand.OFF_HAND
                           || this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.GROUP && this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.HAND
                     )
                  ? 0.0F
                  : 1.0F
            );
         this.f_7942
            .m_9283(
               (!var8 || !var9 && var6.part != ViewModel$vvA2B1vdDLGijcBY.ITEM)
                     && (
                        this.f_7943 != InteractionHand.OFF_HAND
                           || this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.GROUP && this.f_7944 != ViewModel$vvA2B1vdDLGijcBY.ITEM
                     )
                  ? 0.0F
                  : 1.0F
            );
         this.f_7938.f_8003 = this.f_7939.m_9288();
         this.f_7938.f_8004 = this.f_7940.m_9288();
         this.f_7938.f_8005 = this.f_7941.m_9288();
         this.f_7938.f_8006 = this.f_7942.m_9288();
         this.drawHelp();
      }

      public ViewModel$AQBS6FLfnMZtoPGZ hoveredSelection(float var1, float var2) {
         ViewModel$vvA2B1vdDLGijcBY var3 = this.f_7938.f_8010 ? ViewModel$vvA2B1vdDLGijcBY.ITEM : (this.f_7938.f_8009 ? ViewModel$vvA2B1vdDLGijcBY.HAND : null);
         if (var3 == null) {
            return null;
         }

         if (this.controlDown()) {
            var3 = ViewModel$vvA2B1vdDLGijcBY.GROUP;
         }

         return new ViewModel$AQBS6FLfnMZtoPGZ(this.ownerHand(var1, var2), var3);
      }

      public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
         if (var1.button() == 0) {
            Vector2f var3 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
            ViewModel$AQBS6FLfnMZtoPGZ var4 = this.hoveredSelection(var3.x, var3.y);
            if (var4 != null) {
               this.f_7943 = var4.hand;
               this.f_7944 = var4.part;
               this.f_7945 = var3.x;
               this.f_7946 = var3.y;
               this.f_7947 = this.xSetting(var4.hand, var4.part).m_8768();
               this.f_7948 = this.ySetting(var4.hand, var4.part).m_8768();
               return true;
            }
         }

         return super.mouseClicked(var1, var2);
      }

      public ViewModel$NhWhpWveQCbOyUER bounds(InteractionHand var1) {
         boolean var2 = var1 == InteractionHand.MAIN_HAND;
         SliderSetting var3 = var2 ? this.f_7938.f_7988 : this.f_7938.f_7992;
         float var4 = this.minecraft.getWindow().getScreenWidth();
         float var5 = this.minecraft.getWindow().getScreenHeight();
         float var6 = var3.m_8768();
         Vector2f var7 = this.f_7938.m_2845(var1);
         float var8 = var7.x * var4;
         float var9 = (1.0F - var7.y) * var5;
         float var10 = f_7972 * var6;
         float var11 = f_7973 * var6;
         return new ViewModel$NhWhpWveQCbOyUER(var1, var8 - var10 * f_7974, var9 - var11 * f_7975, var10, var11);
      }

      public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
         Vector2f var9 = Class_FvJXUGWpZo3zYBW4.m_2693(var1, var3);
         ViewModel$AQBS6FLfnMZtoPGZ var10 = this.hoveredSelection(var9.x, var9.y);
         if (var10 != null) {
            if (var10.hand == InteractionHand.MAIN_HAND) {
               this.f_7949 = Math.clamp(this.f_7949 + (float)var7 * f_7970, this.f_7938.f_7988.m_824(), this.f_7938.f_7988.m_813());
            } else {
               this.f_7950 = Math.clamp(this.f_7950 + (float)var7 * f_7971, this.f_7938.f_7992.m_824(), this.f_7938.f_7992.m_813());
            }

            return true;
         } else {
            return super.mouseScrolled(var1, var3, var5, var7);
         }
      }

      public boolean controlDown() {
         long var1 = this.minecraft.getWindow().handle();
         return GLFW.glfwGetKey(var1, 341) == 1 || GLFW.glfwGetKey(var1, 345) == 1;
      }
   }

   private enum g14Ur6BWKefyEL89 {
      HAND,
      ITEM;
   }
}
