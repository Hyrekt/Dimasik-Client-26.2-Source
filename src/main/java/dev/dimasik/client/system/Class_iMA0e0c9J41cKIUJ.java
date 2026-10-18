package dev.dimasik.client.system;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LoadState;
import org.luaj.vm2.compiler.LuaC;
import org.luaj.vm2.lib.Bit32Lib;
import org.luaj.vm2.lib.CoroutineLib;
import org.luaj.vm2.lib.PackageLib;
import org.luaj.vm2.lib.StringLib;
import org.luaj.vm2.lib.TableLib;
import org.luaj.vm2.lib.jse.JseBaseLib;
import org.luaj.vm2.lib.jse.JseMathLib;

public class Class_iMA0e0c9J41cKIUJ {
   private static final Class_iMA0e0c9J41cKIUJ f_23623 = new Class_iMA0e0c9J41cKIUJ();
   public final Globals f_23624 = m_7263();

   private static Globals m_7263() {
      Globals var0 = new Globals();
      var0.load(new JseBaseLib());
      var0.load(new PackageLib());
      var0.load(new Bit32Lib());
      var0.load(new TableLib());
      var0.load(new StringLib());
      var0.load(new CoroutineLib());
      var0.load(new JseMathLib());
      LoadState.install(var0);
      LuaC.install(var0);
      return var0;
   }

   public static Class_iMA0e0c9J41cKIUJ m_7264() {
      return f_23623;
   }

   private Class_iMA0e0c9J41cKIUJ() {
   }
}
