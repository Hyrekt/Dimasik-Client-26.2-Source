package dev.dimasik.client.module.render;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.setting.impl.StringSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_CPqSaXQtUSOKX1Z4;
import dev.dimasik.client.system.Class_Q49u2s432M4ulFXV;
import dev.dimasik.client.system.Class_Q49u2s432M4ulFXV$QeFcIXK8xVLAApCu;
import dev.dimasik.client.system.Class_RrU3nDtha9Dd2JqS;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_UiQ3442HnvvsK2qb;
import dev.dimasik.client.system.Class_V7bm8pF2tjL9Evnq;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_i0GDVYUh4DGVWtXa;
import dev.dimasik.client.system.Class_lvSdQbZIK6LWhOfu;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.Scoreboard;

public class BetterMinecraft extends Module {
   private final StringSetting f_16476;
   public final ItemListSetting f_16477;
   private final SliderSetting f_16478;
   private final StringSetting f_16479;
   public final CheckboxSetting f_16480;
   public final SliderSetting f_16481;
   public final MultiChoiceSetting f_16482;
   public final MultiChoiceSetting f_16483;
   public final Class_RrU3nDtha9Dd2JqS f_16484;
   private final StringSetting f_16485;
   public final CheckboxSetting f_16486;
   private final SliderSetting f_16487;
   public final SliderSetting f_16488;
   public final CheckboxSetting f_16489;
   private final CheckboxSetting f_16490;
   private final SliderSetting f_16491;
   private Entity f_16492;
   private long f_16493;
   private float f_16494;
   private Vec2 f_16495;
   private Vec3 f_16496;
   private boolean f_16497;
   public final ItemListSetting f_16498;
   private final StringSetting f_16499;
   private final CheckboxSetting f_16500;
   private final CheckboxSetting f_16501;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo.SUSXKajFiEmtJOMn> f_16502;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_16503;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo.LeCf1iKfPVPci6zr> f_16504;
   private final Class_gEPk7yDw6CwIte87<Class_CPqSaXQtUSOKX1Z4> f_16505;
   private final Class_gEPk7yDw6CwIte87<Class_i0GDVYUh4DGVWtXa> f_16506;
   private final Class_gEPk7yDw6CwIte87<Class_lvSdQbZIK6LWhOfu> f_16507;
   private final Class_gEPk7yDw6CwIte87<Class_Q49u2s432M4ulFXV.szHURrSSq5MK0Lun> f_16508;
   private final Class_gEPk7yDw6CwIte87<Class_Q49u2s432M4ulFXV.md2fuys8biu4Kb1I> f_16509;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_16510;
   private final Class_gEPk7yDw6CwIte87<Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB> f_16511;
   private final Class_gEPk7yDw6CwIte87<Class_Q49u2s432M4ulFXV.fUSCJlrSiIciub1c> f_16512;
   private final Class_gEPk7yDw6CwIte87<Class_Q49u2s432M4ulFXV.CwiKd8zPwK2PGGOy> f_16513;
   private static final float f_16514 = -0.1F;
   private static final float f_16515 = 1.1F;
   private final Class_w8fCJQ5ZtH5lQbWc f_16516;
   private final Class_w8fCJQ5ZtH5lQbWc f_16517;
   private boolean f_16518;
   private boolean f_16519;
   private static final String f_16520 = "Better Minecraft";
   private static final String f_16521 = "Улучшает майнкрафт";
   private static final String f_16522 = "Анимации";
   private static final String f_16523 = "Что анимировать";
   private static final String f_16524 = "Список игроков";
   private static final String f_16525 = "Инвентарь";
   private static final String f_16526 = "Изменение перспективы";
   private static final String f_16527 = "Скорость анимации";
   private static final float f_16528 = 0.2F;
   private static final float f_16529 = 0.08F;
   private static final float f_16530 = 0.45F;
   private static final float f_16531 = 0.01F;
   private static final String f_16532 = "Элементы рендера";
   private static final String f_16533 = "Анимация чанков";
   private static final String f_16534 = "Длительность анимации чанков";
   private static final float f_16535 = 1000.0F;
   private static final float f_16536 = 100.0F;
   private static final float f_16537 = 5000.0F;
   private static final float f_16538 = 100.0F;
   private static final String f_16539 = "Направление чанков";
   private static final String f_16540 = "Снизу";
   private static final String f_16541 = "Сверху";
   private static final String f_16542 = "От горизонта";
   private static final String f_16543 = "От игрока";
   private static final String f_16544 = "По направлению";
   private static final String f_16545 = "Интерполяция чанков";
   private static final String f_16546 = "Linear";
   private static final String f_16547 = "Quad";
   private static final String f_16548 = "Cubic";
   private static final String f_16549 = "Quart";
   private static final String f_16550 = "Quint";
   private static final String f_16551 = "Expo";
   private static final String f_16552 = "Sine";
   private static final String f_16553 = "Circ";
   private static final String f_16554 = "Back";
   private static final String f_16555 = "Bounce";
   private static final String f_16556 = "Elastic";
   private static final String f_16557 = "Камера";
   private static final String f_16558 = "Своя камера";
   private static final String f_16559 = "Дистанция камеры";
   private static final float f_16560 = 3.0F;
   private static final float f_16561 = 10.0F;
   private static final float f_16562 = 0.5F;
   private static final String f_16563 = "Смещение камеры по X";
   private static final float f_16564 = -2.0F;
   private static final float f_16565 = 0.05F;
   private static final String f_16566 = "Камера сквозь стены";
   private static final String f_16567 = "Плавная камера";
   private static final String f_16568 = "Скорость плавности камеры";
   private static final float f_16569 = 8.0F;
   private static final float f_16570 = 20.0F;
   private static final String f_16571 = "Что изменять";
   private static final String f_16572 = "Хотбар";
   private static final String f_16573 = "HUD";
   private static final String f_16574 = "Сдвиг от таба и боссбара";
   private static final String f_16575 = "Менять Положение ScoreBoard";
   private static final float f_16576 = 5.0F;
   private static final float f_16577 = 12.0F;
   private static final double f_16578 = 1.0E9;
   private static final double f_16579 = 0.1;
   private static final double f_16580 = 256.0;
   private static final float f_16581 = 4.0F;
   private static final String f_16582 = "Инвентарь";
   private static final String f_16583 = "Список игроков";
   private static final float f_16584 = 0.001F;
   private static final float f_16585 = 0.001F;
   private static final float f_16586 = 1.1F;
   private static final String f_16587 = "Список игроков";
   private static final float f_16588 = 0.001F;
   private static final String f_16589 = "Изменение перспективы";
   private static final String f_16590 = "Хотбар";
   private static final float f_16591 = 182.0F;
   private static final float f_16592 = 364.0F;
   private static final float f_16593 = 44.0F;
   private static final float f_16594 = 12.0F;
   private static final float f_16595 = 364.0F;
   private static final float f_16596 = 44.0F;
   private static final float f_16597 = 24.0F;
   private static final float f_16598 = 6.0F;
   private static final float f_16599 = 182.0F;
   private static final float f_16600 = 3.0F;
   private static final float f_16601 = 3.0F;
   private static final float f_16602 = 38.0F;
   private static final float f_16603 = 38.0F;
   private static final float f_16604 = 5.0F;
   private static final double f_16605 = 150.0;
   private static final float f_16606 = 180.0F;
   private static final float f_16607 = 4.0F;
   private static final float f_16608 = 6.0F;
   private static final float f_16609 = 32.0F;
   private static final float f_16610 = 32.0F;
   private static final float f_16611 = 182.0F;
   private static final float f_16612 = 52.0F;
   private static final float f_16613 = 6.0F;
   private static final float f_16614 = 32.0F;
   private static final float f_16615 = 32.0F;
   private static final float f_16616 = 182.0F;
   private static final float f_16617 = 20.0F;
   private static final float f_16618 = 6.0F;
   private static final float f_16619 = 32.0F;
   private static final float f_16620 = 32.0F;
   private static final float f_16621 = 0.5F;
   private static final float f_16622 = -0.1F;
   private static final float f_16623 = 1.1F;
   private static final float f_16624 = 1.0E-4F;
   private static final float f_16625 = 1.1F;
   private static final float f_16626 = 1.0E-4F;
   private static final float f_16627 = 1.0E9F;
   private static final float f_16628 = 3.0F;
   private static final String f_16629 = "Изменение перспективы";

