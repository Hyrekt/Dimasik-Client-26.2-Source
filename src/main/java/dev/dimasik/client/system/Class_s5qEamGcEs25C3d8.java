package dev.dimasik.client.system;

import net.minecraft.resources.Identifier;

public enum Class_s5qEamGcEs25C3d8 {
   ANGEL("Ангел", "angel", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   PARROT("Попугай", "parrot", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   BAT("Летучая мышь", "bat", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   DRAGON("Дракон", "dragon", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   EVIL("Демон", "evil", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   FIRE("Огонь", "fire", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   METALLIC("Металл", "metallic", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   GOD("Бог", "god", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.AVIAN),
   BLUE_BUTTERFLY("Синяя бабочка", "blue_butterfly", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.INSECTOID),
   MONARCH_BUTTERFLY("Бабочка монарх", "monarch_butterfly", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.INSECTOID),
   FAIRY("Фея", "fairy", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.INSECTOID),
   SLIME("Слизень", "slime", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.INSECTOID),
   KANEKI_KAGUNE("Кагуне Канеки", "kaneki_kagune", Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV.KAGUNE);

   private static Class_N3SSqGnetdyAyMUH f_30675;
   private static Class_N3SSqGnetdyAyMUH f_30676;
   private static Class_N3SSqGnetdyAyMUH f_30677;
   private static Class_N3SSqGnetdyAyMUH f_30678;
   private final String f_30679;
   private final Identifier f_30680;
   private final Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV f_30681;

   Class_s5qEamGcEs25C3d8(String var3, String var4, Class_s5qEamGcEs25C3d8.RSrilN6G7x5TOTnV var5) {
      this.f_30679 = var3;
      this.f_30680 = Identifier.fromNamespaceAndPath("dimasik", "textures/wings/" + var4 + "_wings.png");
      this.f_30681 = var5;
   }

   public String m_8627() {
      return this.f_30679;
   }

   public Identifier m_8628() {
      return this.f_30680;
   }

   public Class_WzqIkwE6nF1UkDXB m_8629() {
      return switch (this.f_30681) {
         case AVIAN, ALLAY -> new Class_GgAv5LmRq7OHDViI();
         case INSECTOID, KAGUNE -> new Class_AcQu0tvtKKB6W63w();
      };
   }

   public Class_N3SSqGnetdyAyMUH m_8630() {
      return switch (this.f_30681) {
         case AVIAN -> {
            if (f_30675 == null) {
               f_30675 = new Class_DpJCSBVrN83qtNu2();
            }

            yield f_30675;
         }
         case INSECTOID -> {
            if (f_30676 == null) {
               f_30676 = new Class_v9i3ex2sNXvQEatX();
            }

            yield f_30676;
         }
         case KAGUNE -> {
            if (f_30677 == null) {
               f_30677 = new Class_iPfx54RiSCxbP6ld();
            }

            yield f_30677;
         }
         case ALLAY -> {
            if (f_30678 == null) {
               f_30678 = new Class_iZcH0Mb291bLfYnI();
            }

            yield f_30678;
         }
      };
   }

   public static String[] m_8631() {
      Class_s5qEamGcEs25C3d8[] var0 = values();
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2].f_30679;
      }

      return var1;
   }

   public static Class_s5qEamGcEs25C3d8 m_8632(String var0) {
      for (Class_s5qEamGcEs25C3d8 var4 : values()) {
         if (var4.f_30679.equals(var0)) {
            return var4;
         }
      }

      return ANGEL;
   }

   private enum RSrilN6G7x5TOTnV {
      AVIAN,
      INSECTOID,
      KAGUNE,
      ALLAY;
   }
}
