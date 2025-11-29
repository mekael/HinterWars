import java.awt.Color;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;

// $VF: renamed from: aH
public class class_65 extends class_64 {
   // $VF: renamed from: bm int
   private int field_1799;
   // $VF: renamed from: bn int
   private int field_1800;
   // $VF: renamed from: bo int
   private int field_1801;
   // $VF: renamed from: a int
   public int field_1802;
   // $VF: renamed from: b int
   public int field_1803;
   // $VF: renamed from: bp java.util.Vector
   private Vector field_1804;
   // $VF: renamed from: bq java.util.Vector[]
   private Vector[] field_1805;
   // $VF: renamed from: br java.util.Vector
   private Vector field_1806;
   // $VF: renamed from: bs javax.swing.Icon[][]
   private Icon[][] field_1807;
   // $VF: renamed from: bt int
   private int field_1808;
   // $VF: renamed from: bu int
   private int field_1809;
   // $VF: renamed from: bv javax.swing.Icon[][]
   private Icon[][] field_1810;
   // $VF: renamed from: bw int
   private int field_1811;
   // $VF: renamed from: bx int
   private int field_1812;
   // $VF: renamed from: by javax.swing.Icon[][]
   private Icon[][] field_1813;
   // $VF: renamed from: bz int
   private int field_1814;
   // $VF: renamed from: bA int
   private int field_1815;
   // $VF: renamed from: bB int
   private int field_1816;
   // $VF: renamed from: bC javax.swing.Icon
   private Icon field_1817;
   // $VF: renamed from: bD javax.swing.Icon
   private Icon field_1818;
   // $VF: renamed from: bE javax.swing.Icon[]
   private Icon[] field_1819;
   // $VF: renamed from: bF javax.swing.Icon[]
   private Icon[] field_1820;
   // $VF: renamed from: bG javax.swing.Icon[]
   private Icon[] field_1821;
   // $VF: renamed from: bH javax.swing.Icon[][]
   private Icon[][] field_1822;
   // $VF: renamed from: bI javax.swing.Icon
   private Icon field_1823;
   // $VF: renamed from: bJ javax.swing.Icon
   private Icon field_1824;
   // $VF: renamed from: bK int
   private int field_1825;
   // $VF: renamed from: bL int[][]
   private int[][] field_1826 = (int[][])(new class_17[3][9]);
   // $VF: renamed from: bM byte
   private final byte field_1827 = 0;
   // $VF: renamed from: bN byte
   private final byte field_1828 = 1;
   // $VF: renamed from: bO byte
   private final byte field_1829 = 2;

   public class_65(long var1, String var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Icon var13, int var14) {
      super.field_1687 = var1;
      super.field_1683 = var3;
      super.field_1691 = var4;
      super.field_1717 = var8;
      super.field_1718 = var9;
      super.field_1719 = var10;
      super.field_1720 = var11;
      super.field_1715 = var10;
      super.field_1716 = var11;
      super.field_1721 = var12;
      super.field_1682 = var13;
      this.field_1799 = var5;
      super.field_1685 = class_4.field_49[var5];
      super.field_1686 = class_4.field_50[var5];
      this.field_1800 = var6;
      this.field_1801 = var7;
      super.field_1698 = var14;
      this.field_1804 = new Vector();
      this.field_1805 = new Vector[4];
      this.field_1805[0] = new Vector();
      this.field_1805[1] = new Vector();
      this.field_1805[2] = new Vector();
      this.field_1805[3] = new Vector();
      this.field_1806 = new Vector();
      this.field_1825 = 0;
      this.y = null;
      this.field_1816 = 1;
      this.field_1802 = -1;
      this.field_1803 = -1;
   }

   // $VF: renamed from: a (aQ) void
   public void method_596(class_7 var1) {
      this.field_1806.add(var1);
   }

   // $VF: renamed from: a () java.util.Vector
   public Vector method_597() {
      return this.field_1806;
   }

   // $VF: renamed from: a (av) void
   public void method_598(class_30 var1) {
      this.field_1804.add(var1);
      switch (var1.method_240()) {
         case 3:
            this.field_1816 = var1.method_234().method_231();
            class_62.method_563("weapon type = " + this.field_1816);
            super.field_1684 = var1.method_234().method_195();
      }
   }

   // $VF: renamed from: b (av) void
   public void method_599(class_30 var1) {
      this.field_1804.remove(var1);
   }

