package dev.dimasik.client.module.render;

import net.minecraft.util.Mth;

public class SwingAnimations$fHYK0tWh3o108StE {
   public float x;
   public float y;
   public float z;
   public float pitch;
   public float yaw;
   public float roll;

   public SwingAnimations$fHYK0tWh3o108StE(float x, float y, float z, float pitch, float yaw, float roll) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.pitch = pitch;
      this.yaw = yaw;
      this.roll = roll;
   }

   public static SwingAnimations$fHYK0tWh3o108StE lerp(SwingAnimations$fHYK0tWh3o108StE var0, SwingAnimations$fHYK0tWh3o108StE var1, float var2) {
      return new SwingAnimations$fHYK0tWh3o108StE(
         Mth.lerp(var2, var0.x, var1.x),
         Mth.lerp(var2, var0.y, var1.y),
         Mth.lerp(var2, var0.z, var1.z),
         Mth.lerp(var2, var0.pitch, var1.pitch),
         Mth.lerp(var2, var0.yaw, var1.yaw),
         Mth.lerp(var2, var0.roll, var1.roll)
      );
   }
}
