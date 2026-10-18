package dev.dimasik.client.module.misc;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_PlAkZAQgfIOFZi5F;
import dev.dimasik.client.system.Class_PwhkzxQl0NRqCDbQ;
import dev.dimasik.client.system.Class_SluWNIC7qlm0dHwu;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_fFSER1OTAD5huhkq;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.KeyMapping;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundSectionBlocksUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Objective;
import org.joml.Vector2f;

public class FuntimeHelper extends Module {
   private final IntegerSetting f_284;
   private final IntegerSetting f_285;
   private final IntegerSetting f_286;
   private final IntegerSetting f_287;
   private final IntegerSetting f_288;
   private final IntegerSetting f_289;
   private final IntegerSetting f_290;
   private final IntegerSetting f_291;
   private final IntegerSetting f_292;
   private final IntegerSetting f_293;
   private final IntegerSetting f_294;
   private final IntegerSetting f_295;
   private final IntegerSetting f_296;
   private final IntegerSetting f_297;
   private final CheckboxSetting f_298;
   private final CheckboxSetting f_299;
   private final Queue<Map<BlockPos, BlockState>> f_300;
   private final Queue<Class_fFSER1OTAD5huhkq.ALB47PXWjX8QyH9A> f_301;
   private final Map<BlockPos, FuntimeHelper.hx5TQ16nieqnZGWW> f_302;
   private final List<Class_PwhkzxQl0NRqCDbQ> f_303;
   private final List<Class_PwhkzxQl0NRqCDbQ> f_304;
   private final Map<String, ItemStack> f_305;
   private final Object f_306;
   private FuntimeHelper.Class_8A3kF0GGDuXjlLnz f_307;
   private FuntimeHelper.zM4WsibcbRaabe1r f_308;
   private int f_309;
   private int f_310;
   private int f_311;
   private boolean f_312;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_313;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_314;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_315;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_316;
   private static final String f_317 = "Funtime Helper";
   private static final String f_318 = "Помощник для сервера Funtime";
   private static final String f_319 = "Кнопка явной пыли";
   private static final String f_320 = "Кнопка дезориентация";
   private static final String f_321 = "Кнопка снежка заморозки";
   private static final String f_322 = "Кнопка пласта";
   private static final String f_323 = "Кнопка трапки";
   private static final String f_324 = "Кнопка огненного смерча";
   private static final String f_325 = "Кнопка божьей ауры";
   private static final String f_326 = "Кнопка хлопушки";
   private static final String f_327 = "Кнопка святой воды";
   private static final String f_328 = "Кнопка зелья гнева";
   private static final String f_329 = "Кнопка зелья палладина";
   private static final String f_330 = "Кнопка зелья ассасина";
   private static final String f_331 = "Кнопка зелья радиации";
   private static final String f_332 = "Кнопка снотворного";
   private static final String f_333 = "Таймер структур";
   private static final String f_334 = "Таймеры пласта и трапки";
   private static final String f_335 = "[★] Хлопушка";
   private static final String f_336 = "[★] Святая вода";
   private static final String f_337 = "[★] Зелье Гнева";
   private static final String f_338 = "[★] Зелье Палладина";
   private static final String f_339 = "[★] Зелье Ассасина";
   private static final String f_340 = "[★] Зелье Радиации";
   private static final String f_341 = "[★] Снотворное";
   private static final double f_342 = 15000.0;
   private static final double f_343 = 30000.0;
   private static final double f_344 = 1000.0;
   private static final String f_345 = "%.1fs";
   private static final double f_346 = 10.0;
   private static final double f_347 = 10.0;
   private static final float f_348 = 34.0F;
   private static final float f_349 = 24.0F;
   private static final float f_350 = 0.5F;
   private static final float f_351 = 0.5F;
   private static final float f_352 = 9.0F;
   private static final double f_353 = 205.0;
   private static final float f_354 = 7.0F;
   private static final double f_355 = 140.0;
   private static final float f_356 = 7.0F;
   private static final double f_357 = 38.0;
   private static final float f_358 = 6.0F;
   private static final float f_359 = 4.0F;
   private static final float f_360 = 27.0F;
   private static final float f_361 = 4.0F;
   private static final double f_362 = 255.0;
   private static final double f_363 = 2.0;
   private static final String f_364 = "null";
   private static final String f_365 = "(?:-|#)(\\d+)";
   private static final String f_366 = "Явная Пыль";
   private static final String f_367 = "Дезориентация";
   private static final String f_368 = "Трапка";
   private static final String f_369 = "Снежок заморозки";
   private static final String f_370 = "Пласт";
   private static final String f_371 = "Огненный смерч";
   private static final String f_372 = "Божья аура";
   private static final String f_373 = "[★] Хлопушка";
   private static final String f_374 = "[★] Святая вода";
   private static final String f_375 = "[★] Зелье Гнева";
   private static final String f_376 = "[★] Зелье Палладина";
   private static final String f_377 = "[★] Зелье Ассасина";
   private static final String f_378 = "[★] Зелье Радиации";
   private static final String f_379 = "[★] Снотворное";
   private static final String f_380 = "[★] ";
   private static final long f_381 = 2500L;

