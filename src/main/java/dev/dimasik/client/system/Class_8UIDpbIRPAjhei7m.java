package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ClientManagerRegistry;
import dev.dimasik.client.module.render.Hud;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class Class_8UIDpbIRPAjhei7m extends Class_4DhobBIM8lTNckKj implements Class_NzJrN63M7QBpmAbi {
   private static final float f_4056 = 16.0F;
   private static final List<Class_oRlzNKqPjTwmgkNL> f_4057 = new LinkedList<>();
   private final ArrayList<Class_oRlzNKqPjTwmgkNL> f_4058 = new ArrayList<>(10);
   private boolean f_4059;
   private final Class_bYDeIFrnJe97cH9q f_4060 = new Class_bYDeIFrnJe97cH9q();
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4061 = this::m_1797;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_4062 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
      @Override
      public int m_1780() {
         return -90;
      }

      public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
         Class_8UIDpbIRPAjhei7m.this.m_1789(var1);
      }
   };
   private static final String f_4063 = "Уведомления";
   private static final long f_4064 = 3500L;
   private static final String f_4065 = "Уведомления";
   private static final double f_4066 = Double.MAX_VALUE;
   private static final double f_4067 = 16.0;
   private static final double f_4068 = 16.0;
   private static final String f_4069 = "TNT рядом — расстояние %.1f блоков, взорвётся через %.1f сек.";
   private static final float f_4070 = 20.0F;
   private static final String f_4071 = "Уведомления";
   private static final float f_4072 = 0.001F;
   private static final float f_4073 = 36.0F;
   private static final float f_4074 = 4.0F;
   private static final float f_4075 = 0.001F;
   private static final float f_4076 = 36.0F;
   private static final float f_4077 = 36.0F;
   private static final float f_4078 = 0.5F;

   private static void m_1782(Class_oRlzNKqPjTwmgkNL var0) {
      m_1793(var0, Class_MP0Q3Izlf2HSndyS.OTHER);
   }

   public static boolean m_1783(Class_MP0Q3Izlf2HSndyS var0) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883() && f_11537.player != null && f_11537.level != null) {
         ClientManagerRegistry var1 = DimasikClient.m_9057().m_9049();
         if (var1 == null) {
            return false;
         }

         Hud var2 = var1.m_2801().m_3433();
         return var2.m_776() && var2.m_6177().m_7145(f_4063) && var0.m_3887(var2.m_6159());
      } else {
         return false;
      }
   }

   public static void m_1784(String var0, Component var1, int var2, Class_MP0Q3Izlf2HSndyS var3) {
      if (m_1783(var3)) {
         m_1793(new Class_3q8kKNGNpsKuAxlp(var0, var1, var2), var3);
      }
   }

   public static void m_1786(String var0, String var1, String var2, int var3) {
      m_1792(var0, var1, var3);
   }

   public static void m_1787(String var0, Component var1, int var2) {
      m_1782(new Class_3q8kKNGNpsKuAxlp(var0, var1, var2));
   }

   public static void m_1788(Component var0, ItemStack var1, int var2) {
      m_1791(var0, var1, var2, Class_MP0Q3Izlf2HSndyS.OTHER);
   }

   public void m_1789(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.getWindow() != null) {
         ClientManagerRegistry var2 = DimasikClient.m_9057().m_9049();
         if (var2 != null) {
            Class_ND5nzva71juYlk72 var3 = var2.m_2808().m_5380();
            Hud var4 = var2.m_2801().m_3433();
            if (!Class_HKVFPtZz5yGHYty6.m_2883() && f_11537.player != null && f_11537.level != null && var4.m_776() && var4.m_6177().m_7145(f_4071)) {
               synchronized (f_4057) {
                  f_4057.removeIf(var1x -> !var1x.m_7758().m_3887(var4.m_6159()) || var1x.m_7760() && var1x.m_7759().m_9280());
                  this.f_4058.clear();
                  this.f_4058.addAll(f_4057);
               }

               var3.m_4002();
               Class_oRlzNKqPjTwmgkNL var22 = var3.m_3996();
               Class_oRlzNKqPjTwmgkNL var6 = var3.m_4001();
               float var7 = var22 == null ? 0.0F : var22.m_1322();
               if (var6 != null && var6.m_7759().m_9288() > f_4072) {
                  var7 = Math.max(var7, var6.m_1322());
               }

               for (Class_oRlzNKqPjTwmgkNL var9 : this.f_4058) {
                  var7 = Math.max(var7, var9.m_1322());
               }

               int var23 = this.f_4058.size() + (var22 == null ? 0 : 1);
               var3.m_4012(var7);
               var3.m_4007(var23 == 0 ? 0.0F : var23 * f_4073 - f_4074);
               if (var23 != 0) {
                  float var24 = Class_qyFZUkNc6oUs6ojL.m_8354();
                  float var10 = var3.m_3993();
                  float var11 = 0.0F;
                  Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

                  try {
                     if (var22 != null) {
                        if (var6 != null && var6.m_7759().m_9288() > f_4075) {
                           this.m_1790(var6, var10, var24, var11);
                        }

                        this.m_1790(var22, var10, var24, var11);
                        var11 += f_4076;
                     }

                     for (Class_oRlzNKqPjTwmgkNL var13 : this.f_4058) {
                        this.m_1790(var13, var10, var24, var11);
                        var11 += f_4077;
                     }
                  } finally {
                     Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
                     Class_oDLvT3Io61u7HRHc.m_7739();
                  }
               }
            } else {
               synchronized (f_4057) {
                  f_4057.clear();
               }

               var3.m_4012(0.0F);
               var3.m_4007(0.0F);
               var3.m_1333();
            }
         }
      }
   }

   private void m_1790(Class_oRlzNKqPjTwmgkNL var1, float var2, float var3, float var4) {
      float var5 = (f_11537.getWindow().getScreenWidth() - var1.m_1322() * var3) * f_4078;
      Class_Ssh31B3ljfKeWsvS.m_4862(var5, var2);

      try {
         var1.m_1323(var5, var2, var4);
      } finally {
         Class_Ssh31B3ljfKeWsvS.m_4831();
      }
   }

   public static void m_1791(Component var0, ItemStack var1, int var2, Class_MP0Q3Izlf2HSndyS var3) {
      if (m_1783(var3)) {
         m_1793(new Class_3q8kKNGNpsKuAxlp("", var0, var2, var1, f_4064), var3);
      }
   }

   public static void m_1792(String var0, String var1, int var2) {
      m_1782(new Class_3q8kKNGNpsKuAxlp(var0, var1, var2));
   }

   private static void m_1793(Class_oRlzNKqPjTwmgkNL var0, Class_MP0Q3Izlf2HSndyS var1) {
      if (m_1783(var1)) {
         var0.m_7764(var1);
         synchronized (f_4057) {
            f_4057.add(0, var0);

            for (int var3 = 10; var3 < f_4057.size(); var3++) {
               f_4057.get(var3).m_7756();
            }
         }
      }
   }

   public static boolean m_1794() {
      return !f_4057.isEmpty();
   }

   public static void m_1796(String var0, Component var1, String var2, int var3, ItemStack var4) {
      m_1782(new Class_3q8kKNGNpsKuAxlp(var0, var1, var3, var4));
   }

   private void m_1797(Class_Xu9btcIeUN33XnMK var1) {
      if (Class_HKVFPtZz5yGHYty6.m_2883()) {
         this.f_4059 = false;
         this.f_4060.m_6079();
      } else if (f_11537.player != null && f_11537.level != null) {
         Hud var2 = DimasikClient.m_9057().m_9049().m_2801().m_3433();
         if (var2.m_776() && var2.m_6177().m_7145(f_4065)) {
            this.f_4060.m_6077(f_11537.player, m_1783(Class_MP0Q3Izlf2HSndyS.ARMOR), m_1783(Class_MP0Q3Izlf2HSndyS.EFFECTS));
            if (!m_1783(Class_MP0Q3Izlf2HSndyS.TNT)) {
               this.f_4059 = false;
            } else {
               PrimedTnt var3 = null;
               double var4 = f_4066;

               for (PrimedTnt var7 : f_11537.level.getEntitiesOfClass(PrimedTnt.class, f_11537.player.getBoundingBox().inflate(f_4067), var0 -> true)) {
                  double var8 = var7.distanceTo(f_11537.player);
                  if (!(var8 > f_4068) && !(var8 >= var4)) {
                     var3 = var7;
                     var4 = var8;
                  }
               }

               if (var3 == null) {
                  this.f_4059 = false;
               } else {
                  if (!this.f_4059) {
                     this.f_4059 = true;
                     String var10 = String.format(Locale.ROOT, f_4069, var4, Math.max(0, var3.getFuse()) / f_4070);
                     m_1791(Component.literal(var10), new ItemStack(Items.TNT), Class_BftdentXEtGbugJw.m_2310(255, 55, 55), Class_MP0Q3Izlf2HSndyS.TNT);
                  }
               }
            }
         } else {
            this.f_4059 = false;
            this.f_4060.m_6079();
         }
      } else {
         this.f_4059 = false;
         this.f_4060.m_6079();
      }
   }

   public static void m_1798(String var0, Component var1, String var2, int var3) {
      m_1787(var0, var1, var3);
   }
}
