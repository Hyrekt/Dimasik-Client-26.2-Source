package dev.dimasik.client.system;

import com.google.common.collect.ArrayListMultimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.ItemLore;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.phys.Vec3;

public final class Class_fFSER1OTAD5huhkq {
   private static final Pattern f_19349 = Pattern.compile(Class_fFSER1OTAD5huhkq.f_19417);
   private static final Pattern f_19350 = Pattern.compile(Class_fFSER1OTAD5huhkq.f_19418);
   private static final Pattern f_19351 = Pattern.compile(Class_fFSER1OTAD5huhkq.f_19419);
   private static final Map<String, String> f_19352 = new HashMap<>();
   private static final Map<String, ItemStack> f_19353 = new HashMap<>();
   private static final Map<String, Item> f_19354 = new HashMap<>();
   private static final Map<String, Class_fFSER1OTAD5huhkq.Rx61qxI53N0fi8BX> f_19355 = new HashMap<>();
   private static final Map<String, Class_fFSER1OTAD5huhkq.FaufsHfBd6ryjD1I> f_19356 = new HashMap<>();
   private static final String f_19357 = "$";
   private static final String f_19358 = "Цена";
   private static final String f_19359 = "[^0-9]";
   private static final String f_19360 = "млн";
   private static final String f_19361 = "m";
   private static final String f_19362 = "м";
   private static final long f_19363 = 1000000L;
   private static final String f_19364 = "тыс";
   private static final String f_19365 = "k";
   private static final String f_19366 = "к";
   private static final long f_19367 = 1000L;
   private static final String f_19368 = "[^0-9]";
   private static final double f_19369 = 100.0;
   private static final long f_19370 = -1L;
   private static final String f_19371 = "Вы успешно купили ";
   private static final String f_19372 = " за ";
   private static final long f_19373 = -1L;
   private static final String f_19374 = "[^\\d]";
   private static final long f_19375 = -1L;
   private static final long f_19376 = -1L;
   private static final long f_19377 = -1L;
   private static final long f_19378 = -1L;
   private static final long f_19379 = -1L;
   private static final String f_19380 = "(?i)§.";
   private static final String f_19381 = "(?i)&.";
   private static final String f_19382 = "\\[[^\\]]*]";
   private static final String f_19383 = " ";
   private static final String f_19384 = "[★✦✧✪✫✬✭✮✯✰❄☃⚒☠❤❣♕♛♜♞♟]";
   private static final String f_19385 = " ";
   private static final String f_19386 = "xxx";
   private static final String f_19387 = " ";
   private static final String f_19388 = "\\s+";
   private static final String f_19389 = " ";
   private static final String f_19390 = "textures";
   private static final String f_19391 = "textures";
   private static final String f_19392 = "FunTimeHead";
   private static final double f_19393 = 1.0E-4;
   private static final String f_19394 = "minecraft:block.anvil.place";
   private static final float f_19395 = 0.5F;
   private static final float f_19396 = 0.7F;
   private static final float f_19397 = 1.1F;
   private static final float f_19398 = 0.5F;
   private static final long f_19399 = 20000L;
   private static final String f_19400 = "minecraft:entity.wither.break_block";
   private static final String f_19401 = "minecraft:block.anvil.place";
   private static final float f_19402 = 0.7F;
   private static final float f_19403 = 0.2F;
   private static final long f_19404 = 15000L;
   private static final String f_19405 = "(?i)§.";
   private static final int f_19406 = 65306;
   private static final String f_19407 = "\\s*:\\s*";
   private static final String f_19408 = ":";
   private static final String f_19409 = "аукцион";
   private static final String f_19410 = "auction";
   private static final String f_19411 = "поиск:";
   private static final String f_19412 = "search:";
   private static final String f_19413 = "п:";
   private static final String f_19414 = "漢:";
   private static final String f_19415 = "\ud83d\udd0e:";
   private static final String f_19416 = "\ud83d\udd0d:";
   private static final String f_19417 = "Продавец:\\s*(.+)";
   private static final String f_19418 = "(?i)§[0-9A-FK-OR]";
   private static final String f_19419 = "(?iu)подождите\\s+(\\d+)\\s*сек";
   private static final String f_19420 = "Сфера Хаоса";
   private static final String f_19421 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODY0MTkwMCwKICAicHJvZmlsZUlkIiA6ICIxNzRjZmRiNGEzY2I0M2I1YmZjZGU0MjRjM2JiMmM2ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJhZWwxOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lN2E3YWU3Y2RjZjYxNmU4YjdhNDIyMWE2MjFiMjQzNTc1M2M2MGVkNmEyNThlYTA2MGRhZTMwMDJmZmU5ZTI4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
   private static final String f_19422 = "Сфера Титана";
   private static final String f_19423 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM1NDQ1NTE5MiwKICAicHJvZmlsZUlkIiA6ICJkOTcwYzEzZTM4YWI0NzlhOTY1OGM1ZDQ1MjZkMTM0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmltcHlMYWNlODUxMjciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODFlOTY5ODQ1OGI3ODQxYzk2YWU0ZjI0ZWM4NGFlMDE3MjQxMDA2NDFjNTY0ZTJhN2IxODVmNDA2ZThlZDIzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
   private static final String f_19424 = "Сфера Ареса";
   private static final String f_19425 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM0Mzc3NDI1NSwKICAicHJvZmlsZUlkIiA6ICJhZWNkODIxZTQyYzE0ZDJlOThmNTA1OTg1MWI5OWMzNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJqdXNhbXUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzE2YWRjNmJhZmNiNTdmZDcwN2RlZTdkZDZhNzM2ZmUxMjY3MTFkNTNhMWZkNmNlNzg5ZGE0MWIzYmUxM2YyYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
   private static final String f_19426 = "Сфера Бестии";
   private static final String f_19427 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM0MzgzNDkzMCwKICAicHJvZmlsZUlkIiA6ICI1MzUzNWIxN2M0ZDY0NWQ0YWUwY2U2ZjM4Zjk0NTFjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJVYml2aXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQxMWFjMTczODFiOWZjZTliYWIzYzcyYWZkYjdmMTk4NTcwZGFmNDczMmJkODExZDMxYzIyN2Q4MGZhMzliMSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
   private static final String f_19428 = "Сфера Гидры";
   private static final String f_19429 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODUzMjE4MywKICAicHJvZmlsZUlkIiA6ICI1OGZmZWI5NTMxNGQ0ODcwYTQwYjVjYjQyZDRlYTU5OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa2luREJuZXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2UzYzExOGQ2OTZkOTEwZTU0ZGUwMmNhNGQ4MDc1NDNmOWIxOGMwMDhjOTgzOGQyZmY2OTM3NzYyMmZiMWQzMiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
   private static final String f_19430 = "Сфера Икара";
   private static final String f_19431 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODU4MjQ5MSwKICAicHJvZmlsZUlkIiA6ICJhZWNkODIxZTQyYzE0ZDJlOThmNTA1OTg1MWI5OWMzNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSb2RyaVgyMDc1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M2ODAzZTZkNTY2N2EyZDYxMDYyOGJjM2IzMmY4NjNjZGE0OTVjNDY1NjE2ZGU2NTVjYjMyOTkzM2I2MWFmNzciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
   private static final String f_19432 = "Сфера Эрида";
   private static final String f_19433 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDM0Mzg2MTE4NywKICAicHJvZmlsZUlkIiA6ICJlZGUyYzdhMGFjNjM0MTNiYjA5ZDNmMGJlZTllYzhlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVEZXZKYWRlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZlNGUyZjEwNDdmM2VjNmU5ZTQ1OTE4NDczOWUzM2I3YzFmYzYzYWQ4MjAyYmRhYjlmMDI0NTA4YWRkMjNlNWIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
   private static final String f_19434 = "Сфера Сатира";
   private static final String f_19435 = "ewogICJ0aW1lc3RhbXAiIDogMTc1MDI3ODYwODUyOCwKICAicHJvZmlsZUlkIiA6ICJkMTQ4NjFiM2UwZmM0Njk5OTFlMTcyNTllMzdiZjZhZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJyYXhpdG9jbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83NzFhOWE0OThiNGZhNWVjNDkzNjJmOWJjODhlZGE0ZjUyYjA0ZGU0OWQ3NWFhM2NhMzMyYTFmZWExYWEwZTU3IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
   private static final String f_19436 = "Дезориентация";
   private static final String f_19437 = "Явная Пыль";
   private static final String f_19438 = "Божья Аура";
   private static final String f_19439 = "Трапка";
   private static final String f_19440 = "Пласт";
   private static final String f_19441 = "Снежок Заморозка";
   private static final String f_19442 = "Снотворное";
   private static final String f_19443 = "Святая Вода";
   private static final String f_19444 = "Хлопушка";
   private static final String f_19445 = "Зелье Ассасина";
   private static final String f_19446 = "Зелье Гнева";
   private static final String f_19447 = "Зелье Палладина";
   private static final String f_19448 = "Зелье Радиации";
   private static final String f_19449 = "Талисман Демона";
   private static final String f_19450 = "Талисман Карателя";
   private static final String f_19451 = "Талисман Крушителя";
   private static final String f_19452 = "Талисман Мрака";
   private static final String f_19453 = "Талисман Раздора";
   private static final String f_19454 = "Талисман Сара";
   private static final String f_19455 = "Талисман Сары";
   private static final String f_19456 = "Талисман Тирана";
   private static final String f_19457 = "Талисман Ярости";
   private static final String f_19458 = "Божье Касание";
   private static final String f_19459 = "Блок дамагер";
   private static final String f_19460 = "Мега Бульдозер";
   private static final String f_19461 = "Огненный Смерч";
   private static final String f_19462 = "Проклятая Душа";
   private static final String f_19463 = "Отмычка к Сферам";
   private static final String f_19464 = "Нерушимые Элитры";
   private static final String f_19465 = "Маяк";
   private static final String f_19466 = "Серебро";
   private static final String f_19467 = "Драконий Скин";
   private static final String f_19468 = "Шлем Крушителя";
   private static final String f_19469 = "Нагрудник Крушителя";
   private static final String f_19470 = "Поножи Крушителя";
   private static final String f_19471 = "Ботинки Крушителя";
   private static final String f_19472 = "Меч Крушителя";
   private static final String f_19473 = "Кирка Крушителя";
   private static final String f_19474 = "Булава Крушителя";
   private static final String f_19475 = "Трезубец Крушителя";
   private static final String f_19476 = "Лук Крушителя";
   private static final String f_19477 = "Арбалет Крушителя";
   private static final String f_19478 = "Удочка Крушителя";
   private static final String f_19479 = "Элитры Крушителя";
   private static final String f_19480 = "Опыт 15";
   private static final String f_19481 = "Опыт 30";
   private static final String f_19482 = "Опыт 45";
   private static final String f_19483 = "Опыт 50";
   private static final String f_19484 = "Шлем Крушителя";
   private static final String f_19485 = "Нагрудник Крушителя";
   private static final String f_19486 = "Поножи Крушителя";
   private static final String f_19487 = "Ботинки Крушителя";
   private static final String f_19488 = "Меч Крушителя";
   private static final String f_19489 = "Кирка Крушителя";
   private static final String f_19490 = "Булава Крушителя";
   private static final String f_19491 = "Трезубец Крушителя";
   private static final String f_19492 = "Арбалет Крушителя";
   private static final String f_19493 = "Лук Крушителя";
   private static final String f_19494 = "Элитры Крушителя";
   private static final String f_19495 = "Удочка Крушителя";
   private static final String f_19496 = "Сфера Хаоса";
   private static final double f_19497 = 2.5;
   private static final double f_19498 = 0.07;
   private static final double f_19499 = 0.13;
   private static final double f_19500 = 1.5;
   private static final double f_19501 = -4.0;
   private static final double f_19502 = 0.09;
   private static final String f_19503 = "Сфера Титана";
   private static final double f_19504 = 2.5;
   private static final double f_19505 = 2.5;
   private static final double f_19506 = -0.15;
   private static final String f_19507 = "Сфера Ареса";
   private static final double f_19508 = 6.0;
   private static final double f_19509 = -2.0;
   private static final double f_19510 = -2.0;
   private static final String f_19511 = "Сфера Бестии";
   private static final double f_19512 = 4.0;
   private static final double f_19513 = 0.1;
   private static final double f_19514 = 0.1;
   private static final String f_19515 = "Сфера Гидры";
   private static final double f_19516 = 2.0;
   private static final double f_19517 = 4.0;
   private static final double f_19518 = 0.5;
   private static final double f_19519 = 0.5;
   private static final String f_19520 = "Сфера Икара";
   private static final double f_19521 = 2.0;
   private static final double f_19522 = 2.0;
   private static final String f_19523 = "Сфера Эрида";
   private static final double f_19524 = 2.0;
   private static final String f_19525 = "Сфера Сатира";
   private static final double f_19526 = 2.0;
   private static final double f_19527 = -0.1;
   private static final double f_19528 = 0.15;
   private static final String f_19529 = "Талисман Демона";
   private static final double f_19530 = 2.5;
   private static final double f_19531 = 0.1;
   private static final String f_19532 = "Талисман Карателя";
   private static final double f_19533 = 7.0;
   private static final double f_19534 = -4.0;
   private static final double f_19535 = 0.1;
   private static final String f_19536 = "Талисман Мрака";
   private static final double f_19537 = 1.5;
   private static final double f_19538 = 1.5;
   private static final String f_19539 = "Талисман Ярости";
   private static final double f_19540 = 5.0;
   private static final double f_19541 = -4.0;
   private static final String f_19542 = "Талисман Тирана";
   private static final double f_19543 = 2.0;
   private static final double f_19544 = 2.0;
   private static final double f_19545 = -4.0;
   private static final String f_19546 = "Талисман Крушителя";
   private static final double f_19547 = 4.0;
   private static final double f_19548 = 3.0;
   private static final double f_19549 = 2.0;
   private static final double f_19550 = 2.0;
   private static final String f_19551 = "Талисман Раздора";
   private static final double f_19552 = 4.0;
   private static final double f_19553 = 2.0;
   private static final double f_19554 = 0.1;
   private static final double f_19555 = 0.1;
   private static final double f_19556 = -3.0;
   private static final String f_19557 = "Талисман Сара";
   private static final double f_19558 = 2.0;
   private static final String f_19559 = "Талисман Сары";
   private static final double f_19560 = 2.0;

