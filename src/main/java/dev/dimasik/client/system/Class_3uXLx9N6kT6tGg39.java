package dev.dimasik.client.system;

import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.DimasikClient;
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_3uXLx9N6kT6tGg39 extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private static final long f_1483 = 190000000L;
   private final Class_w8fCJQ5ZtH5lQbWc f_1484;
   private final List<Class_3uXLx9N6kT6tGg39.aGgsZIm1HUDTBk04> f_1485;
   private String f_1486;
   private int f_1487;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_1488;
   private static final String f_1489 = "WaterMark";
   private static final float f_1490 = 41.0F;
   private static final float f_1491 = 44.0F;
   private static final float f_1492 = 120.0F;
   private static final float f_1493 = 35.0F;
   private static final float f_1494 = 12.0F;
   private static final String f_1495 = "Логотип";
   private static final float f_1496 = 130.0F;
   private static final String f_1497 = "P";
   private static final float f_1498 = 17.0F;
   private static final String f_1499 = "U";
   private static final float f_1500 = 13.0F;
   private static final String f_1501 = "|";
   private static final float f_1502 = 13.0F;
   private static final float f_1503 = 13.0F;
   private static final float f_1504 = 13.0F;
   private static final float f_1505 = 34.0F;
   private static final float f_1506 = 34.0F;
   private static final float f_1507 = 12.0F;
   private static final String f_1508 = "P";
   private static final float f_1509 = 10.0F;
   private static final float f_1510 = 6.0F;
   private static final float f_1511 = 18.0F;
   private static final String f_1512 = "P";
   private static final float f_1513 = 17.0F;
   private static final float f_1514 = 17.0F;
   private static final float f_1515 = 3.0F;
   private static final float f_1516 = 6.0F;
   private static final float f_1517 = 6.0F;
   private static final float f_1518 = 2.5F;
   private static final float f_1519 = 14.0F;
   private static final float f_1520 = 17.0F;
   private static final float f_1521 = 11.0F;
   private static final float f_1522 = 20.0F;
   private static final float f_1523 = 20.0F;
   private static final float f_1524 = 9.0F;
   private static final float f_1525 = 0.125F;
   private static final float f_1526 = 28.0F;
   private static final float f_1527 = 9.0F;
   private static final float f_1528 = 13.0F;
   private static final float f_1529 = 36.0F;
   private static final float f_1530 = 17.0F;
   private static final float f_1531 = 3.0F;
   private static final float f_1532 = 6.0F;
   private static final float f_1533 = 6.0F;
   private static final float f_1534 = 2.5F;
   private static final float f_1535 = 14.0F;
   private static final String f_1536 = "U";
   private static final float f_1537 = 9.0F;
   private static final String f_1538 = "U";
   private static final float f_1539 = 13.0F;
   private static final float f_1540 = 8.0F;
   private static final float f_1541 = 16.0F;
   private static final String f_1542 = "U";
   private static final float f_1543 = 13.0F;
   private static final float f_1544 = 17.0F;
   private static final float f_1545 = 3.0F;
   private static final float f_1546 = 6.0F;
   private static final float f_1547 = 6.0F;
   private static final float f_1548 = 2.5F;
   private static final float f_1549 = 14.0F;
   private static final String f_1550 = "|";
   private static final float f_1551 = 9.0F;
   private static final String f_1552 = "|";
   private static final float f_1553 = 13.0F;
   private static final float f_1554 = 8.0F;
   private static final float f_1555 = 9.0F;
   private static final String f_1556 = " ms";
   private static final float f_1557 = 13.0F;
   private static final String f_1558 = "|";
   private static final float f_1559 = 13.0F;
   private static final float f_1560 = 8.0F;
   private static final float f_1561 = 9.0F;
   private static final float f_1562 = 9.0F;
   private static final float f_1563 = 13.0F;
   private static final double f_1564 = 3.0;
   private static final float f_1565 = 6.0F;
   private static final double f_1566 = Math.PI;
   private static final float f_1567 = 0.28F;
   private static final float f_1568 = 6.0F;
   private static final float f_1569 = 6.0F;
   private static final float f_1570 = 13.0F;
   private static final String f_1571 = " fps";
   private static final float f_1572 = 13.0F;

   public Class_3uXLx9N6kT6tGg39() {
      super(f_1489, f_1490, f_1491, f_1492, f_1493);
      this.f_1484 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_1494, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_1485 = new ArrayList<>();
      this.f_1486 = "";
      this.f_1487 = -1;
      this.f_1488 = this::m_1339;
   }

   @Override
   public void m_1333() {
   }

   private void m_1334(float var1) {
      int var2 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT);
      int var3 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      float var4 = this.m_3993() + f_1562;
      long var5 = System.nanoTime();

      for (int var7 = 0; var7 < this.f_1485.size(); var7++) {
         Class_3uXLx9N6kT6tGg39.aGgsZIm1HUDTBk04 var8 = this.f_1485.get(var7);
         float var9 = var1 + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(this.f_1486.substring(0, var7), f_1563, 0.0F);
         float var10 = var8.m_1331(var5);
         float var11 = 1.0F - (float)Math.pow(1.0F - var10, f_1564);
         if (var10 < 1.0F) {
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), var8.f_1479, var9, var4 - var11 * f_1565, 13, Class_BftdentXEtGbugJw.m_2306(var2, 1.0F - var11)
            );
            float var12 = (float)Math.sin(var10 * f_1566);
            int var13 = Class_BftdentXEtGbugJw.m_2312(var2, var3, var12 * f_1567);
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), var8.f_1480, var9, var4 + f_1568 - var11 * f_1569, 13, Class_BftdentXEtGbugJw.m_2306(var13, var11)
            );
         } else {
            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var8.f_1480, var9, var4, 13, var2);
         }
      }

      float var14 = var1 + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(this.f_1486, f_1570, 0.0F);
      Class_U4Qsm43RVlUI3Pre.m_5186(
         Class_y1y6QpONhWEUIdEB.m_9588(), f_1571, var14, var4, 13, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
      );
   }

   private boolean m_1335() {
      long var1 = System.nanoTime();

      for (Class_3uXLx9N6kT6tGg39.aGgsZIm1HUDTBk04 var4 : this.f_1485) {
         if (var4.m_1331(var1) < 1.0F) {
            return true;
         }
      }

      return false;
   }

   private void m_1336(String var1) {
      this.f_1485.clear();

      for (int var2 = 0; var2 < var1.length(); var2++) {
         this.f_1485.add(new Class_3uXLx9N6kT6tGg39.aGgsZIm1HUDTBk04(var1.charAt(var2)));
      }
   }

   private float m_1337() {
      return Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(this.f_1486 + "", f_1572, 0.0F);
   }

   private void m_1338(String var1) {
      if (var1.length() != this.f_1485.size()) {
         this.f_1486 = var1;
         this.m_1336(var1);
      } else {
         long var2 = System.nanoTime();

         for (int var4 = 0; var4 < var1.length(); var4++) {
            this.f_1485.get(var4).m_1332(var1.charAt(var4), var2);
         }

         this.f_1486 = var1;
      }
   }

   public void m_1339(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_1495)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         this.m_1341();
         float var10001 = f_1496
            + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1497, f_1498, 0.0F)
            + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1499, f_1500, 0.0F)
            + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1501, f_1502, 0.0F)
            + this.f_1484.m_9288()
            + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(Class_izWUmV9vkI9fgiey.m_7352(f_11537.player) + "", f_1503, 0.0F);
         Class_BLXqtQf5zJDEHDFr var10002 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383();
         Object var10003 = null;
         var10003 = null;
         this.m_4012(var10001 + var10002.m_2157("cracked by @soezproject & Vkontakt3", f_1504, 0.0F));
         this.m_4007(f_1505);
         float var2 = this.m_3998();
         float var3 = this.m_3993();
         this.m_4013();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5188(var2, var3 - 1.0F, this.f_11520, f_1506, f_1507);
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9591(), f_1508, var2 + f_1509, var3 + f_1510, 17, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
            );
            var2 += f_1511 + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1512, f_1513, 0.0F);
            Class_U4Qsm43RVlUI3Pre.m_5199(var2, var3 + f_1514 - f_1515, f_1516, f_1517, f_1518, Class_BftdentXEtGbugJw.m_2310(108, 108, 108));
            var2 += f_1519;
            GpuTextureView var4 = Class_7CxJH622IPbYv0YY.m_1608(f_11537.player);
            Class_U4Qsm43RVlUI3Pre.m_5209(var2, var3 + f_1520 - f_1521, f_1522, f_1523, new Vector4f(f_1524), new Vector4f(f_1525), new Vector4i(-1), var4);
            Class_jZQ0pP9BTU3L7miy var10000 = Class_y1y6QpONhWEUIdEB.m_9588();
            // nulls removed
            Class_U4Qsm43RVlUI3Pre.m_5186(
               var10000,
               "cracked by @soezproject & Vkontakt3",
               var2 + f_1526,
               var3 + f_1527,
               13,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
            );
            Class_BLXqtQf5zJDEHDFr var16 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383();
            Object var17 = null;
            var17 = null;
            var2 += var16.m_2157("cracked by @soezproject & Vkontakt3", f_1528, 0.0F) + f_1529;
            Class_U4Qsm43RVlUI3Pre.m_5199(var2, var3 + f_1530 - f_1531, f_1532, f_1533, f_1534, Class_BftdentXEtGbugJw.m_2310(108, 108, 108));
            var2 += f_1535;
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9591(), f_1536, var2, var3 + f_1537, 13, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
            );
            this.m_1334(var2 + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1538, f_1539, 0.0F) + f_1540);
            var2 += this.f_1484.m_9288() + f_1541 + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1542, f_1543, 0.0F);
            Class_U4Qsm43RVlUI3Pre.m_5199(var2, var3 + f_1544 - f_1545, f_1546, f_1547, f_1548, Class_BftdentXEtGbugJw.m_2310(108, 108, 108));
            var2 += f_1549;
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9591(), f_1550, var2, var3 + f_1551, 13, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
            );
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               Class_izWUmV9vkI9fgiey.m_7352(f_11537.player) + "",
               var2 + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1552, f_1553, 0.0F) + f_1554,
               var3 + f_1555,
               13,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
            );
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               f_1556,
               var2
                  + Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(Class_izWUmV9vkI9fgiey.m_7352(f_11537.player) + "", f_1557, 0.0F)
                  + Class_y1y6QpONhWEUIdEB.m_9591().m_7383().m_2157(f_1558, f_1559, 0.0F)
                  + f_1560,
               var3 + f_1561,
               13,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
            );
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            this.m_4005();
         }
      }
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      return false;
   }

   private void m_1341() {
      int var1 = f_11537.getFps();
      if (this.f_1486.isEmpty()) {
         this.f_1486 = Integer.toString(var1);
         this.m_1336(this.f_1486);
         this.f_1484.m_9281(this.m_1337());
      } else {
         this.f_1487 = !this.f_1486.equals(Integer.toString(var1)) ? var1 : -1;
      }

      if (!this.m_1335() && this.f_1487 >= 0) {
         String var2 = Integer.toString(this.f_1487);
         this.f_1487 = -1;
         this.m_1338(var2);
      }

      this.f_1484.m_9283(this.m_1337());
   }

   private static final class aGgsZIm1HUDTBk04 {
      public String f_1479;
      public String f_1480;
      public long f_1481;
      public static final float f_1482 = 1.9E8F;

      public aGgsZIm1HUDTBk04(char var1) {
         this.f_1479 = Character.toString(var1);
         this.f_1480 = this.f_1479;
         this.f_1481 = 0L;
      }

      public float m_1331(long var1) {
         return this.f_1481 == 0L ? 1.0F : Math.clamp((float)(var1 - this.f_1481) / f_1482, 0.0F, 1.0F);
      }

      public void m_1332(char var1, long var2) {
         String var4 = Character.toString(var1);
         if (!this.f_1480.equals(var4)) {
            this.f_1479 = this.f_1480;
            this.f_1480 = var4;
            this.f_1481 = var2;
         }
      }
   }
}
