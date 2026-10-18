package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_8obKf7Y4NcvqxQPH;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_a7M44oHQPwN0rL5A;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_gXPXh2FDkuYBeJW2;
import dev.dimasik.client.system.Class_xzn9431ICoBNtkQe;
import net.minecraft.world.entity.player.Player;

public final class AutoLeave extends Module {
   private static final long f_7778 = 15000L;
   private final ItemListSetting f_7779;
   private final MultiChoiceSetting f_7780;
   private final CheckboxSetting f_7781;
   private final SliderSetting f_7782;
   private final SliderSetting f_7783;
   private final CheckboxSetting f_7784;
   private final Class_xzn9431ICoBNtkQe f_7785;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_7786;
   private final Class_gEPk7yDw6CwIte87<Class_a7M44oHQPwN0rL5A> f_7787;
   private long f_7788;
   private boolean f_7789;
   private String f_7790;
   private static final String f_7791 = "AutoLeave";
   private static final String f_7792 = "Уходит с сервера при опасных условиях выбранным способом";
   private static final String f_7793 = "Ливать если";
   private static final String f_7794 = "Мало здоровья";
   private static final String f_7795 = "Рядом игрок";
   private static final String f_7796 = "Администратор в ванише";
   private static final String f_7797 = "Тип ухода";
   private static final String f_7798 = "Спавн";
   private static final String f_7799 = "Домой";
   private static final String f_7800 = "Хаб";
   private static final String f_7801 = "Ливать только в конце PvP";
   private static final String f_7802 = "Здоровье";
   private static final float f_7803 = 15.0F;
   private static final float f_7804 = 20.0F;
   private static final String f_7805 = "Радиус";
   private static final float f_7806 = 10.0F;
   private static final float f_7807 = 50.0F;
   private static final String f_7808 = "Отключать Baritone";
   private static final String f_7809 = "Мало здоровья";
   private static final String f_7810 = "мало здоровья";
   private static final String f_7811 = "Рядом игрок";
   private static final String f_7812 = "Администратор в ванише";
   private static final String f_7813 = "Домой";
   private static final String f_7814 = "home";
   private static final String f_7815 = "Хаб";
   private static final String f_7816 = "hub";
   private static final String f_7817 = "spawn";
   private static final String f_7818 = "Мало здоровья";
   private static final String f_7819 = "Рядом игрок";
   private static final String f_7820 = "Администратор в ванише";
   private static final long f_7821 = 15000L;
   private static final String f_7822 = "Рядом игрок";
   private static final String f_7823 = "Мало здоровья";

   private boolean m_2816() {
      return this.f_7779.m_7145(f_7818) || this.f_7779.m_7145(f_7819) || this.f_7779.m_7145(f_7820);
   }

   private void m_2817(Class_a7M44oHQPwN0rL5A var1) {
      if (f_11537.player != null && var1.m_5905() == f_11537.player) {
         if (var1.m_5904() instanceof Player var2) {
            if (!this.m_2824(var2)) {
               this.m_2821();
            }
         }
      }
   }

   private Player m_2818() {
      double var1 = this.f_7783.m_8768() * this.f_7783.m_8768();

      for (Player var4 : f_11537.level.players()) {
         if (var4 != f_11537.player && var4.isAlive() && !var4.isSpectator() && !this.m_2824(var4) && f_11537.player.distanceToSqr(var4) <= var1) {
            return var4;
         }
      }

      return null;
   }

   private void m_2819(String var1) {
      if (this.f_7781.m_8768() && this.m_2826()) {
         this.f_7789 = true;
         this.f_7790 = var1;
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
      } else {
         this.m_2822(var1);
      }
   }