   public static long m_6463(long var0, int var2) {
      double var3 = var2 / f_19369;
      long var5 = (long)(var0 * var3);
      return Math.max(1L, var0 - var5);
   }

   public static boolean m_6464(String var0, ItemStack var1) {
      if (var1 == null || var1.isEmpty()) {
         return false;
      }

      if (f_19355.containsKey(var0)) {
         return m_6476(var0, var1);
      }

      Class_fFSER1OTAD5huhkq.FaufsHfBd6ryjD1I var2 = f_19356.get(var0);
      return var2 != null ? m_6477(var2, var1) : m_6465(var1);
   }

   private static boolean m_6465(ItemStack var0) {
      return var0.get(DataComponents.LORE) != null || var0.get(DataComponents.CUSTOM_DATA) != null;
   }

   private Class_fFSER1OTAD5huhkq() {
   }

   static {
      f_19352.put(f_19420, f_19421);
      f_19352.put(f_19422, f_19423);
      f_19352.put(f_19424, f_19425);
      f_19352.put(f_19426, f_19427);
      f_19352.put(f_19428, f_19429);
      f_19352.put(f_19430, f_19431);
      f_19352.put(f_19432, f_19433);
      f_19352.put(f_19434, f_19435);
      f_19354.put(f_19436, Items.ENDER_EYE);
      f_19354.put(f_19437, Items.SUGAR);
      f_19354.put(f_19438, Items.PHANTOM_MEMBRANE);
      f_19354.put(f_19439, Items.NETHERITE_SCRAP);
      f_19354.put(f_19440, Items.DRIED_KELP);
      f_19354.put(f_19441, Items.SNOWBALL);
      f_19354.put(f_19442, Items.SPLASH_POTION);
      f_19354.put(f_19443, Items.SPLASH_POTION);
      f_19354.put(f_19444, Items.SPLASH_POTION);
      f_19354.put(f_19445, Items.SPLASH_POTION);
      f_19354.put(f_19446, Items.SPLASH_POTION);
      f_19354.put(f_19447, Items.SPLASH_POTION);
      f_19354.put(f_19448, Items.SPLASH_POTION);
      f_19354.put(f_19449, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19450, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19451, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19452, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19453, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19454, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19455, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19456, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19457, Items.TOTEM_OF_UNDYING);
      f_19354.put(f_19458, Items.GOLDEN_PICKAXE);
      f_19354.put(f_19459, Items.JIGSAW);
      f_19354.put(f_19460, Items.NETHERITE_PICKAXE);
      f_19354.put(f_19461, Items.FIRE_CHARGE);
      f_19354.put(f_19462, Items.SOUL_LANTERN);
      f_19354.put(f_19463, Items.TRIPWIRE_HOOK);
      f_19354.put(f_19464, Items.ELYTRA);
      f_19354.put(f_19465, Items.BEACON);
      f_19354.put(f_19466, Items.IRON_NUGGET);
      f_19354.put(f_19467, Items.PAPER);
      f_19354.put(f_19468, Items.NETHERITE_HELMET);
      f_19354.put(f_19469, Items.NETHERITE_CHESTPLATE);
      f_19354.put(f_19470, Items.NETHERITE_LEGGINGS);
      f_19354.put(f_19471, Items.NETHERITE_BOOTS);
      f_19354.put(f_19472, Items.NETHERITE_SWORD);
      f_19354.put(f_19473, Items.NETHERITE_PICKAXE);
      f_19354.put(f_19474, Items.MACE);
      f_19354.put(f_19475, Items.TRIDENT);
      f_19354.put(f_19476, Items.BOW);
      f_19354.put(f_19477, Items.CROSSBOW);
      f_19354.put(f_19478, Items.FISHING_ROD);
      f_19354.put(f_19479, Items.ELYTRA);
      f_19354.put(f_19480, Items.EXPERIENCE_BOTTLE);
      f_19354.put(f_19481, Items.EXPERIENCE_BOTTLE);
      f_19354.put(f_19482, Items.EXPERIENCE_BOTTLE);
      f_19354.put(f_19483, Items.EXPERIENCE_BOTTLE);
      m_6471(
         f_19484,
         Items.NETHERITE_HELMET,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.AQUA_AFFINITY,
         1,
         Enchantments.RESPIRATION,
         3,
         Enchantments.PROTECTION,
         5
      );
      m_6471(
         f_19485,
         Items.NETHERITE_CHESTPLATE,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.UNBREAKING,
         5
      );
      m_6471(
         f_19486,
         Items.NETHERITE_LEGGINGS,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.UNBREAKING,
         5
      );
      m_6471(
         f_19487,
         Items.NETHERITE_BOOTS,
         Enchantments.MENDING,
         1,
         Enchantments.FIRE_PROTECTION,
         5,
         Enchantments.DEPTH_STRIDER,
         3,
         Enchantments.PROJECTILE_PROTECTION,
         5,
         Enchantments.FEATHER_FALLING,
         4,
         Enchantments.SOUL_SPEED,
         3,
         Enchantments.BLAST_PROTECTION,
         5,
         Enchantments.PROTECTION,
         5,
         Enchantments.UNBREAKING,
         5
      );
      m_6471(
         f_19488,
         Items.NETHERITE_SWORD,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.SMITE,
         7,
         Enchantments.SWEEPING_EDGE,
         3,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.BANE_OF_ARTHROPODS,
         7,
         Enchantments.SHARPNESS,
         7,
         Enchantments.LOOTING,
         5
      );
      m_6471(f_19489, Items.NETHERITE_PICKAXE, Enchantments.UNBREAKING, 5, Enchantments.MENDING, 1, Enchantments.EFFICIENCY, 10, Enchantments.FORTUNE, 5);
      m_6471(
         f_19490,
         Items.MACE,
         Enchantments.SHARPNESS,
         7,
         Enchantments.SMITE,
         7,
         Enchantments.BANE_OF_ARTHROPODS,
         7,
         Enchantments.DENSITY,
         5,
         Enchantments.BREACH,
         3,
         Enchantments.SWEEPING_EDGE,
         3,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.LOOTING,
         5,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1
      );
      m_6471(
         f_19491,
         Items.TRIDENT,
         Enchantments.UNBREAKING,
         5,
         Enchantments.MENDING,
         1,
         Enchantments.CHANNELING,
         1,
         Enchantments.FIRE_ASPECT,
         2,
         Enchantments.IMPALING,
         5,
         Enchantments.SHARPNESS,
         7,
         Enchantments.LOYALTY,
         3
      );
      m_6471(
         f_19492,
         Items.CROSSBOW,
         Enchantments.QUICK_CHARGE,
         3,
         Enchantments.MENDING,
         1,
         Enchantments.PIERCING,
         5,
         Enchantments.UNBREAKING,
         3,
         Enchantments.MULTISHOT,
         1
      );
      m_6473(f_19493, Items.BOW);
      m_6473(f_19494, Items.ELYTRA);
      m_6473(f_19495, Items.FISHING_ROD);
      m_6469(
         f_19496,
         Items.PLAYER_HEAD,
         Attributes.ATTACK_DAMAGE,
         f_19497,
         Attributes.MOVEMENT_SPEED,
         f_19498,
         Attributes.ATTACK_SPEED,
         f_19499,
         Attributes.ARMOR,
         f_19500,
         Attributes.MAX_HEALTH,
         f_19501,
         Attributes.GRAVITY,
         f_19502
      );
      m_6469(f_19503, Items.PLAYER_HEAD, Attributes.ARMOR, f_19504, Attributes.ARMOR_TOUGHNESS, f_19505, Attributes.MOVEMENT_SPEED, f_19506);
      m_6469(f_19507, Items.PLAYER_HEAD, Attributes.ATTACK_DAMAGE, f_19508, Attributes.ARMOR, f_19509, Attributes.MAX_HEALTH, f_19510);
      m_6469(
         f_19511,
         Items.PLAYER_HEAD,
         Attributes.ARMOR,
         1.0,
         Attributes.MAX_HEALTH,
         f_19512,
         Attributes.MOVEMENT_SPEED,
         f_19513,
         Attributes.ATTACK_SPEED,
         f_19514
      );
      m_6469(
         f_19515,
         Items.PLAYER_HEAD,
         Attributes.ARMOR,
         f_19516,
         Attributes.MAX_HEALTH,
         f_19517,
         Attributes.SUBMERGED_MINING_SPEED,
         f_19518,
         Attributes.OXYGEN_BONUS,
         f_19519
      );
      m_6469(f_19520, Items.PLAYER_HEAD, Attributes.ATTACK_DAMAGE, f_19521, Attributes.MAX_HEALTH, f_19522);
      m_6469(f_19523, Items.PLAYER_HEAD, Attributes.LUCK, 1.0, Attributes.MAX_HEALTH, f_19524, Attributes.BLOCK_INTERACTION_RANGE, 1.0);
      m_6469(f_19525, Items.PLAYER_HEAD, Attributes.ATTACK_DAMAGE, f_19526, Attributes.JUMP_STRENGTH, f_19527, Attributes.ATTACK_SPEED, f_19528);
      m_6469(f_19529, Items.TOTEM_OF_UNDYING, Attributes.ATTACK_DAMAGE, f_19530, Attributes.ATTACK_SPEED, f_19531);
      m_6469(f_19532, Items.TOTEM_OF_UNDYING, Attributes.ATTACK_DAMAGE, f_19533, Attributes.MAX_HEALTH, f_19534, Attributes.MOVEMENT_SPEED, f_19535);
      m_6469(f_19536, Items.TOTEM_OF_UNDYING, Attributes.ARMOR, f_19537, Attributes.MAX_HEALTH, f_19538);
      m_6469(f_19539, Items.TOTEM_OF_UNDYING, Attributes.ATTACK_DAMAGE, f_19540, Attributes.MAX_HEALTH, f_19541);
      m_6469(f_19542, Items.TOTEM_OF_UNDYING, Attributes.ATTACK_DAMAGE, f_19543, Attributes.ARMOR, f_19544, Attributes.MAX_HEALTH, f_19545);
      m_6469(
         f_19546,
         Items.TOTEM_OF_UNDYING,
         Attributes.MAX_HEALTH,
         f_19547,
         Attributes.ATTACK_DAMAGE,
         f_19548,
         Attributes.ARMOR_TOUGHNESS,
         f_19549,
         Attributes.ARMOR,
         f_19550
      );
      m_6469(
         f_19551,
         Items.TOTEM_OF_UNDYING,
         Attributes.ATTACK_DAMAGE,
         f_19552,
         Attributes.MAX_HEALTH,
         f_19553,
         Attributes.MOVEMENT_SPEED,
         f_19554,
         Attributes.ATTACK_SPEED,
         f_19555,
         Attributes.ARMOR,
         f_19556
      );
      m_6469(f_19557, Items.TOTEM_OF_UNDYING, Attributes.MAX_HEALTH, f_19558);
      m_6469(f_19559, Items.TOTEM_OF_UNDYING, Attributes.MAX_HEALTH, f_19560);
   }

