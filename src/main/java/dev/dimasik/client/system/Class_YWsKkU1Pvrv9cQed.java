package dev.dimasik.client.system;

import com.google.gson.Gson;
import java.util.UUID;

public record Class_YWsKkU1Pvrv9cQed(UUID id, String party, String member, UUID session, String role, String text) {
   private static final Gson GSON = new Gson();

   public String encode() {
      return GSON.toJson(this);
   }

   public UUID m_5691() {
      return this.id;
   }

   public static Class_YWsKkU1Pvrv9cQed decode(String var0) {
      if (var0 != null && var0.length() <= 4096) {
         try {
            Class_YWsKkU1Pvrv9cQed var1 = (Class_YWsKkU1Pvrv9cQed)GSON.fromJson(var0, Class_YWsKkU1Pvrv9cQed.class);
            return var1 != null && var1.valid() ? var1 : null;
         } catch (RuntimeException var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean valid() {
      return this.id != null
         && this.session != null
         && this.party != null
         && !this.party.isBlank()
         && this.party.length() <= 128
         && this.member != null
         && !this.member.isBlank()
         && this.member.length() <= 128
         && Class_tjZiOwNclsIk6HpU.m_8937(this.role)
         && this.text != null
         && !this.text.isBlank()
         && this.text.length() <= 512
         && this.text.codePoints().noneMatch(var0 -> Character.isISOControl(var0) || var0 == 167)
         && this.member.codePoints().noneMatch(var0 -> Character.isISOControl(var0) || var0 == 167);
   }

   public Class_YWsKkU1Pvrv9cQed(UUID var1, String var2, String var3, UUID var4, String var5) {
      this(var1, var2, var3, var4, null, var5);
   }
}
