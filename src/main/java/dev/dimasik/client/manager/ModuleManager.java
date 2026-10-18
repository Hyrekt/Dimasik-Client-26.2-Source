package dev.dimasik.client.manager;

import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.autobuy.AutoBuy;
import dev.dimasik.client.module.combat.AiAimbot;
import dev.dimasik.client.module.combat.AiTester;
import dev.dimasik.client.module.combat.AimAssist;
import dev.dimasik.client.module.combat.Aimbot;
import dev.dimasik.client.module.combat.AntiBot;
import dev.dimasik.client.module.combat.AntiThors;
import dev.dimasik.client.module.combat.ArrowSwap;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.module.combat.AutoAnchor;
import dev.dimasik.client.module.combat.AutoExplosion;
import dev.dimasik.client.module.combat.AutoPotion;
import dev.dimasik.client.module.combat.AutoShift;
import dev.dimasik.client.module.combat.AutoSwap;
import dev.dimasik.client.module.combat.AutoThrow;
import dev.dimasik.client.module.combat.AutoTotem;
import dev.dimasik.client.module.combat.AutoWebTrap;
import dev.dimasik.client.module.combat.Backtrack;
import dev.dimasik.client.module.combat.Blocker;
import dev.dimasik.client.module.combat.Criticals;
import dev.dimasik.client.module.combat.CrystalAura;
import dev.dimasik.client.module.combat.CrystalOptimizer;
import dev.dimasik.client.module.combat.ElytraTarget;
import dev.dimasik.client.module.combat.FastBow;
import dev.dimasik.client.module.combat.HitBox;
import dev.dimasik.client.module.combat.NoEntityTrace;
import dev.dimasik.client.module.combat.NoFriendDamage;
import dev.dimasik.client.module.combat.PvPHelper;
import dev.dimasik.client.module.combat.TargetPearl;
import dev.dimasik.client.module.combat.TriggerBot;
import dev.dimasik.client.module.combat.Velocity;
import dev.dimasik.client.module.misc.AhHelper;
import dev.dimasik.client.module.misc.AimingItems;
import dev.dimasik.client.module.misc.AntiServerSwap;
import dev.dimasik.client.module.misc.AnyDesk;
import dev.dimasik.client.module.misc.AppleFarmer;
import dev.dimasik.client.module.misc.AutoAccept;
import dev.dimasik.client.module.misc.AutoBrewerBuilder;
import dev.dimasik.client.module.misc.AutoContract;
import dev.dimasik.client.module.misc.AutoDuel;
import dev.dimasik.client.module.misc.AutoEvent;
import dev.dimasik.client.module.misc.AutoFish;
import dev.dimasik.client.module.misc.AutoInventory;
import dev.dimasik.client.module.misc.AutoJoiner;
import dev.dimasik.client.module.misc.AutoLeave;
import dev.dimasik.client.module.misc.AutoMessage;
import dev.dimasik.client.module.misc.AutoPotionSwap;
import dev.dimasik.client.module.misc.AutoRespawn;
import dev.dimasik.client.module.misc.AutoTool;
import dev.dimasik.client.module.misc.AutoWarden;
import dev.dimasik.client.module.misc.ChestStealer;
import dev.dimasik.client.module.misc.ClickFriend;
import dev.dimasik.client.module.misc.ClickPearl;
import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.module.misc.CreamyKeys;
import dev.dimasik.client.module.misc.DiscordRPC;
import dev.dimasik.client.module.misc.EcExploit;
import dev.dimasik.client.module.misc.ElytraSwap;
import dev.dimasik.client.module.misc.FastBreak;
import dev.dimasik.client.module.misc.FreeCam;
import dev.dimasik.client.module.misc.FreeLook;
import dev.dimasik.client.module.misc.FuntimeHelper;
import dev.dimasik.client.module.misc.GroundLoot;
import dev.dimasik.client.module.misc.HeadSwap;
import dev.dimasik.client.module.misc.HolyWorldHelper;
import dev.dimasik.client.module.misc.HpHelper;
import dev.dimasik.client.module.misc.IRC;
import dev.dimasik.client.module.misc.InventorySort;
import dev.dimasik.client.module.misc.ItemScroller;
import dev.dimasik.client.module.misc.KeyFinder;
import dev.dimasik.client.module.misc.KillMessage;
import dev.dimasik.client.module.misc.KitHelper;
import dev.dimasik.client.module.misc.LeaveTracker;
import dev.dimasik.client.module.misc.LootTracker;
import dev.dimasik.client.module.misc.MusicPlayer;
import dev.dimasik.client.module.misc.NameProtect;
import dev.dimasik.client.module.misc.NoInteract;
import dev.dimasik.client.module.misc.OpenWalls;
import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.module.misc.PacketDebug;
import dev.dimasik.client.module.misc.Party;
import dev.dimasik.client.module.misc.PlayerEmotes;
import dev.dimasik.client.module.misc.PotionSwap;
import dev.dimasik.client.module.misc.PvpSafe;
import dev.dimasik.client.module.misc.RPSpoofer;
import dev.dimasik.client.module.misc.RWFixer;
import dev.dimasik.client.module.misc.RgExploit;
import dev.dimasik.client.module.misc.RwHelper;
import dev.dimasik.client.module.misc.ScoreboardHP;
import dev.dimasik.client.module.misc.TapeMouse;
import dev.dimasik.client.module.misc.UseTracker;
import dev.dimasik.client.module.movement.AirJump;
import dev.dimasik.client.module.movement.AirStuck;
import dev.dimasik.client.module.movement.AutoSprint;
import dev.dimasik.client.module.movement.BlockFly;
import dev.dimasik.client.module.movement.DragonFly;
import dev.dimasik.client.module.movement.ElytraBooster;
import dev.dimasik.client.module.movement.ElytraFly;
import dev.dimasik.client.module.movement.ElytraMotion;
import dev.dimasik.client.module.movement.FakeLag;
import dev.dimasik.client.module.movement.Fly;
import dev.dimasik.client.module.movement.GrimGlide;
import dev.dimasik.client.module.movement.GuiMove;
import dev.dimasik.client.module.movement.Jesus;
import dev.dimasik.client.module.movement.LongJump;
import dev.dimasik.client.module.movement.NoClip;
import dev.dimasik.client.module.movement.NoDelay;
import dev.dimasik.client.module.movement.NoFall;
import dev.dimasik.client.module.movement.NoPush;
import dev.dimasik.client.module.movement.NoSlow;
import dev.dimasik.client.module.movement.NoWeb;
import dev.dimasik.client.module.movement.NoWebController;
import dev.dimasik.client.module.movement.PearlBoost;
import dev.dimasik.client.module.movement.Speed;
import dev.dimasik.client.module.movement.Spider;
import dev.dimasik.client.module.movement.Strafe;
import dev.dimasik.client.module.movement.TPLoot;
import dev.dimasik.client.module.movement.TargetStrafe;
import dev.dimasik.client.module.movement.Timer;
import dev.dimasik.client.module.movement.TpBack;
import dev.dimasik.client.module.movement.WaterSpeed;
import dev.dimasik.client.module.movement.WindHop;
import dev.dimasik.client.module.render.Ambience;
import dev.dimasik.client.module.render.AntiAim;
import dev.dimasik.client.module.render.ArmorDurability;
import dev.dimasik.client.module.render.Arrows;
import dev.dimasik.client.module.render.AspectRatio;
import dev.dimasik.client.module.render.Beautiful;
import dev.dimasik.client.module.render.BetterMinecraft;
import dev.dimasik.client.module.render.BlockESP;
import dev.dimasik.client.module.render.BlockOverlay;
import dev.dimasik.client.module.render.CatPet;
import dev.dimasik.client.module.render.Chams;
import dev.dimasik.client.module.render.ChinaHat;
import dev.dimasik.client.module.render.ClickGui;
import dev.dimasik.client.module.render.Crosshair;
import dev.dimasik.client.module.render.CubeField;
import dev.dimasik.client.module.render.Cubes;
import dev.dimasik.client.module.render.Cursor;
import dev.dimasik.client.module.render.CustomCrystal;
import dev.dimasik.client.module.render.DeathManager;
import dev.dimasik.client.module.render.ESP;
import dev.dimasik.client.module.render.EntityESP;
import dev.dimasik.client.module.render.FakePlayer;
import dev.dimasik.client.module.render.FireFly;
import dev.dimasik.client.module.render.FireworkESP;
import dev.dimasik.client.module.render.FogAtmosphere;
import dev.dimasik.client.module.render.FullBright;
import dev.dimasik.client.module.render.GhostHit;
import dev.dimasik.client.module.render.Hands;
import dev.dimasik.client.module.render.HitEffect;
import dev.dimasik.client.module.render.HitMarkers;
import dev.dimasik.client.module.render.HitWave;
import dev.dimasik.client.module.render.HoleESP;
import dev.dimasik.client.module.render.Hud;
import dev.dimasik.client.module.render.ImpactNova;
import dev.dimasik.client.module.render.Invoker;
import dev.dimasik.client.module.render.ItemPhysics;
import dev.dimasik.client.module.render.JumpCircle;
import dev.dimasik.client.module.render.KillCards;
import dev.dimasik.client.module.render.KillEffects;
import dev.dimasik.client.module.render.KillSpray;
import dev.dimasik.client.module.render.LineGlyphs;
import dev.dimasik.client.module.render.MotionBlur;
import dev.dimasik.client.module.render.Particles;
import dev.dimasik.client.module.render.Picture;
import dev.dimasik.client.module.render.PlayerAlert;
import dev.dimasik.client.module.render.Prediction;
import dev.dimasik.client.module.render.Removals;
import dev.dimasik.client.module.render.Saturation;
import dev.dimasik.client.module.render.SeeInvisible;
import dev.dimasik.client.module.render.ShaderMist;
import dev.dimasik.client.module.render.ShulkerView;
import dev.dimasik.client.module.render.SkeletonESP;
import dev.dimasik.client.module.render.SwingAnimations;
import dev.dimasik.client.module.render.TNTEffect;
import dev.dimasik.client.module.render.TNTTimer;
import dev.dimasik.client.module.render.Tracers;
import dev.dimasik.client.module.render.Trails;
import dev.dimasik.client.module.render.TrapIndicator;
import dev.dimasik.client.module.render.ViewModel;
import dev.dimasik.client.module.render.VoidButterflies;
import dev.dimasik.client.module.render.WardenESP;
import dev.dimasik.client.module.render.WorldParticles;
import java.util.ArrayList;
import java.util.Comparator;
import lombok.Generated;
import net.fabricmc.loader.api.FabricLoader;