   public static String m_6466(String var0) {
      return f_19352.get(var0);
   }

   public static long m_6467(String var0) {
      if (var0 == null) {
         return f_19377;
      }

      Matcher var1 = f_19351.matcher(f_19350.matcher(var0).replaceAll(""));
      if (!var1.find()) {
         return f_19378;
      }

      try {
         return Long.parseLong(var1.group(1));
      } catch (NumberFormatException var3) {
         return f_19379;
      }
   }

   public static boolean m_6468(String var0) {
      if (var0 == null) {
         return false;
      }

      String var1 = var0.replaceAll(f_19405, "").replace(' ', ' ').replace((char)f_19406, ':').replaceAll(f_19407, f_19408).trim().toLowerCase(Locale.ROOT);
      return var1.contains(f_19409)
         || var1.contains(f_19410)
         || var1.contains(f_19411)
         || var1.contains(f_19412)
         || var1.contains(f_19413)
         || var1.contains(f_19414)
         || var1.contains(f_19415)
         || var1.contains(f_19416);
   }

   private static void m_6469(String var0, Item var1, Object... var2) {
      Holder[] var3 = new Holder[var2.length / 2];
      double[] var4 = new double[var2.length / 2];

      for (int var5 = 0; var5 < var2.length; var5 += 2) {
         var3[var5 / 2] = (Holder)var2[var5];
         var4[var5 / 2] = ((Number)var2[var5 + 1]).doubleValue();
      }

      f_19356.put(var0, new Class_fFSER1OTAD5huhkq.FaufsHfBd6ryjD1I(var1, var3, var4));
   }

