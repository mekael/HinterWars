import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: c
public class class_81 extends class_74 {
   // $VF: renamed from: b aa
   private class_57 field_2684;
   // $VF: renamed from: c javax.swing.Icon
   private Icon field_2685;
   // $VF: renamed from: d byte
   private byte field_2686;
   // $VF: renamed from: e int
   private int field_2687;
   // $VF: renamed from: f byte
   private final byte field_2688 = 0;
   // $VF: renamed from: g byte
   private final byte field_2689 = 1;
   // $VF: renamed from: h byte
   private final byte field_2690 = 2;
   // $VF: renamed from: i byte
   private final byte field_2691 = 3;
   // $VF: renamed from: j byte
   private final byte field_2692 = 4;
   // $VF: renamed from: k byte
   private final byte field_2693 = 5;
   // $VF: renamed from: l javax.swing.Icon
   private Icon field_2694;
   // $VF: renamed from: m int
   private int field_2695;
   // $VF: renamed from: n int
   private int field_2696;
   // $VF: renamed from: o javax.swing.Icon
   private Icon field_2697;
   // $VF: renamed from: p java.lang.String
   private String field_2698;
   // $VF: renamed from: q java.lang.String
   private String field_2699;
   // $VF: renamed from: r int
   private int field_2700;
   // $VF: renamed from: s int
   private int field_2701;
   // $VF: renamed from: t javax.swing.Icon[]
   private Icon[] field_2702;
   // $VF: renamed from: u int
   private int field_2703;
   // $VF: renamed from: v byte
   private final byte field_2704 = 0;
   // $VF: renamed from: w int[]
   private int[] field_2705;
   // $VF: renamed from: x int
   private int field_2706;
   // $VF: renamed from: y int[]
   private int[] field_2707;
   // $VF: renamed from: z int
   private int field_2708;
   // $VF: renamed from: A java.util.Vector
   private Vector field_2709;
   // $VF: renamed from: B java.lang.String
   private String field_2710;
   // $VF: renamed from: C java.lang.String
   private String field_2711;
   // $VF: renamed from: D java.lang.String
   private String field_2712;
   // $VF: renamed from: E long
   private long field_2713;
   // $VF: renamed from: F int[]
   private int[] field_2714;
   // $VF: renamed from: G int[]
   private int[] field_2715;
   // $VF: renamed from: H int
   private int field_2716;
   // $VF: renamed from: I int
   private int field_2717;
   // $VF: renamed from: J ak
   private class_87 field_2718;
   // $VF: renamed from: K int
   private int field_2719;
   // $VF: renamed from: L int
   private int field_2720;
   // $VF: renamed from: M int
   private int field_2721;
   // $VF: renamed from: N int
   private int field_2722;
   // $VF: renamed from: O javax.swing.Icon
   private Icon field_2723;
   // $VF: renamed from: P int
   private int field_2724;
   // $VF: renamed from: Q int
   private int field_2725;
   // $VF: renamed from: R java.util.Vector
   private Vector field_2726;
   // $VF: renamed from: S javax.swing.Icon
   private Icon field_2727;
   // $VF: renamed from: T int
   private int field_2728;
   // $VF: renamed from: U int
   private int field_2729;
   // $VF: renamed from: V int
   private int field_2730;
   // $VF: renamed from: W javax.swing.Icon
   private Icon field_2731;
   // $VF: renamed from: X int
   private int field_2732;
   // $VF: renamed from: Y int
   private int field_2733;
   // $VF: renamed from: Z long
   private long field_2734;
   // $VF: renamed from: aa long
   private long field_2735;
   // $VF: renamed from: ab ai
   private class_63 field_2736;
   // $VF: renamed from: ac int
   private int field_2737;
   // $VF: renamed from: ad int[]
   private int[] field_2738;
   // $VF: renamed from: ae int
   private int field_2739;
   // $VF: renamed from: af int
   private int field_2740;
   // $VF: renamed from: ag javax.swing.Icon
   private Icon field_2741;
   // $VF: renamed from: ah int
   private int field_2742;
   // $VF: renamed from: ai int
   private int field_2743;
   // $VF: renamed from: aj javax.swing.Icon
   private Icon field_2744;
   // $VF: renamed from: ak int
   private int field_2745;
   // $VF: renamed from: al int
   private int field_2746;
   // $VF: renamed from: am javax.swing.Icon
   private Icon field_2747;
   // $VF: renamed from: an int
   private int field_2748;
   // $VF: renamed from: ao int
   private int field_2749;
   // $VF: renamed from: ap javax.swing.Icon
   private Icon field_2750;
   // $VF: renamed from: aq int
   private int field_2751;
   // $VF: renamed from: ar int
   private int field_2752;
   // $VF: renamed from: as javax.swing.Icon
   private Icon field_2753;
   // $VF: renamed from: at int
   private int field_2754;
   // $VF: renamed from: au int
   private int field_2755;
   // $VF: renamed from: av int
   private int field_2756;
   // $VF: renamed from: aw int
   private int field_2757;
   // $VF: renamed from: ax int[]
   private int[] field_2758;
   // $VF: renamed from: ay byte
   private final byte field_2759 = 0;
   // $VF: renamed from: az byte
   private final byte field_2760 = 1;
   // $VF: renamed from: aA int
   private int field_2761;
   // $VF: renamed from: aB int
   private int field_2762;
   // $VF: renamed from: aC javax.swing.Icon
   private Icon field_2763;
   // $VF: renamed from: aD javax.swing.Icon
   private Icon field_2764;
   // $VF: renamed from: aE int
   private int field_2765;
   // $VF: renamed from: aF javax.swing.Icon[]
   private Icon[] field_2766;
   // $VF: renamed from: aG int
   private int field_2767;
   // $VF: renamed from: aH int
   private int field_2768;
   // $VF: renamed from: aI int
   private int field_2769;
   // $VF: renamed from: aJ int
   private int field_2770;
   // $VF: renamed from: aK int
   private int field_2771;
   // $VF: renamed from: aL int
   private int field_2772;
   // $VF: renamed from: aM int
   private int field_2773;
   // $VF: renamed from: aN int
   private int field_2774;
   // $VF: renamed from: aO int
   private int field_2775;
   // $VF: renamed from: aP long
   private long field_2776;
   // $VF: renamed from: aQ int
   private final int field_2777 = 300;
   // $VF: renamed from: a GameStates
   GameStates field_2778;

