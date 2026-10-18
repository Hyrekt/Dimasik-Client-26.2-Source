package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import lombok.Generated;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.GameType;
import net.minecraft.world.scores.PlayerTeam;

public class Class_xzn9431ICoBNtkQe implements Class_NzJrN63M7QBpmAbi {
   private final ArrayList<Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A> f_35210 = new ArrayList<>();
   private final ArrayList<Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A> f_35211 = new ArrayList<>();
   private final Map<String, Integer> f_35212 = new HashMap<>();
   private static final String f_35213 = "Персонал";
   private static final int f_35214 = Integer.MIN_VALUE;
   private static final int f_35215 = Integer.MIN_VALUE;
   private static final float f_35216 = 0.1F;

   public void m_9578() {
      if (f_11537.level != null
         && f_11537.player != null
         && f_11537.getConnection() != null
         && DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_35213)) {
         this.f_35211.clear();
         HashSet var1 = new HashSet();
         HashSet var2 = new HashSet();

         for (PlayerInfo var4 : f_11537.player.connection.getListedOnlinePlayers()) {
            var1.add(var4.getProfile().name().toLowerCase(Locale.ROOT));
            var2.add(var4.getProfile().id());
         }

         for (Class_qK16bqpf5bjnS3Wo.GxXjmRPjEtErXC79 var15 : Class_qK16bqpf5bjnS3Wo.m_8327()) {
            String var5 = var15.name();
            if (Class_fDYr9dPgi2Kr231m.m_6462().matcher(var5).matches() && !var2.contains(var15.uuid()) && !var1.contains(var5.toLowerCase(Locale.ROOT))) {
               PlayerTeam var6 = this.m_9581(var5);
               this.f_35211
                  .add(
                     new Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A(
                        var5,
                        (Component)(var6 == null ? Component.empty() : var6.getPlayerPrefix()),
                        Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez.VANISH,
                        System.currentTimeMillis(),
                        true
                     )
                  );
            }
         }

         for (PlayerInfo var16 : f_11537.player.connection.getListedOnlinePlayers()) {
            try {
               this.f_35211.removeIf(var1x -> var1x.m_9574().equals(var16.getProfile().name()));
            } catch (Exception var11) {
            }

            if (var16.getTeam() != null && var16.getGameMode() == GameType.SPECTATOR) {
               this.f_35211
                  .add(
                     new Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A(
                        var16.getProfile().name(),
                        var16.getTeam().getPlayerPrefix(),
                        Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez.SPECTATOR,
                        System.currentTimeMillis(),
                        true
                     )
                  );
            }
         }

         HashSet var14 = new HashSet();

         for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var20 : this.f_35211) {
            var14.add(var20.m_9574().toLowerCase(Locale.ROOT));
         }

         for (PlayerTeam var21 : f_11537.level.getScoreboard().getPlayerTeams()) {
            int var25 = f_35214;

            for (String var8 : var21.getPlayers()) {
               String var9 = var8.toLowerCase(Locale.ROOT);
               if (var1.contains(var9)) {
                  boolean var10 = DimasikClient.m_9057().m_9049().m_2814().m_5020(var8);
                  if (!var10) {
                     if (var25 == f_35215) {
                        var25 = this.m_9585(var21.getPlayerPrefix());
                     }

                     if (var25 < 0 || !Class_fDYr9dPgi2Kr231m.m_6462().matcher(var8).matches()) {
                        continue;
                     }
                  }

                  if (var14.add(var9)) {
                     this.f_35211
                        .add(
                           new Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A(
                              var8, var21.getPlayerPrefix(), Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez.NONE, System.currentTimeMillis(), true
                           )
                        );
                  }
               }
            }
         }

         HashMap var19 = new HashMap();

