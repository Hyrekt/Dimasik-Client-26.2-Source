package dev.dimasik.client.ui.screen;

import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_jZQ0pP9BTU3L7miy;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.AlertScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.gui.screens.options.OptionsScreen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;

public final class Screen_1 extends Screen implements Class_NzJrN63M7QBpmAbi {
   private static final Identifier f_3 = Class_wHRRCm2tlLY7DN4I.m_9311(Screen_1.f_160);
   private static final Identifier f_4 = Class_wHRRCm2tlLY7DN4I.m_9311(Screen_1.f_161);
   private static final Identifier f_5 = Class_wHRRCm2tlLY7DN4I.m_9311(Screen_1.f_162);
   private static final Identifier f_6 = Class_wHRRCm2tlLY7DN4I.m_9311(Screen_1.f_163);
   private static final String f_7 = "Keep it simple,";
   private static final String f_8 = "Make it yours.";
   private static final long f_9 = 320L;
   private static final long f_10 = 800L;
   private static final long f_11 = 50L;
   private static final long f_12 = 650L;
   private static final float f_13 = 1920.0F;
   private static final float f_14 = 1080.0F;
   private static final float f_15 = 88.0F;
   private static final float f_16 = 441.45F;
   private static final float f_17 = 48.4F;
   private static final float f_18 = 10.5F;
   private static final float f_19 = 13.125F;
   private static final float f_20 = 18.9F;
   private static final float f_21 = 13.125F;
   private static final float f_22 = 18.9F;
   private static final float f_23 = 88.0F;
   private static final float f_24 = 358.0F;
   private static final float f_25 = 1808.0F;
   private static final float f_26 = 475.2F;
   private static final float f_27 = 58.0F;
   private static final float f_28 = 543.2F;
   private static final float f_29 = 46.0F;
   private static final float f_30 = 40.0F;
   private static final int f_31 = 184549375;
   private static final int f_32 = 419430399;
   private static final int f_33 = 218103807;
   private static final int f_34 = 2063597567;
   private static final int f_35 = -1191182337;
   private static final int f_36 = 2063597567;
   private final List<Screen_1.XXAMKB95tbAwuvmy> f_37 = new ArrayList<>();
   private final Screen_1.IoOeppae4ozhqmnZ[] f_38 = createMenuEntries();
   private final float[] f_39 = new float[this.f_38.length];
   private long f_40;
   private long f_41 = System.nanoTime();
   private float f_42;
   private boolean f_43;
   private static final String f_44 = "Main Menu";
   private static final float f_45 = 0.016666668F;
   private static final int f_46 = -1509949440;
   private static final float f_47 = 88.0F;
   private static final float f_48 = 441.45F;
   private static final float f_49 = 90.0F;
   private static final float f_50 = 360.0F;
   private static final float f_51 = 20.0F;
   private static final float f_52 = 20.0F;
   private static final double f_53 = 235.0;
   private static final String f_54 = "Dimasik";
   private static final float f_55 = 120.0F;
   private static final float f_56 = 360.0F;
   private static final double f_57 = 225.0;
   private static final float f_58 = 88.0F;
   private static final float f_59 = 391.0F;
   private static final float f_60 = 11.0F;
   private static final float f_61 = 11.0F;
   private static final double f_62 = 220.0;
   private static final String f_63 = "Version 26.2";
   private static final float f_64 = 103.0F;
   private static final float f_65 = 389.0F;
   private static final double f_66 = 220.0;
   private static final float f_67 = 88.0F;
   private static final float f_68 = 409.0F;
   private static final float f_69 = 11.0F;
   private static final float f_70 = 11.0F;
   private static final double f_71 = 220.0;
   private static final String f_72 = "01.08.26";
   private static final float f_73 = 103.0F;
   private static final float f_74 = 407.0F;
   private static final double f_75 = 220.0;
   private static final float f_76 = 13.125F;
   private static final float f_77 = 95.15F;
   private static final float f_78 = 48.4F;
   private static final double f_79 = 5.0E-4F;
   private static final int f_80 = 184549375;
   private static final int f_81 = 419430399;
   private static final int f_82 = 184549375;
   private static final float f_83 = 0.1F;
   private static final int f_84 = 419430399;
   private static final int f_85 = -1191182337;
   private static final int f_86 = -1191182337;
   private static final float f_87 = 0.2F;
   private static final float f_88 = 0.7F;
   private static final int f_89 = 2063597567;
   private static final float f_90 = 48.4F;
   private static final float f_91 = 18.9F;
   private static final float f_92 = 13.125F;
   private static final float f_93 = 48.4F;
   private static final float f_94 = 13.125F;
   private static final float f_95 = 48.4F;
   private static final float f_96 = 1.05F;
   private static final float f_97 = 13.125F;
   private static final int f_98 = 218103807;
   private static final int f_99 = 419430399;
   private static final float f_100 = 21.0F;
   private static final float f_101 = 1.05F;
   private static final float f_102 = 18.9F;
   private static final float f_103 = 45.15F;
   private static final float f_104 = 16.8F;
   private static final float f_105 = 13.125F;
   private static final float f_106 = 48.4F;
   private static final float f_107 = 58.9F;
   private static final long f_108 = 970L;
   private static final float f_109 = 1808.0F;
   private static final float f_110 = 475.2F;
   private static final float f_111 = 58.0F;
   private static final String f_112 = "Keep it simple,";
   private static final long f_113 = 320L;
   private static final float f_114 = 1808.0F;
   private static final float f_115 = 543.2F;
   private static final float f_116 = 46.0F;
   private static final String f_117 = "Make it yours.";
   private static final float f_118 = 0.22F;
   private static final long f_119 = 50L;
   private static final float f_120 = 800.0F;
   private static final float f_121 = 40.0F;
   private static final float f_122 = 0.5F;
   private static final float f_123 = 1080.0F;
   private static final float f_124 = 1080.0F;
   private static final float f_125 = 1920.0F;
   private static final float f_126 = 0.5F;
   private static final float f_127 = 1.0E9F;
   private static final float f_128 = 0.004166667F;
   private static final float f_129 = 0.05F;
   private static final float f_130 = 1920.0F;
   private static final float f_131 = 1080.0F;
   private static final float f_132 = 1920.0F;
   private static final float f_133 = 0.5F;
   private static final float f_134 = 1080.0F;
   private static final float f_135 = 0.5F;
   private static final float f_136 = 1920.0F;
   private static final float f_137 = 1080.0F;
   private static final String f_138 = "Singleplayer";
   private static final String f_139 = "e";
   private static final String f_140 = "Multiplayer";
   private static final String f_141 = "g";
   private static final String f_142 = "AltManager";
   private static final String f_143 = "h";
   private static final String f_144 = "Settings";
   private static final String f_145 = "i";
   private static final String f_146 = "replaymod";
   private static final String f_147 = "Replays";
   private static final String f_148 = "e";
   private static final String f_149 = "com.replaymod.replay.ReplayModReplay";
   private static final String f_150 = "com.replaymod.replay.gui.screen.GuiReplayViewer";
   private static final String f_151 = "instance";
   private static final String f_152 = "display";
   private static final String f_153 = "Failed to open Replay Mod viewer";
   private static final String f_154 = "Replay Mod";
   private static final String f_155 = "Could not open the replay viewer. See latest.log for details.";
   private static final long f_156 = 1000000L;
   private static final int f_157 = 16777215;
   private static final long f_158 = 800L;
   private static final long f_159 = 50L;
   private static final String f_160 = "mainmenu/gavs_background";
   private static final String f_161 = "mainmenu/legacy/main_logo";
   private static final String f_162 = "mainmenu/legacy/version";
   private static final String f_163 = "mainmenu/legacy/date";