   public class_81(GameStates var1) {
      this.field_2686 = 0;
      this.field_2778 = var1;
   }

   // $VF: renamed from: a (aa, long) void
   @Override
   public void method_670(class_57 var1, long var2) {
      class_62.method_563("CafeState(enterState): Initiating initial cafe settings.");
      this.field_2684 = var1;
      this.field_2686 = 17;
      switch (GameStates.field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            class_62.method_563("CafeState(enterState): Human Colony Cafe detected, setting cafe host and background");
            this.field_2685 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 647)));
            this.field_2694 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 655)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            class_62.method_563("CafeState(enterState): Firan Colony Cafe detected, setting cafe host and background");
            this.field_2685 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1168)));
            this.field_2694 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1169)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            class_62.method_563("CafeState(enterState): Taikuus Colony Cafe detected, setting cafe host and background");
            this.field_2685 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1074)));
            this.field_2694 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1075)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            class_62.method_563("CafeState(enterState): Brucian Colony Cafe detected, setting cafe host and background");
            this.field_2685 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1175)));
            this.field_2694 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1176)));
      }

      this.field_2695 = var1.method_502("en", 656);
      this.field_2696 = var1.method_502("en", 657);
      this.field_2687 = 0;
      this.field_2766 = new Icon[4];
      this.field_2766[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1224)));
      this.field_2766[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1231)));
      this.field_2766[2] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1232)));
      this.field_2766[3] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1233)));
      this.field_2767 = 0;
      this.field_2768 = 0;
      this.field_2769 = -1;
      this.field_2697 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 658)));
      this.field_2698 = "";
      this.field_2699 = "";
      class_62.method_563("str is empty");
      this.field_2700 = var1.method_502("en", 659);
      this.field_2701 = var1.method_502("en", 660);
      this.field_2702 = new Icon[1];
      this.field_2702[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 648)));
      this.field_2703 = 0;
      this.field_2705 = var1.method_503("en", 651);
      this.field_2706 = var1.method_502("en", 652);
      this.field_2707 = var1.method_503("en", 653);
      this.field_2708 = var1.method_502("en", 654);
      this.field_2714 = new int[2];
      this.field_2714[0] = 99;
      this.field_2714[1] = 250;
      this.field_2715 = new int[2];
      this.field_2715[0] = 140;
      this.field_2715[1] = 325;
      this.field_2716 = 137;
      this.field_2717 = 166;
      this.field_2709 = new Vector();
      this.field_2710 = var1.method_504("en", 661);
      this.field_2711 = var1.method_505("en", 662);
      this.field_2712 = var1.method_505("en", 663);
      this.field_2718 = new class_87();
      this.field_2718.method_804((byte)-1);
      this.field_2719 = 452;
      this.field_2720 = 259;
      this.field_2721 = 241;
      this.field_2722 = 10;
      this.field_2723 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 670)));
      this.field_2724 = var1.method_502("en", 671);
      this.field_2725 = var1.method_502("en", 672);
      this.field_2726 = new Vector();
      this.field_2727 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 673)));
      this.field_2730 = this.field_2727.getIconHeight() + 3;
      this.field_2731 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 674)));
      this.field_2732 = var1.method_502("en", 675);
      this.field_2733 = var1.method_502("en", 676);
      this.field_2736 = new class_63();
      this.field_2736
         .method_567(
            var1.method_502("en", 677),
            var1.method_502("en", 678),
            var1.method_502("en", 679),
            var1.method_502("en", 680),
            MastersOfDestiny.field_2808,
            MastersOfDestiny.field_2809
         );
      this.field_2737 = var1.method_502("en", 681);
      this.field_2738 = var1.method_503("en", 682);
      this.field_2739 = var1.method_502("en", 683);
      this.field_2740 = var1.method_502("en", 684);
      this.field_2741 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 688)));
      this.field_2742 = var1.method_502("en", 689);
      this.field_2743 = var1.method_502("en", 690);
      this.field_2744 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 691)));
      this.field_2745 = var1.method_502("en", 692);
      this.field_2746 = var1.method_502("en", 693);
      this.field_2747 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 685)));
      this.field_2748 = var1.method_502("en", 686);
      this.field_2749 = var1.method_502("en", 687);
      this.field_2750 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 694)));
      this.field_2751 = var1.method_502("en", 695);
      this.field_2752 = var1.method_502("en", 696);
      this.field_2753 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 668)));
      this.field_2754 = this.field_2714[0] - 2;
      this.field_2755 = this.field_2715[0] - 2;
      this.field_2756 = 0;
      this.field_2757 = var1.method_502("en", 664);
      this.field_2758 = var1.method_503("en", 665);
      this.field_2761 = var1.method_502("en", 666);
      this.field_2762 = var1.method_502("en", 667);
      this.field_2763 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1365)));
      this.field_2764 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1366)));
      this.field_2765 = 0;
      this.field_2770 = var1.method_502("en", 1234);
      this.field_2771 = var1.method_502("en", 438);
      this.field_2772 = var1.method_502("en", 439);
      this.field_2773 = var1.method_502("en", 440);
      this.method_756(class_71.method_653());
      class_62.method_563(class_71.method_653());
   }

   // $VF: renamed from: b (aa, long) int
   @Override
   public int method_671(class_57 var1, long var2) {
      return this.field_2686;
   }

   // $VF: renamed from: a (byte) void
   @Override
   public void method_672(byte var1) {
      this.field_2686 = var1;
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_673(Graphics var1, MastersOfDestiny var2) {
      this.field_2685.paintIcon(var2, var1, 0, 0);
      this.field_2702[this.field_2703].paintIcon(var2, var1, this.field_2705[this.field_2703], this.field_2706);
      switch (this.field_2703) {
         case 0:
            switch (this.field_2687) {
               case 0:
                  this.field_2694.paintIcon(var2, var1, this.field_2695, this.field_2696);
                  this.field_2697.paintIcon(var2, var1, this.field_2700, this.field_2701);
                  var1.setColor(new Color(5066061));
                  var1.setFont(MastersOfDestiny.field_2814);
                  var1.drawString(
                     this.field_2698,
                     this.field_2700 + 20,
                     this.field_2701 + MastersOfDestiny.field_2815.getHeight() / 2 + MastersOfDestiny.field_2815.getHeight()
                  );
                  var1.drawString(
                     this.field_2699,
                     this.field_2700 + 20,
                     this.field_2701 + MastersOfDestiny.field_2815.getHeight() / 2 + MastersOfDestiny.field_2815.getHeight() * 2
                  );
                  if (this.field_2709.size() > 0) {
                     var1.setColor(Color.WHITE);
                     var1.setFont(MastersOfDestiny.field_2810);
                     int var18 = this.field_2756 * this.field_2714.length;

                     for (int var22 = 0; var22 < this.field_2715.length; var22++) {
                        for (int var26 = 0; var26 < this.field_2714.length; var26++) {
                           if (var18 < this.field_2709.size()) {
                              ((class_13)this.field_2709.elementAt(var18)).method_116().paintIcon(var2, var1, this.field_2714[var26], this.field_2715[var22]);
                              var1.drawString(
                                 ((class_13)this.field_2709.elementAt(var18)).method_113(),
                                 this.field_2714[var26]
                                    + ((class_13)this.field_2709.elementAt(var18)).method_114()
                                    - MastersOfDestiny.field_2811.stringWidth(((class_13)this.field_2709.elementAt(var18)).method_113()) / 2,
                                 this.field_2715[var22] + ((class_13)this.field_2709.elementAt(var18)).method_115()
                              );
                              var18++;
                           }
                        }
                     }

                     this.field_2753.paintIcon(var2, var1, this.field_2754, this.field_2755);
                  }
                  break;
               case 1:
                  class_13 var17 = null;
                  Enumeration var4 = this.field_2709.elements();

                  while (var4.hasMoreElements()) {
                     var17 = (class_13)var4.nextElement();
                     if (var17.method_112() == this.field_2713) {
                        break;
                     }
                  }

                  if (var17 != null) {
                     var17.method_117().paintIcon(var2, var1, this.field_2695, this.field_2696);
                     this.field_2723.paintIcon(var2, var1, this.field_2724, this.field_2725);
                     int var19 = 0;
                     if (this.field_2726.size() <= 4) {
                        var19 = this.field_2725
                           + (
                                 this.field_2723.getIconHeight()
                                    - (
                                       this.field_2718.field_2999
                                          - var1.getFontMetrics().getHeight()
                                          + this.field_2726.size() * (this.field_2727.getIconHeight() + 3)
                                    )
                              )
                              / 2;
                     } else {
                        var19 = this.field_2725
                           + (
                                 this.field_2723.getIconHeight()
                                    - (this.field_2718.field_2999 - var1.getFontMetrics().getHeight() + 4 * (this.field_2727.getIconHeight() + 3))
                              )
                              / 2;
                     }

                     var1.setColor(new Color(5066061));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString(var17.method_113() + ":", this.field_2719, var19);
                     this.field_2718.field_2996 = var19 + var1.getFontMetrics().getHeight();
                     var1.setColor(new Color(5066061));
                     var1.setFont(MastersOfDestiny.field_2808);
                     this.field_2718.method_793(var1, var2);
                     this.field_2728 = this.field_2724 + this.field_2723.getIconWidth() / 2 - this.field_2727.getIconWidth() / 2;
                     this.field_2729 = this.field_2718.field_2996 + this.field_2718.field_2999 - var1.getFontMetrics().getHeight();
                     int var24 = this.field_2729;
                     Enumeration var29 = this.field_2726.elements();
                     if (this.field_2726.size() <= 4) {
                        while (var29.hasMoreElements()) {
                           String[] var35 = var29.nextElement().toString().split("\\|");
                           this.field_2727.paintIcon(var2, var1, this.field_2728, var24);
                           var1.drawString(
                              var35[0],
                              this.field_2728 + this.field_2727.getIconWidth() / 2 - var1.getFontMetrics().stringWidth(var35[0]) / 2,
                              var24 + 2 * (this.field_2727.getIconHeight() / 3)
                           );
                           var24 += this.field_2730;
                        }
                     } else {
                        int var34 = this.field_2728 + this.field_2727.getIconWidth() + 10;
                        int var38 = this.field_2729 + 2;
                        int var40 = this.field_2729 + 3 * this.field_2730 + 5;
                        this.field_2763.paintIcon(var2, var1, var34, var38);
                        this.field_2764.paintIcon(var2, var1, var34, var40);

                        for (int var41 = 0; var29.hasMoreElements(); var41++) {
                           String var12 = var29.nextElement().toString();
                           if (var41 >= this.field_2765 && var41 < this.field_2765 + 4) {
                              String[] var13 = var12.split("\\|");
                              class_62.method_563(var12);
                              this.field_2727.paintIcon(var2, var1, this.field_2728, var24);
                              var1.drawString(
                                 var13[0],
                                 this.field_2728 + this.field_2727.getIconWidth() / 2 - var1.getFontMetrics().stringWidth(var13[0]) / 2,
                                 var24 + 2 * (this.field_2727.getIconHeight() / 3)
                              );
                              var24 += this.field_2730;
                           }
                        }
                     }
                  }

                  if (this.field_2709.size() > 0) {
                     var1.setColor(Color.WHITE);
                     var1.setFont(MastersOfDestiny.field_2810);
                     int var21 = this.field_2756 * this.field_2714.length;

                     for (int var25 = 0; var25 < this.field_2715.length; var25++) {
                        for (int var30 = 0; var30 < this.field_2714.length; var30++) {
                           if (var21 < this.field_2709.size()) {
                              ((class_13)this.field_2709.elementAt(var21)).method_116().paintIcon(var2, var1, this.field_2714[var30], this.field_2715[var25]);
                              var1.drawString(
                                 ((class_13)this.field_2709.elementAt(var21)).method_113(),
                                 this.field_2714[var30]
                                    + ((class_13)this.field_2709.elementAt(var21)).method_114()
                                    - MastersOfDestiny.field_2811.stringWidth(((class_13)this.field_2709.elementAt(var21)).method_113()) / 2,
                                 this.field_2715[var25] + ((class_13)this.field_2709.elementAt(var21)).method_115()
                              );
                              var21++;
                           }
                        }
                     }

                     this.field_2753.paintIcon(var2, var1, this.field_2754, this.field_2755);
                  }
                  break;
               case 2:
                  class_13 var16 = null;
                  Enumeration var5 = this.field_2709.elements();

                  while (var5.hasMoreElements()) {
                     var16 = (class_13)var5.nextElement();
                     if (var16.method_112() == this.field_2713) {
                        break;
                     }
                  }

                  if (var16 != null) {
                     var16.method_117().paintIcon(var2, var1, this.field_2695, this.field_2696);
                     this.field_2731.paintIcon(var2, var1, this.field_2732, this.field_2733);
                     var1.setColor(new Color(5066061));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString(var16.method_113() + ":", this.field_2736.field_1664 - 5, this.field_2736.field_1665 - var1.getFontMetrics().getHeight());
                     this.field_2736.method_572(var1, var2);
                     this.field_2741.paintIcon(var2, var1, this.field_2742, this.field_2743);
                     this.field_2744.paintIcon(var2, var1, this.field_2745, this.field_2746);
                  }

                  if (this.field_2709.size() > 0) {
                     var1.setColor(Color.WHITE);
                     var1.setFont(MastersOfDestiny.field_2810);
                     int var23 = this.field_2756 * this.field_2714.length;

                     for (int var28 = 0; var28 < this.field_2715.length; var28++) {
                        for (int var33 = 0; var33 < this.field_2714.length; var33++) {
                           if (var23 < this.field_2709.size()) {
                              ((class_13)this.field_2709.elementAt(var23)).method_116().paintIcon(var2, var1, this.field_2714[var33], this.field_2715[var28]);
                              var1.drawString(
                                 ((class_13)this.field_2709.elementAt(var23)).method_113(),
                                 this.field_2714[var33]
                                    + ((class_13)this.field_2709.elementAt(var23)).method_114()
                                    - MastersOfDestiny.field_2811.stringWidth(((class_13)this.field_2709.elementAt(var23)).method_113()) / 2,
                                 this.field_2715[var28] + ((class_13)this.field_2709.elementAt(var23)).method_115()
                              );
                              var23++;
                           }
                        }
                     }

                     this.field_2753.paintIcon(var2, var1, this.field_2754, this.field_2755);
                  }
                  break;
               case 3:
                  class_13 var15 = null;
                  Enumeration var6 = this.field_2709.elements();

                  while (var6.hasMoreElements()) {
                     var15 = (class_13)var6.nextElement();
                     if (var15.method_112() == this.field_2713) {
                        break;
                     }
                  }

                  if (var15 != null) {
                     var15.method_117().paintIcon(var2, var1, this.field_2695, this.field_2696);
                     this.field_2731.paintIcon(var2, var1, this.field_2732, this.field_2733);
                     var1.setColor(new Color(5066061));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString(var15.method_113() + ":", this.field_2736.field_1664 - 5, this.field_2736.field_1665 - var1.getFontMetrics().getHeight());
                     this.field_2736.method_572(var1, var2);
                     this.field_2747.paintIcon(var2, var1, this.field_2748, this.field_2749);
                  }

                  if (this.field_2709.size() > 0) {
                     var1.setColor(Color.WHITE);
                     var1.setFont(MastersOfDestiny.field_2810);
                     int var27 = this.field_2756 * this.field_2714.length;

                     for (int var32 = 0; var32 < this.field_2715.length; var32++) {
                        for (int var37 = 0; var37 < this.field_2714.length; var37++) {
                           if (var27 < this.field_2709.size()) {
                              ((class_13)this.field_2709.elementAt(var27)).method_116().paintIcon(var2, var1, this.field_2714[var37], this.field_2715[var32]);
                              var1.drawString(
                                 ((class_13)this.field_2709.elementAt(var27)).method_113(),
                                 this.field_2714[var37]
                                    + ((class_13)this.field_2709.elementAt(var27)).method_114()
                                    - MastersOfDestiny.field_2811.stringWidth(((class_13)this.field_2709.elementAt(var27)).method_113()) / 2,
                                 this.field_2715[var32] + ((class_13)this.field_2709.elementAt(var27)).method_115()
                              );
                              var27++;
                           }
                        }
                     }

                     this.field_2753.paintIcon(var2, var1, this.field_2754, this.field_2755);
                  }
                  break;
               case 4:
                  class_13 var14 = null;
                  Enumeration var7 = this.field_2709.elements();

                  while (var7.hasMoreElements()) {
                     var14 = (class_13)var7.nextElement();
                     if (var14.method_112() == this.field_2713) {
                        break;
                     }
                  }

                  if (var14 != null) {
                     var14.method_117().paintIcon(var2, var1, this.field_2695, this.field_2696);
                     this.field_2750.paintIcon(var2, var1, this.field_2751, this.field_2752);
                     var1.setColor(new Color(5066061));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString("You have accepted the quest.", this.field_2751 + 10, this.field_2752 + 10 + var1.getFontMetrics().getHeight());
                     var1.drawString("Please check your updated quest log.", this.field_2751 + 10, this.field_2752 + 10 + var1.getFontMetrics().getHeight() * 2);
                  }

                  if (this.field_2709.size() > 0) {
                     var1.setColor(Color.WHITE);
                     var1.setFont(MastersOfDestiny.field_2810);
                     int var31 = this.field_2756 * this.field_2714.length;

                     for (int var36 = 0; var36 < this.field_2715.length; var36++) {
                        for (int var39 = 0; var39 < this.field_2714.length; var39++) {
                           if (var31 < this.field_2709.size()) {
                              ((class_13)this.field_2709.elementAt(var31)).method_116().paintIcon(var2, var1, this.field_2714[var39], this.field_2715[var36]);
                              var1.drawString(
                                 ((class_13)this.field_2709.elementAt(var31)).method_113(),
                                 this.field_2714[var39]
                                    + ((class_13)this.field_2709.elementAt(var31)).method_114()
                                    - MastersOfDestiny.field_2811.stringWidth(((class_13)this.field_2709.elementAt(var31)).method_113()) / 2,
                                 this.field_2715[var36] + ((class_13)this.field_2709.elementAt(var31)).method_115()
                              );
                              var31++;
                           }
                        }
                     }

                     this.field_2753.paintIcon(var2, var1, this.field_2754, this.field_2755);
                  }
                  break;
               case 5:
                  class_13 var3 = null;
                  Enumeration var8 = this.field_2709.elements();

                  while (var8.hasMoreElements()) {
                     var3 = (class_13)var8.nextElement();
                     if (var3.method_112() == this.field_2713) {
                        break;
                     }
                  }

                  if (var3 != null) {
                     var3.method_117().paintIcon(var2, var1, this.field_2695, this.field_2696);
                     this.field_2750.paintIcon(var2, var1, this.field_2751, this.field_2752);
                     var1.setColor(new Color(5066061));
                     var1.setFont(MastersOfDestiny.field_2810);
                     var1.drawString("You are already undertaking.", this.field_2751 + 10, this.field_2752 + 10 + var1.getFontMetrics().getHeight());
                     var1.drawString("this quest.", this.field_2751 + 10, this.field_2752 + 10 + var1.getFontMetrics().getHeight() * 2);
                  }

                  if (this.field_2709.size() > 0) {
                     var1.setColor(Color.WHITE);
                     var1.setFont(MastersOfDestiny.field_2810);
                     int var9 = this.field_2756 * this.field_2714.length;

                     for (int var10 = 0; var10 < this.field_2715.length; var10++) {
                        for (int var11 = 0; var11 < this.field_2714.length; var11++) {
                           if (var9 < this.field_2709.size()) {
                              ((class_13)this.field_2709.elementAt(var9)).method_116().paintIcon(var2, var1, this.field_2714[var11], this.field_2715[var10]);
                              var1.drawString(
                                 ((class_13)this.field_2709.elementAt(var9)).method_113(),
                                 this.field_2714[var11]
                                    + ((class_13)this.field_2709.elementAt(var9)).method_114()
                                    - MastersOfDestiny.field_2811.stringWidth(((class_13)this.field_2709.elementAt(var9)).method_113()) / 2,
                                 this.field_2715[var10] + ((class_13)this.field_2709.elementAt(var9)).method_115()
                              );
                              var9++;
                           }
                        }
                     }

                     this.field_2753.paintIcon(var2, var1, this.field_2754, this.field_2755);
                  }
            }
         default:
            if (this.field_2769 != -1) {
               this.field_2766[this.field_2769].paintIcon(var2, var1, this.field_2767, this.field_2768);
            }
      }
   }

   // $VF: renamed from: a (int, java.lang.Object) void
   @Override
   public void method_674(int var1, Object var2) {
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_675(String[] var1) {
      class_62.method_563("CafeState(processServerMessage): Received server message");
      switch (class_71.method_618(var1)) {
         case -1:
            this.method_756(class_68.method_622(Long.toString(class_57.field_1525), this.field_2684.field_1526));
         case 0:
         default:
            break;
         case 1:
            class_62.method_563("CafeState(processServerMessage): Cafe is closed");
            this.field_2698 = "Sorry, adventurer.";
            this.field_2699 = "Our cafe is closed for the day.";
            break;
         case 2:
            class_62.method_563("CafeState(processServerMessage): Cafe is open");
            this.field_2698 = "Welcome, adventurer.";
            this.field_2699 = "How may I serve you?";
            break;
         case 3:
            class_62.method_563("CafeState(processServerMessage): NPC presence detected");
            class_62.method_563("CafeState(processServerMessage): Name =>" + var1[2]);
            class_62.method_563("CafeState(processServerMessage): Image ID =>" + var1[3]);
            class_62.method_563("CafeState(processServerMessage): " + this.field_2710 + var1[3] + this.field_2711);
            class_62.method_563("CafeState(processServerMessage): " + this.field_2710 + var1[3] + this.field_2712);
            this.field_2709
               .add(
                  this.field_2684
                     .field_1544
                     .method_614(Long.parseLong(var1[1]), var1[2], this.field_2710 + var1[3] + this.field_2711, this.field_2710 + var1[3] + this.field_2712)
               );
            break;
         case 4:
            class_62.method_563("CafeState(processServerMessage): Conversation received");
            class_62.method_563("CafeState(processServerMessage): Server Message=>" + var1[0] + "|" + var1[1]);
            class_62.method_563("CafeState(processServerMessage): Conversation Number" + var1[1]);
            String var2 = this.field_2684.field_1544.method_615(Long.parseLong(var1[1]));
            this.field_2718.method_805(var2, this.field_2719, this.field_2720, this.field_2721, this.field_2722, MastersOfDestiny.field_2809, null);
            break;
         case 5:
            String var3 = this.field_2684.field_1544.method_616(Long.parseLong(var1[1]));
            class_62.method_563(var3);
            class_62.method_563("CafeState(processServerMessage): Quest Trigger Type =>" + var3);
            String var4 = var3 + "|" + 2 + "|" + var1[2] + "|" + var1[3];
            if (!this.field_2726.contains(var4)) {
               this.field_2726.add(var4);
            }
            break;
         case 6:
            String var5 = this.field_2684.field_1544.method_616(Long.parseLong(var1[1]));
            class_62.method_563("CafeState(processServerMessage): Quest Trigger =>" + var5);
            String var6 = var5 + "|" + 3 + "|" + var1[1] + "|" + var1[2];
            if (!this.field_2726.contains(var6)) {
               this.field_2726.add(var6);
            }
            break;
         case 7:
            class_62.method_563("CafeState(processServerMessage): Quest accepted successfully");
            this.field_2687 = 4;
            break;
         case 8:
            class_62.method_563("CafeState(processServerMessage): Accept quest failed");
            this.field_2687 = 5;
            break;
         case 9:
            this.field_2778.field_421.method_826(this.field_2778.field_421.method_827() + Long.parseLong(var1[1]));
            GameStates.field_438 = GameStates.field_438 + Long.parseLong(var1[2]);
            break;
         case 10:
            boolean var7 = false;
            int var8 = Integer.parseInt(var1[2]);
            long var9 = Long.parseLong(var1[1]);
            boolean var11 = false;

            for (int var12 = 0; var12 < this.field_2778.field_421.field_3059.length; var12++) {
               Enumeration var13 = this.field_2778.field_421.field_3059[var12].elements();

               for (int var14 = 0; var13.hasMoreElements(); var14++) {
                  class_30 var15 = (class_30)var13.nextElement();
                  if (var15.method_234().method_179() == var9) {
                     ((class_30)this.field_2778.field_421.field_3059[var12].elementAt(var14))
                        .method_235(((class_30)this.field_2778.field_421.field_3059[var12].elementAt(var14)).method_236() + var8);
                     var11 = true;
                  }
               }
            }

            if (!var11 && var8 > 0) {
               class_29 var16 = this.field_2778.field_1275.method_177(var1[1]);
               class_30 var18 = new class_30();
               var18.method_233(var16);
               var18.method_235(var8);
               this.field_2778.field_421.field_3059[var16.method_193()].add(var18);
               var16 = null;
            }
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_756(String var1) {
      this.field_2778.method_298(var1);
   }

   // $VF: renamed from: a () void
   @Override
   public void method_676() {
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   @Override
   public void method_677(MouseEvent var1) {
      for (int var2 = 0; var2 < this.field_2702.length; var2++) {
         if (var1.getX() > this.field_2705[var2]
            && var1.getX() < this.field_2705[var2] + this.field_2707[var2]
            && var1.getY() > this.field_2706
            && var1.getY() < this.field_2706 + this.field_2708) {
            this.field_2703 = var2;
            this.field_2756 = 0;
            this.field_2754 = this.field_2714[0] - 2;
            this.field_2755 = this.field_2715[0] - 2;
            return;
         }
      }

      switch (this.field_2703) {
         case 0:
            if (this.field_2709.size() > 0) {
               int var10 = this.field_2756 * this.field_2714.length;

               for (int var3 = 0; var3 < this.field_2715.length; var3++) {
                  for (int var4 = 0; var4 < this.field_2714.length; var4++) {
                     if (var10 < this.field_2709.size()) {
                        if (var1.getX() > this.field_2714[var4]
                           && var1.getX() < this.field_2714[var4] + this.field_2716
                           && var1.getY() > this.field_2715[var3]
                           && var1.getY() < this.field_2715[var3] + this.field_2717) {
                           this.field_2754 = this.field_2714[var4] - 2;
                           this.field_2755 = this.field_2715[var3] - 2;
                           this.field_2726.clear();
                           this.field_2765 = 0;
                           this.field_2713 = ((class_13)this.field_2709.elementAt(var10)).method_112();
                           this.method_756(class_71.method_655(this.field_2713));
                           this.field_2687 = 1;
                        }

                        var10++;
                     }
                  }
               }
            }

            for (int var11 = 0; var11 < this.field_2758.length; var11++) {
               if (var1.getX() > this.field_2757
                  && var1.getX() < this.field_2757 + this.field_2761
                  && var1.getY() > this.field_2758[var11]
                  && var1.getY() < this.field_2758[var11] + this.field_2762) {
                  switch (var11) {
                     case 0:
                        if (this.field_2756 > 0) {
                           this.field_2756--;
                        }

                        return;
                     case 1:
                        if (this.field_2714.length * (this.field_2756 + this.field_2715.length) < this.field_2709.size()) {
                           this.field_2756++;
                        }

                        return;
                  }
               }
            }

            switch (this.field_2687) {
               case 0:
               default:
                  break;
               case 1:
                  if (this.field_2726.size() <= 4) {
                     for (int var14 = 0; var14 < this.field_2726.size(); var14++) {
                        if (var1.getX() > this.field_2728
                           && var1.getX() < this.field_2728 + this.field_2727.getIconWidth()
                           && var1.getY() > this.field_2729 + var14 * this.field_2730
                           && var1.getY() < this.field_2729 + var14 * this.field_2730 + this.field_2727.getIconHeight()) {
                           String[] var16 = ((String)this.field_2726.elementAt(var14)).split("\\|");
                           this.field_2687 = Byte.parseByte(var16[1]);
                           this.field_2769 = -1;
                           String var18 = null;
                           switch (this.field_2687) {
                              case 2:
                                 this.field_2735 = Long.parseLong(var16[2]);
                                 long var5 = Long.parseLong(var16[3]);
                                 class_62.method_563("CafeState(mouseClicked): Selected Quest ID =>" + this.field_2735);
                                 class_62.method_563("CafeState(mouseClicked): Selected SubQuest ID =>" + var5);
                                 var18 = this.field_2684.field_1544.method_617(var5);
                                 break;
                              case 3:
                                 this.field_2734 = Long.parseLong(var16[2]);
                                 this.field_2735 = Long.parseLong(var16[3]);
                                 var18 = this.field_2684.field_1544.method_617(this.field_2735);
                           }

                           this.field_2736.method_570();
                           this.field_2736.method_569(var18.substring(0, var18.length() - 1), 5066061, 5066061);
                           this.field_2736.method_571((byte)2);
                           return;
                        }
                     }
                  } else {
                     int var15 = this.field_2728 + this.field_2727.getIconWidth() + 10;
                     int var17 = this.field_2729 + 2;
                     int var19 = this.field_2729 + 3 * this.field_2730 + 5;
                     if (var1.getX() >= var15
                        && var1.getX() <= var15 + this.field_2763.getIconWidth()
                        && var1.getY() >= var17
                        && var1.getY() <= var17 + this.field_2763.getIconHeight()) {
                        if (this.field_2765 > 0) {
                           this.field_2765--;
                        }

                        return;
                     } else if (var1.getX() >= var15
                        && var1.getX() <= var15 + this.field_2764.getIconWidth()
                        && var1.getY() >= var19
                        && var1.getY() <= var19 + this.field_2764.getIconHeight()) {
                        if (this.field_2765 + 4 < this.field_2726.size()) {
                           this.field_2765++;
                        }

                        return;
                     } else {
                        for (int var20 = 0; var20 < 4; var20++) {
                           if (var1.getX() > this.field_2728
                              && var1.getX() < this.field_2728 + this.field_2727.getIconWidth()
                              && var1.getY() > this.field_2729 + var20 * this.field_2730
                              && var1.getY() < this.field_2729 + var20 * this.field_2730 + this.field_2727.getIconHeight()) {
                              String[] var6 = ((String)this.field_2726.elementAt(var20 + this.field_2765)).split("\\|");
                              this.field_2687 = Byte.parseByte(var6[1]);
                              this.field_2769 = -1;
                              String var7 = null;
                              switch (this.field_2687) {
                                 case 2:
                                    this.field_2735 = Long.parseLong(var6[2]);
                                    long var8 = Long.parseLong(var6[3]);
                                    class_62.method_563("CafeState(mouseClicked): Selected Quest ID =>" + this.field_2735);
                                    class_62.method_563("CafeState(mouseClicked): Selected SubQuest ID =>" + var8);
                                    var7 = this.field_2684.field_1544.method_617(var8);
                                    break;
                                 case 3:
                                    this.field_2734 = Long.parseLong(var6[2]);
                                    this.field_2735 = Long.parseLong(var6[3]);
                                    var7 = this.field_2684.field_1544.method_617(this.field_2735);
                              }

                              this.field_2736.method_570();
                              this.field_2736.method_569(var7.substring(0, var7.length() - 1), 5066061, 5066061);
                              this.field_2736.method_571((byte)2);
                              return;
                           }
                        }
                     }
                  }
                  break;
               case 2:
                  for (int var13 = 0; var13 < this.field_2738.length; var13++) {
                     if (var1.getX() > this.field_2737
                        && var1.getX() < this.field_2737 + this.field_2739
                        && var1.getY() > this.field_2738[var13]
                        && var1.getY() < this.field_2738[var13] + this.field_2740) {
                        switch (var13) {
                           case 0:
                              this.field_2736.method_571((byte)0);
                              return;
                           case 1:
                              this.field_2736.method_571((byte)1);
                              return;
                        }
                     }
                  }

                  if (var1.getX() > this.field_2742
                     && var1.getX() < this.field_2742 + this.field_2741.getIconWidth()
                     && var1.getY() > this.field_2743
                     && var1.getY() < this.field_2743 + this.field_2741.getIconHeight()) {
                     this.method_756(class_71.method_656(this.field_2735));
                     this.field_2769 = -1;
                  }

                  if (var1.getX() > this.field_2745
                     && var1.getX() < this.field_2745 + this.field_2744.getIconWidth()
                     && var1.getY() > this.field_2746
                     && var1.getY() < this.field_2746 + this.field_2744.getIconHeight()) {
                     this.field_2687 = 1;
                     this.field_2769 = -1;
                  }
                  break;
               case 3:
                  for (int var12 = 0; var12 < this.field_2738.length; var12++) {
                     if (var1.getX() > this.field_2737
                        && var1.getX() < this.field_2737 + this.field_2739
                        && var1.getY() > this.field_2738[var12]
                        && var1.getY() < this.field_2738[var12] + this.field_2740) {
                        switch (var12) {
                           case 0:
                              this.field_2736.method_571((byte)0);
                              return;
                           case 1:
                              this.field_2736.method_571((byte)1);
                              return;
                        }
                     }
                  }

                  if (var1.getX() > this.field_2748
                     && var1.getX() < this.field_2748 + this.field_2747.getIconWidth()
                     && var1.getY() > this.field_2749
                     && var1.getY() < this.field_2749 + this.field_2747.getIconHeight()) {
                     this.method_756(class_71.method_657(this.field_2734, this.field_2735));
                     this.field_2687 = 4;
                     this.field_2769 = -1;
                  }
                  break;
               case 4:
               case 5:
                  if (var1.getX() > this.field_2748
                     && var1.getX() < this.field_2748 + this.field_2747.getIconWidth()
                     && var1.getY() > this.field_2749
                     && var1.getY() < this.field_2749 + this.field_2747.getIconHeight()) {
                     this.field_2687 = 0;
                     this.field_2769 = -1;
                  }
            }
         default:
            if (var1.getX() > this.field_2770
               && var1.getX() < this.field_2770 + this.field_2772
               && var1.getY() > this.field_2771
               && var1.getY() < this.field_2771 + this.field_2773) {
               class_62.method_563("back to colony");
               this.field_2769 = -1;
               this.field_2686 = 5;
            }
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   @Override
   public void method_678(MouseEvent var1) {
      this.field_2769 = -1;
      if (this.field_2703 == 0) {
         if (this.field_2687 == 1) {
            if (this.field_2726.size() <= 4) {
               for (int var2 = 0; var2 < this.field_2726.size(); var2++) {
                  if (var1.getX() > this.field_2728
                     && var1.getX() < this.field_2728 + this.field_2727.getIconWidth()
                     && var1.getY() > this.field_2729 + var2 * this.field_2730
                     && var1.getY() < this.field_2729 + var2 * this.field_2730 + this.field_2727.getIconHeight()) {
                     this.field_2769 = 3;
                     this.field_2767 = this.field_2728;
                     this.field_2768 = this.field_2729 + var2 * this.field_2730;
                     return;
                  }
               }
            } else {
               for (int var3 = 0; var3 < 4; var3++) {
                  if (var1.getX() > this.field_2728
                     && var1.getX() < this.field_2728 + this.field_2727.getIconWidth()
                     && var1.getY() > this.field_2729 + var3 * this.field_2730
                     && var1.getY() < this.field_2729 + var3 * this.field_2730 + this.field_2727.getIconHeight()) {
                     this.field_2769 = 3;
                     this.field_2767 = this.field_2728;
                     this.field_2768 = this.field_2729 + var3 * this.field_2730;
                     return;
                  }
               }
            }
         } else if (this.field_2687 == 2) {
            if (var1.getX() > this.field_2742
               && var1.getX() < this.field_2742 + this.field_2741.getIconWidth()
               && var1.getY() > this.field_2743
               && var1.getY() < this.field_2743 + this.field_2741.getIconHeight()) {
               this.field_2769 = 1;
               this.field_2767 = this.field_2742;
               this.field_2768 = this.field_2743;
               return;
            }

            if (var1.getX() > this.field_2745
               && var1.getX() < this.field_2745 + this.field_2744.getIconWidth()
               && var1.getY() > this.field_2746
               && var1.getY() < this.field_2746 + this.field_2744.getIconHeight()) {
               this.field_2769 = 1;
               this.field_2767 = this.field_2745;
               this.field_2768 = this.field_2746;
               return;
            }
         } else if (this.field_2687 == 3) {
            if (var1.getX() > this.field_2748
               && var1.getX() < this.field_2748 + this.field_2747.getIconWidth()
               && var1.getY() > this.field_2749
               && var1.getY() < this.field_2749 + this.field_2747.getIconHeight()) {
               this.field_2769 = 2;
               this.field_2767 = this.field_2748;
               this.field_2768 = this.field_2749;
               return;
            }
         } else if ((this.field_2687 == 5 || this.field_2687 == 4)
            && var1.getX() > this.field_2748
            && var1.getX() < this.field_2748 + this.field_2747.getIconWidth()
            && var1.getY() > this.field_2749
            && var1.getY() < this.field_2749 + this.field_2747.getIconHeight()) {
            this.field_2769 = 2;
            this.field_2767 = this.field_2748;
            this.field_2768 = this.field_2749;
            return;
         }
      }

      if (var1.getX() > this.field_2770
         && var1.getX() < this.field_2770 + this.field_2772
         && var1.getY() > this.field_2771
         && var1.getY() < this.field_2771 + this.field_2773) {
         this.field_2769 = 0;
         this.field_2767 = this.field_2770;
         this.field_2768 = this.field_2771;
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
