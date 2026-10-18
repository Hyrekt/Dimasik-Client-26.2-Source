package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_21JsiqqLzgnqk2Dg;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_kPXtxQj0j9mBpxqt;
import dev.dimasik.client.system.Class_u1zxnbONovw8AUlr;
import lombok.Generated;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AutoTotem extends Module {
   private final ItemListSetting f_35088;
   private final SliderSetting f_35089;
   private final SliderSetting f_35090;
   private final SliderSetting f_35091;
   private final SliderSetting f_35092;
   private final SliderSetting f_35093;
   private final SliderSetting f_35094;
   private final SliderSetting f_35095;
   private final SliderSetting f_35096;
   private final CheckboxSetting f_35097;
   private final CheckboxSetting f_35098;
   private final CheckboxSetting f_35099;
   private final CheckboxSetting f_35100;
   private final SliderSetting f_35101;
   private final SliderSetting f_35102;
   private final SliderSetting f_35103;
   private final Class_21JsiqqLzgnqk2Dg f_35104;
   private final Class_u1zxnbONovw8AUlr f_35105;
   private final Class_kPXtxQj0j9mBpxqt f_35106;
   private String f_35107;
   private int f_35108;
   private int f_35109;
   private boolean f_35110;
   private boolean f_35111;
   private boolean f_35112;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_35113;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_35114;
   private static final String f_35115 = "AutoTotem";
   private static final String f_35116 = "Автоматически берет тотем при различных факторах";
   private static final String f_35117 = "Проверки";
   private static final String f_35118 = "Золотые сердца";
   private static final String f_35119 = "Кристаллы";
   private static final String f_35120 = "Якорь";
   private static final String f_35121 = "Падение";
   private static final String f_35122 = "Динамит";
   private static final String f_35123 = "Броня";
   private static final String f_35124 = "Здоровье";
   private static final float f_35125 = 5.0F;
   private static final float f_35126 = 20.0F;
   private static final String f_35127 = "Здоровье обратного свапа";
   private static final float f_35128 = 20.0F;
   private static final String f_35129 = "Здоровье на элитре";
   private static final float f_35130 = 5.0F;
   private static final float f_35131 = 20.0F;
   private static final String f_35132 = "Дистанция до кристалла";
   private static final float f_35133 = 5.0F;
   private static final float f_35134 = 10.0F;
   private static final float f_35135 = 0.1F;
   private static final String f_35136 = "Дистанция до якоря";
   private static final float f_35137 = 5.0F;
   private static final float f_35138 = 10.0F;
   private static final float f_35139 = 0.1F;
   private static final String f_35140 = "Дистанция падения";
   private static final float f_35141 = 20.0F;
   private static final float f_35142 = 50.0F;
   private static final String f_35143 = "Дистанция до динамита";
   private static final float f_35144 = 5.0F;
   private static final float f_35145 = 10.0F;
   private static final float f_35146 = 0.1F;
   private static final String f_35147 = "Тики задержки свапа";
   private static final float f_35148 = 4.0F;
   private static final float f_35149 = 20.0F;
   private static final String f_35150 = "Не свапать шар";
   private static final String f_35151 = "Сохранять зачарованный тотем";
   private static final String f_35152 = "Не свапать драконитки";
   private static final String f_35153 = "Кастомное здоровье с шаром";
   private static final String f_35154 = "Здоровье с шаром";
   private static final float f_35155 = 5.0F;
   private static final float f_35156 = 20.0F;
   private static final String f_35157 = "Задержка свапа на кристал";
   private static final float f_35158 = 4.0F;
   private static final float f_35159 = 60.0F;
   private static final String f_35160 = "Задержка свапа на якорь";
   private static final float f_35161 = 4.0F;
   private static final float f_35162 = 60.0F;
   private static final String f_35163 = "Легитный";
   private static final String f_35164 = "totem";
   private static final String f_35165 = "back";
   private static final String f_35166 = "Золотые сердца";
   private static final String f_35167 = "Якорь";
   private static final String f_35168 = "Кристаллы";
   private static final String f_35169 = "Динамит";
   private static final String f_35170 = "Падение";
   private static final String f_35171 = "Якорь";
   private static final String f_35172 = "Кристаллы";

   @Generated
   public SliderSetting m_9509() {
      return this.f_35092;
   }

   private void m_9510() {
      int var1 = this.f_35108;
      Runnable var2 = () -> {
         this.f_35104.m_925(this.f_35104.m_907(), var1);
         this.f_35104.m_921();
         Class_B6vpBUNmRtH3JzmV.m_2131(this.f_35104.m_907());
         this.f_35104.m_920();
         Class_B6vpBUNmRtH3JzmV.m_2131(f_11537.player.getInventory().selected);
         this.f_35104.m_925(this.f_35104.m_907(), var1);
         this.f_35104.m_921();
      };
      this.f_35104.m_924(this.f_35107, var2);
      this.f_35108 = -1;
   }

   @Generated
   public boolean m_9512() {
      return this.f_35110;
   }

   private void m_9513() {
      this.f_35104.m_925(40, this.f_35108);
      this.f_35104.m_921();
      this.f_35110 = false;
      this.f_35108 = -1;
   }

   @Generated
   public SliderSetting m_9514() {
      return this.f_35089;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> m_9515() {
      return this.f_35114;
   }

   @Generated
   public CheckboxSetting m_9516() {
      return this.f_35098;
   }

   private boolean m_9517() {
      return this.f_35105.m_9059();
   }

   @Generated
   public Class_21JsiqqLzgnqk2Dg m_9518() {
      return this.f_35104;
   }

   @Generated
   public boolean m_9519() {
      return this.f_35111;
   }

   @Generated
   public SliderSetting m_9521() {
      return this.f_35102;
   }

   @Generated
   public int m_9522() {
      return this.f_35108;
   }

   @Generated
   public SliderSetting m_9523() {
      return this.f_35091;
   }

   @Generated
   public ItemListSetting m_9524() {
      return this.f_35088;
   }

   @Generated
   public String m_9526() {
      return this.f_35107;
   }

   private int m_9527() {
      for (int var1 = 0; var1 < f_11537.player.getInventory().getNonEquipmentItems().size(); var1++) {
         ItemStack var2 = (ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var1);
         if (var2.getItem().equals(Items.TOTEM_OF_UNDYING)) {
            return var1 < 9 ? var1 + 36 : var1;
         }
      }

      return -1;
   }

   @Generated
   public boolean m_9529() {
      return this.f_35112;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_9530() {
      return this.f_35113;
   }

   @Generated
   public SliderSetting m_9531() {
      return this.f_35095;
   }

   @Generated
   public CheckboxSetting m_9532() {
      return this.f_35099;
   }

   private boolean m_9534() {
      if (this.m_9517()) {
         if (f_11537.player.getOffhandItem().getItem().equals(Items.TOTEM_OF_UNDYING) || this.f_35111) {
            return false;
         }

         this.f_35108 = this.m_9527();
         if (this.f_35108 == -1) {
            return false;
         }

         if (this.f_35109 == -1) {
            this.f_35109 = this.f_35108;
         }

         this.f_35107 = f_35164;
         this.f_35111 = true;
         this.f_35112 = false;
         this.f_35106.m_7442();
      } else if (this.m_9544()) {
         if (this.f_35112 || this.f_35109 == -1) {
            return false;
         }

         this.f_35108 = this.f_35109;
         this.f_35109 = -1;
         this.f_35107 = f_35165;
         this.f_35111 = false;
         this.f_35112 = true;
         this.f_35106.m_7442();
      }

      return this.f_35108 >= 0 && this.f_35107 != null;
   }

   @Generated
   public SliderSetting m_9535() {
      return this.f_35094;
   }

   @Generated
   public SliderSetting m_9536() {
      return this.f_35103;
   }

   @Generated
   public CheckboxSetting m_9537() {
      return this.f_35097;
   }

   public void m_9538(Class_Xu9btcIeUN33XnMK var1) {
      this.m_9548();
      if (this.m_9534()) {
         if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_35163)) {
            this.m_9539();
         } else {
            this.m_9513();
         }
      }
   }

   private void m_9539() {
      int var1 = this.f_35108;
      this.f_35104.m_923(this.f_35107, () -> this.f_35104.m_925(40, var1), this.f_35104::m_921);
      this.f_35110 = false;
      this.f_35108 = -1;
   }

   @Generated
   public CheckboxSetting m_9540() {
      return this.f_35100;
   }

   @Generated
   public SliderSetting m_9541() {
      return this.f_35093;
   }

   private boolean m_9544() {
      float var1 = f_11537.player.getHealth();
      if (this.f_35088.m_7145(f_35166) && f_11537.player.hasEffect(MobEffects.ABSORPTION)) {
         var1 += f_11537.player.getAbsorptionAmount();
      }

      return this.f_35110 ? f_11537.player.getOffhandItem().isEmpty() : var1 > this.f_35089.m_8768() + this.f_35090.m_8768();
   }

   @Generated
   public SliderSetting m_9545() {
      return this.f_35090;
   }

   @Override
   public void m_732() {
      this.f_35104.m_914().clear();
   }

   @Generated
   public int m_9546() {
      return this.f_35109;
   }

   public void m_9547(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundEntityEventPacket var2 && var2.getEventId() == 35 && var2.getEntity(f_11537.level) instanceof LocalPlayer) {
         this.f_35110 = true;
         this.f_35111 = false;
         this.f_35112 = false;
      }
   }

   private void m_9548() {
      if (this.f_35106.m_7443(this.f_35096.m_8768().intValue())) {
         if (f_11537.player.getOffhandItem().getItem().equals(Items.TOTEM_OF_UNDYING)) {
            this.f_35111 = false;
         }

         if (!f_11537.player.getOffhandItem().getItem().equals(Items.AIR) && !f_11537.player.getOffhandItem().getItem().equals(Items.TOTEM_OF_UNDYING)) {
            this.f_35112 = false;
         }
      }
   }

   @Generated
   public SliderSetting m_9549() {
      return this.f_35101;
   }

   @Generated
   public SliderSetting m_9551() {
      return this.f_35096;
   }

   @Generated
   public Class_u1zxnbONovw8AUlr m_9553() {
      return this.f_35105;
   }

   public AutoTotem() {
      super(f_35115, f_35116, Category.COMBAT);
      this.f_35088 = new ItemListSetting(
         f_35117,
         new Class_2ZaVm8TGDJ68TnJB(f_35118),
         new Class_2ZaVm8TGDJ68TnJB(f_35119),
         new Class_2ZaVm8TGDJ68TnJB(f_35120),
         new Class_2ZaVm8TGDJ68TnJB(f_35121),
         new Class_2ZaVm8TGDJ68TnJB(f_35122),
         new Class_2ZaVm8TGDJ68TnJB(f_35123)
      );
      this.f_35089 = new SliderSetting(f_35124, f_35125, 1.0F, f_35126).m_828(1.0F);
      this.f_35090 = new SliderSetting(f_35127, 2.0F, 1.0F, f_35128).m_828(1.0F);
      this.f_35091 = new SliderSetting(f_35129, f_35130, 1.0F, f_35131).m_828(1.0F);
      this.f_35092 = new SliderSetting(f_35132, f_35133, 1.0F, f_35134).m_828(f_35135).m_822(() -> this.f_35088.m_7145(f_35172));
      this.f_35093 = new SliderSetting(f_35136, f_35137, 1.0F, f_35138).m_828(f_35139).m_822(() -> this.f_35088.m_7145(f_35171));
      this.f_35094 = new SliderSetting(f_35140, f_35141, 1.0F, f_35142).m_828(1.0F).m_822(() -> this.f_35088.m_7145(f_35170));
      this.f_35095 = new SliderSetting(f_35143, f_35144, 1.0F, f_35145).m_828(f_35146).m_822(() -> this.f_35088.m_7145(f_35169));
      this.f_35096 = new SliderSetting(f_35147, f_35148, 1.0F, f_35149).m_828(1.0F);
      this.f_35097 = new CheckboxSetting(f_35150, true);
      this.f_35098 = new CheckboxSetting(f_35151, false);
      this.f_35099 = new CheckboxSetting(f_35152, true);
      this.f_35100 = new CheckboxSetting(f_35153, true).m_822(this.f_35097::m_8768);
      this.f_35101 = new SliderSetting(f_35154, f_35155, 1.0F, f_35156).m_828(1.0F).m_822(() -> this.f_35097.m_8768() && this.f_35100.m_8768());
      this.f_35102 = new SliderSetting(f_35157, f_35158, 0.0F, f_35159).m_828(1.0F).m_822(() -> this.f_35088.m_7145(f_35168));
      this.f_35103 = new SliderSetting(f_35160, f_35161, 0.0F, f_35162).m_828(1.0F).m_822(() -> this.f_35088.m_7145(f_35167));
      this.f_35104 = new Class_21JsiqqLzgnqk2Dg();
      this.f_35105 = new Class_u1zxnbONovw8AUlr(this);
      this.f_35106 = new Class_kPXtxQj0j9mBpxqt();
      this.f_35107 = null;
      this.f_35108 = -1;
      this.f_35109 = -1;
      this.f_35113 = this::m_9538;
      this.f_35114 = this::m_9547;
      this.m_795(
         this.f_35088,
         this.f_35089,
         this.f_35090,
         this.f_35091,
         this.f_35092,
         this.f_35093,
         this.f_35094,
         this.f_35096,
         this.f_35098,
         this.f_35099,
         this.f_35097,
         this.f_35100,
         this.f_35101,
         this.f_35102,
         this.f_35103
      );
   }

   @Generated
   public Class_kPXtxQj0j9mBpxqt m_9554() {
      return this.f_35106;
   }
}
