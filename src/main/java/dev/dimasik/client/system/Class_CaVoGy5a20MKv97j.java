package dev.dimasik.client.system;

import java.util.Map;
import net.minecraft.resources.Identifier;

public record Class_CaVoGy5a20MKv97j(
   String name,
   String displayName,
   Class_HSD91zSgdqsM5q0d category,
   float scale,
   float x,
   float y,
   float z,
   Identifier texture,
   Class_oAq4PeD1FSXoIaXR model,
   Class_vhSU9kAizeRReaAF animation,
   Class_LQL7JwvjBBIPKKmN attach,
   Map<String, Class_vhSU9kAizeRReaAF> clips
) {
   public Class_vhSU9kAizeRReaAF clip(String var1) {
      if (this.clips != null && !this.clips.isEmpty()) {
         Class_vhSU9kAizeRReaAF var2 = this.clips.get(var1);
         return var2 != null ? var2 : this.animation;
      } else {
         return this.animation;
      }
   }

   public Class_LzYTXb7R2jug6Pep preview() {
      return new Class_LzYTXb7R2jug6Pep(this.name, this.displayName, this.texture, this.model);
   }
}