   private void m_5722() {
      Class_UiQ3442HnvvsK2qb var1 = m_5726();
      if (var1 != null) {
         var1.m_5267();
         var1.m_5272();
      }
   }

   private void m_5723(Class_Q49u2s432M4ulFXV.fUSCJlrSiIciub1c var1) {
      var1.m_4236(this.f_16501.m_8768());
   }

   private void m_5724(Class_Q49u2s432M4ulFXV.iAAyuBd3W7AP4wvB var1) {
      if (this.f_16477.m_7145(f_16589)) {
         var1.m_4242(true);
         var1.m_4237(this.m_5749());
         var1.m_4240(this.m_5740(var1.m_4243()));
      }
   }

   private boolean m_5725() {
      return this.f_16501.m_8768();
   }

   private static Class_UiQ3442HnvvsK2qb m_5726() {
      try {
         Class_V7bm8pF2tjL9Evnq var0 = DimasikClient.m_9057().m_9049().m_2808();
         return var0 == null ? null : var0.m_5359();
      } catch (Throwable var1) {
         return Class_UiQ3442HnvvsK2qb.m_5279();
      }
   }

   private void m_5727(Class_Q49u2s432M4ulFXV.md2fuys8biu4Kb1I var1) {
      if (this.f_16477.m_7145(f_16583)) {
         if (var1.m_4245() && !this.f_16518) {
            this.f_16518 = true;
         }

         float var2 = this.m_5732(var1.m_4245());
         if (!var1.m_4245() && var2 <= f_16584 && this.f_16516.m_9280()) {
            this.f_16518 = false;
         }

         var1.m_4246(true);
         var1.m_4248(Mth.clamp(var2, f_16585, f_16586));
      }
   }

