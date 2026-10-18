package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_leVCNCyuwEBdJnL8;
import java.util.Locale;
import java.util.UUID;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBossEventPacket;
import net.minecraft.network.protocol.game.ClientboundLoginPacket;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ClientboundBossEventPacket.Handler;
import net.minecraft.util.StringUtil;
import net.minecraft.world.BossEvent.BossBarColor;
import net.minecraft.world.BossEvent.BossBarOverlay;

public final class AutoContract extends Module {
   private final SliderSetting f_19274;
   private final IntegerSetting f_19275;
   private final Class_QmNR03reugBgWiPr f_19276;
   private boolean f_19277;
   private boolean f_19278;
   private boolean f_19279;
   private UUID f_19280;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_19281;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_19282;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_19283;
   private static final String f_19284 = "AutoContract";
   private static final String f_19285 = "Автоматически ищет цель, на указанном вами грифе";
   private static final String f_19286 = "Гриф";
   private static final float f_19287 = 96.0F;
   private static final String f_19288 = "Клавиша отключения";
   private static final String f_19289 = "Вы находитесь в PVP-режиме!";
   private static final String f_19290 = "Укажите цель! .autocontract <name> | .act <name>";
   private static final String f_19291 = "Ваша цель";
   private static final String f_19292 = "Найден нужный игрок";
   private static final String f_19293 = "Ваша цель";
   private static final String f_19294 = "Не спамь!";
   private static final String f_19295 = "Не получилось";
   private static final String f_19296 = "К сожалению сервер переполнен";
   private static final String f_19297 = "Подождите 20 секунд!";
   private static final String f_19298 = "большой поток игроков";
   private static final long f_19299 = 600L;
   private static final String f_19300 = "contract get";

   @Override
   public void m_778() {
      this.f_19277 = false;
      this.f_19278 = false;
      this.f_19276.m_4459();
      if (Class_leVCNCyuwEBdJnL8.f_25284 != null) {
         this.m_6435();
      }

      super.m_778();
   }

   private void m_6435() {
      AutoJoiner var1 = DimasikClient.m_9057().m_9049().m_2801().m_3451();
      var1.m_8812(this.f_19274.m_8768().intValue());
   }

   @Override
   public void m_732() {
      this.f_19277 = false;
      this.f_19278 = false;
      this.f_19276.m_4459();
      super.m_732();
   }

   private void m_6436(Class_B6JOzHnwhU3pe4AO var1) {
      if (this.f_19275.m_8768() == var1.m_2117() && var1.m_2116() == 1) {
         this.m_789();
      }
   }

   private void m_6437(ClientboundBossEventPacket var1) {
      var1.dispatch(new Handler() {
         public static final String f_19272 = "pvp";
         public static final String f_19273 = "у вас осталось";

         public void add(UUID var1, Component var2, float var3, BossBarColor var4, BossBarOverlay var5, boolean var6, boolean var7, boolean var8) {
            String var9 = StringUtil.stripColor(var2.getString()).toLowerCase(Locale.ROOT);
            if (var9.contains(f_19272) || var9.contains(f_19273)) {
               AutoContract.this.f_19279 = true;
               AutoContract.this.f_19280 = var1;
            }
         }

         public void remove(UUID var1) {
            if (AutoContract.this.f_19280 != null && AutoContract.this.f_19280.equals(var1)) {
               AutoContract.this.f_19279 = false;
               AutoContract.this.f_19280 = null;
            }
         }
      });
   }

   private void m_6438(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundBossEventPacket var2) {
         this.m_6437(var2);
      }

      if (this.m_6440()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_19289);
         this.m_789();
      } else if (Class_leVCNCyuwEBdJnL8.f_25284 == null) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_19290);
         this.m_789();
      } else {
         if (var1.m_5619() instanceof ClientboundLoginPacket) {
            this.f_19278 = true;
         }

         if (var1.m_5619() instanceof ClientboundSystemChatPacket var5) {
            String var7 = StringUtil.stripColor(var5.content().getString());
            if (var7 == null) {
               var7 = var5.content().getString();
            }

            String var4 = Class_leVCNCyuwEBdJnL8.f_25284;
            if (var7.contains(f_19291) && var7.contains(var4)) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_19292);
               this.m_789();
            } else if (!var7.contains(f_19293) && !var7.contains(f_19294) && !var7.contains(f_19295)) {
               if (var7.contains(f_19296) || var7.contains(f_19297) || var7.contains(f_19298)) {
                  this.f_19277 = true;
                  this.f_19276.m_4459();
               }
            } else {
               this.f_19278 = false;
               this.f_19277 = true;
               this.f_19276.m_4459();
            }
         }
      }
   }

   private void m_6439(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.getConnection() != null) {
         if (this.f_19277 && this.f_19276.m_4463(f_19299)) {
            this.m_6435();
            this.f_19277 = false;
         }

         boolean var2 = true;
         String var3 = Class_leVCNCyuwEBdJnL8.f_25284;
         if (var3 != null) {
            for (PlayerInfo var5 : f_11537.getConnection().getOnlinePlayers()) {
               if (var5.getProfile().name().equals(var3)) {
                  var2 = false;
                  break;
               }
            }
         }

         if (this.f_19278 && !var2) {
            f_11537.player.connection.sendCommand(f_19300);
            this.f_19278 = false;
         }
      }
   }

   private boolean m_6440() {
      return this.f_19279;
   }

   public AutoContract() {
      super(f_19284, f_19285, Category.MISC);
      this.f_19274 = new SliderSetting(f_19286, 1.0F, 1.0F, f_19287).m_828(1.0F);
      this.f_19275 = new IntegerSetting(f_19288, -1);
      this.f_19276 = new Class_QmNR03reugBgWiPr();
      this.f_19281 = this::m_6438;
      this.f_19282 = this::m_6439;
      this.f_19283 = this::m_6436;
      this.m_795(this.f_19274, this.f_19275);
   }
}
