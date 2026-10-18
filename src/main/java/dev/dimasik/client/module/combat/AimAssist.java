package dev.dimasik.client.module.combat;

import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_FghX3TD0v55wW2U2;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Wb2zlgDaESbnT0hQ;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_bhSc4OUnYWSe2vjL;
import dev.dimasik.client.system.Class_dpBlC70x4optBWBD;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;
import lombok.Generated;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public final class AimAssist extends Module {
   private final SliderSetting f_12844;
   private final SliderSetting f_12845;
   private final SliderSetting f_12846;
   private final MultiChoiceSetting f_12847;
   private final CheckboxSetting f_12848;
   private final CheckboxSetting f_12849;
   private final CheckboxSetting f_12850;
   private final CheckboxSetting f_12851;
   private final CheckboxSetting f_12852;
   private final CheckboxSetting f_12853;
   private final CheckboxSetting f_12854;
   private final CheckboxSetting f_12855;
   private final ColorSetting f_12856;
   private final AimAssist.AFoG55v6qNOQGGt7 f_12857;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_12858;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_12859;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_12860;
   private final Class_gEPk7yDw6CwIte87<Class_dpBlC70x4optBWBD> f_12861;
   private final Class_gEPk7yDw6CwIte87<Class_Wb2zlgDaESbnT0hQ> f_12862;
   private Player f_12863;
   private Vec3 f_12864;
   private boolean f_12865;
   private long f_12866;
   private float f_12867;
   private float f_12868;
   private static final String f_12869 = "AimAssist";
   private static final String f_12870 = "Агрессивно наводит прицел на ближайшего игрока в зоне захвата";
   private static final String f_12871 = "Дистанция";
   private static final float f_12872 = 8.0F;
   private static final float f_12873 = 16.0F;
   private static final float f_12874 = 0.5F;
   private static final String f_12875 = "FOV захвата";
   private static final float f_12876 = 90.0F;
   private static final float f_12877 = 5.0F;
   private static final float f_12878 = 180.0F;
   private static final String f_12879 = "Сила наводки";
   private static final float f_12880 = 60.0F;
   private static final float f_12881 = 5.0F;
   private static final float f_12882 = 180.0F;
   private static final String f_12883 = "Точка прицела";
   private static final String f_12884 = "Голова";
   private static final String f_12885 = "Тело";
   private static final String f_12886 = "Ноги";
   private static final String f_12887 = "Только при ЛКМ";
   private static final String f_12888 = "Игнорировать друзей";
   private static final String f_12889 = "Игнорировать ботов";
   private static final String f_12890 = "Сквозь стены";
   private static final String f_12891 = "Бокс цели";
   private static final String f_12892 = "Линия к цели";
   private static final String f_12893 = "Маркер";
   private static final String f_12894 = "ClientLook (камера)";
   private static final String f_12895 = "Цвет";
   private static final int f_12896 = -11486721;
   private static final double f_12897 = 1.0E-6;
   private static final float f_12898 = -90.0F;
   private static final float f_12899 = 90.0F;
   private static final double f_12900 = Double.MAX_VALUE;
   private static final double f_12901 = 1.0E-6;
   private static final String f_12902 = "Голова";
   private static final double f_12903 = 0.5;
   private static final double f_12904 = 0.5;
   private static final double f_12905 = 0.15;
   private static final String f_12906 = "Ноги";
   private static final double f_12907 = 0.5;
   private static final double f_12908 = 0.5;
   private static final double f_12909 = 0.1;
   private static final double f_12910 = 0.1;
   private static final double f_12911 = 1.0E-6;
   private static final float f_12912 = -90.0F;
   private static final float f_12913 = 90.0F;
   private static final float f_12914 = 1.0E-9F;
   private static final float f_12915 = 0.05F;
   private static final float f_12916 = 12.0F;
   private static final float f_12917 = -12.0F;
   private static final float f_12918 = -90.0F;
   private static final float f_12919 = 90.0F;

   private void m_4624(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_12848.m_8768() && !f_11537.options.keyAttack.isDown()) {
            this.f_12863 = null;
            this.m_4638();
         } else {
            Player var2 = this.m_4625();
            this.f_12863 = var2;
            if (var2 == null) {
               this.m_4638();
               this.f_12864 = null;
            } else {
               Vec3 var3 = this.m_4658(var2);
               this.f_12864 = var3;
               Vec3 var4 = f_11537.player.getEyePosition();
               Vec3 var5 = var3.subtract(var4);
               double var6 = Math.hypot(var5.x, var5.z);
               float var8 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
               float var9 = (float)(-Math.toDegrees(Math.atan2(var5.y, Math.max(var6, f_12897))));
               var9 = Mth.clamp(var9, f_12898, f_12899);
               this.f_12857.m_4623(var8, var9);
               this.f_12857.m_7466(var3);
               DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_12857, 1, 5);
            }
         }
      }
   }

   private Player m_4625() {
      float var1 = f_11537.player.getYRot();
      float var2 = f_11537.player.getXRot();
      Player var3 = null;
      double var4 = f_12900;

      for (Player var7 : f_11537.level.players()) {
         if (this.m_4652(var7)) {
            Vec3 var8 = this.m_4658(var7);
            Vec3 var9 = var8.subtract(f_11537.player.getEyePosition());
            double var10 = Math.hypot(var9.x, var9.z);
            float var12 = (float)Math.toDegrees(Math.atan2(-var9.x, var9.z));
            float var13 = (float)(-Math.toDegrees(Math.atan2(var9.y, Math.max(var10, f_12901))));
            float var14 = Mth.wrapDegrees(var12 - var1);
            float var15 = Mth.wrapDegrees(var13 - var2);
            double var16 = Math.hypot(var14, var15);
            if (!(var16 > this.f_12845.m_8768().floatValue()) && var16 < var4) {
               var4 = var16;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   @Generated
   public CheckboxSetting m_4626() {
      return this.f_12850;
   }

   public AimAssist() {
      super(f_12869, f_12870, Category.COMBAT);
      this.f_12844 = new SliderSetting(f_12871, f_12872, 1.0F, f_12873).m_828(f_12874);
      this.f_12845 = new SliderSetting(f_12875, f_12876, f_12877, f_12878).m_828(1.0F);
      this.f_12846 = new SliderSetting(f_12879, f_12880, f_12881, f_12882).m_828(1.0F);
      this.f_12847 = new MultiChoiceSetting(
         f_12883, new Class_2ZaVm8TGDJ68TnJB(f_12884), new Class_2ZaVm8TGDJ68TnJB(f_12885), new Class_2ZaVm8TGDJ68TnJB(f_12886)
      );
      this.f_12848 = new CheckboxSetting(f_12887, false);
      this.f_12849 = new CheckboxSetting(f_12888, true);
      this.f_12850 = new CheckboxSetting(f_12889, true);
      this.f_12851 = new CheckboxSetting(f_12890, true);
      this.f_12852 = new CheckboxSetting(f_12891, true);
      this.f_12853 = new CheckboxSetting(f_12892, true);
      this.f_12854 = new CheckboxSetting(f_12893, true);
      this.f_12855 = new CheckboxSetting(f_12894, true);
      this.f_12856 = new ColorSetting(f_12895, false, f_12896);
      this.f_12857 = new AimAssist.AFoG55v6qNOQGGt7();
      this.f_12858 = this::m_4624;
      this.f_12859 = this::m_4630;
      this.f_12860 = this::m_4637;
      this.f_12861 = this::m_4642;
      this.f_12862 = this::m_4647;
      this.m_795(
         this.f_12844,
         this.f_12845,
         this.f_12846,
         this.f_12847,
         this.f_12848,
         this.f_12849,
         this.f_12850,
         this.f_12851,
         this.f_12852,
         this.f_12853,
         this.f_12854,
         this.f_12855,
         this.f_12856
      );
   }

   @Generated
   public SliderSetting m_4627() {
      return this.f_12844;
   }

   @Generated
   public MultiChoiceSetting m_4628() {
      return this.f_12847;
   }

   @Generated
   public boolean m_4629() {
      return this.f_12865;
   }

   private void m_4630(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.m_776() && this.f_12863 != null && this.f_12864 != null) {
         int var2 = this.f_12856.m_8768();
         VertexConsumer var3 = var1.m_5008().m_881(Class_81oIJPtsDGdzRKcL.f_3816);
         if (this.f_12852.m_8768()) {
            AABB var4 = this.f_12863.getBoundingBox().inflate(f_12910);
            Class_bhSc4OUnYWSe2vjL.m_6087(var1.m_5006(), var3, var1.m_5010(), var4.minX, var4.minY, var4.minZ, var4.maxX, var4.maxY, var4.maxZ, var2);
         }

         if (this.f_12853.m_8768()) {
            Vec3 var5 = var1.m_5010();
            Class_bhSc4OUnYWSe2vjL.m_6090(
               var1.m_5006().last(),
               var3,
               (float)(var5.x - var5.x),
               (float)(var5.y - var5.y),
               (float)(var5.z - var5.z),
               (float)(this.f_12864.x - var5.x),
               (float)(this.f_12864.y - var5.y),
               (float)(this.f_12864.z - var5.z),
               var2
            );
         }
      }
   }

   @Generated
   public ColorSetting m_4631() {
      return this.f_12856;
   }

   @Generated
   public CheckboxSetting m_4632() {
      return this.f_12852;
   }

   private boolean m_4633() {
      return this.m_776() && this.f_12855.m_8768() && this.f_12863 != null && this.f_12864 != null
         ? !DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776()
         : false;
   }

   @Generated
   public SliderSetting m_4634() {
      return this.f_12846;
   }

   @Generated
   public float m_4635() {
      return this.f_12868;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_4636() {
      return this.f_12858;
   }

   private void m_4637(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.m_776() && this.f_12863 != null && this.f_12864 != null) {
         if (this.f_12854.m_8768()) {
            Vector2f var2 = Class_FvJXUGWpZo3zYBW4.m_2690(this.f_12864);
            if (var2 != null) {
               int var3 = this.f_12856.m_8768();
               int var4 = (int)var2.x;
               int var5 = (int)var2.y;
               var1.m_6083().fill(var4 - 3, var5 - 3, var4 + 3, var5 + 3, var3);
            }
         }
      }
   }

   private void m_4638() {
      DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_12857);
   }

   @Generated
   public long m_4639() {
      return this.f_12866;
   }

   @Generated
   public AimAssist.AFoG55v6qNOQGGt7 m_4640() {
      return this.f_12857;
   }

   @Generated
   public SliderSetting m_4641() {
      return this.f_12845;
   }

   private void m_4642(Class_dpBlC70x4optBWBD var1) {
      if (!this.m_4633()) {
         this.f_12865 = false;
         this.f_12866 = 0L;
      } else {
         float var2 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         Vec3 var3 = f_11537.player.getEyePosition(var2);
         Vec3 var4 = this.f_12864.subtract(var3);
         double var5 = Math.sqrt(var4.x * var4.x + var4.z * var4.z);
         float var7 = (float)Math.toDegrees(Math.atan2(-var4.x, var4.z));
         float var8 = (float)Math.toDegrees(-Math.atan2(var4.y, Math.max(var5, f_12911)));
         var8 = Mth.clamp(var8, f_12912, f_12913);
         long var9 = System.nanoTime();
         Class_FghX3TD0v55wW2U2 var11 = DimasikClient.m_9057().m_9052().m_6342();
         if (!this.f_12865) {
            this.f_12867 = f_11537.player.getYRot();
            this.f_12868 = f_11537.player.getXRot();
            this.f_12865 = true;
            this.f_12866 = var9;
         }

         float var12 = (float)(var9 - this.f_12866) * f_12914;
         this.f_12866 = var9;
         var12 = Mth.clamp(var12, 0.0F, f_12915);
         float var13 = f_12916;
         float var14 = 1.0F - (float)Math.exp(f_12917 * var12);
         this.f_12867 = this.f_12867 + Mth.wrapDegrees(var7 - this.f_12867) * var14;
         this.f_12868 = this.f_12868 + (var8 - this.f_12868) * var14;
         this.f_12868 = Mth.clamp(this.f_12868, f_12918, f_12919);
         var11.m_2663().set(this.f_12867, this.f_12868);
         var1.m_6349(this.f_12867);
         var1.m_6350(this.f_12868);
      }
   }

   @Generated
   public CheckboxSetting m_4643() {
      return this.f_12851;
   }

   @Generated
   public CheckboxSetting m_4644() {
      return this.f_12854;
   }

   @Generated
   public Player m_4645() {
      return this.f_12863;
   }

   @Generated
   public CheckboxSetting m_4646() {
      return this.f_12848;
   }

   @Override
   public void m_732() {
      this.f_12863 = null;
      this.f_12864 = null;
      this.f_12865 = false;
      this.f_12866 = 0L;
      this.m_4638();
   }

   private void m_4647(Class_Wb2zlgDaESbnT0hQ var1) {
      if (this.m_4633()) {
         var1.m_1582(true);
      }
   }

   @Generated
   public CheckboxSetting m_4648() {
      return this.f_12855;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Wb2zlgDaESbnT0hQ> m_4649() {
      return this.f_12862;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> m_4650() {
      return this.f_12860;
   }

   @Generated
   public float m_4651() {
      return this.f_12867;
   }

   private boolean m_4652(Player var1) {
      if (var1 != null && var1 != f_11537.player && var1.isAlive() && !var1.isSpectator()) {
         if (f_11537.player.distanceTo(var1) > this.f_12844.m_8768()) {
            return false;
         }

         if (!this.f_12851.m_8768() && !f_11537.player.hasLineOfSight(var1)) {
            return false;
         }

         DimasikClient var2 = DimasikClient.m_9057();
         return this.f_12849.m_8768() && var2.m_9049().m_2804().m_2877(var1.getGameProfile().name())
            ? false
            : !this.f_12850.m_8768() || !var2.m_9049().m_2801().m_3581().f_33163.contains(var1);
      } else {
         return false;
      }
   }

   @Generated
   public Vec3 m_4653() {
      return this.f_12864;
   }

   @Generated
   public CheckboxSetting m_4654() {
      return this.f_12853;
   }

   @Generated
   public CheckboxSetting m_4655() {
      return this.f_12849;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_dpBlC70x4optBWBD> m_4656() {
      return this.f_12861;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> m_4657() {
      return this.f_12859;
   }

   private Vec3 m_4658(Player var1) {
      AABB var2 = var1.getBoundingBox();
      if (this.f_12847.m_7568(f_12902)) {
         double var9 = (var2.minX + var2.maxX) * f_12903;
         double var10 = (var2.minZ + var2.maxZ) * f_12904;
         double var7 = var2.maxY - var1.getEyeHeight(var1.getPose()) * f_12905;
         return new Vec3(var9, var7, var10);
      } else if (this.f_12847.m_7568(f_12906)) {
         double var3 = (var2.minX + var2.maxX) * f_12907;
         double var5 = (var2.minZ + var2.maxZ) * f_12908;
         return new Vec3(var3, var2.minY + f_12909, var5);
      } else {
         return var2.getCenter();
      }
   }

   private final class AFoG55v6qNOQGGt7 extends Class_kkp256olqZ4F1qt3 {
      public final Vector2f f_12838 = new Vector2f();
      public static final float f_12840 = -90.0F;
      public static final float f_12841 = 90.0F;
      public static final float f_12842 = -90.0F;
      public static final float f_12843 = 90.0F;

      @Override
      public Vector2f m_1006(Vector2f var1, Vector2f var2) {
         return this.m_4622(var1, var2, AimAssist.this.f_12846.m_8768());
      }

      @Override
      public Vector2f m_4621(Vector2f var1, Vector2f var2) {
         return this.m_4622(var1, var2, AimAssist.this.f_12846.m_8768());
      }

      @Override
      public Vector2f m_1007() {
         return new Vector2f(this.f_12838);
      }

      public AFoG55v6qNOQGGt7() {
         super(Vec3.ZERO);
      }

      public Vector2f m_4622(Vector2f var1, Vector2f var2, float var3) {
         float var4 = Mth.wrapDegrees(var2.x - var1.x);
         float var5 = var2.y - var1.y;
         double var6 = Math.hypot(var4, var5);
         if (!(var6 <= var3) && var6 != 0.0) {
            float var8 = var3 / (float)var6;
            return new Vector2f(var1.x + var4 * var8, Mth.clamp(var1.y + var5 * var8, f_12842, f_12843));
         } else {
            return new Vector2f(var2.x, Mth.clamp(var2.y, f_12840, f_12841));
         }
      }

      public void m_4623(float var1, float var2) {
         this.f_12838.set(var1, var2);
      }
   }
}
