package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Generated;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import org.joml.Vector4f;

public final class Class_BLXqtQf5zJDEHDFr implements Class_NzJrN63M7QBpmAbi {
   private final String f_5339;
   private final AbstractTexture f_5340;
   private final Class_PBaph5kIoGi7c8fq.VvfRKWNC7QMqgef6 f_5341;
   private final Class_PBaph5kIoGi7c8fq.nCxI2GXgF30NoSgA f_5342;
   private final Map<Integer, Class_sy4Jrue2NdUWUhLU> f_5343;
   private final Map<Integer, Map<Integer, Float>> f_5344;
   private static final float f_5345 = 255.0F;
   private static final float f_5346 = 255.0F;
   private static final float f_5347 = 255.0F;
   private static final float f_5348 = Float.MAX_VALUE;
   private static final float f_5349 = -Float.MAX_VALUE;

   private Class_BLXqtQf5zJDEHDFr(
      String var1,
      AbstractTexture var2,
      Class_PBaph5kIoGi7c8fq.VvfRKWNC7QMqgef6 var3,
      Class_PBaph5kIoGi7c8fq.nCxI2GXgF30NoSgA var4,
      Map<Integer, Class_sy4Jrue2NdUWUhLU> var5,
      Map<Integer, Map<Integer, Float>> var6
   ) {
      this.f_5339 = var1;
      this.f_5340 = var2;
      this.f_5341 = var3;
      this.f_5342 = var4;
      this.f_5343 = var5;
      this.f_5344 = var6;
   }

   @Generated
   public AbstractTexture m_2145() {
      return this.f_5340;
   }

   @Generated
   public String m_2146() {
      return this.f_5339;
   }

   public void m_2147(VertexConsumer var1, String var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      int var9 = -1;

      for (int var10 = 0; var10 < var2.length(); var10++) {
         char var11 = var2.charAt(var10);
         String var12 = Class_JInbhwbvIxCoRpXA.m_3253(var11);
         if (var12 != null) {
            float var19 = (var8 >> 24 & 0xFF) / f_5345;

            for (int var20 = 0; var20 < var12.length(); var20++) {
               char var15 = var12.charAt(var20);
               Class_sy4Jrue2NdUWUhLU var16 = this.f_5343.get(Integer.valueOf(var15));
               if (var16 != null) {
                  Map var17 = this.f_5344.get(var9);
                  if (var17 != null) {
                     var6 += ((Float)var17.getOrDefault(Integer.valueOf(var15), 0.0F)) * var3;
                  }

                  int var18 = Class_JInbhwbvIxCoRpXA.m_3258(var11, var20, var12.length(), var19, var8);
                  var6 += var16.m_8770(var1, var3, var6, var7, var18) + var4 + var5;
                  var9 = var15;
               }
            }
         } else {
            Class_sy4Jrue2NdUWUhLU var13 = this.f_5343.get(Integer.valueOf(var11));
            if (var13 != null) {
               Map var14 = this.f_5344.get(var9);
               if (var14 != null) {
                  var6 += ((Float)var14.getOrDefault(Integer.valueOf(var11), 0.0F)) * var3;
               }

               var6 += var13.m_8770(var1, var3, var6, var7, var8) + var4 + var5;
               var9 = var11;
            }
         }
      }
   }

   public void m_2148(VertexConsumer var1, String var2, float var3, float var4, int var5, float var6, float var7, float var8, int var9) {
      int var10 = -1;

      for (int var11 = 0; var11 < var2.length(); var11++) {
         char var12 = var2.charAt(var11);
         String var13 = Class_JInbhwbvIxCoRpXA.m_3253(var12);
         if (var13 != null) {
            float var20 = (var9 >> 24 & 0xFF) / f_5346;

            for (int var21 = 0; var21 < var13.length(); var21++) {
               char var16 = var13.charAt(var21);
               Class_sy4Jrue2NdUWUhLU var17 = this.f_5343.get(Integer.valueOf(var16));
               if (var17 != null) {
                  Map var18 = this.f_5344.get(var10);
                  if (var18 != null) {
                     var7 += ((Number)var18.getOrDefault(Integer.valueOf(var16), 0.0F)).floatValue() * var3;
                  }

                  int var19 = Class_JInbhwbvIxCoRpXA.m_3258(var12, var21, var13.length(), var20, var9);
                  var7 += var17.m_8774(var1, var3, var4, var5, var7, var8, var19) + var6;
                  var10 = var16;
               }
            }
         } else {
            Class_sy4Jrue2NdUWUhLU var14 = this.f_5343.get(Integer.valueOf(var12));
            if (var14 != null) {
               Map var15 = this.f_5344.get(var10);
               if (var15 != null) {
                  var7 += ((Number)var15.getOrDefault(Integer.valueOf(var12), 0.0F)).floatValue() * var3;
               }

               var7 += var14.m_8774(var1, var3, var4, var5, var7, var8, var9) + var6;
               var10 = var12;
            }
         }
      }
   }

