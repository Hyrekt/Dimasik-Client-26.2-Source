package dev.dimasik.client.module.misc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_g3Fg4YmMuzK7loFX;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class KillMessage extends Module {
   private static final long f_14520 = 3000L;
   private final CheckboxSetting f_14521;
   private final CheckboxSetting f_14522;
   private final CheckboxSetting f_14523;
   private final List<String> f_14524;
   private final List<String> f_14525;
   private final List<KillMessage.ztsH4WdLc1KDYXKF> f_14526;
   public LivingEntity f_14527;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_14528;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_14529;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_14530;
   private static final String f_14531 = "KillMessage";
   private static final String f_14532 = "Пишет кастомные сообщения после убийства и сноса тотема";
   private static final String f_14533 = "Писать в глобал";
   private static final String f_14534 = "Сообщения убийств";
   private static final String f_14535 = "Сообщения тотема";
   private static final long f_14536 = 300L;
   private static final String f_14537 = "!";
   private static final String f_14538 = "!";
   private static final String f_14539 = "{name}";
   private static final String f_14540 = "{nick}";
   private static final String f_14541 = "%name%";
   private static final String f_14542 = "{name}";
   private static final String f_14543 = "{nick}";
   private static final String f_14544 = "%name%";
   private static final String f_14545 = "Settings";
   private static final String f_14546 = "Settings";
   private static final String f_14547 = "KillMessages";
   private static final String f_14548 = "TotemMessages";
   private static final String f_14549 = "Settings";
   private static final String f_14550 = "Settings";
   private static final String f_14551 = "Settings";
   private static final String f_14552 = "KillMessages";
   private static final String f_14553 = "KillMessages";
   private static final String f_14554 = "KillMessages";
   private static final String f_14555 = "TotemMessages";
   private static final String f_14556 = "TotemMessages";
   private static final String f_14557 = "TotemMessages";

   private boolean m_5105(String var1) {
      return var1.contains(f_14539) || var1.contains(f_14540) || var1.contains(f_14541);
   }

   public boolean m_5106(int var1) {
      if (var1 >= 0 && var1 < this.f_14525.size()) {
         this.f_14525.remove(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean m_5109(int var1) {
      if (var1 >= 0 && var1 < this.f_14524.size()) {
         this.f_14524.remove(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean m_5110(String var1) {
      return this.f_14525.removeIf(var1x -> var1x.equalsIgnoreCase(var1.trim()));
   }

   private String m_5111(String var1, String var2) {
      return var1.replace(f_14542, var2).replace(f_14543, var2).replace(f_14544, var2);
   }

   @Generated
   public List<String> m_5112() {
      return this.f_14525;
   }

   public KillMessage() {
      super(f_14531, f_14532, Category.MISC);
      this.f_14521 = new CheckboxSetting(f_14533, true);
      this.f_14522 = new CheckboxSetting(f_14534, true);
      this.f_14523 = new CheckboxSetting(f_14535, true);
      this.f_14524 = new ArrayList<>();
      this.f_14525 = new ArrayList<>();
      this.f_14526 = new ArrayList<>();
      this.f_14528 = this::m_5132;
      this.f_14529 = this::m_5135;
      this.f_14530 = this::m_5121;
      this.m_795(this.f_14521, this.f_14522, this.f_14523);
   }

   public boolean m_5113(String var1) {
      return this.f_14524.removeIf(var1x -> var1x.equalsIgnoreCase(var1.trim()));
   }

   @Generated
   public CheckboxSetting m_5114() {
      return this.f_14522;
   }

   @Generated
   public CheckboxSetting m_5115() {
      return this.f_14521;
   }

   @Override
   public void m_732() {
      this.f_14526.clear();
   }

   private void m_5116(LivingEntity var1) {
      KillMessage.ztsH4WdLc1KDYXKF var2 = this.m_5122(var1);
      if (var2 != null && var2.f_14516 && !var2.f_14517) {
         var2.f_14517 = true;
         if (!this.f_14524.isEmpty()) {
            String var3 = this.m_5131(this.f_14524);
            String var4 = var1.getName().getString();
            Class_ftHu9o3WzCU3Adxm.m_6723(this.m_5141(this.m_5120(var3, var4)));
         }
      }
   }

   @Generated
   public CheckboxSetting m_5117() {
      return this.f_14523;
   }

   @Generated
   public List<String> m_5118() {
      return this.f_14524;
   }

   public boolean m_5119(String var1) {
      String var2 = this.m_5126(var1);
      return var2 != null && !this.f_14524.contains(var2) ? this.f_14524.add(var2) : false;
   }

   private String m_5120(String var1, String var2) {
      String var3 = this.m_5111(var1, var2);
      return this.m_5105(var1) ? var3 : var2 + var3;
   }

   private void m_5121(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         try {
            Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
            if (var2 != null && var2.m_776() && var2.m_1114() instanceof Player var3 && var3.isAlive()) {
               this.m_5124(var3, false);
            }
         } catch (Throwable var7) {
         }

         Aura var8 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
         if (var8.m_776() && var8.m_1114() != null && var8.m_1114() != this.f_14527) {
            this.f_14527 = var8.m_1114();
         }

         Iterator var9 = this.f_14526.iterator();

         while (var9.hasNext()) {
            KillMessage.ztsH4WdLc1KDYXKF var10 = (KillMessage.ztsH4WdLc1KDYXKF)var9.next();
            if (!var10.m_5102()) {
               var9.remove();
            } else {
               LivingEntity var5 = var10.f_14513;
               boolean var6 = f_11537.level.getEntity(var5.getId()) == null;
               if ((var5.getHealth() <= 0.0F || !var5.isAlive() || var6) && var10.f_14516 && !var10.f_14517) {
                  if (this.f_14522.m_8768()) {
                     this.m_5116(var5);
                  }

                  var10.f_14517 = true;
                  var10.m_5101(f_14536);
               }
            }
         }

         this.f_14526.removeIf(var0 -> !var0.m_5102());
      } else {
         this.f_14526.clear();
      }
   }

   private KillMessage.ztsH4WdLc1KDYXKF m_5122(LivingEntity var1) {
      if (var1 == null) {
         return null;
      }

      for (KillMessage.ztsH4WdLc1KDYXKF var3 : this.f_14526) {
         if (var3.f_14513.getId() == var1.getId()) {
            return var3;
         }
      }

      return null;
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> m_5123() {
      return this.f_14530;
   }

   private void m_5124(LivingEntity var1, boolean var2) {
      if (var1 != null && var1 != f_11537.player && var1 instanceof Player) {
         for (KillMessage.ztsH4WdLc1KDYXKF var4 : this.f_14526) {
            if (var4.f_14513.getId() == var1.getId()) {
               var4.m_5104(var1);
               if (var2) {
                  var4.m_5103();
               }

               return;
            }
         }

         if (var2) {
            this.f_14526.clear();
            KillMessage.ztsH4WdLc1KDYXKF var5 = new KillMessage.ztsH4WdLc1KDYXKF(var1);
            var5.m_5103();
            this.f_14526.add(var5);
         }
      }
   }

   public void m_5125() {
      this.f_14524.clear();
   }

   private String m_5126(String var1) {
      if (var1 == null) {
         return null;
      }

      String var2 = var1.trim();
      return var2.isEmpty() ? null : var2;
   }

   @Override
   public JsonObject m_782() {
      JsonObject var1 = super.m_782();
      JsonObject var2 = var1.has(f_14545) ? var1.getAsJsonObject(f_14546) : new JsonObject();
      JsonArray var3 = new JsonArray();

      for (String var5 : this.f_14524) {
         var3.add(var5);
      }

      var2.add(f_14547, var3);
      JsonArray var7 = new JsonArray();

      for (String var6 : this.f_14525) {
         var7.add(var6);
      }

      var2.add(f_14548, var7);
      var1.add(f_14549, var2);
      return var1;
   }

   @Generated
   public LivingEntity m_5127() {
      return this.f_14527;
   }

   private boolean m_5129(LivingEntity var1) {
      KillMessage.ztsH4WdLc1KDYXKF var2 = this.m_5122(var1);
      return var2 != null && var2.m_5102() && var2.f_14516;
   }

   private void m_5130(LivingEntity var1) {
      KillMessage.ztsH4WdLc1KDYXKF var2 = this.m_5122(var1);
      if (var2 != null && var2.f_14516) {
         if (!this.f_14525.isEmpty()) {
            String var3 = this.m_5131(this.f_14525);
            String var4 = var1.getName().getString();
            Class_ftHu9o3WzCU3Adxm.m_6723(this.m_5141(this.m_5120(var3, var4)));
         }
      }
   }

   private String m_5131(List<String> var1) {
      return (String)var1.get(ThreadLocalRandom.current().nextInt(var1.size()));
   }

   @Override
   public void m_791(JsonObject var1) {
      super.m_791(var1);
      if (var1 != null && var1.has(f_14550)) {
         JsonObject var2 = var1.getAsJsonObject(f_14551);
         this.f_14524.clear();
         this.f_14525.clear();
         if (var2.has(f_14552) && var2.get(f_14553).isJsonArray()) {
            for (JsonElement var4 : var2.getAsJsonArray(f_14554)) {
               if (var4.isJsonPrimitive()) {
                  this.m_5119(var4.getAsString());
               }
            }
         }

         if (var2.has(f_14555) && var2.get(f_14556).isJsonArray()) {
            for (JsonElement var6 : var2.getAsJsonArray(f_14557)) {
               if (var6.isJsonPrimitive()) {
                  this.m_5138(var6.getAsString());
               }
            }
         }
      }
   }

   private void m_5132(Class_wjdoxQGtI8mFyL6U var1) {
      if (this.m_776() && var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
         if (var1.m_9370() instanceof LivingEntity var2 && var2.isAlive()) {
            if (var2 instanceof Player) {
               this.m_5124(var2, true);
            }
         }
      }
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> m_5133() {
      return this.f_14529;
   }

   @Generated
   public List<KillMessage.ztsH4WdLc1KDYXKF> m_5134() {
      return this.f_14526;
   }

   private void m_5135(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.m_776() && f_11537.level != null) {
         if (var1.m_5619() instanceof ClientboundEntityEventPacket var2) {
            if (var2.getEntity(f_11537.level) instanceof Player var4 && var4 != f_11537.player) {
               if (this.m_5129(var4)) {
                  Aura var5 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
                  if (var2.getEventId() == 35) {
                     if (!this.f_14523.m_8768()) {
                        return;
                     }

                     f_11537.execute(() -> this.m_5130(var4));
                  } else if (this.f_14527 != null && Class_g3Fg4YmMuzK7loFX.m_6757(this.f_14527) <= 0.0F && !this.f_14527.isAlive()) {
                     if (!this.f_14522.m_8768()) {
                        return;
                     }

                     f_11537.execute(() -> this.m_5116(var4));
                  }
               }
            }
         }
      }
   }

   public void m_5136() {
      this.f_14525.clear();
   }

   @Generated
   public Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> m_5137() {
      return this.f_14528;
   }

   public boolean m_5138(String var1) {
      String var2 = this.m_5126(var1);
      return var2 != null && !this.f_14525.contains(var2) ? this.f_14525.add(var2) : false;
   }

   private String m_5141(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim();
         if (!this.f_14521.m_8768()) {
            return var2.startsWith(f_14538) ? var2.substring(1).trim() : var2;
         } else {
            return var2.startsWith(f_14537) ? var2 : var2 + "";
         }
      } else {
         return var1;
      }
   }

   private static final class ztsH4WdLc1KDYXKF {
      public LivingEntity f_14513;
      public long f_14514;
      public long f_14515;
      public boolean f_14516;
      public boolean f_14517;
      public static final long f_14518 = 3000L;
      public static final long f_14519 = 3000L;

      public void m_5101(long var1) {
         this.f_14515 = var1;
         this.f_14514 = System.currentTimeMillis();
      }

      public boolean m_5102() {
         return this.f_14513 != null && System.currentTimeMillis() - this.f_14514 < this.f_14515;
      }

      public void m_5103() {
         this.f_14516 = true;
         this.f_14514 = System.currentTimeMillis();
      }

      public void m_5104(LivingEntity var1) {
         this.f_14513 = var1;
         this.f_14514 = System.currentTimeMillis();
         this.f_14515 = f_14519;
         if (var1.getHealth() > 0.0F) {
            this.f_14517 = false;
         }
      }

      public ztsH4WdLc1KDYXKF(LivingEntity var1) {
         this.f_14515 = f_14518;
         this.m_5104(var1);
      }
   }
}