public class ModuleManager extends ArrayList<Module> {
   private final AutoSprint f_10304 = new AutoSprint();
   private final ClickGui f_10305 = new ClickGui();
   private final AirStuck f_10306 = new AirStuck();
   private final PearlBoost f_10307 = new PearlBoost();
   private final Aura f_10308 = new Aura();
   private final Backtrack f_10309 = new Backtrack();
   private final HitBox f_10310 = new HitBox();
   private final Aimbot f_10311 = new Aimbot();
   private final AimAssist f_10312 = new AimAssist();
   private final TargetPearl f_10313 = new TargetPearl();
   private final PacketDebug f_10314 = new PacketDebug();
   private final ScoreboardHP f_10315 = new ScoreboardHP();
   private final NameProtect f_10316 = new NameProtect();
   private final Saturation f_10317 = new Saturation();
   private final FullBright f_10318 = new FullBright();
   private final Beautiful f_10319 = new Beautiful();
   private final MotionBlur f_10320 = new MotionBlur();
   private final JumpCircle f_10321 = new JumpCircle();
   private final CubeField f_10322 = new CubeField();
   private final WorldParticles f_10323 = new WorldParticles();
   private final VoidButterflies f_10324 = new VoidButterflies();
   private final Cubes f_10325 = new Cubes();
   private final Particles f_10326 = new Particles();
   private final ImpactNova f_10327 = new ImpactNova();
   private final FreeCam f_10328 = new FreeCam();
   private final Criticals f_10329 = new Criticals();
   private final TriggerBot f_10330 = new TriggerBot();
   private final AutoShift f_10331 = new AutoShift();
   private final AutoWebTrap f_10332 = new AutoWebTrap();
   private final AntiBot f_10333 = new AntiBot();
   private final NoWeb f_10334 = new NoWeb();
   private final NoWebController f_10335 = new NoWebController();
   private final NoSlow f_10336 = new NoSlow();
   private final ElytraBooster f_10337 = new ElytraBooster();
   private final ElytraFly f_10338 = new ElytraFly();
   private final ElytraMotion f_10339 = new ElytraMotion();
   private final Ambience f_10340 = new Ambience();
   private final ESP f_10341 = new ESP();
   private final BlockESP f_10342 = new BlockESP();
   private final BlockOverlay f_10343 = new BlockOverlay();
   private final CustomCrystal f_10344 = new CustomCrystal();
   private final ItemScroller f_10345 = new ItemScroller();
   private final Hands f_10346 = new Hands();
   private final Hud f_10347 = new Hud();
   private final Spider f_10348 = new Spider();
   private final Jesus f_10349 = new Jesus();
   private final WaterSpeed f_10350 = new WaterSpeed();
   private final Removals f_10351 = new Removals();
   private final NoFriendDamage f_10352 = new NoFriendDamage();
   private final NoEntityTrace f_10353 = new NoEntityTrace();
   private final TapeMouse f_10354 = new TapeMouse();
   private final AutoAccept f_10355 = new AutoAccept();
   private final AutoDuel f_10356 = new AutoDuel();
   private final AutoContract f_10357 = new AutoContract();
   private final FakeLag f_10358 = new FakeLag();
   private final AutoFish f_10359 = new AutoFish();
   private final RPSpoofer f_10360 = new RPSpoofer();
   private final RWFixer f_10361 = new RWFixer();
   private final OpenWalls f_10362 = new OpenWalls();
   private final NoPush f_10363 = new NoPush();
   private final NoDelay f_10364 = new NoDelay();
   private final NoClip f_10365 = new NoClip();
   private final BlockFly f_10366 = new BlockFly();
   private final DragonFly f_10367 = new DragonFly();
   private final WindHop f_10368 = new WindHop();
   private final FastBreak f_10369 = new FastBreak();
   private final SwingAnimations f_10370 = new SwingAnimations();
   private final ViewModel f_10371 = new ViewModel();
   private final GuiMove f_10372 = new GuiMove();
   private final AutoSwap f_10373 = new AutoSwap();
   private final ArrowSwap f_10374 = new ArrowSwap();
   private final FogAtmosphere f_10375 = new FogAtmosphere();
   private final ShaderMist f_10376 = new ShaderMist();
   private final PvPHelper f_10377 = new PvPHelper();
   private final Arrows f_10378 = new Arrows();
   private final Party f_10379 = new Party();
   private final PlayerAlert f_10380 = new PlayerAlert();
   private final Speed f_10381 = new Speed();
   private final LongJump f_10382 = new LongJump();
   private final Fly f_10383 = new Fly();
   private final Strafe f_10384 = new Strafe();
   private final TargetStrafe f_10385 = new TargetStrafe();
   private final AirJump f_10386 = new AirJump();
   private final DiscordRPC f_10387 = new DiscordRPC();
   private final IRC f_10388 = new IRC();
   private final AnyDesk f_10389 = new AnyDesk();
   private final HolyWorldHelper f_10390 = new HolyWorldHelper();
   private final RwHelper f_10391 = new RwHelper();
   private final FreeLook f_10392 = new FreeLook();
   private final FuntimeHelper f_10393 = new FuntimeHelper();
   private final ClickPearl f_10394 = new ClickPearl();
   private final PotionSwap f_10395 = new PotionSwap();
   private final FakePlayer f_10396 = new FakePlayer();
   private final AspectRatio f_10397 = new AspectRatio();
   private final Trails f_10398 = new Trails();
   private final NoInteract f_10399 = new NoInteract();
   private final ElytraTarget f_10400 = new ElytraTarget();
   private final AutoTotem f_10401 = new AutoTotem();
   private final AutoPotion f_10402 = new AutoPotion();
   private final AutoThrow f_10403 = new AutoThrow();
   private final ElytraSwap f_10404 = new ElytraSwap();
   private final HeadSwap f_10405 = new HeadSwap();
   private final AutoExplosion f_10406 = new AutoExplosion();
   private final GrimGlide f_10407 = new GrimGlide();
   private final LeaveTracker f_10408 = new LeaveTracker();
   private final UseTracker f_10409 = new UseTracker();
   private final AutoLeave f_10410 = new AutoLeave();
   private final PvpSafe f_10411 = new PvpSafe();
   private final AhHelper f_10412 = new AhHelper();
   private final AutoEvent f_10413 = new AutoEvent();
   private final AimingItems f_10414 = new AimingItems();
   private final AutoJoiner f_10415 = new AutoJoiner();
   private final FireworkESP f_10416 = new FireworkESP();
   private final ChestStealer f_10417 = new ChestStealer();
   private final AppleFarmer f_10418 = new AppleFarmer();
   private final AutoWarden f_10419 = new AutoWarden();
   private final WardenESP f_10420 = new WardenESP();
   private final AiAimbot f_10421 = new AiAimbot();
   private final AiTester f_10422 = new AiTester();
   private final Blocker f_10423 = new Blocker();
   private final Picture f_10424 = new Picture();
   private final AutoBuy f_10425 = new AutoBuy();
   private final AutoInventory f_10426 = new AutoInventory();
   private final InventorySort f_10427 = new InventorySort();
   private final Velocity f_10428 = new Velocity();
   private final AutoRespawn f_10429 = new AutoRespawn();
   private final FastBow f_10430 = new FastBow();
   private final RgExploit f_10431 = new RgExploit();
   private final AutoMessage f_10432 = new AutoMessage();
   private final CrystalAura f_10433 = new CrystalAura();
   private final AutoAnchor f_10434 = new AutoAnchor();
   private final CrystalOptimizer f_10435 = new CrystalOptimizer();
   private final EcExploit f_10436 = new EcExploit();
   private final ClickFriend f_10437 = new ClickFriend();
   private final AutoTool f_10438 = new AutoTool();
   private final HitWave f_10439 = new HitWave();
   private final AntiThors f_10440 = new AntiThors();
   private final KeyFinder f_10441 = new KeyFinder();
   private final TPLoot f_10442 = new TPLoot();
   private final Optimization f_10443 = new Optimization();
   private final Timer f_10444 = new Timer();
   private final MusicPlayer f_10445 = new MusicPlayer();
   private final GhostHit f_10446 = new GhostHit();
   private final HitEffect f_10447 = new HitEffect();
   private final HitMarkers f_10448 = new HitMarkers();
   private final AntiAim f_10449 = new AntiAim();
   private final Prediction f_10450 = new Prediction();
   private final CatPet f_10451 = new CatPet();
   private final ChinaHat f_10452 = new ChinaHat();
   private final Invoker f_10453 = new Invoker();
   private final LineGlyphs f_10454 = new LineGlyphs();
   private final HoleESP f_10455 = new HoleESP();
   private final ItemPhysics f_10456 = new ItemPhysics();
   private final ClientSounds f_10457 = new ClientSounds();
   private final CreamyKeys f_10458 = new CreamyKeys();
   private final LootTracker f_10459 = new LootTracker();
   private final FireFly f_10460 = new FireFly();
   private final KillEffects f_10461 = new KillEffects();
   private final KillSpray f_10462 = new KillSpray();
   private final KillCards f_10463 = new KillCards();
   private final DeathManager f_10464 = new DeathManager();
   private final TNTTimer f_10465 = new TNTTimer();
   private final TNTEffect f_10466 = new TNTEffect();
   private final TrapIndicator f_10467 = new TrapIndicator();
   private final AutoBrewerBuilder f_10468 = new AutoBrewerBuilder();
   private final Tracers f_10469 = new Tracers();
   private final SkeletonESP f_10470 = new SkeletonESP();
   private final SeeInvisible f_10471 = new SeeInvisible();
   private final ShulkerView f_10472 = new ShulkerView();
   private final Crosshair f_10473 = new Crosshair();
   private final Cursor f_10474 = new Cursor();
   private final AntiServerSwap f_10475 = new AntiServerSwap();
   private final ArmorDurability f_10476 = new ArmorDurability();
   private final KillMessage f_10477 = new KillMessage();
   private final HpHelper f_10478 = new HpHelper();
   private final KitHelper f_10479 = new KitHelper();
   private final GroundLoot f_10480 = new GroundLoot();
   private final PlayerEmotes f_10481 = new PlayerEmotes();
   private final BetterMinecraft f_10482 = new BetterMinecraft();
   private final Chams f_10483 = new Chams();
   private final AutoPotionSwap f_10484 = new AutoPotionSwap();
   private final NoFall f_10485 = new NoFall();
   private final TpBack f_10486 = new TpBack();
   private final EntityESP f_10487 = new EntityESP();

