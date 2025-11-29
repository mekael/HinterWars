import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aj
public class class_76 extends class_74 {
   // $VF: renamed from: c aa
   private class_57 field_2172;
   // $VF: renamed from: d byte
   private byte field_2173;
   // $VF: renamed from: e int
   private int field_2174;
   // $VF: renamed from: f int
   private int field_2175;
   // $VF: renamed from: g int
   private int field_2176 = 0;
   // $VF: renamed from: h int
   private int field_2177 = 1;
   // $VF: renamed from: i int
   private int field_2178 = 2;
   // $VF: renamed from: j int[][]
   private int[][] field_2179;
   // $VF: renamed from: k int
   private int field_2180;
   // $VF: renamed from: l int
   private int field_2181;
   // $VF: renamed from: m java.awt.Dimension
   private Dimension field_2182;
   // $VF: renamed from: n java.awt.Dimension
   private Dimension field_2183;
   // $VF: renamed from: o java.awt.Dimension
   private Dimension field_2184;
   // $VF: renamed from: p java.awt.Dimension[]
   private Dimension[] field_2185;
   // $VF: renamed from: q java.awt.Dimension
   private Dimension field_2186;
   // $VF: renamed from: r java.awt.Dimension
   private Dimension field_2187;
   // $VF: renamed from: s java.awt.Dimension
   private Dimension field_2188;
   // $VF: renamed from: t int
   private int field_2189;
   // $VF: renamed from: u double
   private double field_2190;
   // $VF: renamed from: v boolean
   private boolean field_2191;
   // $VF: renamed from: w boolean
   private boolean field_2192;
   // $VF: renamed from: x boolean
   private boolean field_2193;
   // $VF: renamed from: y boolean
   private boolean field_2194;
   // $VF: renamed from: z javax.swing.Icon
   private Icon field_2195;
   // $VF: renamed from: A javax.swing.Icon
   private Icon field_2196;
   // $VF: renamed from: B javax.swing.Icon
   private Icon field_2197;
   // $VF: renamed from: C javax.swing.Icon
   private Icon field_2198;
   // $VF: renamed from: D javax.swing.Icon
   private Icon field_2199;
   // $VF: renamed from: E javax.swing.Icon
   private Icon field_2200;
   // $VF: renamed from: F javax.swing.Icon[]
   private Icon[] field_2201;
   // $VF: renamed from: G int
   private int field_2202;
   // $VF: renamed from: H int
   private int field_2203;
   // $VF: renamed from: I int
   private int field_2204;
   // $VF: renamed from: J int
   private int field_2205;
   // $VF: renamed from: K int
   private int field_2206;
   // $VF: renamed from: L int
   private int field_2207;
   // $VF: renamed from: M int
   private int field_2208;
   // $VF: renamed from: N int
   private int field_2209;
   // $VF: renamed from: O int
   private int field_2210;
   // $VF: renamed from: P int
   private int field_2211;
   // $VF: renamed from: Q int
   private int field_2212;
   // $VF: renamed from: R javax.swing.Icon
   private Icon field_2213;
   // $VF: renamed from: S int
   private int field_2214;
   // $VF: renamed from: T int
   private int field_2215;
   // $VF: renamed from: U int
   private int field_2216;
   // $VF: renamed from: V int
   private int field_2217;
   // $VF: renamed from: W int
   private int field_2218;
   // $VF: renamed from: X int
   private int field_2219;
   // $VF: renamed from: Y boolean
   private boolean field_2220;
   // $VF: renamed from: Z java.lang.String
   private String field_2221;
   // $VF: renamed from: aa int
   private int field_2222;
   // $VF: renamed from: ab int
   private int field_2223;
   // $VF: renamed from: a java.awt.Color
   Color field_2224 = new Color(21, 175, 195);
   // $VF: renamed from: b java.awt.Color
   Color field_2225 = new Color(153, 51, 0);
   // $VF: renamed from: ac GameStates
   private GameStates field_2226;

   public class_76(GameStates var1) {
      this.field_2226 = var1;
   }

