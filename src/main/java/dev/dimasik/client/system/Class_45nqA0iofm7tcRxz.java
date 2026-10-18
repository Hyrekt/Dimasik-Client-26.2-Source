package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.render.SwingAnimations;
import java.util.Map.Entry;

public class Class_45nqA0iofm7tcRxz extends Class_XWvsgVpnvA3CjeNU {
   private final boolean f_1573;
   private static final String f_1574 = "dimasik/configs";
   private static final String f_1575 = "module";
   private static final String f_1576 = "State";
   private static final String f_1577 = "AutoBuy";
   private static final String f_1578 = "Enabled";
   private static final String f_1579 = "Wing";
   private static final String f_1580 = "WingsOnSelf";
   private static final String f_1581 = "WingsOnFriends";
   private static final String f_1582 = "WingsOnOthers";
   private static final String f_1583 = "SkinChanger";
   private static final String f_1584 = "ItemReplacer";
   private static final String f_1585 = "SwordItemReplacer";
   private static final String f_1586 = "MaceItemReplacer";
   private static final String f_1587 = "HatsEnabled";
   private static final String f_1588 = "Hat";
   private static final String f_1589 = "MasksEnabled";
   private static final String f_1590 = "Mask";
   private static final String f_1591 = "BackpacksEnabled";
   private static final String f_1592 = "Backpack";
   private static final String f_1593 = "PetsEnabled";
   private static final String f_1594 = "Models";
   private static final String f_1595 = "Furry";
   private static final String f_1596 = "Cosmetics";
   private static final String f_1597 = "Theme";
   private static final String f_1598 = "HudPositions";
   private static final String f_1599 = "AutoBuy";
   private static final String f_1600 = "AutoBuy";
   private static final String f_1601 = "State";
   private static final String f_1602 = "Cosmetics";
   private static final String f_1603 = "Cosmetics";
   private static final String f_1604 = "Enabled";
   private static final String f_1605 = "Enabled";
   private static final String f_1606 = "Wing";
   private static final String f_1607 = "Wing";
   private static final String f_1608 = "WingsOnSelf";
   private static final String f_1609 = "WingsOnSelf";
   private static final String f_1610 = "WingsOnFriends";
   private static final String f_1611 = "WingsOnFriends";
   private static final String f_1612 = "WingsOnOthers";
   private static final String f_1613 = "WingsOnOthers";
   private static final String f_1614 = "SkinChanger";
   private static final String f_1615 = "SkinChanger";
   private static final String f_1616 = "ItemReplacer";
   private static final String f_1617 = "ItemReplacer";
   private static final String f_1618 = "SwordItemReplacer";
   private static final String f_1619 = "SwordItemReplacer";
   private static final String f_1620 = "MaceItemReplacer";
   private static final String f_1621 = "MaceItemReplacer";
   private static final String f_1622 = "ItemReplacer";
   private static final String f_1623 = "ItemReplacer";
   private static final String f_1624 = "HatsEnabled";
   private static final String f_1625 = "HatsEnabled";
   private static final String f_1626 = "Hat";
   private static final String f_1627 = "Hat";
   private static final String f_1628 = "MasksEnabled";
   private static final String f_1629 = "MasksEnabled";
   private static final String f_1630 = "Mask";
   private static final String f_1631 = "Mask";
   private static final String f_1632 = "BackpacksEnabled";
   private static final String f_1633 = "BackpacksEnabled";
   private static final String f_1634 = "Backpack";
   private static final String f_1635 = "Backpack";
   private static final String f_1636 = "PetsEnabled";
   private static final String f_1637 = "PetsEnabled";
   private static final String f_1638 = "Models";
   private static final String f_1639 = "Models";
   private static final String f_1640 = "Models";
   private static final String f_1641 = "Furry";
   private static final String f_1642 = "Furry";
   private static final String f_1643 = "Furry";
   private static final String f_1644 = "Theme";
   private static final String f_1645 = "Theme";
   private static final String f_1646 = "Theme";
   private static final String f_1647 = "HudPositions";
   private static final String f_1648 = "HudPositions";
   private static final String f_1649 = "HudPositions";

