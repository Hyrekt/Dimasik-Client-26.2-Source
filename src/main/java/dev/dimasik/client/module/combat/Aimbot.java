package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ClientManagerRegistry;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_FyutImIC8oFoGKuH;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_R2mRAo33yUF0EkU2;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import dev.dimasik.client.system.Class_qT3a68ZR9cAz3wbe;
import dev.dimasik.client.system.Class_sS4M8u1p9l0dNe0C;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import dev.dimasik.mixin.FireworkRocketEntityMixin_2;
import java.util.HashMap;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.joml.Vector2f;
import org.joml.Vector4i;

public final class Aimbot extends Module {
   private final Class_qT3a68ZR9cAz3wbe f_31893 = new Class_qT3a68ZR9cAz3wbe();
   private final Class_R2mRAo33yUF0EkU2 f_31894 = new Class_R2mRAo33yUF0EkU2();
   private final Aimbot.JtJGdCvIuMoXK83T f_31895 = new Aimbot.JtJGdCvIuMoXK83T();
   private Class_R2mRAo33yUF0EkU2.xEuDTaYr9Z93f47d f_31896;
   private Aimbot.Class_4RpvOj1jcIM7TtGV f_31897;
   private ClientLevel f_31898;
   private Player f_31899;
   private int f_31900 = -1;
   private int f_31901 = -1;
   private boolean f_31902;
   private Player f_31903;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_31904 = this::m_8896;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_31905 = this::m_8892;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_31906 = new Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr>() {
      @Override
      public int m_1780() {
         return -120;
      }

      public void m_1781(Class_jfpiTZhNIuwDwqKr var1) {
         Aimbot.this.m_8900(var1);
      }
   };
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco> f_31907 = new Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco>(
      
   ) {
      public void m_1781(Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco var1) {
         if (Aimbot.this.f_31902) {
            Aimbot.this.m_8894();
         }
      }

      @Override
      public int m_1780() {
         return 100;
      }
   };
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_31908 = this::m_8890;
   private static final String f_31909 = "Aimbot";
   private static final String f_31910 = "Автоматически наводится на энтити при спуске стрелы";
   private static final double f_31911 = -0.1;
   private static final double f_31912 = -0.1;
   private static final double f_31913 = 0.1;
   private static final double f_31914 = 0.3;
   private static final double f_31915 = 256.0;
   private static final double f_31916 = 0.91F;
   private static final double f_31917 = 0.98F;
   private static final double f_31918 = 50.0;
   private static final double f_31919 = 6.0;
   private static final double f_31920 = 4.0;
   private static final double f_31921 = 1024.0;
   private static final double f_31922 = 1024.0;
   private static final float f_31923 = 0.1F;
   private static final float f_31924 = 3.0F;
   private static final float f_31925 = 16.0F;
   private static final float f_31926 = 16.0F;
   private static final float f_31927 = 32.0F;
   private static final float f_31928 = 32.0F;
   private static final String f_31929 = "dimasik";
   private static final String f_31930 = "textures/world/cube.png";

   private Player m_8889(Player var1) {
      if (this.m_8904(var1)) {
         return var1;
      }

      Player var2 = null;
      double var3 = f_31921;

      for (Player var6 : f_11537.level.players()) {
         if (this.m_8904(var6)) {
            double var7 = f_11537.player.distanceToSqr(var6);
            if (var7 < var3 || var7 == var3 && (var2 == null || var6.getId() < var2.getId())) {
               var2 = var6;
               var3 = var7;
            }
         }
      }

      if (var2 != var1) {
         this.f_31893.m_8333();
      }

      return var2;
   }

