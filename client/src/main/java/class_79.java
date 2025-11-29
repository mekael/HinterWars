import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aX
public class class_79 extends class_74 {
   // $VF: renamed from: g aa
   private class_57 field_2474;
   // $VF: renamed from: h byte
   private byte field_2475;
   // $VF: renamed from: i javax.swing.Icon
   private Icon field_2476;
   // $VF: renamed from: j javax.swing.Icon
   private Icon field_2477;
   // $VF: renamed from: k int
   private int field_2478;
   // $VF: renamed from: l int
   private int field_2479;
   // $VF: renamed from: m javax.swing.Icon
   private Icon field_2480;
   // $VF: renamed from: a boolean
   boolean field_2481;
   // $VF: renamed from: n int
   private int field_2482;
   // $VF: renamed from: o int
   private int field_2483;
   // $VF: renamed from: p int
   private int field_2484;
   // $VF: renamed from: q int
   private int field_2485;
   // $VF: renamed from: r int
   private int field_2486;
   // $VF: renamed from: s int
   private int field_2487;
   // $VF: renamed from: t int
   private int field_2488;
   // $VF: renamed from: u int
   private int field_2489;
   // $VF: renamed from: v javax.swing.Icon
   private Icon field_2490;
   // $VF: renamed from: w int
   private int field_2491;
   // $VF: renamed from: x int
   private int field_2492;
   // $VF: renamed from: y int
   private int field_2493;
   // $VF: renamed from: z int
   private int field_2494;
   // $VF: renamed from: A javax.swing.Icon
   private Icon field_2495;
   // $VF: renamed from: B int
   private int field_2496;
   // $VF: renamed from: C int
   private int field_2497;
   // $VF: renamed from: D int
   private int field_2498;
   // $VF: renamed from: E int
   private int field_2499;
   // $VF: renamed from: F int
   private int field_2500;
   // $VF: renamed from: G int
   private int field_2501;
   // $VF: renamed from: H int
   private int field_2502;
   // $VF: renamed from: I int
   private int field_2503;
   // $VF: renamed from: J javax.swing.Icon
   private Icon field_2504;
   // $VF: renamed from: K int
   private int field_2505;
   // $VF: renamed from: L int
   private int field_2506;
   // $VF: renamed from: M java.lang.String
   private String field_2507;
   // $VF: renamed from: N int
   private int field_2508;
   // $VF: renamed from: O int
   private int field_2509;
   // $VF: renamed from: P byte
   private final byte field_2510 = 0;
   // $VF: renamed from: Q byte
   private final byte field_2511 = 1;
   // $VF: renamed from: R byte
   private final byte field_2512 = 2;
   // $VF: renamed from: S javax.swing.Icon[]
   private Icon[] field_2513;
   // $VF: renamed from: T int
   private int field_2514;
   // $VF: renamed from: U int
   private int field_2515;
   // $VF: renamed from: V java.lang.String[]
   private String[] field_2516;
   // $VF: renamed from: b java.util.Vector
   public Vector field_2517;
   // $VF: renamed from: W int
   private int field_2518;
   // $VF: renamed from: X int
   private int field_2519;
   // $VF: renamed from: Y int
   private int field_2520;
   // $VF: renamed from: Z int
   private int field_2521;
   // $VF: renamed from: aa int
   private int field_2522;
   // $VF: renamed from: ab int
   private int field_2523;
   // $VF: renamed from: ac int
   private int field_2524;
   // $VF: renamed from: ad int[]
   private int[] field_2525;
   // $VF: renamed from: ae int
   private int field_2526;
   // $VF: renamed from: af int
   private int field_2527;
   // $VF: renamed from: ag int
   private int field_2528;
   // $VF: renamed from: c java.util.Vector
   public Vector field_2529;
   // $VF: renamed from: ah int
   private int field_2530;
   // $VF: renamed from: ai int
   private int field_2531;
   // $VF: renamed from: aj int
   private int field_2532;
   // $VF: renamed from: ak int
   private int field_2533;
   // $VF: renamed from: al int
   private int field_2534;
   // $VF: renamed from: am int
   private int field_2535;
   // $VF: renamed from: an int
   private int field_2536;
   // $VF: renamed from: ao int[]
   private int[] field_2537;
   // $VF: renamed from: ap int
   private int field_2538;
   // $VF: renamed from: aq int
   private int field_2539;
   // $VF: renamed from: ar int
   private int field_2540;
   // $VF: renamed from: as java.util.Vector
   private Vector field_2541;
   // $VF: renamed from: at java.util.Vector
   private Vector field_2542;
   // $VF: renamed from: au byte
   private final byte field_2543 = -1;
   // $VF: renamed from: av byte
   private final byte field_2544 = 0;
   // $VF: renamed from: aw byte
   private final byte field_2545 = 1;
   // $VF: renamed from: ax byte
   private final byte field_2546 = 2;
   // $VF: renamed from: ay int
   private int field_2547;
   // $VF: renamed from: az int
   private int field_2548;
   // $VF: renamed from: aA int
   private int field_2549;
   // $VF: renamed from: aB int
   private int field_2550;
   // $VF: renamed from: aC int
   private int field_2551;
   // $VF: renamed from: aD int
   private int field_2552;
   // $VF: renamed from: aE javax.swing.Icon
   private Icon field_2553;
   // $VF: renamed from: aF int
   private int field_2554;
   // $VF: renamed from: aG javax.swing.Icon[]
   private Icon[] field_2555;
   // $VF: renamed from: aH int
   private int field_2556;
   // $VF: renamed from: aI int[]
   private int[] field_2557;
   // $VF: renamed from: aJ int
   private int field_2558;
   // $VF: renamed from: aK int
   private int field_2559;
   // $VF: renamed from: aL int
   private int field_2560;
   // $VF: renamed from: aM int
   private int field_2561;
   // $VF: renamed from: aN int
   private int field_2562;
   // $VF: renamed from: aO int
   private int field_2563;
   // $VF: renamed from: aP int
   private int field_2564;
   // $VF: renamed from: aQ int
   private int field_2565;
   // $VF: renamed from: aR int
   private int field_2566;
   // $VF: renamed from: aS int
   private int field_2567;
   // $VF: renamed from: aT int
   private int field_2568;
   // $VF: renamed from: aU int
   private int field_2569;
   // $VF: renamed from: aV int
   private int field_2570;
   // $VF: renamed from: aW int
   private int field_2571;
   // $VF: renamed from: aX int
   private int field_2572;
   // $VF: renamed from: aY javax.swing.Icon[]
   private Icon[] field_2573;
   // $VF: renamed from: aZ byte
   private final byte field_2574 = 0;
   // $VF: renamed from: ba byte
   private final byte field_2575 = 1;
   // $VF: renamed from: bb int
   private int field_2576;
   // $VF: renamed from: bc int[]
   private int[] field_2577;
   // $VF: renamed from: bd int
   private int field_2578;
   // $VF: renamed from: be int[]
   private int[] field_2579;
   // $VF: renamed from: bf int
   private int field_2580;
   // $VF: renamed from: bg java.util.Vector[]
   private Vector[] field_2581;
   // $VF: renamed from: bh java.util.Vector[]
   private Vector[] field_2582;
   // $VF: renamed from: bi int
   private int field_2583;
   // $VF: renamed from: bj int
   private int field_2584;
   // $VF: renamed from: bk int
   private int field_2585;
   // $VF: renamed from: bl int
   private int field_2586;
   // $VF: renamed from: bm int
   private int field_2587;
   // $VF: renamed from: bn int
   private int field_2588;
   // $VF: renamed from: bo int
   private int field_2589;
   // $VF: renamed from: bp int[]
   private int[] field_2590;
   // $VF: renamed from: bq int
   private int field_2591;
   // $VF: renamed from: br int
   private int field_2592;
   // $VF: renamed from: bs int
   private int field_2593;
   // $VF: renamed from: bt long
   private long field_2594;
   // $VF: renamed from: bu ai
   private class_63 field_2595;
   // $VF: renamed from: bv int
   private int field_2596;
   // $VF: renamed from: bw int
   private int field_2597;
   // $VF: renamed from: bx long
   private long field_2598;
   // $VF: renamed from: by int
   private final int field_2599 = 300;
   // $VF: renamed from: bz int
   private int field_2600;
   // $VF: renamed from: bA int
   private int field_2601;
   // $VF: renamed from: bB int
   private int field_2602;
   // $VF: renamed from: bC int
   private int field_2603;
   // $VF: renamed from: bD javax.swing.Icon[]
   private Icon[] field_2604;
   // $VF: renamed from: bE int
   private int field_2605;
   // $VF: renamed from: bF int[]
   private int[] field_2606;
   // $VF: renamed from: bG int[]
   private int[] field_2607;
   // $VF: renamed from: bH GameStates
   private GameStates field_2608;
   // $VF: renamed from: bI byte
   private byte field_2609;
   // $VF: renamed from: bJ byte
   private final byte field_2610 = 0;
   // $VF: renamed from: bK byte
   private final byte field_2611 = 1;
   // $VF: renamed from: bL byte
   private final byte field_2612 = 2;
   // $VF: renamed from: bM byte
   private final byte field_2613 = 3;
   // $VF: renamed from: bN byte
   private final byte field_2614 = 4;
   // $VF: renamed from: d long
   public static long field_2615;
   // $VF: renamed from: e java.lang.String
   public static String field_2616;
   // $VF: renamed from: f int
   public static int field_2617;