   @Generated
   public AiAimbot m_3406() {
      return this.f_10421;
   }

   @Generated
   public FastBow m_3407() {
      return this.f_10430;
   }

   public ModuleManager() {
      this.add(this.f_10308);
      this.add(this.f_10309);
      this.add(this.f_10310);
      this.add(this.f_10445);
      this.add(this.f_10446);
      this.add(this.f_10447);
      this.add(this.f_10448);
      this.add(this.f_10449);
      this.add(this.f_10443);
      this.add(this.f_10441);
      this.add(this.f_10442);
      this.add(this.f_10436);
      this.add(this.f_10439);
      this.add(this.f_10311);
      this.add(this.f_10312);
      this.add(this.f_10313);
      this.add(this.f_10369);
      this.add(this.f_10429);
      this.add(this.f_10407);
      this.add(this.f_10368);
      this.add(this.f_10341);
      this.add(this.f_10342);
      this.add(this.f_10343);
      this.add(this.f_10344);
      this.add(this.f_10430);
      this.add(this.f_10364);
      this.add(this.f_10484);
      this.add(this.f_10365);
      this.add(this.f_10366);
      this.add(this.f_10475);
      this.add(this.f_10414);
      this.add(this.f_10354);
      this.add(this.f_10413);
      this.add(this.f_10416);
      this.add(this.f_10372);
      this.add(this.f_10415);
      this.add(this.f_10358);
      this.add(this.f_10417);
      this.add(this.f_10418);
      this.add(this.f_10419);
      this.add(this.f_10423);
      this.add(this.f_10420);
      this.add(this.f_10367);
      this.add(this.f_10387);
      this.add(this.f_10388);
      this.add(this.f_10389);
      this.f_10388.m_792();
      if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
         this.add(this.f_10421);
         this.add(this.f_10422);
      }

