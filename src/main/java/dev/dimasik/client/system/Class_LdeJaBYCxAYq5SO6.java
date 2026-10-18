package dev.dimasik.client.system;

public enum Class_LdeJaBYCxAYq5SO6 {
   LEATHER("Кожаный", 10511680),
   WHITE("Белый", 16383998),
   ORANGE("Оранжевый", 16351261),
   MAGENTA("Пурпурный", 13061821),
   LIGHT_BLUE("Голубой", 3847130),
   YELLOW("Жёлтый", 16701501),
   LIME("Лаймовый", 8439583),
   PINK("Розовый", 15961002),
   GRAY("Серый", 4673362),
   LIGHT_GRAY("Светло-серый", 10329495),
   CYAN("Бирюзовый", 1481884),
   PURPLE("Фиолетовый", 8991416),
   BLUE("Синий", 3949738),
   BROWN("Коричневый", 8606770),
   GREEN("Зелёный", 6192150),
   RED("Красный", 11546150),
   BLACK("Чёрный", 1908001);

   private final String f_10617;
   private final int f_10618;

   Class_LdeJaBYCxAYq5SO6(String var3, int var4) {
      this.f_10617 = var3;
      this.f_10618 = var4;
   }

   public String m_3638() {
      return this.f_10617;
   }

   public float m_3639() {
      return (this.f_10618 >> 16 & 0xFF) / 255.0F;
   }

   public float m_3640() {
      return (this.f_10618 >> 8 & 0xFF) / 255.0F;
   }

   public float m_3641() {
      return (this.f_10618 & 0xFF) / 255.0F;
   }
}
