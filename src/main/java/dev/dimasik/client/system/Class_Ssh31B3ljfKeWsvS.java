package dev.dimasik.client.system;

import com.mojang.blaze3d.shaders.ShaderSource;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.DimasikClient;
import java.util.ArrayDeque;
import java.util.Deque;
import lombok.Generated;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public final class Class_Ssh31B3ljfKeWsvS {
   private static Matrix4f f_13729 = new Matrix4f();
   private static final Matrix4f f_13730 = new Matrix4f();
   private static final Deque<Class_Ssh31B3ljfKeWsvS.twmb6nxCNTiPRXgd> f_13731 = new ArrayDeque<>();
   private static Matrix4f f_13732;
   private static boolean f_13733 = false;
   private static final Vector4f f_13734 = new Vector4f();
   private static float f_13735 = Class_Ssh31B3ljfKeWsvS.f_13767;
   private static final Deque<Vector4f> f_13736 = new ArrayDeque<>();
   private static final Deque<Boolean> f_13737 = new ArrayDeque<>();
   private static boolean f_13738;
   private static final float f_13739 = 13.0F;
   private static final float f_13740 = 13.0F;
   private static final double f_13741 = 255.0;
   private static final float f_13742 = 13.0F;
   private static final double f_13743 = 255.0;
   private static final float f_13744 = 16.0F;
   private static final float f_13745 = 16.0F;
   private static final float f_13746 = 16.0F;
   private static final double f_13747 = 127.0;
   private static final float f_13748 = 9.0F;
   private static final float f_13749 = 17.0F;
   private static final float f_13750 = 17.0F;
   private static final double f_13751 = 255.0;
   private static final float f_13752 = 2.2F;
   private static final String f_13753 = "*";
   private static final String f_13754 = "*";
   private static final float f_13755 = 0.5F;
   private static final String f_13756 = "*";
   private static final float f_13757 = 0.5F;
   private static final float f_13758 = 255.0F;
   private static final float f_13759 = 255.0F;
   private static final float f_13760 = 255.0F;
   private static final float f_13761 = 255.0F;
   private static final float f_13762 = 0.18F;
   private static final float f_13763 = 12.0F;
   private static final float f_13764 = -1.0F;
   private static final float f_13765 = 255.0F;
   private static final String f_13766 = "This is a utility class and cannot be instantiated";
   private static final float f_13767 = 255.0F;

   public static void m_4799(ShaderSource var0) {
      m_4849().m_8782(var0);
      m_4809().m_7189(var0);
   }

   public static void m_4800(ItemStack var0, float var1, float var2, float var3) {
      m_4851(var0, var1, var2, var3, true);
   }

   public static void m_4801(float var0, float var1, float var2, float var3, float var4, Vector4f var5, int var6) {
      m_4865(var0, var1, var2, var3, var4, var5, new Vector4i(var6));
   }

   private static Class_pkUe8kRLgMvN9wjY m_4802() {
      f_13738 = true;
      return Class_Ssh31B3ljfKeWsvS.Class_7UZsBkIvZl68t795.f_13723;
   }

   public static void m_4803(float var0, float var1, float var2, float var3, float var4, int var5, Identifier var6, FilterMode var7) {
      m_4850(var0, var1, var2, var3, new Vector4f(var4), new Vector4f(1.0F), new Vector4i(var5), var6, var7);
   }

   public static void m_4804(float var0, float var1, float var2, float var3, float var4, Vector4i var5, Identifier var6) {
      m_4855(var0, var1, var2, var3, new Vector4f(var4), new Vector4f(1.0F), var5, var6);
   }

   public static void m_4805(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      m_4819().m_6080(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void m_4806(float var0, float var1, float var2, float var3, float var4, Vector4f var5, int var6, Identifier var7) {
      m_4855(var0, var1, var2, var3, new Vector4f(var4), var5, new Vector4i(var6), var7);
   }

   public static void m_4807(float var0, float var1, float var2, float var3, float var4, Vector4f var5, int var6) {
      m_4852(var0, var1, var2, var3, var4, var5, new Vector4i(var6));
   }

   private static Class_fsjdaxvs66CsdkVr m_4808() {
      return Class_Ssh31B3ljfKeWsvS.xaPGFVAzBwlASXFX.f_13728;
   }

   private static Class_hbNctSdT52MmbYth m_4809() {
      return Class_Ssh31B3ljfKeWsvS.Class_0cOo95F8D8BV7hRE.f_13721;
   }

   public static GpuTextureView m_4810(ItemStack var0, float var1) {
      return m_4802().m_8210(var0, var1);
   }

   @Generated
   private Class_Ssh31B3ljfKeWsvS() {
      throw new UnsupportedOperationException(f_13766);
   }

   private static Matrix4f m_4811(float var0, float var1) {
      float var2 = Class_qyFZUkNc6oUs6ojL.m_8354();
      float var3 = Math.max(1.0F, Class_NzJrN63M7QBpmAbi.f_11537.getWindow().getScreenWidth());
      float var4 = Math.max(1.0F, Class_NzJrN63M7QBpmAbi.f_11537.getWindow().getScreenHeight());
      float var5 = f_13764 + var0 * 2.0F / var3;
      float var6 = 1.0F - var1 * 2.0F / var4;
      return new Matrix4f().translate(var5, var6, 0.0F).scale(var2, var2, 1.0F).translate(-var5, -var6, 0.0F);
   }

   @Generated
   public static boolean m_4812() {
      return f_13733;
   }

   public static void m_4813(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, Vector4i var8) {
      m_4869(var0, var1, var2, var3, new Vector4f(var4, var7, var6, var5), var8);
   }

   public static void m_4814(Matrix4f var0) {
      Matrix4f var1 = var0 == null ? new Matrix4f() : new Matrix4f(var0);
      f_13729 = f_13732 == null ? var1 : new Matrix4f(f_13732).mul(var1);
   }

   public static void m_4815() {
      m_4871();
   }

   public static void m_4816(float var0, float var1, float var2, float var3, Vector4f var4, int var5, Identifier var6) {
      m_4855(var0, var1, var2, var3, var4, new Vector4f(1.0F), new Vector4i(var5), var6);
   }

   public static void m_4817(float var0, float var1, float var2, float var3, float var4, int var5) {
      m_4869(var0, var1, var2, var3, new Vector4f(var4), new Vector4i(var5));
   }

   public static void m_4818(ItemStack var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      m_4802().m_8211(var0, var1, var2, var3, var4, var5, var6);
   }

   private static Class_bdnAhTVnD9avauQV m_4819() {
      return Class_Ssh31B3ljfKeWsvS.WpsviPPl67HXEOqy.f_13725;
   }

   public static void m_4820(ItemStack var0, float var1, float var2, float var3, float var4) {
      m_4802().m_8207(var0, var1, var2, var3, var4);
   }

   @Generated
   public static float m_4821() {
      return f_13735;
   }

   public static void m_4822(float var0, float var1, float var2, float var3) {
      f_13733 = true;
      f_13734.x = var0;
      f_13734.y = var1;
      f_13734.z = var2;
      f_13734.w = var3;
   }

   public static float m_4823(Class_jZQ0pP9BTU3L7miy var0, float var1) {
      return var0.m_7383().m_2158(var1);
   }

   public static void m_4824(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      m_4805(var0, var1, var2, var3, var4, var5, var6, f_13763);
   }

   public static void m_4825(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      m_4869(var0, var1, var2, var3, new Vector4f(var4, var7, var6, var5), new Vector4i(var8));
   }

   public static float m_4826(Class_jZQ0pP9BTU3L7miy var0, String var1, float var2, float var3) {
      return var0.m_7383().m_2153(Class_29BIBbZyd5QWCwS1.m_988(var1), var2, 0.0F, var3);
   }

   public static void m_4827(float var0, float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6, Identifier var7) {
      m_4855(var0, var1, var2, var3, new Vector4f(var4), var5, var6, var7);
   }

   public static void m_4828() {
      if (!f_13736.isEmpty() && !f_13737.isEmpty()) {
         Vector4f var0 = f_13736.pop();
         boolean var1 = f_13737.pop();
         f_13734.set(var0);
         f_13733 = var1;
      } else {
         m_4830();
      }
   }

   public static void m_4829(float var0, float var1, float var2, float var3, float var4, Vector4f var5, int var6, Identifier var7, FilterMode var8) {
      m_4850(var0, var1, var2, var3, new Vector4f(var4), var5, new Vector4i(var6), var7, var8);
   }

   public static void m_4830() {
      f_13733 = false;
   }

   public static void m_4831() {
      if (f_13731.isEmpty()) {
         f_13732 = null;
         f_13729 = new Matrix4f();
      } else {
         Class_Ssh31B3ljfKeWsvS.twmb6nxCNTiPRXgd var0 = f_13731.pop();
         f_13729 = var0.matrix();
         f_13732 = var0.transform();
      }
   }

   public static void m_4832(GuiGraphicsExtractor var0, ItemStack var1, float var2, float var3, float var4, boolean var5) {
      m_4851(var1, var2, var3, var4, var5);
   }

   public static void m_4833(GuiGraphicsExtractor var0, ItemStack var1, float var2, float var3, float var4) {
      m_4832(var0, var1, var2, var3, var4, true);
   }

   @Generated
   public static Vector4f m_4834() {
      return f_13734;
   }

   public static void m_4835(float var0, float var1, float var2, int var3) {
      float var4 = var2 * f_13752;
      Class_jZQ0pP9BTU3L7miy var5 = Class_y1y6QpONhWEUIdEB.m_9591();
      float var6 = var5.m_7383().m_2157(f_13753, var4, 0.0F);
      m_4857(var5, f_13754, var0 - var6 * f_13755, m_4863(var5, f_13756, var1, var4), var4, var3, 0.0F, f_13757, 1.0F);
   }

   private static Class_DciMSjssCmaKqGks m_4836() {
      return Class_Ssh31B3ljfKeWsvS.alefgdaxFLpv0nTa.f_13726;
   }

   public static void m_4837(float var0, float var1, float var2, float var3, float var4, float var5, Vector4i var6) {
      m_4865(var0, var1, var2, var3, var4, new Vector4f(var5), var6);
   }

   public static void m_4838(float var0, float var1, float var2, float var3, float var4, int var5, Identifier var6) {
      m_4855(var0, var1, var2, var3, new Vector4f(var4), new Vector4f(1.0F), new Vector4i(var5), var6);
   }

   public static float m_4839(Class_jZQ0pP9BTU3L7miy var0, float var1, float var2) {
      return var1 - var0.m_7383().m_2156(var2);
   }

   public static void m_4840(float var0, float var1, float var2, float var3, float var4, float var5) {
      m_4836().m_2479(var0, var1, var2, var3, var4, var5);
   }

   private static Class_l7RblaJ97qNJ37Fu m_4841() {
      return Class_Ssh31B3ljfKeWsvS.Class_35so8gRu6iLuHaV6.f_13722;
   }

   public static void m_4842(float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5, Identifier var6) {
      m_4855(var0, var1, var2, var3, var4, new Vector4f(1.0F), var5, var6);
   }

   public static void m_4843(float var0, float var1, float var2, float var3, float var4, Vector4i var5) {
      m_4869(var0, var1, var2, var3, new Vector4f(var4), var5);
   }

   public static void m_4844() {
      f_13735 = f_13765;
   }

   private static void m_4845(ItemStack var0, float var1, float var2, float var3) {
      if (var0.isBarVisible()) {
         int var4 = var0.getBarColor();
         m_4817(var1 + 2.0F * var3, var2 + f_13739 * var3, f_13740 * var3, 2.0F * var3, 0.0F, Class_BftdentXEtGbugJw.m_2303(0, 0, 0, f_13741));
         m_4817(
            var1 + 2.0F * var3,
            var2 + f_13742 * var3,
            var0.getBarWidth() * var3,
            var3,
            0.0F,
            Class_BftdentXEtGbugJw.m_2303(var4 >> 16 & 0xFF, var4 >> 8 & 0xFF, var4 & 0xFF, f_13743)
         );
      }

      if (Class_NzJrN63M7QBpmAbi.f_11537.player != null) {
         float var7 = Class_NzJrN63M7QBpmAbi.f_11537
            .player
            .getCooldowns()
            .getCooldownPercent(var0, Class_NzJrN63M7QBpmAbi.f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
         if (var7 > 0.0F) {
            m_4817(
               var1, var2 + f_13744 * var3 * (1.0F - var7), f_13745 * var3, f_13746 * var3 * var7, 0.0F, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_13747)
            );
         }
      }

      if (var0.getCount() != 1) {
         String var8 = String.valueOf(var0.getCount());
         int var5 = Math.max(7, Math.round(f_13748 * var3));
         float var6 = m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var8, var5);
         m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var8,
            var1 + f_13749 * var3 - var6,
            var2 + f_13750 * var3 - var5,
            var5,
            Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_13751)
         );
      }
   }

   public static void m_4846(float var0, float var1) {
      if (f_13732 != null) {
         f_13732 = m_4811(var0, var1);
         f_13729 = new Matrix4f(f_13732);
      }
   }

   public static float m_4847(Class_jZQ0pP9BTU3L7miy var0, String var1, int var2) {
      return var0.m_7383().m_2157(Class_29BIBbZyd5QWCwS1.m_988(var1), var2, 0.0F);
   }

   public static void m_4848(float var0, float var1, float var2, float var3, float var4) {
      boolean var5 = Class_oDLvT3Io61u7HRHc.m_7743();
      boolean var6 = DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6157().m_8768();
      if (!var5 && var6) {
         m_4859(var0, var1, var2, var3, var4 * 2.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW));
      }

      if (var5) {
         Class_oDLvT3Io61u7HRHc.m_7747(var0, var1, var2, var3, var4);
      } else {
         Class_oDLvT3Io61u7HRHc.m_7742(var0, var1, var2, var3, var4, false);
      }
   }

   private static Class_t2AosHpvQKqedDqw m_4849() {
      return Class_Ssh31B3ljfKeWsvS.Th18GhKvNaoxm8eK.f_13724;
   }

   public static void m_4850(float var0, float var1, float var2, float var3, Vector4f var4, Vector4f var5, Vector4i var6, Identifier var7, FilterMode var8) {
      m_4808().m_6686(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void m_4851(ItemStack var0, float var1, float var2, float var3, boolean var4) {
      if (!var0.isEmpty()) {
         m_4802().m_8218(var0, var1, var2, var3);
         if (var4) {
            m_4845(var0, var1, var2, var3);
         }
      }
   }

   public static void m_4852(float var0, float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6) {
      m_4841().m_7487(var0, var1, var2, var3, var4, var5, var6);
   }

   @Generated
   public static Matrix4f m_4853() {
      return f_13729;
   }

   public static void m_4854(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      m_4852(var0, var1, var2, var3, var4, new Vector4f(var5), new Vector4i(var6));
   }

   public static void m_4855(float var0, float var1, float var2, float var3, Vector4f var4, Vector4f var5, Vector4i var6, Identifier var7) {
      m_4808().m_6687(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void m_4856(Class_jZQ0pP9BTU3L7miy var0, int var1, float var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9) {
      m_4809().m_7184(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void m_4857(Class_jZQ0pP9BTU3L7miy var0, String var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8) {
      m_4809().m_7191(var0, Class_29BIBbZyd5QWCwS1.m_988(var1), var2, var3, var4, var5, var6, var7, var8);
   }

   public static void m_4858(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      m_4865(var0, var1, var2, var3, var4, new Vector4f(var5), new Vector4i(var6));
   }

   public static void m_4859(float var0, float var1, float var2, float var3, float var4, int var5) {
      m_4874(var0, var1, var2, var3, new Vector4f(var4), var5);
   }

   public static void m_4860(float var0, float var1, float var2, float var3) {
      f_13737.push(f_13733);
      f_13736.push(new Vector4f(f_13734));
      if (f_13733) {
         float var4 = Math.max(f_13734.x, var0);
         float var5 = Math.max(f_13734.y, var1);
         float var6 = Math.min(f_13734.x + f_13734.z, var0 + var2);
         float var7 = Math.min(f_13734.y + f_13734.w, var1 + var3);
         m_4822(var4, var5, Math.max(0.0F, var6 - var4), Math.max(0.0F, var7 - var5));
      } else {
         m_4822(var0, var1, var2, var3);
      }
   }

   public static void m_4861(Class_jZQ0pP9BTU3L7miy var0, String var1, float var2, float var3, float var4, int var5, int var6, float var7) {
      m_4809().m_7187(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void m_4862(float var0, float var1) {
      f_13731.push(new Class_Ssh31B3ljfKeWsvS.twmb6nxCNTiPRXgd(new Matrix4f(f_13729), f_13732 == null ? null : new Matrix4f(f_13732)));
      f_13732 = m_4811(var0, var1);
      f_13729 = new Matrix4f(f_13732);
   }

   public static float m_4863(Class_jZQ0pP9BTU3L7miy var0, String var1, float var2, float var3) {
      return var2 - var0.m_7383().m_2154(var1, var3);
   }

   public static void m_4864(float var0) {
      f_13735 = var0;
   }

   public static void m_4865(float var0, float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6) {
      Class_fuGrtM7rHAJXPau4.f_20770.m_6740(var0, var1, var2, var3);
      m_4875().m_1491(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void m_4866(Class_jZQ0pP9BTU3L7miy var0, String var1, float var2, float var3, int var4, int var5) {
      m_4809().m_7197(var0, Class_29BIBbZyd5QWCwS1.m_988(var1), var2, var3, var4, var5);
   }

   public static void m_4867() {
      if (f_13738) {
         Class_Ssh31B3ljfKeWsvS.Class_7UZsBkIvZl68t795.f_13723.m_8217();
      }
   }

   public static void m_4868(float var0, float var1, float var2, float var3, Vector4f var4, Vector4f var5, int var6, Identifier var7) {
      m_4855(var0, var1, var2, var3, var4, var5, new Vector4i(var6), var7);
   }

   public static void m_4869(float var0, float var1, float var2, float var3, Vector4f var4, Vector4i var5) {
      Class_fuGrtM7rHAJXPau4.f_20770.m_6740(var0, var1, var2, var3);
      m_4849().m_8783(var0, var1, var2, var3, var4, var5);
   }

   public static void m_4870(float var0, float var1, float var2, float var3, Vector4f var4, int var5) {
      m_4869(var0, var1, var2, var3, var4, new Vector4i(var5));
   }

   public static void m_4871() {
      f_13731.clear();
      f_13732 = null;
      f_13729 = new Matrix4f();
   }

   public static void m_4872(float var0, float var1, float var2, float var3, float var4, float var5, Vector4i var6) {
      m_4852(var0, var1, var2, var3, var4, new Vector4f(var5), var6);
   }

   public static void m_4873(Class_jZQ0pP9BTU3L7miy var0, Component var1, float var2, float var3, int var4, int var5) {
      m_4809().m_7198(var0, Class_29BIBbZyd5QWCwS1.m_933(var1), var2, var3, var4, var5);
   }

   public static void m_4874(float var0, float var1, float var2, float var3, Vector4f var4, int var5) {
      float var6 = Math.max(Math.max(var4.x, var4.y), Math.max(var4.z, var4.w));
      if (!(var2 <= 0.0F) && !(var3 <= 0.0F) && !(var6 <= 0.0F)) {
         Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var5);
         int var8 = (int)(var7.x * f_13758);
         int var9 = (int)(var7.y * f_13759);
         int var10 = (int)(var7.z * f_13760);
         float var11 = var7.w * f_13761;

         for (int var12 = (int)var6; var12 > 0; var12 -= 2) {
            float var13 = 1.0F - var12 / var6;
            int var14 = (int)(var11 * f_13762 * var13 * var13);
            if (var14 > 0) {
               int var15 = Class_BftdentXEtGbugJw.m_2303(var8, var9, var10, var14);
               float var16 = var12;
               m_4849()
                  .m_8783(
                     var0 - var16,
                     var1 - var16,
                     var2 + var16 * 2.0F,
                     var3 + var16 * 2.0F,
                     new Vector4f(var4).add(var16, var16, var16, var16),
                     new Vector4i(var15)
                  );
            }
         }
      }
   }

   private static Class_5cosmb3NJrfL8IQe m_4875() {
      return Class_Ssh31B3ljfKeWsvS.pU05Aopo8zlb9Y6n.f_13727;
   }

   private static final class Class_0cOo95F8D8BV7hRE {
      public static final Class_hbNctSdT52MmbYth f_13721 = new Class_hbNctSdT52MmbYth();

      public Class_0cOo95F8D8BV7hRE() {
      }
   }

   private static final class Class_35so8gRu6iLuHaV6 {
      public static final Class_l7RblaJ97qNJ37Fu f_13722 = new Class_l7RblaJ97qNJ37Fu();

      public Class_35so8gRu6iLuHaV6() {
      }
   }

   private static final class Class_7UZsBkIvZl68t795 {
      public static final Class_pkUe8kRLgMvN9wjY f_13723 = new Class_pkUe8kRLgMvN9wjY();

      public Class_7UZsBkIvZl68t795() {
      }
   }

   private static final class Th18GhKvNaoxm8eK {
      public static final Class_t2AosHpvQKqedDqw f_13724 = new Class_t2AosHpvQKqedDqw();

      public Th18GhKvNaoxm8eK() {
      }
   }

   private static final class WpsviPPl67HXEOqy {
      public static final Class_bdnAhTVnD9avauQV f_13725 = new Class_bdnAhTVnD9avauQV();

      public WpsviPPl67HXEOqy() {
      }
   }

   private static final class alefgdaxFLpv0nTa {
      public static final Class_DciMSjssCmaKqGks f_13726 = new Class_DciMSjssCmaKqGks();

      public alefgdaxFLpv0nTa() {
      }
   }

   private static final class pU05Aopo8zlb9Y6n {
      public static final Class_5cosmb3NJrfL8IQe f_13727 = new Class_5cosmb3NJrfL8IQe();

      public pU05Aopo8zlb9Y6n() {
      }
   }

   private record twmb6nxCNTiPRXgd(Matrix4f matrix, Matrix4f transform) {
   }

   private static final class xaPGFVAzBwlASXFX {
      public static final Class_fsjdaxvs66CsdkVr f_13728 = new Class_fsjdaxvs66CsdkVr();

      public xaPGFVAzBwlASXFX() {
      }
   }
}