   private void m_2820(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.player.connection != null) {
         if (f_11537.player.hurtTime > 0 && f_11537.player.getLastHurtByMob() instanceof Player var2 && !this.m_2824(var2)) {
            this.m_2821();
         }

         if (!this.f_7789) {
            if (this.f_7779.m_7145(f_7809) && f_11537.player.getHealth() <= this.f_7782.m_8768()) {
               this.m_2819(f_7810);
            } else {
               if (this.f_7779.m_7145(f_7811)) {
                  Player var4 = this.m_2818();
                  if (var4 != null) {
                     this.m_2819(var4.getGameProfile().name() + "");
                     return;
                  }
               }

               if (this.f_7779.m_7145(f_7812)) {
                  this.f_7785.m_9578();
                  Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var5 = this.f_7785
                     .m_9582()
                     .stream()
                     .filter(var0 -> var0.m_9575() == Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez.VANISH)
                     .findFirst()
                     .orElse(null);
                  if (var5 != null) {
                     this.m_2819(var5.m_9574() + "");
                  }
               }
            }
         } else {
            if (!this.f_7781.m_8768() || !this.m_2826()) {
               this.m_2822(this.f_7790);
            }
         }
      }
   }

   private void m_2821() {
      this.f_7788 = System.currentTimeMillis();
   }

   private void m_2822(String var1) {
      if (f_11537.player != null && f_11537.player.connection != null) {
         if (this.f_7784.m_8768() && Class_gXPXh2FDkuYBeJW2.m_6800()) {
            Class_gXPXh2FDkuYBeJW2.m_6802();
         }

         String var2;
         if (this.f_7780.m_7568(f_7813)) {
            var2 = f_7814;
         } else if (this.f_7780.m_7568(f_7815)) {
            var2 = f_7816;
         } else {
            var2 = f_7817;
         }

         f_11537.player.connection.sendCommand(var2);
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + var1);
         this.m_777();
      }
   }

   private boolean m_2824(Player var1) {
      return DimasikClient.m_9057().m_9049().m_2804().m_2877(var1.getGameProfile().name());
   }

   @Override
   public void m_732() {
      this.f_7788 = 0L;
      this.f_7789 = false;
      this.f_7790 = "";
      super.m_732();
   }

   public AutoLeave() {
      super(f_7791, f_7792, Category.MISC);
      this.f_7779 = new ItemListSetting(
         f_7793, new Class_2ZaVm8TGDJ68TnJB(f_7794, true), new Class_2ZaVm8TGDJ68TnJB(f_7795, true), new Class_2ZaVm8TGDJ68TnJB(f_7796, true)
      );
      this.f_7780 = new MultiChoiceSetting(f_7797, new Class_2ZaVm8TGDJ68TnJB(f_7798), new Class_2ZaVm8TGDJ68TnJB(f_7799), new Class_2ZaVm8TGDJ68TnJB(f_7800))
         .m_822(this::m_2816);
      this.f_7781 = new CheckboxSetting(f_7801, false).m_822(this::m_2816);
      this.f_7782 = new SliderSetting(f_7802, f_7803, 1.0F, f_7804).m_828(1.0F).m_822(() -> this.f_7779.m_7145(f_7823));
      this.f_7783 = new SliderSetting(f_7805, f_7806, 1.0F, f_7807).m_828(1.0F).m_822(() -> this.f_7779.m_7145(f_7822));
      this.f_7784 = new CheckboxSetting(f_7808, true).m_822(this::m_2816);
      this.f_7785 = new Class_xzn9431ICoBNtkQe();
      this.f_7786 = this::m_2820;
      this.f_7787 = this::m_2817;
      this.f_7790 = "";
      this.m_795(this.f_7779, this.f_7780, this.f_7781, this.f_7782, this.f_7783, this.f_7784);
   }

   @Override
   public void m_778() {
      this.f_7788 = 0L;
      this.f_7789 = false;
      this.f_7790 = "";
      super.m_778();
   }

   private boolean m_2826() {
      return this.f_7788 > 0L && System.currentTimeMillis() - this.f_7788 < f_7821;
   }
}
