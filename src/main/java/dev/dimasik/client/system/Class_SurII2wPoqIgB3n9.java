package dev.dimasik.client.system;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.function.Consumer;

public final class Class_SurII2wPoqIgB3n9 {
   private static final long f_13787 = 200000000L;
   private static final long f_13788 = 1000000000L;
   public static final long f_13789 = 30000000000L;
   private static final long f_13790 = 3000000000L;
   private static final long f_13791 = 300000000L;
   public static final int f_13792 = 32;
   private final String f_13793;
   private final Consumer<Class_qIhWiIlTIdXu1lBw> f_13794;
   private final Map<String, Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L> f_13795 = new HashMap<>();
   private final Map<UUID, Long> f_13796 = new HashMap<>();
   private final Map<UUID, Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH> f_13797 = new HashMap<>();
   private final Map<UUID, Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH> f_13798 = Collections.unmodifiableMap(this.f_13797);
   private final Map<String, Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2> f_13799 = new HashMap<>();
   private final Map<String, Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2> f_13800 = Collections.unmodifiableMap(this.f_13799);
   private Class_8GkQlkemKscT6O8F f_13801;
   private boolean f_13802;
   private final LinkedHashSet<UUID> f_13803 = new LinkedHashSet<>();
   private final LinkedHashMap<UUID, Class_SurII2wPoqIgB3n9.VLvIJ5xVBUVoAz5M> f_13804 = new LinkedHashMap<>();
   private long f_13805;
   private long f_13806;
   private Set<String> f_13807 = Set.of();
   private String f_13808 = "";
   private final Queue<String> f_13809 = new ArrayDeque<>();
   private UUID f_13810;
   private long f_13811;
   private long f_13812;
   private Class_4LPzBXcCHZRVScpS f_13813;
   private Class_4LPzBXcCHZRVScpS f_13814;
   private Class_s9VSzIQN9qIany9o f_13815;
   private Class_s9VSzIQN9qIany9o f_13816;
   private boolean f_13817;
   private long f_13818;
   private long f_13819;
   private static final String f_13820 = "JOIN_REQUEST";
   private static final String f_13821 = "party.";
   private static final String f_13822 = "NOTICE_APPLY";
   private static final String f_13823 = "party.created";
   private static final String f_13824 = "party.joined";
   private static final String f_13825 = "party.leaved";
   private static final String f_13826 = "party.disband";
   private static final String f_13827 = "party.disbanded";
   private static final String f_13828 = "party.deleted";
   private static final String f_13829 = "party.null";
   private static final String f_13830 = "party.kicked";
   private static final String f_13831 = "party.exist";
   private static final String f_13832 = "party.not.found";
   private static final String f_13833 = "party.password.incorrect";
   private static final String f_13834 = "party.already";
   private static final String f_13835 = "JOIN_IGNORED";
   private static final String f_13836 = "PARTY_CONFIRMED";
   private static final String f_13837 = ":";
   private static final String f_13838 = "DIRECTORY_APPLY";
   private static final String f_13839 = "PARTY_REMOVED";
   private static final String f_13840 = "MEMBERS_CLEAR";
   private static final long f_13841 = 3000000000L;
   private static final long f_13842 = 300000000L;
   private static final long f_13843 = 1000000L;
   private static final String f_13844 = "MARKER_PLACE";
   private static final long f_13845 = 30000000000L;
   private static final long f_13846 = 30000000000L;
   private static final String f_13847 = "LOCAL_CONTEXT";
   private static final long f_13848 = 200000000L;
   private static final long f_13849 = 1000000000L;
   private static final String f_13850 = "no-confirmed-local-party";
   private static final String f_13851 = "null-presence";
   private static final String f_13852 = "invalid-presence";
   private static final String f_13853 = "party-mismatch";
   private static final String f_13854 = "self-irc-name";
   private static final String f_13855 = "retired-peer-session";
   private static final long f_13856 = 2000L;
   private static final String f_13857 = "PRESENCE_DROP";
   private static final String f_13858 = "null";
   private static final String f_13859 = "session-receive";
   private static final String f_13860 = "PRESENCE_APPLY";
   private static final String f_13861 = "PRESENCE_DROP";
   private static final String f_13862 = "MEMBER_REMOVE";
   private static final String f_13863 = "MEMBER_INSERT";
   private static final String f_13864 = "COORDINATE_DROP";
   private static final String f_13865 = "COORDINATE_DROP";
   private static final String f_13866 = "COORDINATE_INSERT";
   private static final String f_13867 = "COORDINATE_UPDATE";
   private static final long f_13868 = 1000000L;
   private static final String f_13869 = "MARKER_RECEIVE";
   private static final long f_13870 = 180000L;
   private static final long f_13871 = 1000000L;
   private static final String f_13872 = "session-send";
   private static final String f_13873 = "PRESENCE_SEND";
   private static final long f_13874 = 30000000000L;
   private static final String f_13875 = "MEMBER_REMOVE";
   private static final long f_13876 = 1000000L;
   private static final long f_13877 = 30000000000L;

