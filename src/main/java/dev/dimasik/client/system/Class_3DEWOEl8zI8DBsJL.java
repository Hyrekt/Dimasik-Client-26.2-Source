package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dev.dimasik.client.setting.impl.ColorSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

public class Class_3DEWOEl8zI8DBsJL extends CopyOnWriteArrayList<Class_TLKj0wt8AJxKO3Vd> {
   private final EnumMap<Class_y3cvEHXTSEF5dp8q, ColorSetting> f_1276 = new EnumMap<>(Class_y3cvEHXTSEF5dp8q.class);
   private final Map<String, int[]> f_1277 = new LinkedHashMap<>();
   private Class_TLKj0wt8AJxKO3Vd f_1278;
   private Class_TLKj0wt8AJxKO3Vd f_1279;
   private boolean f_1280;
   private int[] f_1281;
   private boolean f_1282;
   private Runnable f_1283 = () -> {};
   private static final String f_1284 = "User";
   private static final String f_1285 = "Готовые";
   private static final String f_1286 = "listed";
   private static final String f_1287 = "ready";
   private static final String f_1288 = "rainbow";
   private static final String f_1289 = "name";
   private static final String f_1290 = "colors";
   private static final String f_1291 = "ready";
   private static final String f_1292 = "ready";
   private static final String f_1293 = "rainbow";
   private static final String f_1294 = "rainbow";
   private static final String f_1295 = "name";
   private static final String f_1296 = "name";
   private static final String f_1297 = "listed";
   private static final String f_1298 = "listed";
   private static final String f_1299 = "Ready";
   private static final String f_1300 = "Готовые";
   private static final String f_1301 = "colors";
   private static final String f_1302 = "colors";
   private static final String f_1303 = "colors";
   private static final String f_1304 = "Готовые";
   private static final String f_1305 = "dimasik";
   private static final String f_1306 = "Ocean";
   private static final String f_1307 = "Interface";
   private static final String f_1308 = "Interface";
   private static final String f_1309 = "Ocean";
   private static final String f_1310 = "Ocean";
   private static final String f_1311 = "Готовые";

   public synchronized String m_1220() {
      return this.f_1278 == null ? "" : this.f_1278.m_4983();
   }

   public synchronized boolean m_1221() {
      return this.f_1279 == null && this.f_1278 != null && this.f_1278.m_4981();
   }

   public synchronized void m_1222(List<Class_TLKj0wt8AJxKO3Vd> var1, String var2) {
      this.m_1259(var1, var2, null);
   }

   public synchronized boolean m_1223(Class_TLKj0wt8AJxKO3Vd var1) {
      return var1 == null ? false : this.m_1240(var1.m_4983());
   }

   public synchronized boolean m_1224(String var1) {
      Class_TLKj0wt8AJxKO3Vd var2 = this.m_1242(var1);
      return var2 == null ? false : this.m_1235(var2);
   }

   private Class_TLKj0wt8AJxKO3Vd m_1225() {
      Class_TLKj0wt8AJxKO3Vd var1 = this.m_1242(f_1306);
      if (var1 != null && !var1.m_4981()) {
         return var1;
      }

      for (Class_TLKj0wt8AJxKO3Vd var3 : this) {
         if (!var3.m_4981()) {
            return var3;
         }
      }

      return null;
   }

   public synchronized boolean m_1227(Class_TLKj0wt8AJxKO3Vd var1) {
      if (var1 != null && !this.m_1253(var1.m_4983())) {
         boolean var2 = super.add(var1);
         if (var2) {
            this.m_1250();
         }

         return var2;
      } else {
         return false;
      }
   }

   public synchronized void m_1228() {
      if (!this.f_1282 && this.f_1279 == null && this.f_1278 != null && this.f_1278.m_4981()) {
         int[] var1 = this.m_1248();
         this.f_1278.m_4979(var1);
         this.f_1281 = Arrays.copyOf(var1, var1.length);
         this.m_1250();
      }
   }

