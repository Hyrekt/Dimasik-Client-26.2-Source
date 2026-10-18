package dev.dimasik.client.system;

import com.google.gson.Gson;
import java.util.UUID;

public record Class_qIhWiIlTIdXu1lBw(
   int version,
   String party,
   String member,
   UUID session,
   long sequence,
   Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ kind,
   Class_4LPzBXcCHZRVScpS position,
   Class_8GkQlkemKscT6O8F marker,
   Class_s9VSzIQN9qIany9o cosmetics
) {
   private static final Gson GSON = new Gson();

   public static Class_qIhWiIlTIdXu1lBw decode(String var0) {
      if (var0 != null && var0.length() <= 4096) {
         try {
            Class_qIhWiIlTIdXu1lBw var1 = (Class_qIhWiIlTIdXu1lBw)GSON.fromJson(var0, Class_qIhWiIlTIdXu1lBw.class);
            if (var1 != null && var1.valid()) {
               return var1;
            }

            if (Class_BRwgyCXa8ZQRcJH3.m_2270("decode-invalid", 5000L)) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(
                  "DECODE_DROP",
                  "reason=invalid-fields " + (var1 == null ? "presence=null" : "version=" + var1.version() + " " + Class_BRwgyCXa8ZQRcJH3.m_2275(var1))
               );
            }

            return null;
         } catch (RuntimeException var2) {
            if (Class_BRwgyCXa8ZQRcJH3.m_2270("decode-json", 5000L)) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(
                  "DECODE_DROP",
                  "reason="
                     + var2.getClass().getSimpleName()
                     + " payloadLength="
                     + var0.length()
                     + " startsWithJsonObject="
                     + var0.stripLeading().startsWith("{")
               );
            }

            return null;
         }
      } else {
         if (Class_BRwgyCXa8ZQRcJH3.m_2270("decode-size", 5000L)) {
            Class_BRwgyCXa8ZQRcJH3.m_2273("DECODE_DROP", "reason=null-or-oversized-payload");
         }

         return null;
      }
   }

   public Class_qIhWiIlTIdXu1lBw(
      int var1, String var2, String var3, UUID var4, long var5, Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ var7, Class_4LPzBXcCHZRVScpS var8
   ) {
      this(var1, var2, var3, var4, var5, var7, var8, null, null);
   }

   public String encode() {
      return GSON.toJson(this);
   }

   public boolean valid() {
      return this.version == 2
         && this.party != null
         && !this.party.isBlank()
         && this.party.length() <= 128
         && this.member != null
         && !this.member.isBlank()
         && this.member.length() <= 128
         && this.session != null
         && this.sequence > 0L
         && this.kind != null
         && (this.position == null || this.position.valid() && this.member.equalsIgnoreCase(this.position.member()))
         && (this.cosmetics == null || this.kind != Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.LEAVE && this.cosmetics.valid())
         && (
            this.marker == null
               || this.kind != Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.LEAVE
                  && this.marker.valid()
                  && this.position != null
                  && this.position.active()
                  && this.marker.server().equals(this.position.server())
                  && this.marker.dimension().equals(this.position.dimension())
         );
   }

   public Class_qIhWiIlTIdXu1lBw(
      int var1,
      String var2,
      String var3,
      UUID var4,
      long var5,
      Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ var7,
      Class_4LPzBXcCHZRVScpS var8,
      Class_8GkQlkemKscT6O8F var9
   ) {
      this(var1, var2, var3, var4, var5, var7, var8, var9, null);
   }

   public enum x8T2PZpvZGWJJnxJ {
      HELLO,
      UPDATE,
      LEAVE;
   }
}