   private static boolean m_4886(Class_4LPzBXcCHZRVScpS var0, Class_4LPzBXcCHZRVScpS var1) {
      return var0 == var1
         || var0 != null && var1 != null && var0.uuid().equals(var1.uuid()) && var0.x() == var1.x() && var0.y() == var1.y() && var0.z() == var1.z();
   }

   public Class_8GkQlkemKscT6O8F m_4887() {
      return this.f_13801;
   }

   public void m_4888(long var1) {
      if (this.f_13801 != null) {
         this.f_13801 = null;
         this.f_13805 = 0L;
         this.f_13799.remove(m_4906(this.f_13793));
         if (this.m_4918()) {
            this.m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.UPDATE, var1);
         }
      }
   }

   public List<Class_YWsKkU1Pvrv9cQed> m_4889(long var1) {
      ArrayList var3 = new ArrayList();
      Iterator var4 = this.f_13804.values().iterator();

      while (var4.hasNext()) {
         Class_SurII2wPoqIgB3n9.VLvIJ5xVBUVoAz5M var5 = (Class_SurII2wPoqIgB3n9.VLvIJ5xVBUVoAz5M)var4.next();
         if (var1 - var5.received >= f_13841) {
            var4.remove();
         } else if (this.m_4918() && this.m_4904(var5.chat)) {
            var4.remove();
            if (this.m_4928(var5.chat)) {
               var3.add(var5.chat);
            }
         }
      }

      return var3;
   }

   public void m_4890(String var1) {
      HashSet var2 = new HashSet();
      if (var1 != null) {
         for (String var6 : var1.split(f_13837)) {
            if (!var6.isBlank()) {
               var2.add(m_4906(var6));
            }
         }
      }

      this.f_13807 = var2;
      Class_BRwgyCXa8ZQRcJH3.m_2273(f_13838, var2 + this.m_4903());
      if (this.m_4918()) {
         if (var2.contains(m_4906(this.f_13808))) {
            this.f_13817 = true;
         } else if (this.f_13817) {
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_13839, this.f_13808 + "");
            this.m_4914();
         }
      }
   }

   public Map<UUID, Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH> m_4891() {
      return this.f_13798;
   }

   public boolean m_4892(Class_8GkQlkemKscT6O8F var1) {
      return this.f_13813 != null && this.f_13813.active() && var1 != null && this.f_13813.dimension().equals(var1.dimension());
   }

   public void m_4893(UUID var1, double var2, double var4, double var6) {
      if (this.f_13801 != null && var1 != null && var1.equals(this.f_13801.entityUuid())) {
         if (this.f_13801.x() != var2 || this.f_13801.y() != var4 || this.f_13801.z() != var6) {
            Class_8GkQlkemKscT6O8F var8 = this.f_13801.position(var2, var4, var6);
            if (var8.valid()) {
               this.f_13801 = var8;
               this.f_13802 = true;
               Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2 var9 = this.f_13799.get(m_4906(this.f_13793));
               if (var9 != null && var9.f_13783.m_1756().equals(var8.m_1756())) {
                  var9.f_13783 = var8;
               }
            }
         }
      }
   }

   private void m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ var1, long var2) {
      this.f_13802 = false;
      this.f_13812 = var2;
      this.f_13814 = this.f_13813;
      this.f_13816 = this.f_13815;
      Class_8GkQlkemKscT6O8F var4 = this.f_13801 != null && var1 != Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.LEAVE && var2 < this.f_13805
         ? this.f_13801.remaining((int)Math.min(f_13870, Math.max(1L, (this.f_13805 - var2) / f_13871)))
         : null;
      Class_qIhWiIlTIdXu1lBw var5 = new Class_qIhWiIlTIdXu1lBw(
         2,
         this.f_13808,
         this.f_13793,
         this.f_13810,
         ++this.f_13811,
         var1,
         this.f_13813,
         var4,
         var1 == Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.LEAVE ? null : this.f_13815
      );
      if (Class_BRwgyCXa8ZQRcJH3.m_2274(f_13872, var5)) {
         Class_BRwgyCXa8ZQRcJH3.m_2273(f_13873, Class_BRwgyCXa8ZQRcJH3.m_2275(var5));
      }

      this.f_13794.accept(var5);
   }

   public Class_SurII2wPoqIgB3n9(String var1, Consumer<Class_qIhWiIlTIdXu1lBw> var2) {
      this.f_13793 = var1;
      this.f_13794 = var2;
   }

   public void m_4895() {
      this.f_13809.clear();
      this.f_13807 = Set.of();
      this.f_13813 = null;
      this.m_4914();
   }

   public boolean m_4896(String var1, UUID var2, UUID var3) {
      if (this.m_4918() && var1 != null && var2 != null && var3 != null) {
         Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var4 = this.f_13795.get(m_4906(var1));
         return var4 != null && var3.equals(var4.f_13774) && var2.equals(var4.f_13777);
      } else {
         return false;
      }
   }

   public Class_YWsKkU1Pvrv9cQed m_4897(String var1) {
      if (!this.m_4918()) {
         return null;
      }

      Class_YWsKkU1Pvrv9cQed var2 = new Class_YWsKkU1Pvrv9cQed(
         UUID.randomUUID(), this.f_13808, this.f_13793, this.f_13810, Class_tjZiOwNclsIk6HpU.m_8934(), var1
      );
      return var2.valid() ? var2 : null;
   }

   public UUID m_4898() {
      return this.f_13810;
   }

   public boolean m_4899(String var1, double var2, double var4, double var6, int var8, long var9) {
      return this.m_4920(var1, var2, var4, var6, var8, null, null, null, var9);
   }

   public void m_4900(long var1) {
      if (this.m_4918()) {
         this.m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.LEAVE, var1);
      }

      this.f_13809.clear();
      this.m_4914();
   }

   public void m_4901(Class_4LPzBXcCHZRVScpS var1, Class_s9VSzIQN9qIany9o var2, long var3) {
      boolean var5 = this.f_13813 == null
         ? var1 != null
         : var1 == null
            || !this.f_13813.uuid().equals(var1.uuid())
            || !this.f_13813.server().equals(var1.server())
            || !this.f_13813.dimension().equals(var1.dimension());
      this.f_13813 = var1;
      this.f_13815 = var2;
      if (var5) {
         Class_BRwgyCXa8ZQRcJH3.m_2273(f_13847, Class_BRwgyCXa8ZQRcJH3.m_2272(this.f_13813));
      }

      if (this.m_4918()) {
         this.f_13796.values().removeIf(var2x -> var3 - var2x >= f_13877);
         this.f_13795.entrySet().removeIf(var3x -> {
            Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var4 = var3x.getValue();
            if (var3 - var4.f_13776 < f_13874) {
               return false;
            }

            Class_BRwgyCXa8ZQRcJH3.m_2273(f_13875, var3x.getKey() + var4.f_13777 + (var3 - var4.f_13776) / f_13876);
            if (var4.f_13777 != null) {
               this.f_13797.remove(var4.f_13777);
            }

            return true;
         });
         this.f_13799.values().removeIf(var2x -> var3 >= var2x.f_13785);
         boolean var6 = this.f_13801 != null && var3 >= this.f_13805;
         if (var6) {
            this.f_13801 = null;
         }

         if (var5) {
            this.f_13799.remove(m_4906(this.f_13793));
            this.f_13801 = null;
            this.f_13805 = 0L;
            this.m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.HELLO, var3);
         } else if (var6
            || var3 - this.f_13812 >= f_13848
               && (this.f_13802 || var3 - this.f_13812 >= f_13849 || !m_4886(this.f_13813, this.f_13814) || !Objects.equals(this.f_13815, this.f_13816))) {
            this.m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.UPDATE, var3);
         }
      }
   }

   public List<String> m_4902(long var1) {
      if (!this.m_4918()) {
         return List.of();
      }

      TreeSet var3 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

      for (Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var5 : this.f_13795.values()) {
         if (var5.f_13777 != null && var5.f_13778 != null && !var5.f_13778.isBlank() && var1 >= var5.f_13776 && var1 - var5.f_13776 < f_13845) {
            var3.add(var5.f_13778);
         }
      }

      return List.copyOf(var3);
   }

   public String m_4903() {
      return this.m_4918()
         + this.f_13808
         + this.f_13793
         + this.f_13809
         + this.f_13795.size()
         + this.f_13795.keySet()
         + this.f_13797.size()
         + this.f_13818
         + this.f_13819
         + this.f_13811;
   }

   private boolean m_4904(Class_YWsKkU1Pvrv9cQed var1) {
      if (this.f_13793.equalsIgnoreCase(var1.member())) {
         return this.f_13810.equals(var1.session());
      }

      Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var2 = this.f_13795.get(m_4906(var1.member()));
      return var2 != null && var2.f_13774.equals(var1.session());
   }

   public Map<String, Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2> m_4905() {
      return this.f_13800;
   }

   private static String m_4906(String var0) {
      return var0.trim().toLowerCase(Locale.ROOT);
   }

   public void m_4907(String var1, long var2) {
      if (var1.startsWith(f_13821)) {
         Class_BRwgyCXa8ZQRcJH3.m_2273(f_13822, var1 + this.m_4903());
      }

      switch (var1) {
         case f_13823:
         case f_13824:
            String var6 = this.f_13809.poll();
            if (var6 == null) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_13835, var1 + "");
               return;
            }

            this.m_4914();
            this.f_13808 = var6;
            this.f_13810 = UUID.randomUUID();
            this.f_13817 = this.f_13807.contains(m_4906(this.f_13808));
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_13836, this.m_4903() + "");
            this.m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.HELLO, var2);
            break;
         case f_13825:
         case f_13826:
         case f_13827:
         case f_13828:
         case f_13829:
         case f_13830:
            this.m_4914();
            break;
         case f_13831:
         case f_13832:
         case f_13833:
         case f_13834:
            this.f_13809.poll();
      }
   }

   public String m_4909() {
      return this.f_13808;
   }

   public long m_4911(long var1) {
      return this.f_13806 == 0L ? 0L : Math.max(0L, f_13842 - (var1 - this.f_13806));
   }

   public boolean m_4912(Class_4LPzBXcCHZRVScpS var1) {
      return this.f_13813 != null && this.f_13813.active() && var1 != null && var1.active() && this.f_13813.dimension().equals(var1.dimension());
   }

   public String m_4913(UUID var1, String var2) {
      if (!this.m_4918()) {
         return null;
      }

      for (Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var4 : this.f_13795.values()) {
         if (var1 != null && var1.equals(var4.f_13777)) {
            return var4.f_13779;
         }
      }

      if (var2 != null) {
         for (Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var6 : this.f_13795.values()) {
            if (var2.equalsIgnoreCase(var6.f_13778)) {
               return var6.f_13779;
            }
         }
      }

      return null;
   }

   private void m_4914() {
      Class_BRwgyCXa8ZQRcJH3.m_2273(f_13840, this.m_4903());
      this.f_13808 = "";
      this.f_13810 = null;
      this.f_13811 = 0L;
      this.f_13812 = 0L;
      this.f_13814 = null;
      this.f_13815 = null;
      this.f_13816 = null;
      this.f_13817 = false;
      this.f_13795.clear();
      this.f_13796.clear();
      this.f_13797.clear();
      this.f_13799.clear();
      this.f_13803.clear();
      this.f_13804.clear();
      this.f_13801 = null;
      this.f_13805 = 0L;
      this.f_13806 = 0L;
   }

   public boolean m_4915(Class_YWsKkU1Pvrv9cQed var1, long var2) {
      if (!this.m_4918() || var1 == null || !var1.valid() || !this.f_13808.equalsIgnoreCase(var1.party()) || this.f_13803.contains(var1.m_5691())) {
         return false;
      }

      if (!this.m_4904(var1)) {
         if (this.f_13804.size() < 128) {
            this.f_13804.putIfAbsent(var1.m_5691(), new Class_SurII2wPoqIgB3n9.VLvIJ5xVBUVoAz5M(var1, var2));
         }

         return false;
      } else {
         this.f_13804.remove(var1.m_5691());
         return this.m_4928(var1);
      }
   }

   public Class_4LPzBXcCHZRVScpS m_4916(String var1, long var2) {
      if (!this.m_4926(var1)) {
         return null;
      }

      for (Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH var5 : this.f_13797.values()) {
         Class_4LPzBXcCHZRVScpS var6 = var5.f_13768;
         if (var1.equalsIgnoreCase(var6.name())
            && var6.active()
            && var6.valid()
            && var2 >= var5.f_13771
            && var2 - var5.f_13771 < f_13846
            && this.m_4912(var6)
            && this.m_4925(var6.uuid(), var6.name())) {
            return var6;
         }
      }

      return null;
   }

   public Class_s9VSzIQN9qIany9o m_4917(UUID var1, String var2) {
      if (!this.m_4918()) {
         return null;
      }

      for (Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var4 : this.f_13795.values()) {
         if (var1 != null && var1.equals(var4.f_13777) || var2 != null && var2.equalsIgnoreCase(var4.f_13778)) {
            return var4.f_13780;
         }
      }

      return null;
   }

   public boolean m_4918() {
      return this.f_13810 != null;
   }

   public boolean m_4919(String var1) {
      if (this.f_13809.isEmpty() && Class_j5mXQe9R4XoxPbCp.m_7364(var1)) {
         this.f_13809.add(var1);
         Class_BRwgyCXa8ZQRcJH3.m_2273(f_13820, var1 + this.m_4903());
         return true;
      } else {
         return false;
      }
   }

   public boolean m_4920(String var1, double var2, double var4, double var6, int var8, UUID var9, String var10, String var11, long var12) {
      if (this.m_4918() && this.f_13813 != null && this.f_13813.active() && this.m_4911(var12) <= 0L) {
         Class_8GkQlkemKscT6O8F var14 = new Class_8GkQlkemKscT6O8F(
            UUID.randomUUID(), var1, this.f_13813.server(), this.f_13813.dimension(), var2, var4, var6, var8, var9, var10, var11
         );
         String var15 = m_4906(this.f_13793);
         if (var14.valid() && (this.f_13799.containsKey(var15) || this.f_13799.size() < 32)) {
            this.f_13801 = var14;
            this.f_13805 = var12 + var8 * f_13843;
            this.f_13806 = var12;
            this.f_13799.put(var15, new Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2(this.f_13793, this.f_13813.name(), var14, var12));
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_13844, this.f_13793 + var14.m_1756() + var14.name());
            this.m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.UPDATE, var12);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void m_4921() {
      this.f_13809.clear();
   }

   public boolean m_4922(Class_YWsKkU1Pvrv9cQed var1) {
      return this.m_4915(var1, System.nanoTime());
   }

   public void m_4924(Class_qIhWiIlTIdXu1lBw var1, long var2) {
      this.f_13818++;
      String var4 = !this.m_4918()
         ? f_13850
         : (
            var1 == null
               ? f_13851
               : (
                  !var1.valid()
                     ? f_13852
                     : (
                        !this.f_13808.equalsIgnoreCase(var1.party())
                           ? f_13853
                           : (this.f_13793.equalsIgnoreCase(var1.member()) ? f_13854 : (this.f_13796.containsKey(var1.session()) ? f_13855 : null))
                     )
               )
         );
      if (var4 != null) {
         if (Class_BRwgyCXa8ZQRcJH3.m_2270(var4 + "", f_13856)) {
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_13857, var4 + this.m_4903() + (var1 == null ? f_13858 : Class_BRwgyCXa8ZQRcJH3.m_2275(var1)));
         }
      } else {
         boolean var5 = Class_BRwgyCXa8ZQRcJH3.m_2274(f_13859, var1);
         if (var5) {
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_13860, Class_BRwgyCXa8ZQRcJH3.m_2275(var1));
         }

         String var6 = m_4906(var1.member());
         Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var7 = this.f_13795.get(var6);
         if (var7 != null && var7.f_13774.equals(var1.session()) && var1.sequence() <= var7.f_13775) {
            if (var5) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_13861, var7.f_13775 + Class_BRwgyCXa8ZQRcJH3.m_2275(var1));
            }
         } else {
            this.f_13819++;
            if (var1.kind() == Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.LEAVE) {
               this.f_13796.put(var1.session(), var2);
               if (var7 == null || var7.f_13774.equals(var1.session())) {
                  this.f_13799.remove(var6);
               }

               if (var7 != null && var7.f_13774.equals(var1.session())) {
                  if (var7.f_13777 != null) {
                     this.f_13797.remove(var7.f_13777);
                  }

                  this.f_13795.remove(var6);
                  this.f_13799.remove(var6);
                  Class_BRwgyCXa8ZQRcJH3.m_2273(f_13862, var6 + var7.f_13777.toString());
               }
            } else {
               boolean var8 = var7 == null || !var7.f_13774.equals(var1.session());
               if (var8) {
                  if (var7 != null) {
                     this.f_13796.put(var7.f_13774, var2);
                     if (var7.f_13777 != null) {
                        this.f_13797.remove(var7.f_13777);
                     }

                     this.f_13799.remove(var6);
                  }

                  var7 = new Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L(var1.session());
                  this.f_13795.put(var6, var7);
                  Class_BRwgyCXa8ZQRcJH3.m_2273(f_13863, var6 + var7.f_13774 + this.f_13795.size());
               }

               var7.f_13775 = var1.sequence();
               var7.f_13776 = var2;
               var7.f_13779 = var1.member();
               var7.f_13780 = var1.cosmetics();
               Class_4LPzBXcCHZRVScpS var9 = var1.position();
               if (var9 != null && var9.active()) {
                  if (var7.f_13777 != null && !var7.f_13777.equals(var9.uuid())) {
                     this.f_13797.remove(var7.f_13777);
                  }

                  var7.f_13777 = var9.uuid();
                  var7.f_13778 = var9.name();
                  if (this.f_13813 != null && this.f_13813.uuid().equals(var9.uuid())) {
                     this.f_13797.remove(var9.uuid());
                     if (var5) {
                        Class_BRwgyCXa8ZQRcJH3.m_2273(f_13865, var6 + Class_BRwgyCXa8ZQRcJH3.m_2272(this.f_13813) + Class_BRwgyCXa8ZQRcJH3.m_2272(var9));
                     }
                  } else {
                     Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH var10 = this.f_13797.get(var9.uuid());
                     if (var10 == null) {
                        this.f_13797.put(var9.uuid(), new Class_SurII2wPoqIgB3n9.LSyoMROniHgdEQeH(var9, var2));
                     } else {
                        var10.m_4880(var9, var2);
                     }

                     if (var10 == null || var5) {
                        Class_BRwgyCXa8ZQRcJH3.m_2273(
                           var10 == null ? f_13866 : f_13867, var6 + var1.sequence() + this.f_13797.size() + Class_BRwgyCXa8ZQRcJH3.m_2272(var9)
                        );
                     }
                  }
               } else {
                  if (var7.f_13777 != null) {
                     this.f_13797.remove(var7.f_13777);
                  }

                  var7.f_13777 = null;
                  var7.f_13778 = null;
                  if (var5) {
                     Class_BRwgyCXa8ZQRcJH3.m_2273(f_13864, var6 + "");
                  }
               }

               Class_8GkQlkemKscT6O8F var12 = var1.marker();
               if (var12 == null) {
                  this.f_13799.remove(var6);
               } else {
                  Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2 var11 = this.f_13799.get(var6);
                  if (var11 != null && var11.f_13783.m_1756().equals(var12.m_1756())) {
                     var11.f_13785 = Math.min(var11.f_13785, var2 + var12.remainingMillis() * f_13868);
                     if (var11.f_13783.entityUuid() != null
                        && var11.f_13783.entityUuid().equals(var12.entityUuid())
                        && var11.f_13783.entityType().equals(var12.entityType())
                        && var11.f_13783.dimension().equals(var12.dimension())) {
                        var11.f_13783 = var12;
                     }
                  } else if (var11 != null || this.f_13799.size() < 32) {
                     this.f_13799.put(var6, new Class_SurII2wPoqIgB3n9.zTgXnNfGgpaJC7i2(var1.member(), var9.name(), var12, var2));
                     Class_BRwgyCXa8ZQRcJH3.m_2273(f_13869, var6 + var12.m_1756() + var12.name());
                  }
               }

               if (var1.kind() == Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.HELLO || var8) {
                  this.m_4894(Class_qIhWiIlTIdXu1lBw.x8T2PZpvZGWJJnxJ.UPDATE, var2);
               }
            }
         }
      }
   }

   public boolean m_4925(UUID var1, String var2) {
      for (Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var4 : this.f_13795.values()) {
         if (var1.equals(var4.f_13777) || var2.equalsIgnoreCase(var4.f_13778)) {
            return true;
         }
      }

      return false;
   }

   public boolean m_4926(String var1) {
      if (this.m_4918() && var1 != null) {
         for (Class_SurII2wPoqIgB3n9.pgTtmfK5WYNQVc6L var3 : this.f_13795.values()) {
            if (var1.equalsIgnoreCase(var3.f_13778)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void m_4927(Class_4LPzBXcCHZRVScpS var1, long var2) {
      this.m_4901(var1, null, var2);
   }

   private boolean m_4928(Class_YWsKkU1Pvrv9cQed var1) {
      if (!this.f_13803.add(var1.m_5691())) {
         return false;
      }

      if (this.f_13803.size() > 128) {
         this.f_13803.removeFirst();
      }

      return true;
   }

   public static final class LSyoMROniHgdEQeH {
      public Class_4LPzBXcCHZRVScpS f_13768;
      public double f_13769;
      public double f_13770;
      public long f_13771;
      public static final double f_13772 = 4096.0;
      public static final double f_13773 = 2.0E8;

      public Class_4LPzBXcCHZRVScpS m_4876() {
         return this.f_13768;
      }

      public LSyoMROniHgdEQeH(Class_4LPzBXcCHZRVScpS var1, long var2) {
         this.f_13768 = var1;
         this.f_13769 = var1.x();
         this.f_13770 = var1.z();
         this.f_13771 = var2;
      }

      public double m_4877(long var1) {
         return Math.clamp((var1 - this.f_13771) / f_13773, 0.0, 1.0);
      }

      public double m_4878(long var1) {
         return this.f_13769 + (this.f_13768.x() - this.f_13769) * this.m_4877(var1);
      }

      public double m_4879(long var1) {
         return this.f_13770 + (this.f_13768.z() - this.f_13770) * this.m_4877(var1);
      }

      public void m_4880(Class_4LPzBXcCHZRVScpS var1, long var2) {
         this.f_13769 = this.m_4878(var2);
         this.f_13770 = this.m_4879(var2);
         double var4 = var1.x() - this.f_13768.x();
         double var6 = var1.z() - this.f_13768.z();
         if (!this.f_13768.server().equals(var1.server()) || !this.f_13768.dimension().equals(var1.dimension()) || var4 * var4 + var6 * var6 > f_13772) {
            this.f_13769 = var1.x();
            this.f_13770 = var1.z();
         }

         this.f_13768 = var1;
         this.f_13771 = var2;
      }
   }

   private record VLvIJ5xVBUVoAz5M(Class_YWsKkU1Pvrv9cQed chat, long received) {
   }

   private static final class pgTtmfK5WYNQVc6L {
      public final UUID f_13774;
      public long f_13775;
      public long f_13776;
      public UUID f_13777;
      public String f_13778;
      public String f_13779;
      public Class_s9VSzIQN9qIany9o f_13780;

      public pgTtmfK5WYNQVc6L(UUID var1) {
         this.f_13774 = var1;
      }
   }

   public static final class zTgXnNfGgpaJC7i2 {
      public final String f_13781;
      public final String f_13782;
      public Class_8GkQlkemKscT6O8F f_13783;
      public final long f_13784;
      public long f_13785;
      public static final long f_13786 = 1000000L;

      public long m_4881() {
         return this.f_13784;
      }

      public zTgXnNfGgpaJC7i2(String var1, String var2, Class_8GkQlkemKscT6O8F var3, long var4) {
         this.f_13781 = var1;
         this.f_13782 = var2;
         this.f_13783 = var3;
         this.f_13784 = var4;
         this.f_13785 = var4 + var3.remainingMillis() * f_13786;
      }

      public long m_4882() {
         return this.f_13785;
      }

      public String m_4883() {
         return this.f_13781;
      }

      public Class_8GkQlkemKscT6O8F m_4884() {
         return this.f_13783;
      }

      public String m_4885() {
         return this.f_13782;
      }
   }
}