   protected void init() {
      if (this.f_43) {
         this.f_43 = false;
         this.f_41 = System.nanoTime();
      } else {
         this.f_40 = 0L;
         this.f_41 = System.nanoTime();

         for (int var1 = 0; var1 < this.f_39.length; var1++) {
            this.f_39[var1] = 0.0F;
         }
      }
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   public boolean isPauseScreen() {
      return false;
   }

   public boolean shouldCloseOnEsc() {
      return false;
   }

   private void updateClock() {
      long var1 = System.nanoTime();
      this.f_42 = clamp((float)(var1 - this.f_41) / f_127, f_128, f_129);
      this.f_41 = var1;
   }

   private void openReplayViewer() {
      try {
         Class var1 = Class.forName(f_149);
         Class var2 = Class.forName(f_150);
         Object var3 = var2.getConstructor(var1).newInstance(var1.getField(f_151).get(null));
         var2.getMethod(f_152).invoke(var3);
      } catch (ReflectiveOperationException | LinkageError var4) {
         System.getLogger(Screen_1.class.getName()).log(Level.ERROR, f_153, var4);
         this.minecraft.gui.setScreen(new AlertScreen(() -> this.minecraft.gui.setScreen(this), Component.literal(f_154), Component.literal(f_155)));
      }
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   private static long elapsedMs(long var0) {
      return (System.nanoTime() - var0) / f_156;
   }

   private void renderMenu(float var1, float var2) {
      int var3 = this.mainColor();
      float var4 = f_47;
      float var5 = f_48;
      Class_Ssh31B3ljfKeWsvS.m_4838(f_49, f_50, f_51, f_52, 0.0F, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_53), f_4);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_54, f_55, f_56, 14, Class_BftdentXEtGbugJw.m_2303(224, 243, 252, f_57));
      Class_Ssh31B3ljfKeWsvS.m_4838(f_58, f_59, f_60, f_61, 0.0F, Class_BftdentXEtGbugJw.m_2303(96, 101, 116, f_62), f_5);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_63, f_64, f_65, 11, Class_BftdentXEtGbugJw.m_2303(87, 90, 105, f_66));
      Class_Ssh31B3ljfKeWsvS.m_4838(f_67, f_68, f_69, f_70, 0.0F, Class_BftdentXEtGbugJw.m_2303(96, 101, 116, f_71), f_6);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), f_72, f_73, f_74, 11, Class_BftdentXEtGbugJw.m_2303(87, 90, 105, f_75));

      for (int var6 = 0; var6 < this.f_38.length; var6++) {
         Screen_1.IoOeppae4ozhqmnZ var7 = this.f_38[var6];
         float var8 = this.textWidth(Class_y1y6QpONhWEUIdEB.m_9589(), var7.label, f_76);
         float var9 = f_77 + var8;
         boolean var10 = contains(var1, var2, var4, var5, var9, f_78);
         float var11 = var10 ? 1.0F : 0.0F;
         float var12 = 1.0F - (float)Math.pow(f_79, this.f_42);
         this.f_39[var6] = this.f_39[var6] + (var11 - this.f_39[var6]) * var12;
         float var13 = clamp(this.f_39[var6], 0.0F, 1.0F);
         int var14 = mixColor(f_80, f_81, var13);
         int var15 = Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), 0.0F);
         int var16 = Class_BftdentXEtGbugJw.m_2302(var15, f_82, f_83);
         int var17 = mixColor(var16, f_84, var13);
         int var18 = mixColor(f_85, f_86, var13);
         int var19 = mixColor(Class_BftdentXEtGbugJw.m_2306(var3, f_87), Class_BftdentXEtGbugJw.m_2306(var3, f_88), var13);
         int var20 = mixColor(f_89, var3, var13);
         Class_Ssh31B3ljfKeWsvS.m_4858(var4, var5, var9, f_90, f_91, f_92, -1);
         Class_Ssh31B3ljfKeWsvS.m_4817(var4, var5, var9, f_93, f_94, var14);
         Class_Ssh31B3ljfKeWsvS.m_4854(var4, var5, var9, f_95, f_96, f_97, mixColor(f_98, f_99, var13));
         this.drawText(Class_y1y6QpONhWEUIdEB.m_9587(), var7.icon, var4 + f_100, var5 + f_101, f_102, var20, 0.0F);
         this.drawText(Class_y1y6QpONhWEUIdEB.m_9589(), var7.label, var4 + f_103, var5 + f_104, f_105, var18, 0.0F);
         this.f_37.add(new Screen_1.XXAMKB95tbAwuvmy(var7.action, var4, var5, var9, f_106));
         var5 += f_107;
      }
   }

   private static boolean contains(double var0, double var2, float var4, float var5, float var6, float var7) {
      return var0 >= var4 && var2 >= var5 && var0 <= var4 + var6 && var2 <= var5 + var7;
   }

   private static int applyOpacity(int var0, float var1) {
      int var2 = var0 >>> 24 & 0xFF;
      int var3 = Math.round(var2 * clamp(var1, 0.0F, 1.0F));
      return var0 & f_157 | var3 << 24;
   }

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      Vector2f var5 = this.toLayoutPosition(Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3));
      this.updateClock();
      this.f_37.clear();
      if (this.f_40 == 0L) {
         this.f_40 = System.nanoTime();
      }

      this.renderBackground();
      Class_Ssh31B3ljfKeWsvS.m_4814(this.layoutMatrix());
      this.renderMenu(var5.x, var5.y);
      this.renderHero();
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
   }

   private void drawRightAligned(float var1, float var2, float var3, String var4, int var5, float var6) {
      this.drawText(Class_y1y6QpONhWEUIdEB.m_9589(), var4, var1 - this.textWidth(Class_y1y6QpONhWEUIdEB.m_9589(), var4, var3), var2, var3, var5, var6);
   }

   private float layoutScale() {
      float var1 = Math.max(1.0F, this.minecraft.getWindow().getScreenWidth());
      float var2 = Math.max(1.0F, this.minecraft.getWindow().getScreenHeight());
      return Math.min(var1 / f_130, var2 / f_131);
   }

   private static long splitTextDuration(String var0) {
      return f_158 + Math.max(0, var0.length() - 1) * f_159;
   }

   private void renderHero() {
      int var1 = this.mainColor();
      long var2 = elapsedMs(this.f_40);
      long var4 = f_108;
      this.drawTypeLine(f_109, f_110, f_111, f_112, var2 - f_113, -1, 0.0F);
      this.drawTypeLine(f_114, f_115, f_116, f_117, var2 - var4, var1, f_118);
   }

   private Vector2f toLayoutPosition(Vector2f var1) {
      float var2 = this.layoutScale();
      return new Vector2f((var1.x - this.layoutOffsetX()) / var2, (var1.y - this.layoutOffsetY()) / var2);
   }

   private Matrix4f layoutMatrix() {
      float var1 = Math.max(1.0F, this.minecraft.getWindow().getScreenWidth());
      float var2 = Math.max(1.0F, this.minecraft.getWindow().getScreenHeight());
      float var3 = this.layoutScale();
      float var4 = var3 * (1.0F - f_136 / var1);
      float var5 = var3 * (f_137 / var2 - 1.0F);
      return new Matrix4f().translate(var4, var5, 0.0F).scale(var3, var3, 1.0F);
   }

   public Screen_1() {
      super(Component.literal(f_44));
      this.f_42 = f_45;
   }

   private float layoutOffsetY() {
      return (this.minecraft.getWindow().getScreenHeight() - f_134 * this.layoutScale()) * f_135;
   }

   private void drawTypeLine(float var1, float var2, float var3, String var4, long var5, int var7, float var8) {
      if (var5 >= 0L) {
         if (var5 >= splitTextDuration(var4)) {
            this.drawRightAligned(var1, var2, var3, var4, var7, var8);
         } else {
            float var9 = this.textWidth(Class_y1y6QpONhWEUIdEB.m_9589(), var4, var3);
            float var10 = var1 - var9;

            for (int var11 = 0; var11 < var4.length(); var11++) {
               long var12 = var5 - var11 * f_119;
               if (var12 >= 0L) {
                  float var14 = clamp((float)var12 / f_120, 0.0F, 1.0F);
                  float var15 = power3Out(var14);
                  String var16 = var4.substring(var11, var11 + 1);
                  float var17 = var10
                     + this.textWidth(Class_y1y6QpONhWEUIdEB.m_9589(), var4.substring(0, var11 + 1), var3)
                     - this.textWidth(Class_y1y6QpONhWEUIdEB.m_9589(), var16, var3);
                  float var18 = var2 + f_121 * (1.0F - var15);
                  int var19 = applyOpacity(var7, var15);
                  this.drawText(Class_y1y6QpONhWEUIdEB.m_9589(), var16, var17, var18, var3, var19, var8);
               }
            }
         }
      }
   }

   private static float power3Out(float var0) {
      var0 = clamp(var0, 0.0F, 1.0F);
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private void drawText(Class_jZQ0pP9BTU3L7miy var1, String var2, float var3, float var4, float var5, int var6, float var7) {
      if (var7 == 0.0F) {
         Class_Ssh31B3ljfKeWsvS.m_4857(var1, var2, var3, var4, var5, var6, 0.0F, f_122, 1.0F);
      } else {
         float var8 = 1.0F - (var4 + var5) * 2.0F / f_123;
         float var9 = var7 * f_124 / f_125;
         Matrix4f var10 = new Matrix4f();
         var10.m10(var9);
         var10.m30(-var9 * var8);
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f(this.layoutMatrix()).mul(var10));
         Class_Ssh31B3ljfKeWsvS.m_4857(var1, var2, var3, var4, var5, var6, 0.0F, f_126, 1.0F);
         Class_Ssh31B3ljfKeWsvS.m_4814(this.layoutMatrix());
      }
   }

   private void renderBackground() {
      float var1 = this.minecraft.getWindow().getScreenWidth();
      float var2 = this.minecraft.getWindow().getScreenHeight();
      Class_Ssh31B3ljfKeWsvS.m_4829(0.0F, 0.0F, var1, var2, 0.0F, new Vector4f(0.0F, 0.0F, 1.0F, 1.0F), -1, f_3, FilterMode.LINEAR);
      Class_Ssh31B3ljfKeWsvS.m_4817(0.0F, 0.0F, var1, var2, 0.0F, f_46);
   }

   private float textWidth(Class_jZQ0pP9BTU3L7miy var1, String var2, float var3) {
      return Class_Ssh31B3ljfKeWsvS.m_4826(var1, var2, var3, 1.0F);
   }

   private static float clamp(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public void resumeFromOverlay() {
      this.f_43 = true;
   }

   private static Screen_1.IoOeppae4ozhqmnZ[] createMenuEntries() {
      ArrayList var0 = new ArrayList<>(
         List.of(
            new Screen_1.IoOeppae4ozhqmnZ(f_138, f_139, Screen_1.gbZc5sPc3lLLbur4.SINGLEPLAYER),
            new Screen_1.IoOeppae4ozhqmnZ(f_140, f_141, Screen_1.gbZc5sPc3lLLbur4.MULTIPLAYER),
            new Screen_1.IoOeppae4ozhqmnZ(f_142, f_143, Screen_1.gbZc5sPc3lLLbur4.ALT_MANAGER),
            new Screen_1.IoOeppae4ozhqmnZ(f_144, f_145, Screen_1.gbZc5sPc3lLLbur4.SETTINGS)
         )
      );
      if (FabricLoader.getInstance().isModLoaded(f_146)) {
         var0.add(new Screen_1.IoOeppae4ozhqmnZ(f_147, f_148, Screen_1.gbZc5sPc3lLLbur4.REPLAYS));
      }

      return (Screen_1.IoOeppae4ozhqmnZ[])var0.toArray(new Screen_1.IoOeppae4ozhqmnZ[0]);
   }

   private int mainColor() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      if (var1.button() != 0) {
         return false;
      }

      Vector2f var3 = this.toLayoutPosition(Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y()));

      for (int var4 = this.f_37.size() - 1; var4 >= 0; var4--) {
         Screen_1.XXAMKB95tbAwuvmy var5 = this.f_37.get(var4);
         if (contains(var3.x, var3.y, var5.x, var5.y, var5.w, var5.h)) {
            switch (var5.action) {
               case SINGLEPLAYER:
                  this.minecraft.gui.setScreen(new SelectWorldScreen(this));
                  break;
               case MULTIPLAYER:
                  this.minecraft.gui.setScreen(new JoinMultiplayerScreen(this));
                  break;
               case ALT_MANAGER:
                  this.minecraft.gui.setScreen(new Screen_2(this));
                  break;
               case SETTINGS:
                  this.minecraft.gui.setScreen(new OptionsScreen(this, this.minecraft.options, this.minecraft.level != null));
                  break;
               case REPLAYS:
                  this.openReplayViewer();
            }

            return true;
         }
      }

      return false;
   }

   private float layoutOffsetX() {
      return (this.minecraft.getWindow().getScreenWidth() - f_132 * this.layoutScale()) * f_133;
   }

   private static int mixColor(int var0, int var1, float var2) {
      var2 = clamp(var2, 0.0F, 1.0F);
      int var3 = Math.round((var0 >>> 24 & 0xFF) + ((var1 >>> 24 & 0xFF) - (var0 >>> 24 & 0xFF)) * var2);
      int var4 = Math.round((var0 >>> 16 & 0xFF) + ((var1 >>> 16 & 0xFF) - (var0 >>> 16 & 0xFF)) * var2);
      int var5 = Math.round((var0 >>> 8 & 0xFF) + ((var1 >>> 8 & 0xFF) - (var0 >>> 8 & 0xFF)) * var2);
      int var6 = Math.round((var0 & 0xFF) + ((var1 & 0xFF) - (var0 & 0xFF)) * var2);
      return var3 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private record IoOeppae4ozhqmnZ(String label, String icon, Screen_1.gbZc5sPc3lLLbur4 action) {
   }

   private record XXAMKB95tbAwuvmy(Screen_1.gbZc5sPc3lLLbur4 action, float x, float y, float w, float h) {
      public float m_681() {
         return this.w;
      }

      public float m_682() {
         return this.h;
      }
   }

   private enum gbZc5sPc3lLLbur4 {
      SINGLEPLAYER,
      MULTIPLAYER,
      ALT_MANAGER,
      SETTINGS,
      REPLAYS;
   }
}