   private static int m_6470(ItemStack var0, ResourceKey<Enchantment> var1) {
      ItemEnchantments var2 = (ItemEnchantments)var0.get(DataComponents.ENCHANTMENTS);
      if (var2 == null) {
         return 0;
      }

      for (Entry var4 : var2.entrySet()) {
         if (((Holder)var4.getKey()).is(var1)) {
            return var4.getIntValue();
         }
      }

      return 0;
   }

   private static void m_6471(String var0, Item var1, Object... var2) {
      ResourceKey[] var3 = new ResourceKey[var2.length / 2];
      int[] var4 = new int[var2.length / 2];

      for (int var5 = 0; var5 < var2.length; var5 += 2) {
         var3[var5 / 2] = (ResourceKey)var2[var5];
         var4[var5 / 2] = (Integer)var2[var5 + 1];
      }

      f_19355.put(var0, new Class_fFSER1OTAD5huhkq.Rx61qxI53N0fi8BX(var1, var3, var4, false));
   }

   public static long m_6472(String var0) {
      if (var0 == null) {
         return f_19370;
      }

      String var1 = f_19371;
      String var2 = f_19372;
      int var3 = var0.indexOf(var1);
      int var4 = var0.indexOf(var2);
      if (var3 != -1 && var4 != -1) {
         String var5 = var0.substring(var4 + var2.length()).replaceAll(f_19374, "").trim();
         if (var5.isEmpty()) {
            return f_19375;
         }

         try {
            return Long.parseLong(var5);
         } catch (NumberFormatException var7) {
            return f_19376;
         }
      } else {
         return f_19373;
      }
   }

