package dev.dimasik.client.module.render;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_MudbbdJ9NuNWUNPe;
import dev.dimasik.client.system.Class_smYfxG0Sb94s63Ts;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.player.Player;

public class Chams extends Module {
   public static final String f_36020 = "Кристалл";
   public static final String f_36021 = "Войд";
   public static final String f_36022 = "Обводка";
   public static final String f_36023 = "Гибрид";
   public static final String f_36024 = "По сцене";
   public static final String f_36025 = "Сквозь стены";
   private final ItemListSetting f_36026;
   private final MultiChoiceSetting f_36027;
   private final MultiChoiceSetting f_36028;
   private final CheckboxSetting f_36029;
   private final CheckboxSetting f_36030;
   private final SliderSetting f_36031;
   private final CheckboxSetting f_36032;
   private final ColorSetting f_36033;
   private final ColorSetting f_36034;
   private final SliderSetting f_36035;
   private final SliderSetting f_36036;
   private final SliderSetting f_36037;
   private final Map<Integer, Chams.gt3W9Zs0PHRd6zES> f_36038;
   private static final String f_36039 = "Chams";
   private static final String f_36040 = "Шейдерная заливка и обводка моделей";
   private static final String f_36041 = "Цели";
   private static final String f_36042 = "Игроков";
   private static final String f_36043 = "Друзей";
   private static final String f_36044 = "Мобов";
   private static final String f_36045 = "Себя";
   private static final String f_36046 = "Невидимых";
   private static final String f_36047 = "Режим";
   private static final String f_36048 = "Кристалл";
   private static final String f_36049 = "Войд";
   private static final String f_36050 = "Обводка";
   private static final String f_36051 = "Глубина";
   private static final String f_36052 = "Гибрид";
   private static final String f_36053 = "По сцене";
   private static final String f_36054 = "Сквозь стены";
   private static final String f_36055 = "Скрывать броню и предметы";
   private static final String f_36056 = "Скрывать ванильную тень";
   private static final String f_36057 = "Дистанция";
   private static final float f_36058 = 96.0F;
   private static final float f_36059 = 8.0F;
   private static final float f_36060 = 256.0F;
   private static final String f_36061 = "Авто цвет под тему";
   private static final String f_36062 = "Верхний акцент";
   private static final int f_36063 = -14757377;
   private static final String f_36064 = "Нижний акцент";
   private static final int f_36065 = -3068161;
   private static final String f_36066 = "Интенсивность";
   private static final float f_36067 = 1.35F;
   private static final float f_36068 = 0.35F;
   private static final float f_36069 = 3.0F;
   private static final float f_36070 = 0.05F;
   private static final String f_36071 = "Прозрачность";
   private static final float f_36072 = 0.25F;
   private static final float f_36073 = 0.01F;
   private static final String f_36074 = "Преломление";
   private static final float f_36075 = 0.72F;
   private static final float f_36076 = 0.35F;
   private static final float f_36077 = 1.15F;
   private static final float f_36078 = 0.01F;
   private static final float f_36079 = 0.001F;
   private static final float f_36080 = 0.001F;
   private static final float f_36081 = 0.001F;
   private static final float f_36082 = 1.0E9F;
   private static final float f_36083 = 0.05F;
   private static final float f_36084 = 42.0F;
   private static final float f_36085 = -13.0F;
   private static final float f_36086 = 1.12F;
   private static final float f_36087 = 1.12F;
   private static final float f_36088 = -0.22F;
   private static final float f_36089 = 0.001F;
   private static final float f_36090 = 0.001F;
   private static final float f_36091 = 0.001F;
   private static final String f_36092 = "Войд";
   private static final String f_36093 = "Обводка";
   private static final String f_36094 = "Void";
   private static final String f_36095 = "Войд";
   private static final String f_36096 = "Crystal";
   private static final String f_36097 = "Кристалл";
   private static final String f_36098 = "Гибрид";
   private static final String f_36099 = "По сцене";
   private static final String f_36100 = "Невидимых";
   private static final String f_36101 = "Мобов";
   private static final String f_36102 = "Себя";
   private static final String f_36103 = "Друзей";
   private static final String f_36104 = "Игроков";
   private static final int f_36105 = Integer.MIN_VALUE;
   private static final float f_36106 = 8.0F;
   private static final float f_36107 = 8.0F;
   private static final float f_36108 = 8.0F;
   private static final String f_36109 = "Обводка";

