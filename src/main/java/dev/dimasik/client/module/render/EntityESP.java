package dev.dimasik.client.module.render;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.BooleanSetting;
import dev.dimasik.client.system.Class_15puspGa4UwNUgkr;
import dev.dimasik.client.system.Class_4ME0aEy5IMLZdY99;
import dev.dimasik.client.system.Class_JYI3tOXLKmfxbnee;
import dev.dimasik.client.system.Class_QDKuoUmFaP1xpF1M;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_y7LCUoWgFH6Mz8SR;
import dev.dimasik.client.ui.screen.Screen_8;
import java.util.List;
import lombok.Generated;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.player.Player;

public class EntityESP extends Module {
   private final Class_y7LCUoWgFH6Mz8SR f_11604;
   private final Class_y7LCUoWgFH6Mz8SR f_11605;
   private final Class_y7LCUoWgFH6Mz8SR f_11606;
   private final Class_y7LCUoWgFH6Mz8SR f_11607;
   private final Class_y7LCUoWgFH6Mz8SR f_11608;
   private final Class_y7LCUoWgFH6Mz8SR f_11609;
   private final List<Class_y7LCUoWgFH6Mz8SR> f_11610;
   private final Class_QDKuoUmFaP1xpF1M f_11611;
   private final Class_JYI3tOXLKmfxbnee f_11612;
   private final BooleanSetting f_11613;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_11614;
   private final Class_gEPk7yDw6CwIte87<Class_4ME0aEy5IMLZdY99> f_11615;
   private final Class_gEPk7yDw6CwIte87<Class_15puspGa4UwNUgkr> f_11616;
   private static final String f_11617 = "EntityESP";
   private static final String f_11618 = "Подсвечивает выбранные сущности";
   private static final String f_11619 = "Себя";
   private static final String f_11620 = "players_self";
   private static final String f_11621 = "Друзей";
   private static final String f_11622 = "players_friends";
   private static final String f_11623 = "Игроков";
   private static final String f_11624 = "players_all";
   private static final String f_11625 = "Мобы";
   private static final String f_11626 = "mobs";
   private static final String f_11627 = "Жители";
   private static final String f_11628 = "villagers";
   private static final String f_11629 = "Предметы";
   private static final String f_11630 = "items";
   private static final String f_11631 = "Открыть настройки";
   private static final String f_11632 = "Categories";
   private static final String f_11633 = "Categories";

