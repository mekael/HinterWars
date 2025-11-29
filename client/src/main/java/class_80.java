import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: x
public class class_80 extends class_74 {
   // $VF: renamed from: k aa
   private class_57 field_2618;
   // $VF: renamed from: l byte
   private byte field_2619;
   // $VF: renamed from: m int
   private int field_2620 = 0;
   // $VF: renamed from: n int
   private int field_2621 = 1;
   // $VF: renamed from: o int
   private int field_2622 = 2;
   // $VF: renamed from: p int
   private int field_2623;
   // $VF: renamed from: q int
   private int field_2624;
   // $VF: renamed from: r int
   private int field_2625;
   // $VF: renamed from: s int[][]
   private int[][] field_2626;
   // $VF: renamed from: t java.awt.Dimension
   private Dimension field_2627;
   // $VF: renamed from: u java.awt.Dimension
   private Dimension field_2628;
   // $VF: renamed from: v java.awt.Dimension
   private Dimension field_2629;
   // $VF: renamed from: w java.awt.Dimension[]
   private Dimension[] field_2630;
   // $VF: renamed from: x java.awt.Dimension
   private Dimension field_2631;
   // $VF: renamed from: y java.awt.Dimension
   private Dimension field_2632;
   // $VF: renamed from: z java.awt.Dimension
   private Dimension field_2633;
   // $VF: renamed from: A java.awt.Dimension
   private Dimension field_2634;
   // $VF: renamed from: B int
   private int field_2635;
   // $VF: renamed from: C double
   private double field_2636;
   // $VF: renamed from: D boolean
   private boolean field_2637;
   // $VF: renamed from: E boolean
   private boolean field_2638;
   // $VF: renamed from: F boolean
   private boolean field_2639;
   // $VF: renamed from: G boolean
   private boolean field_2640;
   // $VF: renamed from: H javax.swing.Icon
   private Icon field_2641;
   // $VF: renamed from: I javax.swing.Icon
   private Icon field_2642;
   // $VF: renamed from: J javax.swing.Icon
   private Icon field_2643;
   // $VF: renamed from: K javax.swing.Icon
   private Icon field_2644;
   // $VF: renamed from: L javax.swing.Icon
   private Icon field_2645;
   // $VF: renamed from: M javax.swing.Icon
   private Icon field_2646;
   // $VF: renamed from: N javax.swing.Icon
   private Icon field_2647;
   // $VF: renamed from: O javax.swing.Icon[]
   private Icon[] field_2648;
   // $VF: renamed from: P int
   private int field_2649;
   // $VF: renamed from: Q int
   private int field_2650;
   // $VF: renamed from: R int
   private int field_2651;
   // $VF: renamed from: S int
   private int field_2652;
   // $VF: renamed from: T int
   private int field_2653;
   // $VF: renamed from: U int
   private int field_2654;
   // $VF: renamed from: V int
   private int field_2655;
   // $VF: renamed from: W int
   private int field_2656;
   // $VF: renamed from: X int
   private int field_2657;
   // $VF: renamed from: Y int
   private int field_2658;
   // $VF: renamed from: Z int
   private int field_2659;
   // $VF: renamed from: aa int
   private int field_2660;
   // $VF: renamed from: ab int
   private int field_2661;
   // $VF: renamed from: ac javax.swing.Icon
   private Icon field_2662;
   // $VF: renamed from: ad int
   private int field_2663;
   // $VF: renamed from: ae int
   private int field_2664;
   // $VF: renamed from: af int
   private int field_2665;
   // $VF: renamed from: ag int
   private int field_2666;
   // $VF: renamed from: ah int
   private int field_2667;
   // $VF: renamed from: ai int
   private int field_2668;
   // $VF: renamed from: aj boolean
   private boolean field_2669;
   // $VF: renamed from: ak java.lang.String
   private String field_2670;
   // $VF: renamed from: al int
   private int field_2671;
   // $VF: renamed from: am int
   private int field_2672;
   // $VF: renamed from: an GameStates
   private GameStates field_2673;
   // $VF: renamed from: a int
   public static final int field_2674 = 0;
   // $VF: renamed from: b int
   public static final int field_2675 = 1;
   // $VF: renamed from: c int
   public static final int field_2676 = 2;
   // $VF: renamed from: d int
   public static final int field_2677 = 3;
   // $VF: renamed from: e int
   public static final int field_2678 = 4;
   // $VF: renamed from: f int
   public static final int field_2679 = 5;
   // $VF: renamed from: g int
   public static final int field_2680 = 6;
   // $VF: renamed from: h int
   public static final int field_2681 = 7;
   // $VF: renamed from: i int
   public static final int field_2682 = 30;
   // $VF: renamed from: j int[]
   public static final int[] field_2683 = new int[]{10000, 1000, 150, 0, 75, 40, 0, 20, 10, 0, 3, 1, 0, 300, 100, 250, 150, 70, 40, 45, 0, 175, 160, 150};

