package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.SwingAnimations;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.repository.PackRepository;

public final class Class_X574GcHt0SazS9zo {
   private static final String f_15771 = "holdmyitems:pack_test";
   private static boolean f_15772;
   private static Boolean f_15773;
   private static final String f_15774 = "HMI";
   private static final String f_15775 = "holdmyitems:pack_test";
   private static final String f_15776 = "holdmyitems:pack_test";
   private static final String f_15777 = "holdmyitems:pack_test";
   private static final String f_15778 = "holdmyitems:pack_test";

   public static boolean m_5499() {
      DimasikClient var0 = DimasikClient.m_9057();
      if (var0 != null && var0.m_9049() != null && var0.m_9049().m_2801() != null) {
         SwingAnimations var1 = var0.m_9049().m_2801().m_3563();
         return var1 != null && var1.m_776() && var1.f_24134.m_7568(f_15774);
      } else {
         return false;
      }
   }

   public static void m_5500() {
      if (f_15772) {
         Minecraft var0 = Minecraft.getInstance();
         PackRepository var1 = var0.getResourcePackRepository();
         boolean var2 = m_5499();
         if (f_15773 == null || f_15773 != var2) {
            f_15773 = var2;
            boolean var3 = var1.getSelectedIds().contains(f_15775);
            if (var3 != var2) {
               ArrayList var4 = new ArrayList(var1.getSelectedIds());
               if (var2) {
                  if (!var4.contains(f_15776)) {
                     var4.add(f_15777);
                  }
               } else {
                  var4.remove(f_15778);
               }

               var1.setSelected(var4);
               var0.reloadResourcePacks();
            }
         }
      }
   }

   private Class_X574GcHt0SazS9zo() {
   }

   public static void m_5501() {
      if (!f_15772) {
         f_15772 = true;
         new Class_tjdtKxsAEogQMtun().onInitialize();
      }
   }
}