   public class_79(GameStates var1) {
      this.field_2608 = var1;
   }

   // $VF: renamed from: a (aa, long) void
   @Override
   public void method_670(class_57 var1, long var2) {
      this.field_2474 = var1;
      this.field_2475 = 18;
      switch (GameStates.field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            this.field_2476 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 436)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            this.field_2476 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1165)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.field_2476 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1071)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            this.field_2476 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1172)));
      }

      this.field_2604 = new Icon[9];
      this.field_2604[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1224)));
      this.field_2604[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1225)));
      this.field_2604[2] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1226)));
      this.field_2604[3] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1227)));
      this.field_2604[4] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1226)));
      this.field_2604[5] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1228)));
      this.field_2604[6] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1227)));
      this.field_2604[7] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1225)));
      this.field_2604[8] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1227)));
      this.field_2477 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 447)));
      this.field_2478 = var1.method_502("en", 448);
      this.field_2479 = var1.method_502("en", 449);
      this.field_2480 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 450)));
      this.field_2481 = false;
      this.field_2482 = var1.method_502("en", 451);
      this.field_2483 = var1.method_502("en", 452);
      this.field_2484 = var1.method_502("en", 453);
      this.field_2485 = var1.method_502("en", 454);
      this.field_2486 = this.field_2482;
      this.field_2487 = this.field_2484;
      this.field_2488 = var1.method_502("en", 455);
      this.field_2489 = var1.method_502("en", 456);
      this.field_2490 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 457)));
      this.field_2491 = var1.method_502("en", 458);
      this.field_2492 = var1.method_502("en", 459);
      this.field_2493 = var1.method_502("en", 460);
      this.field_2494 = var1.method_502("en", 461);
      this.field_2495 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 462)));
      this.field_2496 = var1.method_502("en", 463);
      this.field_2497 = var1.method_502("en", 464);
      this.field_2498 = var1.method_502("en", 465);
      this.field_2499 = var1.method_502("en", 466);
      this.field_2500 = this.field_2496;
      this.field_2501 = this.field_2498;
      this.field_2502 = var1.method_502("en", 467);
      this.field_2503 = var1.method_502("en", 468);
      this.field_2504 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 478)));
      this.field_2505 = var1.method_502("en", 479);
      this.field_2506 = var1.method_502("en", 480);
      this.field_2507 = "";
      this.field_2508 = var1.method_502("en", 481);
      this.field_2509 = var1.method_502("en", 482);
      this.field_2513 = new ImageIcon[4];
      this.field_2513[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 483)));
      this.field_2513[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 484)));
      this.field_2513[2] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 485)));
      this.field_2513[3] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 486)));
      this.field_2514 = var1.method_502("en", 487);
      this.field_2515 = var1.method_502("en", 488);
      this.field_2516 = this.field_2608.field_1271.method_662();
      this.field_2517 = new Vector();
      this.field_2518 = var1.method_502("en", 489);
      this.field_2519 = var1.method_502("en", 490);
      this.field_2520 = var1.method_502("en", 491);
      this.field_2521 = var1.method_502("en", 492);
      this.field_2522 = var1.method_502("en", 493);
      this.field_2523 = -1;
      this.field_2524 = var1.method_502("en", 494);
      this.field_2525 = var1.method_503("en", 495);
      this.field_2526 = var1.method_502("en", 496);
      this.field_2527 = var1.method_502("en", 497);
      this.field_2528 = 0;
      this.field_2529 = new Vector();
      this.field_2530 = var1.method_502("en", 498);
      this.field_2531 = var1.method_502("en", 499);
      this.field_2532 = var1.method_502("en", 500);
      this.field_2533 = var1.method_502("en", 501);
      this.field_2534 = var1.method_502("en", 502);
      this.field_2535 = 0;
      this.field_2536 = var1.method_502("en", 503);
      this.field_2537 = var1.method_503("en", 504);
      this.field_2538 = var1.method_502("en", 505);
      this.field_2539 = var1.method_502("en", 506);
      this.field_2540 = 0;
      this.field_2541 = new Vector();
      this.field_2542 = new Vector();
      this.field_2547 = var1.method_502("en", 507);
      this.field_2548 = var1.method_502("en", 508);
      this.field_2549 = var1.method_502("en", 509);
      this.field_2550 = var1.method_502("en", 510);
      this.field_2551 = var1.method_502("en", 511);
      this.field_2552 = 0;
      this.field_2553 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 512)));
      this.field_2554 = var1.method_502("en", 513);
      this.field_2555 = new Icon[3];
      this.field_2555[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 514)));
      this.field_2555[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 516)));
      this.field_2555[2] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 515)));
      this.field_2556 = var1.method_502("en", 517);
      this.field_2557 = var1.method_503("en", 518);
      this.field_2558 = var1.method_502("en", 519);
      this.field_2559 = var1.method_502("en", 520);
      this.field_2560 = 0;
      this.field_2561 = var1.method_502("en", 521);
      this.field_2562 = var1.method_502("en", 522);
      this.field_2563 = var1.method_502("en", 523);
      this.field_2564 = var1.method_502("en", 524);
      this.field_2565 = var1.method_502("en", 525);
      this.field_2566 = var1.method_502("en", 526);
      this.field_2567 = var1.method_502("en", 527);
      this.field_2568 = var1.method_502("en", 528);
      this.field_2569 = var1.method_502("en", 529);
      this.field_2570 = var1.method_502("en", 530);
      this.field_2571 = var1.method_502("en", 531);
      this.field_2572 = var1.method_502("en", 532);
      this.field_2573 = new Icon[2];
      this.field_2573[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 441)));
      this.field_2573[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 442)));
      this.field_2576 = 0;
      this.field_2577 = var1.method_503("en", 443);
      this.field_2578 = var1.method_502("en", 444);
      this.field_2579 = var1.method_503("en", 445);
      this.field_2580 = var1.method_502("en", 446);
      this.field_2581 = new Vector[2];
      this.field_2581[0] = new Vector();
      this.field_2581[1] = new Vector();
      this.field_2582 = new Vector[2];
      this.field_2582[0] = new Vector();
      this.field_2582[1] = new Vector();
      this.field_2583 = var1.method_502("en", 469);
      this.field_2584 = var1.method_502("en", 470);
      this.field_2585 = var1.method_502("en", 471);
      this.field_2586 = var1.method_502("en", 472);
      this.field_2587 = var1.method_502("en", 477);
      this.field_2588 = 0;
      this.field_2589 = var1.method_502("en", 473);
      this.field_2590 = var1.method_503("en", 474);
      this.field_2591 = var1.method_502("en", 475);
      this.field_2592 = var1.method_502("en", 476);
      this.field_2593 = 0;
      this.field_2595 = new class_63();
      this.field_2595
         .method_567(
            this.field_2583 + 5,
            this.field_2584 + MastersOfDestiny.field_2809.getHeight() / 2,
            this.field_2585,
            this.field_2587 - this.field_2584,
            MastersOfDestiny.field_2808,
            MastersOfDestiny.field_2815
         );
      this.field_2600 = var1.method_502("en", 437);
      this.field_2601 = var1.method_502("en", 438);
      this.field_2602 = var1.method_502("en", 439);
      this.field_2603 = var1.method_502("en", 440);
      this.field_2606 = new int[9];
      this.field_2607 = new int[9];
      this.field_2606[0] = this.field_2600;
      this.field_2607[0] = this.field_2601;
      this.field_2606[1] = this.field_2482;
      this.field_2607[1] = this.field_2484;
      this.field_2606[2] = this.field_2491;
      this.field_2607[2] = this.field_2492;
      this.field_2606[3] = this.field_2496;
      this.field_2607[3] = this.field_2498;
      this.field_2606[4] = this.field_2561;
      this.field_2607[4] = this.field_2562;
      this.field_2606[5] = this.field_2565;
      this.field_2607[5] = this.field_2566;
      this.field_2606[6] = this.field_2569;
      this.field_2607[6] = this.field_2570;
      this.field_2606[7] = this.field_2483;
      this.field_2607[7] = this.field_2485;
      this.field_2606[8] = this.field_2497;
      this.field_2607[8] = this.field_2499;
      this.field_2605 = -1;
      this.field_2609 = 0;
      this.method_737(class_70.method_635());
      this.method_737(class_70.method_650());
      this.method_737(class_70.method_649());
   }

   // $VF: renamed from: b (aa, long) int
   @Override
   public int method_671(class_57 var1, long var2) {
      return this.field_2475;
   }

   // $VF: renamed from: a (byte) void
   @Override
   public void method_672(byte var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_673(Graphics var1, MastersOfDestiny var2) {
      this.field_2476.paintIcon(var2, var1, 0, 0);
      this.field_2573[this.field_2576].paintIcon(var2, var1, this.field_2577[this.field_2576], this.field_2578);
      switch (this.field_2609) {
         case 0:
            this.field_2477.paintIcon(var2, var1, this.field_2478, this.field_2479);
            var1.setColor(new Color(8092539));
            var1.setFont(MastersOfDestiny.field_2806);
            var1.drawString("Booking server...", this.field_2486, this.field_2487 + this.field_2489);
            break;
         case 1:
            this.field_2477.paintIcon(var2, var1, this.field_2478, this.field_2479);
            var1.setColor(new Color(15790320));
            var1.fillRect(this.field_2478 + 2, this.field_2479 + 2, this.field_2477.getIconWidth() - 4, this.field_2477.getIconHeight() - 4);
            var1.setColor(new Color(0));
            var1.setFont(MastersOfDestiny.field_2812);
            var1.drawString(
               "Sorry",
               this.field_2478 + this.field_2477.getIconWidth() / 2 - var1.getFontMetrics().stringWidth("Sorry") / 2,
               this.field_2479 + var1.getFontMetrics().getHeight()
            );
            var1.setColor(new Color(8092539));
            var1.setFont(MastersOfDestiny.field_2808);
            var1.drawString("There is no server available for mission", this.field_2486, this.field_2479 + var1.getFontMetrics().getHeight() * 2);
            var1.drawString("at the moment.", this.field_2486, this.field_2479 + var1.getFontMetrics().getHeight() * 3);
            var1.drawString("Please check back again", this.field_2486, this.field_2479 + var1.getFontMetrics().getHeight() * 5);
            break;
         case 2:
            int var3 = this.field_2584;

            for (int var10 = this.field_2593; var10 < this.field_2581[this.field_2576].size(); var10++) {
               if (this.field_2588 == var10) {
                  var1.setColor(new Color(6710886));
                  var1.fillRect(this.field_2583, var3, this.field_2585, this.field_2586);
               }

               var1.setColor(Color.WHITE);
               var1.setFont(MastersOfDestiny.field_2808);
               var1.drawString(
                  var10 + 1 + ". " + this.field_2581[this.field_2576].elementAt(var10).toString(),
                  this.field_2583 + MastersOfDestiny.field_2809.getHeight(),
                  var3 + MastersOfDestiny.field_2809.getHeight()
               );
               var3 += this.field_2586;
               if (var3 >= this.field_2587) {
                  break;
               }
            }

            this.field_2477.paintIcon(var2, var1, this.field_2478, this.field_2479);
            var1.setColor(new Color(8092539));
            var1.setFont(MastersOfDestiny.field_2806);
            var1.drawString("Double click on a misson to select.", this.field_2486, this.field_2487 + this.field_2489);
            break;
         case 3:
            this.field_2595.method_572(var1, var2);
            this.field_2477.paintIcon(var2, var1, this.field_2478, this.field_2479);
            this.field_2480.paintIcon(var2, var1, this.field_2486, this.field_2487);
            this.field_2490.paintIcon(var2, var1, this.field_2491, this.field_2492);
            this.field_2495.paintIcon(var2, var1, this.field_2500, this.field_2501);
            break;
         case 4:
            this.field_2595.method_572(var1, var2);
            this.field_2504.paintIcon(var2, var1, this.field_2505, this.field_2506);
            var1.setColor(new Color(8092539));
            var1.setFont(MastersOfDestiny.field_2814);
            int var4 = this.field_2519;

            for (int var5 = this.field_2528; var5 < this.field_2517.size(); var5++) {
               if (this.field_2523 == var5) {
                  var1.setColor(new Color(10461087));
                  var1.fillRect(this.field_2518, var4, this.field_2520, this.field_2521);
               }

               var1.setColor(Color.BLACK);
               String[] var6 = ((String)this.field_2517.elementAt(var5)).split("\\|");
               this.field_2513[Integer.parseInt(var6[0]) - 1]
                  .paintIcon(var2, var1, this.field_2518 + 1, var4 + (this.field_2521 - this.field_2513[Integer.parseInt(var6[0]) - 1].getIconHeight()) / 2);
               var1.setFont(MastersOfDestiny.field_2841);
               var1.drawString(
                  var6[1],
                  this.field_2518 + 1 + this.field_2514 + (this.field_2515 - var1.getFontMetrics().stringWidth(var6[1])) / 2,
                  var4 + 4 * (this.field_2521 / 5)
               );
               var1.setFont(MastersOfDestiny.field_2808);
               if (this.field_2541.contains(this.field_2517.elementAt(var5))) {
                  var1.setFont(MastersOfDestiny.field_2810);
               }

               var1.drawString(
                  var6[2], this.field_2518 + 1 + this.field_2513[Integer.parseInt(var6[0]) - 1].getIconWidth() + 2, var4 + 4 * (this.field_2521 / 5)
               );
               var4 += this.field_2521;
               if (var4 >= this.field_2522) {
                  break;
               }
            }

            int var11 = this.field_2531;

            for (int var12 = this.field_2540; var12 < this.field_2529.size(); var12++) {
               if (this.field_2535 == var12) {
                  var1.setColor(new Color(10461087));
                  var1.fillRect(this.field_2530, var11, this.field_2532, this.field_2533);
               }

               var1.setColor(Color.BLACK);
               String[] var7 = ((String)this.field_2529.elementAt(var12)).split("\\|");
               this.field_2513[Integer.parseInt(var7[0]) - 1]
                  .paintIcon(var2, var1, this.field_2530 + 1, var11 + (this.field_2533 - this.field_2513[Integer.parseInt(var7[0]) - 1].getIconHeight()) / 2);
               var1.setFont(MastersOfDestiny.field_2841);
               var1.drawString(
                  var7[1],
                  this.field_2530 + 1 + this.field_2514 + (this.field_2515 - var1.getFontMetrics().stringWidth(var7[1])) / 2,
                  var11 + 4 * (this.field_2533 / 5)
               );
               var1.setFont(MastersOfDestiny.field_2808);
               if (this.field_2541.contains(this.field_2529.elementAt(var12))) {
                  var1.setFont(MastersOfDestiny.field_2810);
               }

               var1.drawString(
                  var7[2], this.field_2530 + 1 + this.field_2513[Integer.parseInt(var7[0]) - 1].getIconWidth() + 2, var11 + 4 * (this.field_2533 / 5)
               );
               var11 += this.field_2533;
               if (var11 >= this.field_2534) {
                  break;
               }
            }

            int var13 = this.field_2548;

            for (int var14 = this.field_2560; var14 < this.field_2541.size(); var14++) {
               if (this.field_2552 == var14) {
                  var1.setColor(new Color(10461087));
                  var1.fillRect(this.field_2547, var13, this.field_2549, this.field_2550);
               }

               var1.setColor(Color.BLACK);
               String[] var8 = ((String)this.field_2541.elementAt(var14)).split("\\|");
               this.field_2513[Integer.parseInt(var8[0]) - 1]
                  .paintIcon(var2, var1, this.field_2547 + 3, var13 + (this.field_2550 - this.field_2513[Integer.parseInt(var8[0]) - 1].getIconHeight()) / 2);
               var1.setFont(MastersOfDestiny.field_2841);
               var1.drawString(
                  var8[1],
                  this.field_2547 + 3 + this.field_2514 + (this.field_2515 - var1.getFontMetrics().stringWidth(var8[1])) / 2,
                  var13 + 4 * (this.field_2550 / 5)
               );
               var1.setFont(MastersOfDestiny.field_2808);
               var1.drawString(
                  var8[2], this.field_2547 + 3 + this.field_2513[Integer.parseInt(var8[0]) - 1].getIconWidth() + 2, var13 + 4 * (this.field_2550 / 5)
               );
               this.field_2553.paintIcon(var2, var1, this.field_2554, var13 + (this.field_2550 - this.field_2553.getIconHeight()) / 2);
               byte var9 = (Byte)this.field_2542.elementAt(var14);
               if (var9 != -1) {
                  this.field_2555[var9]
                     .paintIcon(
                        var2,
                        var1,
                        this.field_2554 + (this.field_2553.getIconWidth() - this.field_2555[var9].getIconWidth()) / 2,
                        var13 + (this.field_2550 - this.field_2555[var9].getIconHeight()) / 2
                     );
               }

               var13 += this.field_2550;
               if (var13 >= this.field_2551) {
                  break;
               }
            }
      }

      if (this.field_2605 != -1) {
         this.field_2604[this.field_2605].paintIcon(var2, var1, this.field_2606[this.field_2605], this.field_2607[this.field_2605]);
      }
   }

   // $VF: renamed from: a (int, java.lang.Object) void
   @Override
   public void method_674(int var1, Object var2) {
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_675(String[] var1) {
      switch (class_70.method_618(var1)) {
         case -1:
            this.method_737(class_68.method_622(Long.toString(class_57.field_1525), this.field_2474.field_1526));
         case 0:
         case 6:
         case 7:
         case 8:
         default:
            break;
         case 1:
            this.field_2581[1].add(this.method_738(Long.parseLong(var1[1])));
            this.field_2582[1].add(Long.valueOf(var1[1]));
            class_62.method_563("added quest " + Long.valueOf(var1[1]));
            break;
         case 2:
            this.field_2581[0].add(this.method_740(Long.parseLong(var1[1])));
            this.field_2582[0].add(Long.valueOf(var1[1]));
            break;
         case 3:
            class_62.method_563("avail players: " + var1[1]);
            int var6 = Integer.parseInt(var1[2]);
            int var3 = Integer.parseInt(var1[3]);
            this.field_2516 = this.field_2608.field_1271.method_662();

            for (int var9 = 0; var9 < this.field_2516.length; var9++) {
               class_62.method_563("buddies " + var9 + " : " + this.field_2516[var9]);
               if (this.field_2516[var9].equalsIgnoreCase(var1[1])) {
                  this.field_2517.add(var6 + "|" + var3 + "|" + this.field_2516[var9]);
                  return;
               }
            }

            this.field_2529.add(var6 + "|" + var3 + "|" + var1[1]);
            break;
         case 4:
            field_2615 = Long.parseLong(var1[1]);
            field_2616 = var1[2];
            field_2617 = Integer.parseInt(var1[3]);
            this.field_2609 = 2;
            break;
         case 5:
            if (this.field_2581 != null) {
               for (int var2 = 0; var2 < this.field_2581.length; var2++) {
                  this.field_2581[var2].clear();
               }
            }

            this.field_2609 = 1;
            break;
         case 9:
            if (var1[4].equalsIgnoreCase("Y")) {
               class_62.method_563("ok.." + var1[1] + " accepted");
               Enumeration var7 = this.field_2541.elements();
               int var10 = 0;

               while (var7.hasMoreElements() && !((String)var7.nextElement()).endsWith(var1[1])) {
                  var10++;
               }

               this.field_2542.removeElementAt(var10);
               this.field_2542.insertElementAt((byte)0, var10);
            } else if (var1[4].equalsIgnoreCase("N")) {
               class_62.method_563("ok.." + var1[1] + " declined");
               Enumeration var8 = this.field_2541.elements();
               int var11 = 0;

               while (var8.hasMoreElements() && !((String)var8.nextElement()).endsWith(var1[1])) {
                  var11++;
               }

               this.field_2542.removeElementAt(var11);
               this.field_2542.insertElementAt((byte)1, var11);
            }
            break;
         case 10:
            class_62.method_563("ok.." + var1[1] + " declined");
            Enumeration var4 = this.field_2541.elements();
            int var5 = 0;

            while (var4.hasMoreElements() && !((String)var4.nextElement()).endsWith(var1[1])) {
               var5++;
            }

            class_62.method_563("hq test: index=" + var5);
            this.field_2542.removeElementAt(var5);
            this.field_2542.insertElementAt((byte)1, var5);
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_737(String var1) {
      this.field_2608.field_435.write(var1);
      this.field_2608.field_435.flush();
      class_62.method_563("sent: " + var1);
   }

   // $VF: renamed from: a () void
   @Override
   public void method_676() {
   }

   // $VF: renamed from: a (long) java.lang.String
   private String method_738(long var1) {
      return this.field_2474.field_1542.method_136(var1).method_140();
   }

   // $VF: renamed from: b (long) void
   private void method_739(long var1) {
      this.field_2594 = var1;
      this.field_2595.method_570();
      String[] var3 = this.field_2474.field_1542.method_136(var1).method_144();

      for (int var4 = 0; var4 < var3.length; var4++) {
         this.field_2595.method_569(var3[var4], 14274510, 16777215);
      }

      this.field_2595.method_571((byte)2);
   }

   // $VF: renamed from: c (long) java.lang.String
   private String method_740(long var1) {
      return this.field_2474.field_1543.method_145(var1).method_149();
   }

   // $VF: renamed from: d (long) void
   private void method_741(long var1) {
      this.field_2594 = var1;
      this.field_2595.method_570();
      String[] var3 = this.field_2474.field_1543.method_145(var1).method_153();

      for (int var4 = 0; var4 < var3.length; var4++) {
         this.field_2595.method_569(var3[var4], 14274510, 16777215);
      }

      this.field_2595.method_571((byte)2);
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   @Override
   public void method_677(MouseEvent var1) {
      if (this.field_2609 != 3 && this.field_2609 != 4) {
         for (int var2 = 0; var2 < this.field_2573.length; var2++) {
            if (var1.getX() >= this.field_2577[var2]
               && var1.getX() <= this.field_2577[var2] + this.field_2579[var2]
               && var1.getY() >= this.field_2578
               && var1.getY() <= this.field_2578 + this.field_2580) {
               this.field_2576 = var2;
               this.field_2588 = 0;
               this.field_2593 = 0;
               return;
            }
         }
      }

      if (this.field_2609 == 2) {
         for (int var8 = 0; var8 <= (this.field_2587 - this.field_2584) / this.field_2586; var8++) {
            if (var1.getX() >= this.field_2583
               && var1.getX() <= this.field_2583 + this.field_2585
               && var1.getY() >= this.field_2584 + this.field_2586 * var8
               && var1.getY() <= this.field_2584 + this.field_2586 * var8 + this.field_2586
               && this.field_2588 != var8 + this.field_2593) {
               this.field_2588 = var8 + this.field_2593;
               return;
            }
         }
      }

      for (int var9 = 0; var9 < this.field_2590.length; var9++) {
         if (var1.getX() >= this.field_2589
            && var1.getX() <= this.field_2589 + this.field_2591
            && var1.getY() >= this.field_2590[var9]
            && var1.getY() <= this.field_2590[var9] + this.field_2592) {
            if (this.field_2609 == 2) {
               switch (var9) {
                  case 0:
                     if (this.field_2593 > 0) {
                        this.field_2593--;
                     }

                     return;
                  case 1:
                     if (this.field_2581[this.field_2576].size() - this.field_2593 > (this.field_2587 - this.field_2584) / this.field_2586 + 1) {
                        this.field_2593++;
                     }

                     return;
               }
            } else if (this.field_2609 == 3) {
               switch (var9) {
                  case 0:
                     this.field_2595.method_571((byte)0);
                     return;
                  case 1:
                     this.field_2595.method_571((byte)1);
                     return;
               }
            }
         }
      }

      if (this.field_2609 == 4) {
         int var10 = this.field_2519;

         for (int var3 = this.field_2528; var3 < this.field_2517.size(); var3++) {
            if (var1.getX() > this.field_2518
               && var1.getX() < this.field_2518 + this.field_2520
               && var1.getY() > var10
               && var1.getY() < var10 + this.field_2521) {
               this.field_2523 = var3;
               this.field_2535 = -1;
               break;
            }

            var10 += this.field_2521;
            if (var10 >= this.field_2522) {
               break;
            }
         }

         for (int var11 = 0; var11 < this.field_2525.length; var11++) {
            if (var1.getX() > this.field_2524
               && var1.getX() < this.field_2524 + this.field_2526
               && var1.getY() > this.field_2525[var11]
               && var1.getY() < this.field_2525[var11] + this.field_2527) {
               switch (var11) {
                  case 0:
                     if (this.field_2528 > 0) {
                        this.field_2528--;
                     }
                     break;
                  case 1:
                     if (this.field_2517.size() - this.field_2528 > (this.field_2522 - this.field_2519) / this.field_2521 + 1) {
                        this.field_2528++;
                     }
               }
            }
         }

         int var12 = this.field_2531;

         for (int var4 = this.field_2540; var4 < this.field_2529.size(); var4++) {
            if (var1.getX() > this.field_2530
               && var1.getX() < this.field_2530 + this.field_2532
               && var1.getY() > var12
               && var1.getY() < var12 + this.field_2533) {
               this.field_2535 = var4;
               this.field_2523 = -1;
               break;
            }

            var12 += this.field_2533;
            if (var12 >= this.field_2534) {
               break;
            }
         }

         for (int var13 = 0; var13 < this.field_2537.length; var13++) {
            if (var1.getX() > this.field_2536
               && var1.getX() < this.field_2536 + this.field_2538
               && var1.getY() > this.field_2537[var13]
               && var1.getY() < this.field_2537[var13] + this.field_2539) {
               switch (var13) {
                  case 0:
                     if (this.field_2540 > 0) {
                        this.field_2540--;
                     }
                     break;
                  case 1:
                     if (this.field_2529.size() - this.field_2540 > (this.field_2534 - this.field_2531) / this.field_2533 + 1) {
                        this.field_2540++;
                     }
               }
            }
         }

         int var14 = this.field_2548;

         for (int var5 = this.field_2560; var5 < this.field_2541.size(); var5++) {
            if (var1.getX() > this.field_2547
               && var1.getX() < this.field_2547 + this.field_2549
               && var1.getY() > var14
               && var1.getY() < var14 + this.field_2550) {
               this.field_2552 = var5;
               class_62.method_563("selectedPartySelection = " + this.field_2552);
               break;
            }

            var14 += this.field_2550;
            if (var14 >= this.field_2551) {
               break;
            }
         }

         for (int var15 = 0; var15 < this.field_2557.length; var15++) {
            if (var1.getX() > this.field_2556
               && var1.getX() < this.field_2556 + this.field_2558
               && var1.getY() > this.field_2557[var15]
               && var1.getY() < this.field_2557[var15] + this.field_2559) {
               switch (var15) {
                  case 0:
                     if (this.field_2560 > 0) {
                        this.field_2560--;
                     }
                     break;
                  case 1:
                     if (this.field_2541.size() - this.field_2560 > (this.field_2551 - this.field_2548) / this.field_2550 + 1) {
                        this.field_2560++;
                     }
               }
            }
         }

         if (var1.getX() > this.field_2561
            && var1.getX() < this.field_2561 + this.field_2563
            && var1.getY() > this.field_2562
            && var1.getY() < this.field_2562 + this.field_2564) {
            if (this.field_2535 >= 0) {
               if (!this.field_2541.contains((String)this.field_2529.elementAt(this.field_2535))) {
                  String[] var18 = ((String)this.field_2529.elementAt(this.field_2535)).split("\\|");
                  switch (this.field_2576) {
                     case 0:
                        this.method_737(class_70.method_640(var18[2], "A", this.field_2594));
                        break;
                     case 1:
                        this.method_737(class_70.method_640(var18[2], "M", this.field_2594));
                  }

                  this.field_2541.add((String)this.field_2529.elementAt(this.field_2535));
                  this.field_2542.add((byte)-1);
               }

               return;
            }

            if (this.field_2523 >= 0) {
               if (!this.field_2541.contains((String)this.field_2517.elementAt(this.field_2523))) {
                  String[] var17 = ((String)this.field_2517.elementAt(this.field_2523)).split("\\|");
                  switch (this.field_2576) {
                     case 0:
                        this.method_737(class_70.method_640(var17[2], "A", this.field_2594));
                        break;
                     case 1:
                        this.method_737(class_70.method_640(var17[2], "M", this.field_2594));
                  }

                  this.field_2541.add((String)this.field_2517.elementAt(this.field_2523));
                  this.field_2542.add((byte)-1);
               }

               return;
            }
         }

         if (var1.getX() > this.field_2565
            && var1.getX() < this.field_2565 + this.field_2567
            && var1.getY() > this.field_2566
            && var1.getY() < this.field_2566 + this.field_2568) {
            this.field_2529.clear();
            this.field_2517.clear();
            this.method_737(class_70.method_651());
         }

         if (var1.getX() > this.field_2569
            && var1.getX() < this.field_2569 + this.field_2571
            && var1.getY() > this.field_2570
            && var1.getY() < this.field_2570 + this.field_2572) {
            class_62.method_563("sorry no remove protocol yet");
            int var16 = this.field_2548;

            for (int var6 = this.field_2560; var6 < this.field_2541.size(); var6++) {
               if (this.field_2552 == var6) {
                  if ((Byte)this.field_2542.elementAt(var6) == -1 || (Byte)this.field_2542.elementAt(var6) == 0) {
                     String[] var7 = ((String)this.field_2541.elementAt(var6)).split("\\|");
                     switch (this.field_2576) {
                        case 0:
                           this.method_737(class_70.method_652(var7[2], "M", this.field_2594));
                           break;
                        case 1:
                           this.method_737(class_70.method_652(var7[2], "A", this.field_2594));
                     }
                  }

                  this.field_2541.removeElementAt(var6);
                  this.field_2542.removeElementAt(var6);
               }

               var16 += this.field_2550;
               if (var16 >= this.field_2551) {
                  break;
               }
            }
         }
      }

      if (!this.field_2481
         && var1.getX() >= this.field_2486
         && var1.getX() <= this.field_2486 + this.field_2488
         && var1.getY() >= this.field_2487
         && var1.getY() <= this.field_2487 + this.field_2489) {
         switch (this.field_2609) {
            case 3:
               switch (this.field_2576) {
                  case 0:
                     this.method_737(class_70.method_637(field_2615, this.field_2594));
                     break;
                  case 1:
                     this.method_737(class_70.method_636(field_2615, this.field_2594));
               }

               this.method_737(class_70.method_639(field_2615));
               this.field_2481 = true;
               break;
            case 4:
               switch (this.field_2576) {
                  case 0:
                     this.method_737(class_70.method_637(field_2615, this.field_2594));
                     break;
                  case 1:
                     this.method_737(class_70.method_636(field_2615, this.field_2594));
               }

               this.method_737(class_70.method_639(field_2615));
               this.field_2481 = true;
         }
      }

      if (var1.getX() >= this.field_2491
         && var1.getX() <= this.field_2491 + this.field_2493
         && var1.getY() >= this.field_2492
         && var1.getY() <= this.field_2492 + this.field_2494) {
         switch (this.field_2609) {
            case 3:
               this.field_2609 = 4;
               this.field_2605 = -1;
               this.field_2486 = this.field_2483;
               this.field_2487 = this.field_2485;
               this.field_2500 = this.field_2497;
               this.field_2501 = this.field_2499;
               this.field_2507 = "Requesting available players..";
               this.field_2529.clear();
               this.field_2517.clear();
               this.field_2541.clear();
               this.method_737(class_70.method_651());
         }
      }

      if (var1.getX() >= this.field_2500
         && var1.getX() <= this.field_2500 + this.field_2502
         && var1.getY() >= this.field_2501
         && var1.getY() <= this.field_2501 + this.field_2503) {
         this.field_2605 = -1;
         switch (this.field_2609) {
            case 3:
               this.field_2609 = 2;
               break;
            case 4:
               this.field_2541.removeAllElements();
               this.field_2542.removeAllElements();
               this.method_737(class_70.method_647(field_2615));
               this.field_2609 = 3;
               this.field_2486 = this.field_2482;
               this.field_2487 = this.field_2484;
               this.field_2500 = this.field_2496;
               this.field_2501 = this.field_2498;
         }
      }

      if (var1.getX() > this.field_2600
         && var1.getX() < this.field_2600 + this.field_2602
         && var1.getY() > this.field_2601
         && var1.getY() < this.field_2601 + this.field_2603) {
         if (this.field_2609 > 1) {
            this.method_737(class_70.method_646(field_2615));
         }

         this.field_2605 = -1;
         this.field_2475 = 5;
      } else if (var1.getX() == this.field_2596 && var1.getY() == this.field_2597 && this.field_2598 >= System.currentTimeMillis()) {
         this.method_742(var1);
         this.field_2596 = 0;
         this.field_2597 = 0;
         this.field_2598 = 0L;
      } else {
         this.field_2596 = var1.getX();
         this.field_2597 = var1.getY();
         this.field_2598 = System.currentTimeMillis() + 300L;
      }
   }

   // $VF: renamed from: f (java.awt.event.MouseEvent) void
   private void method_742(MouseEvent var1) {
      if (this.field_2609 == 2) {
         for (int var2 = 0; var2 <= (this.field_2587 - this.field_2584) / this.field_2586; var2++) {
            if (var1.getX() >= this.field_2583
               && var1.getX() <= this.field_2583 + this.field_2585
               && var1.getY() >= this.field_2584 + this.field_2586 * var2
               && var1.getY() <= this.field_2584 + this.field_2586 * var2 + this.field_2586) {
               switch (this.field_2576) {
                  case 0:
                     this.method_741((Long)this.field_2582[this.field_2576].elementAt(var2));
                     this.field_2609 = 3;
                     return;
                  case 1:
                     this.method_739((Long)this.field_2582[this.field_2576].elementAt(var2));
                     this.field_2609 = 3;
                     return;
               }
            }
         }
      }

      if (this.field_2609 == 4) {
         int var6 = this.field_2519;

         for (int var3 = this.field_2528; var3 < this.field_2517.size(); var3++) {
            if (var1.getX() > this.field_2518 && var1.getX() < this.field_2518 + this.field_2520 && var1.getY() > var6 && var1.getY() < var6 + this.field_2521) {
               class_62.method_563("invite players double click");
               if (!this.field_2541.contains((String)this.field_2517.elementAt(var3)) && this.field_2541.size() < 4) {
                  String[] var4 = ((String)this.field_2517.elementAt(var3)).split("\\|");
                  switch (this.field_2576) {
                     case 0:
                        this.method_737(class_70.method_640(var4[2], "A", this.field_2594));
                        break;
                     case 1:
                        this.method_737(class_70.method_640(var4[2], "M", this.field_2594));
                  }

                  this.field_2541.add((String)this.field_2517.elementAt(var3));
                  this.field_2542.add((byte)-1);
               }

               return;
            }

            var6 += this.field_2521;
            if (var6 >= this.field_2522) {
               break;
            }
         }

         int var7 = this.field_2531;

         for (int var8 = this.field_2540; var8 < this.field_2529.size(); var8++) {
            if (var1.getX() > this.field_2530 && var1.getX() < this.field_2530 + this.field_2532 && var1.getY() > var7 && var1.getY() < var7 + this.field_2533) {
               class_62.method_563("avail players double click");
               String[] var5 = ((String)this.field_2529.elementAt(var8)).split("\\|");
               switch (this.field_2576) {
                  case 0:
                     this.method_737(class_70.method_640(var5[2], "A", this.field_2594));
                     break;
                  case 1:
                     this.method_737(class_70.method_640(var5[2], "M", this.field_2594));
               }

               this.field_2541.add((String)this.field_2529.elementAt(var8));
               this.field_2542.add((byte)-1);
               return;
            }

            var7 += this.field_2533;
            if (var7 >= this.field_2534) {
               break;
            }
         }
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   @Override
   public void method_678(MouseEvent var1) {
      this.field_2605 = -1;
      if (var1.getX() > this.field_2600
         && var1.getX() < this.field_2600 + this.field_2602
         && var1.getY() > this.field_2601
         && var1.getY() < this.field_2601 + this.field_2603) {
         this.field_2605 = 0;
      } else {
         if (this.field_2609 == 3) {
            if (!this.field_2481
               && var1.getX() >= this.field_2606[1]
               && var1.getX() <= this.field_2606[1] + this.field_2488
               && var1.getY() >= this.field_2607[1]
               && var1.getY() <= this.field_2607[1] + this.field_2489) {
               this.field_2605 = 1;
               return;
            }

            if (var1.getX() >= this.field_2606[2]
               && var1.getX() <= this.field_2606[2] + this.field_2493
               && var1.getY() >= this.field_2607[2]
               && var1.getY() <= this.field_2607[2] + this.field_2494) {
               this.field_2605 = 2;
               return;
            }

            if (var1.getX() >= this.field_2606[3]
               && var1.getX() <= this.field_2606[3] + this.field_2502
               && var1.getY() >= this.field_2607[3]
               && var1.getY() <= this.field_2607[3] + this.field_2503) {
               this.field_2605 = 3;
               return;
            }
         }

         if (this.field_2609 == 4) {
            if (!this.field_2481
               && var1.getX() >= this.field_2606[7]
               && var1.getX() <= this.field_2606[7] + this.field_2488
               && var1.getY() >= this.field_2607[7]
               && var1.getY() <= this.field_2607[7] + this.field_2489) {
               this.field_2605 = 7;
               return;
            }

            if (var1.getX() >= this.field_2606[4]
               && var1.getX() <= this.field_2606[4] + this.field_2493
               && var1.getY() >= this.field_2607[4]
               && var1.getY() <= this.field_2607[4] + this.field_2494) {
               this.field_2605 = 4;
               return;
            }

            if (var1.getX() >= this.field_2606[8]
               && var1.getX() <= this.field_2606[8] + this.field_2502
               && var1.getY() >= this.field_2607[8]
               && var1.getY() <= this.field_2607[8] + this.field_2503) {
               this.field_2605 = 8;
               return;
            }

            if (var1.getX() > this.field_2565
               && var1.getX() < this.field_2565 + this.field_2567
               && var1.getY() > this.field_2566
               && var1.getY() < this.field_2566 + this.field_2568) {
               this.field_2605 = 5;
               return;
            }

            if (var1.getX() > this.field_2569
               && var1.getX() < this.field_2569 + this.field_2571
               && var1.getY() > this.field_2570
               && var1.getY() < this.field_2570 + this.field_2572) {
               this.field_2605 = 6;
               return;
            }
         }
      }
   }

   // $VF: renamed from: c (java.awt.event.MouseEvent) void
   @Override
   public void method_679(MouseEvent var1) {
   }

   // $VF: renamed from: d (java.awt.event.MouseEvent) void
   @Override
   public void method_680(MouseEvent var1) {
   }

   // $VF: renamed from: e (java.awt.event.MouseEvent) void
   @Override
   public void method_681(MouseEvent var1) {
   }

   // $VF: renamed from: a (java.awt.event.KeyEvent) void
   @Override
   public void method_682(KeyEvent var1) {
   }

   // $VF: renamed from: b (java.awt.event.KeyEvent) void
   @Override
   public void method_683(KeyEvent var1) {
   }

   // $VF: renamed from: c (java.awt.event.KeyEvent) void
   @Override
   public void method_684(KeyEvent var1) {
   }
}