   public synchronized Class_TLKj0wt8AJxKO3Vd m_1229(String var1, int[] var2, boolean var3) {
      String var4 = this.m_1231(var1);
      if (!var4.isBlank() && var2 != null) {
         if (this.f_1279 == null && this.f_1278 != null && this.f_1278.m_4981()) {
            this.m_1244();
         }

         this.removeIf(var0 -> var0.m_4981() && f_1311.equals(var0.m_4984()));
         this.f_1279 = new Class_TLKj0wt8AJxKO3Vd(var4, f_1285, false, var2);
         this.f_1280 = var3 || Class_kWZasNpv5Yr1lp11.m_7460(var4);
         this.m_1245(var2);
         this.f_1281 = this.m_1248();
         this.m_1250();
         return this.f_1279;
      } else {
         return null;
      }
   }

   public synchronized Class_TLKj0wt8AJxKO3Vd m_1230(String var1) {
      return this.m_1239(var1, f_1284);
   }

   private String m_1231(String var1) {
      return var1 == null ? "" : var1.trim();
   }

   public synchronized ColorSetting m_1232(Class_y3cvEHXTSEF5dp8q var1) {
      return this.f_1276.get(var1);
   }

   public synchronized void m_1233(JsonObject var1) {
      if (var1 != null) {
         this.f_1282 = true;

         try {
            boolean var2 = var1.has(f_1291) && var1.get(f_1292).getAsBoolean();
            boolean var3 = var1.has(f_1293) && var1.get(f_1294).getAsBoolean();
            String var4 = var1.has(f_1295) ? var1.get(f_1296).getAsString() : "";
            String var5 = var1.has(f_1297) ? var1.get(f_1298).getAsString() : "";
            int[] var6 = this.m_1255(var1);
            if (!var2 || var6 == null) {
               this.f_1279 = null;
               this.f_1280 = false;
               Class_TLKj0wt8AJxKO3Vd var11 = this.m_1242(var5.isBlank() ? var4 : var5);
               if (var11 == null) {
                  var11 = this.m_1242(var4);
               }

               if (var11 == null) {
                  var11 = this.m_1225();
               }

               this.f_1278 = var11;
               if (var6 != null) {
                  this.m_1245(var6);
                  if (this.f_1278 != null && this.f_1278.m_4981()) {
                     this.f_1278.m_4979(var6);
                  }
               } else if (this.f_1278 != null) {
                  this.m_1245(this.f_1278.m_4982());
               }

               this.f_1281 = this.m_1248();
               return;
            }

            String var7 = this.m_1231(var4.isBlank() ? f_1299 : var4);
            this.f_1279 = new Class_TLKj0wt8AJxKO3Vd(var7, f_1300, false, var6);
            this.f_1280 = var3 || Class_kWZasNpv5Yr1lp11.m_7460(var7);
            this.m_1245(var6);
            this.f_1281 = this.m_1248();
         } finally {
            this.f_1282 = false;
         }
      }
   }

   public synchronized JsonObject m_1234() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(f_1286, this.m_1220());
      var1.addProperty(f_1287, this.f_1279 != null);
      var1.addProperty(f_1288, this.m_1247());
      var1.addProperty(f_1289, this.m_1260());
      JsonArray var2 = new JsonArray();

      for (int var6 : this.m_1248()) {
         var2.add(var6);
      }