   private void m_4052() {
      if (f_11537.player != null && f_11537.level != null) {
         if (f_11537.gui.screen() instanceof Screen_8 var1) {
            var1.openEntityEsp1Editor(this);
         }
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_15puspGa4UwNUgkr> m_4053() {
      return this.f_11616;
   }

   @Generated
   public Class_y7LCUoWgFH6Mz8SR m_4054() {
      return this.f_11607;
   }

   @Generated
   public Class_JYI3tOXLKmfxbnee m_4055() {
      return this.f_11612;
   }

   @Generated
   public List<Class_y7LCUoWgFH6Mz8SR> m_4056() {
      return this.f_11610;
   }

   @Override
   public JsonObject m_782() {
      JsonObject var1 = super.m_782();
      JsonObject var2 = new JsonObject();

      for (Class_y7LCUoWgFH6Mz8SR var4 : this.f_11610) {
         var2.add(var4.m_9602(), var4.m_9603());
      }

      var1.add(f_11632, var2);
      return var1;
   }

   @Generated
   public Class_y7LCUoWgFH6Mz8SR m_4057() {
      return this.f_11605;
   }

   @Generated
   public BooleanSetting m_4058() {
      return this.f_11613;
   }

   @Generated
   public Class_y7LCUoWgFH6Mz8SR m_4059() {
      return this.f_11604;
   }

   @Override
   public void m_791(JsonObject var1) {
      super.m_791(var1);
      if (var1 != null) {
         JsonElement var2 = var1.get(f_11633);
         if (var2 != null && var2.isJsonObject()) {
            for (Class_y7LCUoWgFH6Mz8SR var4 : this.f_11610) {
               JsonElement var5 = var2.getAsJsonObject().get(var4.m_9602());
               if (var5 != null && var5.isJsonObject()) {
                  var4.m_9608(var5.getAsJsonObject());
               }
            }
         }
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_4ME0aEy5IMLZdY99> m_4060() {
      return this.f_11615;
   }

   @Generated
   public Class_y7LCUoWgFH6Mz8SR m_4061() {
      return this.f_11606;
   }

   @Generated
   public Class_y7LCUoWgFH6Mz8SR m_4062() {
      return this.f_11608;
   }

   public void m_4063(Class_bhRaN0YSSLQRYjPo var1) {
      this.f_11611.m_4325(var1);
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> m_4064() {
      return this.f_11614;
   }

   private Class_y7LCUoWgFH6Mz8SR m_4065(Entity var1) {
      if (var1 == f_11537.player) {
         return this.f_11604;
      } else if (var1 instanceof Player var2) {
         return DimasikClient.m_9057().m_9049().m_2804().m_2877(var2.getGameProfile().name()) ? this.f_11605 : this.f_11606;
      } else if (var1 instanceof Villager) {
         return this.f_11608;
      } else if (var1 instanceof ItemEntity) {
         return this.f_11609;
      } else {
         return var1 instanceof LivingEntity ? this.f_11607 : null;
      }
   }

   @Generated
   public Class_QDKuoUmFaP1xpF1M m_4066() {
      return this.f_11611;
   }

   public EntityESP() {
      super(f_11617, f_11618, Category.RENDER);
      this.f_11604 = new Class_y7LCUoWgFH6Mz8SR(f_11619, f_11620, Class_y7LCUoWgFH6Mz8SR.Class_9rSCnGK5awbHdLno.PLAYER, false);
      this.f_11605 = new Class_y7LCUoWgFH6Mz8SR(f_11621, f_11622, Class_y7LCUoWgFH6Mz8SR.Class_9rSCnGK5awbHdLno.PLAYER, true);
      this.f_11606 = new Class_y7LCUoWgFH6Mz8SR(f_11623, f_11624, Class_y7LCUoWgFH6Mz8SR.Class_9rSCnGK5awbHdLno.PLAYER, true);
      this.f_11607 = new Class_y7LCUoWgFH6Mz8SR(f_11625, f_11626, Class_y7LCUoWgFH6Mz8SR.Class_9rSCnGK5awbHdLno.LIVING, false);
      this.f_11608 = new Class_y7LCUoWgFH6Mz8SR(f_11627, f_11628, Class_y7LCUoWgFH6Mz8SR.Class_9rSCnGK5awbHdLno.LIVING, false);
      this.f_11609 = new Class_y7LCUoWgFH6Mz8SR(f_11629, f_11630, Class_y7LCUoWgFH6Mz8SR.Class_9rSCnGK5awbHdLno.ITEM, true);
      this.f_11610 = List.of(this.f_11604, this.f_11605, this.f_11606, this.f_11607, this.f_11608, this.f_11609);
      this.f_11611 = new Class_QDKuoUmFaP1xpF1M(this::m_4065);
      this.f_11612 = new Class_JYI3tOXLKmfxbnee(this::m_4065, this::m_4056);
      this.f_11613 = new BooleanSetting(f_11631).m_1474(this::m_4052).m_1472();
      this.f_11614 = new Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo>() {
         @Override
         public int m_1780() {
            return -60;
         }

         public void m_1781(Class_bhRaN0YSSLQRYjPo var1) {
            EntityESP.this.m_4063(var1);
         }
      };
      this.f_11615 = this::m_4067;
      this.f_11616 = this.f_11612::m_3274;
      this.m_795(this.f_11613);
   }

   public void m_4067(Class_4ME0aEy5IMLZdY99 var1) {
      var1.m_1582(true);
   }

   @Generated
   public Class_y7LCUoWgFH6Mz8SR m_4068() {
      return this.f_11609;
   }
}
