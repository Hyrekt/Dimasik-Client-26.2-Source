package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import lombok.Generated;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_hPXcxylpJibNeaCt extends Class_NO6SuGqq3FB7jQDZ {
   private final Class_w8fCJQ5ZtH5lQbWc f_23293;
   private final Class_w8fCJQ5ZtH5lQbWc f_23294;
   private final Class_w8fCJQ5ZtH5lQbWc f_23295;
   private final Map<Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c, Class_w8fCJQ5ZtH5lQbWc[]> f_23296;
   private final Set<Item> f_23297;
   private final Map<Integer, String> f_23298;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_23299;
   private final Class_gEPk7yDw6CwIte87<Class_0luV76OwW94UA9ep> f_23300;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_23301;
   private static final String f_23302 = "Cooldowns";
   private static final float f_23303 = 192.0F;
   private static final float f_23304 = 425.0F;
   private static final float f_23305 = 120.0F;
   private static final float f_23306 = 35.0F;
   private static final float f_23307 = 15.0F;
   private static final float f_23308 = 15.0F;
   private static final float f_23309 = 10.0F;
   private static final String f_23310 = "Задержки";
   private static final float f_23311 = 0.001F;
   private static final float f_23312 = 13.0F;
   private static final float f_23313 = 13.0F;
   private static final float f_23314 = 120.0F;
   private static final float f_23315 = 50.0F;
   private static final float f_23316 = 255.0F;
   private static final float f_23317 = 12.0F;
   private static final float f_23318 = 33.0F;
   private static final float f_23319 = 10.0F;
   private static final float f_23320 = 0.01F;
   private static final float f_23321 = 0.5F;
   private static final float f_23322 = 0.5F;
   private static final double f_23323 = 700.0;
   private static final float f_23324 = 0.55F;
   private static final float f_23325 = 10.0F;
   private static final float f_23326 = 33.0F;
   private static final float f_23327 = 20.0F;
   private static final float f_23328 = 1.4F;
   private static final String f_23329 = "O";
   private static final float f_23330 = 10.0F;
   private static final float f_23331 = 8.0F;
   private static final String f_23332 = "Cooldowns";
   private static final float f_23333 = 32.0F;
   private static final float f_23334 = 9.0F;
   private static final float f_23335 = 15.0F;
   private static final float f_23336 = -10.0F;
   private static final float f_23337 = 15.0F;
   private static final float f_23338 = 20.0F;
   private static final float f_23339 = 15.0F;
   private static final float f_23340 = 20.0F;
   private static final float f_23341 = -10.0F;
   private static final float f_23342 = 36.0F;
   private static final float f_23343 = 255.0F;
   private static final String f_23344 = "enchanted_golden_apple";
   private static final String f_23345 = "crossbow";
   private static final String f_23346 = "golden_apple";
   private static final String f_23347 = "crossbow_arrow";
   private static final float f_23348 = 10.0F;
   private static final float f_23349 = 2.5F;
   private static final float f_23350 = 16.0F;
   private static final float f_23351 = 16.0F;
   private static final float f_23352 = 30.0F;
   private static final float f_23353 = 2.5F;
   private static final float f_23354 = 13.0F;
   private static final float f_23355 = 10.0F;
   private static final float f_23356 = 2.5F;
   private static final float f_23357 = 36.0F;
   private static final float f_23358 = 36.0F;
   private static final float f_23359 = 20.0F;
   private static final float f_23360 = 7.0F;
   private static final String f_23361 = "%d:%02d";

   private List<Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c> m_7151() {
      ArrayList var1 = new ArrayList();
      if (f_11537.player == null) {
         return var1;
      }

      Class_i7qN6fWCX6JrM0uQ var2 = Class_i7qN6fWCX6JrM0uQ.m_7233();
      float var3 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
      this.f_23297.clear();

      for (Class_i7qN6fWCX6JrM0uQ.Class_17CWr7BjGPqwVJoH var5 : var2.m_7231()) {
         ItemStack var6 = var5.icon().getDefaultInstance();
         if (this.f_23297.add(var6.getItem())) {
            var1.add(new Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c(var5.item().name() + "", var6, this.m_7154(var5.remaining())));
         }
      }

      for (int var8 = 0; var8 < f_11537.player.getInventory().getContainerSize(); var8++) {
         ItemStack var9 = f_11537.player.getInventory().getItem(var8);
         if (!var9.isEmpty()) {
            Item var10 = var9.getItem();
            if (this.f_23297.add(var10) && !var2.m_7230(var10)) {
               float var7 = Class_Xw2DxVWUHvaJJDcA.m_5617(var9, var3);
               if (!(var7 <= 0.0F)) {
                  var1.add(new Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c(var10.getDescriptionId(), var9.copy(), this.m_7154(var7)));
               }
            }
         }
      }

      return var1;
   }

   // $VF: Unable to simplify switch-on-enum, as the enum class was not able to be found.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void m_7152(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_23310)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         List var2 = this.m_7151();
         boolean var3 = f_11537.gui.screen() instanceof ChatScreen || !var2.isEmpty();
         this.f_23295.m_9283(var3 ? 1.0F : 0.0F);
         if (!var3 && this.f_23295.m_9288() <= f_23311) {
            this.f_23296.clear();
            this.m_4012(0.0F);
            this.m_4007(0.0F);
         } else {
            float var4 = this.m_3998();
            float var5 = this.m_3993();
            float var6 = 0.0F;
            float var7 = 0.0F;

            for (Object var9_obj : var2) {
            Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c var9 = (Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c)var9_obj;
               var6 = Math.max(var6, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var9.m_7148().getString(), f_23312, 0.0F));
               var7 = Math.max(var7, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var9.m_7149(), f_23313, 0.0F));
            }

            float var29 = Math.max(f_23314, var6 + var7 + f_23315);
            this.f_23293.m_9283(var29);
            Class_Ssh31B3ljfKeWsvS.m_4864(f_23316 * this.f_23295.m_9288());
            this.m_4013();
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

            try {
               Class_U4Qsm43RVlUI3Pre.m_5188(var4, var5, this.f_23293.m_9288(), this.f_23294.m_9288(), f_23317);
               float var30 = Math.clamp((this.f_23294.m_9288() - f_23318) / f_23319, 0.0F, 1.0F);
               if (var30 > f_23320) {
                  int var10 = Class_BftdentXEtGbugJw.m_2306(
                     Class_BftdentXEtGbugJw.m_2312(
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO),
                        f_23321 + f_23322 * (float)Math.sin(System.currentTimeMillis() / f_23323)
                     ),
                     f_23324 * var30
                  );
                  int var11 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), 0.0F);
                  Class_U4Qsm43RVlUI3Pre.m_5220(
                     var4 + f_23325, var5 + f_23326, this.f_23293.m_9288() - f_23327, f_23328, new Vector4f(0.0F), new Vector4i(var11, var10, var10, var11)
                  );
               }

               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9591(), f_23329, var4 + f_23330, var5 + f_23331, 16, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
               );
               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  f_23332,
                  var4 + f_23333,
                  var5 + f_23334,
                  14,
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
               );
               ArrayList var31 = new ArrayList();

               for (int var32 = 0; var32 < var2.size(); var32++) {
                  Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c var12 = (Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c)var2.get(var32);
                  Class_w8fCJQ5ZtH5lQbWc[] var13 = this.f_23296.remove(var12);
                  if (var13 == null) {
                     var13 = new Class_w8fCJQ5ZtH5lQbWc[]{
                        new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23335),
                        new Class_w8fCJQ5ZtH5lQbWc(f_23336, f_23337),
                        new Class_w8fCJQ5ZtH5lQbWc(var32 * f_23338, f_23339)
                     };
                  }

                  this.f_23296.put(var12, var13);
                  var13[0].m_9283(1.0F);
                  var13[1].m_9283(0.0F);
                  var13[2].m_9283(var32 * f_23340);
               }

               for (Entry var35 : this.f_23296.entrySet()) {
                  if (!var2.contains(var35.getKey())) {
                     Class_w8fCJQ5ZtH5lQbWc[] var37 = (Class_w8fCJQ5ZtH5lQbWc[])var35.getValue();
                     var37[0].m_9283(0.0F);
                     var37[1].m_9283(f_23341);
                     if (var37[0].m_9280() && var37[1].m_9280()) {
                        var31.add((Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c)var35.getKey());
                     }
                  }
               }

               var31.forEach(this.f_23296::remove);

               for (Entry var36 : this.f_23296.entrySet()) {
                  Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c var38 = (Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c)var36.getKey();
                  Class_w8fCJQ5ZtH5lQbWc[] var14 = (Class_w8fCJQ5ZtH5lQbWc[])var36.getValue();
                  float var15 = var14[0].m_9288();
                  if (!(var15 <= 0.0F) || !var14[0].m_9280()) {
                     float var16 = var5 + f_23342 + var14[2].m_9288();
                     float var17 = var14[1].m_9288();
                     String var18 = var38.m_7149();
                     Class_Ssh31B3ljfKeWsvS.m_4864(var15 * f_23343);

                     ChatFormatting var19 = switch (var38.m_7150().getRarity().ordinal()) {
                        case 1 -> ChatFormatting.YELLOW;
                        case 2 -> ChatFormatting.AQUA;
                        case 3 -> ChatFormatting.LIGHT_PURPLE;
                        default -> null;
                     };
                     Object var20 = var19 == null ? var38.m_7148() : var38.m_7148().copy().setStyle(Style.EMPTY.withColor(var19));
                     Identifier var21 = BuiltInRegistries.ITEM.getKey(var38.m_7150().getItem());
                     String var22 = var21.getPath();

                     String var23 = switch (var22) {
                        case f_23344 -> f_23346;
                        case f_23345 -> f_23347;
                        default -> var22;
                     };
                     Identifier var39 = Identifier.fromNamespaceAndPath(var21.getNamespace(), var23 + "");
                     Class_U4Qsm43RVlUI3Pre.m_5184(
                        var4 + f_23348,
                        var16 + f_23349 + var17,
                        f_23350,
                        f_23351,
                        new Vector4f(0.0F),
                        new Vector4f(0.0F, 0.0F, 1.0F, 1.0F),
                        new Vector4i(-1),
                        var39
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5192(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        (Component)var20,
                        var4 + f_23352,
                        var16 + f_23353 + var17,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     );
                     float var40 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var18, f_23354, 0.0F);
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var18,
                        var4 + this.f_23293.m_9288() - f_23355 - var40,
                        var16 + f_23356 + var17,
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

            this.f_23294.m_9283(var2.isEmpty() ? f_23357 : f_23358 + var2.size() * f_23359 + f_23360);
            this.m_4012(this.f_23293.m_9288());
            this.m_4007(this.f_23294.m_9288());
         }
      }
   }

   public Class_hPXcxylpJibNeaCt() {
      super(f_23302, f_23303, f_23304, f_23305, f_23306);
      this.f_23293 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23307);
      this.f_23294 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23308);
      this.f_23295 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_23309);
      this.f_23296 = new HashMap<>();
      this.f_23297 = new HashSet<>();
      this.f_23298 = new HashMap<>();
      this.f_23299 = var0 -> Class_i7qN6fWCX6JrM0uQ.m_7233().m_7240();
      this.f_23300 = var0 -> Class_i7qN6fWCX6JrM0uQ.m_7233().m_7229();
      this.f_23301 = this::m_7152;
   }

   private String m_7154(float var1) {
      return this.f_23298.computeIfAbsent((int)Math.ceil(var1), var0 -> {
         int var1x = var0 / 60;
         int var2 = var0 % 60;
         return String.format(f_23361, var1x, var2);
      });
   }

   private static class soSB3ermcddVuI3c {
      public final String f_23290;
      public final ItemStack f_23291;
      public final String f_23292;

      @Override
      public int hashCode() {
         return Objects.hash(this.f_23290);
      }

      @Generated
      public String m_7147() {
         return this.f_23290;
      }

      public soSB3ermcddVuI3c(String var1, ItemStack var2, String var3) {
         this.f_23290 = var1;
         this.f_23291 = var2;
         this.f_23292 = var3;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else {
            return var1 instanceof Class_hPXcxylpJibNeaCt.soSB3ermcddVuI3c var2 ? this.f_23290.equals(var2.f_23290) : false;
         }
      }

      public Component m_7148() {
         return this.f_23291.getHoverName();
      }

      @Generated
      public String m_7149() {
         return this.f_23292;
      }

      @Generated
      public ItemStack m_7150() {
         return this.f_23291;
      }
   }
}