   public boolean m_9782() {
      Iterator var1 = this.f_36038.entrySet().iterator();

      while (var1.hasNext()) {
         Chams.gt3W9Zs0PHRd6zES var2 = (Chams.gt3W9Zs0PHRd6zES)((Entry)var1.next()).getValue();
         if (var2.f_36017 > f_36090 || Math.abs(var2.f_36018) > f_36091) {
            return true;
         }

         var1.remove();
      }

      return false;
   }

   public float m_9783() {
      return this.f_36036.m_8768();
   }

   private boolean m_9784(LivingEntityRenderState var1) {
      if (!this.m_776() || var1 == null || f_11537.level == null) {
         return false;
      } else if (var1.isInvisible && !this.f_36026.m_7145(f_36100)) {
         return false;
      } else {
         float var2 = Math.max(1.0F, this.f_36031.m_8768());
         if (var1.distanceToCameraSq > var2 * var2) {
            return false;
         } else {
            return var1 instanceof AvatarRenderState var3 ? this.m_9794(var3) : this.f_36026.m_7145(f_36101);
         }
      }
   }

   public Chams() {
      super(f_36039, f_36040, Category.RENDER);
      this.f_36026 = new ItemListSetting(
         f_36041,
         new Class_2ZaVm8TGDJ68TnJB(f_36042, true),
         new Class_2ZaVm8TGDJ68TnJB(f_36043, true),
         new Class_2ZaVm8TGDJ68TnJB(f_36044, true),
         new Class_2ZaVm8TGDJ68TnJB(f_36045, false),
         new Class_2ZaVm8TGDJ68TnJB(f_36046, true)
      );
      this.f_36027 = new MultiChoiceSetting(
         f_36047, new Class_2ZaVm8TGDJ68TnJB(f_36048), new Class_2ZaVm8TGDJ68TnJB(f_36049), new Class_2ZaVm8TGDJ68TnJB(f_36050)
      );
      this.f_36028 = new MultiChoiceSetting(
         f_36051, new Class_2ZaVm8TGDJ68TnJB(f_36052), new Class_2ZaVm8TGDJ68TnJB(f_36053), new Class_2ZaVm8TGDJ68TnJB(f_36054)
      );
      this.f_36029 = new CheckboxSetting(f_36055, true);
      this.f_36030 = new CheckboxSetting(f_36056, true);
      this.f_36031 = new SliderSetting(f_36057, f_36058, f_36059, f_36060).m_828(1.0F);
      this.f_36032 = new CheckboxSetting(f_36061, true);
      this.f_36033 = new ColorSetting(f_36062, false, f_36063).m_822(() -> !this.f_36032.m_8768());
      this.f_36034 = new ColorSetting(f_36064, false, f_36065).m_822(() -> !this.f_36032.m_8768());
      this.f_36035 = new SliderSetting(f_36066, f_36067, f_36068, f_36069).m_828(f_36070);
      this.f_36036 = new SliderSetting(f_36071, 1.0F, f_36072, 1.0F).m_828(f_36073);
      this.f_36037 = new SliderSetting(f_36074, f_36075, f_36076, f_36077).m_828(f_36078).m_822(() -> !this.f_36027.m_7568(f_36109));
      this.f_36038 = new ConcurrentHashMap<>();
      this.m_795(
         this.f_36026,
         this.f_36027,
         this.f_36028,
         this.f_36029,
         this.f_36030,
         this.f_36031,
         this.f_36032,
         this.f_36033,
         this.f_36034,
         this.f_36035,
         this.f_36036,
         this.f_36037
      );
      Class_MudbbdJ9NuNWUNPe.m_3973();
   }

   public boolean m_9785() {
      return this.f_36028.m_7568(f_36098);
   }

   public float m_9786() {
      return this.f_36035.m_8768();
   }

   public static Chams m_9787() {
      Chams var0 = m_9789();
      return var0 != null && (var0.m_776() || var0.m_9782()) ? var0 : null;
   }

   public boolean m_9788() {
      return this.f_36028.m_7568(f_36099);
   }

   public static Chams m_9789() {
      return DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null
         ? DimasikClient.m_9057().m_9049().m_2801().m_3489()
         : null;
   }

   public float[] m_9790() {
      return m_9803(this.f_36032.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_36033.m_8768());
   }

   public boolean m_9791(LivingEntityRenderState var1) {
      return this.f_36030.m_8768() && this.m_9798(var1) > f_36081;
   }

   public static int m_9792(LivingEntityRenderState var0) {
      return var0 instanceof AvatarRenderState var1 ? var1.id : ((Class_smYfxG0Sb94s63Ts)var0).dimasik$getEntityId();
   }

   public int m_9793() {
      this.m_9796();
      if (this.f_36027.m_7568(f_36092)) {
         return 1;
      } else {
         return this.f_36027.m_7568(f_36093) ? 2 : 0;
      }
   }

