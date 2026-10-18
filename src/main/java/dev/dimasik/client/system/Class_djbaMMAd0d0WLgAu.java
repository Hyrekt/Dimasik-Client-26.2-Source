package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.NativeImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Optional;
import net.minecraft.client.renderer.texture.MipmapStrategy;
import net.minecraft.client.renderer.texture.ReloadableTexture;
import net.minecraft.client.renderer.texture.TextureContents;
import net.minecraft.client.resources.metadata.texture.TextureMetadataSection;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;

public final class Class_djbaMMAd0d0WLgAu extends ReloadableTexture {
   private static final TextureMetadataSection f_18992 = new TextureMetadataSection(true, true, MipmapStrategy.AUTO, 0.0F);
   private final boolean f_18993;

   private TextureContents load(InputStream var1, TextureMetadataSection var2) throws IOException {
      try (
         InputStream var3 = var1;
         InputStream var4 = Class_yat3STEywmb0lNb5.m_9683(var3, this.resourceId().toString());
      ) {
         return new TextureContents(NativeImage.read(var4), var2);
      } catch (GeneralSecurityException var11) {
         throw new IOException(this.resourceId() + "", var11);
      }
   }

   public TextureContents loadContents(ResourceManager var1) throws IOException {
      if (!this.f_18993) {
         Optional var2 = var1.getResource(this.resourceId());
         if (var2.isPresent()) {
            Resource var6 = (Resource)var2.get();
            TextureMetadataSection var4 = (TextureMetadataSection)var6.metadata().getSection(TextureMetadataSection.TYPE).orElse(null);
            return this.load(var6.open(), var4);
         }
      }

      String var5 = "/assets/" + this.resourceId().getNamespace() + "/" + this.resourceId().getPath();
      InputStream var3 = Class_djbaMMAd0d0WLgAu.class.getResourceAsStream(var5);
      if (var3 == null) {
         throw new FileNotFoundException(var5);
      } else {
         return this.load(var3, f_18992);
      }
   }

   public Class_djbaMMAd0d0WLgAu(Identifier var1, boolean var2) {
      super(var1);
      this.f_18993 = var2;
   }

   public Class_djbaMMAd0d0WLgAu(Identifier var1) {
      this(var1, false);
   }
}
