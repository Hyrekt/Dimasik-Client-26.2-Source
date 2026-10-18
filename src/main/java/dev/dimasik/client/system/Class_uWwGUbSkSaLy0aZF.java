package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Map.Entry;
import lombok.Generated;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_uWwGUbSkSaLy0aZF extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private static final int f_33007 = 72000;
   private final Class_w8fCJQ5ZtH5lQbWc f_33008;
   private final Class_w8fCJQ5ZtH5lQbWc f_33009;
   private final Class_w8fCJQ5ZtH5lQbWc f_33010;
   private final Class_w8fCJQ5ZtH5lQbWc f_33011;
   private final Map<Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA, Class_w8fCJQ5ZtH5lQbWc[]> f_33012;
   private final Map<Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA, Class_w8fCJQ5ZtH5lQbWc[]> f_33013;
   private final Map<Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA, Integer> f_33014;
   private final List<Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA> f_33015;
   private final Random f_33016;
   private long f_33017;
   private final MultiChoiceSetting f_33018;
   private final Class_u8iL1f1cFf6CucWB f_33019;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_33020;
   private static final String f_33021 = "Potions";
   private static final float f_33022 = 691.0F;
   private static final float f_33023 = 801.0F;
   private static final float f_33024 = 120.0F;
   private static final float f_33025 = 35.0F;
   private static final float f_33026 = 15.0F;
   private static final float f_33027 = 15.0F;
   private static final float f_33028 = 10.0F;
   private static final float f_33029 = 10.0F;
   private static final String f_33030 = "Potions";
   private static final String f_33031 = "Вид";
   private static final String f_33032 = "Активные зелья";
   private static final String f_33033 = "2";
   private static final float f_33034 = 0.001F;
   private static final int f_33035 = 72000;
   private static final String f_33036 = "**:**";
   private static final String f_33037 = "%d:%02d";
   private static final float f_33038 = 13.0F;
   private static final float f_33039 = 13.0F;
   private static final float f_33040 = 13.0F;
   private static final float f_33041 = 95.0F;
   private static final float f_33042 = 50.0F;
   private static final float f_33043 = 255.0F;
   private static final float f_33044 = 12.0F;
   private static final float f_33045 = 33.0F;
   private static final float f_33046 = 10.0F;
   private static final float f_33047 = 0.01F;
   private static final float f_33048 = 0.5F;
   private static final float f_33049 = 0.5F;
   private static final double f_33050 = 700.0;
   private static final float f_33051 = 0.55F;
   private static final float f_33052 = 10.0F;
   private static final float f_33053 = 33.0F;
   private static final float f_33054 = 20.0F;
   private static final float f_33055 = 1.4F;
   private static final String f_33056 = "E";
   private static final float f_33057 = 10.0F;
   private static final float f_33058 = 8.0F;
   private static final String f_33059 = "Potions";
   private static final float f_33060 = 32.0F;
   private static final float f_33061 = 9.0F;
   private static final float f_33062 = 15.0F;
   private static final float f_33063 = -10.0F;
   private static final float f_33064 = 15.0F;
   private static final float f_33065 = 20.0F;
   private static final float f_33066 = 15.0F;
   private static final float f_33067 = 20.0F;
   private static final float f_33068 = -10.0F;
   private static final float f_33069 = 36.0F;
   private static final int f_33070 = 72000;
   private static final String f_33071 = "**:**";
   private static final String f_33072 = "%d:%02d";
   private static final String f_33073 = "effect.minecraft.";
   private static final String f_33074 = "effect.";
   private static final String f_33075 = "minecraft";
   private static final float f_33076 = 255.0F;
   private static final float f_33077 = 10.0F;
   private static final float f_33078 = 2.5F;
   private static final float f_33079 = 16.0F;
   private static final float f_33080 = 16.0F;
   private static final float f_33081 = 30.0F;
   private static final float f_33082 = 2.5F;
   private static final float f_33083 = 30.0F;
   private static final float f_33084 = 13.0F;
   private static final float f_33085 = 2.5F;
   private static final float f_33086 = 10.0F;
   private static final float f_33087 = 13.0F;
   private static final float f_33088 = 2.5F;
   private static final float f_33089 = 36.0F;
   private static final float f_33090 = 39.0F;
   private static final float f_33091 = 5.0F;
   private static final float f_33092 = 15.0F;
   private static final float f_33093 = -8.0F;
   private static final float f_33094 = 15.0F;
   private static final float f_33095 = 15.0F;
   private static final float f_33096 = -8.0F;
   private static final float f_33097 = 0.01F;
   private static final float f_33098 = 255.0F;
   private static final float f_33099 = 0.01F;
   private static final float f_33100 = 255.0F;
   private static final float f_33101 = 16.0F;
   private static final float f_33102 = 30.0F;
   private static final float f_33103 = 14.0F;
   private static final float f_33104 = 14.0F;
   private static final String f_33105 = "effect.minecraft.";
   private static final String f_33106 = "effect.";
   private static final String f_33107 = "minecraft";
   private static final float f_33108 = 37.0F;
   private static final float f_33109 = 12.0F;
   private static final float f_33110 = 13.0F;
   private static final float f_33111 = 13.0F;
   private static final float f_33112 = 20.0F;
   private static final float f_33113 = 24.0F;
   private static final float f_33114 = 13.5F;
   private static final int f_33115 = 72000;
   private static final float f_33116 = 255.0F;
   private static final float f_33117 = 12.0F;
   private static final float f_33118 = 11.5F;
   private static final float f_33119 = 18.0F;
   private static final float f_33120 = 18.0F;
   private static final double f_33121 = 255.0;
   private static final float f_33122 = 12.0F;
   private static final float f_33123 = 1.7F;
   private static final float f_33124 = 0.2F;
   private static final float f_33125 = 12.0F;
   private static final float f_33126 = 1.7F;
   private static final float f_33127 = 13.0F;
   private static final float f_33128 = 13.0F;
   private static final float f_33129 = 13.0F;
   private static final float f_33130 = 37.0F;
   private static final float f_33131 = 20.0F;
   private static final float f_33132 = 36.0F;
   private static final int f_33133 = 72000;
   private static final String f_33134 = "**:**";
   private static final String f_33135 = "%d:%02d";
   private static final long f_33136 = 2000L;

   private float m_9199(Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var1) {
      String var2 = var1.m_9197() > 0 ? var1.m_9197() + 1 + "" : "";
      float var3 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var1.m_9196(), f_33127, 0.0F);
      float var4 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var2, f_33128, 0.0F);
      float var5 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(this.m_9203(var1.m_9198().getDuration()), f_33129, 0.0F);
      return f_33130 + var3 + var4 + f_33131 + var5 + f_33132;
   }

   @Generated
   public Class_u8iL1f1cFf6CucWB m_9200() {
      return this.f_33019;
   }

   private List<Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA> m_9201() {
      ArrayList var1 = new ArrayList();

      for (MobEffectInstance var3 : f_11537.player.getActiveEffects()) {
         var1.add(new Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA(var3, var3.getAmplifier()));
      }

      return var1;
   }

   public Class_uWwGUbSkSaLy0aZF(MultiChoiceSetting var1) {
      super(f_33021, f_33022, f_33023, f_33024, f_33025);
      this.f_33008 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_33026);
      this.f_33009 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_33027);
      this.f_33010 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_33028);
      this.f_33011 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_33029);
      this.f_33012 = new HashMap<>();
      this.f_33013 = new LinkedHashMap<>();
      this.f_33014 = new HashMap<>();
      this.f_33015 = new ArrayList<>();
      this.f_33016 = new Random();
      this.f_33020 = this::m_9206;
      this.f_33018 = var1;
      this.f_33019 = new Class_u8iL1f1cFf6CucWB(f_33030, f_33031, () -> var1);
   }

   private void m_9202() {
      long var1 = System.currentTimeMillis();
      if (this.f_33015.isEmpty() || var1 - this.f_33017 >= f_33136) {
         ArrayList var3 = new ArrayList<>(
            List.of(
               MobEffects.SPEED,
               MobEffects.STRENGTH,
               MobEffects.REGENERATION,
               MobEffects.FIRE_RESISTANCE,
               MobEffects.RESISTANCE,
               MobEffects.NIGHT_VISION,
               MobEffects.JUMP_BOOST,
               MobEffects.HASTE
            )
         );
         Collections.shuffle(var3, this.f_33016);
         this.f_33015.clear();
         int var4 = 2 + this.f_33016.nextInt(2);

         for (int var5 = 0; var5 < var4; var5++) {
            int var6 = 1200 + this.f_33016.nextInt(3600);
            int var7 = this.f_33016.nextInt(3);
            MobEffectInstance var8 = new MobEffectInstance((Holder)var3.get(var5), var6, var7);
            this.f_33015.add(new Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA(var8, var7));
         }

         this.f_33017 = var1;
      }
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (var3 == 1 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758())) {
         this.f_33019.m_9060(var1, var2);
         return true;
      } else {
         return this.f_33019.m_9070(var1, var2, var3);
      }
   }

   private String m_9203(int var1) {
      if (var1 > f_33133) {
         return f_33134;
      }

      int var2 = var1 / 20;
      return String.format(f_33135, var2 / 60, var2 % 60);
   }

   private void m_9204(float var1, float var2, float var3, float var4) {
      if (DimasikClient.m_9057().m_9049().m_2801().m_3433().f_18172.m_8768()) {
         Class_U4Qsm43RVlUI3Pre.m_5211(var1, var2, var3, var4, f_33101, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SHADOW));
      }

      if (DimasikClient.m_9057().m_9049().m_2801().m_3433().f_18173.m_8768()) {
         Class_U4Qsm43RVlUI3Pre.m_5219(var1, var2, var3, var4, f_33102, f_33103, -1);
      }

      Class_U4Qsm43RVlUI3Pre.m_5199(var1, var2, var3, var4, f_33104, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND));
   }

   private void m_9205(Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var1, float var2, float var3, float var4, float var5, float var6) {
      String var7 = var1.m_9196();
      String var8 = var1.m_9197() > 0 ? var1.m_9197() + 1 + "" : "";
      String var9 = this.m_9203(var1.m_9198().getDuration());
      String var10 = var1.m_9198().getDescriptionId().replace(f_33105, "").replace(f_33106, "");
      Identifier var11 = Identifier.fromNamespaceAndPath(f_33107, var10 + "");
      float var12 = var2 + f_33108;
      float var13 = var3 + f_33109;
      float var14 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var7, f_33110, 0.0F);
      float var15 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var8, f_33111, 0.0F);
      float var16 = var12 + var14 + var15 + f_33112;
      float var17 = var2 + var4 - f_33113;
      float var18 = var3 + f_33114;
      int var19 = ((MobEffect)var1.m_9198().getEffect().value()).getColor();
      int var20 = Math.max(1, this.f_33014.getOrDefault(var1, var1.m_9198().getDuration()));
      float var21 = var1.m_9198().getDuration() > f_33115 ? 1.0F : Math.clamp((float)var1.m_9198().getDuration() / var20, 0.0F, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4864(f_33116 * this.f_33011.m_9288() * var6);
      Class_U4Qsm43RVlUI3Pre.m_5184(
         var2 + f_33117, var3 + f_33118, f_33119, f_33120, new Vector4f(0.0F), new Vector4f(0.0F, 0.0F, 1.0F, 1.0F), new Vector4i(-1), var11
      );
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var7,
         var12,
         var13,
         13,
         Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), var6)
      );
      if (!var8.isEmpty()) {
         Class_U4Qsm43RVlUI3Pre.m_5186(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var8,
            var12 + var14,
            var13,
            13,
            Class_BftdentXEtGbugJw.m_2306(Class_BftdentXEtGbugJw.m_2303(108, 108, 108, f_33121), var6)
         );
      }

      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var9,
         var16,
         var13,
         13,
         Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), var6)
      );
      Class_U4Qsm43RVlUI3Pre.m_5191(var17, var18, f_33122, f_33123, 1.0F, Class_BftdentXEtGbugJw.m_2306(var19, f_33124 * var6));
      Class_U4Qsm43RVlUI3Pre.m_5191(var17, var18, f_33125, f_33126, var21, Class_BftdentXEtGbugJw.m_2306(var19, var6));
   }

   @Override
   public void m_3992() {
      this.f_33019.m_9082();
   }

   public void m_9206(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_33032)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else if (this.f_33018.m_7568(f_33033)) {
         this.m_9208(var1);
      } else {
         List var2 = this.m_9201();
         boolean var3 = f_11537.gui.screen() instanceof ChatScreen || !var2.isEmpty();
         this.f_33010.m_9283(var3 ? 1.0F : 0.0F);
         if (!var3 && this.f_33010.m_9288() <= f_33034) {
            this.f_33012.clear();
            this.m_4012(0.0F);
            this.m_4007(0.0F);
         } else {
            float var4 = this.m_3998();
            float var5 = this.m_3993();
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;

            for (Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var10 : (Iterable<Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA>) (Iterable) var2) {
               int var11 = var10.m_9198().getDuration();
               int var12 = var11 / 20;
               int var13 = var12 / 60;
               int var14 = var12 % 60;
               String var15 = var11 > f_33035 ? f_33036 : String.format(f_33037, var13, var14);
               var6 = Math.max(var6, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10.m_9196(), f_33038, 0.0F));
               var7 = Math.max(var7, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10.m_9197() > 0 ? var10.m_9197() + 1 + "" : "", f_33039, 0.0F));
               var8 = Math.max(var7, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var15, f_33040, 0.0F));
            }

            float var31 = Math.max(f_33041, var6 + var7 + var8 + f_33042);
            this.f_33008.m_9283(var31);
            Class_Ssh31B3ljfKeWsvS.m_4864(f_33043 * this.f_33010.m_9288());
            this.m_4013();
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

            try {
               Class_U4Qsm43RVlUI3Pre.m_5188(var4, var5, this.f_33008.m_9288(), this.f_33009.m_9288(), f_33044);
               float var32 = Math.clamp((this.f_33009.m_9288() - f_33045) / f_33046, 0.0F, 1.0F);
               if (var32 > f_33047) {
                  int var33 = Class_BftdentXEtGbugJw.m_2306(
                     Class_BftdentXEtGbugJw.m_2312(
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO),
                        f_33048 + f_33049 * (float)Math.sin(System.currentTimeMillis() / f_33050)
                     ),
                     f_33051 * var32
                  );
                  int var35 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), 0.0F);
                  Class_U4Qsm43RVlUI3Pre.m_5220(
                     var4 + f_33052, var5 + f_33053, this.f_33008.m_9288() - f_33054, f_33055, new Vector4f(0.0F), new Vector4i(var35, var33, var33, var35)
                  );
               }

               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9591(), f_33056, var4 + f_33057, var5 + f_33058, 16, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
               );
               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  f_33059,
                  var4 + f_33060,
                  var5 + f_33061,
                  14,
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
               );
               ArrayList var34 = new ArrayList();

               for (int var36 = 0; var36 < var2.size(); var36++) {
                  Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var39 = (Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA)var2.get(var36);
                  Class_w8fCJQ5ZtH5lQbWc[] var42 = this.f_33012.remove(var39);
                  if (var42 == null) {
                     var42 = new Class_w8fCJQ5ZtH5lQbWc[]{
                        new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_33062),
                        new Class_w8fCJQ5ZtH5lQbWc(f_33063, f_33064),
                        new Class_w8fCJQ5ZtH5lQbWc(var36 * f_33065, f_33066)
                     };
                  }

                  this.f_33012.put(var39, var42);
                  var42[0].m_9283(1.0F);
                  var42[1].m_9283(0.0F);
                  var42[2].m_9283(var36 * f_33067);
               }

               for (Entry var40 : this.f_33012.entrySet()) {
                  if (!var2.contains(var40.getKey())) {
                     Class_w8fCJQ5ZtH5lQbWc[] var43 = (Class_w8fCJQ5ZtH5lQbWc[])var40.getValue();
                     var43[0].m_9283(0.0F);
                     var43[1].m_9283(f_33068);
                     if (var43[0].m_9280() && var43[1].m_9280()) {
                        var34.add((Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA)var40.getKey());
                     }
                  }
               }

               var34.forEach(this.f_33012::remove);

               for (Entry var41 : this.f_33012.entrySet()) {
                  Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var44 = (Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA)var41.getKey();
                  Class_w8fCJQ5ZtH5lQbWc[] var45 = (Class_w8fCJQ5ZtH5lQbWc[])var41.getValue();
                  float var16 = var45[0].m_9288();
                  if (!(var16 <= 0.0F) || !var45[0].m_9280()) {
                     float var17 = var5 + f_33069 + var45[2].m_9288();
                     String var18 = var44.m_9196();
                     String var19 = var44.m_9197() + "";
                     float var20 = var45[1].m_9288();
                     int var21 = var44.m_9198().getDuration();
                     int var22 = var21 / 20;
                     int var23 = var22 / 60;
                     int var24 = var22 % 60;
                     String var25 = var21 > f_33070 ? f_33071 : String.format(f_33072, var23, var24);
                     String var26 = var44.m_9198().getDescriptionId().replace(f_33073, "").replace(f_33074, "");
                     Identifier var27 = Identifier.fromNamespaceAndPath(f_33075, var26 + "");
                     Class_Ssh31B3ljfKeWsvS.m_4864(var16 * f_33076);
                     Class_U4Qsm43RVlUI3Pre.m_5184(
                        var4 + f_33077,
                        var17 + f_33078 + var20,
                        f_33079,
                        f_33080,
                        new Vector4f(0.0F),
                        new Vector4f(0.0F, 0.0F, 1.0F, 1.0F),
                        new Vector4i(-1),
                        var27
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var18,
                        var4 + f_33081,
                        var17 + f_33082 + var20,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var44.m_9197() > 0 ? var44.m_9197() + 1 + "" : "",
                        var4 + f_33083 + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var18, f_33084, 0.0F),
                        var17 + f_33085 + var20,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var25,
                        var4 + this.f_33008.m_9288() - f_33086 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var25, f_33087, 0.0F),
                        var17 + f_33088 + var20,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
                     );
                     Class_Ssh31B3ljfKeWsvS.m_4844();
                  }
               }
            } finally {
               Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
               Class_Ssh31B3ljfKeWsvS.m_4844();
               this.m_4005();
            }

            this.f_33009.m_9283(var2.isEmpty() ? f_33089 : 36 + var2.size() * 20 + 7);
            this.m_4012(this.f_33008.m_9288());
            this.m_4007(this.f_33009.m_9288());
         }
      }
   }

   @Override
   public void m_1333() {
      this.f_33019.m_9093();
   }

   private void m_9208(Class_bhRaN0YSSLQRYjPo var1) {
      List var2 = this.m_9201();
      boolean var3 = f_11537.gui.screen() instanceof ChatScreen && var2.isEmpty();
      if (var3) {
         this.m_9202();
         var2 = new ArrayList<>(this.f_33015);
      }

      boolean var4 = var3 || !var2.isEmpty();
      this.f_33011.m_9283(var4 ? 1.0F : 0.0F);
      float var5 = this.m_3998();
      float var6 = this.m_3993();
      float var7 = f_33090;
      float var8 = f_33091;
      float var9 = 0.0F;
      ArrayList var10 = new ArrayList();

      for (int var11 = 0; var11 < var2.size(); var11++) {
         Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var12 = (Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA)var2.get(var11);
         Class_w8fCJQ5ZtH5lQbWc[] var13 = this.f_33013.remove(var12);
         if (var13 == null) {
            var13 = new Class_w8fCJQ5ZtH5lQbWc[]{
               new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_33092),
               new Class_w8fCJQ5ZtH5lQbWc(f_33093, f_33094),
               new Class_w8fCJQ5ZtH5lQbWc(var11 * (var7 + var8), f_33095)
            };
         }

         this.f_33013.put(var12, var13);
         var13[0].m_9283(1.0F);
         var13[1].m_9283(0.0F);
         var13[2].m_9283(var11 * (var7 + var8));
         this.f_33014.merge(var12, var12.m_9198().getDuration(), Math::max);
         var9 = Math.max(var9, this.m_9199(var12));
      }

      for (Entry var27 : this.f_33013.entrySet()) {
         if (!var2.contains(var27.getKey())) {
            Class_w8fCJQ5ZtH5lQbWc[] var30 = (Class_w8fCJQ5ZtH5lQbWc[])var27.getValue();
            var30[0].m_9283(0.0F);
            var30[1].m_9283(f_33096);
            if (var30[0].m_9280() && var30[1].m_9280()) {
               var10.add((Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA)var27.getKey());
            }
         }

         var9 = Math.max(var9, this.m_9199((Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA)var27.getKey()));
      }

      for (Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var28 : (Iterable<Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA>) (Iterable) var10) {
         this.f_33013.remove(var28);
         this.f_33014.remove(var28);
      }

      float var26 = this.f_33013.isEmpty() ? (var3 ? var7 : 0.0F) : this.f_33013.size() * var7 + Math.max(0, this.f_33013.size() - 1) * var8;
      float var29 = this.f_33011.m_9288();
      if (var29 > f_33097) {
         Class_Ssh31B3ljfKeWsvS.m_4864(f_33098 * var29);
         this.m_4013();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            for (Entry var14 : this.f_33013.entrySet()) {
               Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var15 = (Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA)var14.getKey();
               Class_w8fCJQ5ZtH5lQbWc[] var16 = (Class_w8fCJQ5ZtH5lQbWc[])var14.getValue();
               float var17 = var16[0].m_9288();
               if (!(var17 <= f_33099) || !var16[0].m_9280()) {
                  float var18 = var5 + var16[1].m_9288();
                  float var19 = var6 + var16[2].m_9288();
                  float var20 = this.m_9199(var15);
                  Class_Ssh31B3ljfKeWsvS.m_4864(f_33100 * var29 * var17);
                  this.m_9204(var18, var19, var20, var7);
                  this.m_9205(var15, var18, var19, var20, var7, var17);
               }
            }
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
            Class_Ssh31B3ljfKeWsvS.m_4844();
            this.m_4005();
         }
      }

      this.m_4012(var4 ? var9 : 0.0F);
      this.m_4007(var4 ? var26 : 0.0F);
   }

   private static class AXT7gw5ERz9kewZA {
      public final MobEffectInstance f_33005;
      public final int f_33006;

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else {
            return !(var1 instanceof Class_uWwGUbSkSaLy0aZF.AXT7gw5ERz9kewZA var2)
               ? false
               : this.f_33006 == var2.f_33006 && this.f_33005.getEffect().equals(var2.f_33005.getEffect());
         }
      }

      public AXT7gw5ERz9kewZA(MobEffectInstance var1, int var2) {
         this.f_33005 = var1;
         this.f_33006 = var2;
      }

      public String m_9196() {
         return I18n.get(this.f_33005.getDescriptionId(), new Object[0]);
      }

      @Generated
      public int m_9197() {
         return this.f_33006;
      }

      @Generated
      public MobEffectInstance m_9198() {
         return this.f_33005;
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.f_33005.getEffect(), this.f_33006);
      }
   }
}
