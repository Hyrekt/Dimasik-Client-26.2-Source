package dev.dimasik.client.module.render;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;

public class ItemPhysics extends Module {
   private static final String f_19088 = "ItemPhysics";
   private static final String f_19089 = "Реалистичная физика предметов на земле";

   public ItemPhysics() {
      super(f_19088, f_19089, Category.RENDER);
   }

   public static boolean m_6371() {
      ItemPhysics var0 = DimasikClient.m_9057().m_9049().m_2801().m_3419();
      return var0 != null && var0.m_776();
   }
}
