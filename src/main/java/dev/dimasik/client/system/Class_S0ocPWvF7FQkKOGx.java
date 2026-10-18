package dev.dimasik.client.system;

import java.util.function.Consumer;

public final class Class_S0ocPWvF7FQkKOGx extends Class_F9yc8RZksnyRaiHz {
   private final Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE f_12924;
   private final Consumer<Class_ihAt1VjcwWMm2sNx> f_12925;
   private static final String f_12926 = "dimasik_emote_v1";

   public Class_S0ocPWvF7FQkKOGx(String var1, Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE var2, Consumer<Class_ihAt1VjcwWMm2sNx> var3) {
      super(
         new Class_cYFL1WImRhToowYo(
            f_12926, var2 == Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE.PARTY ? Class_DX04kDXg593u6q7Y.PARTY_ONLY : Class_DX04kDXg593u6q7Y.ALL_USERS, var1
         )
      );
      this.f_12924 = var2;
      this.f_12925 = var3;
   }

   @Override
   public void m_2589() {
      Class_ihAt1VjcwWMm2sNx var1 = Class_ihAt1VjcwWMm2sNx.decode(this.m_2590().m_6193());
      if (var1 != null && var1.scope() == this.f_12924 && this.f_12925 != null) {
         this.f_12925.accept(var1);
      }
   }

   public Class_ihAt1VjcwWMm2sNx.Class_8QwRzQunfxrDe6RE m_4660() {
      return this.f_12924;
   }
}