   public void m_5728(Entity var1) {
      boolean var2 = this.m_776()
         && this.f_16486.m_8768()
         && f_11537.level != null
         && var1 != null
         && !f_11537.options.getCameraType().isFirstPerson()
         && !DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776();
      if (!var2) {
         this.m_5729();
      } else {
         long var3 = System.nanoTime();
         if (!this.f_16497 || this.f_16492 != var1) {
            this.m_5729();
            this.f_16492 = var1;
         }

         this.f_16497 = true;
         double var5 = this.f_16493 == 0L ? 0.0 : Math.min((var3 - this.f_16493) / f_16578, f_16579);
         this.f_16494 = (float)(1.0 - Math.exp(-this.f_16491.m_8768() * var5));
         this.f_16493 = var3;
      }
   }

   private void m_5729() {
      this.f_16497 = false;
      this.f_16492 = null;
      this.f_16495 = null;
      this.f_16496 = null;
      this.f_16493 = 0L;
   }

   private static boolean m_5731() {
      try {
         Class_V7bm8pF2tjL9Evnq var0 = DimasikClient.m_9057().m_9049().m_2808();
         return var0 != null && var0.m_5376();
      } catch (Throwable var1) {
         return false;
      }
   }

   private float m_5732(boolean var1) {
      if (this.f_16519 != var1) {
         float var2 = this.f_16516.m_9288();
         float var3 = Mth.clamp(var2, f_16622, f_16623);
         if (Math.abs(var2 - var3) > f_16624) {
            this.f_16516.m_9281(var3);
         }

         this.f_16519 = var1;
      }

      this.f_16516.m_9283(var1 ? 1.0F : 0.0F);
      return Mth.clamp(this.f_16516.m_9288(), 0.0F, f_16625);
   }

