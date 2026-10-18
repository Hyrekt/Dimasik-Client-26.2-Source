package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.KeyBind;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.gui.screens.ChatScreen;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_VZIpjPvwyHP3ChPv extends Class_NO6SuGqq3FB7jQDZ {
   private final Class_w8fCJQ5ZtH5lQbWc f_15397;
   private final Class_w8fCJQ5ZtH5lQbWc f_15398;
   private final Class_w8fCJQ5ZtH5lQbWc f_15399;
   private final Map<Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi, Class_w8fCJQ5ZtH5lQbWc[]> f_15400;
   private final List<Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi> f_15401;
   private final List<Class_VZIpjPvwyHP3ChPv.Rui3j5oVp4pYhHBU> f_15402;
   private final Map<Module, Integer> f_15403;
   private List<Module> f_15404;
   private long f_15405;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_15406;
   private static final String f_15407 = "Keybinds";
   private static final float f_15408 = 239.0F;
   private static final float f_15409 = 820.0F;
   private static final float f_15410 = 120.0F;
   private static final float f_15411 = 35.0F;
   private static final float f_15412 = 15.0F;
   private static final float f_15413 = 15.0F;
   private static final float f_15414 = 10.0F;
   private static final long f_15415 = Long.MIN_VALUE;
   private static final String f_15416 = "Горячие клавиши";
   private static final float f_15417 = 0.001F;
   private static final float f_15418 = 13.0F;
   private static final float f_15419 = 13.0F;
   private static final float f_15420 = 13.0F;
   private static final float f_15421 = 110.0F;
   private static final float f_15422 = 50.0F;
   private static final float f_15423 = 255.0F;
   private static final float f_15424 = 12.0F;
   private static final float f_15425 = 33.0F;
   private static final float f_15426 = 10.0F;
   private static final float f_15427 = 0.01F;
   private static final float f_15428 = 0.5F;
   private static final float f_15429 = 0.5F;
   private static final double f_15430 = 700.0;
   private static final float f_15431 = 0.55F;
   private static final float f_15432 = 10.0F;
   private static final float f_15433 = 33.0F;
   private static final float f_15434 = 20.0F;
   private static final float f_15435 = 1.4F;
   private static final String f_15436 = "@";
   private static final float f_15437 = 10.0F;
   private static final float f_15438 = 8.0F;
   private static final String f_15439 = "Keybinds";
   private static final float f_15440 = 32.0F;
   private static final float f_15441 = 9.0F;
   private static final float f_15442 = -10.0F;
   private static final float f_15443 = 36.0F;
   private static final float f_15444 = 255.0F;
   private static final float f_15445 = 32.0F;
   private static final float f_15446 = 2.5F;
   private static final float f_15447 = 10.0F;
   private static final float f_15448 = 13.0F;
   private static final float f_15449 = 2.5F;
   private static final float f_15450 = 10.0F;
   private static final float f_15451 = 3.0F;
   private static final float f_15452 = 36.0F;
   private static final float f_15453 = 15.0F;
   private static final float f_15454 = -10.0F;
   private static final float f_15455 = 15.0F;
   private static final float f_15456 = 15.0F;

   private List<Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi> m_5397() {
      ModuleManager var1 = DimasikClient.m_9057().m_9049().m_2801();
      long var2 = KeyBind.m_1368();
      boolean var4 = this.f_15405 != var2 || !this.f_15404.equals(var1);
      if (!var4) {
         for (Module var6 : var1) {
            if (this.f_15403.get(var6) != var6.m_780().size()) {
               var4 = true;
               break;
            }
         }
      }

      if (var4) {
         this.m_5398(var1, var2);
      }

      this.f_15401.clear();

      for (Class_VZIpjPvwyHP3ChPv.Rui3j5oVp4pYhHBU var8 : this.f_15402) {
         if (var8.module().m_776() && (var8.setting() == null || var8.setting().m_8768())) {
            this.f_15401.add(var8.item());
         }
      }

      return this.f_15401;
   }

   private void m_5398(List<Module> var1, long var2) {
      this.f_15402.clear();
      this.f_15403.clear();
      this.f_15404 = List.copyOf(var1);
      this.f_15405 = var2;

      for (Module var5 : var1) {
         this.f_15403.put(var5, var5.m_780().size());
         if (var5.m_779().m_1369() != -1) {
            this.f_15402
               .add(
                  new Class_VZIpjPvwyHP3ChPv.Rui3j5oVp4pYhHBU(
                     var5, null, new Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi(var5.m_793() + "", var5.m_793(), var5.m_785().m_8688(), var5.m_779().m_1369())
                  )
               );
         }

         for (Setting var7 : var5.m_780()) {
            if (var7 instanceof CheckboxSetting var8) {
               int var9 = var8.m_5183().m_1369();
               if (var9 >= 0) {
                  this.f_15402
                     .add(
                        new Class_VZIpjPvwyHP3ChPv.Rui3j5oVp4pYhHBU(
                           var5, var8, new Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi(var5.m_793() + var8.m_8764(), var8.m_8764(), var5.m_785().m_8688(), var9)
                        )
                     );
               }
            }
         }
      }
   }

   public Class_VZIpjPvwyHP3ChPv() {
      super(f_15407, f_15408, f_15409, f_15410, f_15411);
      this.f_15397 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_15412);
      this.f_15398 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_15413);
      this.f_15399 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_15414);
      this.f_15400 = new HashMap<>();
      this.f_15401 = new ArrayList<>();
      this.f_15402 = new ArrayList<>();
      this.f_15403 = new IdentityHashMap<>();
      this.f_15404 = List.of();
      this.f_15405 = f_15415;
      this.f_15406 = this::m_5399;
   }

   public void m_5399(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_15416)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         List var2 = this.m_5397();
         boolean var3 = f_11537.gui.screen() instanceof ChatScreen || !var2.isEmpty();
         this.f_15399.m_9283(var3 ? 1.0F : 0.0F);
         if (!var3 && this.f_15399.m_9288() <= f_15417) {
            this.f_15400.clear();
            this.m_4012(0.0F);
            this.m_4007(0.0F);
         } else {
            float var4 = this.m_3998();
            float var5 = this.m_3993();
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;

            for (Object var10_obj : var2) {
            Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi var10 = (Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi)var10_obj;
               var6 = Math.max(var6, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10.name(), f_15418, 0.0F));
               var7 = Math.max(var7, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(Class_vAC0cSmAiUV3cskz.m_9251(var10.key()), f_15419, 0.0F));
               var8 = Math.max(var8, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10.icon(), f_15420, 0.0F));
            }

            float var23 = Math.max(f_15421, var6 + var7 + var8 + f_15422);
            this.f_15397.m_9283(var23);
            Class_Ssh31B3ljfKeWsvS.m_4864(f_15423 * this.f_15399.m_9288());
            this.m_4013();
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

            try {
               Class_U4Qsm43RVlUI3Pre.m_5188(var4, var5, this.f_15397.m_9288(), this.f_15398.m_9288(), f_15424);
               float var24 = Math.clamp((this.f_15398.m_9288() - f_15425) / f_15426, 0.0F, 1.0F);
               if (var24 > f_15427) {
                  int var11 = Class_BftdentXEtGbugJw.m_2306(
                     Class_BftdentXEtGbugJw.m_2312(
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO),
                        f_15428 + f_15429 * (float)Math.sin(System.currentTimeMillis() / f_15430)
                     ),
                     f_15431 * var24
                  );
                  int var12 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), 0.0F);
                  Class_U4Qsm43RVlUI3Pre.m_5220(
                     var4 + f_15432, var5 + f_15433, this.f_15397.m_9288() - f_15434, f_15435, new Vector4f(0.0F), new Vector4i(var12, var11, var11, var12)
                  );
               }

               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9591(), f_15436, var4 + f_15437, var5 + f_15438, 16, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
               );
               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  f_15439,
                  var4 + f_15440,
                  var5 + f_15441,
                  14,
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
               );
               ArrayList var25 = new ArrayList();

               for (int var26 = 0; var26 < var2.size(); var26++) {
                  Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi var13 = (Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi)var2.get(var26);
                  int var14 = var26;
                  Class_w8fCJQ5ZtH5lQbWc[] var15 = this.f_15400
                     .computeIfAbsent(
                        var13,
                        var1x -> new Class_w8fCJQ5ZtH5lQbWc[]{
                           new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_15453),
                           new Class_w8fCJQ5ZtH5lQbWc(f_15454, f_15455),
                           new Class_w8fCJQ5ZtH5lQbWc(var14 * 20, f_15456)
                        }
                     );
                  var15[0].m_9283(1.0F);
                  var15[1].m_9283(0.0F);
                  float var16 = var26 * 20;
                  var15[2].m_9283(var16);
               }

               for (Entry var29 : this.f_15400.entrySet()) {
                  if (!var2.contains(var29.getKey())) {
                     Class_w8fCJQ5ZtH5lQbWc[] var31 = (Class_w8fCJQ5ZtH5lQbWc[])var29.getValue();
                     var31[0].m_9283(0.0F);
                     var31[1].m_9283(f_15442);
                     if (var31[0].m_9280() && var31[1].m_9280()) {
                        var25.add((Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi)var29.getKey());
                     }
                  }
               }

               var25.forEach(this.f_15400::remove);

               for (Entry var30 : this.f_15400.entrySet()) {
                  Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi var32 = (Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi)var30.getKey();
                  Class_w8fCJQ5ZtH5lQbWc[] var33 = (Class_w8fCJQ5ZtH5lQbWc[])var30.getValue();
                  float var34 = var33[0].m_9288();
                  if (!(var34 <= 0.0F) || !var33[0].m_9280()) {
                     float var17 = var5 + f_15443 + var33[2].m_9288();
                     String var18 = Class_vAC0cSmAiUV3cskz.m_9251(var32.key());
                     float var19 = var33[1].m_9288();
                     Class_Ssh31B3ljfKeWsvS.m_4864(var34 * f_15444);
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var32.name(),
                        var4 + f_15445,
                        var17 + f_15446 + var19,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var18,
                        var4 + this.f_15397.m_9288() - f_15447 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var18, f_15448, 0.0F),
                        var17 + f_15449 + var19,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9591(),
                        var32.icon(),
                        var4 + f_15450,
                        var17 + f_15451 + var19,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
                     );
                     Class_Ssh31B3ljfKeWsvS.m_4844();
                  }
               }
            } finally {
               Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
               Class_Ssh31B3ljfKeWsvS.m_4844();
               this.m_4005();
            }

            this.f_15398.m_9283(var2.isEmpty() ? f_15452 : 36 + var2.size() * 20 + 7);
            this.m_4012(this.f_15397.m_9288());
            this.m_4007(this.f_15398.m_9288());
         }
      }
   }

   private record BKlM91oVq4JbHufi(String id, String name, String icon, int key) {
      public String m_5396() {
         return this.id;
      }
   }

   private record Rui3j5oVp4pYhHBU(Module module, CheckboxSetting setting, Class_VZIpjPvwyHP3ChPv.BKlM91oVq4JbHufi item) {
   }
}
