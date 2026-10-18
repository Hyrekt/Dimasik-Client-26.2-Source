package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_PlAkZAQgfIOFZi5F;
import dev.dimasik.client.system.Class_RZNlHP6UMh7nkSP8;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_mRcJJZJYG5cvDAlU;
import dev.dimasik.client.system.Class_n4Vd6x58AFGMHuQ1;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Objective;
import org.joml.Vector2f;

public class HolyWorldHelper extends Module {
   private final IntegerSetting f_9100;
   private final IntegerSetting f_9101;
   private final IntegerSetting f_9102;
   private final IntegerSetting f_9103;
   private final IntegerSetting f_9104;
   private final IntegerSetting f_9105;
   private final CheckboxSetting f_9106;
   private final CheckboxSetting f_9107;
   private final Queue<HolyWorldHelper.i2bLwhBEi5HI6cmT> f_9108;
   private final List<Class_RZNlHP6UMh7nkSP8> f_9109;
   private final Class_n4Vd6x58AFGMHuQ1 f_9110;
   private ClientLevel f_9111;
   private HolyWorldHelper.hVDindftTeKTtA2A f_9112;
   private Item f_9113;
   private int f_9114;
   private int f_9115;
   private long f_9116;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_9117;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_9118;
   private final Class_gEPk7yDw6CwIte87<Class_mRcJJZJYG5cvDAlU> f_9119;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_9120;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_9121;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_9122;
   private static final String f_9123 = "HolyWorld Helper";
   private static final String f_9124 = "Помощник для сервера HolyWorld";
   private static final String f_9125 = "Штучка";
   private static final String f_9126 = "Стан";
   private static final String f_9127 = "Взрывная трапка";
   private static final String f_9128 = "Трапка (Хорус)";
   private static final String f_9129 = "Снежок";
   private static final String f_9130 = "Рюкзак (Шалкер)";
   private static final String f_9131 = "Полная остановка";
   private static final String f_9132 = "Таймеры эффектов";
   private static final String f_9133 = "minecraft:entity.generic.explode";
   private static final long f_9134 = 15000L;
   private static final long f_9135 = 11000L;
   private static final String f_9136 = "minecraft:block.beacon.deactivate";
   private static final float f_9137 = 1.5F;
   private static final long f_9138 = 15000L;
   private static final long f_9139 = 11000L;
   private static final double f_9140 = 1000.0;
   private static final String f_9141 = "%.1fs";
   private static final double f_9142 = 10.0;
   private static final double f_9143 = 10.0;
   private static final float f_9144 = 34.0F;
   private static final float f_9145 = 24.0F;
   private static final float f_9146 = 0.5F;
   private static final float f_9147 = 0.5F;
   private static final float f_9148 = 9.0F;
   private static final double f_9149 = 205.0;
   private static final float f_9150 = 7.0F;
   private static final double f_9151 = 140.0;
   private static final float f_9152 = 7.0F;
   private static final double f_9153 = 38.0;
   private static final float f_9154 = 6.0F;
   private static final float f_9155 = 4.0F;
   private static final float f_9156 = 27.0F;
   private static final float f_9157 = 4.0F;
   private static final double f_9158 = 255.0;
   private static final String f_9159 = "null";
   private static final String f_9160 = "(?:-|#)(\\d+)";
   private static final long f_9161 = 100L;
   private static final double f_9162 = 2.25;

   private int m_3124(int var1) {
      return var1 < 9 ? var1 + 36 : var1;
   }