   public float m_5733(float var1) {
      return !this.f_16497 ? var1 : var1 * this.f_16487.m_8768() / f_16581;
   }

   private void m_5734(Class_Q49u2s432M4ulFXV.CwiKd8zPwK2PGGOy var1) {
      var1.m_4233(this.f_16500.m_8768());
   }

   public boolean m_5736() {
      return this.f_16497;
   }

   @Override
   public void m_732() {
      this.m_5729();
      this.f_16484.m_4615();
      this.f_16516.m_9281(0.0F);
      this.f_16517.m_9281(1.0F);
      this.f_16518 = false;
      this.f_16519 = false;
      this.m_5748();
      Class_UiQ3442HnvvsK2qb var1 = m_5726();
      if (var1 != null) {
         var1.m_5286();
      }
   }

   public Vec3 m_5737(Vec3 var1) {
      if (!this.f_16497) {
         return var1;
      }

      if (this.f_16496 != null && this.f_16490.m_8768() && !(this.f_16496.distanceToSqr(var1) > f_16580)) {
         this.f_16496 = this.f_16496.lerp(var1, this.f_16494);
      } else {
         this.f_16496 = var1;
      }

      return this.f_16496;
   }

   private void m_5739(Class_CPqSaXQtUSOKX1Z4 var1) {
      if (!var1.m_1581() && this.m_5725()) {
         Class_UiQ3442HnvvsK2qb var2 = m_5726();
         if (var2 != null) {
            if (var2.m_1340(var1.m_2413(), var1.m_2414(), var1.m_2415())) {
               var1.m_1582(true);
            } else if (!m_5731()) {
               if (var2.m_5283(var1.m_2413(), var1.m_2414(), var1.m_2415())) {
                  var1.m_1582(true);
               }
            }
         }
      }
   }

   private float m_5740(float var1) {
      float var2 = Mth.clamp(var1, 0.0F, 1.0F);
      return var2 * var2 * (f_16628 - 2.0F * var2);
   }