   @Generated
   public Class_PBaph5kIoGi7c8fq.VvfRKWNC7QMqgef6 m_2149() {
      return this.f_5341;
   }

   public float m_2150(int var1, float var2) {
      Class_sy4Jrue2NdUWUhLU var3 = this.f_5343.get(var1);
      return var3 == null ? 0.0F : var3.m_8771(var2);
   }

   @Generated
   public Class_PBaph5kIoGi7c8fq.nCxI2GXgF30NoSgA m_2151() {
      return this.f_5342;
   }

   public Vector4f m_2152(int var1) {
      Class_sy4Jrue2NdUWUhLU var2 = this.f_5343.get(var1);
      return var2 == null ? null : var2.m_8776();
   }

   public float m_2153(String var1, float var2, float var3, float var4) {
      int var5 = -1;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < var1.length(); var7++) {
         char var8 = var1.charAt(var7);
         if (var8 == 167 && var7 + 1 < var1.length()) {
            var7++;
         } else {
            String var9 = Class_JInbhwbvIxCoRpXA.m_3253(var8);
            if (var9 != null) {
               for (int var14 = 0; var14 < var9.length(); var14++) {
                  char var15 = var9.charAt(var14);
                  Class_sy4Jrue2NdUWUhLU var12 = this.f_5343.get(Integer.valueOf(var15));
                  if (var12 != null) {
                     Map var13 = this.f_5344.get(var5);
                     if (var13 != null) {
                        var6 += ((Float)var13.getOrDefault(Integer.valueOf(var15), 0.0F)) * var2;
                     }

                     var6 += var12.m_8775(var2) * var4 + var3;
                     var5 = var15;
                  }
               }
            } else {
               Class_sy4Jrue2NdUWUhLU var10 = this.f_5343.get(Integer.valueOf(var8));
               if (var10 != null) {
                  Map var11 = this.f_5344.get(var5);
                  if (var11 != null) {
                     var6 += ((Float)var11.getOrDefault(Integer.valueOf(var8), 0.0F)) * var2;
                  }

                  var6 += var10.m_8775(var2) * var4 + var3;
                  var5 = var8;
               }
            }
         }
      }

