package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_FUILRKIQ6wtWry59;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "org/luaj/vm2/lib/jse/JavaClass", remap = false)
public class JavaClassMixin {
   @Redirect(method = "getMethod", at = @At(value = "INVOKE", target = "Ljava/lang/reflect/Method;getName()Ljava/lang/String;"), remap = false)
   private String hmiStableMethodName(Method var1) {
      Class_FUILRKIQ6wtWry59 var2 = var1.getAnnotation(Class_FUILRKIQ6wtWry59.class);
      return var2 != null && !var2.value().isEmpty() ? var2.value() : var1.getName();
   }

   @Redirect(method = "getField", at = @At(value = "INVOKE", target = "Ljava/lang/reflect/Field;getName()Ljava/lang/String;"), remap = false)
   private String hmiStableFieldName(Field var1) {
      Class_FUILRKIQ6wtWry59 var2 = var1.getAnnotation(Class_FUILRKIQ6wtWry59.class);
      return var2 != null && !var2.value().isEmpty() ? var2.value() : var1.getName();
   }
}
