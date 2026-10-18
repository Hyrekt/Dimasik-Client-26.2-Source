package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_gXPXh2FDkuYBeJW2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ClientboundSystemChatPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.util.Mth;
import net.minecraft.util.StringUtil;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.minecart.MinecartChest;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.SpawnerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public class KeyFinder extends Module {
   private final SliderSetting f_21620;
   private final CheckboxSetting f_21621;
   private final CheckboxSetting f_21622;
   private final CheckboxSetting f_21623;
   private final ItemListSetting f_21624;
   private final ItemListSetting f_21625;
   private final CheckboxSetting f_21626;
   private final CheckboxSetting f_21627;
   private final SliderSetting f_21628;
   private final SliderSetting f_21629;
   private final SliderSetting f_21630;
   private final CheckboxSetting f_21631;
   private final CheckboxSetting f_21632;
   private final CheckboxSetting f_21633;
   private final SliderSetting f_21634;
   private KeyFinder.xTHj7qCVoAzpXiba f_21635;
   private BlockPos f_21636;
   private MinecartChest f_21637;
   private BlockPos f_21638;
   private BlockPos f_21639;
   private BlockPos f_21640;
   private final Class_QmNR03reugBgWiPr f_21641;
   private final Class_QmNR03reugBgWiPr f_21642;
   private final Class_QmNR03reugBgWiPr f_21643;
   private final Class_QmNR03reugBgWiPr f_21644;
   private final Class_QmNR03reugBgWiPr f_21645;
   private final Class_QmNR03reugBgWiPr f_21646;
   private final Class_QmNR03reugBgWiPr f_21647;
   private final Set<Long> f_21648;
   private final Set<BlockPos> f_21649;
   private final Set<Long> f_21650;
   private final Set<Long> f_21651;
   private final Set<Long> f_21652;
   private boolean f_21653;
   private boolean f_21654;
   private boolean f_21655;
   private boolean f_21656;
   private boolean f_21657;
   private boolean f_21658;
   private volatile BlockPos f_21659;
   private long f_21660;
   private int f_21661;
   private long f_21662;
   private String f_21663;
   private int f_21664;
   private int f_21665;
   private int f_21666;
   private int f_21667;
   private int f_21668;
   private boolean f_21669;
   private boolean f_21670;
   private boolean f_21671;
   private long f_21672;
   private int f_21673;
   private long f_21674;
   private BlockPos f_21675;
   private long f_21676;
   private long f_21677;
   private int f_21678;
   private static final double f_21679 = 65.0;
   private static final double f_21680 = 0.001;
   private static final long f_21681 = 200000000L;
   private static final long f_21682 = 150000000L;
   private static final long f_21683 = 200000000L;
   private static final int f_21684 = 100;
   private static final int f_21685 = 3;
   private static final double f_21686 = 2.5;
   private static final double f_21687 = 0.62;
   private static final int f_21688 = 3;
   private static final int f_21689 = 1;
   private static final double f_21690 = 0.29;
   private static final double f_21691 = 1.0;
   private static final double f_21692 = 1.8;
   private static final double f_21693 = 0.25;
   private static final int f_21694 = 10;
   private static final long f_21695 = 5000L;
   private static final long f_21696 = 30000L;
   private static final String f_21697 = "извините, но вы не можете";
   private static final String f_21698 = "не можете сломать блок";
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_21699;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_21700;
   private static final Set<Item> f_21701 = Set.of(
      Items.COBBLESTONE,
      Items.COBBLED_DEEPSLATE,
      Items.MOSSY_COBBLESTONE,
      Items.STONE,
      Items.GRANITE,
      Items.POLISHED_GRANITE,
      Items.DIORITE,
      Items.POLISHED_DIORITE,
      Items.ANDESITE,
      Items.POLISHED_ANDESITE,
      Items.DEEPSLATE,
      Items.TUFF,
      Items.CALCITE,
      Items.DIRT,
      Items.COARSE_DIRT,
      Items.ROOTED_DIRT,
      Items.GRAVEL,
      Items.SAND,
      Items.RED_SAND,
      Items.NETHERRACK,
      Items.BASALT,
      Items.BLACKSTONE,
      Items.END_STONE
   );
   private static final String f_21702 = "KeyFinder";
   private static final String f_21703 = "Автоматически ищет ключ-карты на ReallyWorld";
   private static final String f_21704 = "Радиус поиска";
   private static final float f_21705 = 64.0F;
   private static final float f_21706 = 4.0F;
   private static final float f_21707 = 64.0F;
   private static final String f_21708 = "Поиск сундуков";
   private static final String f_21709 = "Поиск вагонеток";
   private static final String f_21710 = "Только рядом с спавнером";
   private static final String f_21711 = "Что ломать за собой";
   private static final String f_21712 = "Сундуки";
   private static final String f_21713 = "Вагонетки";
   private static final String f_21714 = "Что лутать";
   private static final String f_21715 = "Зачарованные яблоки";
   private static final String f_21716 = "Золотые яблоки";
   private static final String f_21717 = "Ключ Карты";
   private static final String f_21718 = "Зачар книги";
   private static final String f_21719 = "/ec";
   private static final String f_21720 = "Выкидывать мусор";
   private static final String f_21721 = "Задержка взятия";
   private static final float f_21722 = 120.0F;
   private static final float f_21723 = 1000.0F;
   private static final float f_21724 = 10.0F;
   private static final String f_21725 = "Задержка открытия";
   private static final float f_21726 = 600.0F;
   private static final float f_21727 = 3000.0F;
   private static final float f_21728 = 50.0F;
   private static final String f_21729 = "Радиус ходьба";
   private static final float f_21730 = 256.0F;
   private static final float f_21731 = 16.0F;
   private static final float f_21732 = 256.0F;
   private static final String f_21733 = "Teleport";
   private static final String f_21734 = "Статус в чате";
   private static final String f_21735 = "Авто /heal";
   private static final String f_21736 = "Когда /heal(еда)";
   private static final float f_21737 = 7.0F;
   private static final float f_21738 = 20.0F;
   private static final long f_21739 = Long.MIN_VALUE;
   private static final long f_21740 = Long.MIN_VALUE;
   private static final long f_21741 = Long.MIN_VALUE;
   private static final String f_21742 = "Baritone mod not found";
   private static final String f_21743 = "извините, но вы не можете";
   private static final String f_21744 = "не можете сломать блок";
   private static final String f_21745 = "access denied, blacklisted 10 blocks around target";
   private static final String f_21746 = "break denied, rerouting";
   private static final long f_21747 = Long.MIN_VALUE;
   private static final String f_21748 = "#cancel";
   private static final long f_21749 = 400L;
   private static final String f_21750 = "found chest minecart";
   private static final String f_21751 = "found chest";
   private static final String f_21752 = "target lost";
   private static final String f_21753 = "opening target";
   private static final long f_21754 = 3000L;
   private static final long f_21755 = Long.MIN_VALUE;
   private static final long f_21756 = 500L;
   private static final long f_21757 = 1200L;
   private static final long f_21758 = Long.MIN_VALUE;
   private static final String f_21759 = "dumping junk for loot";
   private static final String f_21760 = "taking key card";
   private static final String f_21761 = "taking extra loot";
   private static final String f_21762 = "ec f";
   private static final String f_21763 = "opening /ec";
   private static final long f_21764 = 5000L;
   private static final long f_21765 = 5000L;
   private static final long f_21766 = 30000L;
   private static final String f_21767 = "depositing farmed loot to /ec";
   private static final String f_21768 = "stored farmed loot in /ec";
   private static final String f_21769 = "could not store farmed loot in /ec";
   private static final String f_21770 = "Сундуки";
   private static final String f_21771 = "breaking chest";
   private static final String f_21772 = "Вагонетки";
   private static final long f_21773 = 6000L;
   private static final String f_21774 = "breaking chest minecart";
   private static final String f_21775 = "resyncing tool slot";
   private static final long f_21776 = 50L;
   private static final long f_21777 = 250L;
   private static final String f_21778 = "found chest minecart while exploring";
   private static final String f_21779 = "found chest while exploring";
   private static final long f_21780 = 10000L;
   private static final double f_21781 = Double.MAX_VALUE;
   private static final float f_21782 = 16.0F;
   private static final double f_21783 = 81.0;
   private static final double f_21784 = 6.25;
   private static final double f_21785 = 0.1;
   private static final long f_21786 = 150000000L;
   private static final String f_21787 = "Ключ-Карта";
   private static final String f_21788 = "Ключ Карты";
   private static final String f_21789 = "Зачарованные яблоки";
   private static final String f_21790 = "Золотые яблоки";
   private static final String f_21791 = "Зачар книги";
   private static final double f_21792 = Double.MAX_VALUE;
   private static final double f_21793 = Double.MAX_VALUE;
   private static final double f_21794 = 0.5;
   private static final double f_21795 = 0.5;
   private static final double f_21796 = 1000.0;
   private static final double f_21797 = 6.25;
   private static final double f_21798 = 0.5;
   private static final double f_21799 = 0.62;
   private static final double f_21800 = 0.5;
   private static final double f_21801 = 0.5;
   private static final double f_21802 = 0.5;
   private static final double f_21803 = Double.MAX_VALUE;
   private static final double f_21804 = 1000.0;
   private static final double f_21805 = 0.5;
   private static final double f_21806 = 0.5;
   private static final double f_21807 = 65.0;
   private static final double f_21808 = 0.5;
   private static final double f_21809 = 0.5;
   private static final double f_21810 = 0.001;
   private static final double f_21811 = 0.001;
   private static final double f_21812 = 65.0;
   private static final double f_21813 = 0.001;
   private static final double f_21814 = Double.MAX_VALUE;
   private static final double f_21815 = 0.5;
   private static final double f_21816 = 0.5;
   private static final double f_21817 = 65.001;
   private static final double f_21818 = 0.25;
   private static final double f_21819 = 0.29;
   private static final double f_21820 = 0.29;
   private static final double f_21821 = 0.29;
   private static final double f_21822 = 1.8;
   private static final double f_21823 = 0.29;
   private static final double f_21824 = 0.29;
   private static final double f_21825 = 0.29;
   private static final double f_21826 = 0.29;
   private static final double f_21827 = 1.8;
   private static final double f_21828 = 0.29;
   private static final long f_21829 = 200000000L;
   private static final double f_21830 = 0.5;
   private static final double f_21831 = 0.5;
   private static final long f_21832 = 200000000L;
   private static final long f_21833 = Long.MIN_VALUE;
   private static final long f_21834 = Long.MIN_VALUE;
   private static final long f_21835 = Long.MIN_VALUE;
   private static final String f_21836 = "teleport point failed 3 times, choosing another";
   private static final double f_21837 = 0.5;
   private static final double f_21838 = 0.5;
   private static final double f_21839 = 0.64;
   private static final double f_21840 = 1.25;
   private static final long f_21841 = Long.MIN_VALUE;
   private static final long f_21842 = Long.MIN_VALUE;
   private static final long f_21843 = Long.MIN_VALUE;
   private static final String f_21844 = "teleport area unavailable, choosing another";
   private static final long f_21845 = Long.MIN_VALUE;
   private static final String f_21846 = "teleport target unavailable, skipping";
   private static final long f_21847 = Long.MIN_VALUE;
   private static final String f_21848 = "#cancel";
   private static final long f_21849 = 500L;
   private static final long f_21850 = 5000L;
   private static final String f_21851 = "heal";
   private static final String f_21852 = "low hunger, sent /heal";
   private static final float f_21853 = 90.0F;
   private static final float f_21854 = -90.0F;
   private static final float f_21855 = 90.0F;
   private static final long f_21856 = 4294967295L;
   private static final long f_21857 = 4294967295L;
   private static final double f_21858 = 0.5;
   private static final double f_21859 = 0.5;
   private static final long f_21860 = Long.MIN_VALUE;

   private boolean m_6941(BlockPos var1) {
      BlockState var2 = f_11537.level.getBlockState(var1);
      BlockState var3 = f_11537.level.getBlockState(var1.above());
      BlockState var4 = f_11537.level.getBlockState(var1.below());
      return var2.getCollisionShape(f_11537.level, var1).isEmpty()
         && var3.getCollisionShape(f_11537.level, var1.above()).isEmpty()
         && var2.getFluidState().isEmpty()
         && var3.getFluidState().isEmpty()
         && !var4.getCollisionShape(f_11537.level, var1.below()).isEmpty();
   }

   private Integer m_6942(int var1, int var2) {
      int var3 = Math.min(f_11537.level.getHeight(Types.WORLD_SURFACE, var1, var2) - 1, f_11537.level.getMaxY());

      for (int var4 = var3; var4 >= f_11537.level.getMinY(); var4--) {
         BlockPos var5 = new BlockPos(var1, var4, var2);
         BlockState var6 = f_11537.level.getBlockState(var5);
         if (!var6.getCollisionShape(f_11537.level, var5).isEmpty()) {
            return var4;
         }
      }

      return null;
   }

   private void m_6943() {
      this.f_21650.add(this.m_7021(Mth.floor(f_11537.player.getX()), Mth.floor(f_11537.player.getZ())));
   }

   private long m_6944() {
      return Math.max(0L, this.f_21629.m_8768().longValue());
   }

   private boolean m_6945() {
      return !this.f_21671 || System.nanoTime() - this.f_21672 >= f_21829;
   }

   private BlockPos m_6946(int var1, int var2, int var3, int var4, int var5) {
      int var6 = Math.max(8, var4);

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = ThreadLocalRandom.current().nextInt(-var6, var6 + 1);
         int var9 = ThreadLocalRandom.current().nextInt(-var6, var6 + 1);
         if (Math.abs(var8) >= 8 || Math.abs(var9) >= 8) {
            BlockPos var10 = new BlockPos(var1 + var8, var2, var3 + var9);
            if (!this.m_7006(var10)) {
               return var10;
            }
         }
      }

      return null;
   }

   private BlockHitResult m_6947(Vec3 var1, Vec3 var2) {
      return f_11537.level.clip(new ClipContext(var1, var2, Block.COLLIDER, Fluid.NONE, f_11537.player));
   }

   private boolean m_6948(BlockPos var1) {
      for (BlockPos var3 : this.f_21649) {
         if (Math.abs(var1.getX() - var3.getX()) <= 10 && Math.abs(var1.getZ() - var3.getZ()) <= 10) {
            return true;
         }
      }

      return false;
   }

   private void m_6949(boolean var1) {
      this.m_6960(var1 ? f_21768 : f_21769);
      this.f_21647.m_4459();
      this.m_6993();
      this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
   }

   private boolean m_6950() {
      if (this.f_21663 == null) {
         return false;
      }

      this.m_6988();
      f_11537.options.keyLeft.setDown(false);
      f_11537.options.keyRight.setDown(false);
      f_11537.options.keyDown.setDown(false);
      if (f_11537.gameMode != null) {
         f_11537.gameMode.stopDestroyBlock();
      }

      if (this.f_21664 > 0) {
         this.f_21664--;
         return true;
      }

      if (f_11537.getConnection() != null) {
         f_11537.getConnection().sendChat(this.f_21663);
      }

      this.f_21663 = null;
      this.f_21645.m_4459();
      return true;
   }

   public KeyFinder() {
      super(f_21702, f_21703, Category.MISC);
      this.f_21620 = new SliderSetting(f_21704, f_21705, f_21706, f_21707).m_828(1.0F);
      this.f_21621 = new CheckboxSetting(f_21708, true);
      this.f_21622 = new CheckboxSetting(f_21709, true);
      this.f_21623 = new CheckboxSetting(f_21710, true);
      this.f_21624 = new ItemListSetting(f_21711, new Class_2ZaVm8TGDJ68TnJB(f_21712, false), new Class_2ZaVm8TGDJ68TnJB(f_21713, false));
      this.f_21625 = new ItemListSetting(
         f_21714,
         new Class_2ZaVm8TGDJ68TnJB(f_21715, true),
         new Class_2ZaVm8TGDJ68TnJB(f_21716, true),
         new Class_2ZaVm8TGDJ68TnJB(f_21717, true),
         new Class_2ZaVm8TGDJ68TnJB(f_21718, true)
      );
      this.f_21626 = new CheckboxSetting(f_21719, false);
      this.f_21627 = new CheckboxSetting(f_21720, true);
      this.f_21628 = new SliderSetting(f_21721, f_21722, 0.0F, f_21723).m_828(f_21724);
      this.f_21629 = new SliderSetting(f_21725, f_21726, 0.0F, f_21727).m_828(f_21728);
      this.f_21630 = new SliderSetting(f_21729, f_21730, f_21731, f_21732).m_828(1.0F);
      this.f_21631 = new CheckboxSetting(f_21733, false);
      this.f_21632 = new CheckboxSetting(f_21734, false);
      this.f_21633 = new CheckboxSetting(f_21735, false);
      this.f_21634 = new SliderSetting(f_21736, f_21737, 0.0F, f_21738).m_828(1.0F).m_822(this.f_21633::m_8768);
      this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
      this.f_21641 = new Class_QmNR03reugBgWiPr();
      this.f_21642 = new Class_QmNR03reugBgWiPr();
      this.f_21643 = new Class_QmNR03reugBgWiPr();
      this.f_21644 = new Class_QmNR03reugBgWiPr();
      this.f_21645 = new Class_QmNR03reugBgWiPr();
      this.f_21646 = new Class_QmNR03reugBgWiPr();
      this.f_21647 = new Class_QmNR03reugBgWiPr();
      this.f_21648 = new HashSet<>();
      this.f_21649 = new HashSet<>();
      this.f_21650 = new HashSet<>();
      this.f_21651 = new HashSet<>();
      this.f_21652 = new HashSet<>();
      this.f_21662 = f_21739;
      this.f_21667 = -1;
      this.f_21674 = f_21740;
      this.f_21677 = f_21741;
      this.f_21699 = this::m_6970;
      this.f_21700 = this::m_6959;
      this.m_795(
         this.f_21620,
         this.f_21621,
         this.f_21622,
         this.f_21623,
         this.f_21624,
         this.f_21625,
         this.f_21626,
         this.f_21627,
         this.f_21628,
         this.f_21629,
         this.f_21630,
         this.f_21631,
         this.f_21632,
         this.f_21633,
         this.f_21634
      );
   }

   private void m_6951(String var1) {
      this.m_7001(var1, false);
   }

   private boolean m_6952() {
      if (!this.f_21626.m_8768()
         || this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.EC_OPEN
         || this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.EC_STORE
         || !this.f_21647.m_4463(f_21766)) {
         return false;
      } else if (this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.OPEN
         || this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.LOOT
         || this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.BREAK
         || this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.BREAK_CART) {
         return false;
      } else if (!this.m_6968()) {
         this.f_21647.m_4459();
         return false;
      } else {
         this.m_6983();
         this.m_6988();
         this.m_6993();
         this.f_21656 = false;
         this.f_21643.m_4459();
         this.f_21642.m_4459();
         this.m_6960(f_21767);
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.EC_OPEN;
         return true;
      }
   }

   private Vec3 m_6953() {
      if (this.f_21637 != null) {
         return this.f_21637.getBoundingBox().getCenter();
      } else {
         return this.f_21636 != null ? Vec3.atCenterOf(this.f_21636) : null;
      }
   }

   private void m_6954() {
      if (!this.m_7029()) {
         this.m_6960(f_21752);
         this.m_6969();
         this.m_6993();
         this.m_6983();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
      } else {
         this.m_6943();
         if (f_11537.player.isInWater()) {
            f_11537.options.keyJump.setDown(true);
         }

         if (this.m_7023()) {
            this.m_6983();
            this.m_6988();
            this.f_21653 = false;
            this.f_21654 = false;
            this.f_21655 = false;
            this.f_21661 = 0;
            this.f_21643.m_4459();
            this.m_6960(f_21753);
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.OPEN;
         } else {
            BlockPos var1 = this.f_21637 != null ? this.f_21637.blockPosition() : this.f_21636;
            if (var1 != null) {
               if (this.f_21631.m_8768()) {
                  BlockPos var2 = this.f_21640;
                  if (!this.m_6976(var2)) {
                     var2 = this.m_7037();
                  }

                  if (var2 == null) {
                     this.m_7020(false);
                     return;
                  }

                  this.f_21662 = var1.asLong();
                  this.f_21640 = var2;
                  this.m_7013(var2);
               } else if (this.m_6964() && (this.f_21644.m_4463(f_21754) || this.f_21662 != var1.asLong() || this.f_21640 == null)) {
                  this.m_7024();
                  this.f_21644.m_4459();
               }
            }
         }
      }
   }

   private boolean m_6955(AbstractContainerMenu var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         if (((Slot)var1.slots.get(var3)).getItem().isEmpty()) {
            return true;
         }
      }

      return false;
   }

   private void m_6956(BlockPos var1) {
      if (var1 != null && this.m_6945()) {
         this.m_6988();
         double var2 = var1.getX() + f_21808;
         double var4 = var1.getZ() + f_21809;
         double var6 = Math.hypot(var2 - f_11537.player.getX(), var4 - f_11537.player.getZ());
         if (!(var6 <= f_21810)) {
            KeyFinder.Class_4PiqDlsWqy3tGypD var8 = this.m_6958(var2, var4);
            if (var8 == null) {
               this.m_7020(true);
            } else {
               this.m_7033(var8);
            }
         }
      }
   }

   private void m_6957() {
      this.f_21665 = 0;
      this.f_21666 = 0;
      this.f_21667 = -1;
      this.f_21668 = 0;
      this.f_21669 = false;
   }

   private KeyFinder.Class_4PiqDlsWqy3tGypD m_6958(double var1, double var3) {
      double var5 = f_11537.player.getX();
      double var7 = f_11537.player.getZ();
      double var9 = var1 - var5;
      double var11 = var3 - var7;
      double var13 = Math.hypot(var9, var11);
      if (var13 <= f_21811) {
         return null;
      }

      for (double var15 = Math.min(var13, f_21812); var15 > f_21813; var15 -= Math.min(1.0, var15)) {
         double var17 = var15 / var13;
         double var19 = var5 + var9 * var17;
         double var21 = var7 + var11 * var17;
         KeyFinder.Class_4PiqDlsWqy3tGypD var23 = this.m_7011(var5, var7, var19, var21, var1, var3);
         if (var23 != null) {
            return var23;
         }
      }

      return null;
   }

   private void m_6959(Class_Xu9btcIeUN33XnMK var1) {
      this.m_7016();
      this.m_7035();
      BlockPos var2 = this.f_21659;
      if (var2 != null) {
         this.f_21659 = null;
         this.f_21649.add(var2);
         this.m_6960(f_21745);
         this.m_6993();
         this.m_6983();
         this.m_6988();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
      } else if (!this.m_6950()) {
         if (this.f_21658) {
            this.f_21658 = false;
            this.m_6960(f_21746);
            this.m_6969();
            this.m_6993();
            this.m_6983();
            if (f_11537.gameMode != null) {
               f_11537.gameMode.stopDestroyBlock();
            }

            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
         } else {
            this.m_6962();
            if (!this.m_6952()) {
               if (this.f_21635 != KeyFinder.xTHj7qCVoAzpXiba.EC_OPEN && this.f_21635 != KeyFinder.xTHj7qCVoAzpXiba.EC_STORE) {
                  this.m_7030();
               }

               switch (this.f_21635) {
                  case SEARCH:
                     this.m_6999();
                     break;
                  case GOTO:
                     this.m_6954();
                     break;
                  case OPEN:
                     this.m_7000();
                     break;
                  case LOOT:
                     this.m_7028();
                     break;
                  case EC_OPEN:
                     this.m_6998();
                     break;
                  case EC_STORE:
                     this.m_6996();
                     break;
                  case BREAK:
                     this.m_6979();
                     break;
                  case BREAK_CART:
                     this.m_6994();
                     break;
                  case EXPLORE:
                     this.m_6972();
               }
            }
         }
      }
   }

   private void m_6960(String var1) {
      if (this.f_21632.m_8768()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
      }
   }

   private long m_6961() {
      return Math.max(0L, this.f_21628.m_8768().longValue());
   }

   private void m_6962() {
      boolean var1 = this.f_21626.m_8768();
      if (var1 != this.f_21657) {
         this.f_21657 = var1;
         this.f_21647.m_4459();
         if (!var1 && (this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.EC_OPEN || this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.EC_STORE)) {
            AbstractContainerMenu var2 = f_11537.player.containerMenu;
            if (var2 instanceof ChestMenu) {
               this.m_7004(var2);
            }

            this.f_21656 = false;
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
         }
      }
   }

   private void m_6963() {
      if (f_11537.gameMode != null) {
         if (this.f_21637 != null) {
            this.m_6995();
            Vec3 var3 = this.f_21637.getBoundingBox().getCenter();
            EntityHitResult var4 = new EntityHitResult(this.f_21637, var3);
            f_11537.gameMode.interact(f_11537.player, this.f_21637, var4, InteractionHand.MAIN_HAND);
            f_11537.player.swing(InteractionHand.MAIN_HAND);
         } else {
            if (this.f_21636 != null) {
               Vec3 var1 = this.m_6953();
               if (var1 == null) {
                  return;
               }

               this.m_6995();
               BlockHitResult var2 = this.m_6947(f_11537.player.getEyePosition(), var1);
               if (var2.getType() != Type.BLOCK || !var2.getBlockPos().equals(this.f_21636)) {
                  return;
               }

               f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var2);
               f_11537.player.swing(InteractionHand.MAIN_HAND);
            }
         }
      }
   }

   private boolean m_6964() {
      return !this.f_21631.m_8768() && this.m_6987();
   }

   private void m_6965() {
      int var1 = Math.max(1, this.f_21630.m_8768().intValue());
      int var2 = Mth.floor(f_11537.player.getX());
      int var3 = Mth.floor(f_11537.player.getY());
      int var4 = Mth.floor(f_11537.player.getZ());
      BlockPos var5;
      if (this.f_21631.m_8768()) {
         var5 = this.m_6946(var2, var3, var4, var1, 120);
      } else {
         var5 = this.m_7014(var2, var3, var4, var1, 80, 8, 6);
         if (var5 == null) {
            var5 = this.m_7014(var2, var3, var4, var1 * 2, 120, 10, 6);
         }

         if (var5 == null) {
            var5 = this.m_6989(new BlockPos(var2 + var1, var3, var4), 10, 6, false);
         }
      }

      if (var5 == null) {
         var5 = new BlockPos(var2 + var1, var3, var4);
      }

      this.f_21639 = var5;
      this.m_7012();
      this.f_21651.add(this.m_6973(this.f_21639));
   }

   private Slot m_6966(AbstractContainerMenu var1, int var2) {
      for (int var3 = var2; var3 < var1.slots.size(); var3++) {
         Slot var4 = (Slot)var1.slots.get(var3);
         ItemStack var5 = var4.getItem();
         if (!var5.isEmpty() && this.m_7032(var5)) {
            return var4;
         }
      }

      return null;
   }

   private void m_6967() {
      long var1;
      if (this.f_21636 != null) {
         var1 = this.f_21636.asLong();
      } else if (this.f_21637 != null) {
         var1 = this.f_21637.blockPosition().asLong();
      } else {
         var1 = f_21841;
      }

      if (var1 != this.f_21674) {
         this.m_7036();
         this.f_21674 = var1;
      }
   }

   private boolean m_6968() {
      for (int var1 = 0; var1 < 36; var1++) {
         ItemStack var2 = f_11537.player.getInventory().getItem(var1);
         if (!var2.isEmpty() && this.m_7032(var2)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void m_732() {
      this.m_6983();
      this.m_6988();
      this.m_6990();
      super.m_732();
   }

   private void m_6969() {
      if (this.f_21637 != null) {
         this.f_21648.add(this.f_21637.blockPosition().asLong());
      } else if (this.f_21636 != null) {
         this.f_21648.add(this.f_21636.asLong());
      }
   }

   private void m_6970(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundSystemChatPacket var2) {
         String var5 = var2.content().getString().toLowerCase(Locale.ROOT);
         if (var5.contains(f_21743) && this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.OPEN && this.f_21653) {
            BlockPos var4 = this.f_21637 != null ? this.f_21637.blockPosition() : this.f_21636;
            if (var4 != null) {
               this.f_21659 = var4.immutable();
            }

            return;
         }

         if (var5.contains(f_21744)) {
            this.f_21658 = true;
         }
      }
   }

   private boolean m_6971(double var1, double var3, double var5) {
      AABB var7 = new AABB(var1 - f_21819, var3 + 1.0, var5 - f_21820, var1 + f_21821, var3 + f_21822, var5 + f_21823);
      return f_11537.level.noCollision(f_11537.player, var7);
   }

   private void m_6972() {
      this.m_6943();
      if (this.f_21641.m_4461(f_21777, true) && this.m_6997()) {
         this.m_6983();
         this.m_6988();
         this.m_7024();
         this.m_6960(this.f_21637 != null ? f_21778 : f_21779);
         this.f_21644.m_4459();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.GOTO;
      } else if (this.f_21639 != null && !this.m_7031(this.f_21639, 1.0)) {
         if (this.f_21631.m_8768()) {
            this.m_6956(this.f_21639);
         } else if (this.f_21644.m_4463(f_21780)) {
            this.m_7012();
         }
      } else {
         this.m_6965();
      }
   }

   private long m_6973(BlockPos var1) {
      return this.m_7021(var1.getX(), var1.getZ());
   }

   private boolean m_6974(ItemStack var1) {
      String var2 = f_21787;
      if (var2 != null && !var2.trim().isEmpty()) {
         String var3 = var1.getHoverName().getString();
         String var4 = StringUtil.stripColor(var3);
         if (var4 == null) {
            var4 = var3;
         }

         return var4.toLowerCase(Locale.ROOT).contains(var2.trim().toLowerCase(Locale.ROOT));
      } else {
         return false;
      }
   }

   private void m_6975() {
      if (f_11537.player != null && f_11537.getConnection() != null) {
         this.f_21667 = f_11537.player.getInventory().selected;
         int var1 = this.f_21667 == 0 ? 1 : 0;
         f_11537.gameMode.stopDestroyBlock();
         this.m_7008(var1);
         this.f_21669 = true;
         this.f_21668 = 1;
         this.m_6960(f_21775);
      }
   }

   private boolean m_6976(BlockPos var1) {
      if (var1 == null || this.f_21652.contains(var1.asLong()) || !this.m_7005(var1)) {
         return false;
      }

      if (this.f_21636 != null && var1.below().equals(this.f_21636)) {
         return false;
      }

      Vec3 var2 = this.m_6953();
      if (var2 == null) {
         return false;
      }

      Vec3 var3 = this.m_6984(var1);
      return var3.distanceToSqr(var2) <= f_21797 && this.m_6982(var3, var2);
   }

   private boolean m_6977(BlockPos var1, List<BlockPos> var2, double var3) {
      for (BlockPos var6 : var2) {
         if (var1.distSqr(var6) <= var3) {
            return true;
         }
      }

      return false;
   }

   private void m_6978(BlockPos var1, KeyFinder.Class_4PiqDlsWqy3tGypD var2) {
      this.m_7033(var2);
      this.f_21675 = var1.immutable();
      this.f_21676 = this.f_21672 + f_21832;
   }

   private void m_6979() {
      if (this.f_21638 != null && f_11537.gameMode != null && f_11537.player != null) {
         BlockState var1 = f_11537.level.getBlockState(this.f_21638);
         net.minecraft.world.level.block.Block var2 = var1.getBlock();
         if (var1.isAir() || !(var2 instanceof ChestBlock)) {
            this.f_21648.add(this.f_21638.asLong());
            this.f_21638 = null;
            this.m_6993();
            f_11537.gameMode.stopDestroyBlock();
            this.m_6957();
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
         } else if (this.f_21669) {
            this.m_7022();
         } else {
            this.m_7026(Vec3.atCenterOf(this.f_21638));
            f_11537.gameMode.continueDestroyBlock(this.f_21638, Direction.UP);
            f_11537.player.swing(InteractionHand.MAIN_HAND);
            this.f_21665++;
            if (this.f_21665 >= 20) {
               this.f_21665 = 0;
               this.f_21666++;
               f_11537.gameMode.stopDestroyBlock();
               if (this.f_21666 >= 2) {
                  this.f_21666 = 0;
                  this.m_6975();
               }
            }
         }
      } else {
         this.m_6957();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
      }
   }

   private BlockPos m_6980(BlockPos var1, int var2) {
      if (this.f_21631.m_8768() && this.m_6981(var1)) {
         BlockPos var3 = this.m_7037();
         if (var3 != null) {
            return var3;
         }
      }

      BlockPos var13 = null;
      double var4 = f_21792;
      int var6 = Math.max(1, var2);

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -var6; var8 <= var6; var8++) {
            for (int var9 = -var6; var9 <= var6; var9++) {
               if (var8 != 0 || var7 != 0 || var9 != 0) {
                  BlockPos var10 = var1.offset(var8, var7, var9);
                  if (this.m_6941(var10)) {
                     double var11 = f_11537.player.distanceToSqr(Vec3.atCenterOf(var10));
                     if (var11 < var4) {
                        var4 = var11;
                        var13 = var10;
                     }
                  }
               }
            }
         }
      }

      if (var13 != null) {
         return var13;
      }

      BlockPos var14 = this.m_7007(var1, Math.max(4, var2 + 3), 4);
      return var14 != null ? var14 : var1;
   }

   private boolean m_6981(BlockPos var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.f_21636 != null ? this.f_21636.equals(var1) : this.f_21637 != null && this.f_21637.blockPosition().equals(var1);
      }
   }

   private boolean m_6982(Vec3 var1, Vec3 var2) {
      BlockHitResult var3 = this.m_6947(var1, var2);
      if (this.f_21636 == null) {
         return var3.getType() == Type.MISS ? true : var1.distanceTo(var3.getLocation()) + f_21785 >= var1.distanceTo(var2);
      } else {
         return var3.getType() == Type.BLOCK && var3.getBlockPos().equals(this.f_21636);
      }
   }

   private void m_6983() {
      this.f_21662 = f_21847;
      this.f_21640 = null;
      this.f_21663 = null;
      this.f_21664 = 0;
      this.m_6988();
      if (this.m_6964() && f_11537.getConnection() != null) {
         f_11537.getConnection().sendChat(f_21848);
         this.f_21645.m_4459();
      }
   }

   private Vec3 m_6984(BlockPos var1) {
      return new Vec3(var1.getX() + f_21798, var1.getY() + f_21799, var1.getZ() + f_21800);
   }

   private void m_6985(BlockPos var1, int var2) {
      this.m_7017(var1, this.m_6980(var1, var2));
   }

   private void m_6986(boolean var1) {
      if (this.f_21639 != null) {
         if (this.f_21631.m_8768()) {
            this.m_6988();
            this.f_21662 = this.f_21639.asLong();
            this.f_21640 = this.f_21639;
            this.f_21673 = 0;
            this.f_21644.m_4459();
         } else {
            BlockPos var2 = this.m_6989(this.f_21639, 8, 6, !var1);
            if (var2 != null) {
               this.f_21639 = var2;
            }

            if (this.m_6964() && this.m_7001("" + this.f_21639.getX() + this.f_21639.getZ(), true)) {
               this.f_21662 = this.f_21639.asLong();
               this.f_21640 = this.f_21639;
            }

            this.f_21644.m_4459();
         }
      }
   }

   private boolean m_6987() {
      return Class_gXPXh2FDkuYBeJW2.m_6800();
   }

   private void m_6988() {
      f_11537.options.keyUp.setDown(false);
      f_11537.options.keyDown.setDown(false);
      f_11537.options.keyLeft.setDown(false);
      f_11537.options.keyRight.setDown(false);
      f_11537.options.keySprint.setDown(false);
      f_11537.options.keyJump.setDown(false);
   }

   private BlockPos m_6989(BlockPos var1, int var2, int var3, boolean var4) {
      if (var1 == null) {
         return null;
      }

      BlockPos var5 = null;
      double var6 = f_21803;
      int var8 = Math.max(1, var2);
      int var9 = Math.max(1, var3);

      for (int var10 = -var9; var10 <= var9; var10++) {
         for (int var11 = -var8; var11 <= var8; var11++) {
            for (int var12 = -var8; var12 <= var8; var12++) {
               BlockPos var13 = var1.offset(var11, var10, var12);
               if (this.m_6941(var13) && (!var4 || !this.m_7006(var13))) {
                  double var14 = var11 * var11 + var10 * var10 + var12 * var12;
                  double var16 = f_11537.player.distanceToSqr(Vec3.atCenterOf(var13));
                  double var18 = var14 * f_21804 + var16;
                  if (var18 < var6) {
                     var6 = var18;
                     var5 = var13;
                  }
               }
            }
         }
      }

      return var5;
   }

   private void m_6990() {
      this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
      this.m_6993();
      this.f_21648.clear();
      this.f_21649.clear();
      this.f_21659 = null;
      this.f_21650.clear();
      this.f_21651.clear();
      this.f_21639 = null;
      this.f_21640 = null;
      this.f_21662 = f_21860;
      this.f_21658 = false;
      this.f_21660 = 0L;
      this.f_21661 = 0;
      this.f_21641.m_4459();
      this.f_21642.m_4459();
      this.f_21643.m_4459();
      this.f_21644.m_4459();
      this.f_21645.m_4459();
      this.f_21646.m_4459();
      this.f_21647.m_4459();
      this.f_21657 = false;
      this.f_21663 = null;
      this.f_21664 = 0;
      this.f_21670 = false;
      this.f_21671 = false;
      this.f_21672 = 0L;
      this.f_21673 = 0;
      this.m_6957();
   }

   private boolean m_6991(double var1, double var3) {
      int var5 = (int)Math.floor(var1) >> 4;
      int var6 = (int)Math.floor(var3) >> 4;
      return f_11537.level.getChunkSource().getChunk(var5, var6, ChunkStatus.FULL, false) != null;
   }

   private long m_6992(int var1, int var2) {
      return (var1 & f_21856) << 32 | var2 & f_21857;
   }

   @Override
   public void m_778() {
      super.m_778();
      if (!this.f_21631.m_8768() && !this.m_6987()) {
         this.m_6960(f_21742);
      }

      this.m_6990();
   }

   private void m_6993() {
      this.f_21636 = null;
      this.f_21637 = null;
      this.f_21638 = null;
      this.f_21653 = false;
      this.f_21654 = false;
      this.f_21655 = false;
      this.m_7003();
      this.f_21661 = 0;
      this.f_21640 = null;
      this.m_7036();
   }

   private void m_6994() {
      if (this.f_21637 != null && this.f_21637.isAlive()) {
         if (System.currentTimeMillis() >= this.f_21660) {
            this.f_21648.add(this.f_21637.blockPosition().asLong());
            this.m_6993();
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
         } else {
            this.m_7026(this.f_21637.getEyePosition());
            if (this.f_21642.m_4461(Math.max(f_21776, this.m_6961()), true) && f_11537.gameMode != null) {
               f_11537.gameMode.attack(f_11537.player, this.f_21637);
               f_11537.player.swing(InteractionHand.MAIN_HAND);
            }
         }
      } else {
         if (this.f_21637 != null) {
            this.f_21648.add(this.f_21637.blockPosition().asLong());
         }

         this.m_6993();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
      }
   }

   private void m_6995() {
      Vec3 var1 = this.m_6953();
      if (var1 != null) {
         this.m_7026(var1);
      }
   }

   private void m_6996() {
      AbstractContainerMenu var1 = f_11537.player.containerMenu;
      if (!(var1 instanceof ChestMenu)) {
         this.m_6949(false);
      } else {
         int var2 = Math.max(0, var1.slots.size() - 36);
         Slot var3 = this.m_6966(var1, var2);
         if (var3 == null) {
            this.m_7004(var1);
            this.m_6949(true);
         } else if (this.f_21643.m_4463(f_21765)) {
            this.m_7004(var1);
            this.m_6949(false);
         } else if (this.f_21642.m_4461(this.m_6961(), true) && f_11537.gameMode != null) {
            f_11537.gameMode.handleContainerInput(var1.containerId, var3.index, 0, ContainerInput.QUICK_MOVE, f_11537.player);
         }
      }
   }

   private boolean m_6997() {
      this.f_21636 = null;
      this.f_21637 = null;
      double var1 = f_21781;
      if (this.f_21622.m_8768()) {
         double var3 = this.f_21620.m_8768() + f_21782;
         double var5 = var3 * var3;

         for (Entity var8 : f_11537.level.entitiesForRendering()) {
            if (var8 instanceof MinecartChest var9) {
               double var10 = f_11537.player.distanceToSqr(var8);
               if (!(var10 > var5)) {
                  BlockPos var12 = var9.blockPosition();
                  if (!this.f_21648.contains(var12.asLong()) && !this.m_6948(var12) && var10 < var1) {
                     var1 = var10;
                     this.f_21637 = var9;
                     this.f_21636 = null;
                  }
               }
            }
         }
      }

      if (this.f_21621.m_8768()) {
         int var13 = this.f_21620.m_8768().intValue() + 16;
         BlockPos var4 = f_11537.player.blockPosition();
         ArrayList<BlockPos> var14 = new ArrayList<>();
         ArrayList var6 = new ArrayList();
         this.m_7002(var4, var13, this.f_21623.m_8768(), var14, var6);
         double var15 = f_21783;

         for (BlockPos var17 : var14) {
            if (!this.f_21648.contains(var17.asLong()) && !this.m_6948(var17) && (!this.f_21623.m_8768() || this.m_6977(var17, var6, var15))) {
               double var11 = f_11537.player.distanceToSqr(Vec3.atCenterOf(var17));
               if (var11 < var1) {
                  var1 = var11;
                  this.f_21636 = var17;
                  this.f_21637 = null;
               }
            }
         }
      }

      return this.f_21636 != null || this.f_21637 != null;
   }

   private void m_6998() {
      this.m_6988();
      if (!this.f_21656) {
         if (f_11537.getConnection() == null) {
            this.m_6949(false);
         } else {
            f_11537.getConnection().sendCommand(f_21762);
            this.f_21656 = true;
            this.f_21643.m_4459();
            this.m_6960(f_21763);
         }
      } else if (f_11537.player.containerMenu instanceof ChestMenu) {
         this.f_21642.m_4459();
         this.f_21643.m_4459();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.EC_STORE;
      } else {
         if (this.f_21643.m_4463(f_21764)) {
            this.m_6949(false);
         }
      }
   }

   private void m_6999() {
      this.m_6988();
      if (this.f_21641.m_4461(f_21749, true)) {
         if (this.m_6997()) {
            this.m_7024();
            this.m_6960(this.f_21637 != null ? f_21750 : f_21751);
            this.f_21644.m_4459();
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.GOTO;
         } else {
            this.m_6965();
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.EXPLORE;
         }
      }
   }

   private void m_7000() {
      AbstractContainerMenu var1 = f_11537.player.containerMenu;
      if (var1 instanceof ChestMenu) {
         this.f_21642.m_4459();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.LOOT;
      } else if (this.m_7027()) {
         if (!this.m_7015()) {
            this.f_21653 = false;
            this.f_21662 = f_21755;
            this.f_21640 = null;
            this.m_7024();
            this.f_21644.m_4459();
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.GOTO;
         } else if (!this.f_21653) {
            this.m_6995();
            if (this.f_21643.m_4463(this.m_6944())) {
               this.m_6963();
               this.f_21653 = true;
               this.f_21661++;
               this.f_21643.m_4459();
            }
         } else {
            if (this.f_21643.m_4463(this.f_21637 != null ? f_21756 : f_21757)) {
               int var2 = this.f_21637 != null ? 2 : 3;
               if (this.f_21661 < var2 && this.m_7029()) {
                  if (this.f_21637 != null) {
                     this.m_6988();
                     this.m_6995();
                     this.m_6963();
                     this.f_21661++;
                     this.f_21643.m_4459();
                     return;
                  }

                  this.f_21653 = false;
                  this.f_21662 = f_21758;
                  this.f_21640 = null;
                  this.m_7024();
                  this.f_21644.m_4459();
                  this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.GOTO;
                  return;
               }

               this.m_6969();
               this.m_6993();
               this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
            }
         }
      }
   }

   private boolean m_7001(String var1, boolean var2) {
      if (f_11537.getConnection() == null) {
         return false;
      }

      if (this.f_21663 != null) {
         return false;
      }

      if (!var2 && !this.f_21645.m_4461(f_21849, true)) {
         return false;
      }

      this.m_6988();
      f_11537.options.keyLeft.setDown(false);
      f_11537.options.keyRight.setDown(false);
      f_11537.options.keyDown.setDown(false);
      this.f_21663 = var1;
      this.f_21664 = 5;
      this.f_21645.m_4459();
      return true;
   }

   private void m_7002(BlockPos var1, int var2, boolean var3, List<BlockPos> var4, List<BlockPos> var5) {
      int var6 = var1.getX() - var2;
      int var7 = var1.getX() + var2;
      int var8 = var1.getZ() - var2;
      int var9 = var1.getZ() + var2;
      int var10 = Math.max(f_11537.level.getMinY(), var1.getY() - var2);
      int var11 = Math.min(f_11537.level.getMaxY(), var1.getY() + var2);
      int var12 = var6 >> 4;
      int var13 = var7 >> 4;
      int var14 = var8 >> 4;
      int var15 = var9 >> 4;

      for (int var16 = var12; var16 <= var13; var16++) {
         for (int var17 = var14; var17 <= var15; var17++) {
            if (f_11537.level.hasChunk(var16, var17)) {
               LevelChunk var18 = (LevelChunk)f_11537.level.getChunk(var16, var17, ChunkStatus.FULL, false);
               if (var18 != null) {
                  int var19 = var16 << 4;
                  int var20 = var17 << 4;
                  LevelChunkSection[] var21 = var18.getSections();

                  for (int var22 = 0; var22 < var21.length; var22++) {
                     LevelChunkSection var23 = var21[var22];
                     if (var23 != null && !var23.hasOnlyAir()) {
                        int var24 = f_11537.level.getSectionYFromSectionIndex(var22) << 4;
                        if (var24 <= var11 && var24 + 15 >= var10) {
                           for (int var25 = 0; var25 < 16; var25++) {
                              int var26 = var24 + var25;
                              if (var26 >= var10 && var26 <= var11) {
                                 for (int var27 = 0; var27 < 16; var27++) {
                                    int var28 = var19 + var27;
                                    if (var28 >= var6 && var28 <= var7) {
                                       for (int var29 = 0; var29 < 16; var29++) {
                                          int var30 = var20 + var29;
                                          if (var30 >= var8 && var30 <= var9) {
                                             BlockState var31 = var23.getBlockState(var27, var25, var29);
                                             net.minecraft.world.level.block.Block var32 = var31.getBlock();
                                             if (var32 instanceof ChestBlock) {
                                                var4.add(new BlockPos(var28, var26, var30));
                                             } else if (var3 && var32 instanceof SpawnerBlock) {
                                                var5.add(new BlockPos(var28, var26, var30));
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void m_7003() {
      this.f_21656 = false;
   }

   private void m_7004(AbstractContainerMenu var1) {
      f_11537.player.closeContainer();
   }

   private boolean m_7005(BlockPos var1) {
      BlockState var2 = f_11537.level.getBlockState(var1);
      BlockState var3 = f_11537.level.getBlockState(var1.above());
      BlockState var4 = f_11537.level.getBlockState(var1.below());
      double var5 = var1.getX() + f_21801;
      double var7 = var1.getZ() + f_21802;
      return var2.getCollisionShape(f_11537.level, var1).isEmpty()
         && var3.getCollisionShape(f_11537.level, var1.above()).isEmpty()
         && !var4.getCollisionShape(f_11537.level, var1.below()).isEmpty()
         && this.m_6971(var5, var1.getY() - 1.0, var7)
         && this.m_7019(var5, var1.getY(), var7);
   }

   private boolean m_7006(BlockPos var1) {
      long var2 = this.m_6973(var1);
      if (!this.f_21650.contains(var2) && !this.f_21651.contains(var2)) {
         int var4 = var1.getX() >> 3;
         int var5 = var1.getZ() >> 3;

         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               long var8 = this.m_6992(var4 + var6, var5 + var7);
               if (this.f_21650.contains(var8) || this.f_21651.contains(var8)) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private BlockPos m_7007(BlockPos var1, int var2, int var3) {
      return this.m_6989(var1, var2, var3, false);
   }

   private void m_7008(int var1) {
      if (f_11537.player != null && f_11537.getConnection() != null) {
         if (var1 >= 0 && var1 <= 8) {
            f_11537.player.getInventory().selected = var1;
            f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var1));
         }
      }
   }

   private void m_7009() {
      if (this.f_21636 != null && this.f_21624.m_7145(f_21770)) {
         this.f_21638 = this.f_21636;
         this.m_6957();
         this.f_21667 = f_11537.player.getInventory().selected;
         this.f_21642.m_4459();
         this.m_6960(f_21771);
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.BREAK;
      } else if (this.f_21637 != null && this.f_21624.m_7145(f_21772)) {
         this.f_21642.m_4459();
         this.f_21660 = System.currentTimeMillis() + f_21773;
         this.m_6960(f_21774);
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.BREAK_CART;
      } else {
         this.m_6969();
         this.m_6993();
         this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
      }
   }

   private Slot m_7010(AbstractContainerMenu var1, int var2) {
      for (int var3 = var2; var3 < var1.slots.size(); var3++) {
         Slot var4 = (Slot)var1.slots.get(var3);
         ItemStack var5 = var4.getItem();
         if (!var5.isEmpty() && this.m_7025(var5)) {
            return var4;
         }
      }

      return null;
   }

   private KeyFinder.Class_4PiqDlsWqy3tGypD m_7011(double var1, double var3, double var5, double var7, double var9, double var11) {
      int var13 = (int)Math.floor(var5);
      int var14 = (int)Math.floor(var7);
      KeyFinder.Class_4PiqDlsWqy3tGypD var15 = null;
      double var16 = f_21814;
      double var18 = Math.hypot(var9 - var1, var11 - var3);

      for (int var20 = -1; var20 <= 1; var20++) {
         for (int var21 = -1; var21 <= 1; var21++) {
            int var22 = var13 + var20;
            int var23 = var14 + var21;
            double var24 = var22 + f_21815;
            double var26 = var23 + f_21816;
            if (!(Math.hypot(var24 - var1, var26 - var3) > f_21817)
               && !(Math.hypot(var9 - var24, var11 - var26) > var18 - f_21818)
               && this.m_6991(var24, var26)) {
               Integer var28 = this.m_6942(var22, var23);
               if (var28 != null && this.m_6971(var24, var28.intValue(), var26) && this.m_7019(var24, var28.intValue() + 1.0, var26)) {
                  double var29 = var24 - var5;
                  double var31 = var26 - var7;
                  double var33 = var29 * var29 + var31 * var31;
                  if (var33 < var16) {
                     var16 = var33;
                     var15 = new KeyFinder.Class_4PiqDlsWqy3tGypD(var24, var28.intValue(), var26);
                  }
               }
            }
         }
      }

      return var15;
   }

   private void m_7012() {
      this.m_6986(true);
   }

   private void m_7013(BlockPos var1) {
      this.m_6967();
      if (var1 != null && this.f_21675 == null && this.m_6945()) {
         this.m_6988();
         double var2 = var1.getX() + f_21805;
         double var4 = var1.getZ() + f_21806;
         double var6 = var2 - f_11537.player.getX();
         double var8 = var4 - f_11537.player.getZ();
         double var10 = Math.hypot(var6, var8);
         if (var10 > f_21807) {
            KeyFinder.Class_4PiqDlsWqy3tGypD var12 = this.m_6958(var2, var4);
            if (var12 == null) {
               this.m_7020(false);
            } else {
               this.m_7033(var12);
            }
         } else if (!this.m_6991(var2, var4)) {
            this.m_7020(false);
         } else {
            this.m_6978(var1, new KeyFinder.Class_4PiqDlsWqy3tGypD(var2, var1.getY() - 1.0, var4));
         }
      }
   }

   private BlockPos m_7014(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = Math.max(1, var4);

      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = ThreadLocalRandom.current().nextInt(-var8, var8 + 1);
         int var11 = ThreadLocalRandom.current().nextInt(-var8, var8 + 1);
         if (Math.abs(var10) >= 8 || Math.abs(var11) >= 8) {
            BlockPos var12 = new BlockPos(var1 + var10, var2, var3 + var11);
            if (!this.m_7006(var12)) {
               BlockPos var13 = this.m_6989(var12, var6, var7, true);
               if (var13 != null && !this.m_7006(var13)) {
                  return var13;
               }
            }
         }
      }

      return null;
   }

   private boolean m_7015() {
      Vec3 var1 = this.m_6953();
      if (var1 == null) {
         return false;
      }

      Vec3 var2 = f_11537.player.getEyePosition();
      return var2.distanceToSqr(var1) > f_21784 ? false : this.m_6982(var2, var1);
   }

   private void m_7016() {
      boolean var1 = this.f_21631.m_8768();
      if (var1 != this.f_21670) {
         this.f_21670 = var1;
         this.f_21663 = null;
         this.f_21664 = 0;
         this.f_21662 = f_21747;
         this.f_21640 = null;
         this.f_21671 = false;
         this.f_21672 = 0L;
         this.f_21673 = 0;
         this.m_7036();
         this.m_6988();
         if (var1 && this.m_6987() && f_11537.getConnection() != null) {
            f_11537.getConnection().sendChat(f_21748);
         }

         if (!var1) {
            if (this.f_21635 != KeyFinder.xTHj7qCVoAzpXiba.GOTO || this.f_21637 == null && this.f_21636 == null) {
               if (this.f_21635 == KeyFinder.xTHj7qCVoAzpXiba.EXPLORE && this.f_21639 != null) {
                  this.m_7012();
               }
            } else {
               this.m_7024();
            }
         }
      }
   }

   private void m_7017(BlockPos var1, BlockPos var2) {
      if (this.f_21631.m_8768()) {
         this.m_6988();
         this.f_21662 = var1.asLong();
         this.f_21640 = var2;
         this.f_21673 = 0;
      } else if (this.m_6964() && this.m_7001("" + var2.getX() + var2.getY() + var2.getZ(), true)) {
         this.f_21662 = var1.asLong();
         this.f_21640 = var2;
      }
   }

   private boolean m_7018(AbstractContainerMenu var1, int var2, ItemStack var3) {
      for (int var4 = var2; var4 < var1.slots.size(); var4++) {
         ItemStack var5 = ((Slot)var1.slots.get(var4)).getItem();
         if (var5.isEmpty()) {
            return true;
         }

         if (ItemStack.isSameItemSameComponents(var5, var3) && var5.getCount() < var5.getMaxStackSize()) {
            return true;
         }
      }

      return false;
   }

   private boolean m_7019(double var1, double var3, double var5) {
      AABB var7 = new AABB(var1 - f_21824, var3, var5 - f_21825, var1 + f_21826, var3 + f_21827, var5 + f_21828);
      return f_11537.level.noCollision(f_11537.player, var7);
   }

   private void m_7020(boolean var1) {
      this.f_21673++;
      if (this.f_21673 >= 100) {
         this.f_21673 = 0;
         if (var1) {
            this.m_6960(f_21844);
            this.f_21639 = null;
            this.f_21640 = null;
            this.f_21662 = f_21845;
         } else {
            this.m_6960(f_21846);
            this.m_6969();
            this.m_6993();
            this.f_21635 = KeyFinder.xTHj7qCVoAzpXiba.SEARCH;
         }
      }
   }

   private long m_7021(int var1, int var2) {
      return this.m_6992(var1 >> 3, var2 >> 3);
   }

   private void m_7022() {
      if (f_11537.player != null && f_11537.getConnection() != null) {
         this.m_6988();
         f_11537.gameMode.stopDestroyBlock();
         if (this.f_21668 > 0) {
            this.f_21668--;
         } else {
            this.m_7008(this.f_21667);
            this.f_21669 = false;
            this.f_21668 = 0;
            this.f_21665 = 0;
            this.f_21666 = 0;
         }
      } else {
         this.m_6957();
      }
   }

   private boolean m_7023() {
      return this.m_7015();
   }

   private void m_7024() {
      if (this.f_21637 != null) {
         this.m_6985(this.f_21637.blockPosition(), 1);
      } else if (this.f_21636 != null) {
         this.m_7034(this.f_21636);
      }
   }

   private boolean m_7025(ItemStack var1) {
      return f_21701.contains(var1.getItem());
   }

   private void m_7026(Vec3 var1) {
      Vec3 var2 = f_11537.player.getEyePosition();
      Vec3 var3 = var1.subtract(var2);
      double var4 = Math.sqrt(var3.x * var3.x + var3.z * var3.z);
      float var6 = (float)Math.toDegrees(Math.atan2(var3.z, var3.x)) - f_21853;
      float var7 = (float)(-Math.toDegrees(Math.atan2(var3.y, var4)));
      f_11537.player.setYRot(Mth.wrapDegrees(var6));
      f_11537.player.setXRot(Mth.clamp(var7, f_21854, f_21855));
   }

   private boolean m_7027() {
      return !this.f_21631.m_8768() || !this.f_21671 || System.nanoTime() - this.f_21672 >= f_21786;
   }

   private void m_7028() {
      AbstractContainerMenu var1 = f_11537.player.containerMenu;
      if (!(var1 instanceof ChestMenu)) {
         this.m_7009();
      } else {
         int var2 = Math.max(0, var1.slots.size() - 36);
         Slot var3 = null;

         for (int var4 = 0; var4 < var2; var4++) {
            Slot var5 = (Slot)var1.slots.get(var4);
            ItemStack var6 = var5.getItem();
            if (!var6.isEmpty() && this.m_7032(var6)) {
               var3 = var5;
               break;
            }
         }

         if (var3 == null) {
            this.m_7004(var1);
            this.m_7009();
         } else {
            if (this.f_21627.m_8768() && !this.m_7018(var1, var2, var3.getItem()) && this.m_6955(var1, var2)) {
               Slot var7 = this.m_7010(var1, var2);
               if (var7 != null) {
                  if (this.f_21642.m_4461(this.m_6961(), true)) {
                     if (f_11537.gameMode != null) {
                        f_11537.gameMode.handleContainerInput(var1.containerId, var7.index, 0, ContainerInput.QUICK_MOVE, f_11537.player);
                     }

                     if (!this.f_21655) {
                        this.m_6960(f_21759);
                     }

                     this.f_21655 = true;
                  }

                  return;
               }
            }

            if (this.f_21642.m_4461(this.m_6961(), true)) {
               ItemStack var8 = var3.getItem();
               boolean var9 = this.m_6974(var8);
               if (f_11537.gameMode != null) {
                  f_11537.gameMode.handleContainerInput(var1.containerId, var3.index, 0, ContainerInput.QUICK_MOVE, f_11537.player);
               }

               if (!this.f_21654) {
                  this.m_6960(var9 ? f_21760 : f_21761);
               }

               this.f_21654 = true;
            }
         }
      }
   }

   private boolean m_7029() {
      return this.f_21637 != null ? this.f_21637.isAlive() : this.f_21636 != null && f_11537.level.getBlockState(this.f_21636).getBlock() instanceof ChestBlock;
   }

   private void m_7030() {
      if (this.f_21633.m_8768()) {
         if (f_11537.player.getFoodData().getFoodLevel() < this.f_21634.m_8768().intValue()) {
            if (this.f_21646.m_4461(f_21850, true)) {
               if (f_11537.getConnection() != null) {
                  f_11537.getConnection().sendCommand(f_21851);
               }

               this.m_6960(f_21852);
            }
         }
      }
   }

   private boolean m_7031(BlockPos var1, double var2) {
      double var4 = f_11537.player.getX() - (var1.getX() + f_21858);
      double var6 = f_11537.player.getZ() - (var1.getZ() + f_21859);
      return var4 * var4 + var6 * var6 <= var2 * var2;
   }

   private boolean m_7032(ItemStack var1) {
      return this.f_21625.m_7145(f_21788) && this.m_6974(var1)
         || this.f_21625.m_7145(f_21789) && var1.is(Items.ENCHANTED_GOLDEN_APPLE)
         || this.f_21625.m_7145(f_21790) && var1.is(Items.GOLDEN_APPLE)
         || this.f_21625.m_7145(f_21791) && var1.is(Items.ENCHANTED_BOOK);
   }

   private void m_7033(KeyFinder.Class_4PiqDlsWqy3tGypD var1) {
      this.f_21673 = 0;
      double var2 = Math.floor(var1.x()) + f_21830;
      double var4 = Math.floor(var1.z()) + f_21831;
      f_11537.player.setPos(var2, var1.y(), var4);
      this.f_21671 = true;
      this.f_21672 = System.nanoTime();
   }

   private void m_7034(BlockPos var1) {
      this.m_7017(var1, this.m_6980(var1, 1));
   }

   private void m_7035() {
      if (this.f_21675 != null && System.nanoTime() >= this.f_21676) {
         BlockPos var1 = this.f_21675;
         this.f_21675 = null;
         this.f_21676 = 0L;
         if (this.f_21631.m_8768() && (this.f_21636 != null || this.f_21637 != null)) {
            if (this.m_7038(var1)) {
               this.f_21677 = f_21833;
               this.f_21678 = 0;
            } else {
               long var2 = var1.asLong();
               if (this.f_21677 == var2) {
                  this.f_21678++;
               } else {
                  this.f_21677 = var2;
                  this.f_21678 = 1;
               }

               if (this.f_21678 >= 3) {
                  this.f_21652.add(var2);
                  if (var1.equals(this.f_21640)) {
                     this.f_21640 = null;
                     this.f_21662 = f_21834;
                  }

                  this.f_21677 = f_21835;
                  this.f_21678 = 0;
                  this.m_6960(f_21836);
               }
            }
         }
      }
   }

   private void m_7036() {
      this.f_21674 = f_21842;
      this.f_21675 = null;
      this.f_21676 = 0L;
      this.f_21677 = f_21843;
      this.f_21678 = 0;
      this.f_21652.clear();
   }

   private BlockPos m_7037() {
      this.m_6967();
      Vec3 var1 = this.m_6953();
      BlockPos var2 = this.f_21636 != null ? this.f_21636 : (this.f_21637 != null ? this.f_21637.blockPosition() : null);
      if (var1 != null && var2 != null) {
         BlockPos var3 = null;
         double var4 = f_21793;

         for (int var6 = -2; var6 <= 2; var6++) {
            for (int var7 = -3; var7 <= 3; var7++) {
               for (int var8 = -3; var8 <= 3; var8++) {
                  BlockPos var9 = var2.offset(var7, var6, var8);
                  if (this.m_6976(var9)) {
                     Vec3 var10 = new Vec3(var9.getX() + f_21794, var9.getY() - 1.0, var9.getZ() + f_21795);
                     Vec3 var11 = this.m_6984(var9);
                     double var12 = var11.distanceToSqr(var1) * f_21796 + f_11537.player.distanceToSqr(var10);
                     if (var12 < var4) {
                        var4 = var12;
                        var3 = var9;
                     }
                  }
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private boolean m_7038(BlockPos var1) {
      double var2 = f_11537.player.getX() - (var1.getX() + f_21837);
      double var4 = f_11537.player.getZ() - (var1.getZ() + f_21838);
      double var6 = var1.getY() - 1.0;
      double var8 = Math.min(Math.abs(f_11537.player.getY() - var6), Math.abs(f_11537.player.getY() - var1.getY()));
      return var2 * var2 + var4 * var4 <= f_21839 && var8 <= f_21840 && this.m_7015();
   }

   private record Class_4PiqDlsWqy3tGypD(double x, double y, double z) {
   }

   private enum xTHj7qCVoAzpXiba {
      SEARCH,
      GOTO,
      OPEN,
      LOOT,
      EC_OPEN,
      EC_STORE,
      BREAK,
      BREAK_CART,
      EXPLORE;
   }
}
