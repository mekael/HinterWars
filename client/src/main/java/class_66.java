import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aS
public class class_66 extends class_64 {
   // $VF: renamed from: a byte
   private final byte field_1830 = 0;
   // $VF: renamed from: b byte
   private final byte field_1831 = 1;
   // $VF: renamed from: bx byte
   private final byte field_1832 = 2;
   // $VF: renamed from: by byte
   private final byte field_1833 = 3;
   // $VF: renamed from: bz byte
   private final byte field_1834 = 4;
   // $VF: renamed from: bA byte
   private final byte field_1835 = 5;
   // $VF: renamed from: bB byte
   private final byte field_1836 = 6;
   // $VF: renamed from: bC byte
   private final byte field_1837 = 7;
   // $VF: renamed from: bD byte
   private final byte field_1838 = 8;
   // $VF: renamed from: bE byte
   private final byte field_1839 = 9;
   // $VF: renamed from: bF byte
   private final byte field_1840 = 10;
   // $VF: renamed from: bG byte
   private final byte field_1841 = 11;
   // $VF: renamed from: bH byte
   private final byte field_1842 = 12;
   // $VF: renamed from: bI byte
   private final byte field_1843 = 13;
   // $VF: renamed from: bJ byte
   private final byte field_1844 = 14;
   // $VF: renamed from: bK byte
   private final byte field_1845 = 15;
   // $VF: renamed from: bL byte
   private final byte field_1846 = 16;
   // $VF: renamed from: bM byte
   private final byte field_1847 = 17;
   // $VF: renamed from: bN javax.swing.Icon[][]
   private Icon[][] field_1848;
   // $VF: renamed from: bO int
   private int field_1849;
   // $VF: renamed from: bP int
   private int field_1850;
   // $VF: renamed from: bQ javax.swing.Icon
   private Icon field_1851;
   // $VF: renamed from: bR javax.swing.Icon
   private Icon field_1852;
   // $VF: renamed from: bS javax.swing.Icon
   private Icon field_1853;
   // $VF: renamed from: bT javax.swing.Icon
   private Icon field_1854;
   // $VF: renamed from: bU int
   private int field_1855;
   // $VF: renamed from: bV int
   private int field_1856;
   // $VF: renamed from: bW int
   private int field_1857;
   // $VF: renamed from: bX int
   private int field_1858;
   // $VF: renamed from: bY int[][]
   private int[][] field_1859 = (int[][])(new class_17[1][9]);

   public class_66(long var1, long var3, String var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field_1848 = new Icon[16][4];
      super.field_1687 = var3;
      super.field_1717 = var6;
      super.field_1718 = var7;
      super.field_1719 = var8;
      super.field_1720 = var9;
      super.field_1715 = var8;
      super.field_1716 = var9;
      super.field_1721 = var10;
      super.field_1698 = var11;
      super.field_1686 = "res/sound/combat/monster_death.wav";
      class_14 var12 = class_14.method_118(var5);
      String var13 = var12.method_119(var1);
      this.method_610(var13);
      this.field_1859[0][4] = 3;
      this.field_1859[0][5] = 3;
      this.field_1859[0][6] = 3;
      this.field_1859[0][7] = 2;
      this.field_1859[0][8] = 4;
      this.field_1855 = 0;
      this.y = null;
      class_62.method_563("create new monster");
      super.method_573(this.field_1859);
   }

