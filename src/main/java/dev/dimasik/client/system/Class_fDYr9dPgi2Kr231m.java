package dev.dimasik.client.system;

import java.util.regex.Pattern;
import lombok.Generated;

public final class Class_fDYr9dPgi2Kr231m {
   private static final Pattern f_19344 = Pattern.compile(Class_fDYr9dPgi2Kr231m.f_19347);
   private static final Pattern f_19345 = Pattern.compile(Class_fDYr9dPgi2Kr231m.f_19348, 66);
   private static final String f_19346 = "This is a utility class and cannot be instantiated";
   private static final String f_19347 = "^\\w{3,16}$";
   private static final String f_19348 = ".*(owner|admin|moder|helper|curator|support|staff|куратор|модер|админ|хелпер|поддержка|сотрудник|стаж[её]р).*";

   @Generated
   public static Pattern m_6461() {
      return f_19345;
   }

   @Generated
   public static Pattern m_6462() {
      return f_19344;
   }

   @Generated
   private Class_fDYr9dPgi2Kr231m() {
      throw new UnsupportedOperationException(f_19346);
   }
}