   // $VF: renamed from: c (av) void
   public void method_600(class_30 var1) {
      class_29 var2 = var1.method_234();
      Vector var3 = this.field_1805[var1.method_234().method_193()];

      for (int var4 = 0; var4 < var3.size(); var4++) {
         long var5 = ((class_30)var3.get(var4)).method_234().method_179();
         if (var2.method_179() == var5) {
            this.method_602(var2.method_193(), var4, var1.method_236());
            return;
         }
      }

      var3.add(var1);
   }

   // $VF: renamed from: d (av) int
   public int method_601(class_30 var1) {
      return this.field_1805[var1.method_234().method_193()].indexOf(var1);
   }

   // $VF: renamed from: a (int, int, int) void
   public void method_602(int var1, int var2, int var3) {
      ((class_30)this.field_1805[var1].elementAt(var2)).method_235(((class_30)this.field_1805[var1].elementAt(var2)).method_236() + var3);
      if (((class_30)this.field_1805[var1].elementAt(var2)).method_236() <= 0) {
         this.field_1805[var1].removeElementAt(var2);
      }
   }

   // $VF: renamed from: b () java.util.Vector
   public Vector method_603() {
      return (Vector)this.field_1805[3].clone();
   }

   // $VF: renamed from: c () java.util.Vector
   public Vector method_604() {
      return (Vector)this.field_1805[0].clone();
   }

   // $VF: renamed from: a (int) av
   public class_30 method_605(int var1) {
      Enumeration var2 = this.field_1804.elements();

      while (var2.hasMoreElements()) {
         class_30 var3 = (class_30)var2.nextElement();
         if (var3.method_240() == var1) {
            return var3;
         }
      }

      return null;
   }

   // $VF: renamed from: d () av
   public class_30 method_606() {
      Enumeration var1 = this.field_1804.elements();

      while (var1.hasMoreElements()) {
         class_30 var2 = (class_30)var1.nextElement();
         if (var2.method_240() == 3) {
            return var2;
         }
      }

      return null;
   }

   // $VF: renamed from: a (int, int, int, int, int, int) void
   public void method_607(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.field_1692 = var1;
      super.field_1689 = var2;
      super.field_1688 = var3;
      super.field_1694 = var3;
      super.field_1695 = var4;
      super.field_1693 = var5;
      super.field_1690 = var6;
   }

