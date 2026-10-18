package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_LJY6AyYHP77Twgvj;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import dev.dimasik.client.system.Class_rj7yTIJUyflxIxTs;
import dev.dimasik.mixin.MinecraftMixin;
import dev.dimasik.mixin.MultiPlayerGameModeMixin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ServerboundKeepAlivePacket;
import net.minecraft.network.protocol.common.ServerboundPongPacket;
import net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket;
import net.minecraft.network.protocol.game.ClientboundBlockUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundSectionBlocksUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NoClip extends Module {
   private static final int f_6122 = 1;
   private static final int f_6123 = 2;
   private static final long f_6124 = 8000L;
   private static final Set<BlockPos> f_6125 = ConcurrentHashMap.newKeySet();
   private final MultiChoiceSetting f_6126;
   private final SliderSetting f_6127;
   private final SliderSetting f_6128;
   private final SliderSetting f_6129;
   private final SliderSetting f_6130;
   private final CheckboxSetting f_6131;
   private final SliderSetting f_6132;
   private final CheckboxSetting f_6133;
   private final CheckboxSetting f_6134;
   private final CheckboxSetting f_6135;
   private final CheckboxSetting f_6136;
   private final CheckboxSetting f_6137;
   private final CheckboxSetting f_6138;
   private final CheckboxSetting f_6139;
   private final CheckboxSetting f_6140;
   private final CheckboxSetting f_6141;
   private final CheckboxSetting f_6142;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1> f_6143;
   private final SliderSetting f_6144;
   private final Class_QmNR03reugBgWiPr f_6145;
   private final Class_QmNR03reugBgWiPr f_6146;
   private final Class_QmNR03reugBgWiPr f_6147;
   private final List<BlockPos> f_6148;
   private final SliderSetting f_6149;
   private final CheckboxSetting f_6150;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_6151;
   private final List<BlockPos> f_6152;
   private final Map<BlockPos, Long> f_6153;
   private final Class_QmNR03reugBgWiPr f_6154;
   private final CopyOnWriteArrayList<Packet<?>> f_6155;
   private final Class_QmNR03reugBgWiPr f_6156;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_6157;
   private BlockPos f_6158;
   private long f_6159;
   private int f_6160;
   private boolean f_6161;
   private BlockPos f_6162;
   private long f_6163;
   private long f_6164;
   private boolean f_6165;
   private boolean f_6166;
   private int f_6167;
   private BlockPos f_6168;
   private boolean f_6169;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_6170;
   private boolean f_6171;
   private boolean f_6172;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_6173;
   private long f_6174;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_6175;
   private static final String f_6176 = "NoClip";
   private static final String f_6177 = "Позволяет вам ходить через стены и двери";
   private static final String f_6178 = "Режим";
   private static final String f_6179 = "Блоки";
   private static final String f_6180 = "Флай (RW)";
   private static final String f_6181 = "Двери";
   private static final String f_6182 = "Задержка";
   private static final float f_6183 = 500.0F;
   private static final float f_6184 = 500.0F;
   private static final float f_6185 = 50.0F;
   private static final String f_6186 = "Задержка прыжка";
   private static final float f_6187 = 10.0F;
   private static final String f_6188 = "Скорость ломания";
   private static final float f_6189 = 0.1F;
   private static final float f_6190 = 0.05F;
   private static final String f_6191 = "Задержка ПКМ (мс)";
   private static final float f_6192 = 400.0F;
   private static final float f_6193 = 2000.0F;
   private static final float f_6194 = 10.0F;
   private static final String f_6195 = "Увеличивать пинг";
   private static final String f_6196 = "Пинг)";
   private static final float f_6197 = 200.0F;
   private static final float f_6198 = 50.0F;
   private static final float f_6199 = 2000.0F;
   private static final float f_6200 = 25.0F;
   private static final String f_6201 = "Менять порядок ломания";
   private static final String f_6202 = "Ломать только один блок перед собой в позе лежа";
   private static final String f_6203 = "Сквозь люки";
   private static final String f_6204 = "Бурмалда";
   private static final String f_6205 = "Анти-лежак";
   private static final String f_6206 = "Байпассик дорогой";
   private static final String f_6207 = "Бурмалдаяц";
   private static final String f_6208 = "Ломать блоки в которых ты находишься";
   private static final String f_6209 = "Анти-фантом";
   private static final String f_6210 = "Фикс усадки хитбокса";
   private static final String f_6211 = "Интервал перелома (мс)";
   private static final float f_6212 = 200.0F;
   private static final float f_6213 = 2000.0F;
   private static final float f_6214 = 10.0F;
   private static final String f_6215 = "БПС";
   private static final float f_6216 = 12.0F;
   private static final float f_6217 = 20.0F;
   private static final String f_6218 = "Скрывать ломание";
   private static final String f_6219 = "Блоки";
   private static final String f_6220 = "Блоки 2";
   private static final String f_6221 = "Блоки";
   private static final String f_6222 = "Блоки 2";
   private static final String f_6223 = "Двери";
   private static final String f_6224 = "Блоки";
   private static final String f_6225 = "Блоки 2";
   private static final String f_6226 = "Блоки";
   private static final String f_6227 = "Блоки 2";
   private static final String f_6228 = "Флай (RW)";
   private static final String f_6229 = "Блоки";
   private static final String f_6230 = "Блоки 2";
   private static final String f_6231 = "Двери";
   private static final String f_6232 = "Блоки";
   private static final long f_6233 = 50L;
   private static final String f_6234 = "Блоки";
   private static final String f_6235 = "Блоки 2";
   private static final String f_6236 = "Блоки";
   private static final String f_6237 = "Блоки 2";
   private static final String f_6238 = "Блоки";
   private static final String f_6239 = "Блоки";
   private static final String f_6240 = "Флай (RW)";
   private static final String f_6241 = "Блоки";
   private static final String f_6242 = "Блоки 2";
   private static final String f_6243 = "Двери";
   private static final String f_6244 = "Блоки";
   private static final String f_6245 = "Блоки";
   private static final String f_6246 = "Блоки 2";
   private static final long f_6247 = 8000L;
   private static final String f_6248 = "Блоки";
   private static final String f_6249 = "Блоки 2";
   private static final String f_6250 = "На предмете нет зачарования \"Эффективность 7\", будьте аккуратны тк есть шанс кика.";
   private static final String f_6251 = "ВНИМАНИЕ !!! ";
   private static final String f_6252 = "Для использования модуля нужно зачарование на кирке/топоре/лопате эффективность 7. Иначе модуль будет работать хуже.";
   private static final long f_6253 = 3000L;
   private static final long f_6254 = 8000L;
   private static final long f_6255 = 200L;
   private static final double f_6256 = 1000.0;
   private static final long f_6257 = 4000L;
   private static final double f_6258 = Double.MAX_VALUE;
   private static final String f_6259 = "Блоки";
   private static final String f_6260 = "Блоки 2";
   private static final String f_6261 = "Блоки 2";
   private static final String f_6262 = "Блоки";
   private static final String f_6263 = "Блоки 2";
   private static final String f_6264 = "Блоки";
   private static final String f_6265 = "Блоки 2";
   private static final String f_6266 = "Блоки";
   private static final String f_6267 = "Блоки 2";
   private static final String f_6268 = "Блоки";
   private static final String f_6269 = "Блоки";
   private static final String f_6270 = "Блоки";
   private static final String f_6271 = "Блоки";
   private static final String f_6272 = "Двери";
   private static final String f_6273 = "Двери";
   private static final String f_6274 = "Блоки";
   private static final String f_6275 = "Блоки";
   private static final String f_6276 = "Блоки";
   private static final String f_6277 = "Двери";
   private static final String f_6278 = "Блоки";
   private static final String f_6279 = "Флай (RW)";

   private void m_2347() {
      if (this.f_6160 != -1) {
         if (f_11537.player != null && f_11537.gameMode != null) {
            f_11537.player.getInventory().setSelectedSlot(this.f_6160);
            f_11537.gameMode.ensureHasSentCarriedItem();
         }

         this.f_6160 = -1;
      }
   }

   private boolean m_2348(BlockState var1) {
      Block var2 = var1.getBlock();
      if (var2 instanceof DoorBlock) {
         return (Boolean)var1.getValue(DoorBlock.OPEN);
      } else if (var2 instanceof FenceGateBlock) {
         return (Boolean)var1.getValue(FenceGateBlock.OPEN);
      } else {
         return var2 instanceof TrapDoorBlock ? (Boolean)var1.getValue(TrapDoorBlock.OPEN) : false;
      }
   }

   private void m_2350(BlockPos var1) {
      ((MinecraftMixin)f_11537).setItemUseCooldown(0);
      BlockHitResult var2 = new BlockHitResult(Vec3.atCenterOf(var1), Direction.UP, var1, false);
      f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var2);
      f_11537.player.swing(InteractionHand.MAIN_HAND);
   }

   private boolean m_2351(ItemStack var1) {
      return var1.is(ItemTags.PICKAXES) || var1.is(ItemTags.AXES) || var1.is(ItemTags.SHOVELS);
   }

   private Component m_2352() {
      return Component.literal(f_6251)
         .withStyle(new ChatFormatting[]{ChatFormatting.RED, ChatFormatting.BOLD})
         .append(Component.literal(f_6252).withStyle(ChatFormatting.YELLOW));
   }

   private void m_2353() {
      f_11537.player.setShiftKeyDown(false);
      if (f_11537.player.input != null && f_11537.player.input.keyPresses != null) {
         Input var1 = f_11537.player.input.keyPresses;
         f_11537.player.input.keyPresses = new Input(var1.forward(), var1.backward(), var1.left(), var1.right(), var1.jump(), false, var1.sprint());
      }
   }

   private void m_2354() {
      this.m_2347();
      this.f_6162 = null;
      this.f_6164 = System.currentTimeMillis() + (long)(f_6256 / this.f_6149.m_8768().floatValue());
   }

   private void m_2355(BlockPos var1) {
      if (var1 != null && !f_11537.level.isEmptyBlock(var1) && this.m_2394(var1)) {
         this.m_2374(var1);
         Direction var2 = this.m_2392(var1);
         f_11537.gameMode.startDestroyBlock(var1, var2);
         this.m_2357();
         MultiPlayerGameModeMixin var3 = (MultiPlayerGameModeMixin)f_11537.gameMode;
         var3.setBlockBreakingCooldown(0);
         var3.setCurrentBreakingProgress(this.f_6129.m_8768());
         f_11537.gameMode.continueDestroyBlock(var1, var2);
      }
   }

   private void m_2356() {
      if (!this.f_6166) {
         if (!this.f_6165) {
            this.m_2360(this.f_6167);
            this.f_6168 = this.m_2411();
            this.f_6165 = true;
         }

         this.m_2371();
         if (this.f_6152.isEmpty() && this.f_6162 == null) {
            this.f_6165 = false;
            this.f_6166 = true;
            this.f_6154.m_4459();
         }
      } else {
         int var1 = this.m_2373(this.m_2411());
         if (var1 >= this.f_6167 || this.f_6154.m_4463(f_6257)) {
            this.f_6166 = false;
            if (this.f_6139.m_8768()) {
               this.f_6167 = this.f_6167 == 1 ? 2 : 1;
            }
         }
      }
   }

   private void m_2357() {
      if (f_11537.player != null) {
         f_11537.player.swing(InteractionHand.MAIN_HAND);
      }
   }

   private void m_2358() {
      long var1 = System.currentTimeMillis() - f_6247;
      this.f_6153.forEach((var3, var4) -> {
         if (var4 < var1 && this.f_6153.remove(var3, var4)) {
            f_6125.remove(var3);
         }
      });
   }

   private boolean m_2359() {
      BlockPos var1 = this.m_2411().below();
      return f_11537.level.getBlockState(var1).getBlock() instanceof TrapDoorBlock;
   }

   private void m_2360(int var1) {
      this.f_6152.clear();
      BlockPos var2 = this.m_2411();
      Direction var3 = f_11537.player.getDirection();

      for (int var4 = 1; var4 <= var1; var4++) {
         BlockPos var5 = var2.relative(var3, var4);

         for (int var6 = 0; var6 < 2; var6++) {
            BlockPos var7 = var5.above(var6);
            if (!f_11537.level.isEmptyBlock(var7)) {
               this.f_6152.add(var7);
            }
         }
      }

      if (this.f_6140.m_8768()) {
         for (int var8 = 0; var8 < 2; var8++) {
            BlockPos var9 = var2.above(var8);
            if (!f_11537.level.isEmptyBlock(var9)) {
               this.f_6152.add(var9);
            }
         }
      }
   }

   private void m_2361(Class_mRcJJZJYG5cvDAlU var1) {
      if (!this.m_776()) {
         this.f_6172 = false;
      } else if (this.f_6126.m_7568(f_6240)) {
         this.f_6172 = false;
         var1.m_7592(false);
      } else {
         boolean var2 = this.f_6126.m_7568(f_6241) || this.f_6126.m_7568(f_6242);
         boolean var3 = this.f_6126.m_7568(f_6243);
         if (!var2 && !var3) {
            this.f_6172 = false;
         } else {
            if (var3 && this.f_6136.m_8768()) {
               var1.m_7592(true);
            }

            if (var2 && this.f_6142.m_8768()) {
               var1.m_7592(false);
            }

            if (this.f_6172) {
               var1.m_7604(true);
               this.f_6172 = false;
            }
         }
      }
   }

   public NoClip() {
      super(f_6176, f_6177, Category.MOVEMENT);
      this.f_6126 = new MultiChoiceSetting(f_6178, new Class_2ZaVm8TGDJ68TnJB(f_6179), new Class_2ZaVm8TGDJ68TnJB(f_6180), new Class_2ZaVm8TGDJ68TnJB(f_6181));
      this.f_6127 = new SliderSetting(f_6182, f_6183, 0.0F, f_6184).m_828(f_6185).m_822(() -> this.f_6126.m_7568(f_6279));
      this.f_6128 = new SliderSetting(f_6186, 0.0F, 0.0F, f_6187).m_828(1.0F);
      this.f_6129 = new SliderSetting(f_6188, 1.0F, f_6189, 1.0F).m_828(f_6190).m_822(() -> this.f_6126.m_7568(f_6278));
      this.f_6130 = new SliderSetting(f_6191, f_6192, 0.0F, f_6193).m_828(f_6194).m_822(() -> this.f_6126.m_7568(f_6277));
      this.f_6131 = new CheckboxSetting(f_6195, false).m_822(() -> this.f_6126.m_7568(f_6276));
      this.f_6132 = new SliderSetting(f_6196, f_6197, f_6198, f_6199).m_828(f_6200).m_822(this.f_6131::m_8768);
      this.f_6133 = new CheckboxSetting(f_6201, false).m_822(() -> this.f_6126.m_7568(f_6275));
      this.f_6134 = new CheckboxSetting(f_6202, false).m_822(() -> this.f_6126.m_7568(f_6274));
      this.f_6135 = new CheckboxSetting(f_6203, false).m_822(() -> this.f_6126.m_7568(f_6273));
      this.f_6136 = new CheckboxSetting(f_6204, false).m_822(() -> this.f_6126.m_7568(f_6272));
      this.f_6137 = new CheckboxSetting(f_6205, false).m_822(() -> this.f_6126.m_7568(f_6271));
      this.f_6138 = new CheckboxSetting(f_6206, false).m_822(() -> this.f_6126.m_7568(f_6270));
      this.f_6139 = new CheckboxSetting(f_6207, false).m_822(() -> this.f_6126.m_7568(f_6269));
      this.f_6140 = new CheckboxSetting(f_6208, false).m_822(() -> this.f_6126.m_7568(f_6268));
      this.f_6141 = new CheckboxSetting(f_6209, false).m_822(() -> this.f_6126.m_7568(f_6266) || this.f_6126.m_7568(f_6267));
      this.f_6142 = new CheckboxSetting(f_6210, false).m_822(() -> this.f_6126.m_7568(f_6264) || this.f_6126.m_7568(f_6265));
      this.f_6143 = this::m_2398;
      this.f_6144 = new SliderSetting(f_6211, f_6212, 0.0F, f_6213).m_828(f_6214).m_822(() -> this.f_6126.m_7568(f_6262) || this.f_6126.m_7568(f_6263));
      this.f_6145 = new Class_QmNR03reugBgWiPr();
      this.f_6146 = new Class_QmNR03reugBgWiPr();
      this.f_6147 = new Class_QmNR03reugBgWiPr();
      this.f_6148 = new ArrayList<>();
      this.f_6149 = new SliderSetting(f_6215, f_6216, 1.0F, f_6217).m_828(1.0F).m_822(() -> this.f_6126.m_7568(f_6261));
      this.f_6150 = new CheckboxSetting(f_6218, true).m_822(() -> this.f_6126.m_7568(f_6259) || this.f_6126.m_7568(f_6260));
      this.f_6151 = this::m_2376;
      this.f_6152 = new ArrayList<>();
      this.f_6153 = new ConcurrentHashMap<>();
      this.f_6154 = new Class_QmNR03reugBgWiPr();
      this.f_6155 = new CopyOnWriteArrayList<>();
      this.f_6156 = new Class_QmNR03reugBgWiPr();
      this.f_6157 = new Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr>() {
         public static final String f_6118 = "Блоки";
         public static final String f_6119 = "Блоки 2";
         public static final int f_6120 = Integer.MIN_VALUE;

         @Override
         public int m_1780() {
            return f_6120;
         }

         public void m_1781(Class_jfpiTZhNIuwDwqKr var1) {
            if (NoClip.this.m_776() && (NoClip.this.f_6126.m_7568(f_6118) || NoClip.this.f_6126.m_7568(f_6119))) {
               var1.m_7400(0.0F);
            }
         }
      };
      this.f_6160 = -1;
      this.f_6167 = 1;
      this.f_6168 = BlockPos.ZERO;
      this.f_6170 = this::m_2372;
      this.f_6173 = this::m_2361;
      this.f_6175 = this::m_2386;
      this.m_795(
         this.f_6126,
         this.f_6127,
         this.f_6128,
         this.f_6129,
         this.f_6130,
         this.f_6136,
         this.f_6135,
         this.f_6137,
         this.f_6149,
         this.f_6150,
         this.f_6142,
         this.f_6144
      );
   }

   private int m_2362(BlockState var1) {
      int var2 = -1;
      float var3 = 1.0F;

      for (int var4 = 0; var4 < 9; var4++) {
         ItemStack var5 = f_11537.player.getInventory().getItem(var4);
         if (!var5.isEmpty() && this.m_2368(var5)) {
            float var6 = var5.getDestroySpeed(var1);
            int var7 = this.m_2377(var5);
            if (var6 > 1.0F && var7 > 0) {
               var6 += var7 * var7 + 1.0F;
            }

            if (var6 > var3) {
               var3 = var6;
               var2 = var4;
            }
         }
      }

      return var2;
   }

   private void m_2364() {
      if (this.f_6146.m_4463(this.f_6130.m_8768().longValue())) {
         BlockPos var1 = this.m_2393();
         if (var1 != null && !f_11537.level.isEmptyBlock(var1)) {
            BlockState var2 = f_11537.level.getBlockState(var1);
            if (this.m_2400(var2) && !this.m_2348(var2)) {
               this.m_2350(var1);
            }

            this.f_6146.m_4459();
         }
      }
   }

   @Override
   public void m_732() {
      super.m_732();
      if (f_11537.player != null) {
         f_11537.player.noPhysics = false;
      }

      Class_LJY6AyYHP77Twgvj.m_3626();
      this.m_2412();
      this.f_6152.clear();
      this.f_6162 = null;
      f_6125.clear();
      this.f_6153.clear();
      Class_rj7yTIJUyflxIxTs.f_30302.clear();
      this.f_6172 = false;
      this.f_6165 = false;
      this.f_6166 = false;
      this.f_6167 = 1;
      this.f_6168 = BlockPos.ZERO;
      this.m_2347();
      this.m_2406();
      if (f_11537.player != null && (this.f_6126.m_7568(f_6221) || this.f_6126.m_7568(f_6222) || this.f_6126.m_7568(f_6223))) {
         this.m_2353();
      }
   }

   private boolean m_2368(ItemStack var1) {
      return var1.is(ItemTags.PICKAXES) || var1.is(ItemTags.AXES) || var1.is(ItemTags.SHOVELS) || var1.is(ItemTags.HOES);
   }

   private Component m_2369() {
      return Component.literal(f_6250).withStyle(ChatFormatting.GOLD);
   }

   private void m_2371() {
      long var1 = System.currentTimeMillis();
      if (this.f_6162 != null) {
         if (f_11537.level.isEmptyBlock(this.f_6162)) {
            this.m_2354();
         } else if (var1 - this.f_6163 > f_6255) {
            f_11537.getConnection().send(new ServerboundPlayerActionPacket(Action.STOP_DESTROY_BLOCK, this.f_6162, this.m_2392(this.f_6162)));
            this.m_2354();
         }
      } else if (var1 >= this.f_6164) {
         while (!this.f_6152.isEmpty()) {
            BlockPos var3 = this.f_6152.removeFirst();
            if (!f_11537.level.isEmptyBlock(var3)) {
               int var4 = f_11537.player.getInventory().getSelectedSlot();
               int var5 = this.m_2362(f_11537.level.getBlockState(var3));
               if (var5 != -1 && var5 != var4) {
                  this.f_6160 = var4;
                  f_11537.player.getInventory().setSelectedSlot(var5);
                  f_11537.gameMode.ensureHasSentCarriedItem();
               } else {
                  this.f_6160 = -1;
               }

               this.m_2374(var3);
               f_11537.getConnection().send(new ServerboundPlayerActionPacket(Action.START_DESTROY_BLOCK, var3, this.m_2392(var3)));
               this.m_2357();
               this.f_6162 = var3;
               this.f_6163 = var1;
               return;
            }
         }
      }
   }

   private void m_2372(Class_lTzchJDbvRVrnXlw var1) {
      if (this.m_776() && this.f_6131.m_8768() && this.f_6126.m_7568(f_6244) && !this.f_6169) {
         Packet var2 = var1.m_7532();
         if (!(var2 instanceof ServerboundKeepAlivePacket) && !(var2 instanceof ServerboundPongPacket)) {
            var1.m_1582(true);
            this.f_6155.add(var2);
         }
      }
   }

   private int m_2373(BlockPos var1) {
      int var2 = var1.getX() - this.f_6168.getX();
      int var3 = var1.getZ() - this.f_6168.getZ();

      return switch (f_11537.player.getDirection()) {
         case EAST -> var2;
         case WEST -> -var2;
         case SOUTH -> var3;
         case NORTH -> -var3;
         default -> 0;
      };
   }

   private void m_2374(BlockPos var1) {
      if (var1 != null) {
         BlockPos var2 = var1.immutable();
         this.f_6153.put(var2, System.currentTimeMillis());
         if (this.f_6150.m_8768()) {
            f_6125.add(var2);
         }
      }
   }

   private boolean m_2375(BlockPos var1) {
      return this.f_6153.containsKey(var1) || f_6125.contains(var1) || Class_rj7yTIJUyflxIxTs.f_30302.contains(var1);
   }

   private void m_2376(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.m_776() && (this.f_6126.m_7568(f_6245) || this.f_6126.m_7568(f_6246))) {
         Packet var2 = var1.m_5619();
         if (var2 instanceof ClientboundBlockDestructionPacket var3) {
            if (this.f_6150.m_8768() && f_6125.contains(var3.getPos())) {
               var1.m_1582(true);
            }
         } else if (var2 instanceof ClientboundLevelEventPacket var4) {
            if (this.f_6150.m_8768() && var4.getType() == 2001 && f_6125.contains(var4.getPos())) {
               var1.m_1582(true);
            }
         } else if (var2 instanceof ClientboundSoundPacket var5) {
            BlockPos var8 = BlockPos.containing(var5.getX(), var5.getY(), var5.getZ());
            if (this.f_6150.m_8768() && f_6125.contains(var8)) {
               var1.m_1582(true);
            }
         } else if (var2 instanceof ClientboundBlockUpdatePacket var6) {
            BlockPos var9 = var6.getPos().immutable();
            if (this.m_2375(var9)) {
               if (var6.getBlockState().isAir()) {
                  this.m_2389(var9);
                  if (this.f_6150.m_8768()) {
                     var1.m_1582(true);
                  }
               } else {
                  this.m_2388(var9);
                  if (this.f_6141.m_8768()) {
                     var1.m_1582(true);
                     this.m_2401(var9);
                  }
               }
            }
         } else if (var2 instanceof ClientboundSectionBlocksUpdatePacket var7) {
            boolean[] var10 = new boolean[]{false};
            var7.runUpdates((var2x, var3x) -> {
               BlockPos var4x = var2x.immutable();
               if (this.m_2375(var4x)) {
                  if (var3x.isAir()) {
                     this.m_2389(var4x);
                     if (this.f_6150.m_8768()) {
                        var10[0] = true;
                     }
                  } else {
                     this.m_2388(var4x);
                     if (this.f_6141.m_8768()) {
                        var10[0] = true;
                        this.m_2401(var4x);
                     }
                  }
               }
            });
            if (var10[0]) {
               var1.m_1582(true);
            }
         }
      }
   }

   private int m_2377(ItemStack var1) {
      return EnchantmentHelper.getItemEnchantmentLevel(
         (Holder)f_11537.level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).get(Enchantments.EFFICIENCY).orElseThrow(), var1
      );
   }

   private void m_2379() {
      if (this.f_6148.isEmpty()) {
         this.m_2412();
      } else {
         this.f_6158 = this.f_6148.removeFirst();
         if (!this.m_2394(this.f_6158)) {
            this.f_6158 = null;
            if (this.f_6148.isEmpty()) {
               this.m_2412();
            } else {
               this.m_2379();
            }
         } else {
            this.m_2374(this.f_6158);
            f_11537.gameMode.startDestroyBlock(this.f_6158, this.m_2392(this.f_6158));
            this.m_2357();
         }
      }
   }

   private void m_2386(Class_Xu9btcIeUN33XnMK var1) {
      if (this.m_776() && f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         this.f_6172 = false;
         if (this.f_6126.m_7568(f_6228)) {
            boolean var13 = f_11537.options.keyUp.isDown();
            boolean var14 = f_11537.options.keyJump.isDown();
            boolean var15 = f_11537.options.keyShift.isDown();
            if (!f_11537.player.onGround()) {
               double var16 = (var14 ? 1.0 : 0.0) - (var15 ? 1.0 : 0.0);
               if (var13 || var16 != 0.0) {
                  if (this.f_6145.m_4463(this.f_6127.m_8768().longValue())) {
                     double var17 = Math.toRadians(f_11537.player.getYRot());
                     double var9 = var13 ? -Math.sin(var17) : 0.0;
                     double var11 = var13 ? Math.cos(var17) : 0.0;
                     if (f_11537.options.getCameraType().isFirstPerson()) {
                        Class_LJY6AyYHP77Twgvj.m_3624(f_11537.player);
                     } else {
                        Class_LJY6AyYHP77Twgvj.m_3626();
                     }

                     f_11537.player.setPos(f_11537.player.getX() + var9, f_11537.player.getY() + var16, f_11537.player.getZ() + var11);
                     this.f_6145.m_4459();
                  }
               }
            }
         } else {
            boolean var2 = this.f_6126.m_7568(f_6229) || this.f_6126.m_7568(f_6230);
            boolean var3 = this.f_6126.m_7568(f_6231);
            if (var2 || var3) {
               if (var2 && this.f_6142.m_8768()) {
                  this.m_2395();
               }

               boolean var4 = var2 && this.f_6150.m_8768();
               f_11537.player.noPhysics = false;
               if (!var4) {
                  f_6125.clear();
                  Class_rj7yTIJUyflxIxTs.f_30302.clear();
               }

               this.m_2358();
               if (this.f_6126.m_7568(f_6232) && this.f_6137.m_8768() && this.m_2391()) {
                  this.m_2399();
               }

               if (var3) {
                  ((MinecraftMixin)f_11537).setItemUseCooldown(0);
               }

               if (var2) {
                  ((MultiPlayerGameModeMixin)f_11537.gameMode).setBlockBreakingCooldown(0);
               }

               if (var3 && this.f_6135.m_8768() && this.m_2359()) {
                  this.m_2387();
               } else {
                  f_11537.player.noJumpDelay = 0;
                  boolean var5 = f_11537.player.horizontalCollision;
                  boolean var6 = false;
                  long var7 = this.f_6128.m_8768().longValue() * f_6233;
                  if (f_11537.player.onGround() && this.f_6145.m_4463(var7)) {
                     this.f_6172 = true;
                     this.f_6145.m_4459();
                     var6 = true;
                  }

                  if (var6) {
                     if (var3 && var5) {
                        this.m_2364();
                     }

                     if (this.f_6126.m_7568(f_6234) && !this.f_6138.m_8768()) {
                        this.m_2396();
                     }

                     if (this.f_6126.m_7568(f_6235) && !this.f_6138.m_8768()) {
                        this.m_2409();
                     }
                  }
               }

               if (this.f_6126.m_7568(f_6236)) {
                  if (this.f_6138.m_8768()) {
                     this.m_2356();
                  } else if (this.f_6161) {
                     this.m_2404();
                  }
               }

               if (this.f_6126.m_7568(f_6237)) {
                  if (this.f_6138.m_8768()) {
                     this.m_2356();
                  } else {
                     this.m_2409();
                     this.m_2371();
                  }
               }

               if (var2 && !this.f_6138.m_8768() && this.f_6144.m_8768() > 0.0F && !this.f_6161 && this.f_6147.m_4463(this.f_6144.m_8768().longValue())) {
                  if (this.f_6126.m_7568(f_6238)) {
                     this.m_2396();
                  } else {
                     this.m_2409();
                  }

                  this.f_6147.m_4459();
               }

               if (this.f_6131.m_8768() && this.f_6126.m_7568(f_6239)) {
                  if (!this.f_6155.isEmpty() && this.f_6156.m_4462() > this.f_6132.m_8768().longValue()) {
                     this.m_2406();
                  }
               } else if (!this.f_6155.isEmpty()) {
                  this.m_2406();
               }
            }
         }
      }
   }

   private void m_2387() {
      if (this.f_6146.m_4463(this.f_6130.m_8768().longValue())) {
         BlockPos var1 = this.m_2411().below();
         if (!f_11537.level.isEmptyBlock(var1) && f_11537.level.getBlockState(var1).getBlock() instanceof TrapDoorBlock) {
            this.m_2350(var1);
            this.f_6146.m_4459();
         }
      }
   }

   private void m_2388(BlockPos var1) {
      this.f_6153.remove(var1);
      Class_rj7yTIJUyflxIxTs.f_30302.remove(var1);
      if (!this.f_6141.m_8768()) {
         f_6125.remove(var1);
      }
   }

   private void m_2389(BlockPos var1) {
      this.f_6153.remove(var1);
      if (this.f_6150.m_8768()) {
         f_6125.add(var1);
         Class_rj7yTIJUyflxIxTs.f_30302.add(var1);
      } else {
         f_6125.remove(var1);
         Class_rj7yTIJUyflxIxTs.f_30302.remove(var1);
      }
   }

   private boolean m_2391() {
      return f_11537.player != null && f_11537.player.getPose() == Pose.SWIMMING;
   }

   private Direction m_2392(BlockPos var1) {
      BlockState var2 = f_11537.level.getBlockState(var1);
      VoxelShape var3 = var2.getCollisionShape(f_11537.level, var1);
      AABB var4 = var3.isEmpty() ? new AABB(var1) : var3.bounds().move(var1);
      Vec3 var5 = f_11537.player.getEyePosition();
      Direction var6 = null;
      double var7 = f_6258;
      if (var5.x <= var4.minX) {
         var7 = var4.minX - var5.x;
         var6 = Direction.WEST;
      }

      if (var5.x >= var4.maxX && var5.x - var4.maxX < var7) {
         var7 = var5.x - var4.maxX;
         var6 = Direction.EAST;
      }

      if (var5.z <= var4.minZ && var4.minZ - var5.z < var7) {
         var7 = var4.minZ - var5.z;
         var6 = Direction.NORTH;
      }

      if (var5.z >= var4.maxZ && var5.z - var4.maxZ < var7) {
         var6 = Direction.SOUTH;
      }

      if (var6 != null) {
         return var6;
      } else if (var5.y >= var4.maxY) {
         return Direction.UP;
      } else {
         return var5.y <= var4.minY ? Direction.DOWN : f_11537.player.getDirection().getOpposite();
      }
   }

   private BlockPos m_2393() {
      return f_11537.hitResult instanceof BlockHitResult var2 ? var2.getBlockPos() : null;
   }

   private boolean m_2394(BlockPos var1) {
      if (var1 != null && !f_11537.level.isEmptyBlock(var1)) {
         int var2 = this.m_2362(f_11537.level.getBlockState(var1));
         if (var2 == -1) {
            return false;
         }

         ItemStack var3 = f_11537.player.getInventory().getItem(var2);
         if (!this.m_2351(var3)) {
            return false;
         }

         f_11537.player.getInventory().setSelectedSlot(var2);
         f_11537.gameMode.ensureHasSentCarriedItem();
         return true;
      } else {
         return false;
      }
   }

   private void m_2395() {
      if (this.m_776() && (this.f_6126.m_7568(f_6248) || this.f_6126.m_7568(f_6249)) && f_11537.player != null && f_11537.level != null) {
         this.m_2353();
         AABB var1 = f_11537.player.getDimensions(Pose.STANDING).makeBoundingBox(f_11537.player.position());
         if (f_11537.player.getPose() != Pose.STANDING && f_11537.level.noCollision(f_11537.player, var1)) {
            f_11537.player.setPose(Pose.STANDING);
         }
      }
   }

   private void m_2396() {
      if (!this.f_6161) {
         Direction var1 = f_11537.player.getDirection();
         BlockPos var2 = this.m_2411();
         this.f_6148.clear();
         if (this.f_6134.m_8768() && this.m_2391()) {
            BlockPos var9 = var2.relative(var1);
            if (!f_11537.level.isEmptyBlock(var9)) {
               this.f_6148.add(var9);
            }
         } else {
            int var3 = this.f_6139.m_8768() ? 2 : 1;

            for (int var4 = 1; var4 <= var3; var4++) {
               BlockPos var5 = var2.relative(var1, var4);

               for (int var6 = 0; var6 < 2; var6++) {
                  BlockPos var7 = var5.above(var6);
                  if (!f_11537.level.isEmptyBlock(var7)) {
                     this.f_6148.add(var7);
                  }
               }
            }
         }

         if (this.f_6140.m_8768()) {
            for (int var10 = 0; var10 < 2; var10++) {
               BlockPos var12 = var2.above(var10);
               if (!f_11537.level.isEmptyBlock(var12)) {
                  this.f_6148.add(var12);
               }
            }
         }

         if (!this.f_6148.isEmpty()) {
            boolean var11 = true;

            for (BlockPos var14 : this.f_6148) {
               BlockState var15 = f_11537.level.getBlockState(var14);
               int var16 = this.m_2362(var15);
               if (var16 == -1) {
                  var11 = false;
               } else {
                  ItemStack var8 = f_11537.player.getInventory().getItem(var16);
                  if (!this.m_2351(var8) || this.m_2377(var8) < 7) {
                     var11 = false;
                  }
               }
            }

            this.f_6171 = var11;
            if (!this.f_6171 && System.currentTimeMillis() - this.f_6174 > f_6253) {
               Class_ftHu9o3WzCU3Adxm.m_6731(this.m_2369());
               this.f_6174 = System.currentTimeMillis();
            }

            if (this.f_6133.m_8768()) {
               this.f_6148
                  .sort(
                     Comparator.<BlockPos>comparingInt(var1x -> Math.abs(var1x.getX() - var2.getX()) + Math.abs(var1x.getZ() - var2.getZ()))
                        .thenComparingInt(Vec3i::getY)
                  );
            }

            this.f_6160 = f_11537.player.getInventory().getSelectedSlot();
            this.f_6161 = true;
            this.f_6159 = System.currentTimeMillis();
            f_11537.gameMode.ensureHasSentCarriedItem();
            this.m_2379();
         }
      }
   }

   private void m_2398(Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1 var1) {
      if (this.m_776() && f_11537.player != null && f_11537.level != null) {
         if ((this.f_6126.m_7568(f_6226) || this.f_6126.m_7568(f_6227)) && this.f_6142.m_8768()) {
            this.m_2395();
         }
      }
   }

   private void m_2399() {
      int var1 = f_11537.player.getInventory().getSelectedSlot();
      BlockPos var2 = this.m_2411();
      this.m_2355(var2);
      this.m_2355(var2.above());
      f_11537.player.getInventory().setSelectedSlot(var1);
      f_11537.gameMode.ensureHasSentCarriedItem();
   }

   private boolean m_2400(BlockState var1) {
      Block var2 = var1.getBlock();
      return var2 instanceof DoorBlock || var2 instanceof FenceGateBlock || var2 instanceof TrapDoorBlock;
   }

   private void m_2401(BlockPos var1) {
      if (f_11537.player != null && f_11537.getConnection() != null && f_11537.level != null && !f_11537.level.isEmptyBlock(var1)) {
         this.m_2374(var1);
         Direction var2 = this.m_2392(var1);
         f_11537.getConnection().send(new ServerboundPlayerActionPacket(Action.START_DESTROY_BLOCK, var1, var2));
         f_11537.getConnection().send(new ServerboundPlayerActionPacket(Action.STOP_DESTROY_BLOCK, var1, var2));
         this.m_2357();
      }
   }

   public static boolean m_2403(BlockPos var0) {
      return var0 != null && f_6125.contains(var0);
   }

   private void m_2404() {
      if (System.currentTimeMillis() - this.f_6159 > f_6254) {
         this.m_2412();
      } else if (!this.f_6171) {
         if (this.f_6158 != null && !f_11537.level.isEmptyBlock(this.f_6158)) {
            ((MultiPlayerGameModeMixin)f_11537.gameMode).setBlockBreakingCooldown(0);
            boolean var3 = f_11537.gameMode.continueDestroyBlock(this.f_6158, this.m_2392(this.f_6158));
            this.m_2357();
            if (var3) {
               f_11537.gameMode.stopDestroyBlock();
               this.f_6158 = null;
               if (this.f_6148.isEmpty()) {
                  this.m_2412();
               } else {
                  this.m_2379();
               }
            }
         } else {
            this.f_6158 = null;
            if (this.f_6148.isEmpty()) {
               this.m_2412();
            } else {
               this.m_2379();
            }
         }
      } else {
         if (this.f_6158 != null) {
            this.m_2355(this.f_6158);
         }

         for (BlockPos var2 : this.f_6148) {
            this.m_2355(var2);
         }

         this.m_2412();
      }
   }

   public static boolean m_2405(int var0) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         NoClip var1 = DimasikClient.m_9057().m_9049().m_2801().m_3491();
         return var1 != null
            && var1.m_776()
            && (var1.f_6126.m_7568(f_6219) || var1.f_6126.m_7568(f_6220))
            && Minecraft.getInstance().player != null
            && Minecraft.getInstance().player.getId() == var0;
      } else {
         return false;
      }
   }

   private void m_2406() {
      if (!this.f_6155.isEmpty()) {
         this.f_6169 = true;

         for (Packet var2 : this.f_6155) {
            Class_3LQSDrJ0WJYOQ7ck.m_1295(var2);
         }

         this.f_6169 = false;
         this.f_6155.clear();
         this.f_6156.m_4459();
      }
   }

   private void m_2409() {
      if (this.f_6152.isEmpty()) {
         BlockPos var1 = this.m_2411();
         Direction var2 = f_11537.player.getDirection();

         for (int var3 = 1; var3 <= 2; var3++) {
            BlockPos var4 = var1.relative(var2, var3);

            for (int var5 = 0; var5 < 3; var5++) {
               BlockPos var6 = var4.above(var5);
               if (!f_11537.level.isEmptyBlock(var6)) {
                  this.f_6152.add(var6);
               }
            }
         }
      }
   }

   @Override
   public void m_778() {
      super.m_778();
      this.f_6145.m_4459();
      this.f_6172 = false;
      Class_LJY6AyYHP77Twgvj.m_3626();
      if (this.f_6126.m_7568(f_6224) || this.f_6126.m_7568(f_6225)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(this.m_2352());
      }
   }

   private BlockPos m_2411() {
      return BlockPos.containing(f_11537.player.position());
   }

   private void m_2412() {
      this.f_6161 = false;
      this.f_6158 = null;
      this.f_6148.clear();
      this.m_2347();
   }
}
