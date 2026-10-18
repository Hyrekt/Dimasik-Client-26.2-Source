package dev.dimasik.client.system;

import java.util.function.Consumer;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class_jgHLHv9px2bYn3hD implements Consumer<Class_uGNFApwy8sUjPdk5> {
   private final LuaFunction f_24797;

   public Class_jgHLHv9px2bYn3hD(LuaFunction var1) {
      this.f_24797 = var1;
   }

   @Override
   public void accept(Class_uGNFApwy8sUjPdk5 var1) {
      this.m_7401(var1);
   }

   public void m_7401(Class_uGNFApwy8sUjPdk5 var1) {
      try {
         this.f_24797.call(CoerceJavaToLua.coerce(var1));
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