      this.add(this.f_10363);
      this.add(this.f_10362);
      this.add(this.f_10355);
      this.add(this.f_10356);
      this.add(this.f_10357);
      this.add(this.f_10359);
      this.add(this.f_10424);
      this.add(this.f_10360);
      this.add(this.f_10361);
      this.f_10361.m_792();
      this.add(this.f_10304);
      this.add(this.f_10373);
      this.add(this.f_10374);
      this.add(this.f_10450);
      this.add(this.f_10400);
      this.add(this.f_10353);
      this.add(this.f_10396);
      this.add(this.f_10352);
      this.add(this.f_10408);
      this.add(this.f_10409);
      this.add(this.f_10410);
      this.add(this.f_10411);
      this.add(this.f_10412);
      this.add(this.f_10394);
      this.add(this.f_10426);
      this.add(this.f_10427);
      this.add(this.f_10432);
      this.add(this.f_10345);
      this.add(this.f_10305);
      this.add(this.f_10306);
      this.add(this.f_10377);
      this.add(this.f_10398);
      this.add(this.f_10392);
      this.add(this.f_10348);
      this.add(this.f_10349);
      this.add(this.f_10350);
      this.add(this.f_10307);
      this.add(this.f_10404);
      this.add(this.f_10405);
      this.add(this.f_10375);
      this.add(this.f_10431);
      this.add(this.f_10378);
      this.add(this.f_10379);
      this.add(this.f_10380);
      this.add(this.f_10399);
      this.add(this.f_10397);
      this.add(this.f_10314);
      this.add(this.f_10315);
      this.add(this.f_10316);
      this.add(this.f_10395);
      this.add(this.f_10317);
      this.add(this.f_10318);
      this.add(this.f_10319);
      this.add(this.f_10320);
      this.add(this.f_10321);
      this.add(this.f_10322);
      this.add(this.f_10381);
      this.add(this.f_10382);
      this.add(this.f_10383);
      this.add(this.f_10384);
      this.add(this.f_10385);
      this.add(this.f_10386);
      this.add(this.f_10401);
      this.add(this.f_10402);
      this.add(this.f_10403);
      this.add(this.f_10323);
      this.add(this.f_10324);
      this.add(this.f_10325);
      this.add(this.f_10326);
      this.add(this.f_10327);
      this.add(this.f_10328);
      this.add(this.f_10329);
      this.add(this.f_10330);
      this.add(this.f_10331);
      this.add(this.f_10333);
      this.add(this.f_10332);
      this.add(this.f_10334);
      this.add(this.f_10335);
      this.add(this.f_10336);
      this.add(this.f_10337);
      this.add(this.f_10338);
      this.add(this.f_10339);
      this.add(this.f_10340);
      this.add(this.f_10346);
      this.add(this.f_10347);
      this.add(this.f_10351);
      this.add(this.f_10370);
      this.add(this.f_10371);
      this.add(this.f_10390);
      this.add(this.f_10391);
      this.add(this.f_10393);
      this.add(this.f_10406);
      this.add(this.f_10428);
      this.add(this.f_10433);
      this.add(this.f_10434);
      this.add(this.f_10435);
      this.add(this.f_10438);
      this.add(this.f_10440);
      this.add(this.f_10444);
      this.add(this.f_10451);
      this.add(this.f_10452);
      this.add(this.f_10453);
      this.add(this.f_10455);
      this.add(this.f_10456);
      this.add(this.f_10457);
      this.add(this.f_10458);
      this.add(this.f_10459);
      this.add(this.f_10460);
      this.add(this.f_10461);
      this.add(this.f_10462);
      this.add(this.f_10463);
      this.add(this.f_10464);
      this.add(this.f_10465);
      this.add(this.f_10466);
      this.add(this.f_10467);
      this.add(this.f_10468);
      this.add(this.f_10469);
      this.add(this.f_10470);
      this.add(this.f_10471);
      this.add(this.f_10472);
      this.add(this.f_10473);
      this.add(this.f_10474);
      this.add(this.f_10476);
      this.add(this.f_10477);
      this.add(this.f_10478);
      this.add(this.f_10479);
      this.add(this.f_10480);
      this.add(this.f_10481);
      this.add(this.f_10482);
      this.add(this.f_10483);
      this.add(this.f_10485);
      this.add(this.f_10487);
      this.m_3578();
   }

   @Generated
   public BlockESP m_3408() {
      return this.f_10342;
   }

   @Generated
   public HitMarkers m_3409() {
      return this.f_10448;
   }

   @Generated
   public ClickPearl m_3410() {
      return this.f_10394;
   }

   @Generated
   public Removals m_3411() {
      return this.f_10351;
   }

   @Generated
   public CrystalOptimizer m_3412() {
      return this.f_10435;
   }

   @Generated
   public KillSpray m_3413() {
      return this.f_10462;
   }

   @Generated
   public PvPHelper m_3414() {
      return this.f_10377;
   }

   @Generated
   public AspectRatio m_3415() {
      return this.f_10397;
   }

   @Generated
   public IRC m_3416() {
      return this.f_10388;
   }

   @Generated
   public NoFall m_3417() {
      return this.f_10485;
   }

   @Generated
   public ElytraBooster m_3418() {
      return this.f_10337;
   }

   @Generated
   public ItemPhysics m_3419() {
      return this.f_10456;
   }

   @Generated
   public FastBreak m_3420() {
      return this.f_10369;
   }

   @Generated
   public AutoThrow m_3421() {
      return this.f_10403;
   }

   @Generated
   public HitEffect m_3422() {
      return this.f_10447;
   }

   @Generated
   public CatPet m_3423() {
      return this.f_10451;
   }

   @Generated
   public TNTEffect m_3424() {
      return this.f_10466;
   }

   @Generated
   public Cursor m_3425() {
      return this.f_10474;
   }

   @Generated
   public ItemScroller m_3426() {
      return this.f_10345;
   }

   @Generated
   public BlockOverlay m_3427() {
      return this.f_10343;
   }

   @Generated
   public RgExploit m_3428() {
      return this.f_10431;
   }

   @Generated
   public AutoSwap m_3429() {
      return this.f_10373;
   }

   @Generated
   public FireworkESP m_3430() {
      return this.f_10416;
   }

   @Generated
   public Timer m_3431() {
      return this.f_10444;
   }

   @Generated
   public ESP m_3432() {
      return this.f_10341;
   }

   @Generated
   public Hud m_3433() {
      return this.f_10347;
   }

   @Generated
   public KillEffects m_3434() {
      return this.f_10461;
   }

   @Generated
   public ElytraSwap m_3435() {
      return this.f_10404;
   }

   @Generated
   public EntityESP m_3436() {
      return this.f_10487;
   }

   @Generated
   public AntiThors m_3437() {
      return this.f_10440;
   }

   @Generated
   public AntiServerSwap m_3438() {
      return this.f_10475;
   }

   @Generated
   public FullBright m_3439() {
      return this.f_10318;
   }

   @Generated
   public DiscordRPC m_3440() {
      return this.f_10387;
   }

   @Generated
   public ClientSounds m_3441() {
      return this.f_10457;
   }

   @Generated
   public ClickGui m_3442() {
      return this.f_10305;
   }

   @Generated
   public ShulkerView m_3443() {
      return this.f_10472;
   }

   @Generated
   public CrystalAura m_3444() {
      return this.f_10433;
   }

   @Generated
   public NoFriendDamage m_3445() {
      return this.f_10352;
   }

   @Generated
   public LongJump m_3446() {
      return this.f_10382;
   }

   @Generated
   public AutoFish m_3447() {
      return this.f_10359;
   }

   @Generated
   public AutoPotionSwap m_3448() {
      return this.f_10484;
   }

   @Generated
   public AimAssist m_3449() {
      return this.f_10312;
   }

   @Generated
   public ShaderMist m_3450() {
      return this.f_10376;
   }

   @Generated
   public AutoJoiner m_3451() {
      return this.f_10415;
   }

   @Generated
   public AppleFarmer m_3452() {
      return this.f_10418;
   }

   @Generated
   public Crosshair m_3453() {
      return this.f_10473;
   }

   @Generated
   public Saturation m_3454() {
      return this.f_10317;
   }

   @Generated
   public GuiMove m_3455() {
      return this.f_10372;
   }

   @Generated
   public AnyDesk m_3456() {
      return this.f_10389;
   }

   @Generated
   public AutoExplosion m_3457() {
      return this.f_10406;
   }

   @Generated
   public TPLoot m_3458() {
      return this.f_10442;
   }

   @Generated
   public PlayerAlert m_3459() {
      return this.f_10380;
   }

   @Generated
   public FreeCam m_3460() {
      return this.f_10328;
   }

   @Generated
   public EcExploit m_3461() {
      return this.f_10436;
   }

   @Generated
   public DeathManager m_3462() {
      return this.f_10464;
   }

   @Generated
   public KillMessage m_3463() {
      return this.f_10477;
   }

   @Generated
   public FogAtmosphere m_3464() {
      return this.f_10375;
   }

   @Generated
   public AutoInventory m_3465() {
      return this.f_10426;
   }

   @Generated
   public HeadSwap m_3466() {
      return this.f_10405;
   }

   @Generated
   public ClickFriend m_3467() {
      return this.f_10437;
   }

   @Generated
   public Blocker m_3468() {
      return this.f_10423;
   }

   @Generated
   public ElytraFly m_3469() {
      return this.f_10338;
   }

   @Generated
   public AutoEvent m_3470() {
      return this.f_10413;
   }

   @Generated
   public PlayerEmotes m_3471() {
      return this.f_10481;
   }

   @Generated
   public AiTester m_3472() {
      return this.f_10422;
   }

   @Generated
   public Optimization m_3473() {
      return this.f_10443;
   }

   @Generated
   public Arrows m_3474() {
      return this.f_10378;
   }

   @Generated
   public Velocity m_3475() {
      return this.f_10428;
   }

   @Generated
   public GroundLoot m_3476() {
      return this.f_10480;
   }

   @Generated
   public ArmorDurability m_3477() {
      return this.f_10476;
   }

   @Generated
   public BetterMinecraft m_3478() {
      return this.f_10482;
   }

   @Generated
   public FuntimeHelper m_3479() {
      return this.f_10393;
   }

   @Generated
   public DragonFly m_3480() {
      return this.f_10367;
   }

   @Generated
   public TapeMouse m_3481() {
      return this.f_10354;
   }

   @Generated
   public AutoTotem m_3482() {
      return this.f_10401;
   }

   @Generated
   public AutoTool m_3483() {
      return this.f_10438;
   }

   @Generated
   public NameProtect m_3484() {
      return this.f_10316;
   }

   @Generated
   public Beautiful m_3485() {
      return this.f_10319;
   }

   @Generated
   public JumpCircle m_3486() {
      return this.f_10321;
   }

   @Generated
   public ScoreboardHP m_3487() {
      return this.f_10315;
   }

   @Generated
   public TpBack m_3488() {
      return this.f_10486;
   }

   @Generated
   public Chams m_3489() {
      return this.f_10483;
   }

   @Generated
   public PearlBoost m_3490() {
      return this.f_10307;
   }

   @Generated
   public NoClip m_3491() {
      return this.f_10365;
   }

   @Generated
   public ChinaHat m_3492() {
      return this.f_10452;
   }

   @Generated
   public Prediction m_3493() {
      return this.f_10450;
   }

   @Generated
   public Picture m_3494() {
      return this.f_10424;
   }

   @Generated
   public TrapIndicator m_3495() {
      return this.f_10467;
   }

   @Generated
   public KillCards m_3496() {
      return this.f_10463;
   }

   @Generated
   public AutoLeave m_3497() {
      return this.f_10410;
   }

   @Generated
   public Trails m_3498() {
      return this.f_10398;
   }

   @Generated
   public FakePlayer m_3499() {
      return this.f_10396;
   }

   @Generated
   public ImpactNova m_3500() {
      return this.f_10327;
   }

   @Generated
   public NoEntityTrace m_3501() {
      return this.f_10353;
   }

   @Generated
   public AutoDuel m_3502() {
      return this.f_10356;
   }

   @Generated
   public AutoBuy m_3503() {
      return this.f_10425;
   }

   @Generated
   public Particles m_3504() {
      return this.f_10326;
   }

   @Generated
   public ElytraMotion m_3505() {
      return this.f_10339;
   }

   @Generated
   public RPSpoofer m_3506() {
      return this.f_10360;
   }

   @Generated
   public AntiAim m_3507() {
      return this.f_10449;
   }

   @Generated
   public TargetPearl m_3508() {
      return this.f_10313;
   }

   @Generated
   public TargetStrafe m_3509() {
      return this.f_10385;
   }

   @Generated
   public AutoWebTrap m_3510() {
      return this.f_10332;
   }

   @Generated
   public Ambience m_3511() {
      return this.f_10340;
   }

   @Generated
   public NoSlow m_3512() {
      return this.f_10336;
   }

   @Generated
   public Fly m_3513() {
      return this.f_10383;
   }

   @Generated
   public InventorySort m_3514() {
      return this.f_10427;
   }

   @Generated
   public CubeField m_3515() {
      return this.f_10322;
   }

   @Generated
   public NoWeb m_3516() {
      return this.f_10334;
   }

   @Generated
   public HpHelper m_3517() {
      return this.f_10478;
   }

   @Generated
   public HolyWorldHelper m_3518() {
      return this.f_10390;
   }

   @Generated
   public HitWave m_3519() {
      return this.f_10439;
   }

   @Generated
   public Invoker m_3520() {
      return this.f_10453;
   }

   @Generated
   public CustomCrystal m_3521() {
      return this.f_10344;
   }

   @Generated
   public OpenWalls m_3522() {
      return this.f_10362;
   }

   @Generated
   public NoDelay m_3523() {
      return this.f_10364;
   }

   @Generated
   public LootTracker m_3524() {
      return this.f_10459;
   }

   @Generated
   public WaterSpeed m_3525() {
      return this.f_10350;
   }

   @Generated
   public MotionBlur m_3526() {
      return this.f_10320;
   }

   @Generated
   public Aimbot m_3527() {
      return this.f_10311;
   }

   @Generated
   public AirJump m_3528() {
      return this.f_10386;
   }

   @Generated
   public Speed m_3529() {
      return this.f_10381;
   }

   @Generated
   public Cubes m_3530() {
      return this.f_10325;
   }

   @Generated
   public FakeLag m_3531() {
      return this.f_10358;
   }

   @Generated
   public KeyFinder m_3532() {
      return this.f_10441;
   }

   @Generated
   public ChestStealer m_3533() {
      return this.f_10417;
   }

   @Generated
   public CreamyKeys m_3534() {
      return this.f_10458;
   }

   @Generated
   public WorldParticles m_3535() {
      return this.f_10323;
   }

   @Generated
   public TriggerBot m_3536() {
      return this.f_10330;
   }

   @Generated
   public AutoContract m_3537() {
      return this.f_10357;
   }

   @Generated
   public TNTTimer m_3538() {
      return this.f_10465;
   }

   @Generated
   public Backtrack m_3539() {
      return this.f_10309;
   }

   @Generated
   public SkeletonESP m_3540() {
      return this.f_10470;
   }

   @Generated
   public SeeInvisible m_3541() {
      return this.f_10471;
   }

   @Generated
   public NoPush m_3542() {
      return this.f_10363;
   }

   @Generated
   public RwHelper m_3543() {
      return this.f_10391;
   }

   @Generated
   public WindHop m_3544() {
      return this.f_10368;
   }

   @Generated
   public PacketDebug m_3545() {
      return this.f_10314;
   }

   @Generated
   public ViewModel m_3546() {
      return this.f_10371;
   }

   @Generated
   public WardenESP m_3547() {
      return this.f_10420;
   }

   @Generated
   public Criticals m_3548() {
      return this.f_10329;
   }

   @Generated
   public KitHelper m_3549() {
      return this.f_10479;
   }

   @Generated
   public AutoRespawn m_3550() {
      return this.f_10429;
   }

   @Generated
   public GhostHit m_3551() {
      return this.f_10446;
   }

   @Generated
   public Strafe m_3552() {
      return this.f_10384;
   }

   @Generated
   public AutoAccept m_3553() {
      return this.f_10355;
   }

   @Generated
   public AutoSprint m_3554() {
      return this.f_10304;
   }

   @Generated
   public BlockFly m_3555() {
      return this.f_10366;
   }

   @Generated
   public Jesus m_3556() {
      return this.f_10349;
   }

   @Generated
   public LineGlyphs m_3557() {
      return this.f_10454;
   }

   @Generated
   public AutoBrewerBuilder m_3558() {
      return this.f_10468;
   }

   @Generated
   public AhHelper m_3559() {
      return this.f_10412;
   }

   @Generated
   public FireFly m_3560() {
      return this.f_10460;
   }

   @Generated
   public HitBox m_3561() {
      return this.f_10310;
   }

   @Generated
   public AutoShift m_3562() {
      return this.f_10331;
   }

   @Generated
   public SwingAnimations m_3563() {
      return this.f_10370;
   }

   @Generated
   public Tracers m_3564() {
      return this.f_10469;
   }

   @Generated
   public AutoWarden m_3565() {
      return this.f_10419;
   }

   @Generated
   public AutoPotion m_3566() {
      return this.f_10402;
   }

   @Generated
   public UseTracker m_3567() {
      return this.f_10409;
   }

   @Generated
   public PvpSafe m_3568() {
      return this.f_10411;
   }

   @Generated
   public ArrowSwap m_3569() {
      return this.f_10374;
   }

   @Generated
   public AimingItems m_3570() {
      return this.f_10414;
   }

   @Generated
   public LeaveTracker m_3571() {
      return this.f_10408;
   }

   @Generated
   public GrimGlide m_3572() {
      return this.f_10407;
   }

   @Generated
   public Party m_3573() {
      return this.f_10379;
   }

   @Generated
   public ElytraTarget m_3574() {
      return this.f_10400;
   }

   @Generated
   public AutoMessage m_3575() {
      return this.f_10432;
   }

   @Generated
   public Aura m_3576() {
      return this.f_10308;
   }

   @Generated
   public Hands m_3577() {
      return this.f_10346;
   }

   private void m_3578() {
      this.sort(Comparator.comparing(Module::m_793, String.CASE_INSENSITIVE_ORDER));
   }

   @Generated
   public VoidButterflies m_3579() {
      return this.f_10324;
   }

   @Generated
   public FreeLook m_3580() {
      return this.f_10392;
   }

   @Generated
   public AntiBot m_3581() {
      return this.f_10333;
   }

   @Generated
   public MusicPlayer m_3582() {
      return this.f_10445;
   }

   @Generated
   public HoleESP m_3583() {
      return this.f_10455;
   }

   @Generated
   public RWFixer m_3584() {
      return this.f_10361;
   }

   @Generated
   public AutoAnchor m_3585() {
      return this.f_10434;
   }

   @Generated
   public NoInteract m_3586() {
      return this.f_10399;
   }

   @Generated
   public PotionSwap m_3587() {
      return this.f_10395;
   }

   @Generated
   public NoWebController m_3588() {
      return this.f_10335;
   }

   @Generated
   public Spider m_3589() {
      return this.f_10348;
   }

   @Generated
   public AirStuck m_3590() {
      return this.f_10306;
   }
}
