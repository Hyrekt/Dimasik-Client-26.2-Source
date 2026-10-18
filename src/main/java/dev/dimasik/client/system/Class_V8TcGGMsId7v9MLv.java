package dev.dimasik.client.system;

import net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket;
import net.minecraft.network.protocol.game.ServerboundCommandSuggestionPacket;

public class Class_V8TcGGMsId7v9MLv extends Class_4DhobBIM8lTNckKj {
   public static final Class_QmNR03reugBgWiPr f_15352 = new Class_QmNR03reugBgWiPr();
   public static final Class_QmNR03reugBgWiPr f_15353 = new Class_QmNR03reugBgWiPr();
   public static long f_15354;
   public static int f_15355;
   public static boolean f_15356;
   private final Class_gEPk7yDw6CwIte87<Class_pYAz0kgoyIbaaR5n> f_15357 = this::m_5381;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_15358 = this::m_5382;
   private static final double f_15359 = 5000.0;
   private static final double f_15360 = 180.0;
   private static final String f_15361 = "w ";

   private void m_5381(Class_pYAz0kgoyIbaaR5n var1) {
      if (f_15353.m_4458(f_15359) || f_15356 && f_15353.m_4458(f_15360)) {
         Class_3LQSDrJ0WJYOQ7ck.m_1295(new ServerboundCommandSuggestionPacket(1337, f_15361));
         f_15354 = System.currentTimeMillis();
         f_15352.m_4459();
         f_15353.m_4459();
         f_15356 = false;
      }
   }

   private void m_5382(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundCommandSuggestionsPacket var2 && var2.id() == 1337) {
         f_15355 = Math.clamp(System.currentTimeMillis() - f_15354, 0, 1000);
         f_15356 = true;
      }
   }
}
