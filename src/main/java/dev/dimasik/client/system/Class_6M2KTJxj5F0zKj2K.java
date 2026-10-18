package dev.dimasik.client.system;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;

public final class Class_6M2KTJxj5F0zKj2K {
   private static final ClassValue<URL> f_2806 = new ClassValue<URL>() {
      public static final String f_2805 = "/";

      @Override
      protected URL computeValue(Class<?> var1) {
         CodeSource var2 = var1.getProtectionDomain().getCodeSource();
         if (var2 != null && var2.getLocation() != null) {
            URL var3 = var2.getLocation();

            try {
               return var3.toExternalForm().endsWith(f_2805) ? var3 : URI.create(var3.toExternalForm() + "").toURL();
            } catch (MalformedURLException var5) {
               throw new IllegalStateException(var1.getName() + "", var5);
            }
         } else {
            throw new IllegalStateException(var1.getName() + "");
         }
      }
   };

   public static InputStream m_1542(Class<?> var0, String var1) {
      try {
         URL var2 = new URL(f_2806.get(var0), var1);
         URLConnection var3 = var2.openConnection();
         var3.setUseCaches(false);
         return var3.getInputStream();
      } catch (FileNotFoundException var4) {
         return null;
      } catch (IOException var5) {
         throw new UncheckedIOException(var1 + var0.getName(), var5);
      }
   }

   private Class_6M2KTJxj5F0zKj2K() {
   }
}
