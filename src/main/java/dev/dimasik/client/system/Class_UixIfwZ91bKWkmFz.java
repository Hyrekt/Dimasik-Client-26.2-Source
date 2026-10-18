package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.NativeImage;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.ReloadableTexture;
import net.minecraft.client.renderer.texture.TextureContents;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.ResourceManager;

public final class Class_UixIfwZ91bKWkmFz {
   private static final Set<Identifier> f_14899 = ConcurrentHashMap.newKeySet();
   private static final String f_14900 = "dimasik";
   private static final String f_14901 = ".png";

   private static boolean m_5287(Identifier var0) {
      return f_14900.equals(var0.getNamespace()) && var0.getPath().endsWith(f_14901);
   }

   private Class_UixIfwZ91bKWkmFz() {
   }

   public static AbstractTexture m_5288(Identifier var0) {
      TextureManager var1 = Minecraft.getInstance().getTextureManager();
      if (!m_5287(var0)) {
         return var1.getTexture(var0);
      }

      if (f_14899.add(var0)) {
         try {
            var1.registerAndLoad(var0, new Class_UixIfwZ91bKWkmFz.lLLuYz9SUjwewUmZ(var0));
         } catch (RuntimeException var3) {
            f_14899.remove(var0);
            throw var3;
         }
      }

      return var1.getTexture(var0);
   }

   private static final class lLLuYz9SUjwewUmZ extends ReloadableTexture {
      public TextureContents loadContents(ResourceManager var1) throws IOException {
         try (
            InputStream var2 = var1.open(this.resourceId());
            InputStream var3 = Class_yat3STEywmb0lNb5.m_9683(var2, this.resourceId().toString());
         ) {
            return new TextureContents(NativeImage.read(var3), null);
         } catch (GeneralSecurityException var10) {
            throw new IOException(this.resourceId() + "", var10);
         }
      }

      public lLLuYz9SUjwewUmZ(Identifier var1) {
         super(var1);
      }
   }
}