   private void m_3126() {
      int var1 = this.m_3132(this.f_9113);
      if (var1 == -1) {
         this.m_3128();
      } else {
         int var2 = f_11537.player.getInventory().selected;
         f_11537.player.setSprinting(false);
         this.f_9114 = this.m_3124(var1);
         this.f_9115 = var2;
         f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, this.f_9114, this.f_9115, ContainerInput.SWAP, f_11537.player);
         f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
         f_11537.player.swing(InteractionHand.MAIN_HAND);
         if (f_11537.gui.screen() == null) {
            f_11537.player.connection.send(new ServerboundContainerClosePacket(f_11537.player.containerMenu.containerId));
         }

         this.f_9116 = System.currentTimeMillis() + f_9161;
         this.f_9112 = HolyWorldHelper.hVDindftTeKTtA2A.RESTORE;
      }
   }

   public boolean m_3127() {
      if (this.m_3134() && this.f_9112 == HolyWorldHelper.hVDindftTeKTtA2A.IDLE && this.m_3132(Items.POPPED_CHORUS_FRUIT) != -1) {
         this.f_9113 = Items.POPPED_CHORUS_FRUIT;
         this.f_9112 = HolyWorldHelper.hVDindftTeKTtA2A.USE;
         return true;
      } else {
         return false;
      }
   }

   private void m_3128() {
      this.f_9112 = HolyWorldHelper.hVDindftTeKTtA2A.IDLE;
      this.f_9113 = null;
      this.f_9114 = -1;
      this.f_9115 = -1;
      this.f_9116 = 0L;
   }

   private void m_3129(Class_Xu9btcIeUN33XnMK var1) {
      if (!this.m_3134()) {
         this.m_3128();
         this.f_9108.clear();
         this.f_9109.clear();
         this.f_9110.m_7648();
         this.f_9111 = null;
      } else {
         if (this.f_9111 != f_11537.level) {
            this.f_9108.clear();
            this.f_9109.clear();
            this.f_9110.m_7648();
            this.f_9111 = f_11537.level;
         }

         HolyWorldHelper.i2bLwhBEi5HI6cmT var2;
         while ((var2 = this.f_9108.poll()) != null) {
            this.m_3142(var2);
         }

         long var3 = System.currentTimeMillis();
         Iterator var5 = this.f_9109.iterator();

         while (var5.hasNext()) {
            Class_RZNlHP6UMh7nkSP8 var6 = (Class_RZNlHP6UMh7nkSP8)var5.next();
            if (var6.expiresAt() <= var3) {
               if (var6.item() == Items.NETHER_STAR) {
                  this.f_9110.m_7646(var6.position());
               }

               var5.remove();
            }
         }

         if (this.f_9112 == HolyWorldHelper.hVDindftTeKTtA2A.USE) {
            this.m_3126();
         } else if (this.f_9112 == HolyWorldHelper.hVDindftTeKTtA2A.RESTORE && System.currentTimeMillis() >= this.f_9116) {
            this.m_3140();
         }
      }
   }

   @Override
   public void m_732() {
      this.f_9108.clear();
      this.f_9109.clear();
      this.f_9110.m_7648();
      this.f_9111 = null;
      if (this.f_9112 == HolyWorldHelper.hVDindftTeKTtA2A.RESTORE && this.m_3134()) {
         this.m_3140();
      } else {
         this.m_3128();
      }
   }

   private String m_3130() {
      return f_11537.level == null ? f_9159 : f_11537.level.dimension().identifier().getPath();
   }

   private static String m_3131(ClientboundSoundPacket var0) {
      Identifier var1 = ((SoundEvent)var0.getSound().value()).location();
      return var1 == null ? "" : var1.toString();
   }

   private int m_3132(Item var1) {
      if (f_11537.player != null && var1 != null) {
         for (int var2 = 0; var2 < 36; var2++) {
            if (f_11537.player.getInventory().getItem(var2).is(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void m_3133(Class_mRcJJZJYG5cvDAlU var1) {
      if (this.f_9112 != HolyWorldHelper.hVDindftTeKTtA2A.IDLE && this.f_9106.m_8768()) {
         var1.m_7590(0.0F);
         var1.m_7596(0.0F);
         var1.m_7587(false);
         var1.m_7597(false);
         var1.m_7599(false);
         var1.m_7594(false);
      }
   }

   private boolean m_3134() {
      return f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && f_11537.getConnection() != null;
   }

   private int m_3135() {
      if (f_11537.level == null) {
         return -1;
      }

      Objective var1 = f_11537.level.getScoreboard().getDisplayObjective(DisplaySlot.SIDEBAR);
      if (var1 == null) {
         return -1;
      }

      Matcher var2 = Pattern.compile(f_9160).matcher(var1.getDisplayName().getString());
      return var2.find() ? Integer.parseInt(var2.group(1)) : -1;
   }

   private boolean m_3136(IntegerSetting var1, int var2) {
      return var1.m_8768() >= 0 && var1.m_8768() == var2;
   }

   private boolean m_3137(ClientboundLevelParticlesPacket var1) {
      return var1.getParticle().getType() == ParticleTypes.POOF
         || var1.getParticle().getType() == ParticleTypes.EXPLOSION
         || var1.getParticle().getType() == ParticleTypes.EXPLOSION_EMITTER;
   }

   private void m_3138(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.f_9107.m_8768()) {
         if (!(var1.m_5619() instanceof ClientboundSoundPacket var2)) {
            if (var1.m_5619() instanceof ClientboundLevelParticlesPacket var7 && this.m_3137(var7)) {
               this.f_9108.add(new HolyWorldHelper.i2bLwhBEi5HI6cmT(Items.PRISMARINE_SHARD, new Vec3(var7.getX(), var7.getY(), var7.getZ()), f_9139));
            }
         } else {
            String var8 = m_3131(var2);
            float var4 = var2.getVolume();
            float var5 = var2.getPitch();
            BlockPos var6 = BlockPos.containing(var2.getX(), var2.getY(), var2.getZ());
            if (var8.contains(f_9133) && (var4 == 1.0F || var5 == 1.0F)) {
               this.f_9108.add(new HolyWorldHelper.i2bLwhBEi5HI6cmT(Items.NETHER_STAR, Vec3.atCenterOf(var6), f_9134));
               this.f_9108.add(new HolyWorldHelper.i2bLwhBEi5HI6cmT(Items.PRISMARINE_SHARD, Vec3.atCenterOf(var6.above()), f_9135));
            }

            if (var8.contains(f_9136) && (var4 == f_9137 || var5 == 1.0F)) {
               this.f_9108.add(new HolyWorldHelper.i2bLwhBEi5HI6cmT(Items.NETHER_STAR, Vec3.atCenterOf(var6), f_9138));
            }
         }
      }
   }

   public HolyWorldHelper() {
      super(f_9123, f_9124, Category.MISC);
      this.f_9100 = new IntegerSetting(f_9125);
      this.f_9101 = new IntegerSetting(f_9126);
      this.f_9102 = new IntegerSetting(f_9127);
      this.f_9103 = new IntegerSetting(f_9128);
      this.f_9104 = new IntegerSetting(f_9129);
      this.f_9105 = new IntegerSetting(f_9130);
      this.f_9106 = new CheckboxSetting(f_9131, false);
      this.f_9107 = new CheckboxSetting(f_9132, true);
      this.f_9108 = new ConcurrentLinkedQueue<>();
      this.f_9109 = new ArrayList<>();
      this.f_9110 = new Class_n4Vd6x58AFGMHuQ1();
      this.f_9112 = HolyWorldHelper.hVDindftTeKTtA2A.IDLE;
      this.f_9114 = -1;
      this.f_9115 = -1;
      this.f_9117 = this::m_3143;
      this.f_9118 = this::m_3129;
      this.f_9119 = this::m_3133;
      this.f_9120 = this::m_3138;
      this.f_9121 = this::m_3139;
      this.f_9122 = this::m_3144;
      this.m_795(this.f_9100, this.f_9101, this.f_9102, this.f_9103, this.f_9104, this.f_9105, this.f_9106, this.f_9107);
   }

   private void m_3139(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_9107.m_8768() && var1.m_6083() != null && f_11537.level != null) {
         String var2 = this.m_3130();
         int var3 = this.m_3135();

         for (Class_RZNlHP6UMh7nkSP8 var5 : this.f_9109) {
            if (var5.world().equals(var2) && (var5.anarchy() < 0 || var3 < 0 || var5.anarchy() == var3)) {
               Vector2f var6 = Class_FvJXUGWpZo3zYBW4.m_2690(var5.position());
               if (var6 != null) {
                  double var7 = Math.max(0.0, (var5.expiresAt() - System.currentTimeMillis()) / f_9140);
                  String var9 = String.format(Locale.US, f_9141, Math.round(var7 * f_9142) / f_9143);
                  float var10 = f_9144 + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, 12);
                  float var11 = f_9145;
                  float var12 = var6.x - var10 * f_9146;
                  float var13 = var6.y - var11 * f_9147;
                  Class_Ssh31B3ljfKeWsvS.m_4859(var12, var13, var10, var11, f_9148, Class_BftdentXEtGbugJw.m_2303(0, 0, 0, f_9149));
                  Class_Ssh31B3ljfKeWsvS.m_4817(var12, var13, var10, var11, f_9150, Class_BftdentXEtGbugJw.m_2303(9, 14, 22, f_9151));
                  Class_Ssh31B3ljfKeWsvS.m_4854(var12, var13, var10, var11, 1.0F, f_9152, Class_BftdentXEtGbugJw.m_2303(93, 184, 255, f_9153));
                  Class_Ssh31B3ljfKeWsvS.m_4851(var5.item().getDefaultInstance(), var12 + f_9154, var13 + f_9155, 1.0F, false);
                  Class_Ssh31B3ljfKeWsvS.m_4866(
                     Class_y1y6QpONhWEUIdEB.m_9588(), var9, var12 + f_9156, var13 + f_9157, 12, Class_BftdentXEtGbugJw.m_2303(232, 246, 255, f_9158)
                  );
               }
            }
         }
      }
   }

   private void m_3140() {
      if (this.f_9114 != -1 && this.f_9115 != -1) {
         f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, this.f_9114, this.f_9115, ContainerInput.SWAP, f_11537.player);
         if (f_11537.gui.screen() == null) {
            f_11537.player.connection.send(new ServerboundContainerClosePacket(f_11537.player.containerMenu.containerId));
         }
      }

      this.m_3128();
   }

   public List<Class_PlAkZAQgfIOFZi5F> m_3141() {
      return List.of(
         new Class_PlAkZAQgfIOFZi5F(Items.FIRE_CHARGE, this.f_9100.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.NETHER_STAR, this.f_9101.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.PRISMARINE_SHARD, this.f_9102.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.POPPED_CHORUS_FRUIT, this.f_9103.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.SNOWBALL, this.f_9104.m_8768()),
         new Class_PlAkZAQgfIOFZi5F(Items.SHULKER_BOX, this.f_9105.m_8768())
      );
   }

   private void m_3142(HolyWorldHelper.i2bLwhBEi5HI6cmT var1) {
      if (!this.f_9109.stream().anyMatch(var1x -> var1x.item() == var1.item() && var1x.position().distanceToSqr(var1.position()) < f_9162)) {
         this.f_9109.add(new Class_RZNlHP6UMh7nkSP8(var1.item(), var1.position(), this.m_3130(), this.m_3135(), System.currentTimeMillis() + var1.duration()));
      }
   }

   private void m_3143(Class_B6JOzHnwhU3pe4AO var1) {
      if (var1.m_2116() == 1 && var1.m_2117() >= 0 && f_11537.gui.screen() == null && this.m_3134() && this.f_9112 == HolyWorldHelper.hVDindftTeKTtA2A.IDLE) {
         Item var2 = this.m_3145(var1.m_2117());
         if (var2 != null && this.m_3132(var2) != -1) {
            this.f_9113 = var2;
            this.f_9112 = HolyWorldHelper.hVDindftTeKTtA2A.USE;
         }
      }
   }

   private void m_3144(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.f_9107.m_8768() && f_11537.level != null) {
         ArrayList var2 = new ArrayList();
         String var3 = this.m_3130();
         int var4 = this.m_3135();

         for (Class_RZNlHP6UMh7nkSP8 var6 : this.f_9109) {
            if (var6.item() == Items.NETHER_STAR && var6.world().equals(var3) && (var6.anarchy() < 0 || var4 < 0 || var6.anarchy() == var4)) {
               var2.add(var6.position());
            }
         }

         this.f_9110.m_7649(var1, var2);
      }
   }

   private Item m_3145(int var1) {
      if (this.m_3136(this.f_9100, var1)) {
         return Items.FIRE_CHARGE;
      } else if (this.m_3136(this.f_9101, var1)) {
         return Items.NETHER_STAR;
      } else if (this.m_3136(this.f_9102, var1)) {
         return Items.PRISMARINE_SHARD;
      } else if (this.m_3136(this.f_9103, var1)) {
         return Items.POPPED_CHORUS_FRUIT;
      } else if (this.m_3136(this.f_9104, var1)) {
         return Items.SNOWBALL;
      } else {
         return this.m_3136(this.f_9105, var1) ? Items.SHULKER_BOX : null;
      }
   }

   private enum hVDindftTeKTtA2A {
      IDLE,
      USE,
      RESTORE;
   }

   private record i2bLwhBEi5HI6cmT(Item item, Vec3 position, long duration) {
   }
}
