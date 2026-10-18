package dev.dimasik.client.system;

import java.util.HashMap;
import java.util.Map;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ThreeArgFunction;
import org.luaj.vm2.lib.TwoArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

public final class Class_aCVFZK2Td6ftR8d3 extends LuaUserdata {
   private final LuaValue f_17209;
   private final LuaTable f_17210 = new LuaTable();
   private final Map<LuaValue, String> f_17211 = new HashMap<>();
   private static final String f_17212 = "get";
   private static final String f_17213 = "getOrDefault";
   private static final String f_17214 = "put";

   public LuaValue get(LuaValue var1) {
      LuaValue var2 = this.f_17210.rawget(var1);
      return var2.isnil() ? this.f_17209.get(var1) : var2;
   }

   public static LuaValue m_5906(Map<?, ?> var0) {
      return new Class_aCVFZK2Td6ftR8d3(var0);
   }

   public void set(LuaValue var1, LuaValue var2) {
      this.f_17209.set(var1, var2);
   }

   private String key(LuaValue var1) {
      String var2 = this.f_17211.get(var1);
      if (var2 == null) {
         var2 = var1.tojstring();
         if (this.f_17211.size() >= 2048) {
            this.f_17211.clear();
         }

         this.f_17211.put(var1, var2);
      }

      return var2;
   }

   private Class_aCVFZK2Td6ftR8d3(final Map<?, ?> var1) {
      super(var1);
      this.f_17209 = CoerceJavaToLua.coerce(var1);
      final Map var2 = var1;
      this.f_17210
         .set(
            f_17212,
            new TwoArgFunction() {
               public static final String f_17208 = "get";

               public LuaValue call(LuaValue var1x, LuaValue var2x) {
                  return var1x.touserdata() == var1 && var2x.type() == 4
                     ? CoerceJavaToLua.coerce(var2.get(Class_aCVFZK2Td6ftR8d3.this.key(var2x)))
                     : Class_aCVFZK2Td6ftR8d3.this.f_17209.get(f_17208).call(var1x, var2x);
               }
            }
         );
      this.f_17210.set(f_17213, new ThreeArgFunction() {
         public static final String f_17200 = "getOrDefault";

         public LuaValue call(LuaValue var1x, LuaValue var2x, LuaValue var3) {
            if (var1x.touserdata() == var1 && var2x.type() == 4) {
               String var4 = Class_aCVFZK2Td6ftR8d3.this.key(var2x);
               Object var5 = var2.get(var4);
               if (var5 == null && !var2.containsKey(var4)) {
                  var5 = CoerceLuaToJava.coerce(var3, Object.class);
               }

               return CoerceJavaToLua.coerce(var5);
            } else {
               return Class_aCVFZK2Td6ftR8d3.this.f_17209.get(f_17200).call(var1x, var2x, var3);
            }
         }
      });
      this.f_17210
         .set(
            f_17214,
            new ThreeArgFunction() {
               public static final String f_17204 = "put";

               public LuaValue call(LuaValue var1x, LuaValue var2x, LuaValue var3) {
                  return var1x.touserdata() == var1 && var2x.type() == 4
                     ? CoerceJavaToLua.coerce(var2.put(Class_aCVFZK2Td6ftR8d3.this.key(var2x), CoerceLuaToJava.coerce(var3, Object.class)))
                     : Class_aCVFZK2Td6ftR8d3.this.f_17209.get(f_17204).call(var1x, var2x, var3);
               }
            }
         );
   }
}