   private void m_5741(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_16477.m_7145(f_16587) && this.f_16518 && f_11537.player != null && f_11537.level != null && f_11537.options != null && f_11537.gui.hud != null
         )
       {
         if (!f_11537.options.keyPlayerList.isDown()) {
            float var2 = this.m_5732(false);
            if (var2 <= f_16588 && this.f_16516.m_9280()) {
               this.f_16518 = false;
            } else {
               Scoreboard var3 = f_11537.level.getScoreboard();
               Objective var4 = var3.getDisplayObjective(DisplaySlot.LIST);
               f_11537.gui.hud.getTabList().extractRenderState(var1.m_6083(), f_11537.getWindow().getGuiScaledWidth(), var3, var4);
            }
         }
      }
   }

   private void m_5742(Class_bhRaN0YSSLQRYjPo.SUSXKajFiEmtJOMn var1) {
      if (this.f_16498.m_7145(f_16590)) {
         float var2 = f_11537.getWindow().getGuiScale();
         float var3 = f_11537.getWindow().getScreenWidth() / 2;
         float var4 = f_11537.getWindow().getScreenHeight() - 44;
         float var5 = var3 - f_16591;
         ItemStack var6 = f_11537.player.getOffhandItem();
         HumanoidArm var7 = f_11537.player.getMainArm().getOpposite();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());
         Class_U4Qsm43RVlUI3Pre.m_5211(var5, var4, f_16592, f_16593, f_16594, Class_BftdentXEtGbugJw.m_2310(0, 0, 0));
         Class_U4Qsm43RVlUI3Pre.m_5219(var5, var4, f_16595, f_16596, f_16597, f_16598, -1);
         Class_U4Qsm43RVlUI3Pre.m_5199(
            var3 - f_16599 + f_11537.player.getInventory().getSelectedSlot() * 40 + f_16600,
            var4 + f_16601,
            f_16602,
            f_16603,
            f_16604,
            Class_BftdentXEtGbugJw.m_2303(20, 20, 20, f_16605)
         );

         for (int var8 = 0; var8 < 9; var8++) {
            float var9 = var3 - f_16606 + var8 * 40 + f_16607;
            Class_U4Qsm43RVlUI3Pre.m_5203(var9, var4 + f_16608, f_16609, f_16610, f_11537.player.getInventory().getItem(var8), true);
         }

         if (!var6.isEmpty()) {
            if (var7 == HumanoidArm.LEFT) {
               Class_U4Qsm43RVlUI3Pre.m_5203(var3 - f_16611 - f_16612, var4 + f_16613, f_16614, f_16615, var6, true);
            } else {
               Class_U4Qsm43RVlUI3Pre.m_5203(var3 + f_16616 + f_16617, var4 + f_16618, f_16619, f_16620, var6, true);
            }
         }

         Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
         var1.m_1582(true);
      }
   }

   private void m_5743() {
      this.f_16517.m_9281(f_16621);
      this.f_16517.m_9283(1.0F);
   }

   public Vec2 m_5744(float var1, float var2) {
      if (!this.f_16497) {
         return new Vec2(var1, var2);
      }

      if (this.f_16495 != null && this.f_16490.m_8768()) {
         this.f_16495 = new Vec2(this.f_16495.x + Mth.wrapDegrees(var1 - this.f_16495.x) * this.f_16494, Mth.lerp(this.f_16494, this.f_16495.y, var2));
      } else {
         this.f_16495 = new Vec2(var1, var2);
      }

      return this.f_16495;
   }

   private float m_5745() {
      return m_5746(this.f_16517, 1.0F);
   }

   private static float m_5746(Class_w8fCJQ5ZtH5lQbWc var0, float var1) {
      if (Math.abs(var0.m_9288() - var1) > f_16626) {
         var0.m_9283(var1);
      }

      return var0.m_9288();
   }

   public BetterMinecraft() {
      super(f_16520, f_16521, Category.RENDER);
      this.f_16476 = new StringSetting(f_16522);
      this.f_16477 = new ItemListSetting(
         f_16523, new Class_2ZaVm8TGDJ68TnJB(f_16524, false), new Class_2ZaVm8TGDJ68TnJB(f_16525, false), new Class_2ZaVm8TGDJ68TnJB(f_16526, false)
      );
      this.f_16478 = new SliderSetting(f_16527, f_16528, f_16529, f_16530).m_828(f_16531).m_822(() -> this.f_16477.m_7145(f_16629));
      this.f_16479 = new StringSetting(f_16532);
      this.f_16480 = new CheckboxSetting(f_16533, false);
      this.f_16481 = new SliderSetting(f_16534, f_16535, f_16536, f_16537).m_828(f_16538).m_822(this.f_16480::m_8768);
      this.f_16482 = new MultiChoiceSetting(
            f_16539,
            new Class_2ZaVm8TGDJ68TnJB(f_16540),
            new Class_2ZaVm8TGDJ68TnJB(f_16541),
            new Class_2ZaVm8TGDJ68TnJB(f_16542),
            new Class_2ZaVm8TGDJ68TnJB(f_16543),
            new Class_2ZaVm8TGDJ68TnJB(f_16544)
         )
         .m_822(this.f_16480::m_8768);
      this.f_16483 = new MultiChoiceSetting(
            f_16545,
            6,
            new Class_2ZaVm8TGDJ68TnJB(f_16546),
            new Class_2ZaVm8TGDJ68TnJB(f_16547),
            new Class_2ZaVm8TGDJ68TnJB(f_16548),
            new Class_2ZaVm8TGDJ68TnJB(f_16549),
            new Class_2ZaVm8TGDJ68TnJB(f_16550),
            new Class_2ZaVm8TGDJ68TnJB(f_16551),
            new Class_2ZaVm8TGDJ68TnJB(f_16552),
            new Class_2ZaVm8TGDJ68TnJB(f_16553),
            new Class_2ZaVm8TGDJ68TnJB(f_16554),
            new Class_2ZaVm8TGDJ68TnJB(f_16555),
            new Class_2ZaVm8TGDJ68TnJB(f_16556)
         )
         .m_822(this.f_16480::m_8768);
      this.f_16484 = new Class_RrU3nDtha9Dd2JqS();
      this.f_16485 = new StringSetting(f_16557);
      this.f_16486 = new CheckboxSetting(f_16558, false);
      this.f_16487 = new SliderSetting(f_16559, f_16560, 1.0F, f_16561).m_828(f_16562).m_822(this.f_16486::m_8768);
      this.f_16488 = new SliderSetting(f_16563, 0.0F, f_16564, 2.0F).m_828(f_16565).m_822(this.f_16486::m_8768);
      this.f_16489 = new CheckboxSetting(f_16566, true).m_822(this.f_16486::m_8768);
      this.f_16490 = new CheckboxSetting(f_16567, true).m_822(this.f_16486::m_8768);
      this.f_16491 = new SliderSetting(f_16568, f_16569, 1.0F, f_16570).m_828(1.0F).m_822(() -> this.f_16486.m_8768() && this.f_16490.m_8768());
      this.f_16494 = 1.0F;
      this.f_16498 = new ItemListSetting(f_16571, new Class_2ZaVm8TGDJ68TnJB(f_16572, false));
      this.f_16499 = new StringSetting(f_16573);
      this.f_16500 = new CheckboxSetting(f_16574, true);
      this.f_16501 = new CheckboxSetting(f_16575, false);
      this.f_16502 = this::m_5742;
      this.f_16503 = this::m_5752;
      this.f_16504 = var1 -> this.m_5722();
      this.f_16505 = this::m_5739;
      this.f_16506 = var1 -> this.m_5748();
      this.f_16507 = var1 -> this.m_5748();
      this.f_16508 = this::m_5750;
      this.f_16509 = this::m_5727;
      this.f_16510 = this::m_5741;
      this.f_16511 = this::m_5724;
      this.f_16512 = this::m_5723;
      this.f_16513 = this::m_5734;
      this.f_16516 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_16576, Class_eXr9Fra2ad3yFXY8.f_19122);
      this.f_16517 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_16577, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.m_795(
         this.f_16476,
         this.f_16477,
         this.f_16478,
         this.f_16480,
         this.f_16481,
         this.f_16482,
         this.f_16483,
         this.f_16485,
         this.f_16486,
         this.f_16487,
         this.f_16488,
         this.f_16489,
         this.f_16490,
         this.f_16491,
         this.f_16479,
         this.f_16498,
         this.f_16499,
         this.f_16500,
         this.f_16501
      );
   }

   private void m_5748() {
      Class_UiQ3442HnvvsK2qb var1 = m_5726();
      if (var1 != null) {
         var1.m_5266();
      }
   }

   private long m_5749() {
      return (long)(this.f_16478.m_8768() * f_16627);
   }

   private void m_5750(Class_Q49u2s432M4ulFXV.szHURrSSq5MK0Lun var1) {
      if (this.f_16477.m_7145(f_16582)) {
         var1.m_4251(true);
         if (var1.m_4250() == Class_Q49u2s432M4ulFXV$QeFcIXK8xVLAApCu.START) {
            this.m_5743();
            var1.m_4252(this.f_16517.m_9288());
         } else {
            var1.m_4252(this.m_5745());
         }
      }
   }

   private void m_5752(Class_bhRaN0YSSLQRYjPo var1) {
      Class_UiQ3442HnvvsK2qb var2 = m_5726();
      if (var2 != null) {
         var2.m_5271();
         if (!m_5731()) {
            var2.m_5269(var1.m_6082(), var1.m_6084());
         }
      }
   }
}
