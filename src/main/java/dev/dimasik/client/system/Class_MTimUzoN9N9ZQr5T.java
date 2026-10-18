package dev.dimasik.client.system;

import net.minecraft.resources.Identifier;

public enum Class_MTimUzoN9N9ZQr5T {
   SMILING_SUNGLASSES("В очках", "smiling_face_with_sunglasses"),
   HEART_EYES("Влюблённый", "smiling_face_with_heart_eyes"),
   SMILING_EYES("Улыбка", "smiling_face_with_smiling_eyes"),
   TEARS_OF_JOY("Смех до слёз", "face_with_tears_of_joy"),
   STAR_STRUCK("Звёздные глаза", "star_struck"),
   NERD("Ботаник", "nerd_face"),
   BLOWING_KISS("Поцелуй", "face_blowing_a_kiss"),
   SAVORING_FOOD("Вкусняшка", "face_savoring_food"),
   FLUSHED("Смущение", "flushed_face"),
   PLEADING("Умоляющий", "pleading_face"),
   PENSIVE("Грусть", "pensive_face"),
   CRYING("Слеза", "crying_face"),
   LOUDLY_CRYING("Рёв", "loudly_crying_face"),
   ENRAGED("Ярость", "enraged_face"),
   SCREAMING("Страх", "face_screaming_in_fear"),
   VOMITING("Тошнота", "face_vomiting"),
   SHELF("Shelf", "shelf"),
   MELLSTROY("MellStroy", "mellstroy");

   private final String f_11147;
   private final Identifier f_11148;

   Class_MTimUzoN9N9ZQr5T(String var3, String var4) {
      this.f_11147 = var3;
      this.f_11148 = Identifier.fromNamespaceAndPath("dimasik", "textures/masks/" + var4 + "_mask.png");
   }

   public String m_3890() {
      return this.f_11147;
   }

   public Identifier m_3891() {
      return this.f_11148;
   }
}
