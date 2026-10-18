package dev.dimasik.client.system;

import java.io.IOException;
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

public class Class_4jILs03bXRDH6BlD {
   private static Class_OadJxIIiAHkVgpNi f_2151 = new Class_OadJxIIiAHkVgpNi(
      false,
      0.0F,
      Minecraft.getInstance().player,
      InteractionHand.MAIN_HAND,
      false,
      Class_tjdtKxsAEogQMtun.f_32100,
      0.0F,
      0.0F,
      0.0F,
      false,
      false,
      false,
      false,
      false,
      false,
      ItemStack.EMPTY
   );
   private final Globals f_2152;
   private final LuaValue f_2153;
   private boolean f_2154 = true;
   private final Class_gDV1EanNF5x4bJxz f_2155 = new Class_gDV1EanNF5x4bJxz();
   private final Class_0cYBtbDex02wgqyX f_2156 = new Class_0cYBtbDex02wgqyX();
   private final Class_0LxIerIcmLyypyH2 f_2157 = new Class_0LxIerIcmLyypyH2();
   private final Class_M7uQljRJ3WKrXqme f_2158 = new Class_M7uQljRJ3WKrXqme();
   private final Class_JE9HdjSNyReaEgTo f_2159 = new Class_JE9HdjSNyReaEgTo();
   private final Class_ctzSEzguA718d7QA f_2160 = new Class_ctzSEzguA718d7QA();
   private final Class_U3jQIyqr1iJdwPZl f_2161 = new Class_U3jQIyqr1iJdwPZl();
   private static final String f_2162 = "M";
   private static final String f_2163 = "I";
   private static final String f_2164 = "Items";
   private static final String f_2165 = "Tags";
   private static final String f_2166 = "P";
   private static final String f_2167 = "Easings";
   private static final String f_2168 = "KeyBindManager";
   private static final String f_2169 = "registry";
   private static final String f_2170 = "animator";
   private static final String f_2171 = "debugger";
   private static final String f_2172 = "data";
   private static final String f_2173 = "HMI Lua Runtime error!";

   public Class_4jILs03bXRDH6BlD(String var1) throws IOException {
      this.f_2152 = Class_iMA0e0c9J41cKIUJ.m_7264().f_23624;
      this.f_2152.set(f_2162, Class_6FM5pzADQHSIN2va.m_1533(this.f_2155));
      this.f_2152.set(f_2163, Class_6FM5pzADQHSIN2va.m_1533(this.f_2156));
      this.f_2152.set(f_2164, Class_6FM5pzADQHSIN2va.m_1533(this.f_2157));
      this.f_2152.set(f_2165, Class_6FM5pzADQHSIN2va.m_1533(this.f_2158));
      this.f_2152.set(f_2166, Class_6FM5pzADQHSIN2va.m_1533(this.f_2159));
      this.f_2152.set(f_2167, Class_6FM5pzADQHSIN2va.m_1533(this.f_2160));
      this.f_2152.set(f_2168, Class_6FM5pzADQHSIN2va.m_1533(this.f_2161));
      this.f_2152.set(f_2169, Class_aCVFZK2Td6ftR8d3.m_5906(Class_LRsxqvEkEcBPGPUf.f_10584));
      this.f_2152.set(f_2170, CoerceJavaToLua.coerce(Class_LRsxqvEkEcBPGPUf.f_10586));
      this.f_2152.set(f_2171, CoerceJavaToLua.coerce(Class_LRsxqvEkEcBPGPUf.f_10587));
      this.f_2152.set(f_2172, CoerceJavaToLua.coerce(f_2151));
      this.f_2153 = this.f_2152.load(var1);
   }

   public void m_1366(Class_OadJxIIiAHkVgpNi var1, ItemStack var2, AbstractClientPlayer var3, Class_L855SqSUiZ499WOJ var4) {
      if (this.f_2154) {
         f_2151.m_4069(var1);

         try {
            this.f_2153.call();
         } catch (Exception var6) {
            System.err.println(var6.getMessage() + "");
            SystemToast.addOrUpdate(
               Minecraft.getInstance().gui.toastManager(), SystemToastId.PACK_LOAD_FAILURE, Component.literal(f_2173), Component.literal(var6.getMessage())
            );
            this.f_2154 = false;
         }
      }
   }
}