         for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var26 : this.f_35210) {
            var19.put(var26.m_9574(), var26);
         }

         for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var27 : this.f_35211) {
            Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var32 = (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A)var19.get(var27.m_9574());
            if (var32 == null) {
               this.f_35210.add(var27);
            } else {
               if (var32.m_9575() != var27.m_9575()) {
                  var32.m_9570(var27.m_9575());
               }

               var32.m_9573(true);
            }
         }

         HashSet var24 = new HashSet();

         for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var33 : this.f_35211) {
            var24.add(var33.m_9574());
         }

         for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var34 : this.f_35210) {
            if (!var24.contains(var34.m_9574())) {
               var34.m_9573(false);
            }
         }

         for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var35 : this.f_35210) {
            int var37 = Math.max(0, this.m_9585(var35.m_9576()));
            var35.f_35208 = var35.m_9575() == Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez.NONE ? -var37 : -999 - var37;
         }

         this.f_35210.sort(Comparator.comparingInt(var0 -> var0.f_35208));
         this.f_35210.removeIf(var0 -> var0.m_9572().m_9288() < f_35216 && !var0.m_9568());

         for (Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A var36 : this.f_35210) {
            var36.m_9572().m_9283(var36.m_9568() ? 1.0F : 0.0F);
         }
      } else {
         this.f_35210.clear();
         this.f_35211.clear();
         this.f_35212.clear();
      }
   }

   private PlayerTeam m_9581(String var1) {
      for (PlayerTeam var3 : f_11537.level.getScoreboard().getPlayerTeams()) {
         for (String var5 : var3.getPlayers()) {
            if (var5.equalsIgnoreCase(var1)) {
               return var3;
            }
         }
      }

      return null;
   }

   @Generated
   public ArrayList<Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A> m_9582() {
      return this.f_35211;
   }

   @Generated
   public ArrayList<Class_xzn9431ICoBNtkQe.Class_5mF02H2TbvCq6l6A> m_9583() {
      return this.f_35210;
   }

   @Generated
   public Map<String, Integer> m_9584() {
      return this.f_35212;
   }

   private int m_9585(Component var1) {
      String var2 = var1.getString().toLowerCase(Locale.ROOT);
      Integer var3 = this.f_35212.get(var2);
      if (var3 != null) {
         return var3;
      }

      int var4 = Class_xQDipU5xyFVqunmD.m_9500(var2) ? Class_xQDipU5xyFVqunmD.m_9498(var2) : -1;
      if (this.f_35212.size() >= 512) {
         this.f_35212.clear();
      }

      this.f_35212.put(var2, var4);
      return var4;
   }

   public static class Class_5mF02H2TbvCq6l6A {
      public final String f_35202;
      public final Component f_35203;
      public Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez f_35204;
      public final long f_35205;
      public final Class_w8fCJQ5ZtH5lQbWc f_35206;
      public boolean f_35207;
      public int f_35208;
      public static final float f_35209 = 15.0F;

      @Generated
      public boolean m_9568() {
         return this.f_35207;
      }

      @Generated
      public long m_9569() {
         return this.f_35205;
      }

      @Generated
      public void m_9570(Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez var1) {
         this.f_35204 = var1;
      }

      @Generated
      public int m_9571() {
         return this.f_35208;
      }

      public Class_5mF02H2TbvCq6l6A(String var1, Component var2, Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez var3, long var4, boolean var6) {
         this.f_35206 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_35209);
         this.f_35202 = var1;
         this.f_35203 = var2;
         this.f_35204 = var3;
         this.f_35205 = var4;
         this.f_35207 = var6;
      }

      @Generated
      public Class_w8fCJQ5ZtH5lQbWc m_9572() {
         return this.f_35206;
      }

      @Generated
      public void m_9573(boolean var1) {
         this.f_35207 = var1;
      }

      @Generated
      public String m_9574() {
         return this.f_35202;
      }

      @Generated
      public Class_8obKf7Y4NcvqxQPH.Jl39eBgNSHoO7kez m_9575() {
         return this.f_35204;
      }

      @Generated
      public Component m_9576() {
         return this.f_35203;
      }

      @Generated
      public void m_9577(int var1) {
         this.f_35208 = var1;
      }
   }
}