      return var6;
   }

   public float m_2154(String var1, float var2) {
      float var3 = this.f_5342.m_4106() * var2;
      float var4 = f_5348;
      float var5 = f_5349;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         Class_sy4Jrue2NdUWUhLU var7 = this.f_5343.get(Integer.valueOf(var1.charAt(var6)));
         if (var7 != null && !(var7.m_8769() <= 0.0F)) {
            float var8 = var3 - var7.m_8777() * var2;
            var4 = Math.min(var4, var8);
            var5 = Math.max(var5, var8 + var7.m_8769() * var2);
         }
      }

      return var4 > var5 ? var3 : (var4 + var5) / 2.0F;
   }

   public void m_2155(
      VertexConsumer var1, String var2, float var3, float var4, int var5, float var6, float var7, float var8, int var9, float var10, float var11
   ) {
      int var12 = -1;

      for (int var13 = 0; var13 < var2.length(); var13++) {
         char var14 = var2.charAt(var13);
         String var15 = Class_JInbhwbvIxCoRpXA.m_3253(var14);
         if (var15 != null) {
            float var22 = (var9 >> 24 & 0xFF) / f_5347;

            for (int var23 = 0; var23 < var15.length(); var23++) {
               char var18 = var15.charAt(var23);
               Class_sy4Jrue2NdUWUhLU var19 = this.f_5343.get(Integer.valueOf(var18));
               if (var19 != null) {
                  Map var20 = this.f_5344.get(var12);
                  if (var20 != null) {
                     var7 += ((Number)var20.getOrDefault(Integer.valueOf(var18), 0.0F)).floatValue() * var3;
                  }

                  int var21 = Class_JInbhwbvIxCoRpXA.m_3258(var14, var23, var15.length(), var22, var9);
                  var7 += var19.m_8773(var1, var3, var4, var5, var7, var8, var21, var10, var11) + var6;
                  var12 = var18;
               }
            }
         } else {
            Class_sy4Jrue2NdUWUhLU var16 = this.f_5343.get(Integer.valueOf(var14));
            if (var16 != null) {
               Map var17 = this.f_5344.get(var12);
               if (var17 != null) {
                  var7 += ((Number)var17.getOrDefault(Integer.valueOf(var14), 0.0F)).floatValue() * var3;
               }

               var7 += var16.m_8773(var1, var3, var4, var5, var7, var8, var9, var10, var11) + var6;
               var12 = var14;
            }
         }
      }
   }

   public float m_2156(float var1) {
      return this.f_5342.m_4106() * var1 - this.m_2158(var1) / 2.0F;
   }

   public float m_2157(String var1, float var2, float var3) {
      return this.m_2153(var1, var2, var3, 1.0F);
   }

   public float m_2158(float var1) {
      Class_sy4Jrue2NdUWUhLU var2 = this.f_5343.get(72);
      return (var2 != null ? var2.m_8777() : this.f_5342.m_4105()) * var1;
   }

   public static Class_BLXqtQf5zJDEHDFr.axSaKNFaF1ldj330 m_2159() {
      return new Class_BLXqtQf5zJDEHDFr.axSaKNFaF1ldj330();
   }

   public static class axSaKNFaF1ldj330 {
      public String f_5333;
      public Identifier f_5334;
      public Identifier f_5335;
      public static final String f_5336 = "?";
      public static final String f_5337 = "medium";
      public static final float f_5338 = -0.085F;

      public Class_BLXqtQf5zJDEHDFr.axSaKNFaF1ldj330 m_2137(String var1) {
         this.f_5334 = Class_wHRRCm2tlLY7DN4I.m_9310(var1.endsWith(".json") ? var1 : var1 + ".json");
         return this;
      }

      public Class_BLXqtQf5zJDEHDFr m_2138() {
         Class_PBaph5kIoGi7c8fq var1 = Class_4zw2NauxJRAjSJsT.m_1393(this.f_5334, Class_PBaph5kIoGi7c8fq.class);
         AbstractTexture var2 = Class_NzJrN63M7QBpmAbi.f_11537.getTextureManager().getTexture(this.f_5335);
         if (var1 == null) {
            throw new RuntimeException(this.f_5334.toString() + "");
         }

         float var3 = var1.m_4110().m_4102();
         float var4 = var1.m_4110().m_4100();
         Map var5 = var1.m_4107()
            .stream()
            .collect(Collectors.toMap(Class_PBaph5kIoGi7c8fq.OrsQZAoSQ9GBVogD::m_4096, var2x -> new Class_sy4Jrue2NdUWUhLU(var2x, var3, var4)));
         HashMap var6 = new HashMap();
         var1.m_4108().forEach(var1x -> {
            Map var2x = (Map)var6.computeIfAbsent(var1x.m_4091(), var0x -> new HashMap());
            var2x.put(var1x.m_4089(), var1x.m_4090());
         });
         if (f_5337.equals(this.f_5333)) {
            ((Map)var6.computeIfAbsent(75, var0 -> new HashMap<>())).put(101, f_5338);
         }

         return new Class_BLXqtQf5zJDEHDFr(this.f_5333, var2, var1.m_4110(), var1.m_4109(), var5, var6);
      }

      public Class_BLXqtQf5zJDEHDFr.axSaKNFaF1ldj330 m_2139(String var1) {
         this.f_5335 = Class_wHRRCm2tlLY7DN4I.m_9310(var1.endsWith(".png") ? var1 : var1 + ".png");
         return this;
      }

      public Class_BLXqtQf5zJDEHDFr.axSaKNFaF1ldj330 m_2141(String var1) {
         this.f_5333 = var1;
         return this;
      }

      public axSaKNFaF1ldj330() {
         this.f_5333 = f_5336;
      }
   }
}
