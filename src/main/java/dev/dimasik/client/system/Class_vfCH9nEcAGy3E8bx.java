package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.toasts.SystemToast;
import net.minecraft.client.gui.components.toasts.SystemToast.SystemToastId;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class_vfCH9nEcAGy3E8bx {
   public static int f_34161 = 9;
   private final Globals f_34162;
   private final LuaValue f_34163;
   private boolean f_34164 = true;
   private static final Class_pNZUeJT4ClWcdqmd f_34165 = new Class_pNZUeJT4ClWcdqmd();
   private final Class_gDV1EanNF5x4bJxz f_34166 = new Class_gDV1EanNF5x4bJxz();
   private final Class_0cYBtbDex02wgqyX f_34167 = new Class_0cYBtbDex02wgqyX();
   private final Class_8Uzh3C9hy9xY2P3a f_34168 = new Class_8Uzh3C9hy9xY2P3a();
   private final Class_0LxIerIcmLyypyH2 f_34169 = new Class_0LxIerIcmLyypyH2();
   private final Class_M7uQljRJ3WKrXqme f_34170 = new Class_M7uQljRJ3WKrXqme();
   private final Class_JE9HdjSNyReaEgTo f_34171 = new Class_JE9HdjSNyReaEgTo();
   private final Class_ctzSEzguA718d7QA f_34172 = new Class_ctzSEzguA718d7QA();
   private final Class_U3jQIyqr1iJdwPZl f_34173 = new Class_U3jQIyqr1iJdwPZl();
   private final Class_ovy1AInkwJ2AwJ25 f_34174 = new Class_ovy1AInkwJ2AwJ25();
   private final Class_OOEb4m1v3GtDo8h8 f_34175 = new Class_OOEb4m1v3GtDo8h8();
   private final Class_jj0Ru6m7Bx7aGp7g f_34176 = new Class_jj0Ru6m7Bx7aGp7g();
   private static final String f_34177 = "M";
   private static final String f_34178 = "I";
   private static final String f_34179 = "Texture";
   private static final String f_34180 = "Items";
   private static final String f_34181 = "Tags";
   private static final String f_34182 = "P";
   private static final String f_34183 = "Easings";
   private static final String f_34184 = "KeyBindManager";
   private static final String f_34185 = "S";
   private static final String f_34186 = "C";
   private static final String f_34187 = "particleManager";
   private static final String f_34188 = "swingSpeed";
   private static final String f_34189 = "registry";
   private static final String f_34190 = "renderAsBlock";
   private static final String f_34191 = "translateItem";
   private static final String f_34192 = "itemSwingSpeed";
   private static final String f_34193 = "animator";
   private static final String f_34194 = "renderAsBlock";
   private static final String f_34195 = "translateItem";
   private static final String f_34196 = "itemSwingSpeed";
   private static final String f_34197 = "useDuration";
   private static final String f_34198 = "usingItem";
   private static final String f_34199 = "debugger";
   private static final String f_34200 = "applyBlockRotation";
   private static final String f_34201 = "context";
   private static final String f_34202 = "HMI Lua Runtime error!";

   public void m_9259(
      PoseStack var1,
      boolean var2,
      HashMap<String, Object> var3,
      float var4,
      ItemStack var5,
      AbstractClientPlayer var6,
      InteractionHand var7,
      boolean var8,
      float var9,
      float var10,
      float var11,
      float var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16,
      boolean var17,
      boolean var18,
      List<Class_uGNFApwy8sUjPdk5> var19
   ) {
      if (this.f_34164) {
         f_34165.m_8046(var1, var2, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);

         try {
            this.f_34163.invoke();
         } catch (Exception var21) {
            System.err.println(var21.getMessage() + "");
            SystemToast.addOrUpdate(
               Minecraft.getInstance().gui.toastManager(), SystemToastId.PACK_LOAD_FAILURE, Component.literal(f_34202), Component.literal(var21.getMessage())
            );
            this.f_34164 = false;
         }
      }
   }

   public Class_vfCH9nEcAGy3E8bx(String var1) throws IOException {
      this.f_34162 = Class_iMA0e0c9J41cKIUJ.m_7264().f_23624;
      this.f_34162.set(f_34177, Class_6FM5pzADQHSIN2va.m_1533(this.f_34166));
      this.f_34162.set(f_34178, Class_6FM5pzADQHSIN2va.m_1533(this.f_34167));
      this.f_34162.set(f_34179, Class_6FM5pzADQHSIN2va.m_1533(this.f_34168));
      this.f_34162.set(f_34180, Class_6FM5pzADQHSIN2va.m_1533(this.f_34169));
      this.f_34162.set(f_34181, Class_6FM5pzADQHSIN2va.m_1533(this.f_34170));
      this.f_34162.set(f_34182, Class_6FM5pzADQHSIN2va.m_1533(this.f_34171));
      this.f_34162.set(f_34183, Class_6FM5pzADQHSIN2va.m_1533(this.f_34172));
      this.f_34162.set(f_34184, Class_6FM5pzADQHSIN2va.m_1533(this.f_34173));
      this.f_34162.set(f_34185, Class_6FM5pzADQHSIN2va.m_1533(this.f_34174));
      this.f_34162.set(f_34186, Class_6FM5pzADQHSIN2va.m_1533(this.f_34175));
      this.f_34162.set(f_34187, Class_6FM5pzADQHSIN2va.m_1533(this.f_34176));
      this.f_34162.set(f_34188, LuaValue.valueOf(f_34161));
      this.f_34162.set(f_34189, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10584));
      this.f_34162.set(f_34190, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10578));
      this.f_34162.set(f_34191, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10579));
      this.f_34162.set(f_34192, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10581));
      this.f_34162.set(f_34193, CoerceJavaToLua.coerce(Class_LRsxqvEkEcBPGPUf.f_10586));
      this.f_34162.set(f_34194, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10578));
      this.f_34162.set(f_34195, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10579));
      this.f_34162.set(f_34196, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10581));
      this.f_34162.set(f_34197, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10582));
      this.f_34162.set(f_34198, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10583));
      this.f_34162.set(f_34199, CoerceJavaToLua.coerce(Class_LRsxqvEkEcBPGPUf.f_10587));
      this.f_34162.set(f_34200, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10580));
      this.f_34162.set(f_34201, CoerceJavaToLua.coerce(f_34165));
      this.f_34163 = this.f_34162.load(var1);
   }
}
