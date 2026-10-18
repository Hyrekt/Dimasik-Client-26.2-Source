package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class Class_oAq4PeD1FSXoIaXR {
   public int f_26065 = 64;
   public int f_26066 = 64;
   public boolean f_26067;
   public final List<Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl> f_26068 = new ArrayList<>();
   private Class_oAq4PeD1FSXoIaXR.LlfVhbfeCJgs1QvW f_26069;
   private static final String f_26070 = "minecraft:geometry";
   private static final String f_26071 = "minecraft:geometry";
   private static final String f_26072 = "bones";
   private static final String f_26073 = "bones";
   private static final String f_26074 = "name";
   private static final String f_26075 = "name";
   private static final String f_26076 = "bone";
   private static final String f_26077 = "pivot";
   private static final String f_26078 = "rotation";
   private static final String f_26079 = "mirror";
   private static final String f_26080 = "mirror";
   private static final String f_26081 = "cubes";
   private static final String f_26082 = "cubes";
   private static final String f_26083 = "rotation";
   private static final String f_26084 = "pivot";
   private static final String f_26085 = "pivot";
   private static final String f_26086 = "rotation";
   private static final String f_26087 = "parent";
   private static final String f_26088 = "parent";
   private static final String f_26089 = "minecraft:geometry";
   private static final String f_26090 = "minecraft:geometry";
   private static final String f_26091 = "bones";
   private static final String f_26092 = "bones";
   private static final String f_26093 = "name";
   private static final String f_26094 = "name";
   private static final String f_26095 = "bone";
   private static final String f_26096 = "pivot";
   private static final String f_26097 = "rotation";
   private static final String f_26098 = "dimasik_tint";
   private static final String f_26099 = "dimasik_tint";
   private static final String f_26100 = "#";
   private static final String f_26101 = "mirror";
   private static final String f_26102 = "mirror";
   private static final String f_26103 = "cubes";
   private static final String f_26104 = "cubes";
   private static final String f_26105 = "parent";
   private static final String f_26106 = "parent";
   private static final String f_26107 = "description";
   private static final String f_26108 = "description";
   private static final String f_26109 = "texture_width";
   private static final String f_26110 = "texture_width";
   private static final String f_26111 = "texture_height";
   private static final String f_26112 = "texture_height";
   private static final String f_26113 = "origin";
   private static final String f_26114 = "size";
   private static final String f_26115 = "origin";
   private static final String f_26116 = "size";
   private static final String f_26117 = "pivot";
   private static final String f_26118 = "rotation";
   private static final String f_26119 = "inflate";
   private static final String f_26120 = "inflate";
   private static final String f_26121 = "mirror";
   private static final String f_26122 = "mirror";
   private static final String f_26123 = "uv";
   private static final String f_26124 = "uv";
   private static final String f_26125 = "uv";
   private static final String f_26126 = "uv";
   private static final String f_26127 = "east";
   private static final String f_26128 = "west";
   private static final String f_26129 = "up";
   private static final String f_26130 = "down";
   private static final String f_26131 = "uv_size";
   private static final String f_26132 = "uv_size";
   private static final float f_26133 = -0.5F;
   private static final float f_26134 = -0.5F;
   private static final float f_26135 = -0.5F;
   private static final float f_26136 = 0.5F;
   private static final float f_26137 = 0.5F;
   private static final float f_26138 = 0.5F;
   private static final float f_26139 = 16.0F;
   private static final float f_26140 = 16.0F;
   private static final float f_26141 = 16.0F;
   private static final float f_26142 = 16.0F;
   private static final float f_26143 = 16.0F;
   private static final float f_26144 = 16.0F;
   private static final float f_26145 = 16.0F;
   private static final float f_26146 = 16.0F;
   private static final float f_26147 = 16.0F;
   private static final float f_26148 = 16.0F;
   private static final float f_26149 = 16.0F;
   private static final float f_26150 = 16.0F;
   private static final float f_26151 = 16.0F;
   private static final float f_26152 = 16.0F;
   private static final float f_26153 = 16.0F;
   private static final float f_26154 = 16.0F;
   private static final float f_26155 = 16.0F;
   private static final float f_26156 = 16.0F;
   private static final float f_26157 = 16.0F;
   private static final float f_26158 = 16.0F;
   private static final float f_26159 = 16.0F;
   private static final float f_26160 = 16.0F;
   private static final float f_26161 = 16.0F;
   private static final float f_26162 = 16.0F;
   private static final float f_26163 = 16.0F;
   private static final float f_26164 = 16.0F;
   private static final float f_26165 = 16.0F;

   private static Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl m_7716(JsonObject var0) {
      Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var1 = new Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl();
      float[] var2 = m_7719(var0, f_26115);
      float[] var3 = m_7719(var0, f_26116);
      var1.f_26046 = -var2[0] - var3[0];
      var1.f_26047 = var2[1];
      var1.f_26048 = var2[2];
      var1.f_26049 = var3[0];
      var1.f_26050 = var3[1];
      var1.f_26051 = var3[2];
      float[] var4 = m_7719(var0, f_26117);
      var1.f_26054 = -var4[0];
      var1.f_26055 = var4[1];
      var1.f_26056 = var4[2];
      float[] var5 = m_7719(var0, f_26118);
      var1.f_26057 = -var5[0];
      var1.f_26058 = -var5[1];
      var1.f_26059 = var5[2];
      m_7717(var1, var0);
      return var1;
   }

   private static void m_7717(Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var0, JsonObject var1) {
      float var2 = var1.has(f_26119) ? var1.get(f_26120).getAsFloat() : 0.0F;
      var0.f_26060 = var2;
      var0.f_26061 = var2;
      var0.f_26062 = var2;
      var0.f_26063 = var1.has(f_26121) && var1.get(f_26122).getAsBoolean();
      if (var1.has(f_26123)) {
         JsonElement var3 = var1.get(f_26124);
         if (var3.isJsonArray()) {
            JsonArray var4 = var3.getAsJsonArray();
            var0.f_26052 = var4.get(0).getAsFloat();
            var0.f_26053 = var4.get(1).getAsFloat();
         } else if (var3.isJsonObject()) {
            JsonObject var13 = var3.getAsJsonObject();

            for (Entry var6 : var13.entrySet()) {
               if (((JsonElement)var6.getValue()).isJsonObject()) {
                  JsonObject var7 = ((JsonElement)var6.getValue()).getAsJsonObject();
                  if (var7.has(f_26125)) {
                     JsonArray var8 = var7.getAsJsonArray(f_26126);

                     float var9 = switch ((String)var6.getKey()) {
                        case f_26127, f_26128 -> var0.f_26051;
                        default -> var0.f_26049;
                     };

                     float var14 = switch ((String)var6.getKey()) {
                        case f_26129, f_26130 -> var0.f_26051;
                        default -> var0.f_26050;
                     };
                     if (var7.has(f_26131)) {
                        JsonArray var16 = var7.getAsJsonArray(f_26132);
                        var9 = var16.get(0).getAsFloat();
                        var14 = var16.get(1).getAsFloat();
                     }

                     var0.f_26064
                        .put(
                           (String)var6.getKey(), new Class_oAq4PeD1FSXoIaXR.FGPGl1GV3jp5WJ2z(var8.get(0).getAsFloat(), var8.get(1).getAsFloat(), var9, var14)
                        );
                  }
               }
            }
         }
      }
   }

   private static Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl m_7718(JsonObject var0, float[] var1) {
      Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var2 = new Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl();
      float[] var3 = m_7719(var0, f_26113);
      var2.f_26046 = var3[0] - var1[0];
      var2.f_26047 = var3[1] - var1[1];
      var2.f_26048 = var3[2] - var1[2];
      float[] var4 = m_7719(var0, f_26114);
      var2.f_26049 = var4[0];
      var2.f_26050 = var4[1];
      var2.f_26051 = var4[2];
      m_7717(var2, var0);
      return var2;
   }

   private static float[] m_7719(JsonObject var0, String var1) {
      if (var0.has(var1) && var0.get(var1).isJsonArray()) {
         JsonArray var2 = var0.getAsJsonArray(var1);
         return new float[]{
            var2.size() > 0 ? var2.get(0).getAsFloat() : 0.0F,
            var2.size() > 1 ? var2.get(1).getAsFloat() : 0.0F,
            var2.size() > 2 ? var2.get(2).getAsFloat() : 0.0F
         };
      } else {
         return new float[]{0.0F, 0.0F, 0.0F};
      }
   }

   private static void m_7720(Matrix4f var0, float[] var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      for (int var8 = 0; var8 < 2; var8++) {
         for (int var9 = 0; var9 < 2; var9++) {
            for (int var10 = 0; var10 < 2; var10++) {
               Vector3f var11 = var0.transformPosition(new Vector3f(var8 == 0 ? var2 : var5, var9 == 0 ? var3 : var6, var10 == 0 ? var4 : var7));
               var1[0] = Math.min(var1[0], var11.x);
               var1[1] = Math.min(var1[1], var11.y);
               var1[2] = Math.min(var1[2], var11.z);
               var1[3] = Math.max(var1[3], var11.x);
               var1[4] = Math.max(var1[4], var11.y);
               var1[5] = Math.max(var1[5], var11.z);
            }
         }
      }
   }

   private static void m_7721(Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var0, Matrix4f var1, float[] var2) {
      Matrix4f var3 = new Matrix4f(var1)
         .translate(var0.f_26036 / f_26148, var0.f_26037 / f_26149, var0.f_26038 / f_26150)
         .rotateZ((float)Math.toRadians(var0.f_26041))
         .rotateY((float)Math.toRadians(var0.f_26040))
         .rotateX((float)Math.toRadians(var0.f_26039))
         .translate(-var0.f_26036 / f_26151, -var0.f_26037 / f_26152, -var0.f_26038 / f_26153);

      for (Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var5 : var0.f_26043) {
         Matrix4f var6 = new Matrix4f(var3)
            .translate(var5.f_26054 / f_26154, var5.f_26055 / f_26155, var5.f_26056 / f_26156)
            .rotateZ((float)Math.toRadians(var5.f_26059))
            .rotateY((float)Math.toRadians(var5.f_26058))
            .rotateX((float)Math.toRadians(var5.f_26057))
            .translate(-var5.f_26054 / f_26157, -var5.f_26055 / f_26158, -var5.f_26056 / f_26159);
         m_7722(var5, var6, var2);
      }

      for (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var8 : var0.f_26044) {
         m_7721(var8, var3, var2);
      }
   }

   private static void m_7722(Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var0, Matrix4f var1, float[] var2) {
      float var3 = (var0.f_26046 - var0.f_26060) / f_26160;
      float var4 = (var0.f_26047 - var0.f_26061) / f_26161;
      float var5 = (var0.f_26048 - var0.f_26062) / f_26162;
      float var6 = (var0.f_26046 + var0.f_26049 + var0.f_26060) / f_26163;
      float var7 = (var0.f_26047 + var0.f_26050 + var0.f_26061) / f_26164;
      float var8 = (var0.f_26048 + var0.f_26051 + var0.f_26062) / f_26165;
      m_7720(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Class_oAq4PeD1FSXoIaXR.LlfVhbfeCJgs1QvW m_7723() {
      if (this.f_26069 != null) {
         return this.f_26069;
      }

      float[] var1 = new float[]{
         Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY
      };
      Matrix4f var2 = new Matrix4f();

      for (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var4 : this.f_26068) {
         if (this.f_26067) {
            m_7721(var4, var2, var1);
         } else {
            m_7725(var4, var2, var1);
         }
      }

      if (!Float.isFinite(var1[0])) {
         this.f_26069 = new Class_oAq4PeD1FSXoIaXR.LlfVhbfeCJgs1QvW(f_26133, f_26134, f_26135, f_26136, f_26137, f_26138);
      } else {
         this.f_26069 = new Class_oAq4PeD1FSXoIaXR.LlfVhbfeCJgs1QvW(var1[0], var1[1], var1[2], var1[3], var1[4], var1[5]);
      }

      return this.f_26069;
   }

   private static void m_7724(Class_oAq4PeD1FSXoIaXR var0, JsonObject var1) {
      if (var1.has(f_26107)) {
         JsonObject var2 = var1.getAsJsonObject(f_26108);
         var0.f_26065 = var2.has(f_26109) ? var2.get(f_26110).getAsInt() : 64;
         var0.f_26066 = var2.has(f_26111) ? var2.get(f_26112).getAsInt() : 64;
      }
   }

   private static void m_7725(Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var0, Matrix4f var1, float[] var2) {
      Matrix4f var3 = new Matrix4f(var1)
         .translate(var0.f_26036 / f_26139, -var0.f_26037 / f_26140, var0.f_26038 / f_26141)
         .rotateZ((float)Math.toRadians(var0.f_26041))
         .rotateY((float)Math.toRadians(var0.f_26040))
         .rotateX((float)Math.toRadians(var0.f_26039));

      for (Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var5 : var0.f_26043) {
         m_7727(var5, var3, var2);
      }

      for (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var7 : var0.f_26044) {
         m_7725(var7, var3, var2);
      }
   }

   public static Class_oAq4PeD1FSXoIaXR m_7726(InputStream var0) {
      JsonObject var1 = JsonParser.parseReader(new InputStreamReader(var0, StandardCharsets.UTF_8)).getAsJsonObject();
      Class_oAq4PeD1FSXoIaXR var2 = new Class_oAq4PeD1FSXoIaXR();
      if (!var1.has(f_26070)) {
         return var2;
      }

      JsonArray var3 = var1.getAsJsonArray(f_26071);
      if (var3.size() == 0) {
         return var2;
      }

      JsonObject var4 = var3.get(0).getAsJsonObject();
      m_7724(var2, var4);
      if (!var4.has(f_26072)) {
         return var2;
      }

      LinkedHashMap<String, Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl> var5 = new LinkedHashMap<>();
      LinkedHashMap<String, float[]> var6 = new LinkedHashMap<>();
      LinkedHashMap<String, String> var7 = new LinkedHashMap<>();

      for (JsonElement var9 : var4.getAsJsonArray(f_26073)) {
         JsonObject var10 = var9.getAsJsonObject();
         Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var11 = new Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl();
         var11.f_26035 = var10.has(f_26074) ? var10.get(f_26075).getAsString() : f_26076;
         float[] var12 = m_7719(var10, f_26077);
         var6.put(var11.f_26035, var12);
         float[] var13 = m_7719(var10, f_26078);
         var11.f_26039 = var13[0];
         var11.f_26040 = var13[1];
         var11.f_26041 = var13[2];
         var11.f_26042 = var10.has(f_26079) && var10.get(f_26080).getAsBoolean();
         if (var10.has(f_26081)) {
            for (JsonElement var15 : var10.getAsJsonArray(f_26082)) {
               JsonObject var16 = var15.getAsJsonObject();
               if (!var16.has(f_26083) && !var16.has(f_26084)) {
                  var11.f_26043.add(m_7718(var16, var12));
               } else {
                  float[] var17 = m_7719(var16, f_26085);
                  float[] var18 = m_7719(var16, f_26086);
                  Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var19 = new Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl();
                  var19.f_26035 = var11.f_26035 + var11.f_26044.size();
                  var19.f_26036 = var17[0] - var12[0];
                  var19.f_26037 = var17[1] - var12[1];
                  var19.f_26038 = var17[2] - var12[2];
                  var19.f_26039 = var18[0];
                  var19.f_26040 = var18[1];
                  var19.f_26041 = var18[2];
                  var19.f_26043.add(m_7718(var16, var17));
                  var11.f_26044.add(var19);
               }
            }
         }

         if (var10.has(f_26087)) {
            var7.put(var11.f_26035, var10.get(f_26088).getAsString());
         }

         var5.put(var11.f_26035, var11);
      }

      for (Entry<String, Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl> var21 : var5.entrySet()) {
         Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var22 = (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl)var21.getValue();
         String var23 = (String)var7.get(var21.getKey());
         float[] var24 = var6.getOrDefault(var21.getKey(), new float[]{0.0F, 0.0F, 0.0F});
         if (var23 == null) {
            var22.f_26036 = var24[0];
            var22.f_26037 = var24[1];
            var22.f_26038 = var24[2];
            var2.f_26068.add(var22);
         } else {
            float[] var25 = var6.getOrDefault(var23, new float[]{0.0F, 0.0F, 0.0F});
            var22.f_26036 = var24[0] - var25[0];
            var22.f_26037 = var24[1] - var25[1];
            var22.f_26038 = var24[2] - var25[2];
            Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var26 = (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl)var5.get(var23);
            if (var26 == null) {
               var2.f_26068.add(var22);
            } else {
               var26.f_26044.add(var22);
            }
         }
      }

      return var2;
   }

   private static void m_7727(Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var0, Matrix4f var1, float[] var2) {
      float var3 = (var0.f_26046 - var0.f_26060) / f_26142;
      float var4 = (-var0.f_26047 - var0.f_26050 - var0.f_26061) / f_26143;
      float var5 = (var0.f_26048 - var0.f_26062) / f_26144;
      float var6 = (var0.f_26046 + var0.f_26049 + var0.f_26060) / f_26145;
      float var7 = (-var0.f_26047 + var0.f_26061) / f_26146;
      float var8 = (var0.f_26048 + var0.f_26051 + var0.f_26062) / f_26147;
      m_7720(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static Class_oAq4PeD1FSXoIaXR m_7728(InputStream var0) {
      JsonObject var1 = JsonParser.parseReader(new InputStreamReader(var0, StandardCharsets.UTF_8)).getAsJsonObject();
      Class_oAq4PeD1FSXoIaXR var2 = new Class_oAq4PeD1FSXoIaXR();
      var2.f_26067 = true;
      if (!var1.has(f_26089)) {
         return var2;
      }

      JsonArray var3 = var1.getAsJsonArray(f_26090);
      if (var3.size() == 0) {
         return var2;
      }

      JsonObject var4 = var3.get(0).getAsJsonObject();
      m_7724(var2, var4);
      if (!var4.has(f_26091)) {
         return var2;
      }

      LinkedHashMap<String, Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl> var5 = new LinkedHashMap<>();
      LinkedHashMap<String, String> var6 = new LinkedHashMap<>();

      for (JsonElement var8 : var4.getAsJsonArray(f_26092)) {
         JsonObject var9 = var8.getAsJsonObject();
         Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var10 = new Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl();
         var10.f_26035 = var9.has(f_26093) ? var9.get(f_26094).getAsString() : f_26095;
         float[] var11 = m_7719(var9, f_26096);
         var10.f_26036 = -var11[0];
         var10.f_26037 = var11[1];
         var10.f_26038 = var11[2];
         float[] var12 = m_7719(var9, f_26097);
         var10.f_26039 = -var12[0];
         var10.f_26040 = -var12[1];
         var10.f_26041 = var12[2];
         if (var9.has(f_26098)) {
            var10.f_26034 = (int)Long.parseLong(var9.get(f_26099).getAsString().replace(f_26100, ""), 16);
         }

         var10.f_26042 = var9.has(f_26101) && var9.get(f_26102).getAsBoolean();
         if (var9.has(f_26103)) {
            for (JsonElement var14 : var9.getAsJsonArray(f_26104)) {
               JsonObject var15 = var14.getAsJsonObject();
               var10.f_26043.add(m_7716(var15));
            }
         }

         if (var9.has(f_26105)) {
            var6.put(var10.f_26035, var9.get(f_26106).getAsString());
         }

         var5.put(var10.f_26035, var10);
      }

      for (Entry<String, Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl> var17 : var5.entrySet()) {
         String var18 = (String)var17.getKey();
         Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var19 = (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl)var17.getValue();
         String var20 = (String)var6.get(var18);
         if (var20 == null) {
            var2.f_26068.add(var19);
         } else {
            Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var21 = (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl)var5.get(var20);
            if (var21 == null) {
               var2.f_26068.add(var19);
            } else {
               var21.f_26044.add(var19);
            }
         }
      }

      return var2;
   }

   public static final class Class_35mRGIE8PAfJVyZl {
      public int f_26034;
      public String f_26035;
      public float f_26036;
      public float f_26037;
      public float f_26038;
      public float f_26039;
      public float f_26040;
      public float f_26041;
      public boolean f_26042;
      public final List<Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl> f_26043;
      public final List<Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl> f_26044;
      public static final int f_26045 = 16777215;

      public Class_35mRGIE8PAfJVyZl() {
         this.f_26034 = f_26045;
         this.f_26035 = "";
         this.f_26043 = new ArrayList<>();
         this.f_26044 = new ArrayList<>();
      }
   }

   public record FGPGl1GV3jp5WJ2z(float u, float v, float width, float height) {
      public float m_7714() {
         return this.u;
      }

      public float m_7715() {
         return this.v;
      }
   }

   public record LlfVhbfeCJgs1QvW(float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {
      public float centerZ() {
         return (this.minZ + this.maxZ) * 0.5F;
      }

      public float centerY() {
         return (this.minY + this.maxY) * 0.5F;
      }

      public float largestSize() {
         return Math.max(this.maxX - this.minX, Math.max(this.maxY - this.minY, this.maxZ - this.minZ));
      }

      public float centerX() {
         return (this.minX + this.maxX) * 0.5F;
      }
   }

   public static final class OEWgHNBow2JGSUTl {
      public float f_26046;
      public float f_26047;
      public float f_26048;
      public float f_26049;
      public float f_26050;
      public float f_26051;
      public float f_26052;
      public float f_26053;
      public float f_26054;
      public float f_26055;
      public float f_26056;
      public float f_26057;
      public float f_26058;
      public float f_26059;
      public float f_26060;
      public float f_26061;
      public float f_26062;
      public boolean f_26063;
      public final Map<String, Class_oAq4PeD1FSXoIaXR.FGPGl1GV3jp5WJ2z> f_26064 = new LinkedHashMap<>();
   }
}