   private static void m_6473(String var0, Item var1) {
      f_19355.put(var0, new Class_fFSER1OTAD5huhkq.Rx61qxI53N0fi8BX(var1, new ResourceKey[0], new int[0], true));
   }

   public static long m_6474(String var0) {
      if (var0 == null) {
         return 0L;
      }

      String var1 = var0.replace(' ', ' ').toLowerCase(Locale.ROOT).trim();
      long var2 = 1L;
      if (var1.contains(f_19360) || var1.endsWith(f_19361) || var1.endsWith(f_19362)) {
         var2 = f_19363;
      } else if (var1.contains(f_19364) || var1.endsWith(f_19365) || var1.endsWith(f_19366)) {
         var2 = f_19367;
      }

      String var4 = var1.replaceAll(f_19368, "");
      if (var4.isEmpty()) {
         return 0L;
      }

      try {
         return Math.multiplyExact(Long.parseLong(var4), var2);
      } catch (ArithmeticException | NumberFormatException var6) {
         return 0L;
      }
   }

   public static long m_6475(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         ItemLore var1 = (ItemLore)var0.getComponents().get(DataComponents.LORE);
         if (var1 == null) {
            return 0L;
         }

         for (Component var3 : var1.lines()) {
            String var4 = var3.getString();
            if (var4.contains(f_19357) || var4.contains(f_19358)) {
               String var5 = var4.replaceAll(f_19359, "");
               if (!var5.isEmpty()) {
                  try {
                     return Long.parseLong(var5);
                  } catch (NumberFormatException var7) {
                     return 0L;
                  }
               }
            }
         }

         return 0L;
      } else {
         return 0L;
      }
   }

   public static boolean m_6476(String var0, ItemStack var1) {
      Class_fFSER1OTAD5huhkq.Rx61qxI53N0fi8BX var2 = f_19355.get(var0);
      if (var2 == null) {
         return true;
      }

      if (var1 != null && !var1.isEmpty() && var1.is(var2.item())) {
         if (var2.needGlint() && !var1.isEnchanted()) {
            return false;
         }

         for (int var3 = 0; var3 < var2.enchants().length; var3++) {
            if (m_6470(var1, var2.enchants()[var3]) < var2.levels()[var3]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static boolean m_6477(Class_fFSER1OTAD5huhkq.FaufsHfBd6ryjD1I var0, ItemStack var1) {
      if (!var1.is(var0.item())) {
         return false;
      }

      ItemAttributeModifiers var2 = (ItemAttributeModifiers)var1.get(DataComponents.ATTRIBUTE_MODIFIERS);
      if (var2 == null) {
         return var0.attributes().length == 0;
      }

      HashMap var3 = new HashMap();
      int var4 = 0;

      for (net.minecraft.world.item.component.ItemAttributeModifiers.Entry var6 : var2.modifiers()) {
         var4++;
         var3.put(var6.attribute(), var6.modifier().amount());
      }

      if (var4 == var0.attributes().length && var3.size() == var0.attributes().length) {
         for (int var7 = 0; var7 < var0.attributes().length; var7++) {
            Double var8 = (Double)var3.get(var0.attributes()[var7]);
            if (var8 == null || Math.abs(var8 - var0.values()[var7]) > f_19393) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static ItemStack m_6478(String var0) {
      if (var0 == null) {
         return null;
      } else if (f_19353.containsKey(var0)) {
         return f_19353.get(var0);
      } else {
         String var1 = f_19352.get(var0);
         if (var1 == null) {
            f_19353.put(var0, null);
            return null;
         } else {
            ItemStack var2 = new ItemStack(Items.PLAYER_HEAD);
            ArrayListMultimap var3 = ArrayListMultimap.create();
            var3.put(f_19390, new Property(f_19391, var1));
            GameProfile var4 = new GameProfile(UUID.randomUUID(), f_19392, new PropertyMap(var3));
            var2.set(DataComponents.PROFILE, ResolvableProfile.createResolved(var4));
            f_19353.put(var0, var2);
            return var2;
         }
      }
   }

   public static String m_6479(String var0) {
      return var0 == null
         ? ""
         : var0.replaceAll(f_19380, "")
            .replaceAll(f_19381, "")
            .replaceAll(f_19382, f_19383)
            .replaceAll(f_19384, f_19385)
            .replace(f_19386, f_19387)
            .replaceAll(f_19388, f_19389)
            .trim();
   }

   public static List<Class_fFSER1OTAD5huhkq.ALB47PXWjX8QyH9A> m_6480(ClientboundSoundPacket var0) {
      ArrayList var1 = new ArrayList(2);
      if (var0 == null) {
         return var1;
      }

      String var2 = m_6482(var0);
      float var3 = var0.getVolume();
      float var4 = var0.getPitch();
      Vec3 var5 = Vec3.atCenterOf(BlockPos.containing(var0.getX(), var0.getY(), var0.getZ()).above());
      if (var2.contains(f_19394) && (var3 == f_19395 || var3 == f_19396) && (var4 == f_19397 || var4 == f_19398)) {
         var1.add(new Class_fFSER1OTAD5huhkq.ALB47PXWjX8QyH9A(Items.DRIED_KELP, var5, f_19399));
      }

      if ((var2.contains(f_19400) || var2.contains(f_19401)) && var3 == f_19402 || var3 == f_19403 && var4 == 1.0F) {
         var1.add(new Class_fFSER1OTAD5huhkq.ALB47PXWjX8QyH9A(Items.NETHERITE_SCRAP, var5, f_19404));
      }

      return var1;
   }

   public static ItemStack m_6481(String var0) {
      ItemStack var1 = m_6478(var0);
      if (var1 != null) {
         return var1.copy();
      }

      Item var2 = f_19354.get(var0);
      return var2 == null ? null : new ItemStack(var2);
   }

   private static String m_6482(ClientboundSoundPacket var0) {
      Identifier var1 = ((SoundEvent)var0.getSound().value()).location();
      return var1 == null ? "" : var1.toString();
   }

   public static String m_6483(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         ItemLore var1 = (ItemLore)var0.getComponents().get(DataComponents.LORE);
         if (var1 == null) {
            return null;
         }

         for (Component var3 : var1.lines()) {
            String var4 = f_19350.matcher(var3.getString()).replaceAll("");
            Matcher var5 = f_19349.matcher(var4);
            if (var5.find()) {
               return var5.group(1).trim();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public record ALB47PXWjX8QyH9A(Item item, Vec3 position, long durationMs) {
   }

   private record FaufsHfBd6ryjD1I(Item item, Holder<Attribute>[] attributes, double[] values) {
   }

   private record Rx61qxI53N0fi8BX(Item item, ResourceKey<Enchantment>[] enchants, int[] levels, boolean needGlint) {
   }
}