   public class_80(GameStates var1) {
      this.field_2673 = var1;
   }

   // $VF: renamed from: a (aa, long) void
   @Override
   public void method_670(class_57 var1, long var2) {
      this.field_2618 = var1;
      this.field_2619 = 32;
      this.field_2626 = (int[][])(new class_17[15][15]);

      for (int var4 = 0; var4 < 15; var4++) {
         for (int var5 = 0; var5 < 15; var5++) {
            this.field_2626[var4][var5] = this.field_2620;
         }
      }

      this.field_2627 = new Dimension(97, 165);
      this.field_2628 = new Dimension(270, 270);
      this.field_2629 = new Dimension(-1, -1);
      this.field_2633 = new Dimension(-1, -1);
      this.field_2634 = new Dimension(-1, -1);
      this.method_745(18);
      this.field_2625 = 0;
      this.field_2630 = new Dimension[5];
      this.field_2630[0] = new Dimension(0, 0);
      this.field_2630[1] = new Dimension(1, 0);
      this.field_2630[2] = new Dimension(1, 1);
      this.field_2630[3] = new Dimension(0, 1);
      this.field_2630[4] = new Dimension(-1, 1);
      this.field_2624 = this.field_2621;
      this.field_2623 = this.field_2621;
      this.field_2637 = false;
      this.field_2638 = false;
      this.field_2639 = false;
      this.field_2640 = true;
      switch (GameStates.field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            this.field_2641 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1292)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            this.field_2641 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1295)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.field_2641 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1297)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            this.field_2641 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1296)));
      }

      this.field_2642 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1293)));
      this.field_2643 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1294)));
      this.field_2644 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1293)));
      this.field_2645 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1294)));
      this.field_2646 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1293)));
      this.field_2647 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1294)));
      this.field_2648 = new Icon[2];
      this.field_2648[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1224)));
      this.field_2648[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1223)));
      this.field_2649 = -1;
      this.field_2650 = 0;
      this.field_2651 = 0;
      this.field_2654 = var1.method_502("en", 1359);
      this.field_2655 = var1.method_502("en", 1360);
      this.field_2652 = var1.method_502("en", 1361);
      this.field_2653 = var1.method_502("en", 1362);
      this.field_2656 = var1.method_502("en", 1363);
      this.field_2657 = var1.method_502("en", 1364);
      this.field_2658 = var1.method_502("en", 1355);
      this.field_2659 = var1.method_502("en", 1356);
      this.field_2660 = var1.method_502("en", 1357);
      this.field_2661 = var1.method_502("en", 1358);
      this.field_2662 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1370)));
      this.field_2663 = var1.method_502("en", 1371);
      this.field_2664 = var1.method_502("en", 1372);
      this.field_2665 = var1.method_502("en", 1373);
      this.field_2666 = var1.method_502("en", 1374);
      this.field_2667 = var1.method_502("en", 1375);
      this.field_2668 = var1.method_502("en", 1376);
      this.field_2669 = false;
      this.field_2671 = 0;
      this.field_2672 = 287;
   }

   // $VF: renamed from: b (aa, long) int
   @Override
   public int method_671(class_57 var1, long var2) {
      return this.field_2619;
   }

   // $VF: renamed from: a (byte) void
   @Override
   public void method_672(byte var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_673(Graphics var1, MastersOfDestiny var2) {
      if (this.field_2638) {
         class_62.method_563("Game Pause");
         long var3 = System.currentTimeMillis();

         while (System.currentTimeMillis() - var3 < 500L) {
         }

         this.field_2638 = false;
      }

      this.field_2641.paintIcon(var2, var1, 0, 0);
      var1.setFont(MastersOfDestiny.field_2827);
      var1.setColor(Color.white);
      if (this.field_2623 == this.field_2622) {
         this.field_2644.paintIcon(var2, var1, 119, 129);
         this.field_2645.paintIcon(var2, var1, 259, 129);
      } else {
         this.field_2645.paintIcon(var2, var1, 119, 129);
         this.field_2644.paintIcon(var2, var1, 259, 129);
      }

      var1.drawString("-  " + this.field_2618.field_1528, 143, 142);
      var1.drawString("-  Computer", 279, 142);
      if (this.field_2624 == this.field_2622) {
         this.field_2646.paintIcon(var2, var1, 166, 455);
      } else {
         this.field_2647.paintIcon(var2, var1, 166, 455);
      }

      if (this.field_2624 == this.field_2623) {
         var1.drawString("Your Turn Now", 191, 469);
      } else {
         var1.drawString("Computer's Turn", 189, 469);
      }

      for (int var5 = 0; var5 < 15; var5++) {
         for (int var4 = 0; var4 < 15; var4++) {
            if (this.field_2626[var5][var4] == this.field_2621) {
               this.field_2643.paintIcon(var2, var1, this.field_2635 * var5 + this.field_2627.width + 3, this.field_2635 * var4 + this.field_2627.height + 1);
            } else if (this.field_2626[var5][var4] == this.field_2622) {
               this.field_2642.paintIcon(var2, var1, this.field_2635 * var5 + this.field_2627.width + 3, this.field_2635 * var4 + this.field_2627.height + 1);
            }
         }
      }

      if (this.field_2669) {
         this.field_2662.paintIcon(var2, var1, this.field_2663, this.field_2664);
         var1.setFont(MastersOfDestiny.field_2835);
         var1.setColor(new Color(13127326));
         var1.drawString(this.field_2670, this.field_2671, this.field_2672);
      }

      if (this.field_2649 != -1) {
         this.field_2648[this.field_2649].paintIcon(var2, var1, this.field_2650, this.field_2651);
      }

      if (this.field_2623 != this.field_2624) {
         this.field_2629 = this.method_750();
         this.field_2634.width = this.field_2629.width;
         this.field_2634.height = this.field_2629.height;
         this.method_746();
         this.field_2638 = true;
      }
   }

   // $VF: renamed from: a (int, java.lang.Object) void
   @Override
   public void method_674(int var1, Object var2) {
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_675(String[] var1) {
   }

   // $VF: renamed from: a () void
   @Override
   public void method_676() {
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   @Override
   public void method_677(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      if (!this.field_2669) {
         if (this.field_2623 == this.field_2624) {
            this.field_2629.width = (int)Math.floor((var2 - this.field_2627.width) / this.field_2636);
            this.field_2629.height = (int)Math.floor((var3 - this.field_2627.height) / this.field_2636);
            if (this.field_2629.width >= 0 && this.field_2629.width < 15 && this.field_2629.height >= 0 && this.field_2629.height < 15) {
               if (this.field_2626[this.field_2629.width][this.field_2629.height] == this.field_2620) {
                  this.field_2633.width = this.field_2629.width;
                  this.field_2633.height = this.field_2629.height;
                  this.method_746();
               }

               return;
            }
         }

         if (!this.field_2640
            && var1.getX() >= this.field_2652
            && var1.getX() <= this.field_2652 + this.field_2656
            && var1.getY() >= this.field_2653
            && var1.getY() <= this.field_2653 + this.field_2657) {
            this.field_2626[this.field_2633.width][this.field_2633.height] = this.field_2620;
            this.field_2625--;
            this.field_2626[this.field_2634.width][this.field_2634.height] = this.field_2620;
            this.field_2625--;
            return;
         }

         if (var1.getX() >= this.field_2654
            && var1.getX() <= this.field_2654 + this.field_2656
            && var1.getY() >= this.field_2655
            && var1.getY() <= this.field_2655 + this.field_2657) {
            this.field_2649 = -1;
            this.field_2619 = 19;
            return;
         }
      } else if (var1.getX() >= this.field_2665
         && var1.getX() <= this.field_2665 + this.field_2667
         && var1.getY() >= this.field_2666
         && var1.getY() <= this.field_2666 + this.field_2668) {
         this.field_2649 = -1;
         this.method_755();
         this.method_754();
         this.field_2669 = false;
      }

      if (var1.getX() >= this.field_2658
         && var1.getX() <= this.field_2658 + this.field_2660
         && var1.getY() >= this.field_2659
         && var1.getY() <= this.field_2659 + this.field_2661) {
         this.field_2649 = -1;
         this.field_2619 = 5;
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   @Override
   public void method_678(MouseEvent var1) {
      this.field_2649 = -1;
      if (!this.field_2669) {
         if (!this.field_2640
            && var1.getX() >= this.field_2652
            && var1.getX() <= this.field_2652 + this.field_2656
            && var1.getY() >= this.field_2653
            && var1.getY() <= this.field_2653 + this.field_2657) {
            this.field_2649 = 1;
            this.field_2650 = this.field_2652;
            this.field_2651 = this.field_2653;
            return;
         }

         if (var1.getX() >= this.field_2654
            && var1.getX() <= this.field_2654 + this.field_2656
            && var1.getY() >= this.field_2655
            && var1.getY() <= this.field_2655 + this.field_2657) {
            this.field_2649 = 1;
            this.field_2650 = this.field_2654;
            this.field_2651 = this.field_2655;
            return;
         }
      } else if (var1.getX() >= this.field_2665
         && var1.getX() <= this.field_2665 + this.field_2667
         && var1.getY() >= this.field_2666
         && var1.getY() <= this.field_2666 + this.field_2668) {
         this.field_2649 = 1;
         this.field_2650 = this.field_2665;
         this.field_2651 = this.field_2666;
         return;
      }

      if (var1.getX() >= this.field_2658
         && var1.getX() <= this.field_2658 + this.field_2660
         && var1.getY() >= this.field_2659
         && var1.getY() <= this.field_2659 + this.field_2661) {
         this.field_2649 = 0;
         this.field_2650 = this.field_2658;
         this.field_2651 = this.field_2659;
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

   // $VF: renamed from: a (int, int) void
   public void method_743(int var1, int var2) {
      this.field_2627.width = var1;
      this.field_2627.height = var2;
   }

   // $VF: renamed from: b (int, int) void
   public void method_744(int var1, int var2) {
      this.field_2628.width = var1;
      this.field_2628.height = var2;
   }

   // $VF: renamed from: a (int) void
   public void method_745(int var1) {
      this.field_2635 = var1;
      this.field_2636 = var1;
   }

   // $VF: renamed from: b () void
   public void method_746() {
      this.field_2626[this.field_2629.width][this.field_2629.height] = this.field_2624;
      this.field_2625++;
      this.field_2637 = false;
      boolean var1 = this.method_747();
      if (!var1) {
         this.method_753();
      }
   }

   // $VF: renamed from: c () boolean
   public boolean method_747() {
      if (this.field_2625 == 225) {
         this.field_2624 = this.field_2623;
         this.field_2670 = "Draw!";
         this.field_2671 = 199;
         this.field_2669 = true;
         return true;
      } else {
         for (int var1 = 1; var1 < 5; var1++) {
            int var2 = this.method_752(this.field_2629, this.field_2630[var1], this.field_2624);
            if (var2 >= 5) {
               if (this.field_2624 == this.field_2621) {
                  this.field_2624 = this.field_2623;
                  if (this.field_2623 == this.field_2621) {
                     this.field_2670 = "You Win!";
                     this.field_2671 = 177;
                     this.field_2669 = true;
                  } else {
                     this.field_2670 = "You Lose!";
                     this.field_2671 = 170;
                     this.field_2669 = true;
                  }
               } else if (this.field_2624 == this.field_2622) {
                  this.field_2624 = this.field_2623;
                  if (this.field_2623 == this.field_2622) {
                     this.field_2670 = "You Win!";
                     this.field_2671 = 177;
                     this.field_2669 = true;
                  } else {
                     this.field_2670 = "You Lose!";
                     this.field_2671 = 170;
                     this.field_2669 = true;
                  }
               }

               return true;
            }
         }

         return false;
      }
   }

   // $VF: renamed from: a (int, int, int, int, int) int
   public int method_748(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      byte var7 = 0;
      int var8 = 0;
      switch (var4) {
         case 0:
            var6 = 0;
            var7 = -1;
            break;
         case 1:
            var6 = 1;
            var7 = -1;
            break;
         case 2:
            var6 = 1;
            var7 = 0;
            break;
         case 3:
            var6 = 1;
            var7 = 1;
            break;
         case 4:
            var6 = 0;
            var7 = 1;
            break;
         case 5:
            var6 = -1;
            var7 = 1;
            break;
         case 6:
            var6 = -1;
            var7 = 0;
            break;
         case 7:
            var6 = -1;
            var7 = -1;
      }

      if (var5 != 1) {
         if (var5 == 2) {
            var8 = 1;

            do {
               var2 += var6;
               var3 += var7;
               if (var2 >= 15 || var3 >= 15 || var2 < 0 || var3 < 0) {
                  var8 = 0;
                  break;
               }

               if (this.field_2626[var2][var3] != this.field_2620) {
                  var8++;
               }
            } while (this.field_2626[var2][var3] != this.field_2620);
         }
      } else {
         do {
            var2 += var6;
            var3 += var7;
            if (var2 >= 15 || var3 >= 15 || var2 < 0 || var3 < 0) {
               var8 = 0;
               break;
            }

            if (this.field_2626[var2][var3] == var1) {
               var8++;
            }
         } while (this.field_2626[var2][var3] == var1);
      }

      return var8;
   }

   // $VF: renamed from: a (int, int, int, int) int
   public int method_749(int var1, int var2, int var3, int var4) {
      byte var5 = 0;
      byte var6 = 0;
      switch (var4) {
         case 0:
            var5 = 0;
            var6 = -1;
            break;
         case 1:
            var5 = 1;
            var6 = -1;
            break;
         case 2:
            var5 = 1;
            var6 = 0;
            break;
         case 3:
            var5 = 1;
            var6 = 1;
            break;
         case 4:
            var5 = 0;
            var6 = 1;
            break;
         case 5:
            var5 = -1;
            var6 = 1;
            break;
         case 6:
            var5 = -1;
            var6 = 0;
            break;
         case 7:
            var5 = -1;
            var6 = -1;
      }

      while (var3 > 0) {
         var1 += var5;
         var2 += var6;
         if (var1 >= 15 || var2 >= 15 || var1 < 0 || var2 < 0) {
            return -1;
         }

         var3--;
      }

      return this.field_2626[var1][var2];
   }

   // $VF: renamed from: d () java.awt.Dimension
   public Dimension method_750() {
      if (this.field_2639) {
         this.field_2639 = false;
         return new Dimension(7, 7);
      } else {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         class_17 var9 = 0;
         class_17 var10 = 0;
         int[] var11 = new int[]{-1, -1, -1, -1};
         int[] var12 = new int[]{-1, -1, -1, -1};
         class_17 var13 = 0;
         class_17 var14 = 0;
         Dimension var15 = new Dimension();
         Dimension var16 = new Dimension();
         byte var17 = 0;
         byte var18 = 0;
         class_17[][] var7 = new class_17[15][15];
         class_17[][] var8 = new class_17[15][15];

         for (int var19 = 0; var19 < 15; var19++) {
            for (int var20 = 0; var20 < 15; var20++) {
               var7[var19][var20] = -1;
               var8[var19][var20] = -1;
               if (this.field_2626[var19][var20] == this.field_2620) {
                  var7[var19][var20] = false;
                  var8[var19][var20] = false;

                  for (int var21 = 0; var21 <= 3; var21++) {
                     switch (var21) {
                        case 0:
                           var17 = 0;
                           var18 = -1;
                           break;
                        case 1:
                           var17 = 1;
                           var18 = -1;
                           break;
                        case 2:
                           var17 = 1;
                           var18 = 0;
                           break;
                        case 3:
                           var17 = 1;
                           var18 = 1;
                           break;
                        case 4:
                           var17 = 0;
                           var18 = 1;
                           break;
                        case 5:
                           var17 = -1;
                           var18 = 1;
                           break;
                        case 6:
                           var17 = -1;
                           var18 = 0;
                           break;
                        case 7:
                           var17 = -1;
                           var18 = -1;
                     }

                     var11[var21] = -1;
                     var12[var21] = -1;
                     var1 = this.method_748(3 - this.field_2623, var19, var20, var21, 1);
                     var4 = this.method_748(3 - this.field_2623, var19, var20, (var21 + 4) % 8, 1);
                     var2 = this.method_748(this.field_2623, var19, var20, var21, 1);
                     var5 = this.method_748(this.field_2623, var19, var20, (var21 + 4) % 8, 1);
                     var3 = this.method_748(3 - this.field_2623, var19, var20, var21, 2);
                     var6 = this.method_748(3 - this.field_2623, var19, var20, (var21 + 4) % 8, 2);
                     switch (var1 + var4) {
                        case 0:
                           if (var3 == 1 && var6 == 1) {
                              int var36 = this.method_748(3 - this.field_2623, var19 + var3 * var17, var20 + var3 * var18, var21, 1);
                              int var23 = this.method_748(3 - this.field_2623, var19 - var6 * var17, var20 - var6 * var18, (var21 + 4) % 8, 1);
                              if (var36 == 3) {
                                 if (this.method_749(var19, var20, 5, var21) == this.field_2623) {
                                    var11[var21] = 14;
                                 } else {
                                    var11[var21] = 13;
                                 }
                              } else if (var23 == 3) {
                                 if (this.method_749(var19, var20, 5, (var21 + 4) % 8) == this.field_2623) {
                                    var11[var21] = 14;
                                 } else {
                                    var11[var21] = 13;
                                 }
                              } else if (var36 == 2) {
                                 if (this.method_749(var19, var20, 4, var21) == this.field_2623) {
                                    var11[var21] = 18;
                                 } else {
                                    var11[var21] = 17;
                                 }
                              } else if (var23 == 2) {
                                 if (this.method_749(var19, var20, 4, (var21 + 4) % 8) == this.field_2623) {
                                    var11[var21] = 18;
                                 } else {
                                    var11[var21] = 17;
                                 }
                              } else {
                                 var11[var21] = 10;
                              }
                           } else if (var3 != 1 && var6 != 1) {
                              var11[var21] = 12;
                           } else if (var3 == 1) {
                              int var22 = this.method_748(3 - this.field_2623, var19 + var3 * var17, var20 + var3 * var18, var21, 1);
                              if (var22 == 3) {
                                 if (this.method_749(var19, var20, 5, var21) == this.field_2623) {
                                    var11[var21] = 16;
                                 } else {
                                    var11[var21] = 15;
                                 }
                              } else if (var22 == 2) {
                                 if (this.method_749(var19, var20, 4, var21) == this.field_2623) {
                                    var11[var21] = 20;
                                 } else {
                                    var11[var21] = 19;
                                 }
                              } else {
                                 var11[var21] = 11;
                              }
                           } else {
                              int var35 = this.method_748(3 - this.field_2623, var19 - var6 * var17, var20 - var6 * var18, (var21 + 4) % 8, 1);
                              if (var35 == 3) {
                                 if (this.method_749(var19, var20, 5, (var21 + 4) % 8) == this.field_2623) {
                                    var11[var21] = 16;
                                 } else {
                                    var11[var21] = 15;
                                 }
                              } else if (var35 == 2) {
                                 if (this.method_749(var19, var20, 4, (var21 + 4) % 8) == this.field_2623) {
                                    var11[var21] = 20;
                                 } else {
                                    var11[var21] = 19;
                                 }
                              } else {
                                 var11[var21] = 11;
                              }
                           }
                           break;
                        case 1:
                           if (var3 == var1 + 1 && var6 == var4 + 1) {
                              var11[var21] = 7;
                           } else if (var3 != var1 + 1 && var6 != var4 + 1) {
                              var11[var21] = 9;
                           } else {
                              var11[var21] = 8;
                           }
                           break;
                        case 2:
                           if (var3 == var1 + 1 && var6 == var4 + 1) {
                              var11[var21] = 4;
                           } else if (var3 != var1 + 1 && var6 != var4 + 1) {
                              var11[var21] = 6;
                           } else {
                              var11[var21] = 5;
                           }
                           break;
                        case 3:
                           if (var3 == var1 + 1 && var6 == var4 + 1) {
                              var11[var21] = 1;
                           } else if (var3 != var1 + 1 && var6 != var4 + 1) {
                              var11[var21] = 3;
                           } else {
                              var11[var21] = 2;
                           }
                           break;
                        default:
                           var11[var21] = 0;
                     }

                     var7[var19][var20] = var7[var19][var20] + field_2683[var11[var21]];
                     switch (var2 + var5) {
                        case 0:
                           if (var3 == 1 && var6 == 1) {
                              int var39 = this.method_748(this.field_2623, var19 + var3 * var17, var20 + var3 * var18, var21, 1);
                              int var40 = this.method_748(this.field_2623, var19 - var6 * var17, var20 - var6 * var18, (var21 + 4) % 8, 1);
                              if (var39 == 3) {
                                 if (this.method_749(var19, var20, 5, var21) == 3 - this.field_2623) {
                                    var12[var21] = 14;
                                 } else {
                                    var12[var21] = 13;
                                 }
                              } else if (var40 == 3) {
                                 if (this.method_749(var19, var20, 5, (var21 + 4) % 8) == 3 - this.field_2623) {
                                    var12[var21] = 14;
                                 } else {
                                    var12[var21] = 13;
                                 }
                              } else if (var39 == 2) {
                                 if (this.method_749(var19, var20, 4, var21) == 3 - this.field_2623) {
                                    var12[var21] = 18;
                                 } else {
                                    var12[var21] = 17;
                                 }
                              } else if (var40 == 2) {
                                 if (this.method_749(var19, var20, 4, (var21 + 4) % 8) == 3 - this.field_2623) {
                                    var12[var21] = 18;
                                 } else {
                                    var12[var21] = 17;
                                 }
                              } else {
                                 var12[var21] = 10;
                              }
                           } else if (var3 != 1 && var6 != 1) {
                              var12[var21] = 12;
                           } else if (var3 == 1) {
                              int var37 = this.method_748(this.field_2623, var19 + var3 * var17, var20 + var3 * var18, var21, 1);
                              if (var37 == 3) {
                                 if (this.method_749(var19, var20, 5, var21) == 3 - this.field_2623) {
                                    var12[var21] = 16;
                                 } else {
                                    var12[var21] = 15;
                                 }
                              } else if (var37 == 2) {
                                 if (this.method_749(var19, var20, 4, var21) == 3 - this.field_2623) {
                                    var12[var21] = 20;
                                 } else {
                                    var12[var21] = 19;
                                 }
                              } else {
                                 var12[var21] = 11;
                              }
                           } else {
                              int var38 = this.method_748(this.field_2623, var19 - var6 * var17, var20 - var6 * var18, (var21 + 4) % 8, 1);
                              if (var38 == 3) {
                                 if (this.method_749(var19, var20, 5, (var21 + 4) % 8) == 3 - this.field_2623) {
                                    var12[var21] = 16;
                                 } else {
                                    var12[var21] = 15;
                                 }
                              } else if (var38 == 2) {
                                 if (this.method_749(var19, var20, 4, (var21 + 4) % 8) == 3 - this.field_2623) {
                                    var12[var21] = 20;
                                 } else {
                                    var12[var21] = 19;
                                 }
                              } else {
                                 var12[var21] = 11;
                              }
                           }
                           break;
                        case 1:
                           if (var3 == var2 + 1 && var6 == var5 + 1) {
                              var12[var21] = 7;
                           } else if (var3 != var2 + 1 && var6 != var5 + 1) {
                              var12[var21] = 9;
                           } else {
                              var12[var21] = 8;
                           }
                           break;
                        case 2:
                           if (var3 == var2 + 1 && var6 == var5 + 1) {
                              var12[var21] = 4;
                           } else if (var3 != var2 + 1 && var6 != var5 + 1) {
                              var12[var21] = 6;
                           } else {
                              var12[var21] = 5;
                           }
                           break;
                        case 3:
                           if (var3 == var2 + 1 && var6 == var5 + 1) {
                              var12[var21] = 1;
                           } else if (var3 != var2 + 1 && var6 != var5 + 1) {
                              var12[var21] = 3;
                           } else {
                              var12[var21] = 2;
                           }
                           break;
                        default:
                           var12[var21] = 0;
                     }

                     var8[var19][var20] = var8[var19][var20] + field_2683[var12[var21]];
                     if (var21 == 3) {
                        var7[var19][var20] = var7[var19][var20] + this.method_751(var11);
                        var13 += var7[var19][var20];
                        var8[var19][var20] = var8[var19][var20] + this.method_751(var12);
                        var14 += var8[var19][var20];
                        if (var9 < var7[var19][var20]) {
                           var15.width = var19;
                           var15.height = var20;
                           var9 = var7[var19][var20];
                        }

                        if (var10 < var8[var19][var20]) {
                           var16.width = var19;
                           var16.height = var20;
                           var10 = var8[var19][var20];
                        }
                     }
                  }
               }
            }
         }

         class_62.method_563("Computer's value gameGrids: ");

         for (int var30 = 0; var30 < 15; var30++) {
            for (int var33 = 0; var33 < 15; var33++) {
               class_62.method_563(var7[var33][var30] + "  ");
            }
         }

         class_62.method_563("\nPlayer's value gameGrids: ");

         for (int var31 = 0; var31 < 15; var31++) {
            for (int var34 = 0; var34 < 15; var34++) {
               class_62.method_563(var8[var34][var31] + "  ");
            }
         }

         class_62.method_563("My overall power: " + var13);
         class_62.method_563("Oppo overall power: " + var14);
         byte var32;
         if (var13 >= var14) {
            var32 = 30;
         } else {
            var32 = 5;
         }

         if (var7[var15.width][var15.height] + var32 >= var8[var16.width][var16.height]) {
            class_62.method_563("Point (" + var15 + ") ");
            return var15;
         } else {
            class_62.method_563("Point (" + var16 + ") ");
            return var16;
         }
      }
   }

   // $VF: renamed from: a (int[]) int
   private int method_751(int[] var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 4; var3++) {
         var2 += field_2683[var1[var3]];
      }

      if (var2 > field_2683[4] * 1.5) {
         int var6 = 0;
         int var4 = 0;

         for (int var5 = 0; var5 < 4; var5++) {
            if (var1[var5] == 4 || var1[var5] == 17) {
               var6++;
            } else if (var1[var5] == 2 || var1[var5] == 14 || var1[var5] == 15 || var1[var5] == 16) {
               var4++;
            }
         }

         if (var6 > 0 && var4 > 0) {
            class_62.method_563("4-3!!!!");
            return 500;
         }

         if (var6 > 1) {
            class_62.method_563("3-3!!!!");
            return 300;
         }

         if (var4 > 1) {
            class_62.method_563("4-4!!!!");
            return 600;
         }
      }

      return 0;
   }

   // $VF: renamed from: a (java.awt.Dimension, java.awt.Dimension, int) int
   public int method_752(Dimension var1, Dimension var2, int var3) {
      int var4 = 1;
      int var5 = var1.width + var2.width;

      for (int var6 = var1.height + var2.height; var5 > -1 && var6 > -1 && var5 < 15 && var6 < 15 && this.field_2626[var5][var6] == var3; var6 += var2.height) {
         var4++;
         var5 += var2.width;
      }

      var5 = var1.width - var2.width;

      for (int var8 = var1.height - var2.height; var5 >= 0 && var8 >= 0 && var5 < 15 && var8 < 15 && this.field_2626[var5][var8] == var3; var8 -= var2.height) {
         var4++;
         var5 -= var2.width;
      }

      return var4;
   }

   // $VF: renamed from: e () void
   public void method_753() {
      if (this.field_2624 == this.field_2622) {
         this.field_2624 = this.field_2621;
      } else if (this.field_2624 == this.field_2621) {
         this.field_2624 = this.field_2622;
      }

      if (this.field_2623 == this.field_2624) {
         this.field_2640 = false;
      } else {
         this.field_2640 = true;
      }
   }

   // $VF: renamed from: f () void
   public void method_754() {
      this.field_2623 = 3 - this.field_2623;
      if (this.field_2623 == this.field_2622) {
         this.field_2639 = true;
      }
   }

   // $VF: renamed from: g () void
   public void method_755() {
      class_62.method_563("method: reset 1712");

      for (int var1 = 0; var1 < 15; var1++) {
         for (int var2 = 0; var2 < 15; var2++) {
            this.field_2626[var1][var2] = this.field_2620;
         }
      }

      this.field_2624 = this.field_2621;
      this.field_2625 = 0;
      this.field_2640 = true;
   }
}
