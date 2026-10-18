package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_3q8kKNGNpsKuAxlp extends Class_oRlzNKqPjTwmgkNL {
   private static final float f_1429 = 32.0F;
   private static final float f_1430 = 10.0F;
   private static final float f_1431 = 20.0F;
   private static final float f_1432 = 25.0F;
   private static final Vector4f f_1433 = new Vector4f(0.0F);
   private static final Vector4i f_1434 = new Vector4i(-1);
   private static final float f_1435 = 20.0F;
   private static final float f_1436 = 30.0F;
   private final String f_1437;
   private final Integer f_1438;
   private final ItemStack f_1439;
   private final Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U f_1440 = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U();
   private static final long f_1441 = 1500L;
   private static final float f_1442 = 10.0F;
   private static final float f_1443 = 25.0F;
   private static final float f_1444 = 20.0F;
   private static final float f_1445 = 30.0F;
   private static final float f_1446 = 32.0F;
   private static final String f_1447 = "H";
   private static final String f_1448 = "I";
   private static final String f_1449 = "M";
   private static final float f_1450 = 255.0F;
   private static final float f_1451 = 9.0F;
   private static final float f_1452 = 10.0F;
   private static final float f_1453 = 6.0F;
   private static final float f_1454 = 20.0F;
   private static final float f_1455 = 20.0F;
   private static final float f_1456 = 25.0F;
   private static final float f_1457 = 15.5F;
   private static final float f_1458 = 15.0F;
   private static final float f_1459 = 20.0F;
   private static final float f_1460 = 15.5F;
   private static final float f_1461 = 16.0F;
   private static final float f_1462 = 17.0F;
   private static final float f_1463 = 14.5F;
   private static final float f_1464 = 0.28F;
   private static final float f_1465 = 0.72F;
   private static final float f_1466 = 5.75F;
   private static final float f_1467 = 5.75F;
   private static final float f_1468 = 13.5F;
   private static final float f_1469 = 1.65F;
   private static final float f_1470 = 0.001F;
   private static final float f_1471 = 5.75F;
   private static final float f_1472 = 5.75F;
   private static final float f_1473 = 13.5F;
   private static final float f_1474 = 1.65F;
   private static final String f_1475 = "H";
   private static final String f_1476 = "I";
   private static final String f_1477 = "r";
   private static final String f_1478 = "s";

   public Class_3q8kKNGNpsKuAxlp(String var1, Component var2, int var3, ItemStack var4) {
      this(var1, var2, var3, var4, f_1441);
   }

   @Generated
   public Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U m_1320() {
      return this.f_1440;
   }

   @Generated
   public Integer m_1321() {
      return this.f_1438;
   }

   @Override
   public float m_1322() {
      return Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_26204.getString(), 14)
         + f_1442
         + (this.m_1325() ? f_1443 : 0.0F)
         + (this.m_1324() ? f_1444 : 0.0F)
         + f_1445;
   }

   @Override
   public void m_1323(float var1, float var2, float var3) {
      this.m_7757(var3);
      boolean var4 = this.m_7760();
      this.f_26208.m_9283(var4 ? 0.0F : 1.0F);
      this.f_26207.m_9283(this.f_26209 && var4 ? var3 - 2.0F : var3);
      float var5 = var2 + this.f_26207.m_9288();
      float var6 = this.f_26208.m_9288();
      float var7 = this.m_1322();

      int var8 = switch (this.f_1437) {
         case f_1447 -> Class_BftdentXEtGbugJw.m_2310(22, 251, 27);
         case f_1448 -> Class_BftdentXEtGbugJw.m_2310(251, 22, 22);
         case f_1449 -> Class_BftdentXEtGbugJw.m_2310(255, 165, 0);
         default -> this.f_1438;
      };
      float var17 = Mth.clamp(1.0F - (float)this.f_26206.m_4462() / (float)this.f_26205, 0.0F, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4864(f_1450 * var6);
      Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
      Class_U4Qsm43RVlUI3Pre.m_5188(var1, var5 - 1.0F, var7, this.m_1327(), f_1451);
      float var18 = var1 + f_1452;
      if (this.m_1325()) {
         Class_U4Qsm43RVlUI3Pre.m_5202(var18, var5 - 1.0F + f_1453, f_1454, f_1455, f_1433, f_1434, this.f_1439, this.f_1440);
         var18 += f_1456;
      }

      String var11 = this.m_1329();
      if (!var11.isEmpty()) {
         float var12 = Class_Ssh31B3ljfKeWsvS.m_4863(Class_y1y6QpONhWEUIdEB.m_9591(), var11, var5 + f_1457, f_1458);
         Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), var11, var18 + 1.0F, var12 + 1.0F, 12, var8);
         var18 += f_1459;
      }

      float var19 = Class_Ssh31B3ljfKeWsvS.m_4839(Class_y1y6QpONhWEUIdEB.m_9588(), var5 + f_1460, f_1461);
      Class_U4Qsm43RVlUI3Pre.m_5192(
         Class_y1y6QpONhWEUIdEB.m_9588(), this.f_26204, var18, var19, 14, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
      );
      float var13 = var1 + var7 - f_1462;
      float var14 = var5 + f_1463;
      int var15 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT), f_1464);
      int var16 = Class_BftdentXEtGbugJw.m_2312(var8, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT), f_1465);
      Class_U4Qsm43RVlUI3Pre.m_5191(var13 - f_1466, var14 - f_1467, f_1468, f_1469, 1.0F, var15);
      if (var17 > f_1470) {
         Class_U4Qsm43RVlUI3Pre.m_5191(var13 - f_1471, var14 - f_1472, f_1473, f_1474, var17, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN));
      }

      Class_Ssh31B3ljfKeWsvS.m_4844();
      Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
   }

   public Class_3q8kKNGNpsKuAxlp(String var1, Component var2, int var3) {
      this(var1, var2, var3, ItemStack.EMPTY);
   }

   private boolean m_1324() {
      return !this.m_1329().isEmpty();
   }

   public Class_3q8kKNGNpsKuAxlp(String var1, Component var2, int var3, ItemStack var4, long var5) {
      super(var2, var5);
      this.f_1437 = var1;
      this.f_1438 = var3;
      this.f_1439 = var4 != null && !var4.isEmpty() ? var4.copy() : ItemStack.EMPTY;
   }

   private boolean m_1325() {
      return !this.f_1439.isEmpty();
   }

   @Generated
   public ItemStack m_1326() {
      return this.f_1439;
   }

   public Class_3q8kKNGNpsKuAxlp(String var1, String var2, int var3) {
      this(var1, Component.literal(var2), var3, ItemStack.EMPTY);
   }

   @Override
   public float m_1327() {
      return f_1446;
   }

   @Generated
   public String m_1328() {
      return this.f_1437;
   }

   private String m_1329() {
      return switch (this.f_1437) {
         case f_1475 -> f_1477;
         case f_1476 -> f_1478;
         default -> "";
      };
   }
}