   private void m_8890(Class_bhRaN0YSSLQRYjPo var1) {
      if (!this.m_8893() && this.f_31896 != null && this.f_31903 != null && (this.m_8905() || this.f_31897 != null)) {
         Vector2f var2 = Class_FvJXUGWpZo3zYBW4.m_2690(this.f_31896.targetPosition());
         if (var2 != null) {
            Class_Ssh31B3ljfKeWsvS.m_4804(
               var2.x - f_31925,
               var2.y - f_31926,
               f_31927,
               f_31928,
               0.0F,
               new Vector4i(
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN),
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO),
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO)
               ),
               Identifier.fromNamespaceAndPath(f_31929, f_31930)
            );
         }
      }
   }

   private double m_8891() {
      if (f_11537.getConnection() == null) {
         return 0.0;
      }

      PlayerInfo var1 = f_11537.getConnection().getPlayerInfo(f_11537.player.getUUID());
      return var1 == null ? 0.0 : Math.clamp(var1.getLatency() / f_31918, 0.0, f_31919);
   }

   private void m_8892(Class_lTzchJDbvRVrnXlw var1) {
      if (!var1.m_1581()) {
         if (var1.m_7532() instanceof ServerboundPlayerActionPacket || var1.m_7532() instanceof ServerboundSetCarriedItemPacket) {
            this.m_8902();
            if (this.f_31897 != null && var1.m_7532() instanceof ServerboundSetCarriedItemPacket) {
               this.m_8894();
            }

            if (var1.m_7532() instanceof ServerboundPlayerActionPacket var2
               && var2.getAction() == Action.RELEASE_USE_ITEM
               && this.m_8905()
               && !this.m_8893()
               && this.f_31897 == null) {
               this.f_31903 = this.m_8889(this.f_31903);
               int var4 = f_11537.player.getTicksUsingItem();
               if (this.m_8899(this.f_31903, m_8909(var4), f_11537.player.getEyePosition().add(0.0, f_31912, 0.0), f_11537.player.onGround())) {
                  this.f_31897 = new Aimbot.Class_4RpvOj1jcIM7TtGV(
                     var2,
                     f_11537.level,
                     f_11537.player,
                     f_11537.player.getUsedItemHand(),
                     var4,
                     f_11537.player.tickCount,
                     f_11537.player.getYRot(),
                     f_11537.player.getXRot()
                  );
                  this.f_31902 = false;
                  var1.m_1582(true);
                  this.f_31895.m_8887(this.f_31896);
                  DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_31895, 2, 45);
               }
            }
         }
      }
   }

   private boolean m_8893() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3590().m_776();
   }

   private void m_8894() {
      Aimbot.Class_4RpvOj1jcIM7TtGV var1 = this.f_31897;
      boolean var2 = this.m_8901();
      this.f_31897 = null;
      this.f_31902 = false;

      try {
         if (var2) {
            this.f_31901 = f_11537.player.tickCount;
            Class_3LQSDrJ0WJYOQ7ck.m_1293(var1.packet());
         }
      } finally {
         this.m_8903();
      }
   }

   public boolean m_8895() {
      return this.m_776()
         && f_11537.player != null
         && this.f_31898 == f_11537.level
         && this.f_31899 == f_11537.player
         && (this.f_31897 != null || this.f_31901 == f_11537.player.tickCount);
   }

   private void m_8896(Class_Xu9btcIeUN33XnMK var1) {
      this.m_8902();
      if (f_11537.player != null && f_11537.level != null) {
         this.f_31900 = f_11537.player.tickCount;
         if (this.f_31897 == null) {
            if (!this.m_8893() && this.m_8905()) {
               this.f_31903 = this.m_8889(this.f_31903);
               this.m_8899(
                  this.f_31903, m_8909(f_11537.player.getTicksUsingItem()), f_11537.player.getEyePosition().add(0.0, f_31911, 0.0), f_11537.player.onGround()
               );
            } else {
               this.m_8908();
            }
         } else {
            if (this.m_8893() || f_11537.player.tickCount - this.f_31897.tick() > 2) {
               this.m_8894();
            }
         }
      }
   }

   @Generated
   public Player m_8898() {
      return this.f_31903;
   }

   private boolean m_8899(Player var1, double var2, Vec3 var4, boolean var5) {
      this.f_31896 = null;
      if (this.m_8904(var1) && !(var2 < f_31914)) {
         Vec3 var6 = var1.getPositionCodec().getBase();
         if (var6.distanceToSqr(var1.position()) > f_31915) {
            var6 = var1.position();
         }

         float var7 = var1.getInterpolation().yRot();
         float var8 = var1.getInterpolation().xRot();
         Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ var9 = this.f_31893.m_8332(var1.getId(), f_11537.player.tickCount, var6, var1.getKnownMovement(), var7, var8);
         double var10 = this.m_8891() + var9.age();
         AABB var12 = var1.getBoundingBox().move(var9.position().subtract(var1.position()));
         MobEffectInstance var13 = var1.getEffect(MobEffects.LEVITATION);
         Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk var14 = new Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk(
            var1.onGround(),
            var1.isFallFlying(),
            var1.getAbilities().flying,
            var1.isInWater() || var1.isInLava(),
            var1.onClimbable(),
            var1.hasEffect(MobEffects.SLOW_FALLING),
            var13 == null ? -1 : var13.getAmplifier(),
            this.m_8906(var1),
            var1.isNoGravity() ? 0.0 : var1.getGravity(),
            f_31916,
            f_31917,
            var1.maxUpStep(),
            var7,
            var8
         );
         List var15 = Class_FyutImIC8oFoGKuH.m_2705(
            var12,
            var9,
            var14,
            64 + (int)Math.ceil(var10) + 1,
            (var1x, var2x) -> Entity.collideBoundingBox(var1, var2x, var1x, f_11537.level, List.of()),
            Class_sS4M8u1p9l0dNe0C::m_8705
         );
         Vec3 var16 = f_11537.player.getKnownMovement();
         Vec3 var17 = new Vec3(var16.x, var5 ? 0.0 : var16.y, var16.z);
         final HashMap<BlockPos, Boolean> var18 = new HashMap<>();
         Class_R2mRAo33yUF0EkU2.t94dxH1KOKhexedX var19 = new Class_R2mRAo33yUF0EkU2.t94dxH1KOKhexedX() {
            @Override
            public double m_4477(Vec3 var1, Vec3 var2x) {
               BlockHitResult var3 = Class_NzJrN63M7QBpmAbi.f_11537
                  .level
                  .clipIncludingBorder(new ClipContext(var1, var2x, Block.COLLIDER, Fluid.NONE, Class_NzJrN63M7QBpmAbi.f_11537.player));
               return var3.getType() == Type.MISS ? Double.POSITIVE_INFINITY : var1.distanceTo(var3.getLocation());
            }

            @Override
            public boolean m_4478(Vec3 var1) {
               BlockPos var2x = BlockPos.containing(var1);
               return var18.computeIfAbsent(var2x, var0 -> Class_NzJrN63M7QBpmAbi.f_11537.level.getFluidState(var0).is(FluidTags.WATER));
            }
         };
         this.f_31896 = this.f_31894.m_4484(var4, var17, var2, var3 -> Class_FyutImIC8oFoGKuH.m_2703(var15, var10 + var3), var19);
         return this.f_31896 != null;
      } else {
         return false;
      }
   }

   private void m_8900(Class_jfpiTZhNIuwDwqKr var1) {
      if (this.f_31897 != null && !var1.m_1581()) {
         if (!this.m_8901()) {
            this.f_31897 = null;
            this.f_31902 = false;
            this.m_8903();
         } else {
            this.f_31902 = true;
            var1.m_7395(this.f_31897.originalYaw());
            var1.m_7400(this.f_31897.originalPitch());
            if (!this.m_8893() && f_11537.player.getItemInHand(this.f_31897.hand()).is(Items.BOW)) {
               int var2 = Math.max(0, f_11537.player.tickCount - this.f_31897.tick());
               Vec3 var3 = var1.m_7399().add(0.0, f_11537.player.getEyeHeight() - f_31913, 0.0);
               if (this.m_8899(this.f_31903, m_8909(this.f_31897.drawTicks() + var2), var3, var1.m_7394())) {
                  this.f_31895.m_8887(this.f_31896);
                  DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_31895, 2, 45);
                  var1.m_7395(this.f_31896.yaw());
                  var1.m_7400(this.f_31896.pitch());
               }
            }
         }
      }
   }

   @Override
   public void m_778() {
      this.f_31898 = f_11537.level;
      this.f_31899 = f_11537.player;
      this.f_31900 = f_11537.player == null ? -1 : f_11537.player.tickCount;
      this.f_31897 = null;
      this.f_31902 = false;
      this.f_31901 = -1;
      this.m_8908();
   }

   private boolean m_8901() {
      return this.f_31897 != null && this.f_31897.world() == f_11537.level && this.f_31897.shooter() == f_11537.player && f_11537.getConnection() != null;
   }

   private void m_8902() {
      if (this.f_31898 != f_11537.level || this.f_31899 != f_11537.player || f_11537.player != null && f_11537.player.tickCount < this.f_31900) {
         this.f_31897 = null;
         this.f_31902 = false;
         this.f_31901 = -1;
         this.m_8908();
         this.m_8903();
         this.f_31898 = f_11537.level;
         this.f_31899 = f_11537.player;
         this.f_31900 = f_11537.player == null ? -1 : f_11537.player.tickCount;
      }
   }

   private void m_8903() {
      DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_31895);
      DimasikClient.m_9057().m_9052().m_6342().m_2662(this.f_31895);
   }

   private boolean m_8904(Player var1) {
      if (f_11537.player != null
         && f_11537.level != null
         && var1 != null
         && var1 != f_11537.player
         && var1.level() == f_11537.level
         && var1.isAlive()
         && !var1.isRemoved()
         && !var1.isSpectator()
         && !(f_11537.player.distanceToSqr(var1) > f_31922)) {
         ClientManagerRegistry var2 = DimasikClient.m_9057().m_9049();
         return !var2.m_2804().m_2877(var1.getGameProfile().name()) && !var2.m_2801().m_3581().f_33163.contains(var1);
      } else {
         return false;
      }
   }

   @Override
   public void m_732() {
      this.m_8894();
      this.m_8908();
   }

   private boolean m_8905() {
      return f_11537.player != null && f_11537.level != null && f_11537.player.isUsingItem() && f_11537.player.getUseItem().is(Items.BOW);
   }

   private boolean m_8906(Player var1) {
      if (!var1.isFallFlying()) {
         return false;
      }

      for (FireworkRocketEntity var3 : f_11537.level.getEntitiesOfClass(FireworkRocketEntity.class, var1.getBoundingBox().inflate(f_31920), Entity::isAlive)) {
         if (((FireworkRocketEntityMixin_2)var3).dimasik$getAttachedEntity() == var1) {
            return true;
         }
      }

      return false;
   }

   private void m_8908() {
      this.f_31903 = null;
      this.f_31896 = null;
      this.f_31893.m_8333();
   }

   private static double m_8909(int var0) {
      float var1 = BowItem.getPowerForTime(var0);
      return var1 < f_31923 ? 0.0 : var1 * f_31924;
   }

   public Aimbot() {
      super(f_31909, f_31910, Category.COMBAT);
   }

   private record Class_4RpvOj1jcIM7TtGV(
      ServerboundPlayerActionPacket packet,
      ClientLevel world,
      Player shooter,
      InteractionHand hand,
      int drawTicks,
      int tick,
      float originalYaw,
      float originalPitch
   ) {
   }

   private static final class JtJGdCvIuMoXK83T extends Class_kkp256olqZ4F1qt3 {
      public final Vector2f f_31889 = new Vector2f();

      @Override
      public Vector2f m_1006(Vector2f var1, Vector2f var2) {
         return new Vector2f(var2);
      }

      public void m_8887(Class_R2mRAo33yUF0EkU2.xEuDTaYr9Z93f47d var1) {
         this.f_31889.set(var1.yaw(), var1.pitch());
         this.m_7466(var1.targetPosition());
      }

      public JtJGdCvIuMoXK83T() {
         super(Vec3.ZERO);
      }

      @Override
      public Vector2f m_1007() {
         return this.f_31889;
      }
   }
}
