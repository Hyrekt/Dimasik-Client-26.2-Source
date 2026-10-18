package dev.dimasik.client.system;

public enum Class_HSD91zSgdqsM5q0d {
   HATS,
   MASKS,
   WINGS,
   BACKPACKS,
   PETS,
   EARS,
   TAILS,
   PAWS,
   STOCKINGS,
   HEADS;

   public static Class_HSD91zSgdqsM5q0d m_2887(String var0) {
      return switch (var0) {
         case "hats" -> HATS;
         case "masks" -> MASKS;
         case "wings" -> WINGS;
         case "backpacks" -> BACKPACKS;
         case "pets" -> PETS;
         case "ears" -> EARS;
         case "tails" -> TAILS;
         case "paws" -> PAWS;
         case "dresses", "stockings" -> STOCKINGS;
         case "heads" -> HEADS;
         default -> throw new IllegalArgumentException(var0);
      };
   }

   public String m_2888() {
      return this.name().toLowerCase();
   }

   public boolean m_2889() {
      return this == EARS || this == TAILS || this == PAWS || this == STOCKINGS || this == HEADS;
   }
}