   private void m_707(Item var1, Vec3 var2, double var3) {
      if (this.f_303.stream().noneMatch(var1x -> var1x.m_4232().equals(var2))) {
         this.f_303.add(new Class_PwhkzxQl0NRqCDbQ(var1, var2, this.m_733(), this.m_714(), var3));
      }
   }

   private void m_708(Map<BlockPos, BlockState> var1) {
      for (BlockPos var3 : var1.keySet()) {
         Vec3 var4 = Vec3.atCenterOf(var3);
         if (this.m_710(var3.above(2), var1)) {
            this.m_707(Items.NETHERITE_SCRAP, var4, System.currentTimeMillis() + f_342);
         } else if (this.m_719(var3.above(3), var1)) {
            this.m_707(Items.NETHERITE_SCRAP, var4, System.currentTimeMillis() + f_343);
         }
      }
   }

   public FuntimeHelper() {
      super(f_317, f_318, Category.MISC);
      this.f_284 = new IntegerSetting(f_319);
      this.f_285 = new IntegerSetting(f_320);
      this.f_286 = new IntegerSetting(f_321);
      this.f_287 = new IntegerSetting(f_322);
      this.f_288 = new IntegerSetting(f_323);
      this.f_289 = new IntegerSetting(f_324);
      this.f_290 = new IntegerSetting(f_325);
      this.f_291 = new IntegerSetting(f_326);
      this.f_292 = new IntegerSetting(f_327);
      this.f_293 = new IntegerSetting(f_328);
      this.f_294 = new IntegerSetting(f_329);
      this.f_295 = new IntegerSetting(f_330);
      this.f_296 = new IntegerSetting(f_331);
      this.f_297 = new IntegerSetting(f_332);
      this.f_298 = new CheckboxSetting(f_333, true);
      this.f_299 = new CheckboxSetting(f_334, true);
      this.f_300 = new ConcurrentLinkedQueue<>();
      this.f_301 = new ConcurrentLinkedQueue<>();
      this.f_302 = new HashMap<>();
      this.f_303 = new ArrayList<>();
      this.f_304 = new ArrayList<>();
      this.f_305 = new HashMap<>();
      this.f_306 = new Object();
      this.f_308 = FuntimeHelper.zM4WsibcbRaabe1r.IDLE;
      this.f_310 = -1;
      this.f_311 = -1;
      this.f_313 = this::m_716;
      this.f_314 = this::m_729;
      this.f_315 = this::m_742;
      this.f_316 = this::m_730;
      this.m_795(
         this.f_284,
         this.f_285,
         this.f_286,
         this.f_287,
         this.f_288,
         this.f_289,
         this.f_290,
         this.f_291,
         this.f_292,
         this.f_293,
         this.f_294,
         this.f_295,
         this.f_296,
         this.f_297,
         this.f_298,
         this.f_299
      );
   }