   @Override
   protected void m_808() {
      String var1 = this.m_5557();
      if (!var1.isEmpty()) {
         JsonParser var2 = new JsonParser();
         JsonObject var3 = var2.parse(var1).getAsJsonObject();

         for (Module var5 : DimasikClient.m_9057().m_9049().m_2801()) {
            if ((!this.f_1573 || !(var5 instanceof SwingAnimations)) && var3.has(var5.m_793())) {
               var5.m_791(var3.get(var5.m_793()).getAsJsonObject());
            }
         }

         DimasikClient.m_9057().m_9049().m_2801().m_3442().m_8280();
         if (var3.has(f_1599)) {
            JsonObject var18 = var3.getAsJsonObject(f_1600);
            var18.addProperty(f_1601, false);
            DimasikClient.m_9057().m_9049().m_2801().m_3503().m_791(var18);
         }

         if (var3.has(f_1602)) {
            JsonObject var19 = var3.getAsJsonObject(f_1603);
            if (var19.has(f_1604)) {
               Class_rsrLB4fiDOF3z0YM.m_8514(var19.get(f_1605).getAsBoolean());
            }

            if (var19.has(f_1606)) {
               try {
                  Class_rsrLB4fiDOF3z0YM.m_8504(Class_WzvV6cpDDR1F4aeD.valueOf(var19.get(f_1607).getAsString()));
               } catch (IllegalArgumentException var17) {
                  Class_rsrLB4fiDOF3z0YM.m_8504(Class_WzvV6cpDDR1F4aeD.ANGEL);
               }
            }

            if (var19.has(f_1608)) {
               Class_rsrLB4fiDOF3z0YM.m_8485(var19.get(f_1609).getAsBoolean());
            }

            if (var19.has(f_1610)) {
               Class_rsrLB4fiDOF3z0YM.m_8492(var19.get(f_1611).getAsBoolean());
            }

            if (var19.has(f_1612)) {
               Class_rsrLB4fiDOF3z0YM.m_8487(var19.get(f_1613).getAsBoolean());
            }

            if (var19.has(f_1614)) {
               Class_rsrLB4fiDOF3z0YM.m_8507(var19.get(f_1615).getAsBoolean());
            }

            if (var19.has(f_1616)) {
               try {
                  Class_rsrLB4fiDOF3z0YM.m_8486(Class_m52tuSNQY8S356Ab.valueOf(var19.get(f_1617).getAsString()));
               } catch (IllegalArgumentException var16) {
                  Class_rsrLB4fiDOF3z0YM.m_8486(Class_m52tuSNQY8S356Ab.ABOMINABLE_BLADE);
               }
            }

            if (var19.has(f_1618)) {
               try {
                  Class_rsrLB4fiDOF3z0YM.m_8494(Class_m52tuSNQY8S356Ab.valueOf(var19.get(f_1619).getAsString()));
               } catch (IllegalArgumentException var15) {
                  Class_rsrLB4fiDOF3z0YM.m_8494(Class_m52tuSNQY8S356Ab.ABOMINABLE_BLADE);
               }
            }

            if (var19.has(f_1620)) {
               try {
                  Class_rsrLB4fiDOF3z0YM.m_8482(Class_m52tuSNQY8S356Ab.valueOf(var19.get(f_1621).getAsString()));
               } catch (IllegalArgumentException var14) {
                  Class_rsrLB4fiDOF3z0YM.m_8482(Class_m52tuSNQY8S356Ab.ABOMINABLE_BLADE);
               }
            } else if (var19.has(f_1622)) {
               try {
                  Class_rsrLB4fiDOF3z0YM.m_8482(Class_m52tuSNQY8S356Ab.valueOf(var19.get(f_1623).getAsString()));
               } catch (IllegalArgumentException var13) {
                  Class_rsrLB4fiDOF3z0YM.m_8482(Class_m52tuSNQY8S356Ab.ABOMINABLE_BLADE);
               }
            }

            if (var19.has(f_1624)) {
               Class_rsrLB4fiDOF3z0YM.m_8521(var19.get(f_1625).getAsBoolean());
            }

            if (var19.has(f_1626)) {
               Class_rsrLB4fiDOF3z0YM.m_8522(var19.get(f_1627).getAsString());
            }

            if (var19.has(f_1628)) {
               Class_rsrLB4fiDOF3z0YM.m_8495(var19.get(f_1629).getAsBoolean());
            }

            if (var19.has(f_1630)) {
               try {
                  Class_rsrLB4fiDOF3z0YM.m_8505(Class_MTimUzoN9N9ZQr5T.valueOf(var19.get(f_1631).getAsString()));
               } catch (IllegalArgumentException var12) {
                  Class_rsrLB4fiDOF3z0YM.m_8505(Class_MTimUzoN9N9ZQr5T.SMILING_SUNGLASSES);
               }
            }

            if (var19.has(f_1632)) {
               Class_rsrLB4fiDOF3z0YM.m_8503(var19.get(f_1633).getAsBoolean());
            }

            if (var19.has(f_1634)) {
               try {
                  Class_rsrLB4fiDOF3z0YM.m_8502(Class_LdeJaBYCxAYq5SO6.valueOf(var19.get(f_1635).getAsString()));
               } catch (IllegalArgumentException var11) {
                  Class_rsrLB4fiDOF3z0YM.m_8502(Class_LdeJaBYCxAYq5SO6.LEATHER);
               }
            }

            if (var19.has(f_1636)) {
               Class_rsrLB4fiDOF3z0YM.m_8520(var19.get(f_1637).getAsBoolean());
            }

            if (var19.has(f_1638) && var19.get(f_1639).isJsonObject()) {
               JsonObject var21 = var19.getAsJsonObject(f_1640);

               for (Entry var7 : var21.entrySet()) {
                  try {
                     Class_rsrLB4fiDOF3z0YM.m_8523(Class_HSD91zSgdqsM5q0d.m_2887((String)var7.getKey()), ((JsonElement)var7.getValue()).getAsString());
                  } catch (IllegalArgumentException var10) {
                  }
               }
            }

            if (var19.has(f_1641) && var19.get(f_1642).isJsonObject()) {
               JsonObject var22 = var19.getAsJsonObject(f_1643);

               for (Entry var24 : var22.entrySet()) {
                  try {
                     Class_rsrLB4fiDOF3z0YM.m_8513(Class_HSD91zSgdqsM5q0d.m_2887((String)var24.getKey()), ((JsonElement)var24.getValue()).getAsBoolean());
                  } catch (IllegalArgumentException var9) {
                  }
               }
            }
         }

         if (var3.has(f_1644) && var3.get(f_1645).isJsonObject()) {
            Class_3DEWOEl8zI8DBsJL var20 = DimasikClient.m_9057().m_9049().m_2812();
            var20.m_1233(var3.getAsJsonObject(f_1646));
            var20.m_1250();
         }

         if (var3.has(f_1647) && var3.get(f_1648).isJsonObject()) {
            Class_8jWMtShKXpT6Bwm7.m_1867(var3.getAsJsonObject(f_1649));
         }
      }
   }

