package dev.dimasik.client.system;

import java.util.concurrent.atomic.AtomicInteger;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import org.joml.Matrix4f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class_tjdtKxsAEogQMtun implements ModInitializer {
   public static final String f_32093 = "holdmyitems";
   public static Matrix4f f_32094 = new Matrix4f();
   public static Matrix4f f_32095 = new Matrix4f();
   public static float f_32096 = 0.0F;
   public static final Logger f_32097 = LoggerFactory.getLogger(Class_tjdtKxsAEogQMtun.f_32109);
   public static Minecraft f_32098 = Minecraft.getInstance();
   public static float f_32099 = 0.0F;
   public static float f_32100 = 0.0F;
   private static final String f_32101 = "example";
   private static final String f_32102 = "hud";
   private static final String f_32103 = "holdmyitems";
   private static final String f_32104 = "pack_test";
   private static final String f_32105 = "dimasik";
   private static final String f_32106 = "What you staring at?";
   private static final String f_32107 = "Example Pack!";
   private static final String f_32108 = "Registered embedded resource pack: {}";
   private static final String f_32109 = "holdmyitems";

   public void onInitialize() {
      ClassLoader var1 = this.getClass().getClassLoader();
      System.out.println(var1 + "");
      HudElementRegistry.addLast(Identifier.fromNamespaceAndPath(f_32101, f_32102), (var0, var1x) -> {
         AtomicInteger var2x = new AtomicInteger(10);
         Class_LRsxqvEkEcBPGPUf.f_10587.m_2075().forEach(var2xx -> {
            var0.text(Minecraft.getInstance().font, var2xx, 10, var2x.get(), -1);
            var2x.addAndGet(10);
         });
         Class_LRsxqvEkEcBPGPUf.f_10587.m_2073();
      });
      ResourceManagerHelper.get(PackType.CLIENT_RESOURCES).registerReloadListener(new Class_5B4sHXkh7HGXA5ff());
      Identifier var2 = Identifier.fromNamespaceAndPath(f_32103, f_32104);
      FabricLoader.getInstance().getModContainer(f_32105).ifPresent(var1x -> {
         ResourceLoader.registerBuiltinPack(var2, var1x, Component.literal(f_32107), PackActivationType.NORMAL);
         f_32097.info(f_32108, var2);
      });
      f_32097.info(f_32106);
   }
}
