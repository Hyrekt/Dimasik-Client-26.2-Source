package dev.dimasik.client.system;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;

public final class Class_PKdQIwbr1ubGwinO {
   private final long f_11677;
   private final String f_11678;
   private final String f_11679;
   private final String f_11680;
   private final String f_11681;
   private final String f_11682;
   private final String f_11683;
   private final boolean f_11684;
   private final boolean f_11685;
   private final long f_11686;
   private final long f_11687;
   private final List<Class_Hh3sghUzXbE4iX4W> f_11688;
   private static final String f_11689 = "Singleplayer";

   public String m_4112() {
      return this.f_11679;
   }

   public String m_4113() {
      return this.f_11681;
   }

   public Class_PKdQIwbr1ubGwinO(
      long var1,
      String var3,
      String var4,
      String var5,
      String var6,
      String var7,
      String var8,
      boolean var9,
      boolean var10,
      long var11,
      long var13,
      List<Class_Hh3sghUzXbE4iX4W> var15
   ) {
      this.f_11677 = var1;
      this.f_11678 = var3;
      this.f_11679 = var4;
      this.f_11680 = var5;
      this.f_11681 = var6;
      this.f_11682 = var7;
      this.f_11683 = var8;
      this.f_11684 = var9;
      this.f_11685 = var10;
      this.f_11686 = var11;
      this.f_11687 = var13;
      this.f_11688 = List.copyOf(var15);
   }

   public String m_4114() {
      return this.f_11678;
   }

   public String m_4115(Minecraft var1) {
      if (!this.f_11685) {
         return this.f_11679;
      } else {
         String var2 = this.m_4123(var1);
         if (Class_Hh3sghUzXbE4iX4W.m_2903(var2)) {
            return this.f_11679;
         } else {
            return Class_Hh3sghUzXbE4iX4W.m_2903(this.f_11679) ? var2 : this.f_11679;
         }
      }
   }

   public String m_4116() {
      return this.f_11682;
   }

   public boolean m_4117() {
      return this.f_11677 > 0L;
   }

   public long m_4118() {
      return this.f_11686;
   }

   public long m_4119() {
      return this.f_11687;
   }

   public String m_4120() {
      return this.f_11680;
   }

   public String m_4121() {
      return this.f_11683;
   }

   public List<Class_Hh3sghUzXbE4iX4W> m_4122() {
      return this.f_11688;
   }

   private String m_4123(Minecraft var1) {
      if (var1 == null || var1.level == null) {
         return "";
      }

      if (var1.isLocalServer()) {
         return f_11689;
      }

      if (var1.getConnection() == null) {
         return "";
      }

      ServerData var2 = var1.getConnection().getServerData();
      return var2 == null ? "" : var2.ip;
   }

   public long m_4124() {
      return this.f_11677;
   }

   public boolean m_4125() {
      return this.f_11684;
   }
}