   private boolean m_710(BlockPos var1, Map<BlockPos, BlockState> var2) {
      int var3 = 0;

      for (BlockPos var5 : this.m_715(var1, 2)) {
         if (Vec3.atCenterOf(var5).distanceTo(Vec3.atCenterOf(var1)) < f_363) {
            BlockState var6 = (BlockState)var2.get(var5);
            if (var6 != null && !var6.isAir()) {
               var3++;
            }
         } else if (!var5.equals(var1.above(2).north().east())
            && !var5.equals(var1.above(2).north().west())
            && !var5.equals(var1.above(2).south().east())
            && !var5.equals(var1.above(2).south().west())) {
            BlockState var7 = (BlockState)var2.get(var5);
            if (var7 == null || var7.isAir()) {
               var3++;
            }
         }

         if (var3 > 5) {
            return false;
         }
      }

      return true;
   }

   public List<Class_PlAkZAQgfIOFZi5F> m_711() {
      return List.of(
         new Class_PlAkZAQgfIOFZi5F(Items.SUGAR, this.f_284.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.ENDER_EYE, this.f_285.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.SNOWBALL, this.f_286.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.DRIED_KELP, this.f_287.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.NETHERITE_SCRAP, this.f_288.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.FIRE_CHARGE, this.f_289.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.PHANTOM_MEMBRANE, this.f_290.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(this.m_717(f_335), this.f_291.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(this.m_717(f_336), this.f_292.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(this.m_717(f_337), this.f_293.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(this.m_717(f_338), this.f_294.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(this.m_717(f_339), this.f_295.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(this.m_717(f_340), this.f_296.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(this.m_717(f_341), this.f_297.m_8768())
      );
   }

   private void m_713(int var1) {
      if (var1 >= 0 && var1 <= 8) {
         f_11537.player.getInventory().selected = var1;
         Class_B6vpBUNmRtH3JzmV.m_2131(var1);
      }
   }

   private int m_714() {
      if (f_11537.level == null) {
         return -1;
      }

      Objective var1 = f_11537.level.getScoreboard().getDisplayObjective(DisplaySlot.SIDEBAR);
      if (var1 == null) {
         return -1;
      }

      Matcher var2 = Pattern.compile(f_365).matcher(var1.getDisplayName().getString());
      return var2.find() ? Integer.parseInt(var2.group(1)) : -1;
   }

   private List<BlockPos> m_715(BlockPos var1, int var2) {
      ArrayList var3 = new ArrayList();

      for (int var4 = var1.getX() - var2; var4 <= var1.getX() + var2; var4++) {
         for (int var5 = var1.getZ() - var2; var5 <= var1.getZ() + var2; var5++) {
            for (int var6 = var1.getY() - var2; var6 < var1.getY() + var2; var6++) {
               var3.add(new BlockPos(var4, var6, var5));
            }
         }
      }

      return var3;
   }

   private void m_716(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         HashMap var2 = new HashMap();

         Map var3;
         while ((var3 = this.f_300.poll()) != null) {
            var2.putAll(var3);
         }

         long var4 = System.currentTimeMillis();
         this.f_302.entrySet().removeIf(var2x -> var4 - var2x.getValue().time() > f_381);
         var2.forEach((var3x, var4x) -> this.f_302.put((BlockPos) var3x, new FuntimeHelper.hx5TQ16nieqnZGWW((BlockState) var4x, var4)));
         if (!var2.isEmpty() && this.f_302.size() > 35 && this.f_302.size() < 1600) {
            HashMap var6 = new HashMap();
            this.f_302.forEach((var1x, var2x) -> var6.put(var1x, var2x.state()));
            this.m_708(var6);
         }

         Class_fFSER1OTAD5huhkq.ALB47PXWjX8QyH9A var7;
         while ((var7 = this.f_301.poll()) != null) {
            this.m_738(var7);
         }

         this.f_304.removeIf(var0 -> var0.m_4229() <= System.currentTimeMillis());
         this.f_303.removeIf(var0 -> var0.m_4229() <= System.currentTimeMillis());
         this.m_736();
      }
   }

   private ItemStack m_717(String var1) {
      return this.f_305
         .computeIfAbsent(
            var1,
            var0 -> Class_SluWNIC7qlm0dHwu.f_13386
               .stream()
               .filter(var1x -> var1x.name().equals(var0) && var1x.item() == Items.SPLASH_POTION)
               .findFirst()
               .map(Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP::stack)
               .orElseGet(Items.SPLASH_POTION::getDefaultInstance)
         );
   }

   private boolean m_719(BlockPos var1, Map<BlockPos, BlockState> var2) {
      int var3 = 0;

      for (BlockPos var5 : this.m_715(var1, 3)) {
         if (Math.abs(var5.getX() - var1.getX()) <= 2 && Math.abs(var5.getY() - var1.getY()) <= 2 && Math.abs(var5.getZ() - var1.getZ()) <= 2) {
            BlockState var7 = (BlockState)var2.get(var5);
            if (var7 != null && !var7.isAir()) {
               var3++;
            }
         } else if (!var5.equals(var1.above(3))) {
            BlockState var6 = (BlockState)var2.get(var5);
            if (var6 == null || var6.isAir()) {
               var3++;
            }
         }

         if (var3 > 5) {
            return false;
         }
      }

      return true;
   }

   private void m_720(Class_PwhkzxQl0NRqCDbQ var1) {
      String var2 = this.m_733();
      int var3 = this.m_714();
      if (var1.m_4228().equals(var2) && (var1.m_4230() < 0 || var3 < 0 || var1.m_4230() == var3)) {
         Vector2f var4 = Class_FvJXUGWpZo3zYBW4.m_2690(var1.m_4232());
         if (var4 != null) {
            double var5 = Math.max(0.0, (var1.m_4229() - System.currentTimeMillis()) / f_344);
            String var7 = String.format(Locale.US, f_345, Math.round(var5 * f_346) / f_347);
            float var8 = f_348 + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var7, 12);
            float var9 = f_349;
            float var10 = var4.x - var8 * f_350;
            float var11 = var4.y - var9 * f_351;
            Class_Ssh31B3ljfKeWsvS.m_4859(var10, var11, var8, var9, f_352, Class_BftdentXEtGbugJw.m_2303(0, 0, 0, f_353));
            Class_Ssh31B3ljfKeWsvS.m_4817(var10, var11, var8, var9, f_354, Class_BftdentXEtGbugJw.m_2303(9, 14, 22, f_355));
            Class_Ssh31B3ljfKeWsvS.m_4854(var10, var11, var8, var9, 1.0F, f_356, Class_BftdentXEtGbugJw.m_2303(93, 184, 255, f_357));
            Class_Ssh31B3ljfKeWsvS.m_4851(var1.m_4231().getDefaultInstance(), var10 + f_358, var11 + f_359, 1.0F, false);
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9588(), var7, var10 + f_360, var11 + f_361, 12, Class_BftdentXEtGbugJw.m_2303(232, 246, 255, f_362)
            );
         }
      }
   }

   private void m_722(FuntimeHelper.Class_8A3kF0GGDuXjlLnz var1) {
      if (f_11537.player != null && this.f_307 == null && this.f_308 == FuntimeHelper.zM4WsibcbRaabe1r.IDLE) {
         int var2 = this.m_740(var1);
         if (var2 == -1) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1.name() + "");
         } else {
            this.f_307 = var1;
            this.f_311 = var2;
            this.f_310 = f_11537.player.getInventory().selected;
            this.f_308 = FuntimeHelper.zM4WsibcbRaabe1r.ACQUIRE;
         }
      }
   }

   private void m_727() {
      if (f_11537.gui.screen() == null) {
         KeyMapping[] var1 = new KeyMapping[]{
            f_11537.options.keyUp,
            f_11537.options.keyDown,
            f_11537.options.keyLeft,
            f_11537.options.keyRight,
            f_11537.options.keyJump,
            f_11537.options.keySprint
         };

         for (KeyMapping var5 : var1) {
            var5.setDown(InputConstants.isKeyDown(f_11537.getWindow(), var5.key.getValue()));
         }
      }
   }

   private void m_729(Class_B6JOzHnwhU3pe4AO var1) {
      boolean var2 = var1.m_2116() == 1;
      if (f_11537.gui.screen() == null) {
         if (var2 && var1.m_2117() == this.f_284.m_8768()) {
            this.m_739(Items.SUGAR, f_366);
         }

         if (var2 && var1.m_2117() == this.f_285.m_8768()) {
            this.m_739(Items.ENDER_EYE, f_367);
         }

         if (var2 && var1.m_2117() == this.f_288.m_8768()) {
            this.m_739(Items.NETHERITE_SCRAP, f_368);
         }

         if (var2 && var1.m_2117() == this.f_286.m_8768()) {
            this.m_739(Items.SNOWBALL, f_369);
         }

         if (var2 && var1.m_2117() == this.f_287.m_8768()) {
            this.m_739(Items.DRIED_KELP, f_370);
         }

         if (var2 && var1.m_2117() == this.f_289.m_8768()) {
            this.m_739(Items.FIRE_CHARGE, f_371);
         }

         if (var2 && var1.m_2117() == this.f_290.m_8768()) {
            this.m_739(Items.PHANTOM_MEMBRANE, f_372);
         }

         if (var2 && var1.m_2117() == this.f_291.m_8768()) {
            this.m_731(f_373);
         }

         if (var2 && var1.m_2117() == this.f_292.m_8768()) {
            this.m_731(f_374);
         }

         if (var2 && var1.m_2117() == this.f_293.m_8768()) {
            this.m_731(f_375);
         }

         if (var2 && var1.m_2117() == this.f_294.m_8768()) {
            this.m_731(f_376);
         }

         if (var2 && var1.m_2117() == this.f_295.m_8768()) {
            this.m_731(f_377);
         }

         if (var2 && var1.m_2117() == this.f_296.m_8768()) {
            this.m_731(f_378);
         }

         if (var2 && var1.m_2117() == this.f_297.m_8768()) {
            this.m_731(f_379);
         }
      }
   }

   private void m_730(Class_bhRaN0YSSLQRYjPo var1) {
      if (var1.m_6083() != null && f_11537.level != null) {
         if (this.f_298.m_8768()) {
            for (Class_PwhkzxQl0NRqCDbQ var3 : this.f_303) {
               this.m_720(var3);
            }
         }

         if (this.f_299.m_8768()) {
            for (Class_PwhkzxQl0NRqCDbQ var5 : this.f_304) {
               this.m_720(var5);
            }
         }
      }
   }

   private void m_731(String var1) {
      Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP var2 = Class_SluWNIC7qlm0dHwu.f_13386
         .stream()
         .filter(var1x -> var1x.name().equals(var1))
         .findFirst()
         .orElse(null);
      this.m_722(new FuntimeHelper.Class_8A3kF0GGDuXjlLnz(Items.SPLASH_POTION, var2, var1.replace(f_380, "")));
   }

   @Override
   public void m_732() {
      this.f_303.clear();
      this.f_304.clear();
      this.f_300.clear();
      this.f_301.clear();
      this.f_302.clear();
      this.m_734();
      this.m_741();
   }

   private String m_733() {
      return f_11537.level == null ? f_364 : f_11537.level.dimension().identifier().getPath();
   }

   private void m_734() {
      if (f_11537.player != null && f_11537.gameMode != null && this.f_310 >= 0) {
         if (this.f_312 && this.f_311 >= 9) {
            Class_B6vpBUNmRtH3JzmV.m_2129(this.f_310, this.f_311);
         }

         this.m_713(this.f_310);
      }
   }

   private void m_736() {
      if (this.f_308 != FuntimeHelper.zM4WsibcbRaabe1r.IDLE && f_11537.player != null && f_11537.gameMode != null) {
         if (f_11537.gui.screen() == null) {
            if (this.f_308 == FuntimeHelper.zM4WsibcbRaabe1r.ACQUIRE) {
               if (!Class_8x4deAyjocMIBSj7.m_1904(this.f_306)) {
                  return;
               }

               this.m_745(true);
               this.f_308 = FuntimeHelper.zM4WsibcbRaabe1r.WAIT_MOVEMENT;
               this.f_309 = this.m_737();
            }

            this.m_743();
            if (this.f_309 > 0) {
               this.f_309--;
            } else {
               switch (this.f_308) {
                  case WAIT_MOVEMENT:
                     this.f_311 = this.m_740(this.f_307);
                     if (this.f_311 == -1) {
                        Class_ftHu9o3WzCU3Adxm.m_6731(this.f_307.name() + "");
                        this.m_741();
                        return;
                     }

                     if (this.f_311 < 9) {
                        this.m_713(this.f_311);
                     } else {
                        Class_B6vpBUNmRtH3JzmV.m_2129(this.f_310, this.f_311);
                        this.f_312 = true;
                     }

                     this.f_308 = FuntimeHelper.zM4WsibcbRaabe1r.USE;
                     this.f_309 = this.m_737();
                     break;
                  case USE:
                     f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
                     this.f_308 = FuntimeHelper.zM4WsibcbRaabe1r.RESTORE;
                     this.f_309 = this.m_737();
                     break;
                  case RESTORE:
                     if (this.f_312) {
                        Class_B6vpBUNmRtH3JzmV.m_2129(this.f_310, this.f_311);
                     }

                     this.m_713(this.f_310);
                     this.f_308 = FuntimeHelper.zM4WsibcbRaabe1r.FINISH;
                     this.f_309 = this.m_737();
                     break;
                  case FINISH:
                     this.m_741();
               }
            }
         }
      }
   }

   private int m_737() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue();
   }

   private void m_738(Class_fFSER1OTAD5huhkq.ALB47PXWjX8QyH9A var1) {
      this.f_304.removeIf(var1x -> var1x.m_4232().distanceToSqr(var1.position()) < 1.0);
      this.f_304.add(new Class_PwhkzxQl0NRqCDbQ(var1.item(), var1.position(), this.m_733(), this.m_714(), System.currentTimeMillis() + var1.durationMs()));
   }

   private void m_739(Item var1, String var2) {
      this.m_722(new FuntimeHelper.Class_8A3kF0GGDuXjlLnz(var1, null, var2));
   }

   private int m_740(FuntimeHelper.Class_8A3kF0GGDuXjlLnz var1) {
      if (f_11537.player != null && var1 != null) {
         NonNullList var2 = f_11537.player.getInventory().getNonEquipmentItems();

         for (int var3 = var2.size() - 1; var3 >= 0; var3--) {
            ItemStack var4 = (ItemStack)var2.get(var3);
            if (!var4.isEmpty() && var4.is(var1.item()) && (var1.catalogEntry() == null || var1.catalogEntry().matches(var4))) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void m_741() {
      this.m_745(false);
      Class_8x4deAyjocMIBSj7.m_1905(this.f_306);
      this.m_727();
      this.f_307 = null;
      this.f_308 = FuntimeHelper.zM4WsibcbRaabe1r.IDLE;
      this.f_309 = 0;
      this.f_310 = -1;
      this.f_311 = -1;
      this.f_312 = false;
   }

   private void m_742(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.f_299.m_8768() && var1.m_5619() instanceof ClientboundSoundPacket var2) {
         this.f_301.addAll(Class_fFSER1OTAD5huhkq.m_6480(var2));
      }

      if (this.f_298.m_8768()) {
         HashMap var6 = new HashMap();
         if (var1.m_5619() instanceof ClientboundSectionBlocksUpdatePacket var4) {
            var4.runUpdates((var1x, var2x) -> var6.put(var1x.immutable(), var2x));
         } else {
            if (!(var1.m_5619() instanceof ClientboundBlockUpdatePacket var7)) {
               return;
            }

            var6.put(var7.getPos().immutable(), var7.getBlockState());
         }

         if (!var6.isEmpty()) {
            this.f_300.add(var6);
         }
      }
   }

   private void m_743() {
      KeyMapping[] var1 = new KeyMapping[]{
         f_11537.options.keyUp, f_11537.options.keyDown, f_11537.options.keyLeft, f_11537.options.keyRight, f_11537.options.keyJump, f_11537.options.keySprint
      };

      for (KeyMapping var5 : var1) {
         var5.setDown(false);
      }
   }

   public List<Class_PwhkzxQl0NRqCDbQ> m_744() {
      return this.f_303;
   }

   private void m_745(boolean var1) {
      if (var1) {
         DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5156(this.f_306);
      } else {
         DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5155(this.f_306);
      }
   }

   private record Class_8A3kF0GGDuXjlLnz(Item item, Class_SluWNIC7qlm0dHwu.Class_3w2x36ewkoAH3rZP catalogEntry, String name) {
   }

   private record hx5TQ16nieqnZGWW(BlockState state, long time) {
   }

   private enum zM4WsibcbRaabe1r {
      IDLE,
      ACQUIRE,
      WAIT_MOVEMENT,
      USE,
      RESTORE,
      FINISH;
   }
}