   // $VF: renamed from: a (aa) void
   public void method_608(class_57 var1) {
      this.field_1807 = (Icon[][])null;
      this.field_1810 = (Icon[][])null;
      this.field_1813 = (Icon[][])null;
      Enumeration var2 = this.field_1804.elements();

      while (var2.hasMoreElements()) {
         class_30 var3 = (class_30)var2.nextElement();
         switch (var3.method_240()) {
            case 1:
               this.field_1826[0] = var3.method_234().method_217();
               this.field_1807 = var3.method_234().method_218(this.field_1816);
               this.field_1808 = var3.method_234().method_227();
               this.field_1809 = var3.method_234().method_229();
               break;
            case 2:
               this.field_1826[1] = var3.method_234().method_217();
               this.field_1810 = var3.method_234().method_218(this.field_1816);
               this.field_1811 = var3.method_234().method_227();
               this.field_1812 = var3.method_234().method_229();
               break;
            case 3:
               this.field_1826[2] = var3.method_234().method_217();
               this.field_1813 = var3.method_234().method_218(this.field_1816);
               this.field_1814 = var3.method_234().method_227();
               this.field_1815 = var3.method_234().method_229();
         }
      }

      if (this.field_1807 == null) {
         class_85 var4 = var1.field_1553.method_769(this.field_1799, this.field_1800);
         this.field_1807 = var4.method_779(this.field_1816);
         this.field_1826[0] = var4.method_776();
         this.field_1808 = var4.method_782();
         this.field_1809 = var4.method_783();
      }

      if (this.field_1810 == null) {
         class_85 var5 = var1.field_1553.method_770(this.field_1799, this.field_1801);
         this.field_1810 = var5.method_779(this.field_1816);
         this.field_1826[1] = var5.method_776();
         this.field_1811 = var5.method_782();
         this.field_1812 = var5.method_783();
      }

      if (this.field_1813 == null) {
         this.field_1826[2] = this.field_1826[1];
      }

      switch (this.field_1799) {
         case 1:
            this.field_1817 = var1.field_1577;
            this.field_1821 = var1.field_1575;
            this.field_1822 = var1.field_1576;
            break;
         case 2:
            this.field_1817 = var1.field_1582;
            this.field_1821 = var1.field_1580;
            this.field_1822 = var1.field_1581;
            break;
         case 3:
            this.field_1817 = var1.field_1587;
            this.field_1821 = var1.field_1585;
            this.field_1822 = var1.field_1586;
            break;
         case 4:
            this.field_1817 = var1.field_1592;
            this.field_1821 = var1.field_1590;
            this.field_1822 = var1.field_1591;
      }

      this.field_1818 = var1.field_1558;
      this.field_1819 = var1.field_1560;
      this.field_1820 = var1.field_1559;
      super.field_1747 = var1.field_1561;
      super.field_1748 = var1.field_1562;
      super.field_1749 = var1.field_1563;
      super.field_1750 = var1.field_1564;
      super.field_1751 = var1.field_1565;
      super.field_1752 = var1.field_1566;
      super.field_1753 = var1.field_1567;
      super.field_1754 = var1.field_1568;
      super.field_1755 = var1.field_1569;
      super.field_1756 = var1.field_1570;
      super.field_1697 = new class_5("res/skills/", "graphicsMapping.txt");
      this.field_1823 = var1.field_1571;
      this.field_1824 = var1.field_1572;
      super.field_1701 = var1.field_1537;
      super.field_1706 = var1.field_1538;
      super.method_573(this.field_1826);
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny, int) void
   public void method_609(Graphics var1, MastersOfDestiny var2, int var3) {
      if (this.field_1807 != null && this.field_1810 != null) {
         int var6 = this.T;
         if (this.ae == 2 || this.ae == 3) {
            switch (this.T) {
               case 16:
               case 20:
                  var6 = 0;
                  break;
               case 17:
               case 21:
                  var6 = 1;
                  break;
               case 18:
               case 22:
                  var6 = 2;
                  break;
               case 19:
               case 23:
                  var6 = 3;
            }
         }

         int var4;
         int var5;
         if (this.u <= 0) {
            this.l();
            var4 = this.R - this.field_1817.getIconWidth() / 2;
            var5 = this.S - this.field_1817.getIconHeight() / 2;
            this.field_1817.paintIcon(var2, var1, var4, var5);
         } else {
            int var7 = this.R - this.field_1808;
            int var8 = this.S - this.field_1809;
            int var9 = this.R - this.field_1811;
            int var10 = this.S - this.field_1812;
            int var11 = this.R - this.field_1814;
            int var12 = this.S - this.field_1815;
            var4 = var7;
            var5 = var8;
            switch (var6) {
               case 0:
               case 4:
               case 8:
               case 12:
                  if (this.field_1813 != null) {
                     if (this.field_1813[var6][this.U[2]] != null) {
                        this.field_1813[var6][this.U[2]].paintIcon(var2, var1, var11, var12);
                     } else {
                        this.field_1813[0][0].paintIcon(var2, var1, var11, var12);
                     }
                  }

                  if (this.field_1810[var6][this.U[1]] != null) {
                     this.field_1810[var6][this.U[1]].paintIcon(var2, var1, var9, var10);
                  } else {
                     this.field_1810[0][0].paintIcon(var2, var1, var9, var10);
                  }

                  if (this.field_1807[var6][this.U[0]] != null) {
                     this.field_1807[var6][this.U[0]].paintIcon(var2, var1, var7, var8);
                  } else {
                     this.field_1807[0][0].paintIcon(var2, var1, var7, var8);
                  }
                  break;
               case 1:
               case 5:
               case 9:
               case 13:
                  if (this.field_1813 != null) {
                     if (this.field_1813[var6][this.U[2]] != null) {
                        this.field_1813[var6][this.U[2]].paintIcon(var2, var1, var11, var12);
                     } else {
                        this.field_1813[1][0].paintIcon(var2, var1, var11, var12);
                     }
                  }

                  if (this.field_1810[var6][this.U[1]] != null) {
                     this.field_1810[var6][this.U[1]].paintIcon(var2, var1, var9, var10);
                  } else {
                     this.field_1810[1][0].paintIcon(var2, var1, var9, var10);
                  }

                  if (this.field_1807[var6][this.U[0]] != null) {
                     this.field_1807[var6][this.U[0]].paintIcon(var2, var1, var7, var8);
                  } else {
                     this.field_1807[1][0].paintIcon(var2, var1, var7, var8);
                  }

                  if (this.field_1799 == 3 && (this.field_1816 == 1 || this.field_1816 == 3) && this.field_1813 != null) {
                     if (this.field_1813[var6][this.U[2]] != null) {
                        this.field_1813[var6][this.U[2]].paintIcon(var2, var1, var11, var12);
                     } else {
                        this.field_1813[1][0].paintIcon(var2, var1, var11, var12);
                     }
                  }
                  break;
               case 2:
               case 6:
               case 10:
               case 14:
                  if (this.field_1810[var6][this.U[1]] != null) {
                     this.field_1810[var6][this.U[1]].paintIcon(var2, var1, var9, var10);
                  } else {
                     this.field_1810[2][0].paintIcon(var2, var1, var9, var10);
                  }

                  if (this.field_1807[var6][this.U[0]] != null) {
                     this.field_1807[var6][this.U[0]].paintIcon(var2, var1, var7, var8);
                  } else {
                     this.field_1807[2][0].paintIcon(var2, var1, var7, var8);
                  }

                  if (this.field_1813 != null) {
                     if (this.field_1813[var6][this.U[2]] != null) {
                        this.field_1813[var6][this.U[2]].paintIcon(var2, var1, var11, var12);
                     } else {
                        this.field_1813[2][0].paintIcon(var2, var1, var11, var12);
                     }
                  }
                  break;
               case 3:
               case 7:
               case 11:
               case 15:
                  if (this.field_1810[var6][this.U[1]] != null) {
                     this.field_1810[var6][this.U[1]].paintIcon(var2, var1, var9, var10);
                  } else {
                     this.field_1810[3][0].paintIcon(var2, var1, var9, var10);
                  }

                  if (this.field_1807[var6][this.U[0]] != null) {
                     this.field_1807[var6][this.U[0]].paintIcon(var2, var1, var7, var8);
                  } else {
                     this.field_1807[3][0].paintIcon(var2, var1, var7, var8);
                  }

                  if (this.field_1813 != null) {
                     if (this.field_1813[var6][this.U[2]] != null) {
                        this.field_1813[var6][this.U[2]].paintIcon(var2, var1, var11, var12);
                     } else {
                        this.field_1813[3][0].paintIcon(var2, var1, var11, var12);
                     }
                  }
                  break;
               case 16:
               case 17:
               case 18:
               case 19:
                  if (this.field_1810[var6][this.U[1]] != null) {
                     this.field_1810[var6][this.U[1]].paintIcon(var2, var1, var9, var10);
                  }

                  if (this.field_1807[var6][this.U[0]] != null) {
                     this.field_1807[var6][this.U[0]].paintIcon(var2, var1, var7, var8);
                  }
                  break;
               default:
                  class_62.method_563("no player!!! cos state is wrong!!!!");
            }

            label133:
            switch (this.ae) {
               case 0:
                  int var13 = var9 + this.field_1810[var6][this.U[1]].getIconWidth() / 2 - this.field_1818.getIconWidth() / 2;
                  int var14 = var10 + this.field_1810[var6][this.U[1]].getIconHeight() / 2 - this.field_1818.getIconHeight() / 2;
                  switch (this.T) {
                     case 12:
                        this.field_1818.paintIcon(var2, var1, var13, var14);
                        break label133;
                     case 13:
                        this.field_1818.paintIcon(var2, var1, var13, var14);
                        break label133;
                     case 14:
                        this.field_1818.paintIcon(var2, var1, var13, var14);
                        break label133;
                     case 15:
                        this.field_1818.paintIcon(var2, var1, var13, var14);
                     default:
                        break label133;
                  }
               case 1:
                  this.field_1819[super.field_1725]
                     .paintIcon(
                        var2,
                        var1,
                        var7 + this.field_1807[var6][0].getIconWidth() / 2 - this.field_1819[super.field_1725].getIconWidth() / 2,
                        var8 - this.field_1819[super.field_1725].getIconHeight() / 2
                     );
                  break;
               case 2:
                  switch (this.T) {
                     case 16:
                        this.field_1821[0].paintIcon(var2, var1, var9, var8);
                        break;
                     case 17:
                        this.field_1821[1].paintIcon(var2, var1, var9, var8);
                        break;
                     case 18:
                        this.field_1821[2].paintIcon(var2, var1, var9, var8);
                        break;
                     case 19:
                        this.field_1821[3].paintIcon(var2, var1, var9, var8);
                  }

                  this.field_1820[super.field_1725]
                     .paintIcon(
                        var2,
                        var1,
                        var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.field_1820[super.field_1725].getIconWidth() / 2,
                        var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.field_1820[super.field_1725].getIconHeight() / 2
                     );
               case 3:
               case 4:
               default:
                  break;
               case 5:
                  switch (this.an) {
                     case 0:
                        this.at[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.at[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.at[super.field_1725].getIconHeight() / 2
                           );
                        break label133;
                     case 1:
                        this.av[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.av[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.av[super.field_1725].getIconHeight() / 2
                           );
                        break label133;
                     case 2:
                        this.ax[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.ax[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.ax[super.field_1725].getIconHeight() / 2
                           );
                        break label133;
                     case 3:
                        this.az[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.az[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.az[super.field_1725].getIconHeight() / 2
                           );
                        break label133;
                     case 4:
                        this.aB[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.aB[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.aB[super.field_1725].getIconHeight() / 2
                           );
                     default:
                        break label133;
                  }
               case 6:
                  switch (this.an) {
                     case 0:
                        this.au[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.au[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.au[super.field_1725].getIconHeight() / 2
                           );
                        break;
                     case 1:
                        this.aw[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.aw[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.aw[super.field_1725].getIconHeight() / 2
                           );
                        break;
                     case 2:
                        this.ay[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.ay[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.ay[super.field_1725].getIconHeight() / 2
                           );
                        break;
                     case 3:
                        this.aA[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.aA[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.aA[super.field_1725].getIconHeight() / 2
                           );
                        break;
                     case 4:
                        this.aC[super.field_1725]
                           .paintIcon(
                              var2,
                              var1,
                              var9 + this.field_1810[var6][0].getIconWidth() / 2 - this.aC[super.field_1725].getIconWidth() / 2,
                              var8 + (var10 + this.field_1810[var6][0].getIconHeight() - var8) / 2 - this.aC[super.field_1725].getIconHeight() / 2
                           );
                  }
            }

            if (this.T >= 12 && this.T <= 15) {
            }
         }

         var1.setFont(MastersOfDestiny.field_2806);
         var1.setColor(Color.BLACK);
         int var15 = this.field_1807[var6][0].getIconWidth() / 2;
         if (this.H) {
            this.I[this.K].paintIcon(var2, var1, var4 + var15 - this.I[this.K].getIconWidth() / 2, var5 - this.I[this.K].getIconHeight() - 4);
         }

         if (this.C) {
            this.D.paintIcon(var2, var1, var4 + var15 - this.D.getIconWidth() / 2, var5 - this.D.getIconHeight() - 4);
            this.F
               .method_805(
                  this.G, var4 + var15 - this.D.getIconWidth() / 2 + 5, var5 - this.D.getIconHeight() - 4 + 10, 163, 17, MastersOfDestiny.field_2848, null
               );
            this.F.method_793(var1, var2);
         }

         int var16 = var4 + var15 - this.field_1823.getIconWidth() / 2;
         int var17 = var5 - var1.getFontMetrics().getHeight() * 3 / 4 - this.field_1823.getIconHeight();
         this.field_1823.paintIcon(var2, var1, var16, var17);
         if (this.r > 0) {
            var1.setClip(this.u * this.field_1824.getIconWidth() / this.r + var16, var17, this.field_1823.getIconWidth(), this.field_1823.getIconHeight());
         }

         this.field_1824.paintIcon(var2, var1, 1 + var16, var17 + 1);
         var1.setClip(0, 0, var2.getWidth(), var2.getHeight());
         if (var3 != this.A) {
            var1.setColor(Color.RED);
         }

         var1.drawString(this.l, var4 + var15 - var1.getFontMetrics().stringWidth(this.l) / 2, var5);
         if (this.y != null) {
            var1.setColor(Color.WHITE);
            var1.setFont(MastersOfDestiny.field_2821);
            var1.drawString(this.y, var4 + var15 - MastersOfDestiny.field_2822.stringWidth(this.y) / 2, var5 - MastersOfDestiny.field_2822.getHeight() / 4);
            this.field_1825++;
            if (this.field_1825 > 10) {
               this.y = null;
               this.field_1825 = 0;
            }
         }
      } else {
         class_62.method_563(this.p + " playerHead = " + this.field_1807 + " playerArmor = " + this.field_1810);
      }
   }
}