   public Class_45nqA0iofm7tcRxz(String var1, String var2) {
      super(var1, var2);
      this.f_1573 = true;
   }

   public void m_1342(Module var1) {
      if (!this.f_1573 || !(var1 instanceof SwingAnimations)) {
         String var2 = this.m_5557();
         if (!var2.isEmpty()) {
            JsonParser var3 = new JsonParser();
            JsonObject var4 = var3.parse(var2).getAsJsonObject();
            if (var4.has(var1.m_793())) {
               var1.m_791(var4.get(var1.m_793()).getAsJsonObject());
            }
         }
      }
   }

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();

      for (Module var3 : DimasikClient.m_9057().m_9049().m_2801()) {
         if (!this.f_1573 || !(var3 instanceof SwingAnimations)) {
            var1.add(var3.m_793(), var3.m_782());
         }
      }

      JsonObject var11 = DimasikClient.m_9057().m_9049().m_2801().m_3503().m_782();
      var11.addProperty(f_1576, false);
      var1.add(f_1577, var11);
      JsonObject var12 = new JsonObject();
      var12.addProperty(f_1578, Class_rsrLB4fiDOF3z0YM.m_8469());
      var12.addProperty(f_1579, Class_rsrLB4fiDOF3z0YM.m_8484().name());
      var12.addProperty(f_1580, Class_rsrLB4fiDOF3z0YM.m_8478());
      var12.addProperty(f_1581, Class_rsrLB4fiDOF3z0YM.m_8497());
      var12.addProperty(f_1582, Class_rsrLB4fiDOF3z0YM.m_8474());
      var12.addProperty(f_1583, Class_rsrLB4fiDOF3z0YM.m_8496());
      var12.addProperty(f_1584, Class_rsrLB4fiDOF3z0YM.m_8481().name());
      var12.addProperty(f_1585, Class_rsrLB4fiDOF3z0YM.m_8488().name());
      var12.addProperty(f_1586, Class_rsrLB4fiDOF3z0YM.m_8483().name());
      var12.addProperty(f_1587, Class_rsrLB4fiDOF3z0YM.m_8499());
      var12.addProperty(f_1588, Class_rsrLB4fiDOF3z0YM.m_8512());
      var12.addProperty(f_1589, Class_rsrLB4fiDOF3z0YM.m_8508());
      var12.addProperty(f_1590, Class_rsrLB4fiDOF3z0YM.m_8510().name());
      var12.addProperty(f_1591, Class_rsrLB4fiDOF3z0YM.m_8468());
      var12.addProperty(f_1592, Class_rsrLB4fiDOF3z0YM.m_8518().name());
      var12.addProperty(f_1593, Class_rsrLB4fiDOF3z0YM.m_8479());
      JsonObject var4 = new JsonObject();
      JsonObject var5 = new JsonObject();

      for (Class_HSD91zSgdqsM5q0d var9 : Class_HSD91zSgdqsM5q0d.values()) {
         if (Class_rsrLB4fiDOF3z0YM.m_8473(var9)) {
            String var10 = Class_rsrLB4fiDOF3z0YM.m_8472(var9);
            if (var10 != null && !var10.isEmpty()) {
               var4.addProperty(var9.m_2888(), var10);
            }
         }

         if (var9.m_2889()) {
            var5.addProperty(var9.m_2888(), Class_rsrLB4fiDOF3z0YM.m_8480(var9));
         }
      }

      var12.add(f_1594, var4);
      var12.add(f_1595, var5);
      var1.add(f_1596, var12);
      var1.add(f_1597, DimasikClient.m_9057().m_9049().m_2812().m_1234());
      var1.add(f_1598, Class_8jWMtShKXpT6Bwm7.m_1868());
      this.m_5558(var1);
   }

   public Class_45nqA0iofm7tcRxz() {
      super(f_1574, f_1575);
      this.f_1573 = false;
   }
}
