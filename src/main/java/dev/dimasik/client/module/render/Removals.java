package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;

public class Removals extends Module {
   private static volatile boolean f_2450;
   private static volatile boolean f_2451;
   private final ItemListSetting f_2452;
   private boolean f_2453;
   private final Class_gEPk7yDw6CwIte87<Class_xYKqykPYp6IuC6PX> f_2454;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_2455;
   private static final String f_2456 = "Removals";
   private static final String f_2457 = "Убирает выбранные визуальные элементы";
   private static final String f_2458 = "Применять на";
   private static final String f_2459 = "Тряска камеры";
   private static final String f_2460 = "Скорборд";
   private static final String f_2461 = "Босс-бар";
   private static final String f_2462 = "Частицы разрушения";
   private static final String f_2463 = "Дождь";
   private static final String f_2464 = "Камера клип";
   private static final String f_2465 = "Тени";
   private static final String f_2466 = "Дым";
   private static final String f_2467 = "Снесение тотема";
   private static final String f_2468 = "Виньетка";
   private static final String f_2469 = "Голограммы";
   private static final String f_2470 = "Эффект здоровья";
   private static final String f_2471 = "Трава";
   private static final String f_2472 = "Плохие эффекты";
   private static final String f_2473 = "Свечение игроков";
   private static final String f_2474 = "Размытие под водой";
   private static final String f_2475 = "Туман в воде и лаве";
   private static final String f_2476 = "Огонь";
   private static final String f_2477 = "Рыхлый Снег";
   private static final String f_2478 = "Динамический ФОВ";
   private static final String f_2479 = "Тайтлы";
   private static final String f_2480 = "Карты";
   private static final String f_2481 = "Огонь";
   private static final String f_2482 = "Босс-бар";
   private static final String f_2483 = "Скорборд";
   private static final String f_2484 = "Тайтлы";
   private static final String f_2485 = "Снесение тотема";
   private static final String f_2486 = "Тряска камеры";
   private static final String f_2487 = "Камера клип";
   private static final String f_2488 = "Частицы разрушения";
   private static final String f_2489 = "Дождь";
   private static final String f_2490 = "Тени";
   private static final String f_2491 = "Свечение игроков";
   private static final String f_2492 = "Дым";
   private static final String f_2493 = "Виньетка";
   private static final String f_2494 = "Голограммы";
   private static final String f_2495 = "Трава";
   private static final String f_2496 = "Эффект здоровья";
   private static final String f_2497 = "Плохие эффекты";
   private static final String f_2498 = "Размытие под водой";
   private static final String f_2499 = "Динамический ФОВ";
   private static final String f_2500 = "Рыхлый Снег";
   private static final String f_2501 = "Трава";
   private static final String f_2502 = "Трава";
   private static final String f_2503 = "Карты";
   private static final String f_2504 = "Туман в воде и лаве";

   public Removals() {
      super(f_2456, f_2457, Category.RENDER);
      this.f_2452 = new ItemListSetting(
         f_2458,
         new Class_2ZaVm8TGDJ68TnJB(f_2459, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2460, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2461, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2462, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2463, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2464, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2465, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2466, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2467, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2468, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2469, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2470, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2471, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2472, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2473, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2474, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2475, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2476, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2477, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2478, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2479, true),
         new Class_2ZaVm8TGDJ68TnJB(f_2480, true)
      );
      this.f_2454 = this::m_1468;
      this.f_2455 = this::m_1467;
      this.m_795(this.f_2452);
   }

   public static boolean m_1464() {
      return f_2450;
   }

   @Override
   public void m_778() {
      super.m_778();
      this.f_2453 = this.f_2452.m_7145(f_2502);
      this.m_1466();
      this.m_1469();
   }

   public static boolean m_1465() {
      return f_2451;
   }

   @Override
   public void m_732() {
      f_2450 = false;
      f_2451 = false;
      this.m_1469();
      super.m_732();
   }

   private void m_1466() {
      f_2450 = this.f_2452.m_7145(f_2503);
      f_2451 = this.f_2452.m_7145(f_2504);
   }

   private void m_1467(Class_Xu9btcIeUN33XnMK var1) {
      this.m_1466();
      boolean var2 = this.f_2452.m_7145(f_2501);
      if (var2 != this.f_2453) {
         this.f_2453 = var2;
         this.m_1469();
      }
   }

   private void m_1468(Class_xYKqykPYp6IuC6PX var1) {
      boolean var2 = switch (var1.m_9502()) {
         case FIRE -> this.f_2452.m_7145(f_2481);
         case BOSSBAR -> this.f_2452.m_7145(f_2482);
         case SCOREBOARD -> this.f_2452.m_7145(f_2483);
         case TITLE -> this.f_2452.m_7145(f_2484);
         case TOTEM -> this.f_2452.m_7145(f_2485);
         case HURT_TIME -> this.f_2452.m_7145(f_2486);
         case CAMERA_CLIP -> this.f_2452.m_7145(f_2487);
         case DESTROY_PARTICLES -> this.f_2452.m_7145(f_2488);
         case RAIN -> this.f_2452.m_7145(f_2489);
         case SHADOWS -> this.f_2452.m_7145(f_2490);
         case GLOWING -> this.f_2452.m_7145(f_2491);
         case SMOKE -> this.f_2452.m_7145(f_2492);
         case VIGNETTE -> this.f_2452.m_7145(f_2493);
         case HOLOGRAMS -> this.f_2452.m_7145(f_2494);
         case GRASS -> this.f_2452.m_7145(f_2495);
         case HEALTH -> this.f_2452.m_7145(f_2496);
         case BAD_EFFECTS -> this.f_2452.m_7145(f_2497);
         case UNDERWATER_BLUR -> this.f_2452.m_7145(f_2498);
         case DYNAMIC_FOV -> this.f_2452.m_7145(f_2499);
         case POWDER_SNOW -> this.f_2452.m_7145(f_2500);
      };
      if (var2) {
         var1.m_1582(true);
      }
   }

   private void m_1469() {
      if (f_11537.level != null) {
         f_11537.levelExtractor.allChanged();
      }
   }
}