   // $VF: renamed from: a (aa, long) void
   @Override
   public void method_670(class_57 var1, long var2) {
      this.field_2172 = var1;
      this.field_2173 = 31;
      this.field_2174 = this.field_2177;
      this.field_2179 = (int[][])(new class_17[8][8]);

      for (int var4 = 0; var4 < 8; var4++) {
         for (int var5 = 0; var5 < 8; var5++) {
            this.field_2179[var4][var5] = this.field_2176;
         }
      }

      this.field_2179[3][3] = this.field_2178;
      this.field_2179[4][4] = this.field_2178;
      this.field_2179[3][4] = this.field_2177;
      this.field_2179[4][3] = this.field_2177;
      this.field_2180 = 2;
      this.field_2181 = 2;
      this.field_2185 = new Dimension[9];
      this.field_2185[0] = new Dimension(0, 0);
      this.field_2185[1] = new Dimension(0, -1);
      this.field_2185[2] = new Dimension(1, -1);
      this.field_2185[3] = new Dimension(1, 0);
      this.field_2185[4] = new Dimension(1, 1);
      this.field_2185[5] = new Dimension(0, 1);
      this.field_2185[6] = new Dimension(-1, 1);
      this.field_2185[7] = new Dimension(-1, 0);
      this.field_2185[8] = new Dimension(-1, -1);
      this.field_2186 = new Dimension(-1, -1);
      this.field_2175 = this.field_2177;
      switch (GameStates.field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            this.field_2195 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1283)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            this.field_2195 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1287)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.field_2195 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1288)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            this.field_2195 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1291)));
      }

      this.field_2196 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1284)));
      this.field_2197 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1285)));
      this.field_2198 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1286)));
      this.field_2199 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1289)));
      this.field_2200 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1290)));
      this.field_2201 = new Icon[3];
      this.field_2201[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1224)));
      this.field_2201[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1223)));
      this.field_2202 = -1;
      this.field_2203 = 0;
      this.field_2204 = 0;
      this.field_2205 = var1.method_502("en", 1351);
      this.field_2206 = var1.method_502("en", 1352);
      this.field_2207 = var1.method_502("en", 1353);
      this.field_2208 = var1.method_502("en", 1354);
      this.field_2209 = var1.method_502("en", 1355);
      this.field_2210 = var1.method_502("en", 1356);
      this.field_2211 = var1.method_502("en", 1357);
      this.field_2212 = var1.method_502("en", 1358);
      this.field_2182 = new Dimension(93, 160);
      this.field_2183 = new Dimension(280, 280);
      this.field_2184 = new Dimension(-1, -1);
      this.method_690(35);
      this.field_2191 = true;
      this.field_2192 = true;
      this.field_2193 = false;
      this.field_2194 = false;
      this.field_2213 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1370)));
      this.field_2214 = var1.method_502("en", 1371);
      this.field_2215 = var1.method_502("en", 1372);
      this.field_2216 = var1.method_502("en", 1373);
      this.field_2217 = var1.method_502("en", 1374);
      this.field_2218 = var1.method_502("en", 1375);
      this.field_2219 = var1.method_502("en", 1376);
      this.field_2220 = false;
      this.field_2222 = 0;
      this.field_2223 = 287;
   }

   // $VF: renamed from: b (aa, long) int
   @Override
   public int method_671(class_57 var1, long var2) {
      return this.field_2173;
   }

   // $VF: renamed from: a (byte) void
   @Override
   public void method_672(byte var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_673(Graphics var1, MastersOfDestiny var2) {
      if (this.field_2194) {
         class_62.method_563("Game Pause");
         long var3 = System.currentTimeMillis();

         while (System.currentTimeMillis() - var3 < 500L) {
         }

         this.field_2194 = false;
      }

      this.field_2195.paintIcon(var2, var1, 0, 0);
      if (this.field_2186.width >= 0 && this.field_2186.width < 8 & this.field_2186.height >= 0 && this.field_2186.height < 8) {
         this.field_2198
            .paintIcon(
               var2,
               var1,
               this.field_2182.width + this.field_2186.width * this.field_2189 + 1,
               this.field_2182.height + this.field_2186.height * this.field_2189 + 1
            );
      }

      var1.setFont(MastersOfDestiny.field_2827);
      var1.setColor(Color.white);
      var1.drawString(this.field_2172.field_1528 + ": " + this.field_2181, 140, 142);
      var1.drawString("Computer: " + this.field_2180, 282, 142);
      if (this.field_2175 == this.field_2178) {
         this.field_2199.paintIcon(var2, var1, 160, 455);
      } else {
         this.field_2200.paintIcon(var2, var1, 160, 455);
      }

      var1.setFont(MastersOfDestiny.field_2831);
      if (this.field_2175 == this.field_2174) {
         var1.drawString("Your Turn Now", 186, 468);
      } else {
         var1.drawString("Computer's Turn", 184, 468);
      }

      for (int var5 = 0; var5 < 8; var5++) {
         for (int var4 = 0; var4 < 8; var4++) {
            if (this.field_2179[var5][var4] == this.field_2177) {
               this.field_2197.paintIcon(var2, var1, this.field_2189 * var5 + this.field_2182.width + 3, this.field_2189 * var4 + this.field_2182.height + 3);
            } else if (this.field_2179[var5][var4] == this.field_2178) {
               this.field_2196.paintIcon(var2, var1, this.field_2189 * var5 + this.field_2182.width + 3, this.field_2189 * var4 + this.field_2182.height + 3);
            }
         }
      }

      if (this.field_2220) {
         this.field_2213.paintIcon(var2, var1, this.field_2214, this.field_2215);
         var1.setFont(MastersOfDestiny.field_2835);
         var1.setColor(new Color(13127326));
         var1.drawString(this.field_2221, this.field_2222, this.field_2223);
      }

      if (this.field_2202 != -1) {
         this.field_2201[this.field_2202].paintIcon(var2, var1, this.field_2203, this.field_2204);
      }

      if (this.field_2174 != this.field_2175) {
         this.field_2184 = this.method_700();
         if (this.field_2184.width != -1 && this.field_2184.height != -1) {
            this.field_2186.width = this.field_2184.width;
            this.field_2186.height = this.field_2184.height;
         }

         this.method_691();
         this.field_2194 = true;
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
      if (!this.field_2220) {
         if (this.field_2174 == this.field_2175) {
            this.field_2184.width = (int)Math.floor((var2 - this.field_2182.width) / this.field_2190);
            this.field_2184.height = (int)Math.floor((var3 - this.field_2182.height) / this.field_2190);
            if (this.field_2184.width >= 0 && this.field_2184.width < 8 && this.field_2184.height >= 0 && this.field_2184.height < 8) {
               if (this.field_2179[this.field_2184.width][this.field_2184.height] == this.field_2176) {
                  this.method_691();
               }

               return;
            }
         }

         if (var1.getX() >= this.field_2205
            && var1.getX() <= this.field_2205 + this.field_2207
            && var1.getY() >= this.field_2206
            && var1.getY() <= this.field_2206 + this.field_2208) {
            this.field_2202 = -1;
            this.field_2173 = 19;
            return;
         }
      } else if (var1.getX() >= this.field_2216
         && var1.getX() <= this.field_2216 + this.field_2218
         && var1.getY() >= this.field_2217
         && var1.getY() <= this.field_2217 + this.field_2219) {
         this.field_2202 = -1;
         this.method_703();
         this.field_2220 = false;
      }

      if (var1.getX() >= this.field_2209
         && var1.getX() <= this.field_2209 + this.field_2211
         && var1.getY() >= this.field_2210
         && var1.getY() <= this.field_2210 + this.field_2212) {
         this.field_2202 = -1;
         this.field_2173 = 5;
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   @Override
   public void method_678(MouseEvent var1) {
      int var2 = (int)Math.floor((var1.getX() - this.field_2182.width) / this.field_2190);
      int var3 = (int)Math.floor((var1.getY() - this.field_2182.height) / this.field_2190);
      this.field_2202 = -1;
      if (!this.field_2220) {
         if (this.field_2174 == this.field_2175 && var2 >= 0 && var2 < 8 && var3 >= 0 && var3 < 8) {
            if (this.field_2179[var2][var3] == this.field_2176) {
               if (this.method_696(var2, var3)) {
                  this.field_2186.setSize(var2, var3);
               } else {
                  this.field_2186.setSize(-1, -1);
               }
            }

            return;
         }

         if (var1.getX() >= this.field_2205
            && var1.getX() <= this.field_2205 + this.field_2207
            && var1.getY() >= this.field_2206
            && var1.getY() <= this.field_2206 + this.field_2208) {
            this.field_2202 = 1;
            this.field_2203 = this.field_2205;
            this.field_2204 = this.field_2206;
            return;
         }
      } else if (var1.getX() >= this.field_2216
         && var1.getX() <= this.field_2216 + this.field_2218
         && var1.getY() >= this.field_2217
         && var1.getY() <= this.field_2217 + this.field_2219) {
         this.field_2202 = 1;
         this.field_2203 = this.field_2216;
         this.field_2204 = this.field_2217;
         return;
      }

      if (var1.getX() >= this.field_2209
         && var1.getX() <= this.field_2209 + this.field_2211
         && var1.getY() >= this.field_2210
         && var1.getY() <= this.field_2210 + this.field_2212) {
         this.field_2202 = 0;
         this.field_2203 = this.field_2209;
         this.field_2204 = this.field_2210;
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
   public void method_688(int var1, int var2) {
      this.field_2182.width = var1;
      this.field_2182.height = var2;
   }

   // $VF: renamed from: b (int, int) void
   public void method_689(int var1, int var2) {
      this.field_2183.width = var1;
      this.field_2183.height = var2;
   }

   // $VF: renamed from: a (int) void
   public void method_690(int var1) {
      this.field_2189 = var1;
      this.field_2190 = var1;
   }

   // $VF: renamed from: b () void
   public void method_691() {
      boolean var1 = false;

      for (int var2 = 1; var2 <= 8; var2++) {
         if (this.method_699(this.field_2184, this.field_2185[var2])) {
            var1 = true;
            class_62.method_563("reversed:" + var1);
         }
      }

      if (var1) {
         class_62.method_563("Reversed");
         this.method_698();
         this.method_692();
         class_62.method_563("OpponentMoved " + this.field_2193);
      }

      this.method_694();
      if (!this.field_2191 || !this.field_2192) {
         this.method_694();
      }

      this.field_2193 = false;
      this.method_693();
      class_62.method_563("method: updateStatus 943 " + this.field_2173);
   }

   // $VF: renamed from: c () void
   public void method_692() {
      this.field_2180 = 0;
      this.field_2181 = 0;

      for (int var1 = 0; var1 < 8; var1++) {
         for (int var2 = 0; var2 < 8; var2++) {
            if (this.field_2179[var1][var2] != this.field_2176) {
               if (this.field_2179[var1][var2] == this.field_2178) {
                  this.field_2180++;
               } else if (this.field_2179[var1][var2] == this.field_2177) {
                  this.field_2181++;
               }
            }
         }
      }
   }

   // $VF: renamed from: d () void
   public void method_693() {
      class_62.method_563("Check winner method");
      class_62.method_563("White is alive " + this.field_2191);
      class_62.method_563("Black is alive " + this.field_2192);
      if (this.field_2180 == 0) {
         this.field_2175 = this.field_2174;
         class_62.method_563("whiteScore = 0");
         this.field_2221 = "You Win!";
         this.field_2222 = 177;
         this.field_2220 = true;
      } else if (this.field_2181 == 0) {
         this.field_2175 = this.field_2174;
         class_62.method_563("blackScore = 0");
         this.field_2221 = "You Lose!";
         this.field_2222 = 170;
         this.field_2220 = true;
      } else if (!this.field_2191 && !this.field_2192 && this.field_2180 + this.field_2181 != 64) {
         this.field_2175 = this.field_2174;
         class_62.method_563("Both Parties are not Alive");
         if (this.field_2180 > this.field_2181) {
            this.field_2221 = "You Lose!";
            this.field_2222 = 170;
            this.field_2220 = true;
         } else if (this.field_2180 < this.field_2181) {
            this.field_2221 = "You Win!";
            this.field_2222 = 177;
            this.field_2220 = true;
         } else {
            this.field_2221 = "Draw!";
            this.field_2222 = 199;
            this.field_2220 = true;
         }
      } else if (this.field_2180 + this.field_2181 == 64) {
         this.field_2175 = this.field_2174;
         class_62.method_563("the board is full");
         if (this.field_2180 > this.field_2181) {
            this.field_2221 = "You Lose!";
            this.field_2222 = 170;
            this.field_2220 = true;
         } else if (this.field_2180 < this.field_2181) {
            this.field_2221 = "You Win!";
            this.field_2222 = 177;
            this.field_2220 = true;
         } else {
            this.field_2221 = "Draw!";
            this.field_2222 = 199;
            this.field_2220 = true;
         }
      }
   }

   // $VF: renamed from: e () void
   public void method_694() {
      class_62.method_563("Check Available Step Method");
      boolean var1 = false;

      label28:
      for (int var2 = 0; var2 < 8; var2++) {
         for (int var3 = 0; var3 < 8; var3++) {
            if (this.field_2179[var2][var3] == this.field_2176 && this.method_696(var2, var3)) {
               var1 = true;
               this.method_695(true);
               break label28;
            }
         }
      }

      if (!var1) {
         this.method_695(false);
         this.method_698();
      }
   }

   // $VF: renamed from: a (boolean) void
   private void method_695(boolean var1) {
      if (this.field_2175 == this.field_2178) {
         this.field_2191 = var1;
      } else if (this.field_2175 == this.field_2177) {
         this.field_2192 = var1;
      }

      class_62.method_563("method: setAliveState 1154 " + this.field_2191 + " " + this.field_2192);
   }

   // $VF: renamed from: c (int, int) boolean
   public boolean method_696(int var1, int var2) {
      Dimension var3 = new Dimension(var1, var2);

      for (int var4 = 1; var4 <= 8; var4++) {
         if (this.method_697(var3, this.field_2185[var4])) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (java.awt.Dimension, java.awt.Dimension) boolean
   public boolean method_697(Dimension var1, Dimension var2) {
      int var3 = var1.width + var2.width;
      int var4 = var1.height + var2.height;
      if (var4 <= 7 && var4 >= 0 && var3 >= 0 && var3 <= 7) {
         if (this.field_2179[var3][var4] == this.field_2176) {
            return false;
         } else if (this.field_2179[var3][var4] == this.field_2175) {
            return false;
         } else {
            int var5 = var3;
            int var6 = var4;

            while (this.field_2179[var5][var6] != this.field_2175) {
               var5 += var2.width;
               var6 += var2.height;
               if (var5 > 7 || var5 < 0 || var6 < 0 || var6 > 7) {
                  return false;
               }

               if (this.field_2179[var5][var6] == this.field_2176) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: f () void
   public void method_698() {
      class_62.method_563("method: reverseturn 1227");
      if (this.field_2175 == this.field_2178) {
         this.field_2175 = this.field_2177;
      } else if (this.field_2175 == this.field_2177) {
         this.field_2175 = this.field_2178;
      }
   }

   // $VF: renamed from: b (java.awt.Dimension, java.awt.Dimension) boolean
   public boolean method_699(Dimension var1, Dimension var2) {
      int var3 = var1.width + var2.width;
      int var4 = var1.height + var2.height;
      if (var1.width == -1 && var1.height == -1) {
         return false;
      } else if (var4 <= 7 && var4 >= 0 && var3 >= 0 && var3 <= 7) {
         if (this.field_2179[var3][var4] == this.field_2175) {
            return false;
         } else if (this.field_2179[var3][var4] == this.field_2176) {
            return false;
         } else {
            while (this.field_2179[var3][var4] != this.field_2175) {
               var3 += var2.width;
               var4 += var2.height;
               if (var3 > 7 || var3 < 0 || var4 < 0 || var4 > 7) {
                  return false;
               }

               if (this.field_2179[var3][var4] == this.field_2176) {
                  return false;
               }
            }

            int var5 = var1.width;

            for (int var6 = var1.height; var5 != var3 || var6 != var4; var6 += var2.height) {
               this.field_2179[var5][var6] = this.field_2175;
               var5 += var2.width;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: g () java.awt.Dimension
   public Dimension method_700() {
      int var1 = 0;
      Dimension var2 = new Dimension(-1, -1);
      int var3 = 0;
      if (this.method_696(0, 0) && this.field_2179[0][0] == this.field_2176) {
         var1 = this.method_701(0, 0);
         var2 = new Dimension(0, 0);
      }

      if (this.method_696(0, 7) && this.field_2179[0][7] == this.field_2176) {
         var3 = this.method_701(0, 7);
         if (var3 > var1) {
            var1 = var3;
            var2 = new Dimension(0, 7);
         }
      }

      if (this.method_696(7, 7) && this.field_2179[7][7] == this.field_2176) {
         var3 = this.method_701(7, 7);
         if (var3 > var1) {
            var1 = var3;
            var2 = new Dimension(7, 7);
         }
      }

      if (this.method_696(7, 0) && this.field_2179[7][0] == this.field_2176) {
         var3 = this.method_701(7, 0);
         if (var3 > var1) {
            var1 = var3;
            var2 = new Dimension(7, 0);
         }
      }

      if (var1 != 0) {
         class_62.method_563("(" + var2.width + ", " + var2.height + ")");
         return var2;
      } else {
         for (int var4 = 2; var4 < 6; var4++) {
            for (int var5 = 0; var5 < 1; var5++) {
               if (this.method_696(var4, var5) && this.field_2179[var4][var5] == this.field_2176) {
                  class_62.method_563("1110");
                  var3 = this.method_701(var4, var5);
                  if (var3 > var1) {
                     var1 = var3;
                     var2 = new Dimension(var4, var5);
                  }
               }
            }
         }

         for (int var14 = 2; var14 < 6; var14++) {
            for (int var18 = 7; var18 < 8; var18++) {
               if (this.method_696(var14, var18) && this.field_2179[var14][var18] == this.field_2176) {
                  var3 = this.method_701(var14, var18);
                  if (var3 > var1) {
                     var1 = var3;
                     var2 = new Dimension(var14, var18);
                  }
               }
            }
         }

         for (int var15 = 0; var15 < 1; var15++) {
            for (int var19 = 2; var19 < 6; var19++) {
               if (this.method_696(var15, var19) && this.field_2179[var15][var19] == this.field_2176) {
                  var3 = this.method_701(var15, var19);
                  if (var3 > var1) {
                     var1 = var3;
                     var2 = new Dimension(var15, var19);
                  }
               }
            }
         }

         for (int var16 = 7; var16 < 8; var16++) {
            for (int var20 = 2; var20 < 6; var20++) {
               if (this.method_696(var16, var20) && this.field_2179[var16][var20] == this.field_2176) {
                  var3 = this.method_701(var16, var20);
                  if (var3 > var1) {
                     var1 = var3;
                     var2 = new Dimension(var16, var20);
                  }
               }
            }
         }

         if (var1 != 0) {
            class_62.method_563("(" + var2.width + ", " + var2.height + ")");
            return var2;
         } else {
            for (int var17 = 0; var17 < 8; var17++) {
               for (int var21 = 0; var21 < 8; var21++) {
                  var3 = this.method_701(var17, var21);
                  if (this.field_2179[var17][var21] == this.field_2176 && var3 > var1) {
                     var1 = var3;
                     var2 = new Dimension(var17, var21);
                  }
               }
            }

            class_62.method_563("(" + var2.width + ", " + var2.height + ")");
            return var2;
         }
      }
   }

   // $VF: renamed from: d (int, int) int
   public int method_701(int var1, int var2) {
      Dimension var3 = new Dimension(var1, var2);
      int var4 = 0;

      for (int var5 = 1; var5 <= 8; var5++) {
         var4 += this.method_702(var3, this.field_2185[var5]);
      }

      if (var4 > 0 && this.field_2179[var1][var2] == this.field_2176) {
         class_62.method_563("(" + var1 + ", " + var2 + "): " + var4);
      }

      return var4;
   }

   // $VF: renamed from: c (java.awt.Dimension, java.awt.Dimension) int
   public int method_702(Dimension var1, Dimension var2) {
      int var3 = var1.width + var2.width;
      int var4 = var1.height + var2.height;
      if (var4 <= 7 && var4 >= 0 && var3 >= 0 && var3 <= 7) {
         if (this.field_2179[var3][var4] == this.field_2176) {
            return 0;
         } else if (this.field_2179[var3][var4] == this.field_2175) {
            return 0;
         } else {
            int var5 = var3;
            int var6 = var4;

            int var7;
            for (var7 = 0; this.field_2179[var5][var6] != this.field_2175; var7++) {
               var5 += var2.width;
               var6 += var2.height;
               if (var5 > 7 || var5 < 0 || var6 < 0 || var6 > 7) {
                  return 0;
               }

               if (this.field_2179[var5][var6] == this.field_2176) {
                  return 0;
               }
            }

            return var7;
         }
      } else {
         return 0;
      }
   }

   // $VF: renamed from: h () void
   public void method_703() {
      class_62.method_563("method: reset 1712");

      for (int var1 = 0; var1 < 8; var1++) {
         for (int var2 = 0; var2 < 8; var2++) {
            this.field_2179[var1][var2] = this.field_2176;
         }
      }

      this.field_2179[3][3] = this.field_2178;
      this.field_2179[4][4] = this.field_2178;
      this.field_2179[3][4] = this.field_2177;
      this.field_2179[4][3] = this.field_2177;
      this.field_2175 = this.field_2177;
      this.field_2180 = 2;
      this.field_2181 = 2;
   }
}
