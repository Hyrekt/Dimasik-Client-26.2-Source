package dev.dimasik.client.system;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class Class_PBaph5kIoGi7c8fq {
   private Class_PBaph5kIoGi7c8fq.VvfRKWNC7QMqgef6 atlas;
   private Class_PBaph5kIoGi7c8fq.nCxI2GXgF30NoSgA metrics;
   private List<Class_PBaph5kIoGi7c8fq.OrsQZAoSQ9GBVogD> glyphs;
   @SerializedName("kerning")
   private List<Class_PBaph5kIoGi7c8fq.Class_4NaAsyIuT0st42Dr> kernings;

   public List<Class_PBaph5kIoGi7c8fq.OrsQZAoSQ9GBVogD> m_4107() {
      return this.glyphs;
   }

   public List<Class_PBaph5kIoGi7c8fq.Class_4NaAsyIuT0st42Dr> m_4108() {
      return this.kernings;
   }

   public Class_PBaph5kIoGi7c8fq.nCxI2GXgF30NoSgA m_4109() {
      return this.metrics;
   }

   public Class_PBaph5kIoGi7c8fq.VvfRKWNC7QMqgef6 m_4110() {
      return this.atlas;
   }

   public static final class Class_4NaAsyIuT0st42Dr {
      @SerializedName("unicode1")
      public int leftChar;
      @SerializedName("unicode2")
      public int rightChar;
      public float advance;

      public int m_4089() {
         return this.rightChar;
      }

      public float m_4090() {
         return this.advance;
      }

      public int m_4091() {
         return this.leftChar;
      }
   }

   public static final class LZucy3ro1EQvVMkW {
      public float left;
      public float top;
      public float right;
      public float bottom;

      public float m_4092() {
         return this.bottom;
      }

      public float m_4093() {
         return this.top;
      }

      public float m_4094() {
         return this.right;
      }

      public float m_4095() {
         return this.left;
      }
   }

   public static final class OrsQZAoSQ9GBVogD {
      public int unicode;
      public float advance;
      public Class_PBaph5kIoGi7c8fq.LZucy3ro1EQvVMkW planeBounds;
      public Class_PBaph5kIoGi7c8fq.LZucy3ro1EQvVMkW atlasBounds;

      public int m_4096() {
         return this.unicode;
      }

      public float m_4097() {
         return this.advance;
      }

      public Class_PBaph5kIoGi7c8fq.LZucy3ro1EQvVMkW m_4098() {
         return this.planeBounds;
      }

      public Class_PBaph5kIoGi7c8fq.LZucy3ro1EQvVMkW m_4099() {
         return this.atlasBounds;
      }
   }

   public static final class VvfRKWNC7QMqgef6 {
      @SerializedName("distanceRange")
      public float range;
      public float width;
      public float height;

      public float m_4100() {
         return this.height;
      }

      public float m_4101() {
         return this.range;
      }

      public float m_4102() {
         return this.width;
      }
   }

   public static final class nCxI2GXgF30NoSgA {
      public float lineHeight;
      public float ascender;
      public float descender;

      public float m_4103() {
         return this.lineHeight;
      }

      public float m_4104() {
         return this.descender;
      }

      public float m_4105() {
         return this.ascender;
      }

      public float m_4106() {
         return this.lineHeight + this.descender;
      }
   }
}
