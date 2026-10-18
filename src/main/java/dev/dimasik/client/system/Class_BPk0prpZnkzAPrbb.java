package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.ui.screen.Screen_8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public final class Class_BPk0prpZnkzAPrbb {
   private static float f_5353 = 1.0F;
   private static boolean f_5354;
   private static final int f_5355 = 3;
   private static final float f_5356 = 138.0F;
   private static final float f_5357 = 18.0F;
   private static final float f_5358 = 48.0F;
   private static final float f_5359 = 78.0F;
   private static final float f_5360 = 14.0F;
   private static final float f_5361 = 16.0F;
   private static final float f_5362 = 66.0F;
   private static final float f_5363 = 104.0F;
   private static final float f_5364 = 62.0F;
   private static final float f_5365 = 14.0F;
   private static final float f_5366 = 30.0F;
   private int f_5367;
   private int f_5368;
   private int f_5369;
   private int f_5370;
   private int f_5371;
   private int f_5372;
   private int f_5373;
   private int f_5374;
   private int f_5375;
   private int f_5376;
   private int f_5377;
   private int f_5378;
   private int f_5379;
   private int f_5380;
   private static final String f_5381 = "1";
   private static final String f_5382 = "8";
   private static final String f_5383 = "9";
   private final Screen_8 f_5384;
   private final Class_7FZzCHx4mGAVqcLr f_5385 = new Class_7FZzCHx4mGAVqcLr();
   private final Class_LzTNGcIKX9zcGn0p f_5386 = new Class_LzTNGcIKX9zcGn0p();
   private final Class_Pko7z8Gp1S0OsRzK f_5387 = new Class_Pko7z8Gp1S0OsRzK();
   private final Map<Class_WzvV6cpDDR1F4aeD, Class_w8fCJQ5ZtH5lQbWc> f_5388 = new EnumMap<>(Class_WzvV6cpDDR1F4aeD.class);
   private final Map<Class_MTimUzoN9N9ZQr5T, Class_w8fCJQ5ZtH5lQbWc> f_5389 = new EnumMap<>(Class_MTimUzoN9N9ZQr5T.class);
   private final Map<String, Class_w8fCJQ5ZtH5lQbWc> f_5390 = new HashMap<>();
   private final Map<Class_m52tuSNQY8S356Ab, Class_w8fCJQ5ZtH5lQbWc> f_5391 = new EnumMap<>(Class_m52tuSNQY8S356Ab.class);
   private final Map<Class_m52tuSNQY8S356Ab, Class_w8fCJQ5ZtH5lQbWc> f_5392 = new EnumMap<>(Class_m52tuSNQY8S356Ab.class);
   private final Map<Class_LdeJaBYCxAYq5SO6, Class_w8fCJQ5ZtH5lQbWc> f_5393 = new EnumMap<>(Class_LdeJaBYCxAYq5SO6.class);
   private final Map<String, Class_w8fCJQ5ZtH5lQbWc> f_5394 = new HashMap<>();
   private final Map<Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL, Class_w8fCJQ5ZtH5lQbWc> f_5395 = new EnumMap<>(
      Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.class
   );
   private final Map<Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL, Class_w8fCJQ5ZtH5lQbWc> f_5396 = new EnumMap<>(
      Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.class
   );
   private final Map<Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL, Class_w8fCJQ5ZtH5lQbWc> f_5397 = new EnumMap<>(
      Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.class
   );
   private final Map<Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy, Class_w8fCJQ5ZtH5lQbWc> f_5398 = new EnumMap<>(
      Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.class
   );
   private final Map<Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy, Class_w8fCJQ5ZtH5lQbWc> f_5399 = new EnumMap<>(
      Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.class
   );
   private final Map<Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD, Class_w8fCJQ5ZtH5lQbWc> f_5400 = new EnumMap<>(Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD.class);
   private final Map<Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD, Class_w8fCJQ5ZtH5lQbWc> f_5401 = new EnumMap<>(Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD.class);
   private final Class_w8fCJQ5ZtH5lQbWc f_5402;
   private final Class_w8fCJQ5ZtH5lQbWc f_5403;
   private final Class_w8fCJQ5ZtH5lQbWc f_5404;
   private final Class_w8fCJQ5ZtH5lQbWc f_5405;
   private long f_5406;
   private float f_5407;
   private Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL f_5408;
   private Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy f_5409;
   private Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD f_5410;
   private String f_5411;
   private boolean f_5412;
   private boolean f_5413;
   private boolean f_5414;
   private boolean f_5415;
   private int[] f_5416;
   private int f_5417;
   private List<Class_LzYTXb7R2jug6Pep> f_5418;
   private List<Class_CaVoGy5a20MKv97j> f_5419;
   private static final float f_5420 = 10.0F;
   private static final float f_5421 = 10.0F;
   private static final float f_5422 = 10.0F;
   private static final float f_5423 = 8.0F;
   private static final float f_5424 = 24.0F;
   private static final float f_5425 = 28.0F;
   private static final float f_5426 = 12.0F;
   private static final float f_5427 = 16.0F;
   private static final float f_5428 = 28.0F;
   private static final float f_5429 = 3.0F;
   private static final float f_5430 = 36.0F;
   private static final float f_5431 = 32.0F;
   private static final float f_5432 = 5.0F;
   private static final float f_5433 = 220.0F;
   private static final float f_5434 = 0.4F;
   private static final float f_5435 = 16.0F;
   private static final float f_5436 = 10.0F;
   private static final float f_5437 = -1.0F;
   private static final long f_5438 = 150L;
   private static final float f_5439 = 16.0F;
   private static final float f_5440 = 18.0F;
   private static final String f_5441 = "Ничего не найдено";
   private static final String f_5442 = "No cosmetics found";
   private static final float f_5443 = 0.5F;
   private static final float f_5444 = 124.0F;
   private static final String f_5445 = "Попробуйте другое название";
   private static final String f_5446 = "Try a different name";
   private static final float f_5447 = 0.5F;
   private static final float f_5448 = 147.0F;
   private static final float f_5449 = 0.2F;
   private static final float f_5450 = 24.0F;
   private static final float f_5451 = 22.0F;
   private static final float f_5452 = 16.0F;
   private static final float f_5453 = 16.0F;
   private static final float f_5454 = 16.0F;
   private static final float f_5455 = 54.0F;
   private static final float f_5456 = 10.0F;
   private static final float f_5457 = 60.0F;
   private static final float f_5458 = 20.0F;
   private static final float f_5459 = 54.0F;
   private static final String f_5460 = "P";
   private static final float f_5461 = 0.5F;
   private static final String f_5462 = "P";
   private static final float f_5463 = 0.5F;
   private static final float f_5464 = 14.5F;
   private static final float f_5465 = 0.01F;
   private static final float f_5466 = 20.0F;
   private static final float f_5467 = 64.0F;
   private static final float f_5468 = 30.0F;
   private static final float f_5469 = 120.0F;
   private static final String f_5470 = "ГЛАВНОЕ";
   private static final String f_5471 = "MAIN";
   private static final float f_5472 = 24.0F;
   private static final float f_5473 = 77.0F;
   private static final String f_5474 = "ОБЩЕЕ";
   private static final String f_5475 = "COMMON";
   private static final float f_5476 = 24.0F;
   private static final float f_5477 = 180.0F;
   private static final String f_5478 = "ПРОЧЕЕ";
   private static final String f_5479 = "OTHER";
   private static final float f_5480 = 24.0F;
   private static final float f_5481 = 283.0F;
   private static final float f_5482 = 0.001F;
   private static final float f_5483 = 14.0F;
   private static final float f_5484 = 30.0F;
   private static final float f_5485 = 8.0F;
   private static final float f_5486 = 255.0F;
   private static final float f_5487 = 24.0F;
   private static final float f_5488 = 8.0F;
   private static final float f_5489 = 13.0F;
   private static final float f_5490 = 0.01F;
   private static final float f_5491 = 42.0F;
   private static final float f_5492 = 54.0F;
   private static final float f_5493 = 30.0F;
   private static final float f_5494 = 46.0F;
   private static final float f_5495 = 7.0F;
   private static final float f_5496 = 12.0F;
   private static final float f_5497 = 96.0F;
   private static final float f_5498 = 97.0F;
   private static final float f_5499 = 132.0F;
   private static final float f_5500 = 200.0F;
   private static final float f_5501 = 235.0F;
   private static final float f_5502 = 303.0F;
   private static final float f_5503 = 338.0F;
   private static final float f_5504 = 373.0F;
   private static final float f_5505 = 14.0F;
   private static final float f_5506 = 24.0F;
   private static final String f_5507 = "Детали, которые делают образ вашим.";
   private static final String f_5508 = "Cosmetic items for your character's own style.";
   private static final float f_5509 = 48.0F;
   private static final float f_5510 = 24.0F;
   private static final float f_5511 = 15.0F;
   private static final float f_5512 = 24.0F;
   private static final float f_5513 = 20.0F;
   private static final float f_5514 = 230.0F;
   private static final float f_5515 = 24.0F;
   private static final float f_5516 = 22.0F;
   private static final float f_5517 = 16.0F;
   private static final float f_5518 = 16.0F;
   private static final float f_5519 = 16.0F;
   private static final float f_5520 = 54.0F;
   private static final String f_5521 = "P";
   private static final float f_5522 = 16.0F;
   private static final float f_5523 = 18.0F;
   private static final float f_5524 = 16.0F;
   private static final float f_5525 = 18.0F;
   private static final String f_5526 = "Предпросмотр";
   private static final String f_5527 = "Preview";
   private static final float f_5528 = 42.0F;
   private static final float f_5529 = 20.0F;
   private static final float f_5530 = 72.0F;
   private static final float f_5531 = 6.0F;
   private static final float f_5532 = 42.0F;
   private static final float f_5533 = 6.0F;
   private static final float f_5534 = 186.0F;
   private static final float f_5535 = 255.0F;
   private static final float f_5536 = 78.0F;
   private static final float f_5537 = 504.0F;
   private static final float f_5538 = 0.12F;
   private static final float f_5539 = 10.0F;
   private static final float f_5540 = 20.0F;
   private static final float f_5541 = 112.0F;
   private static final float f_5542 = 12.0F;
   private static final float f_5543 = 32.0F;
   private static final float f_5544 = 24.0F;
   private static final String f_5545 = "Показывать косметику";
   private static final String f_5546 = "Show cosmetics on";
   private static final float f_5547 = 14.0F;
   private static final float f_5548 = 22.0F;
   private static final String f_5549 = "На себя";
   private static final float f_5550 = 28.0F;
   private static final float f_5551 = 36.0F;
   private static final String f_5552 = "На друзей";
   private static final float f_5553 = 36.0F;
   private static final float f_5554 = 28.0F;
   private static final float f_5555 = 72.0F;
   private static final String f_5556 = "На остальных";
   private static final float f_5557 = 72.0F;
   private static final float f_5558 = 28.0F;
   private static final String f_5559 = "Включено";
   private static final String f_5560 = "Enabled";
   private static final String f_5561 = "Выключено";
   private static final String f_5562 = "Disabled";
   private static final float f_5563 = 28.0F;
   private static final float f_5564 = 28.0F;
   private static final float f_5565 = 8.0F;
   private static final float f_5566 = 0.01F;
   private static final float f_5567 = 8.0F;
   private static final float f_5568 = 48.0F;
   private static final float f_5569 = 28.0F;
   private static final float f_5570 = 12.0F;
   private static final float f_5571 = 7.0F;
   private static final float f_5572 = 0.45F;
   private static final float f_5573 = 28.0F;
   private static final float f_5574 = 0.5F;
   private static final float f_5575 = 38.0F;
   private static final float f_5576 = 6.0F;
   private static final float f_5577 = 28.0F;
   private static final float f_5578 = 7.0F;
   private static final float f_5579 = 9.0F;
   private static final float f_5580 = 8.0F;
   private static final float f_5581 = 31.0F;
   private static final float f_5582 = 7.0F;
   private static final float f_5583 = 0.45F;
   private static final float f_5584 = 0.4F;
   private static final float f_5585 = 28.0F;
   private static final float f_5586 = 16.0F;
   private static final float f_5587 = 8.0F;
   private static final float f_5588 = 3.0F;
   private static final float f_5589 = 12.0F;
   private static final float f_5590 = 3.0F;
   private static final float f_5591 = 10.0F;
   private static final float f_5592 = 10.0F;
   private static final float f_5593 = 5.0F;
   private static final float f_5594 = 13.0F;
   private static final float f_5595 = 13.0F;
   private static final float f_5596 = 3.0F;
   private static final float f_5597 = 13.0F;
   private static final float f_5598 = 13.0F;
   private static final float f_5599 = 3.0F;
   private static final float f_5600 = 0.01F;
   private static final String f_5601 = "8";
   private static final float f_5602 = 0.5F;
   private static final float f_5603 = 11.0F;
   private static final float f_5604 = 11.0F;
   private static final String f_5605 = "1";
   private static final float f_5606 = 15.0F;
   private static final float f_5607 = 15.0F;
   private static final float f_5608 = 15.0F;
   private static final float f_5609 = 15.0F;
   private static final float f_5610 = 18.0F;
   private static final float f_5611 = 48.0F;
   private static final float f_5612 = 78.0F;
   private static final float f_5613 = 0.76F;
   private static final float f_5614 = 0.24F;
   private static final float f_5615 = 18.0F;
   private static final float f_5616 = 48.0F;
   private static final float f_5617 = 78.0F;
   private static final float f_5618 = 0.76F;
   private static final float f_5619 = 0.24F;
   private static final float f_5620 = 0.76F;
   private static final float f_5621 = 0.24F;
   private static final float f_5622 = 18.0F;
   private static final float f_5623 = 48.0F;
   private static final float f_5624 = 78.0F;
   private static final float f_5625 = 18.0F;
   private static final float f_5626 = 48.0F;
   private static final float f_5627 = 78.0F;
   private static final float f_5628 = 0.76F;
   private static final float f_5629 = 0.24F;
   private static final float f_5630 = 64.0F;
   private static final float f_5631 = 104.0F;
   private static final float f_5632 = 8.0F;
   private static final float f_5633 = 28.0F;
   private static final float f_5634 = 28.0F;
   private static final float f_5635 = 10.0F;
   private static final String f_5636 = "Мечи";
   private static final String f_5637 = "Swords";
   private static final String f_5638 = "Булава";
   private static final String f_5639 = "Mace";
   private static final String f_5640 = "hat";
   private static final String f_5641 = "mask";
   private static final String f_5642 = "wings";
   private static final String f_5643 = "backpack";
   private static final String f_5644 = "pets";
   private static final String f_5645 = "furry";
   private static final float f_5646 = 0.5F;
   private static final float f_5647 = 0.5F;
   private static final float f_5648 = 0.76F;
   private static final float f_5649 = 0.24F;
   private static final float f_5650 = 18.0F;
   private static final float f_5651 = 48.0F;
   private static final float f_5652 = 78.0F;
   private static final float f_5653 = 64.0F;
   private static final float f_5654 = 8.0F;
   private static final float f_5655 = 28.0F;
   private static final float f_5656 = 28.0F;
   private static final float f_5657 = 10.0F;
   private static final float f_5658 = 0.35F;
   private static final float f_5659 = 0.76F;
   private static final float f_5660 = 0.24F;
   private static final float f_5661 = 18.0F;
   private static final float f_5662 = 48.0F;
   private static final float f_5663 = 78.0F;
   private static final float f_5664 = 138.0F;
   private static final float f_5665 = 12.0F;
   private static final float f_5666 = 136.0F;
   private static final float f_5667 = 11.0F;
   private static final float f_5668 = 255.0F;
   private static final float f_5669 = 0.35F;
   private static final float f_5670 = 138.0F;
   private static final float f_5671 = 12.0F;
   private static final float f_5672 = 38.0F;
   private static final float f_5673 = 11.0F;
   private static final float f_5674 = 12.0F;
   private static final float f_5675 = 12.0F;
   private static final float f_5676 = 25.0F;
   private static final float f_5677 = 13.0F;
   private static final float f_5678 = 0.001F;
   private static final float f_5679 = 12.0F;
   private static final float f_5680 = 30.0F;
   private static final float f_5681 = 26.0F;
   private static final float f_5682 = 26.0F;
   private static final float f_5683 = 30.0F;
   private static final float f_5684 = 14.0F;
   private static final float f_5685 = 30.0F;
   private static final float f_5686 = 96.0F;
   private static final float f_5687 = 28.0F;
   private static final float f_5688 = 30.0F;
   private static final float f_5689 = 112.0F;
   private static final float f_5690 = 210.0F;
   private static final float f_5691 = 28.0F;
   private static final float f_5692 = 36.0F;
   private static final float f_5693 = 210.0F;
   private static final float f_5694 = 28.0F;
   private static final float f_5695 = 72.0F;
   private static final float f_5696 = 210.0F;
   private static final float f_5697 = 28.0F;
   private static final float f_5698 = 64.0F;
   private static final float f_5699 = 104.0F;
   private static final float f_5700 = 8.0F;
   private static final float f_5701 = 28.0F;
   private static final float f_5702 = 64.0F;
   private static final float f_5703 = 8.0F;
   private static final float f_5704 = 28.0F;
   private static final float f_5705 = 138.0F;
   private static final float f_5706 = 138.0F;
   private static final float f_5707 = 138.0F;
   private static final float f_5708 = 138.0F;
   private static final float f_5709 = 138.0F;
   private static final float f_5710 = 138.0F;
   private static final float f_5711 = 62.0F;
   private static final float f_5712 = 154.0F;
   private static final float f_5713 = 16.0F;
   private static final float f_5714 = 4.0F;
   private static final float f_5715 = 78.0F;
   private static final float f_5716 = 30.0F;
   private static final float f_5717 = 8.0F;
   private static final float f_5718 = 0.55F;
   private static final float f_5719 = 30.0F;
   private static final String f_5720 = "t";
   private static final float f_5721 = 10.0F;
   private static final float f_5722 = 9.0F;
   private static final float f_5723 = 12.0F;
   private static final float f_5724 = 12.0F;
   private static final float f_5725 = 30.0F;
   private static final float f_5726 = 62.0F;
   private static final float f_5727 = 4.0F;
   private static final float f_5728 = 22.0F;
   private static final float f_5729 = 6.0F;
   private static final float f_5730 = 18.0F;
   private static final float f_5731 = 0.25F;
   private static final String f_5732 = "Поиск в категории…";
   private static final String f_5733 = "Search category…";
   private static final float f_5734 = 8.0F;
   private static final long f_5735 = 1000L;
   private static final long f_5736 = 500L;
   private static final float f_5737 = 8.0F;
   private static final float f_5738 = 13.0F;
   private static final String f_5739 = "9";
   private static final float f_5740 = 23.0F;
   private static final float f_5741 = 9.0F;
   private static final float f_5742 = 12.0F;
   private static final float f_5743 = 12.0F;
   private static final float f_5744 = 62.0F;
   private static final float f_5745 = 26.0F;
   private static final float f_5746 = 6.0F;
   private static final float f_5747 = 6.0F;
   private static final float f_5748 = 104.0F;
   private static final float f_5749 = 66.0F;
   private static final float f_5750 = 62.0F;
   private static final float f_5751 = 66.0F;
   private static final float f_5752 = 62.0F;
   private static final float f_5753 = 14.0F;
   private static final float f_5754 = 154.0F;
   private static final float f_5755 = 138.0F;
   private static final float f_5756 = 62.0F;
   private static final float f_5757 = 7.0F;
   private static final float f_5758 = 0.5F;
   private static final float f_5759 = 68.0F;
   private static final float f_5760 = 30.0F;
   private static final float f_5761 = 13.0F;
   private static final float f_5762 = 10.0F;
   private static final float f_5763 = 10.0F;
   private static final float f_5764 = 12.0F;
   private static final float f_5765 = 10.0F;
   private static final float f_5766 = 12.0F;
   private static final float f_5767 = 10.0F;
   private static final float f_5768 = 10.0F;
   private static final float f_5769 = 10.0F;

   private void m_2160(float var1, float var2, Class_HSD91zSgdqsM5q0d var3, int var4) {
      List var5 = Class_YaEsaeS2vWKCkc5L.m_5692(var3);
      Class_CaVoGy5a20MKv97j var6 = Class_rsrLB4fiDOF3z0YM.m_8516(var3);

      for (int var7 = 0; var7 < var5.size(); var7++) {
         int var8 = var4 + var7;
         Class_CaVoGy5a20MKv97j var9 = (Class_CaVoGy5a20MKv97j)var5.get(var7);
         float var10 = this.m_2190(var1, var8);
         float var11 = this.m_2170(var8, var2);
         if (this.m_2211(var11)) {
            boolean var12 = Class_rsrLB4fiDOF3z0YM.m_8473(var3) && var6 != null && var6.name().equals(var9.name());
            String var13 = var3.m_2888() + var9.name();
            float var14 = this.m_2212(this.f_5394, var13, var12);
            this.m_2198(var10, var11, var12);
            float var15 = (f_5659 + var14 * f_5660) * this.f_5384.getGuiAlpha() * this.f_5405.m_9288() * this.f_5384.getLayoutContentAlpha(0);
            this.f_5386.m_3873(var9.preview(), var10 + f_5661, var11 + f_5662, this.m_2163(), f_5663, var15);
            this.m_2191(var9.displayName(), var10, var11, var12);
         }
      }
   }

   public boolean m_2161(String var1) {
      if (!this.f_5412) {
         return false;
      }

      String var2 = this.f_5413 ? "" : this.f_5411;
      int var3 = 64 - var2.codePointCount(0, var2.length());
      StringBuilder var4 = new StringBuilder(var2);
      var1.codePoints().filter(var0 -> !Character.isISOControl(var0)).limit(Math.max(0, var3)).forEach(var4::appendCodePoint);
      this.m_2169(var4.toString());
      this.f_5413 = false;
      return true;
   }

   private void m_2162(GuiGraphicsExtractor var1, float var2, float var3) {
      this.f_5386.m_3870();
      Class_MTimUzoN9N9ZQr5T[] var4 = Class_MTimUzoN9N9ZQr5T.values();

      for (int var5 = 0; var5 < var4.length; var5++) {
         Class_MTimUzoN9N9ZQr5T var6 = var4[var5];
         float var7 = this.m_2190(var2, var5);
         float var8 = this.m_2170(var5, var3);
         if (this.m_2211(var8)) {
            boolean var9 = !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.MASKS) && Class_rsrLB4fiDOF3z0YM.m_8510() == var6;
            float var10 = this.m_2212(this.f_5389, var6, var9);
            this.m_2198(var7, var8, var9);
            Class_OueIwWsHk2sz6LiR.m_4077(var6, var7 + f_5615, var8 + f_5616, this.m_2163(), f_5617, f_5618 + var10 * f_5619);
            this.m_2191(var6.m_3890(), var7, var8, var9);
         }
      }

      this.m_2160(var2, var3, Class_HSD91zSgdqsM5q0d.MASKS, var4.length);
      this.f_5386.m_3871(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
   }

   private float m_2163() {
      return this.m_2226() - f_5430;
   }

   private void m_2165() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }

   private float m_2167() {
      return this.f_5384.getGuiWidth() - this.m_2232() - f_5427;
   }

   private void m_2168(float var1, float var2, float var3, String var4, float var5, float var6) {
      var4 = Class_0p152hWffX3ippAf.m_801(var4);
      float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 11);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var4,
         var1 + (var3 - var7) / 2.0F,
         var2 + f_5757,
         11,
         Class_BftdentXEtGbugJw.m_2302(this.f_5372, this.f_5371, Math.max(var5, var6 * f_5758))
      );
   }

   private void m_2169(String var1) {
      if (!this.f_5411.equals(var1)) {
         this.f_5411 = var1;
         this.f_5414 = true;
         this.f_5384.resetGuiScroll();
      }
   }

   private float m_2170(int var1, float var2) {
      int var3 = this.f_5416[var1];
      return var3 < 0 ? Float.NaN : this.f_5384.getGuiY() + this.m_2207() + var3 / 3 * f_5754 + var2 + this.f_5407 + this.f_5384.getLayoutOffset(var3);
   }

   private void m_2171(float var1, float var2) {
      String var3 = this.f_5408 == Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.FURRY
         ? Class_0p152hWffX3ippAf.m_801(this.f_5408.f_5350) + Class_0p152hWffX3ippAf.m_801(this.f_5410.f_5351)
         : Class_0p152hWffX3ippAf.m_801(this.f_5408.f_5350);
      this.m_2193(this.f_5408, var1 + 1.0F, var2 + 1.0F, f_5505, this.f_5370);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var3, var1 + f_5506, var2 - 2.0F, 12, this.f_5371);
      String var4 = Class_0p152hWffX3ippAf.m_804(f_5507, f_5508);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), this.m_2206(var4, this.m_2167() - this.m_2224() - f_5509), var1 + f_5510, var2 + f_5511, 10, this.f_5372
      );
      String var5 = "" + this.f_5417 + this.f_5416.length;
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var5,
         var1 + this.m_2167() - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var5, 9),
         var2 + f_5512,
         9,
         this.f_5372
      );
   }

   private Class_m52tuSNQY8S356Ab[] m_2172() {
      return Class_m52tuSNQY8S356Ab.values();
   }

   public boolean m_2173(float var1, float var2) {
      return this.m_2204(var1, var2, this.f_5384.getGuiX() + this.m_2232(), this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
   }

   private float m_2174(Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL var1, float var2) {
      return var2 + switch (var1) {
         case HATS -> f_5498;
         case MASKS -> f_5499;
         case WINGS -> f_5500;
         case BACKPACKS -> f_5501;
         case PETS -> f_5502;
         case FURRY -> f_5503;
         case ITEMS -> f_5504;
      };
   }

   private void m_2175(GuiGraphicsExtractor var1, float var2, float var3) {
      this.f_5385.m_1634();
      this.f_5386.m_3870();
      Class_WzvV6cpDDR1F4aeD[] var4 = Class_WzvV6cpDDR1F4aeD.values();

      for (int var5 = 0; var5 < var4.length; var5++) {
         Class_WzvV6cpDDR1F4aeD var6 = var4[var5];
         float var7 = this.m_2190(var2, var5);
         float var8 = this.m_2170(var5, var3);
         if (this.m_2211(var8)) {
            boolean var9 = !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.WINGS) && Class_rsrLB4fiDOF3z0YM.m_8484() == var6;
            float var10 = this.m_2212(this.f_5388, var6, var9);
            this.m_2198(var7, var8, var9);
            this.f_5385
               .m_1633(
                  var6,
                  var7 + f_5610,
                  var8 + f_5611,
                  this.m_2163(),
                  f_5612,
                  (f_5613 + var10 * f_5614) * this.f_5384.getGuiAlpha() * this.f_5405.m_9288() * this.f_5384.getLayoutContentAlpha(0)
               );
            this.m_2191(var6.m_5496(), var7, var8, var9);
         }
      }

      this.m_2160(var2, var3, Class_HSD91zSgdqsM5q0d.WINGS, var4.length);
      this.f_5385.m_1636(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
      this.f_5386.m_3871(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
   }

   private float m_2176() {
      return this.f_5384.getSidebarWidth() - f_5424;
   }

   private void m_2177(float var1, float var2, float var3) {
      float var4 = this.f_5384.getGuiY() + f_5653;
      float var5 = this.m_2179();
      float var6 = f_5654;
      Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD[] var7 = Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD.values();

      for (int var8 = 0; var8 < var7.length; var8++) {
         Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD var9 = var7[var8];
         float var10 = var1 + var8 * (var5 + var6);
         boolean var11 = this.f_5410 == var9;
         boolean var12 = this.m_2204(var2, var3, var10, var4, var5, f_5655);
         Class_w8fCJQ5ZtH5lQbWc var13 = this.f_5400
            .computeIfAbsent(var9, var1x -> new Class_w8fCJQ5ZtH5lQbWc(var11 ? 1.0F : 0.0F, f_5764, Class_eXr9Fra2ad3yFXY8.f_19100));
         Class_w8fCJQ5ZtH5lQbWc var14 = this.f_5401.computeIfAbsent(var9, var0 -> new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_5763, Class_eXr9Fra2ad3yFXY8.f_19100));
         var13.m_9283(var11 ? 1.0F : 0.0F);
         var14.m_9283(var12 ? 1.0F : 0.0F);
         float var15 = Class_rsrLB4fiDOF3z0YM.m_8480(var9.f_5352) ? 1.0F : 0.0F;
         this.m_2178(var10, var4, var5, f_5656, f_5657, Math.max(var13.m_9288(), var15 * f_5658), var14.m_9288());
         this.m_2168(var10, var4, var5, var9.f_5351, var13.m_9288(), var14.m_9288());
      }
   }

   private void m_2178(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = Math.clamp(var6, 0.0F, 1.0F);
      float var9 = Math.clamp(var7, 0.0F, 1.0F);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var4, var5, Class_BftdentXEtGbugJw.m_2302(this.f_5368, this.f_5375, Math.max(var8, var9 * f_5584)));
      Class_Ssh31B3ljfKeWsvS.m_4854(var1, var2, var3, var4, 1.0F, var5, this.f_5369);
   }

   private float m_2179() {
      return (this.m_2167() - f_5431) / f_5432;
   }

   private void m_2180() {
      Class_HSD91zSgdqsM5q0d var1 = switch (this.f_5408) {
         case HATS -> Class_HSD91zSgdqsM5q0d.HATS;
         case MASKS -> Class_HSD91zSgdqsM5q0d.MASKS;
         case WINGS -> Class_HSD91zSgdqsM5q0d.WINGS;
         case BACKPACKS -> Class_HSD91zSgdqsM5q0d.BACKPACKS;
         case PETS -> Class_HSD91zSgdqsM5q0d.PETS;
         case FURRY -> this.f_5410.f_5352;
         case ITEMS -> null;
      };
      List var2 = var1 == null ? List.of() : Class_YaEsaeS2vWKCkc5L.m_5692(var1);
      if (var2 != this.f_5419) {
         this.f_5419 = var2;
         this.f_5414 = true;
      }

      if (this.f_5408 == Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.HATS) {
         List var3 = Class_isejn8Zjfd3YSXMb.m_7326();
         if (!var3.equals(this.f_5418)) {
            this.f_5418 = var3;
            this.f_5414 = true;
         }
      }

      if (this.f_5414 || this.f_5415 != Class_0p152hWffX3ippAf.m_797()) {
         ArrayList var8 = new ArrayList();
         switch (this.f_5408) {
            case HATS:
               for (Class_LzYTXb7R2jug6Pep var18 : this.f_5418) {
                  var8.add(var18.displayName());
               }
               break;
            case MASKS:
               for (Class_MTimUzoN9N9ZQr5T var27 : Class_MTimUzoN9N9ZQr5T.values()) {
                  var8.add(var27.m_3890());
               }
               break;
            case WINGS:
               for (Class_WzvV6cpDDR1F4aeD var26 : Class_WzvV6cpDDR1F4aeD.values()) {
                  var8.add(var26.m_5496());
               }
               break;
            case BACKPACKS:
               for (Class_LdeJaBYCxAYq5SO6 var25 : Class_LdeJaBYCxAYq5SO6.values()) {
                  var8.add(var25.m_3638());
               }
            case PETS:
            case FURRY:
            default:
               break;
            case ITEMS:
               for (Class_m52tuSNQY8S356Ab var7 : this.m_2172()) {
                  var8.add(var7.m_7577());
               }
         }

         for (Class_CaVoGy5a20MKv97j var19 : this.f_5419) {
            var8.add(var19.displayName());
         }

         this.f_5416 = new int[var8.size()];
         Arrays.fill(this.f_5416, -1);
         this.f_5417 = 0;
         String var14 = this.f_5411.strip().toLowerCase(Locale.ROOT);

         for (int var20 = 0; var20 < var8.size(); var20++) {
            String var24 = (String)var8.get(var20);
            if (var24.toLowerCase(Locale.ROOT).contains(var14) || Class_0p152hWffX3ippAf.m_801(var24).toLowerCase(Locale.ROOT).contains(var14)) {
               this.f_5416[var20] = this.f_5417++;
            }
         }

         this.f_5414 = false;
         this.f_5415 = Class_0p152hWffX3ippAf.m_797();
      }
   }

   public static float m_2181() {
      if (!f_5354) {
         return f_5437;
      }

      f_5354 = false;
      return f_5353;
   }

   private void m_2182() {
      this.f_5367 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND);
      this.f_5368 = Class_BftdentXEtGbugJw.m_2306(this.f_5367, f_5449);
      this.f_5369 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE);
      this.f_5370 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      this.f_5371 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT);
      this.f_5372 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT);
      this.f_5373 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW);
      this.f_5374 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.LINE);
      this.f_5375 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED);
      this.f_5376 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_STATE);
      this.f_5377 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE);
      this.f_5378 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CATEGORY_TEXT);
      this.f_5379 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DESELECT_CATEGORY_TEXT);
      this.f_5380 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SCROLL);
   }

   private boolean m_2184(float var1, float var2, float var3, float var4, Class_HSD91zSgdqsM5q0d var5, int var6) {
      List var7 = Class_YaEsaeS2vWKCkc5L.m_5692(var5);

      for (int var8 = 0; var8 < var7.size(); var8++) {
         int var9 = var6 + var8;
         if (this.m_2204(var1, var2, this.m_2190(var3, var9), this.m_2170(var9, var4), this.m_2226(), f_5710)) {
            Class_rsrLB4fiDOF3z0YM.m_8476((Class_CaVoGy5a20MKv97j)var7.get(var8));
            if (var5.m_2889()) {
               Class_rsrLB4fiDOF3z0YM.m_8513(var5, true);
            }

            this.m_2165();
            return true;
         }
      }

      return false;
   }

   private void m_2185() {
      float var1 = this.f_5384.getGuiX();
      float var2 = this.f_5384.getGuiY();
      float var3 = this.f_5384.getGuiWidth();
      float var4 = this.f_5384.getGuiHeight();
      Class_Ssh31B3ljfKeWsvS.m_4859(var1, var2, var3, var4, f_5450, this.f_5373);
      if (Class_WhZ6MBDQaQZ0AZFd.m_5485() > 0) {
         Class_Ssh31B3ljfKeWsvS.m_4858(var1, var2, var3, var4, f_5451, f_5452, -1);
      }

      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var4, f_5453, this.f_5367);
      Class_Ssh31B3ljfKeWsvS.m_4854(var1, var2, var3, var4, 1.0F, f_5454, this.f_5369);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + this.f_5384.getSidebarWidth(), var2 + f_5455, var3 - this.f_5384.getSidebarWidth(), 1.0F, 0.0F, this.f_5374);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + f_5456, var2 + f_5457, this.f_5384.getSidebarWidth() - f_5458, 1.0F, 0.0F, this.f_5369);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + this.f_5384.getSidebarWidth(), var2, 1.0F, var4, 0.0F, this.f_5374);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2 + var4 - f_5459, this.f_5384.getSidebarWidth(), 1.0F, 0.0F, this.f_5374);
   }

   private void m_2186(GuiGraphicsExtractor var1, float var2, float var3) {
      this.f_5387.m_4157();
      this.f_5386.m_3870();
      Class_LdeJaBYCxAYq5SO6[] var4 = Class_LdeJaBYCxAYq5SO6.values();

      for (int var5 = 0; var5 < var4.length; var5++) {
         Class_LdeJaBYCxAYq5SO6 var6 = var4[var5];
         float var7 = this.m_2190(var2, var5);
         float var8 = this.m_2170(var5, var3);
         if (this.m_2211(var8)) {
            boolean var9 = !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.BACKPACKS) && Class_rsrLB4fiDOF3z0YM.m_8518() == var6;
            float var10 = this.m_2212(this.f_5393, var6, var9);
            this.m_2198(var7, var8, var9);
            float var11 = (f_5648 + var10 * f_5649) * this.f_5384.getGuiAlpha() * this.f_5405.m_9288() * this.f_5384.getLayoutContentAlpha(0);
            this.f_5387.m_4158(var6, var7 + f_5650, var8 + f_5651, this.m_2163(), f_5652, var11);
            this.m_2191(var6.m_3638(), var7, var8, var9);
         }
      }

      this.m_2160(var2, var3, Class_HSD91zSgdqsM5q0d.BACKPACKS, var4.length);
      this.f_5387.m_4156(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
      this.f_5386.m_3871(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
   }

   private void m_2187(float var1, float var2) {
      float var3 = this.m_2194() - (this.m_2228() - f_5744);
      float var4 = this.m_2197();
      if (!(var3 <= var4)) {
         float var5 = Math.max(f_5745, var4 * var4 / var3);
         float var6 = Math.clamp(-var2 / (var3 - var4), 0.0F, 1.0F);
         float var7 = this.f_5384.getGuiY() + this.m_2228();
         Class_Ssh31B3ljfKeWsvS.m_4817(var1 + this.m_2167() + f_5746, var7, 2.0F, var4, 1.0F, this.f_5369);
         Class_Ssh31B3ljfKeWsvS.m_4817(var1 + this.m_2167() + f_5747, var7 + (var4 - var5) * var6, 2.0F, var5, 1.0F, this.f_5380);
      }
   }

   private void m_2188(GuiGraphicsExtractor var1, float var2, float var3) {
      this.f_5386.m_3870();
      this.m_2160(var2, var3, Class_HSD91zSgdqsM5q0d.PETS, 0);
      this.f_5386.m_3871(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
   }

   public boolean m_2189(float var1, float var2, int var3) {
      if (var3 != 0) {
         return false;
      }

      this.m_2180();
      float var4 = this.f_5384.getGuiX() + f_5679;
      float var5 = this.f_5384.getGuiY();
      float var6 = this.m_2210();
      if (this.m_2204(var1, var2, this.m_2213(), var6, this.m_2224(), f_5680)) {
         this.f_5412 = true;
         this.f_5413 = false;
         if (!this.f_5411.isEmpty() && this.m_2204(var1, var2, this.m_2213() + this.m_2224() - f_5681, var6, f_5682, f_5683)) {
            this.m_2169("");
         }

         return true;
      } else {
         this.m_2192();
         Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL[] var7 = Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.values();

         for (Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL var11 : var7) {
            float var12 = this.m_2174(var11, var5);
            if (this.m_2204(var1, var2, this.f_5384.getGuiX() + f_5684, var12, this.m_2216(), f_5685)) {
               if (this.f_5408 != var11) {
                  this.f_5408 = var11;
                  this.f_5414 = true;
                  this.f_5384.resetGuiScroll();
               }

               return true;
            }
         }

         float var17 = this.f_5384.getGuiX() + this.m_2232();
         float var18 = this.f_5384.getGuiScroll();
         float var19 = this.f_5384.getGuiY() + this.f_5384.getGuiHeight() - f_5686;
         if (this.m_2204(var1, var2, var4, var19, this.m_2176(), f_5687)) {
            switch (this.f_5408) {
               case HATS:
                  Class_rsrLB4fiDOF3z0YM.m_8521(!Class_rsrLB4fiDOF3z0YM.m_8499());
                  break;
               case MASKS:
                  Class_rsrLB4fiDOF3z0YM.m_8495(!Class_rsrLB4fiDOF3z0YM.m_8508());
                  break;
               case WINGS:
                  Class_rsrLB4fiDOF3z0YM.m_8470();
                  break;
               case BACKPACKS:
                  Class_rsrLB4fiDOF3z0YM.m_8503(!Class_rsrLB4fiDOF3z0YM.m_8468());
                  break;
               case PETS:
                  Class_rsrLB4fiDOF3z0YM.m_8520(!Class_rsrLB4fiDOF3z0YM.m_8479());
                  break;
               case FURRY:
                  Class_rsrLB4fiDOF3z0YM.m_8513(this.f_5410.f_5352, !Class_rsrLB4fiDOF3z0YM.m_8480(this.f_5410.f_5352));
                  break;
               case ITEMS:
                  Class_rsrLB4fiDOF3z0YM.m_8507(!Class_rsrLB4fiDOF3z0YM.m_8496());
            }

            this.m_2165();
            return true;
         } else {
            if (this.f_5408 != Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.ITEMS) {
               float var20 = this.f_5384.getGuiX() + this.f_5384.getGuiWidth() + f_5688;
               float var28 = this.f_5384.getGuiY() + this.f_5384.getGuiHeight() - f_5689;
               if (this.m_2204(var1, var2, var20, var28, f_5690, f_5691)) {
                  Class_rsrLB4fiDOF3z0YM.m_8485(!Class_rsrLB4fiDOF3z0YM.m_8478());
                  this.m_2165();
                  return true;
               }

               if (this.m_2204(var1, var2, var20, var28 + f_5692, f_5693, f_5694)) {
                  Class_rsrLB4fiDOF3z0YM.m_8492(!Class_rsrLB4fiDOF3z0YM.m_8497());
                  this.m_2165();
                  return true;
               }

               if (this.m_2204(var1, var2, var20, var28 + f_5695, f_5696, f_5697)) {
                  Class_rsrLB4fiDOF3z0YM.m_8487(!Class_rsrLB4fiDOF3z0YM.m_8474());
                  this.m_2165();
                  return true;
               }
            }

            if (this.f_5408 == Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.ITEMS) {
               float var21 = this.f_5384.getGuiY() + f_5698;
               float var29 = f_5699;
               float var13 = f_5700;

               for (int var14 = 0; var14 < Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.values().length; var14++) {
                  if (this.m_2204(var1, var2, var17 + var14 * (var29 + var13), var21, var29, f_5701)) {
                     Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy var15 = Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.values()[var14];
                     if (this.f_5409 != var15) {
                        this.f_5409 = var15;
                        this.f_5384.resetGuiScroll();
                     }

                     return true;
                  }
               }
            } else if (this.f_5408 == Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.FURRY) {
               float var22 = this.f_5384.getGuiY() + f_5702;
               float var30 = this.m_2179();
               float var36 = f_5703;
               Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD[] var37 = Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD.values();

               for (int var38 = 0; var38 < var37.length; var38++) {
                  if (this.m_2204(var1, var2, var17 + var38 * (var30 + var36), var22, var30, f_5704)) {
                     Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD var16 = var37[var38];
                     if (this.f_5410 != var16) {
                        this.f_5410 = var16;
                        this.f_5414 = true;
                        this.f_5384.resetGuiScroll();
                     }

                     return true;
                  }
               }
            }

            if (!this.m_2173(var1, var2)) {
               return false;
            }

            switch (this.f_5408) {
               case HATS:
                  List var27 = this.f_5418;

                  for (int var35 = 0; var35 < var27.size(); var35++) {
                     if (this.m_2204(var1, var2, this.m_2190(var17, var35), this.m_2170(var35, var18), this.m_2226(), f_5707)) {
                        Class_rsrLB4fiDOF3z0YM.m_8522(((Class_LzYTXb7R2jug6Pep)var27.get(var35)).key());
                        this.m_2165();
                        return true;
                     }
                  }

                  if (this.m_2184(var1, var2, var17, var18, Class_HSD91zSgdqsM5q0d.HATS, var27.size())) {
                     return true;
                  }
                  break;
               case MASKS:
                  Class_MTimUzoN9N9ZQr5T[] var26 = Class_MTimUzoN9N9ZQr5T.values();

                  for (int var34 = 0; var34 < var26.length; var34++) {
                     if (this.m_2204(var1, var2, this.m_2190(var17, var34), this.m_2170(var34, var18), this.m_2226(), f_5706)) {
                        Class_rsrLB4fiDOF3z0YM.m_8505(var26[var34]);
                        this.m_2165();
                        return true;
                     }
                  }

                  if (this.m_2184(var1, var2, var17, var18, Class_HSD91zSgdqsM5q0d.MASKS, var26.length)) {
                     return true;
                  }
                  break;
               case WINGS:
                  Class_WzvV6cpDDR1F4aeD[] var25 = Class_WzvV6cpDDR1F4aeD.values();

                  for (int var33 = 0; var33 < var25.length; var33++) {
                     if (this.m_2204(var1, var2, this.m_2190(var17, var33), this.m_2170(var33, var18), this.m_2226(), f_5705)) {
                        Class_rsrLB4fiDOF3z0YM.m_8504(var25[var33]);
                        this.m_2165();
                        return true;
                     }
                  }

                  if (this.m_2184(var1, var2, var17, var18, Class_HSD91zSgdqsM5q0d.WINGS, var25.length)) {
                     return true;
                  }
                  break;
               case BACKPACKS:
                  Class_LdeJaBYCxAYq5SO6[] var24 = Class_LdeJaBYCxAYq5SO6.values();

                  for (int var32 = 0; var32 < var24.length; var32++) {
                     if (this.m_2204(var1, var2, this.m_2190(var17, var32), this.m_2170(var32, var18), this.m_2226(), f_5709)) {
                        Class_rsrLB4fiDOF3z0YM.m_8502(var24[var32]);
                        this.m_2165();
                        return true;
                     }
                  }

                  if (this.m_2184(var1, var2, var17, var18, Class_HSD91zSgdqsM5q0d.BACKPACKS, var24.length)) {
                     return true;
                  }
                  break;
               case PETS:
                  if (this.m_2184(var1, var2, var17, var18, Class_HSD91zSgdqsM5q0d.PETS, 0)) {
                     return true;
                  }
                  break;
               case FURRY:
                  if (this.m_2184(var1, var2, var17, var18, this.f_5410.f_5352, 0)) {
                     return true;
                  }
                  break;
               case ITEMS:
                  Class_m52tuSNQY8S356Ab[] var23 = this.m_2172();

                  for (int var31 = 0; var31 < var23.length; var31++) {
                     if (this.m_2204(var1, var2, this.m_2190(var17, var31), this.m_2170(var31, var18), this.m_2226(), f_5708)) {
                        if (this.f_5409 == Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.MACE) {
                           Class_rsrLB4fiDOF3z0YM.m_8482(var23[var31]);
                        } else {
                           Class_rsrLB4fiDOF3z0YM.m_8494(var23[var31]);
                        }

                        this.m_2165();
                        return true;
                     }
                  }
            }

            return false;
         }
      }
   }

   private float m_2190(float var1, int var2) {
      int var3 = this.f_5416[var2];
      return var3 < 0 ? Float.NaN : var1 + var3 % 3 * (this.m_2226() + f_5753);
   }

   private void m_2191(String var1, float var2, float var3, boolean var4) {
      var1 = Class_0p152hWffX3ippAf.m_801(var1);
      String var5 = var1;

      while (var5.length() > 1 && Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var5 + "", 12) > this.m_2226() - f_5759) {
         var5 = var5.substring(0, var5.length() - 1);
      }

      if (!var5.equals(var1)) {
         var5 = var5 + "";
      }

      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var5, var2 + f_5760, var3 + f_5761, 12, var4 ? this.f_5371 : this.f_5372);
   }

   public void m_2192() {
      this.f_5412 = false;
      this.f_5413 = false;
   }

   private void m_2193(Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL var1, float var2, float var3, float var4, int var5) {
      if (var1 == Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.ITEMS) {
         this.m_2205(f_5605, var2, var3, f_5606, f_5607, Math.round(var4), var5);
      } else {
         Class_Ssh31B3ljfKeWsvS.m_4838(var2, var3, f_5608, f_5609, 0.0F, var5, Class_wHRRCm2tlLY7DN4I.m_9311(this.m_2195(var1) + ""));
      }
   }

   public float m_2194() {
      this.m_2180();
      int var1 = (this.f_5417 + 3 - 1) / 3;
      return this.m_2207() - f_5711 + var1 * f_5712 - (var1 == 0 ? 0.0F : f_5713) + f_5714;
   }

   private String m_2195(Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL var1) {
      return switch (var1) {
         case HATS -> f_5640;
         case MASKS -> f_5641;
         case WINGS -> f_5642;
         case BACKPACKS -> f_5643;
         case PETS -> f_5644;
         case FURRY -> f_5645;
         case ITEMS -> null;
      };
   }

   private void m_2196(GuiGraphicsExtractor var1, float var2, float var3) {
      float var4 = this.f_5384.getGuiX() + this.f_5384.getGuiWidth() + f_5513;
      float var5 = this.f_5384.getGuiY();
      float var6 = f_5514;
      float var7 = this.f_5384.getGuiHeight();
      Class_Ssh31B3ljfKeWsvS.m_4859(var4, var5, var6, var7, f_5515, this.f_5373);
      if (Class_WhZ6MBDQaQZ0AZFd.m_5485() > 0) {
         Class_Ssh31B3ljfKeWsvS.m_4858(var4, var5, var6, var7, f_5516, f_5517, -1);
      }

      Class_Ssh31B3ljfKeWsvS.m_4817(var4, var5, var6, var7, f_5518, this.f_5367);
      Class_Ssh31B3ljfKeWsvS.m_4854(var4, var5, var6, var7, 1.0F, f_5519, this.f_5369);
      Class_Ssh31B3ljfKeWsvS.m_4817(var4, var5 + f_5520, var6, 1.0F, 0.0F, this.f_5374);
      this.m_2205(f_5521, var4 + f_5522, var5 + f_5523, f_5524, f_5525, 16, this.f_5370);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_804(f_5526, f_5527), var4 + f_5528, var5 + f_5529, 12, this.f_5371
      );
      if (Minecraft.getInstance().player != null) {
         float var8 = f_5530;
         float var9 = var4 + f_5531 - var8;
         float var10 = var5 + f_5532 - var8;
         float var11 = var4 + var6 - f_5533 + var8;
         float var12 = var5 + var7 - f_5534 + var8;
         Class_xhirN7J7yHRyh6lR var13 = Class_xhirN7J7yHRyh6lR.m_9504(var9, var10, var11 - var9, var12 - var10);
         f_5353 = Math.clamp(Class_Ssh31B3ljfKeWsvS.m_4821() / f_5535, 0.0F, 1.0F);
         f_5354 = true;
         InventoryScreen.extractEntityInInventoryFollowsMouse(
            var1,
            var13.m_9507(),
            var13.m_9506(),
            var13.m_9505(),
            var13.m_9503(),
            Math.max(1, Math.round((f_5536 + (var7 - f_5537) * f_5538) * var13.scaleY())),
            1.0F,
            var13.screenX(var2),
            var13.screenY(var3),
            Minecraft.getInstance().player
         );
      }

      if (this.f_5408 != Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.ITEMS) {
         float var14 = var4 + f_5539;
         float var15 = var6 - f_5540;
         float var16 = var5 + var7 - f_5541;
         Class_Ssh31B3ljfKeWsvS.m_4817(var4 + f_5542, var16 - f_5543, var6 - f_5544, 1.0F, 0.0F, this.f_5374);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_804(f_5545, f_5546), var4 + f_5547, var16 - f_5548, 10, this.f_5372
         );
         this.m_2209(
            var14,
            var16,
            var15,
            Class_0p152hWffX3ippAf.m_801(f_5549),
            Class_rsrLB4fiDOF3z0YM.m_8478(),
            this.f_5402,
            this.m_2204(var2, var3, var14, var16, var15, f_5550) ? 1.0F : 0.0F
         );
         this.m_2209(
            var14,
            var16 + f_5551,
            var15,
            Class_0p152hWffX3ippAf.m_801(f_5552),
            Class_rsrLB4fiDOF3z0YM.m_8497(),
            this.f_5403,
            this.m_2204(var2, var3, var14, var16 + f_5553, var15, f_5554) ? 1.0F : 0.0F
         );
         this.m_2209(
            var14,
            var16 + f_5555,
            var15,
            Class_0p152hWffX3ippAf.m_801(f_5556),
            Class_rsrLB4fiDOF3z0YM.m_8474(),
            this.f_5404,
            this.m_2204(var2, var3, var14, var16 + f_5557, var15, f_5558) ? 1.0F : 0.0F
         );
      }
   }

   private float m_2197() {
      return f_5752 + this.m_2200() - this.m_2228();
   }

   private void m_2198(float var1, float var2, boolean var3) {
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, this.m_2226(), f_5664, f_5665, this.f_5368);
      if (var3) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var1 + 1.0F,
            var2 + 1.0F,
            this.m_2226() - 2.0F,
            f_5666,
            f_5667,
            Class_BftdentXEtGbugJw.m_2306(this.f_5375, Class_BftdentXEtGbugJw.m_2297(this.f_5375) / f_5668 * f_5669)
         );
      }

      Class_Ssh31B3ljfKeWsvS.m_4854(var1, var2, this.m_2226(), f_5670, 1.0F, f_5671, this.f_5369);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + 1.0F, var2 + f_5672, this.m_2226() - 2.0F, 1.0F, 0.0F, this.f_5374);
      this.m_2193(this.f_5408, var1 + f_5673, var2 + f_5674, f_5675, var3 ? this.f_5370 : this.f_5372);
      this.m_2227(var1 + this.m_2226() - f_5676, var2 + f_5677, var3 ? 1.0F : 0.0F);
   }

   public void m_2199(GuiGraphicsExtractor var1, float var2, float var3, float var4) {
      this.m_2182();
      this.m_2180();
      long var5 = System.currentTimeMillis();
      if (var5 - this.f_5406 > f_5438) {
         this.f_5405.m_9281(0.0F);
      }

      this.f_5406 = var5;
      this.f_5405.m_9283(1.0F);
      float var7 = this.f_5405.m_9288();
      this.f_5407 = f_5439 * (1.0F - var7);
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4821();
      Class_Ssh31B3ljfKeWsvS.m_4864(var8 * var7 * this.f_5384.getLayoutContentAlpha(0));
      float var9 = this.f_5384.getGuiX() + this.m_2232();
      this.m_2185();
      this.m_2202(var2, var3);
      this.m_2171(var9, this.f_5384.getGuiY() + f_5440);
      this.m_2218(this.m_2213(), this.m_2210(), var2, var3);
      this.m_2196(var1, var2, var3);
      if (this.f_5408 == Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.FURRY) {
         this.m_2177(var9, var2, var3);
      }

      if (this.f_5408 == Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.ITEMS) {
         this.m_2234(var9, var2, var3);
      }

      this.m_2203(var1, var9, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
      switch (this.f_5408) {
         case HATS:
            this.m_2231(var1, var9, var4);
            break;
         case MASKS:
            this.m_2162(var1, var9, var4);
            break;
         case WINGS:
            this.m_2175(var1, var9, var4);
            break;
         case BACKPACKS:
            this.m_2186(var1, var9, var4);
            break;
         case PETS:
            this.m_2188(var1, var9, var4);
            break;
         case FURRY:
            this.m_2219(var1, var9, var4);
            break;
         case ITEMS:
            this.m_2223(var1, var9, var4);
      }

      this.m_2225(var1);
      if (this.f_5417 == 0) {
         this.m_2214(
            Class_0p152hWffX3ippAf.m_804(f_5441, f_5442), var9 + this.m_2167() * f_5443, this.f_5384.getGuiY() + this.m_2207() + f_5444, 14, this.f_5371
         );
         this.m_2214(
            Class_0p152hWffX3ippAf.m_804(f_5445, f_5446), var9 + this.m_2167() * f_5447, this.f_5384.getGuiY() + this.m_2207() + f_5448, 11, this.f_5372
         );
      }

      this.m_2187(var9, var4);
      Class_Ssh31B3ljfKeWsvS.m_4864(var8);
   }

   public float m_2200() {
      return this.f_5384.getGuiHeight() - f_5715;
   }

   private void m_2202(float var1, float var2) {
      float var3 = this.f_5384.getGuiX();
      float var4 = this.f_5384.getGuiY();
      Class_Ssh31B3ljfKeWsvS.m_4873(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         Class_BftdentXEtGbugJw.m_2311(f_5460),
         var3 + this.f_5384.getSidebarWidth() * f_5461 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), f_5462, 30) * f_5463 + 2.0F,
         var4 + f_5464,
         30,
         -1
      );
      float var5 = this.f_5384.getSidebarLabelAlpha();
      float var6 = Class_Ssh31B3ljfKeWsvS.m_4821();
      if (var5 > f_5465) {
         Class_Ssh31B3ljfKeWsvS.m_4860(
            var3 + f_5466, var4 + f_5467, Math.max(0.0F, this.f_5384.getSidebarWidth() - f_5468), this.f_5384.getGuiHeight() - f_5469
         );
         Class_Ssh31B3ljfKeWsvS.m_4864(var6 * var5);
         int var7 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CATEGORY_SURTEST);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_804(f_5470, f_5471), var3 + f_5472, var4 + f_5473, 11, var7);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_804(f_5474, f_5475), var3 + f_5476, var4 + f_5477, 11, var7);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_804(f_5478, f_5479), var3 + f_5480, var4 + f_5481, 11, var7);
         Class_Ssh31B3ljfKeWsvS.m_4864(var6);
         Class_Ssh31B3ljfKeWsvS.m_4828();
      }

      Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL[] var15 = Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.values();

      for (Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL var11 : var15) {
         float var12 = this.m_2174(var11, var4);
         Class_w8fCJQ5ZtH5lQbWc var13 = this.f_5395.computeIfAbsent(var11, var1x -> new Class_w8fCJQ5ZtH5lQbWc(var1x == this.f_5408 ? 1.0F : 0.0F, f_5769));
         var13.m_9283(var11 == this.f_5408 ? 1.0F : 0.0F);
         float var14 = var13.m_9288();
         if (var14 > f_5482) {
            Class_Ssh31B3ljfKeWsvS.m_4817(
               var3 + f_5483,
               var12,
               this.m_2216(),
               f_5484,
               f_5485,
               Class_BftdentXEtGbugJw.m_2306(this.f_5375, Class_BftdentXEtGbugJw.m_2297(this.f_5375) / f_5486 * var14)
            );
         }

         this.m_2193(var11, var3 + f_5487, var12 + f_5488, f_5489, Class_BftdentXEtGbugJw.m_2302(this.f_5379, this.f_5370, var14));
         if (var5 > f_5490) {
            Class_Ssh31B3ljfKeWsvS.m_4860(var3 + f_5491, var12, Math.max(0.0F, this.f_5384.getSidebarWidth() - f_5492), f_5493);
            Class_Ssh31B3ljfKeWsvS.m_4864(var6 * var5);
            Class_Ssh31B3ljfKeWsvS.m_4866(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               Class_0p152hWffX3ippAf.m_801(var11.f_5350),
               var3 + f_5494,
               var12 + f_5495,
               13,
               Class_BftdentXEtGbugJw.m_2302(this.f_5379, this.f_5378, var14)
            );
            Class_Ssh31B3ljfKeWsvS.m_4864(var6);
            Class_Ssh31B3ljfKeWsvS.m_4828();
         }
      }

      this.m_2217(var3 + f_5496, var4 + this.f_5384.getGuiHeight() - f_5497, var1, var2);
   }

   private void m_2203(GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5) {
      Class_Ssh31B3ljfKeWsvS.m_4822(var2, var3, var4, var5);
      Class_xhirN7J7yHRyh6lR var6 = Class_xhirN7J7yHRyh6lR.m_9504(var2, var3, var4, var5);
      var1.enableScissor(var6.m_9507(), var6.m_9506(), var6.m_9505(), var6.m_9503());
   }

   public Class_BPk0prpZnkzAPrbb(Screen_8 var1) {
      this.f_5402 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_5420, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_5403 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_5421, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_5404 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_5422, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_5405 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_5423, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_5408 = Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.WINGS;
      this.f_5409 = Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.SWORDS;
      this.f_5410 = Class_BPk0prpZnkzAPrbb.MMC5SY2mj01ryGHD.EARS;
      this.f_5411 = "";
      this.f_5414 = true;
      this.f_5416 = new int[0];
      this.f_5418 = List.of();
      this.f_5419 = List.of();
      this.f_5384 = var1;
   }

   private boolean m_2204(float var1, float var2, float var3, float var4, float var5, float var6) {
      return var1 >= var3 && var1 <= var3 + var5 && var2 >= var4 && var2 <= var4 + var6;
   }

   private void m_2205(String var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var6);
      float var9 = Class_Ssh31B3ljfKeWsvS.m_4863(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var3 + var5 * f_5646, var6);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var2 + (var4 - var8) * f_5647, var9, var6, var7);
   }

   private String m_2206(String var1, float var2) {
      if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, 10) <= var2) {
         return var1;
      }

      int var3 = var1.length();

      while (var3 > 0 && Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1.substring(0, var3) + "", 10) > var2) {
         var3 = var1.offsetByCodePoints(var3, -1);
      }

      return var1.substring(0, var3) + "";
   }

   private float m_2207() {
      return this.f_5408 != Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.ITEMS && this.f_5408 != Class_BPk0prpZnkzAPrbb.Class_7lPgPEQq66jjHWRL.FURRY
         ? f_5749
         : f_5748;
   }

   private void m_2209(float var1, float var2, float var3, String var4, boolean var5, Class_w8fCJQ5ZtH5lQbWc var6, float var7) {
      var6.m_9283(var5 ? 1.0F : 0.0F);
      float var8 = Math.clamp(var6.m_9288(), 0.0F, 1.0F);
      this.m_2178(var1, var2, var3, f_5577, f_5578, 0.0F, var7);
      this.m_2227(var1 + f_5579, var2 + f_5580, var8);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var4,
         var1 + f_5581,
         var2 + f_5582,
         11,
         Class_BftdentXEtGbugJw.m_2302(this.f_5372, this.f_5371, Math.max(var8, var7 * f_5583))
      );
   }

   private float m_2210() {
      return this.f_5384.getGuiY() + f_5436;
   }

   private boolean m_2211(float var1) {
      return var1 + f_5755 >= this.f_5384.getGuiY() + this.m_2228() && var1 <= this.f_5384.getGuiY() + f_5756 + this.m_2200();
   }

   private <T> float m_2212(Map<T, Class_w8fCJQ5ZtH5lQbWc> var1, T var2, boolean var3) {
      Class_w8fCJQ5ZtH5lQbWc var4 = var1.computeIfAbsent(var2, var1x -> new Class_w8fCJQ5ZtH5lQbWc(var3 ? 1.0F : 0.0F, f_5762, Class_eXr9Fra2ad3yFXY8.f_19100));
      var4.m_9283(var3 ? 1.0F : 0.0F);
      return var4.m_9288();
   }

   private float m_2213() {
      return this.f_5384.getGuiX() + this.f_5384.getGuiWidth() - f_5435 - this.m_2224();
   }

   private void m_2214(String var1, float var2, float var3, int var4, int var5) {
      float var6 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var4);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2 - var6 / 2.0F, var3, var4, var5);
   }

   private float m_2216() {
      return this.f_5384.getSidebarWidth() - f_5425;
   }

   private void m_2217(float var1, float var2, float var3, float var4) {
      boolean var5 = switch (this.f_5408) {
         case HATS -> Class_rsrLB4fiDOF3z0YM.m_8499();
         case MASKS -> Class_rsrLB4fiDOF3z0YM.m_8508();
         case WINGS -> Class_rsrLB4fiDOF3z0YM.m_8469();
         case BACKPACKS -> Class_rsrLB4fiDOF3z0YM.m_8468();
         case PETS -> Class_rsrLB4fiDOF3z0YM.m_8479();
         case FURRY -> Class_rsrLB4fiDOF3z0YM.m_8480(this.f_5410.f_5352);
         case ITEMS -> Class_rsrLB4fiDOF3z0YM.m_8496();
      };
      String var6 = var5 ? Class_0p152hWffX3ippAf.m_804(f_5559, f_5560) : Class_0p152hWffX3ippAf.m_804(f_5561, f_5562);
      Class_w8fCJQ5ZtH5lQbWc var7 = this.f_5396
         .computeIfAbsent(this.f_5408, var1x -> new Class_w8fCJQ5ZtH5lQbWc(var5 ? 1.0F : 0.0F, f_5768, Class_eXr9Fra2ad3yFXY8.f_19100));
      Class_w8fCJQ5ZtH5lQbWc var8 = this.f_5397.computeIfAbsent(this.f_5408, var0 -> new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_5767, Class_eXr9Fra2ad3yFXY8.f_19100));
      var7.m_9283(var5 ? 1.0F : 0.0F);
      var8.m_9283(this.m_2204(var3, var4, var1, var2, this.m_2176(), f_5563) ? 1.0F : 0.0F);
      float var9 = Math.clamp(var7.m_9288(), 0.0F, 1.0F);
      float var10 = var8.m_9288();
      this.m_2178(var1, var2, this.m_2176(), f_5564, f_5565, 0.0F, var10);
      float var11 = this.f_5384.getSidebarLabelAlpha();
      float var12 = Class_Ssh31B3ljfKeWsvS.m_4821();
      if (var11 > f_5566) {
         Class_Ssh31B3ljfKeWsvS.m_4860(var1 + f_5567, var2, Math.max(0.0F, this.m_2176() - f_5568), f_5569);
         Class_Ssh31B3ljfKeWsvS.m_4864(var12 * var11);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var6,
            var1 + f_5570,
            var2 + f_5571,
            11,
            Class_BftdentXEtGbugJw.m_2302(this.f_5372, this.f_5371, Math.max(var9, var10 * f_5572))
         );
         Class_Ssh31B3ljfKeWsvS.m_4864(var12);
         Class_Ssh31B3ljfKeWsvS.m_4828();
      }

      float var13 = var1 + (this.m_2176() - f_5573) * f_5574;
      this.m_2220(var13 + (var1 + this.m_2176() - f_5575 - var13) * var11, var2 + f_5576, var9);
   }

   private void m_2218(float var1, float var2, float var3, float var4) {
      this.m_2178(
         var1, var2, this.m_2224(), f_5716, f_5717, this.f_5412 ? f_5718 : 0.0F, this.m_2204(var3, var4, var1, var2, this.m_2224(), f_5719) ? 1.0F : 0.0F
      );
      this.m_2205(f_5720, var1 + f_5721, var2 + f_5722, f_5723, f_5724, 11, this.f_5370);
      float var5 = var1 + f_5725;
      float var6 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_5411, 11);
      float var7 = this.m_2224() - f_5726;
      float var8 = this.f_5412 ? Math.max(0.0F, var6 - var7 + 2.0F) : 0.0F;
      Class_Ssh31B3ljfKeWsvS.m_4822(var5, var2 + f_5727, var7, f_5728);
      if (this.f_5413 && !this.f_5411.isEmpty()) {
         Class_Ssh31B3ljfKeWsvS.m_4817(var5 - var8, var2 + f_5729, var6, f_5730, 2.0F, Class_BftdentXEtGbugJw.m_2306(this.f_5370, f_5731));
      }

      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         this.f_5411.isEmpty() ? Class_0p152hWffX3ippAf.m_804(f_5732, f_5733) : this.f_5411,
         var5 - var8,
         var2 + f_5734,
         11,
         this.f_5411.isEmpty() ? this.f_5372 : this.f_5371
      );
      if (this.f_5412 && !this.f_5413 && System.currentTimeMillis() % f_5735 < f_5736) {
         Class_Ssh31B3ljfKeWsvS.m_4817(var5 + var6 - var8, var2 + f_5737, 1.0F, f_5738, 0.0F, this.f_5370);
      }

      Class_Ssh31B3ljfKeWsvS.m_4830();
      if (!this.f_5411.isEmpty()) {
         this.m_2205(f_5739, var1 + this.m_2224() - f_5740, var2 + f_5741, f_5742, f_5743, 9, this.f_5372);
      }
   }

   private void m_2219(GuiGraphicsExtractor var1, float var2, float var3) {
      this.f_5386.m_3870();
      this.m_2160(var2, var3, this.f_5410.f_5352, 0);
      this.f_5386.m_3871(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
   }

   private void m_2220(float var1, float var2, float var3) {
      float var4 = Math.clamp(var3, 0.0F, 1.0F);
      int var5 = Class_BftdentXEtGbugJw.m_2302(this.f_5377, this.f_5376, var4);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, f_5585, f_5586, f_5587, var5);
      Class_Ssh31B3ljfKeWsvS.m_4817(
         var1 + f_5588 + f_5589 * var4, var2 + f_5590, f_5591, f_5592, f_5593, Class_BftdentXEtGbugJw.m_2302(this.f_5372, this.f_5378, var4)
      );
   }

   public boolean m_2221(int var1, int var2) {
      boolean var3 = (var2 & 2) != 0;
      if (var1 == 70 && var3) {
         this.f_5412 = true;
         this.f_5413 = !this.f_5411.isEmpty();
         return true;
      }

      if (!this.f_5412) {
         return false;
      }

      if (var1 == 256 || var1 == 257 || var1 == 335 || var1 == 258) {
         this.m_2192();
      } else if (var1 == 65 && var3) {
         this.f_5413 = !this.f_5411.isEmpty();
      } else if (var1 == 86 && var3) {
         this.m_2161(Minecraft.getInstance().keyboardHandler.getClipboard());
      } else if (var1 == 259) {
         if (this.f_5413 || var3) {
            this.m_2169("");
         } else if (!this.f_5411.isEmpty()) {
            this.m_2169(this.f_5411.substring(0, this.f_5411.offsetByCodePoints(this.f_5411.length(), -1)));
         }

         this.f_5413 = false;
      } else if (var1 == 261) {
         this.m_2169("");
         this.f_5413 = false;
      }

      return true;
   }

   private void m_2223(GuiGraphicsExtractor var1, float var2, float var3) {
      Class_m52tuSNQY8S356Ab[] var4 = this.m_2172();

      for (int var5 = 0; var5 < var4.length; var5++) {
         Class_m52tuSNQY8S356Ab var6 = var4[var5];
         float var7 = this.m_2190(var2, var5);
         float var8 = this.m_2170(var5, var3);
         if (this.m_2211(var8)) {
            boolean var9 = this.f_5409 == Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.MACE;
            boolean var10 = (var9 ? Class_rsrLB4fiDOF3z0YM.m_8483() : Class_rsrLB4fiDOF3z0YM.m_8488()) == var6;
            float var11 = this.m_2212(var9 ? this.f_5392 : this.f_5391, var6, var10);
            this.m_2198(var7, var8, var10);
            this.m_2230(var6, var9, var7 + f_5625, var8 + f_5626, this.m_2163(), f_5627, f_5628 + var11 * f_5629);
            String var12 = var6.m_7577();
            this.m_2191(var12, var7, var8, var10);
         }
      }
   }

   private float m_2224() {
      return Math.min(f_5433, this.m_2167() * f_5434);
   }

   private void m_2225(GuiGraphicsExtractor var1) {
      var1.disableScissor();
      Class_Ssh31B3ljfKeWsvS.m_4830();
   }

   private float m_2226() {
      return (this.m_2167() - f_5428) / f_5429;
   }

   private void m_2227(float var1, float var2, float var3) {
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, f_5594, f_5595, f_5596, Class_BftdentXEtGbugJw.m_2302(this.f_5377, this.f_5376, var3));
      Class_Ssh31B3ljfKeWsvS.m_4854(var1, var2, f_5597, f_5598, 1.0F, f_5599, this.f_5369);
      if (var3 > f_5600) {
         this.m_2205(f_5601, var1 + f_5602, var2 + 1.0F, f_5603, f_5604, 8, Class_BftdentXEtGbugJw.m_2306(this.f_5371, var3));
      }
   }

   private float m_2228() {
      return f_5750 + this.m_2207() - f_5751;
   }

   private void m_2230(Class_m52tuSNQY8S356Ab var1, boolean var2, float var3, float var4, float var5, float var6, float var7) {
      if (!(var7 <= f_5678)) {
         ItemStack var8 = new ItemStack(var2 ? Items.MACE : Items.DIAMOND_SWORD);
         var8.set(DataComponents.ITEM_MODEL, var1.m_7578());
         float var9 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_Ssh31B3ljfKeWsvS.m_4864(var9 * var7);

         try {
            Class_Ssh31B3ljfKeWsvS.m_4820(var8, var3, var4, var5, var6);
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4864(var9);
         }
      }
   }

   private void m_2231(GuiGraphicsExtractor var1, float var2, float var3) {
      this.f_5386.m_3870();
      List var4 = this.f_5418;

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class_LzYTXb7R2jug6Pep var6 = (Class_LzYTXb7R2jug6Pep)var4.get(var5);
         float var7 = this.m_2190(var2, var5);
         float var8 = this.m_2170(var5, var3);
         if (this.m_2211(var8)) {
            boolean var9 = !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.HATS) && Class_rsrLB4fiDOF3z0YM.m_8512().equals(var6.key());
            float var10 = this.m_2212(this.f_5390, var6.key(), var9);
            this.m_2198(var7, var8, var9);
            float var11 = (f_5620 + var10 * f_5621) * this.f_5384.getGuiAlpha() * this.f_5405.m_9288() * this.f_5384.getLayoutContentAlpha(0);
            this.f_5386.m_3873(var6, var7 + f_5622, var8 + f_5623, this.m_2163(), f_5624, var11);
            this.m_2191(var6.displayName(), var7, var8, var9);
         }
      }

      this.m_2160(var2, var3, Class_HSD91zSgdqsM5q0d.HATS, var4.size());
      this.f_5386.m_3871(var1, var2, this.f_5384.getGuiY() + this.m_2228(), this.m_2167(), this.m_2197());
   }

   private float m_2232() {
      return this.f_5384.getSidebarWidth() + f_5426;
   }

   private void m_2234(float var1, float var2, float var3) {
      float var4 = this.f_5384.getGuiY() + f_5630;
      float var5 = f_5631;
      float var6 = f_5632;

      for (int var7 = 0; var7 < Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.values().length; var7++) {
         Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy var8 = Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.values()[var7];
         float var9 = var1 + var7 * (var5 + var6);
         boolean var10 = this.f_5409 == var8;
         boolean var11 = this.m_2204(var2, var3, var9, var4, var5, f_5633);
         Class_w8fCJQ5ZtH5lQbWc var12 = this.f_5398
            .computeIfAbsent(var8, var1x -> new Class_w8fCJQ5ZtH5lQbWc(var10 ? 1.0F : 0.0F, f_5766, Class_eXr9Fra2ad3yFXY8.f_19100));
         Class_w8fCJQ5ZtH5lQbWc var13 = this.f_5399.computeIfAbsent(var8, var0 -> new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_5765, Class_eXr9Fra2ad3yFXY8.f_19100));
         var12.m_9283(var10 ? 1.0F : 0.0F);
         var13.m_9283(var11 ? 1.0F : 0.0F);
         this.m_2178(var9, var4, var5, f_5634, f_5635, var12.m_9288(), var13.m_9288());
         this.m_2168(
            var9,
            var4,
            var5,
            var8 == Class_BPk0prpZnkzAPrbb.Class_5nGcvCtOV1bB6Ejy.SWORDS
               ? Class_0p152hWffX3ippAf.m_804(f_5636, f_5637)
               : Class_0p152hWffX3ippAf.m_804(f_5638, f_5639),
            var12.m_9288(),
            var13.m_9288()
         );
      }
   }

   private enum Class_5nGcvCtOV1bB6Ejy {
      SWORDS,
      MACE;
   }

   private enum Class_7lPgPEQq66jjHWRL {
      HATS("Шляпы"),
      MASKS("Маски"),
      WINGS("Крылья"),
      BACKPACKS("Рюкзаки"),
      PETS("Питомцы"),
      FURRY("Фурри"),
      ITEMS("SkinChanger");

      public final String f_5350;

      Class_7lPgPEQq66jjHWRL(String var3) {
         this.f_5350 = var3;
      }
   }

   private enum MMC5SY2mj01ryGHD {
      EARS("Ушки", Class_HSD91zSgdqsM5q0d.EARS),
      TAILS("Хвостики", Class_HSD91zSgdqsM5q0d.TAILS),
      PAWS("Лапки", Class_HSD91zSgdqsM5q0d.PAWS),
      STOCKINGS("Чулочки", Class_HSD91zSgdqsM5q0d.STOCKINGS),
      HEADS("Головы", Class_HSD91zSgdqsM5q0d.HEADS);

      public final String f_5351;
      public final Class_HSD91zSgdqsM5q0d f_5352;

      MMC5SY2mj01ryGHD(String var3, Class_HSD91zSgdqsM5q0d var4) {
         this.f_5351 = var3;
         this.f_5352 = var4;
      }
   }
}
