package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.resources.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public final class Class_IdsehQlQWXPo4efo {
   private static final List<Class_IdsehQlQWXPo4efo.M4r3QZ9m7oECb4kl> f_9098 = new ArrayList<>();
   private static final String f_9099 = "This is a utility class and cannot be instantiated";

   public static void m_3120() {
      if (!f_9098.isEmpty()) {
         Matrix4f var0 = new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853());

         try {
            for (Class_IdsehQlQWXPo4efo.M4r3QZ9m7oECb4kl var2 : f_9098) {
               Class_Ssh31B3ljfKeWsvS.m_4814(var2.matrix);
               Class_Ssh31B3ljfKeWsvS.m_4806(
                  var2.x, var2.y, var2.width, var2.height, var2.round, new Vector4f(0.0F, 0.0F, 1.0F, 1.0F), var2.color, var2.texture
               );
            }
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4814(var0);
            f_9098.clear();
         }
      }
   }

   @Generated
   private Class_IdsehQlQWXPo4efo() {
      throw new UnsupportedOperationException(f_9099);
   }

   public static void m_3121(Identifier var0, float var1, float var2, float var3, float var4, int var5) {
      m_3123(var0, var1, var2, var3, var4, 0.0F, var5);
   }

   public static void m_3122() {
      f_9098.clear();
   }

   public static void m_3123(Identifier var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      if (var0 != null && !(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         if (var6 >>> 24 > 0) {
            f_9098.add(new Class_IdsehQlQWXPo4efo.M4r3QZ9m7oECb4kl(var0, var1, var2, var3, var4, var5, var6, new Matrix4f(Class_Ssh31B3ljfKeWsvS.m_4853())));
         }
      }
   }

   private record M4r3QZ9m7oECb4kl(Identifier texture, float x, float y, float width, float height, float round, int color, Matrix4f matrix) {
   }
}
