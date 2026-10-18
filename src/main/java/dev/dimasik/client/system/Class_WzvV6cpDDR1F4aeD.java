package dev.dimasik.client.system;

import net.minecraft.resources.Identifier;

public enum Class_WzvV6cpDDR1F4aeD {
   ANGEL("Ангел", "angel"),
   PARROT("Попугай", "parrot"),
   BAT("Летучая мышь", "bat"),
   DRAGON("Дракон", "dragon"),
   EVIL("Демон", "evil"),
   FIRE("Огонь", "fire"),
   METALLIC("Металл", "metallic"),
   BLUE_BUTTERFLY("Синяя бабочка", "blue_butterfly"),
   MONARCH("Бабочка монарх", "monarch_butterfly"),
   FAIRY("Фея", "fairy"),
   SLIME("Слизень", "slime"),
   KANEKI_KAGUNE("Кагуне Канеки", "kaneki_kagune");

   private final String f_15769;
   private final Identifier f_15770;

   Class_WzvV6cpDDR1F4aeD(String var3, String var4) {
      this.f_15769 = var3;
      this.f_15770 = Identifier.fromNamespaceAndPath("dimasik", "textures/wings/" + var4 + "_wings.png");
   }

   public String m_5496() {
      return this.f_15769;
   }

   public Identifier m_5497() {
      return this.f_15770;
   }

   public Class_s5qEamGcEs25C3d8 m_5498() {
      String var1 = this.name();
      if (this == MONARCH) {
         var1 = "MONARCH_BUTTERFLY";
      }

      return Class_s5qEamGcEs25C3d8.valueOf(var1);
   }
}
