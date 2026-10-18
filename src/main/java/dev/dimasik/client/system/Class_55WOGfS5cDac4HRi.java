package dev.dimasik.client.system;

public class Class_55WOGfS5cDac4HRi {
   public static final double f_2279 = 1.70158;
   public static final double f_2280 = 2.5949095;
   public static final double f_2281 = 2.70158;
   public static final double f_2282 = Math.PI * 2.0 / 3.0;
   public static final double f_2283 = Math.PI * 4.0 / 9.0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2284 = var0 -> (float)(
      1.0 - Math.cos(var0 * Class_55WOGfS5cDac4HRi.f_2413 / Class_55WOGfS5cDac4HRi.f_2414)
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2285 = var0 -> (float)Math.sin(
      var0 * Class_55WOGfS5cDac4HRi.f_2411 / Class_55WOGfS5cDac4HRi.f_2412
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2286 = var0 -> (float)(
      -(Math.cos(Class_55WOGfS5cDac4HRi.f_2409 * var0) - 1.0) / Class_55WOGfS5cDac4HRi.f_2410
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2287 = var0 -> (float)(1.0 - Math.sqrt(1.0 - Math.pow(var0, Class_55WOGfS5cDac4HRi.f_2408)));
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2288 = var0 -> (float)Math.sqrt(1.0 - Math.pow(var0 - 1.0, Class_55WOGfS5cDac4HRi.f_2407));
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2289 = var0 -> (float)(
      var0 < Class_55WOGfS5cDac4HRi.f_2399
         ? (1.0 - Math.sqrt(1.0 - Math.pow(Class_55WOGfS5cDac4HRi.f_2400 * var0, Class_55WOGfS5cDac4HRi.f_2401))) / Class_55WOGfS5cDac4HRi.f_2402
         : (Math.sqrt(1.0 - Math.pow(Class_55WOGfS5cDac4HRi.f_2403 * var0 + Class_55WOGfS5cDac4HRi.f_2404, Class_55WOGfS5cDac4HRi.f_2405)) + 1.0)
            / Class_55WOGfS5cDac4HRi.f_2406
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2290 = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(
         Math.pow(Class_55WOGfS5cDac4HRi.f_2393, Class_55WOGfS5cDac4HRi.f_2394 * var0 - Class_55WOGfS5cDac4HRi.f_2395)
            * Math.sin((var0 * Class_55WOGfS5cDac4HRi.f_2396 - Class_55WOGfS5cDac4HRi.f_2397) * Class_55WOGfS5cDac4HRi.f_2398)
      )
      : var0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2291 = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(
         Math.pow(Class_55WOGfS5cDac4HRi.f_2388, Class_55WOGfS5cDac4HRi.f_2389 * var0)
               * Math.sin((var0 * Class_55WOGfS5cDac4HRi.f_2390 - Class_55WOGfS5cDac4HRi.f_2391) * Class_55WOGfS5cDac4HRi.f_2392)
            + 1.0
      )
      : var0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2292 = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(
         var0 < Class_55WOGfS5cDac4HRi.f_2373
            ? -(
                  Math.pow(Class_55WOGfS5cDac4HRi.f_2374, Class_55WOGfS5cDac4HRi.f_2375 * var0 - Class_55WOGfS5cDac4HRi.f_2376)
                     * Math.sin((Class_55WOGfS5cDac4HRi.f_2377 * var0 - Class_55WOGfS5cDac4HRi.f_2378) * Class_55WOGfS5cDac4HRi.f_2379)
               )
               / Class_55WOGfS5cDac4HRi.f_2380
            : Math.pow(Class_55WOGfS5cDac4HRi.f_2381, Class_55WOGfS5cDac4HRi.f_2382 * var0 + Class_55WOGfS5cDac4HRi.f_2383)
                  * Math.sin((Class_55WOGfS5cDac4HRi.f_2384 * var0 - Class_55WOGfS5cDac4HRi.f_2385) * Class_55WOGfS5cDac4HRi.f_2386)
                  / Class_55WOGfS5cDac4HRi.f_2387
               + 1.0
      )
      : var0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2293 = var0 -> var0 != 0.0
      ? (float)Math.pow(Class_55WOGfS5cDac4HRi.f_2370, Class_55WOGfS5cDac4HRi.f_2371 * var0 - Class_55WOGfS5cDac4HRi.f_2372)
      : var0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2294 = var0 -> var0 != 1.0
      ? (float)(1.0 - Math.pow(Class_55WOGfS5cDac4HRi.f_2368, Class_55WOGfS5cDac4HRi.f_2369 * var0))
      : var0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2295 = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(
         var0 < Class_55WOGfS5cDac4HRi.f_2358
            ? Math.pow(Class_55WOGfS5cDac4HRi.f_2359, Class_55WOGfS5cDac4HRi.f_2360 * var0 - Class_55WOGfS5cDac4HRi.f_2361) / Class_55WOGfS5cDac4HRi.f_2362
            : (Class_55WOGfS5cDac4HRi.f_2363 - Math.pow(Class_55WOGfS5cDac4HRi.f_2364, Class_55WOGfS5cDac4HRi.f_2365 * var0 + Class_55WOGfS5cDac4HRi.f_2366))
               / Class_55WOGfS5cDac4HRi.f_2367
      )
      : var0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2296 = var0 -> (float)(
      Class_55WOGfS5cDac4HRi.f_2354 * Math.pow(var0, Class_55WOGfS5cDac4HRi.f_2355)
         - Class_55WOGfS5cDac4HRi.f_2356 * Math.pow(var0, Class_55WOGfS5cDac4HRi.f_2357)
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2297 = var0 -> (float)(
      1.0
         + Class_55WOGfS5cDac4HRi.f_2350 * Math.pow(var0 - 1.0, Class_55WOGfS5cDac4HRi.f_2351)
         + Class_55WOGfS5cDac4HRi.f_2352 * Math.pow(var0 - 1.0, Class_55WOGfS5cDac4HRi.f_2353)
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2298 = var0 -> var0;
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2299 = var0 -> (float)(
      var0 < Class_55WOGfS5cDac4HRi.f_2335
         ? Math.pow(Class_55WOGfS5cDac4HRi.f_2336 * var0, Class_55WOGfS5cDac4HRi.f_2337)
            * (Class_55WOGfS5cDac4HRi.f_2338 * var0 - Class_55WOGfS5cDac4HRi.f_2339)
            / Class_55WOGfS5cDac4HRi.f_2340
         : (
               Math.pow(Class_55WOGfS5cDac4HRi.f_2341 * var0 - Class_55WOGfS5cDac4HRi.f_2342, Class_55WOGfS5cDac4HRi.f_2343)
                     * (Class_55WOGfS5cDac4HRi.f_2344 * (var0 * Class_55WOGfS5cDac4HRi.f_2345 - Class_55WOGfS5cDac4HRi.f_2346) + Class_55WOGfS5cDac4HRi.f_2347)
                  + Class_55WOGfS5cDac4HRi.f_2348
            )
            / Class_55WOGfS5cDac4HRi.f_2349
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2300 = var0 -> {
      float var1 = Class_55WOGfS5cDac4HRi.f_2321;
      float var2 = Class_55WOGfS5cDac4HRi.f_2322;
      if (var0 < 1.0 / var2) {
         return (float)(var1 * Math.pow(var0, Class_55WOGfS5cDac4HRi.f_2323));
      } else {
         return var0 < Class_55WOGfS5cDac4HRi.f_2324 / var2
            ? (float)(var1 * Math.pow(var0 - Class_55WOGfS5cDac4HRi.f_2325 / var2, Class_55WOGfS5cDac4HRi.f_2326) + Class_55WOGfS5cDac4HRi.f_2327)
            : (float)(
               var0 < Class_55WOGfS5cDac4HRi.f_2328 / var2
                  ? var1 * Math.pow(var0 - Class_55WOGfS5cDac4HRi.f_2329 / var2, Class_55WOGfS5cDac4HRi.f_2330) + Class_55WOGfS5cDac4HRi.f_2331
                  : var1 * Math.pow(var0 - Class_55WOGfS5cDac4HRi.f_2332 / var2, Class_55WOGfS5cDac4HRi.f_2333) + Class_55WOGfS5cDac4HRi.f_2334
            );
      }
   };
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2301 = var0 -> (float)(1.0 - f_2300.m_1432((float)(1.0 - var0)));
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2302 = var0 -> (float)(
      var0 < Class_55WOGfS5cDac4HRi.f_2316
         ? (1.0 - f_2300.m_1432((float)(1.0 - Class_55WOGfS5cDac4HRi.f_2317 * var0))) / Class_55WOGfS5cDac4HRi.f_2318
         : (1.0 + f_2300.m_1432((float)(Class_55WOGfS5cDac4HRi.f_2319 * var0 - 1.0))) / Class_55WOGfS5cDac4HRi.f_2320
   );
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2303 = var0 -> var0 < Class_55WOGfS5cDac4HRi.f_2311
      ? Class_55WOGfS5cDac4HRi.f_2312 * var0 * var0 * var0 * var0 * var0
      : (float)(1.0 - Math.pow(Class_55WOGfS5cDac4HRi.f_2313 * var0 + 2.0F, Class_55WOGfS5cDac4HRi.f_2314) / Class_55WOGfS5cDac4HRi.f_2315);
   public static final Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 f_2304 = var0 -> (float)(
      var0 < Class_55WOGfS5cDac4HRi.f_2305
         ? Class_55WOGfS5cDac4HRi.f_2306 * var0 * var0 * var0
         : (var0 - 1.0)
               * (Class_55WOGfS5cDac4HRi.f_2307 * var0 - Class_55WOGfS5cDac4HRi.f_2308)
               * (Class_55WOGfS5cDac4HRi.f_2309 * var0 - Class_55WOGfS5cDac4HRi.f_2310)
            + 1.0
   );
   private static final double f_2305 = 0.5;
   private static final double f_2306 = 4.0;
   private static final double f_2307 = 2.0;
   private static final double f_2308 = 2.0;
   private static final double f_2309 = 2.0;
   private static final double f_2310 = 2.0;
   private static final double f_2311 = 0.5;
   private static final float f_2312 = 16.0F;
   private static final float f_2313 = -2.0F;
   private static final double f_2314 = 5.0;
   private static final double f_2315 = 2.0;
   private static final double f_2316 = 0.5;
   private static final double f_2317 = 2.0;
   private static final double f_2318 = 2.0;
   private static final double f_2319 = 2.0;
   private static final double f_2320 = 2.0;
   private static final float f_2321 = 7.5625F;
   private static final float f_2322 = 2.75F;
   private static final double f_2323 = 2.0;
   private static final double f_2324 = 2.0;
   private static final double f_2325 = 1.5;
   private static final double f_2326 = 2.0;
   private static final double f_2327 = 0.75;
   private static final double f_2328 = 2.5;
   private static final double f_2329 = 2.25;
   private static final double f_2330 = 2.0;
   private static final double f_2331 = 0.9375;
   private static final double f_2332 = 2.625;
   private static final double f_2333 = 2.0;
   private static final double f_2334 = 0.984375;
   private static final double f_2335 = 0.5;
   private static final double f_2336 = 2.0;
   private static final double f_2337 = 2.0;
   private static final double f_2338 = 7.189819;
   private static final double f_2339 = 2.5949095;
   private static final double f_2340 = 2.0;
   private static final double f_2341 = 2.0;
   private static final double f_2342 = 2.0;
   private static final double f_2343 = 2.0;
   private static final double f_2344 = 3.5949095;
   private static final double f_2345 = 2.0;
   private static final double f_2346 = 2.0;
   private static final double f_2347 = 2.5949095;
   private static final double f_2348 = 2.0;
   private static final double f_2349 = 2.0;
   private static final double f_2350 = 2.70158;
   private static final double f_2351 = 3.0;
   private static final double f_2352 = 1.70158;
   private static final double f_2353 = 2.0;
   private static final double f_2354 = 2.70158;
   private static final double f_2355 = 3.0;
   private static final double f_2356 = 1.70158;
   private static final double f_2357 = 2.0;
   private static final double f_2358 = 0.5;
   private static final double f_2359 = 2.0;
   private static final double f_2360 = 20.0;
   private static final double f_2361 = 10.0;
   private static final double f_2362 = 2.0;
   private static final double f_2363 = 2.0;
   private static final double f_2364 = 2.0;
   private static final double f_2365 = -20.0;
   private static final double f_2366 = 10.0;
   private static final double f_2367 = 2.0;
   private static final double f_2368 = 2.0;
   private static final double f_2369 = -10.0;
   private static final double f_2370 = 2.0;
   private static final double f_2371 = 10.0;
   private static final double f_2372 = 10.0;
   private static final double f_2373 = 0.5;
   private static final double f_2374 = 2.0;
   private static final double f_2375 = 20.0;
   private static final double f_2376 = 10.0;
   private static final double f_2377 = 20.0;
   private static final double f_2378 = 11.125;
   private static final double f_2379 = Math.PI * 4.0 / 9.0;
   private static final double f_2380 = 2.0;
   private static final double f_2381 = 2.0;
   private static final double f_2382 = -20.0;
   private static final double f_2383 = 10.0;
   private static final double f_2384 = 20.0;
   private static final double f_2385 = 11.125;
   private static final double f_2386 = Math.PI * 4.0 / 9.0;
   private static final double f_2387 = 2.0;
   private static final double f_2388 = 2.0;
   private static final double f_2389 = -10.0;
   private static final double f_2390 = 10.0;
   private static final double f_2391 = 0.75;
   private static final double f_2392 = Math.PI * 2.0 / 3.0;
   private static final double f_2393 = -2.0;
   private static final double f_2394 = 10.0;
   private static final double f_2395 = 10.0;
   private static final double f_2396 = 10.0;
   private static final double f_2397 = 10.75;
   private static final double f_2398 = Math.PI * 2.0 / 3.0;
   private static final double f_2399 = 0.5;
   private static final double f_2400 = 2.0;
   private static final double f_2401 = 2.0;
   private static final double f_2402 = 2.0;
   private static final double f_2403 = -2.0;
   private static final double f_2404 = 2.0;
   private static final double f_2405 = 2.0;
   private static final double f_2406 = 2.0;
   private static final double f_2407 = 2.0;
   private static final double f_2408 = 2.0;
   private static final double f_2409 = Math.PI;
   private static final double f_2410 = 2.0;
   private static final double f_2411 = Math.PI;
   private static final double f_2412 = 2.0;
   private static final double f_2413 = Math.PI;
   private static final double f_2414 = 2.0;

   @FunctionalInterface
   public interface BsATJwRDU1ox4gC3 {
      float m_1432(float var1);
   }
}
