package dev.dimasik.client.system;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public final class Class_gXPXh2FDkuYBeJW2 {
   private static final String f_20866 = "baritone";
   private static final String f_20867 = "baritone";
   private static final String f_20868 = "baritone-api";
   private static final String f_20869 = "baritone-meteor";
   private static final String f_20870 = "baritone";
   private static final String f_20871 = "getPathingBehavior";
   private static final String f_20872 = "cancelEverything";
   private static final String f_20873 = "isActive";
   private static final String f_20874 = "isPaused";
   private static final String f_20875 = "pause";
   private static final String f_20876 = "resume";
   private static final String f_20877 = "getInputOverrideHandler";
   private static final String f_20878 = "clearAllKeys";
   private static final String f_20879 = "getInputOverrideHandler";
   private static final String f_20880 = "baritone.api.utils.input.Input";
   private static final String f_20881 = "SNEAK";
   private static final String f_20882 = "setInputForceState";
   private static final String f_20883 = "Baritone недоступен";
   private static final String f_20884 = "baritone.api.pathing.goals.GoalNear";
   private static final String f_20885 = "getCustomGoalProcess";
   private static final String f_20886 = "setGoalAndPath";
   private static final String f_20887 = "baritone.api.pathing.goals.Goal";
   private static final String f_20888 = "baritone.api.pathing.goals.GoalBlock";
   private static final String f_20889 = "getCustomGoalProcess";
   private static final String f_20890 = "setGoalAndPath";
   private static final String f_20891 = "baritone.api.pathing.goals.Goal";
   private static final String f_20892 = "getPathingBehavior";
   private static final String f_20893 = "isPathing";
   private static final String f_20894 = "BuilderProcess недоступен (Baritone не инициализирован?)";
   private static final String f_20895 = "baritone.api.schematic.ISchematic";
   private static final String f_20896 = "Не найден метод build(String, ISchematic, Vec3i)";
   private static final String f_20897 = "widthX";
   private static final String f_20898 = "heightY";
   private static final String f_20899 = "lengthZ";
   private static final String f_20900 = "reset";
   private static final String f_20901 = "inSchematic";
   private static final String f_20902 = "desiredState";
   private static final String f_20903 = "size";
   private static final String f_20904 = "toString";
   private static final String f_20905 = "hashCode";
   private static final String f_20906 = "equals";
   private static final String f_20907 = "X";
   private static final String f_20908 = "Y";
   private static final String f_20909 = "Z";
   private static final String f_20910 = "AutoBrewerSchematic";
   private static final String f_20911 = "allowPlace";
   private static final String f_20912 = "allowBreak";
   private static final String f_20913 = "allowInventory";
   private static final String f_20914 = "buildInLayers";
   private static final String f_20915 = "layerOrder";
   private static final String f_20916 = "mapArtMode";
   private static final String f_20917 = "okIfWater";
   private static final String f_20918 = "distanceTrim";
   private static final String f_20919 = "rightClickContainerOnArrival";
   private static final String f_20920 = "Baritone не установлен";
   private static final String f_20921 = "Нечего добывать";
   private static final String f_20922 = "Baritone недоступен";
   private static final String f_20923 = "getMineProcess";
   private static final String f_20924 = "MineProcess недоступен";
   private static final String f_20925 = "mineByName";
   private static final String f_20926 = "net.minecraft.block.Block";
   private static final String f_20927 = "mine";
   private static final String f_20928 = "mineByName";
   private static final String f_20929 = "getMineProcess";
   private static final String f_20930 = "isActive";
   private static final String f_20931 = "getMineProcess";
   private static final String f_20932 = "displayName";
   private static final String f_20933 = "filter";
   private static final String f_20934 = "BlockOptionalMetaLookup";
   private static final String f_20935 = "getBlock";
   private static final String f_20936 = "blocks";
   private static final String f_20937 = "Block\\{(?:minecraft:)?([a-z0-9_/]+)";
   private static final String f_20938 = "air";
   private static final String f_20939 = "air";
   private static final String f_20940 = "allowBreak";
   private static final String f_20941 = "allowPlace";
   private static final String f_20942 = "allowInventory";
   private static final String f_20943 = "exploreForBlocks";
   private static final String f_20944 = "net.minecraft.registry.Registries";
   private static final String f_20945 = "BLOCK";
   private static final String f_20946 = "net.minecraft.util.Identifier";
   private static final String f_20947 = "of";
   private static final String f_20948 = "get";
   private static final String f_20949 = ":";
   private static final String f_20950 = "baritone.api.pathing.goals.GoalBlock";
   private static final String f_20951 = "getCustomGoalProcess";
   private static final String f_20952 = "setGoalAndPath";
   private static final String f_20953 = "baritone.api.pathing.goals.Goal";
   private static final String f_20954 = "value";
   private static final String f_20955 = "blocksToAvoid";
   private static final String f_20956 = "value";
   private static final String f_20957 = "baritone.api.BaritoneAPI";
   private static final String f_20958 = "getSettings";
   private static final String f_20959 = "build";
   private static final String f_20960 = "baritone.api.BaritoneAPI";
   private static final String f_20961 = "getProvider";
   private static final String f_20962 = "getPrimaryBaritone";
   private static final String f_20963 = "getBuilderProcess";

   private static Object m_6788(String var0) throws Exception {
      Class var1 = Class.forName(f_20957);
      Object var2 = var1.getMethod(f_20958).invoke(null);
      return var2.getClass().getField(var0).get(var2);
   }

   public static void m_6789() {
      m_6798(f_20911, true);
      m_6798(f_20912, true);
      m_6798(f_20913, true);
      m_6798(f_20914, true);
      m_6798(f_20915, false);
      m_6798(f_20916, false);
      m_6798(f_20917, true);
      m_6798(f_20918, false);
      m_6798(f_20919, false);
   }

   public static boolean m_6790() {
      try {
         Object var0 = m_6804();
         if (var0 == null) {
            return false;
         }

         Object var1 = var0.getClass().getMethod(f_20892).invoke(var0);
         Object var2 = var1.getClass().getMethod(f_20893).invoke(var1);
         return Boolean.TRUE.equals(var2);
      } catch (Throwable var3) {
         return false;
      }
   }

   private static void m_6791(Identifier var0, Set<String> var1) {
      if (var0 != null) {
         String var2 = var0.getPath();
         if (var2 != null && !var2.isEmpty() && !f_20939.equals(var2)) {
            var1.add(var2);
         }
      }
   }

   public static boolean m_6792() {
      try {
         Object var0 = m_6803();
         if (var0 == null) {
            return false;
         }

         Object var1 = var0.getClass().getMethod(f_20874).invoke(var0);
         return Boolean.TRUE.equals(var1);
      } catch (Throwable var2) {
         return false;
      }
   }

   public static void m_6793(String var0, Object var1) {
      try {
         Object var2 = m_6788(var0);
         if (var2 == null) {
            return;
         }

         Field var3 = var2.getClass().getField(f_20954);
         Object var4 = var3.get(var2);
         if (var4 instanceof Boolean && var1 instanceof Boolean) {
            var3.set(var2, var1);
         } else if (var4 instanceof Integer && var1 instanceof Number var5) {
            var3.set(var2, var5.intValue());
         } else if (var4 instanceof Float && var1 instanceof Number var6) {
            var3.set(var2, var6.floatValue());
         } else if (var4 instanceof Double && var1 instanceof Number var7) {
            var3.set(var2, var7.doubleValue());
         } else if (var4 != null && var1 != null && var4.getClass().isInstance(var1)) {
            var3.set(var2, var1);
         }
      } catch (Throwable var8) {
      }
   }

   private static void m_6794(String var0, boolean var1) {
      m_6793(var0, var1);
   }

   private static Object m_6795(String[] var0, Class<?> var1) {
      ArrayList var2 = new ArrayList();

      try {
         Class var3 = Class.forName(f_20944);
         Object var4 = var3.getField(f_20945).get(null);
         Class var5 = Class.forName(f_20946);
         Method var6 = null;

         for (Method var10 : var5.getMethods()) {
            if (var10.getName().equals(f_20947) && var10.getParameterCount() == 1 && var10.getParameterTypes()[0] == String.class) {
               var6 = var10;
               break;
            }
         }

         Method var18 = null;

         for (Method var11 : var4.getClass().getMethods()) {
            if (var11.getName().equals(f_20948) && var11.getParameterCount() == 1) {
               var18 = var11;
               break;
            }
         }

         if (var6 == null || var18 == null) {
            return Array.newInstance(var1, 0);
         }

         for (String var25 : var0) {
            String var12 = var25.contains(f_20949) ? var25 : var25 + "";
            Object var13 = var6.invoke(null, var12);
            Object var14 = var18.invoke(var4, var13);
            if (var14 != null && var1.isInstance(var14)) {
               var2.add(var14);
            }
         }
      } catch (Throwable var15) {
      }

      Object var16 = Array.newInstance(var1, var2.size());

      for (int var17 = 0; var17 < var2.size(); var17++) {
         Array.set(var16, var17, var2.get(var17));
      }

      return var16;
   }

   public static void m_6796(int var0, int var1, int var2) {
      try {
         Object var3 = m_6804();
         if (var3 == null) {
            return;
         }

         ClassLoader var4 = var3.getClass().getClassLoader();
         Class var5 = Class.forName(f_20950, true, var4);
         Object var6 = var5.getConstructor(int.class, int.class, int.class).newInstance(var0, var1, var2);
         Object var7 = var3.getClass().getMethod(f_20951).invoke(var3);
         var7.getClass().getMethod(f_20952, Class.forName(f_20953, true, var4)).invoke(var7, var6);
      } catch (Throwable var8) {
      }
   }

   private static Object m_6797(Class_gXPXh2FDkuYBeJW2.N48QC1or2G8EIFjb var0, Method var1, Object[] var2) {
      String var3 = var1.getName();
      Class var4 = var1.getReturnType();

      try {
         Object var5 = switch (var3) {
            case f_20897 -> var0.m_4967();
            case f_20898 -> var0.m_4971();
            case f_20899 -> var0.m_4953();
            case f_20900 -> {
               var0.m_6787();
               yield null;
            }
            case f_20901 -> {
               int var16 = ((Number)var2[0]).intValue();
               int var18 = ((Number)var2[1]).intValue();
               int var21 = ((Number)var2[2]).intValue();
               yield var0.m_4958(var16, var18, var21);
            }
            case f_20902 -> {
               int var15 = ((Number)var2[0]).intValue();
               int var17 = ((Number)var2[1]).intValue();
               int var20 = ((Number)var2[2]).intValue();
               BlockState var22 = var2.length > 3 && var2[3] instanceof BlockState var12 ? var12 : null;
               List var23 = var2.length > 4 ? m_6801(var2[4]) : List.of();
               BlockState var24 = var0.m_4950(var15, var17, var20, var22, var23);
               yield var24 != null ? var24 : Blocks.AIR.defaultBlockState();
            }
            case f_20903 -> {
               Object var8 = var2[0];
               String var9 = var8 instanceof Enum var10 ? var10.name() : String.valueOf(var8);
               switch (var9) {
                  case f_20907:
                     yield var0.m_4967();
                  case f_20908:
                     yield var0.m_4971();
                  case f_20909:
                     yield var0.m_4953();
                  default:
                     yield 0;
               }
            }
            case f_20904 -> f_20910;
            case f_20905 -> System.identityHashCode(var0);
            case f_20906 -> var2.length > 0 && var2[0] == var0;
            default -> m_6799(var4);
         };
         return var5 == null ? m_6799(var4) : var5;
      } catch (Throwable var14) {
         var14.printStackTrace();
         return m_6799(var4);
      }
   }

   public static void m_6798(String var0, boolean var1) {
      m_6793(var0, var1);
   }

   private static Object m_6799(Class<?> var0) {
      if (var0 == boolean.class) {
         return false;
      } else if (var0 == int.class) {
         return 0;
      } else if (var0 == long.class) {
         return 0L;
      } else if (var0 == float.class) {
         return 0.0F;
      } else if (var0 == double.class) {
         return 0.0;
      } else if (var0 == void.class || var0 == Void.class) {
         return null;
      } else {
         return BlockState.class.isAssignableFrom(var0) ? Blocks.AIR.defaultBlockState() : null;
      }
   }

   public static boolean m_6800() {
      return FabricLoader.getInstance().isModLoaded(f_20867)
         || FabricLoader.getInstance().isModLoaded(f_20868)
         || FabricLoader.getInstance().isModLoaded(f_20869)
         || FabricLoader.getInstance().getModContainer(f_20870).isPresent();
   }

   private static List<BlockState> m_6801(Object var0) {
      return var0 instanceof List var1 ? var1 : List.of();
   }

   public static void m_6802() {
      try {
         Object var0 = m_6804();
         if (var0 == null) {
            return;
         }

         Object var1 = var0.getClass().getMethod(f_20871).invoke(var0);
         var1.getClass().getMethod(f_20872).invoke(var1);
      } catch (Throwable var2) {
      }
   }

   private static Object m_6803() throws Exception {
      Object var0 = m_6804();
      return var0 == null ? null : var0.getClass().getMethod(f_20963).invoke(var0);
   }

   private static Object m_6804() throws Exception {
      Class var0 = Class.forName(f_20960);
      Object var1 = var0.getMethod(f_20961).invoke(null);
      return var1.getClass().getMethod(f_20962).invoke(var1);
   }

   public static String m_6805(BlockPos var0, int var1) {
      try {
         Object var2 = m_6804();
         if (var2 == null) {
            return f_20883;
         }

         ClassLoader var10 = var2.getClass().getClassLoader();
         Class var11 = Class.forName(f_20884, true, var10);
         Object var12 = var11.getConstructor(BlockPos.class, int.class).newInstance(var0, var1);
         Object var13 = var2.getClass().getMethod(f_20885).invoke(var2);
         var13.getClass().getMethod(f_20886, Class.forName(f_20887, true, var10)).invoke(var13, var12);
         return null;
      } catch (Throwable var9) {
         try {
            Object var3 = m_6804();
            ClassLoader var4 = var3.getClass().getClassLoader();
            Class var5 = Class.forName(f_20888, true, var4);
            Object var6 = var5.getConstructor(int.class, int.class, int.class).newInstance(var0.getX(), var0.getY(), var0.getZ());
            Object var7 = var3.getClass().getMethod(f_20889).invoke(var3);
            var7.getClass().getMethod(f_20890, Class.forName(f_20891, true, var4)).invoke(var7, var6);
            return null;
         } catch (Throwable var8) {
            return var8.getMessage() + "";
         }
      }
   }

   public static void m_6806() {
      m_6798(f_20940, true);
      m_6798(f_20941, true);
      m_6798(f_20942, true);
      m_6798(f_20943, true);
   }

   private static Object m_6807(BlockPos var0, Class<?> var1) {
      if (var1.isInstance(var0)) {
         return var0;
      }

      if (Vec3i.class.isAssignableFrom(var1)) {
         return new Vec3i(var0.getX(), var0.getY(), var0.getZ());
      }

      try {
         return var1.getConstructor(int.class, int.class, int.class).newInstance(var0.getX(), var0.getY(), var0.getZ());
      } catch (Throwable var3) {
         return new Vec3i(var0.getX(), var0.getY(), var0.getZ());
      }
   }

   private static void m_6808(Object var0, Set<String> var1) {
      if (var0 != null) {
         if (var0 instanceof Iterable) {
            for (Object var14 : (Iterable)var0) {
               m_6808(var14, var1);
            }
         } else if (!var0.getClass().isArray()) {
            if (var0 instanceof Block var10) {
               m_6791(BuiltInRegistries.BLOCK.getKey(var10), var1);
            } else {
               try {
                  Object var7 = var0.getClass().getMethod(f_20935).invoke(var0);
                  if (var7 != null && var7 != var0) {
                     m_6808(var7, var1);
                     if (!var1.isEmpty()) {
                        return;
                     }
                  }
               } catch (Throwable var6) {
               }

               try {
                  Object var8 = var0.getClass().getMethod(f_20936).invoke(var0);
                  if (var8 != null && var8 != var0) {
                     m_6808(var8, var1);
                     if (!var1.isEmpty()) {
                        return;
                     }
                  }
               } catch (Throwable var5) {
               }

               String var9 = String.valueOf(var0);
               Matcher var12 = Pattern.compile(f_20937).matcher(var9);

               while (var12.find()) {
                  String var4 = var12.group(1);
                  if (!var4.isEmpty() && !f_20938.equals(var4)) {
                     var1.add(var4);
                  }
               }
            }
         } else {
            int var2 = Array.getLength(var0);

            for (int var3 = 0; var3 < var2; var3++) {
               m_6808(Array.get(var0, var3), var1);
            }
         }
      }
   }

   public static void m_6809() {
      try {
         Object var0 = m_6804();
         if (var0 == null) {
            return;
         }

         Object var1 = var0.getClass().getMethod(f_20877).invoke(var0);
         var1.getClass().getMethod(f_20878).invoke(var1);
      } catch (Throwable var2) {
      }
   }

   public static String m_6810(String var0, Class_gXPXh2FDkuYBeJW2.N48QC1or2G8EIFjb var1, BlockPos var2) {
      try {
         Object var3 = m_6803();
         if (var3 == null) {
            return f_20894;
         }

         ClassLoader var4 = var3.getClass().getClassLoader();
         Class var5 = Class.forName(f_20895, true, var4);
         Object var6 = Proxy.newProxyInstance(var4, new Class[]{var5}, (var1x, var2x, var3x) -> m_6797(var1, var2x, var3x == null ? new Object[0] : var3x));
         Method var7 = m_6813(var3.getClass(), var5);
         if (var7 == null) {
            return f_20896;
         }

         Class var8 = var7.getParameterTypes()[2];
         Object var9 = m_6807(var2, var8);
         var7.invoke(var3, var0, var6, var9);
         m_6819();
         return null;
      } catch (Throwable var10) {
         var10.printStackTrace();
         return var10.getClass().getSimpleName() + var10.getMessage();
      }
   }

   public static List<String> m_6811() {
      if (!m_6816()) {
         return List.of();
      }

      try {
         Object var0 = m_6804();
         if (var0 == null) {
            return List.of();
         }

         Object var1 = var0.getClass().getMethod(f_20931).invoke(var0);
         if (var1 == null) {
            return List.of();
         }

         LinkedHashSet var2 = new LinkedHashSet();
         Object var3 = m_6821(var1);
         if (var3 != null) {
            m_6808(var3, var2);
         }

         if (var2.isEmpty()) {
            try {
               Object var4 = var1.getClass().getMethod(f_20932).invoke(var1);
               m_6808(var4, var2);
            } catch (Throwable var5) {
            }
         }

         return List.copyOf(var2);
      } catch (Throwable var6) {
         return List.of();
      }
   }

   private static Method m_6813(Class<?> var0, Class<?> var1) {
      Method var2 = null;

      for (Method var6 : var0.getMethods()) {
         if (f_20959.equals(var6.getName())) {
            Class[] var7 = var6.getParameterTypes();
            if (var7.length == 3 && var7[0] == String.class && (var7[1].isAssignableFrom(var1) || var7[1] == var1)) {
               var2 = var6;
               if (Vec3i.class.isAssignableFrom(var7[2]) || BlockPos.class.isAssignableFrom(var7[2])) {
                  return var6;
               }
            }
         }
      }

      return var2;
   }

   public static void m_6814() {
      try {
         Object var0 = m_6803();
         if (var0 == null) {
            return;
         }

         var0.getClass().getMethod(f_20875).invoke(var0);
      } catch (Throwable var1) {
      }
   }

   public static boolean m_6815() {
      try {
         Object var0 = m_6803();
         if (var0 == null) {
            return false;
         }

         Object var1 = var0.getClass().getMethod(f_20873).invoke(var0);
         return Boolean.TRUE.equals(var1);
      } catch (Throwable var2) {
         return false;
      }
   }

   public static boolean m_6816() {
      try {
         Object var0 = m_6804();
         if (var0 == null) {
            return false;
         }

         Object var1 = var0.getClass().getMethod(f_20929).invoke(var0);
         if (var1 == null) {
            return false;
         }

         Object var2 = var1.getClass().getMethod(f_20930).invoke(var1);
         return Boolean.TRUE.equals(var2);
      } catch (Throwable var3) {
         return false;
      }
   }

   public static String m_6817(int var0, String... var1) {
      if (!m_6800()) {
         return f_20920;
      }

      if (var1 != null && var1.length != 0) {
         try {
            Object var2 = m_6804();
            if (var2 == null) {
               return f_20922;
            }

            Object var3 = var2.getClass().getMethod(f_20923).invoke(var2);
            if (var3 == null) {
               return f_20924;
            }

            m_6806();

            try {
               var3.getClass().getMethod(f_20925, int.class, String[].class).invoke(var3, var0, var1);
               return null;
            } catch (NoSuchMethodException var8) {
               Class var4 = Class.forName(f_20926);
               Object var5 = Array.newInstance(var4, 0);

               try {
                  var3.getClass().getMethod(f_20927, int.class, var5.getClass()).invoke(var3, var0, m_6795(var1, var4));
                  return null;
               } catch (Throwable var7) {
                  var3.getClass().getMethod(f_20928, String[].class).invoke(var3, var1);
                  return null;
               }
            }
         } catch (Throwable var9) {
            return var9.getMessage() + "";
         }
      } else {
         return f_20921;
      }
   }

   public static void m_6818(boolean var0) {
      try {
         Object var1 = m_6804();
         if (var1 == null) {
            return;
         }

         Object var2 = var1.getClass().getMethod(f_20879).invoke(var1);
         Class var3 = Class.forName(f_20880, true, var2.getClass().getClassLoader());
         Enum var4 = Enum.valueOf(var3.asSubclass(Enum.class), f_20881);
         var2.getClass().getMethod(f_20882, var3, boolean.class).invoke(var2, var4, var0);
      } catch (Throwable var5) {
      }
   }

   public static void m_6819() {
      try {
         Object var0 = m_6803();
         if (var0 == null) {
            return;
         }

         var0.getClass().getMethod(f_20876).invoke(var0);
      } catch (Throwable var1) {
      }
   }

   private Class_gXPXh2FDkuYBeJW2() {
   }

   public static void m_6820(Block var0, boolean var1) {
      try {
         Object var2 = m_6788(f_20955);
         if (var2 == null) {
            return;
         }

         if (!(var2.getClass().getField(f_20956).get(var2) instanceof List var4)) {
            return;
         }

         List var5 = var4;
         if (var1) {
            if (!var5.contains(var0)) {
               var5.add(var0);
            }
         } else {
            var5.remove(var0);
         }
      } catch (Throwable var6) {
      }
   }

   private static Object m_6821(Object var0) {
      try {
         Field var8 = var0.getClass().getDeclaredField(f_20933);
         var8.setAccessible(true);
         return var8.get(var0);
      } catch (Throwable var7) {
         for (Field var4 : var0.getClass().getDeclaredFields()) {
            try {
               var4.setAccessible(true);
               Object var5 = var4.get(var0);
               if (var5 != null && var5.getClass().getName().contains(f_20934)) {
                  return var5;
               }
            } catch (Throwable var6) {
            }
         }

         return null;
      }
   }

   public interface N48QC1or2G8EIFjb {
      int m_4953();

      BlockState m_4950(int var1, int var2, int var3, BlockState var4, List<BlockState> var5);

      int m_4971();

      int m_4967();

      boolean m_4958(int var1, int var2, int var3);

      default void m_6787() {
      }
   }
}