   private boolean m_9794(AvatarRenderState var1) {
      int var2 = m_9792(var1);
      LocalPlayer var3 = f_11537.player;
      if (var3 != null && var2 == var3.getId()) {
         return f_11537.options.getCameraType().isFirstPerson() && f_11537.getCameraEntity() == var3 ? false : this.f_36026.m_7145(f_36102);
      }

      if ((f_11537.level == null ? null : f_11537.level.getEntity(var2)) instanceof Player var5) {
         if (DimasikClient.m_9057().m_9049().m_2801().m_3581().f_33163.contains(var5)) {
            return false;
         }

         if (this.m_9804(var5)) {
            return this.f_36026.m_7145(f_36103);
         }
      }

      return this.f_36026.m_7145(f_36104);
   }

   public float m_9795() {
      return this.f_36037.m_8768();
   }

   private void m_9796() {
      String var1 = this.f_36027.m_7566();
      if (var1 != null) {
         if (f_36094.equals(var1)) {
            this.f_36027.m_1766(f_36095);
         } else if (f_36096.equals(var1)) {
            this.f_36027.m_1766(f_36097);
         }
      }
   }

   public float m_9798(LivingEntityRenderState var1) {
      if (var1 == null) {
         return 0.0F;
      }

      this.m_9796();
      int var2 = m_9805(var1);
      boolean var3 = this.m_9784(var1);
      Chams.gt3W9Zs0PHRd6zES var4 = this.f_36038.get(var2);
      if (var4 == null && !var3) {
         return 0.0F;
      }

      if (var4 == null) {
         var4 = new Chams.gt3W9Zs0PHRd6zES();
         var4.f_36017 = var3 ? 1.0F : 0.0F;
         this.f_36038.put(var2, var4);
      }

      long var5 = System.nanoTime();
      float var7 = var4.f_36019 == 0L ? 0.0F : Math.min((float)(var5 - var4.f_36019) / f_36082, f_36083);
      var4.f_36019 = var5;
      float var8 = var3 ? 1.0F : 0.0F;
      float var9 = var8 - var4.f_36017;
      var4.f_36018 = var4.f_36018 + var9 * f_36084 * var7;
      var4.f_36018 = var4.f_36018 * (float)Math.exp(f_36085 * var7);
      var4.f_36017 = var4.f_36017 + var4.f_36018 * var7;
      if (var4.f_36017 < 0.0F) {
         var4.f_36017 = 0.0F;
         var4.f_36018 = 0.0F;
      } else if (var4.f_36017 > f_36086) {
         var4.f_36017 = f_36087;
         var4.f_36018 = var4.f_36018 * f_36088;
      }

      if (!var3 && var4.f_36017 <= f_36089) {
         this.f_36038.remove(var2);
         return 0.0F;
      } else {
         return var4.f_36017;
      }
   }

   public boolean m_9799(LivingEntityRenderState var1) {
      return this.f_36029.m_8768() && this.m_9798(var1) > f_36080;
   }

   public boolean m_9800(LivingEntityRenderState var1) {
      return this.m_9798(var1) > f_36079;
   }

   public float[] m_9802() {
      return m_9803(this.f_36032.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) : this.f_36034.m_8768());
   }

   @Override
   public void m_732() {
      Class_MudbbdJ9NuNWUNPe.m_3972();
   }

   private static float[] m_9803(int var0) {
      float[] var1 = Class_BftdentXEtGbugJw.m_2301(var0);
      return new float[]{var1[0], var1[1], var1[2], var1[3] <= 0.0F ? 1.0F : var1[3]};
   }

   private boolean m_9804(Player var1) {
      return var1.getGameProfile() != null && var1.getGameProfile().name() != null
         ? DimasikClient.m_9057().m_9049().m_2804().m_2877(var1.getGameProfile().name())
         : false;
   }

   private static int m_9805(LivingEntityRenderState var0) {
      int var1 = m_9792(var0);
      if (var1 != f_36105) {
         return var1;
      }

      int var2 = var0.entityType == null ? 0 : var0.entityType.hashCode();
      int var3 = Math.round((float)var0.x * f_36106);
      int var4 = Math.round((float)var0.y * f_36107);
      int var5 = Math.round((float)var0.z * f_36108);
      int var6 = var2 * 31 + var3;
      var6 = var6 * 31 + var4;
      return var6 * 31 + var5;
   }

   private static final class gt3W9Zs0PHRd6zES {
      public float f_36017;
      public float f_36018;
      public long f_36019;

      public gt3W9Zs0PHRd6zES() {
      }
   }
}
