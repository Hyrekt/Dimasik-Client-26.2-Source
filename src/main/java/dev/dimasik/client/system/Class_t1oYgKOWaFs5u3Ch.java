package dev.dimasik.client.system;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class Class_t1oYgKOWaFs5u3Ch {
   public static final int f_31476 = 30;
   public static final int f_31477 = 0;
   public static final int f_31478 = 12;
   public static final int f_31479 = 13;
   private static final String[] f_31480 = new String[]{
      Class_t1oYgKOWaFs5u3Ch.f_31483,
      Class_t1oYgKOWaFs5u3Ch.f_31484,
      Class_t1oYgKOWaFs5u3Ch.f_31485,
      Class_t1oYgKOWaFs5u3Ch.f_31486,
      Class_t1oYgKOWaFs5u3Ch.f_31487,
      Class_t1oYgKOWaFs5u3Ch.f_31488,
      Class_t1oYgKOWaFs5u3Ch.f_31489,
      Class_t1oYgKOWaFs5u3Ch.f_31490,
      Class_t1oYgKOWaFs5u3Ch.f_31491,
      Class_t1oYgKOWaFs5u3Ch.f_31492,
      Class_t1oYgKOWaFs5u3Ch.f_31493,
      Class_t1oYgKOWaFs5u3Ch.f_31494,
      Class_t1oYgKOWaFs5u3Ch.f_31495,
      Class_t1oYgKOWaFs5u3Ch.f_31496,
      Class_t1oYgKOWaFs5u3Ch.f_31497,
      Class_t1oYgKOWaFs5u3Ch.f_31498,
      Class_t1oYgKOWaFs5u3Ch.f_31499,
      Class_t1oYgKOWaFs5u3Ch.f_31500,
      Class_t1oYgKOWaFs5u3Ch.f_31501,
      Class_t1oYgKOWaFs5u3Ch.f_31502,
      Class_t1oYgKOWaFs5u3Ch.f_31503,
      Class_t1oYgKOWaFs5u3Ch.f_31504,
      Class_t1oYgKOWaFs5u3Ch.f_31505,
      Class_t1oYgKOWaFs5u3Ch.f_31506,
      Class_t1oYgKOWaFs5u3Ch.f_31507,
      Class_t1oYgKOWaFs5u3Ch.f_31508,
      Class_t1oYgKOWaFs5u3Ch.f_31509,
      Class_t1oYgKOWaFs5u3Ch.f_31510,
      Class_t1oYgKOWaFs5u3Ch.f_31511,
      Class_t1oYgKOWaFs5u3Ch.f_31512
   };
   private static final String f_31481 = "policy.bin has a different raw feature schema";
   private static final String f_31482 = "Expected 30 raw features from Aim60FeatureExtractor";
   private static final String f_31483 = "sample_dt_ms";
   private static final String f_31484 = "world_tick_changed";
   private static final String f_31485 = "world_tick_phase";
   private static final String f_31486 = "rel_pos_right";
   private static final String f_31487 = "rel_pos_up";
   private static final String f_31488 = "rel_pos_forward";
   private static final String f_31489 = "distance";
   private static final String f_31490 = "rel_vel_right";
   private static final String f_31491 = "rel_vel_up";
   private static final String f_31492 = "rel_vel_forward";
   private static final String f_31493 = "aim_error_yaw";
   private static final String f_31494 = "aim_error_pitch";
   private static final String f_31495 = "yaw_velocity";
   private static final String f_31496 = "pitch_velocity";
   private static final String f_31497 = "target_relative_yaw_sin";
   private static final String f_31498 = "target_relative_yaw_cos";
   private static final String f_31499 = "target_on_ground";
   private static final String f_31500 = "target_sprinting";
   private static final String f_31501 = "target_sneaking";
   private static final String f_31502 = "target_hurt_time";
   private static final String f_31503 = "player_on_ground";
   private static final String f_31504 = "player_sprinting";
   private static final String f_31505 = "player_sneaking";
   private static final String f_31506 = "input_forward";
   private static final String f_31507 = "input_back";
   private static final String f_31508 = "input_left";
   private static final String f_31509 = "input_right";
   private static final String f_31510 = "input_jump";
   private static final String f_31511 = "input_attack";
   private static final String f_31512 = "exact_crosshair";

   public static void m_8779(Class_L3ITGDRmNtD9wK8j var0, int var1) {
      if (!Arrays.equals(f_31480, var0.m_3599())) {
         throw new IllegalArgumentException(f_31481);
      }

      if (var1 != 30) {
         throw new IllegalArgumentException(var1 + "");
      }
   }

   public static Map<String, Float> m_8780(float[] var0) {
      if (var0 != null && var0.length == 30) {
         HashMap var1 = new HashMap(64);

         for (int var2 = 0; var2 < f_31480.length; var2++) {
            if (!Float.isFinite(var0[var2])) {
               throw new IllegalArgumentException(f_31480[var2] + "");
            }

            var1.put(f_31480[var2], var0[var2]);
         }

         return var1;
      } else {
         throw new IllegalArgumentException(f_31482);
      }
   }

   private Class_t1oYgKOWaFs5u3Ch() {
   }
}