   // $VF: renamed from: b (java.lang.String) void
   private void method_610(String var1) {
      this.field_1856 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         if (var1.charAt(var3) == '\n') {
            this.method_611(var1.substring(var2, var3 - 1), this.field_1856);
            this.field_1856++;
            var2 = var3 + 1;
         }
      }
   }

   // $VF: renamed from: a (java.lang.String, int) void
   private void method_611(String var1, int var2) {
      switch (var2) {
         case 0:
            super.field_1683 = var1;
            break;
         case 1:
            super.field_1691 = Integer.parseInt(var1);
            break;
         case 2:
            super.field_1692 = Integer.parseInt(var1);
            super.field_1689 = Integer.parseInt(var1);
            break;
         case 3:
            super.field_1693 = Integer.parseInt(var1);
            super.field_1690 = Integer.parseInt(var1);
            break;
         case 4:
            super.field_1694 = Integer.parseInt(var1);
            break;
         case 5:
            super.field_1684 = var1;
            break;
         case 6:
            super.field_1685 = var1;
            break;
         case 7:
            super.field_1682 = new ImageIcon(this.getClass().getResource(var1));
            break;
         case 8:
            this.field_1849 = Integer.parseInt(var1);
            break;
         case 9:
            this.field_1850 = Integer.parseInt(var1);
            break;
         case 10:
            this.field_1859[0][0] = Integer.parseInt(var1);
            this.field_1857 = 0;
            this.field_1858 = 0;
            break;
         case 11:
            this.field_1848[this.field_1857][this.field_1858] = new ImageIcon(this.getClass().getResource(var1));
            this.field_1858++;
            if (this.field_1858 == this.field_1859[0][0] && this.field_1857 != 3) {
               this.field_1858 = 0;
               this.field_1857++;
            }

            if (this.field_1858 != this.field_1859[0][0] && this.field_1857 <= 3) {
               this.field_1856--;
            }
            break;
         case 12:
            this.field_1859[0][1] = Integer.parseInt(var1);
            this.field_1857 = 4;
            this.field_1858 = 0;
            break;
         case 13:
            this.field_1848[this.field_1857][this.field_1858] = new ImageIcon(this.getClass().getResource(var1));
            this.field_1858++;
            if (this.field_1858 == this.field_1859[0][1] && this.field_1857 != 7) {
               this.field_1858 = 0;
               this.field_1857++;
            }

            if (this.field_1858 != this.field_1859[0][1] && this.field_1857 <= 7) {
               this.field_1856--;
            }
            break;
         case 14:
            this.field_1859[0][2] = Integer.parseInt(var1);
            this.field_1857 = 8;
            this.field_1858 = 0;
            break;
         case 15:
            this.field_1848[this.field_1857][this.field_1858] = new ImageIcon(this.getClass().getResource(var1));
            this.field_1858++;
            if (this.field_1858 == this.field_1859[0][2] && this.field_1857 != 11) {
               this.field_1858 = 0;
               this.field_1857++;
            }

            if (this.field_1858 != this.field_1859[0][2] && this.field_1857 <= 11) {
               this.field_1856--;
            }
            break;
         case 16:
            this.field_1859[0][3] = Integer.parseInt(var1);
            this.field_1857 = 12;
            this.field_1858 = 0;
            break;
         case 17:
            this.field_1848[this.field_1857][this.field_1858] = new ImageIcon(this.getClass().getResource(var1));
            this.field_1858++;
            if (this.field_1858 == this.field_1859[0][3] && this.field_1857 != 15) {
               this.field_1858 = 0;
               this.field_1857++;
            }

            if (this.field_1858 != this.field_1859[0][3] && this.field_1857 <= 15) {
               this.field_1856--;
            }
      }
   }

   // $VF: renamed from: a (aa) void
   public void method_612(class_57 var1) {
      this.field_1852 = var1.field_1558;
      this.field_1853 = var1.field_1571;
      this.field_1854 = var1.field_1572;
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
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_613(Graphics var1, MastersOfDestiny var2) {
      if (this.field_1848 != null) {
         if (this.u > 0) {
            int var3 = this.R - this.field_1849;
            int var4 = this.S - this.field_1850;
            if (this.field_1848[this.T][this.U[0]] != null) {
               this.field_1848[this.T][this.U[0]].paintIcon(var2, var1, var3, var4);
            } else if (this.T == 12 || this.T == 8 || this.T == 0 || this.T == 4) {
               this.field_1848[0][0].paintIcon(var2, var1, var3, var4);
            } else if (this.T == 13 || this.T == 9 || this.T == 1 || this.T == 5) {
               this.field_1848[1][0].paintIcon(var2, var1, var3, var4);
            } else if (this.T == 14 || this.T == 10 || this.T == 2 || this.T == 6) {
               this.field_1848[2][0].paintIcon(var2, var1, var3, var4);
            } else if (this.T == 15 || this.T == 11 || this.T == 3 || this.T == 7) {
               this.field_1848[3][0].paintIcon(var2, var1, var3, var4);
            }

            if (this.T >= 12 && this.T <= 15) {
               this.field_1852
                  .paintIcon(
                     var2,
                     var1,
                     var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.field_1852.getIconWidth() / 2,
                     var4 + this.field_1848[this.T][this.U[0]].getIconHeight() - this.field_1852.getIconHeight()
                  );
            }

            if (this.ae == 5) {
               switch (this.an) {
                  case 0:
                     this.at[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.at[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.at[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 1:
                     this.av[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.av[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.av[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 2:
                     this.ax[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.ax[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.ax[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 3:
                     this.az[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.az[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.az[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 4:
                     this.aB[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.aB[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.aB[super.field_1725].getIconHeight() / 2
                        );
               }
            } else if (this.ae == 6) {
               switch (this.an) {
                  case 0:
                     this.au[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.au[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.au[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 1:
                     this.aw[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.aw[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.aw[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 2:
                     this.ay[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.ay[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.ay[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 3:
                     this.aA[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.aA[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.aA[super.field_1725].getIconHeight() / 2
                        );
                     break;
                  case 4:
                     this.aC[super.field_1725]
                        .paintIcon(
                           var2,
                           var1,
                           var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.aC[super.field_1725].getIconWidth() / 2,
                           var4 + this.field_1848[this.T][0].getIconHeight() / 2 - this.aC[super.field_1725].getIconHeight() / 2
                        );
               }
            }

            var1.setFont(MastersOfDestiny.field_2806);
            var1.setColor(new Color(9963014));
            if (this.field_1853 != null) {
               int var5 = var3 + this.field_1848[this.T][0].getIconWidth() / 2 - this.field_1853.getIconWidth() / 2;
               int var6 = var4 - var1.getFontMetrics().getHeight() * 3 / 4 - this.field_1853.getIconHeight();
               this.field_1853.paintIcon(var2, var1, var5, var6);
               var1.setClip(this.u * this.field_1854.getIconWidth() / this.r + var5, var6, this.field_1853.getIconWidth(), this.field_1853.getIconHeight());
               this.field_1854.paintIcon(var2, var1, 1 + var5, var6 + 1);
               var1.setClip(0, 0, var2.getWidth(), var2.getHeight());
            }

            var1.drawString(this.l, var3 + this.field_1848[this.T][0].getIconWidth() / 2 - var1.getFontMetrics().stringWidth(this.l) / 2, var4);
            if (this.y != null) {
               var1.setColor(new Color(16777215));
               var1.setFont(MastersOfDestiny.field_2821);
               var1.drawString(
                  this.y,
                  var3 + this.field_1848[this.T][0].getIconWidth() / 2 - MastersOfDestiny.field_2822.stringWidth(this.y) / 2,
                  var4 - MastersOfDestiny.field_2822.getHeight() / 4
               );
               this.field_1855++;
               if (this.field_1855 > 10) {
                  this.y = null;
                  this.field_1855 = 0;
               }
            }
         } else {
            this.l();
         }
      }
   }
}
