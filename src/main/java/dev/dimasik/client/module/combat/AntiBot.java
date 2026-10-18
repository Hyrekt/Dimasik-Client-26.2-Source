package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_85GsaT81C7qK5rCn;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.UUIDUtil;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.player.Player;

public class AntiBot extends Module {
   private final MultiChoiceSetting f_33161;
   private final CheckboxSetting f_33162;
   public final List<Player> f_33163;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_33164;
   private static final String f_33165 = "AntiBot";
   private static final String f_33166 = "Игнорирует ботов от античита";
   private static final String f_33167 = "Мод";
   private static final String f_33168 = "Matrix";
   private static final String f_33169 = "Sloth AC";
   private static final String f_33170 = "Удалять бота";
   private static final String f_33171 = "Matrix";
   private static final String f_33172 = "Sloth AC";

   private void m_9219() {
      for (Player var2 : f_11537.level.players()) {
         if (this.m_9223(var2)) {
            this.f_33163.remove(var2);
         } else if (!this.f_33163.contains(var2)) {
            String var3 = this.m_9224(var2);
            if (var3 != null) {
               boolean var4 = !var2.getUUID().equals(UUIDUtil.createOfflinePlayerUUID(var3));
               if (var4) {
                  this.m_9220(var2);
               }
            }
         }
      }
   }

   private void m_9220(Player var1) {
      this.f_33163.add(var1);
      if (this.f_33162.m_8768()) {
         var1.remove(RemovalReason.DISCARDED);
      }
   }

   private void m_9221() {
      for (Player var2 : f_11537.level.players()) {
         if (var2 != f_11537.player && var2.isInvisible() && !this.f_33163.contains(var2) && Class_85GsaT81C7qK5rCn.m_1755(var2).getString().isEmpty()) {
            this.m_9220(var2);
         }
      }
   }

   public void m_9222(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_33161.m_7568(f_33171)) {
         this.m_9219();
      } else if (this.f_33161.m_7568(f_33172)) {
         this.m_9221();
      }
   }

   private boolean m_9223(Player var1) {
      if (var1 != null && var1.getGameProfile() != null) {
         DimasikClient var2 = DimasikClient.m_9057();
         if (var2 != null && var2.m_9049() != null && var2.m_9049().m_2804() != null) {
            String var3 = var1.getGameProfile().name();
            return var3 != null && var2.m_9049().m_2804().m_2877(var3);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private String m_9224(Player var1) {
      return var1 != null && var1.getGameProfile() != null ? var1.getGameProfile().name() : null;
   }

   public AntiBot() {
      super(f_33165, f_33166, Category.COMBAT);
      this.f_33161 = new MultiChoiceSetting(f_33167, new Class_2ZaVm8TGDJ68TnJB(f_33168), new Class_2ZaVm8TGDJ68TnJB(f_33169));
      this.f_33162 = new CheckboxSetting(f_33170, false);
      this.f_33163 = new ArrayList<>();
      this.f_33164 = new Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK>() {
         @Override
         public int m_1780() {
            return -1000;
         }

         public void m_1781(Class_Xu9btcIeUN33XnMK var1) {
            AntiBot.this.m_9222(var1);
         }
      };
      this.m_795(this.f_33161, this.f_33162);
   }

   @Override
   public void m_778() {
      super.m_778();
   }

   @Override
   public void m_732() {
      super.m_732();
      if (!this.f_33163.isEmpty()) {
         this.f_33163.clear();
      }
   }
}
