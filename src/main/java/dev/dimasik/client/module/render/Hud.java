package dev.dimasik.client.module.render;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_9ioHgxFG45XRcdea;
import dev.dimasik.client.system.Class_MP0Q3Izlf2HSndyS;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Trm8dR6i9vMfnZEG;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class Hud extends Module {
   private static final EquipmentSlot[] f_18166 = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
   private final Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U[] f_18167 = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U[f_18166.length];
   private final Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U f_18168 = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U();
   private ItemStack f_18169;
   public ItemListSetting f_18170;
   private final SliderSetting f_18171;
   public CheckboxSetting f_18172;
   public CheckboxSetting f_18173;
   private final CheckboxSetting f_18174;
   private final CheckboxSetting f_18175;
   private final ItemListSetting f_18176;
   private final ItemListSetting f_18177;
   private final CheckboxSetting f_18178;
   private final CheckboxSetting f_18179;
   private final MultiChoiceSetting f_18180;
   private final MultiChoiceSetting f_18181;
   private final SliderSetting f_18182;
   private final MultiChoiceSetting f_18183;
   private final CheckboxSetting f_18184;
   private final CheckboxSetting f_18185;
   private final SliderSetting f_18186;
   private final SliderSetting f_18187;
   private final SliderSetting f_18188;
   private final SliderSetting f_18189;
   private final SliderSetting f_18190;
   private final SliderSetting f_18191;
   private final CheckboxSetting f_18192;
   private Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_18193;
   private Class_w8fCJQ5ZtH5lQbWc f_18194;
   private static final String f_18195 = "Hud";
   private static final String f_18196 = "Интерфейс клиента";
   private static final String f_18197 = "Элементы";
   private static final String f_18198 = "Логотип";
   private static final String f_18199 = "Горячие клавиши";
   private static final String f_18200 = "Активные зелья";
   private static final String f_18201 = "Персонал";
   private static final String f_18202 = "Задержки";
   private static final String f_18203 = "Информация о цели";
   private static final String f_18204 = "Кол-во тотемов";
   private static final String f_18205 = "Броня";
   private static final String f_18206 = "Скорость";
   private static final String f_18207 = "Координаты";
   private static final String f_18208 = "Таймер";
   private static final String f_18209 = "Индикатор предметов";
   private static final String f_18210 = "Инвентарь";
   private static final String f_18211 = "PvP помощник";
   private static final String f_18212 = "Уведомления";
   private static final String f_18213 = "Размер";
   private static final float f_18214 = 4.0F;
   private static final String f_18215 = "Свечение";
   private static final String f_18216 = "Размытие";
   private static final String f_18217 = "Стекло";
   private static final String f_18218 = "Показ Перемещения";
   private static final String f_18219 = "От головы";
   private static final String f_18220 = "От полоски";
   private static final String f_18221 = "TargetHUD";
   private static final String f_18222 = "1";
   private static final String f_18223 = "2";
   private static final String f_18224 = "Potions";
   private static final String f_18225 = "1";
   private static final String f_18226 = "2";
   private static final String f_18227 = "Количество частиц";
   private static final float f_18228 = 16.0F;
   private static final float f_18229 = 67.0F;
   private static final String f_18230 = "Партиклы цели";
   private static final String f_18231 = "Классика";
   private static final String f_18232 = "Светлячки";
   private static final String f_18233 = "Заменить Скин";
   private static final String f_18234 = "3D модель";
   private static final String f_18235 = "Размер 3D";
   private static final float f_18236 = 0.6F;
   private static final float f_18237 = 0.05F;
   private static final String f_18238 = "Порог брони";
   private static final float f_18239 = 35.0F;
   private static final float f_18240 = 5.0F;
   private static final float f_18241 = 90.0F;
   private static final String f_18242 = "Смена подсказок";
   private static final float f_18243 = 2.5F;
   private static final float f_18244 = 0.5F;
   private static final float f_18245 = 10.0F;
   private static final float f_18246 = 0.5F;
   private static final String f_18247 = "Размер PvP помощника";
   private static final float f_18248 = 0.6F;
   private static final float f_18249 = 0.05F;
   private static final String f_18250 = "Размер лут трекера";
   private static final float f_18251 = 0.6F;
   private static final float f_18252 = 0.05F;
   private static final String f_18253 = "Размер индикатора предметов";
   private static final float f_18254 = 1.9F;
   private static final float f_18255 = 0.6F;
   private static final float f_18256 = 0.05F;
   private static final String f_18257 = "Закрепить хотбар";
   private static final float f_18258 = 15.0F;
   private static final float f_18259 = 0.5F;
   private static final float f_18260 = 0.25F;
   private static final String f_18261 = "Кол-во тотемов";
   private static final float f_18262 = 0.01F;
   private static final float f_18263 = 8.0F;
   private static final float f_18264 = 8.0F;
   private static final float f_18265 = 8.0F;
   private static final float f_18266 = 8.0F;
   private static final float f_18267 = 8.0F;
   private static final float f_18268 = 8.0F;
   private static final float f_18269 = 9.0F;
   private static final float f_18270 = 17.0F;
   private static final float f_18271 = 17.0F;
   private static final String f_18272 = "Броня";
   private static final float f_18273 = 16.0F;
   private static final float f_18274 = 3.0F;
   private static final float f_18275 = 17.0F;
   private static final float f_18276 = 56.0F;
   private static final float f_18277 = 0.5F;
   private static final float f_18278 = 0.5F;
   private static final float f_18279 = 56.0F;
   private static final String f_18280 = "Хотбар";
   private static final String f_18281 = "Индикатор предметов";
   private static final String f_18282 = "PvP помощник";
   private static final String f_18283 = "PvP помощник";
   private static final String f_18284 = "PvP помощник";
   private static final String f_18285 = "Информация о цели";
   private static final String f_18286 = "Информация о цели";
   private static final String f_18287 = "Информация о цели";
   private static final String f_18288 = "Активные зелья";
   private static final String f_18289 = "Информация о цели";

   @Generated
   public SliderSetting m_6156() {
      return this.f_18190;
   }

   @Generated
   public CheckboxSetting m_6157() {
      return this.f_18172;
   }

   @Generated
   public ItemListSetting m_6159() {
      return this.f_18176;
   }

   @Generated
   public SliderSetting m_6160() {
      return this.f_18191;
   }

   @Generated
   public CheckboxSetting m_6162() {
      return this.f_18174;
   }

   @Generated
   public MultiChoiceSetting m_6164() {
      return this.f_18183;
   }

   public float m_6165() {
      return f_18259 + this.f_18171.m_8768() * f_18260;
   }

   public Hud() {
      super(f_18195, f_18196, Category.RENDER);
      this.f_18170 = new ItemListSetting(
         f_18197,
         new Class_2ZaVm8TGDJ68TnJB(f_18198, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18199, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18200, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18201, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18202, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18203, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18204, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18205, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18206, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18207, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18208, false),
         new Class_2ZaVm8TGDJ68TnJB(f_18209, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18210, false),
         new Class_2ZaVm8TGDJ68TnJB(f_18211, true),
         new Class_2ZaVm8TGDJ68TnJB(f_18212, true)
      );
      this.f_18171 = new SliderSetting(f_18213, 1.0F, 1.0F, f_18214).m_828(1.0F);
      this.f_18172 = new CheckboxSetting(f_18215, true) {
         public void m_6155(Boolean var1) {
            super.m_823(var1);
            if (Boolean.TRUE.equals(var1)) {
               Hud.this.f_18174.m_823(false);
            }
         }
      };
      this.f_18173 = new CheckboxSetting(f_18216, false) {
         public void m_6154(Boolean var1) {
            super.m_823(var1);
            if (Boolean.TRUE.equals(var1)) {
               Hud.this.f_18174.m_823(false);
            }
         }
      };
      this.f_18174 = new CheckboxSetting(f_18217, true) {
         public void m_6153(Boolean var1) {
            super.m_823(var1);
            if (Boolean.TRUE.equals(var1)) {
               Hud.this.f_18173.m_823(false);
               Hud.this.f_18172.m_823(false);
            }
         }
      };
      this.f_18175 = new CheckboxSetting(f_18218, true);
      this.f_18176 = Class_MP0Q3Izlf2HSndyS.m_3888();
      this.f_18177 = Class_9ioHgxFG45XRcdea.m_1986();
      this.f_18178 = new CheckboxSetting(f_18219, true);
      this.f_18179 = new CheckboxSetting(f_18220, true);
      this.f_18180 = new MultiChoiceSetting(f_18221, 1, new Class_2ZaVm8TGDJ68TnJB(f_18222), new Class_2ZaVm8TGDJ68TnJB(f_18223))
         .m_822(() -> this.f_18170.m_7145(f_18289));
      this.f_18181 = new MultiChoiceSetting(f_18224, new Class_2ZaVm8TGDJ68TnJB(f_18225), new Class_2ZaVm8TGDJ68TnJB(f_18226))
         .m_822(() -> this.f_18170.m_7145(f_18288));
      this.f_18182 = new SliderSetting(f_18227, f_18228, 1.0F, f_18229).m_828(1.0F).m_822(this::m_6174);
      this.f_18183 = new MultiChoiceSetting(f_18230, 1, new Class_2ZaVm8TGDJ68TnJB(f_18231), new Class_2ZaVm8TGDJ68TnJB(f_18232)).m_822(this::m_6174);
      this.f_18184 = new CheckboxSetting(f_18233, false).m_822(() -> this.f_18170.m_7145(f_18287));
      this.f_18185 = new CheckboxSetting(f_18234, false).m_822(() -> this.f_18170.m_7145(f_18286));
      this.f_18186 = new SliderSetting(f_18235, 1.0F, f_18236, 2.0F).m_828(f_18237).m_822(() -> this.f_18170.m_7145(f_18285) && this.f_18185.m_8768());
      this.f_18187 = new SliderSetting(f_18238, f_18239, f_18240, f_18241).m_828(1.0F).m_822(() -> this.f_18170.m_7145(f_18284));
      this.f_18188 = new SliderSetting(f_18242, f_18243, f_18244, f_18245).m_828(f_18246).m_822(() -> this.f_18170.m_7145(f_18283));
      this.f_18189 = new SliderSetting(f_18247, 1.0F, f_18248, 2.0F).m_828(f_18249).m_822(() -> this.f_18170.m_7145(f_18282));
      this.f_18190 = new SliderSetting(f_18250, 1.0F, f_18251, 2.0F).m_828(f_18252);
      this.f_18191 = new SliderSetting(f_18253, f_18254, f_18255, 2.0F).m_828(f_18256).m_822(() -> this.f_18170.m_7145(f_18281));
      this.f_18192 = new CheckboxSetting(f_18257, false).m_822(() -> this.f_18170.m_7145(f_18280));
      this.f_18193 = this::m_6176;
      this.f_18194 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_18258);

      for (int var1 = 0; var1 < this.f_18167.length; var1++) {
         this.f_18167[var1] = new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U();
      }

      this.m_795(
         this.f_18170,
         this.f_18171,
         this.f_18172,
         this.f_18173,
         this.f_18174,
         this.f_18175,
         this.f_18177,
         this.f_18178,
         this.f_18179,
         this.f_18180,
         this.f_18181,
         this.f_18182,
         this.f_18183,
         this.f_18184,
         this.f_18185,
         this.f_18186,
         this.f_18187,
         this.f_18188,
         this.f_18189,
         this.f_18190,
         this.f_18191,
         this.f_18192,
         this.f_18176
      );
   }

   @Generated
   public SliderSetting m_6168() {
      return this.f_18189;
   }

   @Generated
   public MultiChoiceSetting m_6169() {
      return this.f_18180;
   }

   @Generated
   public CheckboxSetting m_6170() {
      return this.f_18179;
   }

   @Generated
   public SliderSetting m_6171() {
      return this.f_18187;
   }

   @Override
   public void m_732() {
      DimasikClient.m_9057().m_9049().m_2808().m_5374();
   }

   @Generated
   public CheckboxSetting m_6172() {
      return this.f_18185;
   }

   public boolean m_6174() {
      return this.f_18178.m_8768() || this.f_18179.m_8768();
   }

   @Generated
   public CheckboxSetting m_6175() {
      return this.f_18192;
   }

   public void m_6176(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_18170.m_7145(f_18261)) {
            boolean var2 = (
                  f_11537.gui.screen() != null && f_11537.gui.screen() instanceof ChatScreen || Class_h78PE30BIJJYoUEk.m_7068(Items.TOTEM_OF_UNDYING) != -1
               )
               && !f_11537.player.isCreative();
            this.f_18194.m_9283(var2 ? 1.0F : 0.0F);
            float var3 = this.f_18194.m_9288();
            if (var3 > f_18262) {
               if (this.f_18169 == null) {
                  this.f_18169 = Items.TOTEM_OF_UNDYING.getDefaultInstance();
               }

               float var4 = f_11537.getWindow().getGuiScale();
               float var5 = (f_11537.getWindow().getGuiScaledWidth() / 2 - 8 + (f_18263 - f_18264 * var3)) * var4;
               float var6 = (f_11537.getWindow().getGuiScaledHeight() - 58 + (f_18265 - f_18266 * var3)) * var4;
               float var7 = var5 + f_18267 * var3 * var4;
               float var8 = var6 + f_18268 * var3 * var4;
               Class_Ssh31B3ljfKeWsvS.m_4862(var7, var8);
               Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

               try {
                  Class_U4Qsm43RVlUI3Pre.m_5197(this.f_18169, var5, var6, var3 * var4, false, this.f_18168);
                  String var9 = Class_h78PE30BIJJYoUEk.m_7078(Items.TOTEM_OF_UNDYING) + "";
                  int var10 = Math.max(7, Math.round(f_18269 * var3 * var4));
                  float var11 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, var10);
                  Class_U4Qsm43RVlUI3Pre.m_5186(
                     Class_y1y6QpONhWEUIdEB.m_9588(), var9, var5 + f_18270 * var3 * var4 - var11, var6 + f_18271 * var3 * var4 - var10, var10, -1
                  );
               } finally {
                  Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
                  Class_Ssh31B3ljfKeWsvS.m_4831();
               }
            }
         }

         if (this.f_18170.m_7145(f_18272)) {
            float var21 = f_18273;
            float var22 = f_18274;
            int var23 = f_11537.getWindow().getGuiScaledWidth() / 2;
            int var24 = f_11537.getWindow().getGuiScaledHeight();
            if (f_11537.player.isCreative()) {
               var24 = (int)(var24 + f_18275);
            }

            float var25 = f_11537.getWindow().getGuiScale();
            float var26 = (var23 + 74 - (f_18166.length - 1) * (var21 + var22)) * var25;
            float var27 = (var23 + 74 + var21) * var25;
            float var28 = (var24 - f_18276) * var25;
            Class_Ssh31B3ljfKeWsvS.m_4862((var26 + var27) * f_18277, var28 + var21 * var25 * f_18278);
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

            try {
               for (int var29 = 0; var29 < f_18166.length; var29++) {
                  ItemStack var30 = f_11537.player.getItemBySlot(f_18166[var29]);
                  if (!var30.isEmpty()) {
                     float var12 = (var23 + 74 - var29 * (var21 + var22)) * var25;
                     float var13 = (var24 - f_18279) * var25;
                     Class_U4Qsm43RVlUI3Pre.m_5197(var30, var12, var13, var25, true, this.f_18167[var29]);
                  }
               }
            } finally {
               Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
               Class_Ssh31B3ljfKeWsvS.m_4831();
            }
         }
      }
   }

   @Generated
   public ItemListSetting m_6177() {
      return this.f_18170;
   }

   @Generated
   public SliderSetting m_6179() {
      return this.f_18171;
   }

   @Override
   public List<Setting<?>> m_784() {
      return List.of(this.f_18170, this.f_18171, this.f_18172, this.f_18173, this.f_18174);
   }

   @Generated
   public CheckboxSetting m_6180() {
      return this.f_18178;
   }

   @Generated
   public CheckboxSetting m_6181() {
      return this.f_18184;
   }

   @Override
   public void m_778() {
      try {
         DimasikClient.m_9057().m_9049().m_2812().m_1249();
      } catch (Throwable var2) {
      }

      DimasikClient.m_9057().m_9049().m_2808().m_5369();
   }

   @Generated
   public ItemListSetting m_6182() {
      return this.f_18177;
   }

   @Generated
   public MultiChoiceSetting m_6184() {
      return this.f_18181;
   }

   @Generated
   public CheckboxSetting m_6185() {
      return this.f_18173;
   }

   @Generated
   public SliderSetting m_6186() {
      return this.f_18182;
   }

   @Generated
   public CheckboxSetting m_6188() {
      return this.f_18175;
   }

   @Generated
   public SliderSetting m_6189() {
      return this.f_18188;
   }

   @Generated
   public SliderSetting m_6191() {
      return this.f_18186;
   }
}
