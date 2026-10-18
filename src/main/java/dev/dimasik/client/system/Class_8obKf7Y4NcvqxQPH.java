package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.gui.screens.ChatScreen;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_8obKf7Y4NcvqxQPH extends Class_NO6SuGqq3FB7jQDZ {
   private final Class_xzn9431ICoBNtkQe f_4411 = new Class_xzn9431ICoBNtkQe();
   private final Class_w8fCJQ5ZtH5lQbWc f_4412;
   private final Class_w8fCJQ5ZtH5lQbWc f_4413;
   private final Class_w8fCJQ5ZtH5lQbWc f_4414;
   private final Map<Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A, Class_w8fCJQ5ZtH5lQbWc[]> f_4415;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4416;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_4417;
   private static final String f_4418 = "StaffList";
   private static final float f_4419 = 1720.0F;
   private static final float f_4420 = 645.0F;
   private static final float f_4421 = 120.0F;
   private static final float f_4422 = 35.0F;
   private static final float f_4423 = 15.0F;
   private static final float f_4424 = 15.0F;
   private static final float f_4425 = 10.0F;
   private static final String f_4426 = "Персонал";
   private static final float f_4427 = 0.001F;
   private static final float f_4428 = 13.0F;
   private static final float f_4429 = 13.0F;
   private static final float f_4430 = 13.0F;
   private static final float f_4431 = 100.0F;
   private static final float f_4432 = 50.0F;
   private static final float f_4433 = 255.0F;
   private static final float f_4434 = 12.0F;
   private static final float f_4435 = 33.0F;
   private static final float f_4436 = 10.0F;
   private static final float f_4437 = 0.01F;
   private static final float f_4438 = 0.5F;
   private static final float f_4439 = 0.5F;
   private static final double f_4440 = 700.0;
   private static final float f_4441 = 0.55F;
   private static final float f_4442 = 10.0F;
   private static final float f_4443 = 33.0F;
   private static final float f_4444 = 20.0F;
   private static final float f_4445 = 1.4F;
   private static final String f_4446 = "O";
   private static final float f_4447 = 10.0F;
   private static final float f_4448 = 8.0F;
   private static final String f_4449 = "StaffList";
   private static final float f_4450 = 32.0F;
   private static final float f_4451 = 9.0F;
   private static final float f_4452 = -10.0F;
   private static final float f_4453 = 36.0F;
   private static final float f_4454 = 255.0F;
   private static final float f_4455 = 10.0F;
   private static final float f_4456 = 2.5F;
   private static final float f_4457 = 10.0F;
   private static final float f_4458 = 13.0F;
   private static final float f_4459 = 2.5F;
   private static final float f_4460 = 10.0F;
   private static final float f_4461 = 13.0F;
   private static final float f_4462 = 2.5F;
   private static final float f_4463 = 36.0F;
   private static final float f_4464 = 15.0F;
   private static final float f_4465 = -10.0F;
   private static final float f_4466 = 15.0F;
   private static final float f_4467 = 15.0F;

   public Class_8obKf7Y4NcvqxQPH() {
      super(f_4418, f_4419, f_4420, f_4421, f_4422);
      this.f_4412 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_4423);
      this.f_4413 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_4424);
      this.f_4414 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_4425);
      this.f_4415 = new HashMap<>();
      this.f_4416 = var1 -> this.f_4411.m_9578();
      this.f_4417 = this::m_1885;
   }

   private List<Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A> m_1884() {
      return this.f_4411.m_9583();
   }

   public void m_1885(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_4426)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         List var2 = this.m_1884();
         boolean var3 = f_11537.gui.screen() instanceof ChatScreen || !var2.isEmpty();
         this.f_4414.m_9283(var3 ? 1.0F : 0.0F);
         if (!var3 && this.f_4414.m_9288() <= f_4427) {
            this.f_4415.clear();
            this.m_4012(0.0F);
            this.m_4007(0.0F);
         } else {
            float var4 = this.m_3998();
            float var5 = this.m_3993();
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;

            for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var10 : (Iterable<Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A>) (Iterable) var2) {
               var6 = Math.max(var6, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10.m_9574(), f_4428, 0.0F));
               var7 = Math.max(var7, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10.m_9576().getString(), f_4429, 0.0F));
               var8 = Math.max(var8, Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10.m_9575().m_1877(), f_4430, 0.0F));
            }

            float var23 = Math.max(f_4431, var6 + var7 + var8 + f_4432);
            this.f_4412.m_9283(var23);
            Class_Ssh31B3ljfKeWsvS.m_4864(f_4433 * this.f_4414.m_9288());
            this.m_4013();
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

            try {
               Class_U4Qsm43RVlUI3Pre.m_5188(var4, var5, this.f_4412.m_9288(), this.f_4413.m_9288(), f_4434);
               float var24 = Math.clamp((this.f_4413.m_9288() - f_4435) / f_4436, 0.0F, 1.0F);
               if (var24 > f_4437) {
                  int var11 = Class_BftdentXEtGbugJw.m_2306(
                     Class_BftdentXEtGbugJw.m_2312(
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO),
                        f_4438 + f_4439 * (float)Math.sin(System.currentTimeMillis() / f_4440)
                     ),
                     f_4441 * var24
                  );
                  int var12 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), 0.0F);
                  Class_U4Qsm43RVlUI3Pre.m_5220(
                     var4 + f_4442, var5 + f_4443, this.f_4412.m_9288() - f_4444, f_4445, new Vector4f(0.0F), new Vector4i(var12, var11, var11, var12)
                  );
               }

               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9591(), f_4446, var4 + f_4447, var5 + f_4448, 16, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
               );
               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9588(), f_4449, var4 + f_4450, var5 + f_4451, 14, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
               );
               ArrayList var25 = new ArrayList();

               for (int var26 = 0; var26 < var2.size(); var26++) {
                  Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var13 = (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A)var2.get(var26);
                  int var14 = var26;
                  Class_w8fCJQ5ZtH5lQbWc[] var15 = this.f_4415
                     .computeIfAbsent(
                        var13,
                        var1x -> new Class_w8fCJQ5ZtH5lQbWc[]{
                           new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_4464), new Class_w8fCJQ5ZtH5lQbWc(f_4465, f_4466), new Class_w8fCJQ5ZtH5lQbWc(var14 * 20, f_4467)
                        }
                     );
                  var15[0].m_9283(1.0F);
                  var15[1].m_9283(0.0F);
                  float var16 = var26 * 20;
                  var15[2].m_9283(var16);
               }

               for (Entry var29 : this.f_4415.entrySet()) {
                  if (!var2.contains(var29.getKey())) {
                     Class_w8fCJQ5ZtH5lQbWc[] var31 = (Class_w8fCJQ5ZtH5lQbWc[])var29.getValue();
                     var31[0].m_9283(0.0F);
                     var31[1].m_9283(f_4452);
                     if (var31[0].m_9280() && var31[1].m_9280()) {
                        var25.add((Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A)var29.getKey());
                     }
                  }
               }

               var25.forEach(this.f_4415::remove);

               for (Entry var30 : this.f_4415.entrySet()) {
                  Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var32 = (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A)var30.getKey();
                  Class_w8fCJQ5ZtH5lQbWc[] var33 = (Class_w8fCJQ5ZtH5lQbWc[])var30.getValue();
                  float var34 = var33[0].m_9288();
                  if (!(var34 <= 0.0F) || !var33[0].m_9280()) {
                     float var17 = var5 + f_4453 + var33[2].m_9288();
                     String var18 = var32.m_9574();
                     float var19 = var33[1].m_9288();
                     Class_Ssh31B3ljfKeWsvS.m_4864(var34 * f_4454);
                     Class_U4Qsm43RVlUI3Pre.m_5192(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var32.m_9576(),
                        var4 + f_4455,
                        var17 + f_4456 + var19,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var18,
                        var4 + f_4457 + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var32.m_9576().getString() + "", f_4458, 0.0F),
                        var17 + f_4459 + var19,
                        13,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
                     );
                     Class_U4Qsm43RVlUI3Pre.m_5186(
                        Class_y1y6QpONhWEUIdEB.m_9588(),
                        var32.m_9575().m_1877(),
                        var4 + this.f_4412.m_9288() - f_4460 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var32.m_9575().m_1877(), f_4461, 0.0F),
                        var17 + f_4462 + var19,
                        13,
                        var32.m_9575().f_4410
                     );
                     Class_Ssh31B3ljfKeWsvS.m_4844();
                  }
               }
            } finally {
               Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
               Class_Ssh31B3ljfKeWsvS.m_4844();
               this.m_4005();
            }

            this.f_4413.m_9283(var2.isEmpty() ? f_4463 : 36 + var2.size() * 20 + 7);
            this.m_4012(this.f_4412.m_9288());
            this.m_4007(this.f_4413.m_9288());
         }
      }
   }

   public enum Jl39eBgNSHoO7kez {
      NONE("Active", "W", 195, 195, 195),
      VANISH("Spec", "i", 255, 95, 95),
      SPECTATOR("GM3", "d", 255, 190, 80);

      public final String f_4405;
      public final String f_4406;
      public final int f_4407;
      public final int f_4408;
      public final int f_4409;
      public final int f_4410;

      Jl39eBgNSHoO7kez(String var3, String var4, int var5, int var6, int var7) {
         this.f_4405 = var3;
         this.f_4406 = var4;
         this.f_4407 = var5;
         this.f_4408 = var6;
         this.f_4409 = var7;
         this.f_4410 = Class_BftdentXEtGbugJw.m_2310(var5, var6, var7);
      }

      public String m_1877() {
         return this.f_4405;
      }

      public String m_1878() {
         return this.f_4406;
      }

      public int m_1879() {
         return this.f_4410;
      }

      public int m_1880() {
         return this.f_4407;
      }

      public int m_1881() {
         return this.f_4408;
      }

      public int m_1882() {
         return this.f_4409;
      }
   }
}
