package dev.dimasik.client.system;

public final class Class_j5mXQe9R4XoxPbCp {
   private Class_j5mXQe9R4XoxPbCp.Class_9aKAwHTXkq8bnrnG f_24674;
   private Class_j5mXQe9R4XoxPbCp.AMOkMd2svcTT0tRb f_24675;
   private boolean f_24676;
   private static final String f_24677 = "[A-Za-z0-9_.+\\-]{1,128}";
   private static final String f_24678 = "party.created";
   private static final String f_24679 = "party.joined";
   private static final String f_24680 = "party.already";
   private static final String f_24681 = "party.joined";
   private static final String f_24682 = "party.leaved";
   private static final String f_24683 = "party.disband";
   private static final String f_24684 = "party.disbanded";
   private static final String f_24685 = "party.deleted";
   private static final String f_24686 = "party.null";
   private static final String f_24687 = "party.kicked";
   private static final String f_24688 = "party.not.owner";
   private static final String f_24689 = "unknown.data";
   private static final String f_24690 = "party.not.owner";
   private static final String f_24691 = "party.not.found";
   private static final String f_24692 = "party.exist";
   private static final String f_24693 = "party.password.incorrect";
   private static final String f_24694 = "party.already";
   private static final long f_24695 = 5000000000L;

   public void m_7357(Class_SurII2wPoqIgB3n9 var1, String var2, long var3) {
      Class_j5mXQe9R4XoxPbCp.Class_9aKAwHTXkq8bnrnG var5 = this.f_24674;
      boolean var6 = var2.equals(f_24678) || var2.equals(f_24679);
      if (var5 != null && var5.restoring && var2.equals(f_24680) && this.f_24675 != null && this.f_24675.name.equalsIgnoreCase(var5.credentials.name)) {
         var2 = f_24681;
         var6 = true;
      }

      var1.m_4907(var2, var3);

      boolean var7 = switch (var2) {
         case f_24682, f_24683, f_24684, f_24685, f_24686, f_24687 -> true;
         default -> false;
      };
      if (var7) {
         this.f_24674 = null;
         this.f_24675 = null;
         this.f_24676 = false;
         var1.m_4921();
      } else if (var5 != null && var5.joining() && var6 && var1.m_4918()) {
         this.f_24675 = var5.credentials;
         this.f_24676 = false;
         this.f_24674 = null;
      } else if (var5 != null && this.m_7365(var2)) {
         Class_j5mXQe9R4XoxPbCp.AMOkMd2svcTT0tRb var10 = this.f_24675;
         this.m_7360(var1, var5);
         if (!var5.joining() && var2.equals(f_24688) && var1.m_4918()) {
            this.f_24675 = var10;
         }
      }
   }

   public Class_j5mXQe9R4XoxPbCp.Class_9aKAwHTXkq8bnrnG m_7358(
      Class_SurII2wPoqIgB3n9 var1, Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku var2, String var3, String var4, boolean var5, long var6
   ) {
      if (this.f_24674 != null) {
         return null;
      }

      boolean var8 = var2 == Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.JOIN || var2 == Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.CREATE;
      if (!var8 || m_7364(var3) && m_7359(var4) && var1.m_4919(var3)) {
         this.f_24674 = new Class_j5mXQe9R4XoxPbCp.Class_9aKAwHTXkq8bnrnG(
            var2, var8 ? new Class_j5mXQe9R4XoxPbCp.AMOkMd2svcTT0tRb(var3, var4) : null, var6, var5
         );
         if (!var8) {
            this.f_24676 = false;
         }

         return this.f_24674;
      } else {
         return null;
      }
   }

   public static boolean m_7359(String var0) {
      return var0 != null && (var0.isEmpty() || m_7364(var0));
   }

   public boolean m_7360(Class_SurII2wPoqIgB3n9 var1, Class_j5mXQe9R4XoxPbCp.Class_9aKAwHTXkq8bnrnG var2) {
      if (var2 != null && this.f_24674 == var2) {
         this.f_24674 = null;
         var1.m_4921();
         if (var2.restoring || !var2.joining()) {
            this.f_24675 = null;
            this.f_24676 = false;
         }

         return true;
      } else {
         return false;
      }
   }

   public void m_7361() {
      this.f_24675 = null;
      this.f_24676 = false;
   }

   public Class_j5mXQe9R4XoxPbCp.Class_9aKAwHTXkq8bnrnG m_7362() {
      return this.f_24674;
   }

   public void m_7363(Class_SurII2wPoqIgB3n9 var1) {
      if (this.f_24674 != null && !this.f_24674.joining()) {
         this.f_24675 = null;
      }

      this.f_24674 = null;
      this.f_24676 = this.f_24675 != null;
      var1.m_4895();
   }

   public static boolean m_7364(String var0) {
      return var0 != null && var0.matches(f_24677);
   }

   private boolean m_7365(String var1) {
      return var1.equals(f_24689) || var1.equals(f_24690) || var1.equals(f_24691) || var1.equals(f_24692) || var1.equals(f_24693) || var1.equals(f_24694);
   }

   public Class_j5mXQe9R4XoxPbCp.AMOkMd2svcTT0tRb m_7366() {
      return this.f_24676 ? this.f_24675 : null;
   }

   public boolean m_7367(long var1) {
      return this.f_24674 != null && var1 - this.f_24674.started >= f_24695;
   }

   public record AMOkMd2svcTT0tRb(String name, String password) {
   }

   public enum Class_1gqYQOQvWPDqM8ku {
      JOIN,
      CREATE,
      LEAVE,
      DISBAND;
   }

   public record Class_9aKAwHTXkq8bnrnG(
      Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku action, Class_j5mXQe9R4XoxPbCp.AMOkMd2svcTT0tRb credentials, long started, boolean restoring
   ) {
      public boolean joining() {
         return this.action == Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.JOIN || this.action == Class_j5mXQe9R4XoxPbCp.Class_1gqYQOQvWPDqM8ku.CREATE;
      }
   }
}
