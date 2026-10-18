package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import lombok.Generated;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public abstract class Class_msKbTl6QleqYGoq3 {
   private final String f_25543;
   private final String[] f_25544;
   private String f_25545;
   private List<Class_msKbTl6QleqYGoq3.Class_31eL8BZtvyg7lnQC> f_25546 = List.of();
   private static final String f_25547 = "help";
   private static final String f_25548 = ", ";
   private static final String f_25549 = "Описание отсутствует";
   private static final String f_25550 = "<...> — обязательно, [...] — необязательно";

   public void m_7622(LiteralArgumentBuilder<ClientSuggestionProvider> var1, Supplier<String> var2) {
      if (var1.getCommand() == null) {
         var1.executes(var2x -> this.m_7632((String)var2.get()));
      }

      var1.then(this.m_7628(f_25547).executes(var2x -> this.m_7632((String)var2.get())));
   }

   public void m_7623(Class_msKbTl6QleqYGoq3.Class_31eL8BZtvyg7lnQC... var1) {
      this.f_25546 = List.copyOf(Arrays.asList(var1));
   }

   protected <T> RequiredArgumentBuilder<ClientSuggestionProvider, T> m_7624(String var1, ArgumentType<T> var2) {
      return RequiredArgumentBuilder.argument(var1, var2);
   }

   @Generated
   public String[] m_7626() {
      return this.f_25544;
   }

   public LiteralArgumentBuilder<ClientSuggestionProvider> m_7628(String var1) {
      return LiteralArgumentBuilder.literal(var1);
   }

   public abstract void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1);

   @Generated
   public String m_7629() {
      return this.f_25543;
   }

   @Generated
   public void m_7630(String var1) {
      this.f_25545 = var1;
   }

   @Generated
   public List<Class_msKbTl6QleqYGoq3.Class_31eL8BZtvyg7lnQC> m_7631() {
      return this.f_25546;
   }

   public Class_msKbTl6QleqYGoq3(String var1, String... var2) {
      this.f_25543 = var1;
      this.f_25544 = var2;
   }

   public int m_7632(String var1) {
      String var2 = var1 + this.f_25543;
      String var3 = this.f_25544.length == 0 ? "" : String.join(f_25548, Arrays.stream(this.f_25544).map(var1x -> var1 + var1x).toList()) + "";
      Class_ftHu9o3WzCU3Adxm.m_6731(var2 + var3);
      Class_ftHu9o3WzCU3Adxm.m_6731(this.f_25545 != null && !this.f_25545.isBlank() ? this.f_25545 : f_25549);
      Class_ftHu9o3WzCU3Adxm.m_6731(f_25550);
      if (this.f_25546.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var2);
         return 1;
      }

      for (Class_msKbTl6QleqYGoq3.Class_31eL8BZtvyg7lnQC var5 : this.f_25546) {
         String var6 = var5.syntax().isBlank() ? var2 : var2 + var5.syntax();
         Class_ftHu9o3WzCU3Adxm.m_6731(var6 + var5.description());
      }

      return 1;
   }

   @Generated
   public String m_7634() {
      return this.f_25545;
   }

   public record Class_31eL8BZtvyg7lnQC(String syntax, String description) {
   }
}