      var1.add(f_1290, var2);
      return var1;
   }

   public synchronized boolean m_1235(Class_TLKj0wt8AJxKO3Vd var1) {
      if (var1 == null) {
         return false;
      }

      Class_TLKj0wt8AJxKO3Vd var2 = this.m_1242(var1.m_4983());
      if (var2 == null) {
         return false;
      }

      if (this.f_1279 == null && this.f_1278 != null && this.f_1278.m_4981()) {
         this.m_1244();
      }

      this.f_1279 = null;
      this.f_1280 = false;
      this.f_1278 = var2;
      this.m_1245(this.f_1278.m_4982());
      this.f_1281 = this.m_1248();
      this.m_1250();
      return true;
   }

   public synchronized void m_1236() {
      if (!this.f_1282 && this.f_1279 == null && this.f_1278 != null && this.f_1278.m_4981()) {
         int[] var1 = this.m_1248();
         if (!Arrays.equals(this.f_1281, var1)) {
            this.f_1278.m_4979(var1);
            this.f_1281 = Arrays.copyOf(var1, var1.length);
            this.m_1250();
         }
      }
   }

   public synchronized List<String> m_1238() {
      ArrayList var1 = new ArrayList();

      for (Class_TLKj0wt8AJxKO3Vd var3 : this) {
         var1.add(var3.m_4983());
      }

      return var1;
   }

   public synchronized Class_TLKj0wt8AJxKO3Vd m_1239(String var1, String var2) {
      String var3 = this.m_1231(var1);
      if (var3.isBlank()) {
         return null;
      }

      if (this.m_1253(var3)) {
         return null;
      }

      Class_TLKj0wt8AJxKO3Vd var4 = new Class_TLKj0wt8AJxKO3Vd(var3, var2, true, this.m_1248());
      boolean var5 = super.add(var4);
      if (!var5) {
         return null;
      }

      this.m_1235(var4);
      return var4;
   }

   public synchronized boolean m_1240(String var1) {
      Class_TLKj0wt8AJxKO3Vd var2 = this.m_1242(var1);
      if (var2 != null && var2.m_4981()) {
         boolean var3 = this.f_1278 == var2;
         boolean var4 = super.remove(var2);
         if (!var4) {
            return false;
         }

         if (var3) {
            this.m_1256();
         }

         this.m_1250();
         return true;
      } else {
         return false;
      }
   }

   public Class_3DEWOEl8zI8DBsJL() {
      for (Class_y3cvEHXTSEF5dp8q var4 : Class_y3cvEHXTSEF5dp8q.values()) {
         this.f_1276.put(var4, new ColorSetting(var4.m_9593(), true, 0));
      }

      this.f_1277.putAll(Class_kwBO8RFugdW04Dpy.m_7475());
      this.m_1251();
      this.m_1256();
      this.f_1281 = this.m_1248();
   }

   private int[] m_1241() {
      int[] var1 = this.f_1277.get(f_1309);
      return var1 != null ? var1 : Class_kwBO8RFugdW04Dpy.m_7475().get(f_1310);
   }

   public synchronized Class_TLKj0wt8AJxKO3Vd m_1242(String var1) {
      if (var1 == null) {
         return null;
      }

      for (Class_TLKj0wt8AJxKO3Vd var3 : this) {
         if (var3.m_4983().equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public synchronized Class_TLKj0wt8AJxKO3Vd m_1243() {
      return this.f_1279 != null ? this.f_1279 : this.f_1278;
   }

   private void m_1244() {
      if (this.f_1278 != null && this.f_1278.m_4981()) {
         this.f_1278.m_4979(this.m_1248());
      }
   }

   private void m_1245(int[] var1) {
      if (var1 != null) {
         Class_y3cvEHXTSEF5dp8q[] var2 = Class_y3cvEHXTSEF5dp8q.values();
         int[] var3 = this.m_1241();

         for (int var4 = 0; var4 < var2.length; var4++) {
            ColorSetting var5 = this.f_1276.get(var2[var4]);
            if (var5 != null) {
               int var6;
               if (var4 < var1.length) {
                  var6 = var1[var4];
               } else {
                  if (var3 == null || var4 >= var3.length) {
                     continue;
                  }

                  var6 = var3[var4];
               }

               if (var6 >>> 24 == 0 && f_1308.equals(var2[var4].m_9594()) && var3 != null && var4 < var3.length && var3[var4] >>> 24 != 0) {
                  var6 = var3[var4];
               }

               var5.m_823(var6);
            }
         }
      }
   }

   public synchronized List<Class_TLKj0wt8AJxKO3Vd> m_1246() {
      ArrayList var1 = new ArrayList();

      for (Class_TLKj0wt8AJxKO3Vd var3 : this) {
         if (var3.m_4981()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public synchronized boolean m_1247() {
      return this.f_1280 && this.f_1279 != null;
   }

   public synchronized int[] m_1248() {
      Class_y3cvEHXTSEF5dp8q[] var1 = Class_y3cvEHXTSEF5dp8q.values();
      int[] var2 = new int[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         ColorSetting var4 = this.f_1276.get(var1[var3]);
         var2[var3] = var4 == null ? 0 : var4.m_8768();
      }

      return var2;
   }

   public synchronized void m_1249() {
      int[] var1 = this.m_1241();
      if (var1 != null) {
         Class_y3cvEHXTSEF5dp8q[] var2 = Class_y3cvEHXTSEF5dp8q.values();
         boolean var3 = false;

         for (int var4 = 0; var4 < var2.length; var4++) {
            if (f_1307.equals(var2[var4].m_9594())) {
               ColorSetting var5 = this.f_1276.get(var2[var4]);
               if (var5 != null && var5.m_8768() >>> 24 == 0) {
                  int var6 = var4 < var1.length ? var1[var4] : 0;
                  if (var6 >>> 24 != 0) {
                     var5.m_823(var6);
                     var3 = true;
                  }
               }
            }
         }

         if (var3) {
            this.f_1281 = this.m_1248();
            if (this.f_1278 != null && this.f_1278.m_4981()) {
               this.f_1278.m_4979(this.f_1281);
            }

            this.m_1250();
         }
      }
   }

   public synchronized void m_1250() {
      if (!this.f_1282) {
         this.f_1283.run();
      }
   }

   private void m_1251() {
      for (Entry var2 : this.f_1277.entrySet()) {
         super.add(new Class_TLKj0wt8AJxKO3Vd((String)var2.getKey(), f_1305, false, (int[])var2.getValue()));
      }
   }

   public synchronized boolean m_1252() {
      return this.f_1279 != null;
   }

   public synchronized boolean m_1253(String var1) {
      return this.m_1242(var1) != null;
   }

   private int[] m_1255(JsonObject var1) {
      if (var1 != null && var1.has(f_1301) && var1.get(f_1302).isJsonArray()) {
         JsonArray var2 = var1.getAsJsonArray(f_1303);
         int[] var3 = new int[var2.size()];

         for (int var4 = 0; var4 < var2.size(); var4++) {
            var3[var4] = var2.get(var4).getAsInt();
         }

         return var3;
      } else {
         return null;
      }
   }

   private void m_1256() {
      this.f_1279 = null;
      this.f_1280 = false;
      Class_TLKj0wt8AJxKO3Vd var1 = this.m_1225();
      this.f_1278 = var1;
      if (var1 != null) {
         this.m_1245(var1.m_4982());
      }

      this.f_1281 = this.m_1248();
   }

   public synchronized Class_TLKj0wt8AJxKO3Vd m_1257(String var1, int[] var2) {
      return this.m_1229(var1, var2, Class_kWZasNpv5Yr1lp11.m_7460(var1));
   }

   public synchronized void m_1258(Runnable var1) {
      this.f_1283 = var1 == null ? () -> {} : var1;
   }

   public synchronized void m_1259(List<Class_TLKj0wt8AJxKO3Vd> var1, String var2, JsonObject var3) {
      this.f_1282 = true;
      this.removeIf(Class_TLKj0wt8AJxKO3Vd::m_4981);
      if (var1 != null) {
         for (Class_TLKj0wt8AJxKO3Vd var5 : var1) {
            if (var5 != null && var5.m_4981() && !f_1304.equals(var5.m_4984()) && !this.m_1253(var5.m_4983())) {
               super.add(var5);
            }
         }
      }

      this.f_1279 = null;
      this.f_1280 = false;
      Class_TLKj0wt8AJxKO3Vd var6 = this.m_1242(var2);
      if (var6 == null) {
         var6 = this.m_1225();
      }

      this.f_1278 = var6;
      if (this.f_1278 != null) {
         this.m_1245(this.f_1278.m_4982());
      }

      this.f_1281 = this.m_1248();
      this.f_1282 = false;
      if (var3 != null) {
         this.m_1233(var3);
      }

      this.m_1249();
   }

   public synchronized String m_1260() {
      Class_TLKj0wt8AJxKO3Vd var1 = this.m_1243();
      return var1 == null ? "" : var1.m_4983();
   }
}
