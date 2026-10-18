package dev.dimasik.client.system;

public enum Class_LQL7JwvjBBIPKKmN {
   HEAD,
   BODY,
   ARMS,
   LEGS,
   PAWS,
   STOCKINGS,
   WORLD;

   public static Class_LQL7JwvjBBIPKKmN m_3627(String var0) {
      return switch (var0) {
         case "head" -> HEAD;
         case "body" -> BODY;
         case "arms" -> ARMS;
         case "legs" -> LEGS;
         case "paws" -> PAWS;
         case "stockings" -> STOCKINGS;
         case "world" -> WORLD;
         default -> throw new IllegalArgumentException(var0);
      };
   }

   public static Class_LQL7JwvjBBIPKKmN m_3628(Class_HSD91zSgdqsM5q0d var0) {
      return switch (var0) {
         case HATS, MASKS, EARS, HEADS -> HEAD;
         case PAWS -> PAWS;
         case STOCKINGS -> STOCKINGS;
         case WINGS, BACKPACKS, PETS, TAILS -> BODY;
      };
   }

   public boolean m_3629() {
      return this == WORLD;
   }
}
