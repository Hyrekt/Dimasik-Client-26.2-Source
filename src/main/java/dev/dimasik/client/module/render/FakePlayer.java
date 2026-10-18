package dev.dimasik.client.module.render;

import com.mojang.authlib.GameProfile;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.item.ItemStack;

public final class FakePlayer extends Module {
   private static final EquipmentSlot[] f_30192 = new EquipmentSlot[]{
      EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND
   };
   private final Map<String, RemotePlayer> f_30193 = new LinkedHashMap<>();
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_30194 = this::m_8418;
   private ClientLevel f_30195;
   private boolean f_30196;
   private int f_30197 = 1;
   private static int f_30198 = -1;
   private static final String f_30199 = "FakePlayer";
   private static final String f_30200 = "Создаёт и настраивает несколько фейковых игроков";
   private static final String f_30201 = "[^A-Za-z0-9_]";

   private String m_8410() {
      String var1;
      do {
         var1 = this.f_30197++ + "";
      } while (this.m_8412(var1) != null);

      return var1;
   }

   public boolean m_8411(String var1, ItemStack var2) {
      RemotePlayer var3 = this.m_8412(var1);
      return var3 != null && var2 != null && !var2.isEmpty() ? var3.addItem(var2.copy()) : false;
   }

   @Override
   public void m_778() {
      if (!this.f_30196 && this.f_30193.isEmpty() && f_11537.player != null && f_11537.level != null) {
         this.m_8424(this.m_8410());
      }

      this.f_30196 = false;
      super.m_778();
   }

   public RemotePlayer m_8412(String var1) {
      String var2 = this.m_8423(var1);
      return var2 == null ? null : this.f_30193.get(var2);
   }

   public RemotePlayer m_8413(String var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (!this.m_776()) {
            this.f_30196 = true;
            this.m_792();
         }

         String var2 = this.m_8415(var1);
         if (var2 == null) {
            var2 = this.m_8410();
         }

         return this.m_8412(var2) != null ? null : this.m_8424(var2);
      } else {
         return null;
      }
   }

   public boolean m_8414(String var1) {
      RemotePlayer var2 = this.m_8412(var1);
      if (var2 != null && f_11537.player != null) {
         this.m_8422(var2);
         return true;
      } else {
         return false;
      }
   }

   private String m_8415(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().replaceAll(f_30201, "");
         return var2.isEmpty() ? null : var2.substring(0, Math.min(16, var2.length()));
      } else {
         return null;
      }
   }

   public boolean m_8416(String var1) {
      String var2 = this.m_8423(var1);
      if (var2 == null) {
         return false;
      }

      RemotePlayer var3 = this.f_30193.remove(var2);
      if (var3 == null) {
         return false;
      }

      var3.remove(RemovalReason.DISCARDED);
      return true;
   }

   public boolean m_8417(String var1, EquipmentSlot var2, ItemStack var3) {
      RemotePlayer var4 = this.m_8412(var1);
      if (var4 != null && var2 != null && var3 != null) {
         var4.setItemSlot(var2, var3.copy());
         return true;
      } else {
         return false;
      }
   }

   public FakePlayer() {
      super(f_30199, f_30200, Category.RENDER);
   }

   private void m_8418(Class_Xu9btcIeUN33XnMK var1) {
      if (!this.f_30193.isEmpty()) {
         if (f_11537.level != null && this.f_30195 == f_11537.level) {
            this.f_30193.entrySet().removeIf(var0 -> var0.getValue() == null || var0.getValue().isRemoved());
         } else {
            this.m_8421();
         }
      }
   }

   public List<String> m_8420() {
      ArrayList var1 = new ArrayList();

      for (RemotePlayer var3 : this.f_30193.values()) {
         var1.add(var3.getGameProfile().name());
      }

      return List.copyOf(var1);
   }

   public int m_8421() {
      int var1 = this.f_30193.size();

      for (RemotePlayer var3 : this.f_30193.values()) {
         if (var3 != null && !var3.isRemoved()) {
            var3.remove(RemovalReason.DISCARDED);
         }
      }

      this.f_30193.clear();
      this.f_30195 = null;
      return var1;
   }

   private void m_8422(RemotePlayer var1) {
      var1.getInventory().replaceWith(f_11537.player.getInventory());

      for (EquipmentSlot var5 : f_30192) {
         var1.setItemSlot(var5, f_11537.player.getItemBySlot(var5).copy());
      }
   }

   private String m_8423(String var1) {
      String var2 = this.m_8415(var1);
      return var2 == null ? null : var2.toLowerCase(Locale.ROOT);
   }

   @Override
   public void m_732() {
      this.m_8421();
      super.m_732();
   }

   private RemotePlayer m_8424(String var1) {
      UUID var2 = UUID.nameUUIDFromBytes((var1 + "").getBytes(StandardCharsets.UTF_8));
      RemotePlayer var3 = new RemotePlayer(f_11537.level, new GameProfile(var2, var1));

      while (f_11537.level.getEntity(f_30198) != null) {
         f_30198--;
      }

      var3.setId(f_30198--);
      var3.snapTo(f_11537.player.getX(), f_11537.player.getY(), f_11537.player.getZ(), f_11537.player.getYRot(), f_11537.player.getXRot());
      var3.yHeadRot = f_11537.player.yHeadRot;
      var3.yBodyRot = f_11537.player.yBodyRot;
      var3.setHealth(f_11537.player.getHealth());
      var3.setAbsorptionAmount(f_11537.player.getAbsorptionAmount());
      this.m_8422(var3);
      f_11537.level.addEntity(var3);
      this.f_30193.put(this.m_8423(var1), var3);
      this.f_30195 = f_11537.level;
      return var3;
   }
}
