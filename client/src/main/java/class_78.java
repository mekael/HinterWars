import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: O
public class class_78 extends class_74 {
   // $VF: renamed from: k aa
   private class_57 field_2456;
   // $VF: renamed from: l byte
   private byte field_2457;
   // $VF: renamed from: m javax.swing.Icon
   private Icon field_2458;
   // $VF: renamed from: n javax.swing.Icon[]
   private Icon[] field_2459;
   // $VF: renamed from: o int
   private int field_2460;
   // $VF: renamed from: p int
   private int field_2461;
   // $VF: renamed from: a int
   public int field_2462;
   // $VF: renamed from: b int
   public int field_2463;
   // $VF: renamed from: c I
   public class_17 field_2464;
   // $VF: renamed from: d java.util.Hashtable
   public Hashtable field_2465;
   // $VF: renamed from: e java.util.Hashtable
   public Hashtable field_2466;
   // $VF: renamed from: q java.lang.String
   private String field_2467;
   // $VF: renamed from: r java.lang.String
   private String field_2468;
   // $VF: renamed from: f int
   final int field_2469 = 245;
   // $VF: renamed from: g int
   final int field_2470 = 255;
   // $VF: renamed from: h int
   final int field_2471 = 0;
   // $VF: renamed from: i int
   final int field_2472 = 244;
   // $VF: renamed from: j GameStates
   GameStates field_2473;

   public class_78(GameStates var1) {
      this.field_2473 = var1;
   }

   // $VF: renamed from: a (aa, long) void
   @Override
   public void method_670(class_57 var1, long var2) {
      this.field_2456 = var1;
      this.field_2457 = 21;
      class_62.method_563("state of loading mission = " + this.field_2457);
      this.method_735(class_70.method_645());

      try {
         InputStream var4 = this.getClass().getResourceAsStream("res/missions/tileIdMapping.txt");
         if (var4 != null) {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();

            int var6;
            while ((var6 = var4.read()) != -1) {
               var5.write(var6);
            }

            var4.close();
            this.field_2467 = new String(var5.toByteArray(), "utf-8");
            class_62.method_563(this.field_2467);
         } else {
            class_62.method_563("tile graphics mapping null");
         }
      } catch (IOException var8) {
         class_62.method_563(var8.getMessage());
      }

      int var9 = var1.method_502("en", 536);
      int var10 = var1.method_502("en", 537);
      int var11 = var1.method_502("en", 538);
      int var7 = var1.method_502("en", 539);
      this.field_2464 = new class_17(12, 12, var9, var10, var11, var7);
      this.field_2465 = new Hashtable();
      this.field_2466 = new Hashtable();
      this.method_734();
      this.field_2459 = var1.method_501("en", 225);
      this.field_2460 = var1.method_502("en", 226);
      this.field_2461 = var1.method_502("en", 227);
      this.field_2463 = this.field_2459.length - 1;
      this.field_2473.method_353(class_79.field_2616, class_79.field_2617);
   }

   // $VF: renamed from: b () void
   private void method_734() {
      Random var1 = new Random();
      int var2 = Math.abs(var1.nextInt()) % 5;
      short var3 = 0;
      switch (var2) {
         case 0:
            var3 = 220;
            break;
         case 1:
            var3 = 221;
            break;
         case 2:
            var3 = 222;
            break;
         case 3:
            var3 = 223;
            break;
         case 4:
            var3 = 224;
      }

      this.field_2458 = this.field_2456.method_499("en", var3);
   }

   // $VF: renamed from: b (aa, long) int
   @Override
   public int method_671(class_57 var1, long var2) {
      return this.field_2457;
   }

   // $VF: renamed from: a (byte) void
   @Override
   public void method_672(byte var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_673(Graphics var1, MastersOfDestiny var2) {
      this.field_2458.paintIcon(var2, var1, 0, 0);
      this.field_2459[this.field_2462].paintIcon(var2, var1, this.field_2460, this.field_2461);
   }

   // $VF: renamed from: a (int, java.lang.Object) void
   @Override
   public void method_674(int var1, Object var2) {
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_675(String[] var1) {
      switch (class_68.method_618(var1)) {
         case -1:
            this.method_735(class_68.method_622(Long.toString(class_57.field_1525), this.field_2456.field_1526));
         case 0:
         case 2:
         case 3:
         case 4:
         case 5:
         case 7:
         case 10:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         default:
            break;
         case 1:
            this.method_735(class_68.method_623(Long.toString(class_57.field_1525), this.field_2456.field_1526));
            break;
         case 6:
            class_62.method_563("received TF in loading mission");
            Enumeration var58 = this.field_2466.elements();

            while (var58.hasMoreElements()) {
               ((class_65)var58.nextElement()).method_608(this.field_2456);
            }

            this.field_2456.field_1546 = new Object[1];
            this.field_2456.field_1546[0] = this;
            this.field_2457 = 22;
            break;
         case 8:
            if (!var1[1].equalsIgnoreCase("Y") && var1[1].equalsIgnoreCase("N")) {
               this.field_2473.method_353(this.field_2456.field_1523, this.field_2456.field_1524);
               this.field_2457 = 27;
               if (this.field_2473.field_698 != null) {
                  this.field_2473.field_698.method_569("You cannot start this mission!", 16711680, 16711680);
                  this.field_2473.field_698.method_571((byte)3);
               }
            }

            this.field_2462 = 1;
            break;
         case 9:
            this.method_736(var1[1]);
            break;
         case 11:
            int var22 = Integer.parseInt(var1[3]);
            int var24 = Integer.parseInt(var1[4]);
            class_66 var5 = new class_66(
               Long.parseLong(var1[1]),
               Long.parseLong(var1[2]),
               this.field_2456.method_504("en", 535),
               var22,
               var24,
               this.field_2464.method_125(var22, var24).method_172(),
               this.field_2464.method_125(var22, var24).method_174(),
               Integer.parseInt(var1[5]),
               Integer.parseInt(var1[6])
            );
            var5.method_612(this.field_2456);
            this.field_2465.put(new Long(var1[2]), var5);
            this.field_2464.method_128(var22, var24, var5);
            this.field_2464.method_125(var22, var24).method_161(false);
            this.field_2464.method_125(var22, var24).method_163(false);
            this.field_2462 = 2;
            break;
         case 12:
            int var21 = Integer.parseInt(var1[2]);
            int var23 = Integer.parseInt(var1[3]);
            class_65 var26 = new class_65(
               this.field_2456.field_1527,
               var1[1],
               Integer.parseInt(var1[5]),
               GameStates.field_1214,
               GameStates.field_1215,
               GameStates.field_1216,
               var21,
               var23,
               this.field_2464.method_125(var21, var23).method_172(),
               this.field_2464.method_125(var21, var23).method_174(),
               Integer.parseInt(var1[4]),
               this.field_2456.method_507(GameStates.field_1214),
               Integer.parseInt(var1[12])
            );
            this.field_2466.put(new Long(this.field_2456.field_1527), var26);
            this.field_2464.method_128(var21, var23, var26);
            this.field_2464.method_125(var21, var23).method_161(false);
            this.field_2464.method_125(var21, var23).method_163(false);
            this.field_2462 = 3;
            break;
         case 13:
            int var2 = Integer.parseInt(var1[3]);
            int var3 = Integer.parseInt(var1[4]);
            int var6 = Integer.parseInt(var1[7]);
            int var7 = Integer.parseInt(var1[8]);
            int var8 = Integer.parseInt(var1[9]);
            class_65 var25 = new class_65(
               Long.parseLong(var1[1]),
               var1[2],
               Integer.parseInt(var1[6]),
               var6,
               var7,
               var8,
               var2,
               var3,
               this.field_2464.method_125(var2, var3).method_172(),
               this.field_2464.method_125(var2, var3).method_174(),
               Integer.parseInt(var1[5]),
               this.field_2456.method_508(var6),
               Integer.parseInt(var1[13])
            );
            if (Integer.parseInt(var1[10]) != -1) {
               class_29 var27 = this.field_2456.field_1540.method_177(var1[10]);
               class_30 var33 = new class_30();
               var33.method_233(var27);
               var33.method_235(1);
               var33.method_239(1, (byte)1);
               var25.method_598(var33);
               var27 = null;
            }

            if (Integer.parseInt(var1[11]) != -1) {
               class_29 var29 = this.field_2456.field_1540.method_177(var1[11]);
               class_30 var34 = new class_30();
               var34.method_233(var29);
               var34.method_235(1);
               var34.method_239(2, (byte)1);
               var25.method_598(var34);
               var29 = null;
            }

            if (Integer.parseInt(var1[12]) != -1) {
               class_29 var31 = this.field_2456.field_1540.method_177(var1[12]);
               class_30 var35 = new class_30();
               var35.method_233(var31);
               var35.method_235(1);
               var35.method_239(3, (byte)1);
               var25.method_598(var35);
               var31 = null;
            }

            this.field_2466.put(new Long(var1[1]), var25);
            this.field_2464.method_128(var2, var3, var25);
            this.field_2464.method_125(var2, var3).method_161(false);
            this.field_2464.method_125(var2, var3).method_163(false);
            break;
         case 14:
            int var9 = Integer.parseInt(var1[3]);
            int var10 = Integer.parseInt(var1[4]);
            int var11 = Integer.parseInt(var1[7]);
            int var12 = Integer.parseInt(var1[8]);
            int var13 = Integer.parseInt(var1[9]);
            class_65 var4 = new class_65(
               Long.parseLong(var1[1]),
               var1[2],
               Integer.parseInt(var1[6]),
               var11,
               var12,
               var13,
               var9,
               var10,
               this.field_2464.method_125(var9, var10).method_172(),
               this.field_2464.method_125(var9, var10).method_174(),
               Integer.parseInt(var1[5]),
               this.field_2456.method_508(var11),
               Integer.parseInt(var1[13])
            );
            if (Integer.parseInt(var1[10]) != -1) {
               class_29 var36 = this.field_2456.field_1540.method_177(var1[10]);
               class_30 var42 = new class_30();
               var42.method_233(var36);
               var42.method_235(1);
               var42.method_239(1, (byte)1);
               var4.method_598(var42);
               var36 = null;
            }

            if (Integer.parseInt(var1[11]) != -1) {
               class_29 var38 = this.field_2456.field_1540.method_177(var1[11]);
               class_30 var43 = new class_30();
               var43.method_233(var38);
               var43.method_235(1);
               var43.method_239(2, (byte)1);
               var4.method_598(var43);
               var38 = null;
            }

            if (Integer.parseInt(var1[12]) != -1) {
               class_29 var40 = this.field_2456.field_1540.method_177(var1[12]);
               class_30 var44 = new class_30();
               var44.method_233(var40);
               var44.method_235(1);
               var44.method_239(3, (byte)1);
               var4.method_598(var44);
               var40 = null;
            }

            this.field_2466.put(new Long(var1[1]), var4);
            this.field_2464.method_128(var9, var10, var4);
            this.field_2464.method_125(var9, var10).method_161(false);
            this.field_2464.method_125(var9, var10).method_163(false);
            break;
         case 15:
            int var14 = Integer.parseInt(var1[3]);
            int var15 = Integer.parseInt(var1[2]);
            if (var14 > 0 && var15 > 0) {
               class_29 var45 = this.field_2456.field_1540.method_177(var1[1]);
               class_30 var51 = new class_30();
               var51.method_233(var45);
               var51.method_235(1);
               var51.method_239(var14, (byte)1);
               ((class_65)this.field_2466.get(this.field_2456.field_1527)).method_598(var51);
               if (var15 > 1) {
                  var51 = new class_30();
                  var51.method_233(var45);
                  var51.method_235(var15 - 1);
                  ((class_65)this.field_2466.get(this.field_2456.field_1527)).method_600(var51);
               }

               var45 = null;
            }

            if (var14 == 0 && var15 > 0) {
               class_29 var47 = this.field_2456.field_1540.method_177(var1[1]);
               class_30 var53 = new class_30();
               var53.method_233(var47);
               var53.method_235(var15);
               ((class_65)this.field_2466.get(this.field_2456.field_1527)).method_600(var53);
               var47 = null;
            }

            this.field_2462 = 4;
            break;
         case 16:
            int var16 = Integer.parseInt(var1[3]);
            if (var16 > 0) {
               class_29 var49 = this.field_2456.field_1540.method_177(var1[2]);
               class_30 var56 = new class_30();
               var56.method_233(var49);
               var56.method_235(1);
               var56.method_239(var16, (byte)1);
               ((class_65)this.field_2466.get(Long.valueOf(var1[1]))).method_598(var56);
               var49 = null;
            }
            break;
         case 17:
            int var17 = Integer.parseInt(var1[3]);
            if (var17 > 0) {
               class_29 var54 = this.field_2456.field_1540.method_177(var1[2]);
               class_30 var57 = new class_30();
               var57.method_233(var54);
               var57.method_235(1);
               var57.method_239(var17, (byte)1);
               ((class_65)this.field_2466.get(Long.valueOf(var1[1]))).method_598(var57);
               var54 = null;
            }
            break;
         case 18:
            class_7 var18 = this.field_2456.field_1541.method_30(Long.parseLong(var1[1]));
            class_62.method_563("skill type = " + var18.method_68());
            if (var18.method_50() && var18.method_43() != 1L) {
               class_30 var19 = ((class_65)this.field_2466.get(this.field_2456.field_1527)).method_606();
               if (var19 != null) {
                  String var20 = var19.method_234().method_189();
                  class_62.method_563("weapon = " + var20);
                  if (var20.equalsIgnoreCase("gun")) {
                     if (var18.method_68().startsWith("Close Combat")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else if (var20.equalsIgnoreCase("knife")) {
                     if (var18.method_68().startsWith("Gunnery")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else if (var20.equalsIgnoreCase("sword")) {
                     if (var18.method_68().startsWith("Bow Crafts")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else if (var20.equalsIgnoreCase("bow")) {
                     if (var18.method_68().startsWith("Sword Crafts")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else if (var20.equalsIgnoreCase("book")) {
                     if (var18.method_68().startsWith("Combat Magic")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else if (var20.equalsIgnoreCase("staff")) {
                     if (var18.method_68().startsWith("Support Magic")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else if (var20.equalsIgnoreCase("claw")) {
                     if (var18.method_68().startsWith("Knuckles Training")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else if (var20.equalsIgnoreCase("knuckles")) {
                     if (var18.method_68().startsWith("Claws Training")) {
                        var18.method_76(true);
                     } else {
                        var18.method_76(false);
                     }
                  } else {
                     var18.method_76(false);
                  }
               } else if (!var18.method_68().startsWith("Close Combat")
                  && !var18.method_68().startsWith("Gunnery")
                  && !var18.method_68().startsWith("Bow Crafts")
                  && !var18.method_68().startsWith("Sword Crafts")
                  && !var18.method_68().startsWith("Combat Magic")
                  && !var18.method_68().startsWith("Support Magic")
                  && !var18.method_68().startsWith("Knuckles Training")
                  && !var18.method_68().startsWith("Claws Training")) {
                  var18.method_76(false);
               } else {
                  var18.method_76(true);
               }

               class_62.method_563("skill disable = " + var18.method_75());
               ((class_65)this.field_2466.get(this.field_2456.field_1527)).method_596(var18);
            }

            this.field_2462 = 5;
            break;
         case 19:
            ((class_65)this.field_2466.get(this.field_2456.field_1527))
               .method_607(
                  Integer.parseInt(var1[1]),
                  Integer.parseInt(var1[5]),
                  Integer.parseInt(var1[2]),
                  Integer.parseInt(var1[4]),
                  Integer.parseInt(var1[3]),
                  Integer.parseInt(var1[6])
               );
            break;
         case 20:
            if (this.field_2466.get(Long.valueOf(var1[1])) != null) {
               ((class_65)this.field_2466.get(Long.valueOf(var1[1])))
                  .method_607(
                     Integer.parseInt(var1[2]),
                     Integer.parseInt(var1[6]),
                     Integer.parseInt(var1[3]),
                     Integer.parseInt(var1[5]),
                     Integer.parseInt(var1[4]),
                     Integer.parseInt(var1[7])
                  );
            }
            break;
         case 21:
            if (this.field_2466.get(Long.valueOf(var1[1])) != null) {
               ((class_65)this.field_2466.get(Long.valueOf(var1[1])))
                  .method_607(
                     Integer.parseInt(var1[2]),
                     Integer.parseInt(var1[6]),
                     Integer.parseInt(var1[3]),
                     Integer.parseInt(var1[5]),
                     Integer.parseInt(var1[4]),
                     Integer.parseInt(var1[7])
                  );
            }
            break;
         case 47:
            this.field_2473.method_353(this.field_2456.field_1523, this.field_2456.field_1524);
            this.field_2457 = 27;
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_735(String var1) {
      this.field_2473.field_435.write(var1);
      this.field_2473.field_435.flush();
   }

   // $VF: renamed from: a () void
   @Override
   public void method_676() {
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_736(String var1) {
      String var2 = "res/missions/mapText/" + var1 + ".txt";
      class_62.method_563("dir=" + var2);

      try {
         String var3 = "";
         InputStream var4 = this.getClass().getResourceAsStream(var2);
         if (var4 != null) {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();

            int var6;
            while ((var6 = var4.read()) != -1) {
               var5.write(var6);
            }

            var4.close();
            var3 = new String(var5.toByteArray(), "utf-8");
            class_62.method_563("map: " + var3);
         }

         if (var3 != null && var3.length() > 0) {
            String[] var18 = var3.split("\r\n");
            this.field_2464.method_123(new ImageIcon(this.getClass().getResource("res/missions/Maps/" + var18[0] + ".png")));
            if (Integer.parseInt(var18[1]) > 0) {
               for (int var19 = 2; var19 < var18.length; var19++) {
                  String[] var7 = var18[var19].split("\\|");
                  int var8 = Integer.parseInt(var7[0]);
                  int var9 = Integer.parseInt(var7[1]);
                  int var10 = var9 / this.field_2464.method_135();
                  int var11 = var9 % this.field_2464.method_135();
                  int var12 = 1;
                  int var13 = 0;
                  String var14 = "";

                  for (int var15 = 0; var15 < this.field_2467.length(); var15++) {
                     if (this.field_2467.charAt(var15) == '\n') {
                        if (var12 == var8) {
                           String var16 = this.field_2467.substring(var13, var15 - 1);
                           var14 = var16.substring(var7[0].length() + 1, var16.length());
                           break;
                        }

                        var12++;
                        var13 = var15 + 1;
                     }
                  }

                  if (var14.length() > 0) {
                     this.field_2464.method_125(var10, var11).method_157(var14);
                  }

                  if (var8 >= 0 && var8 <= 244) {
                     this.field_2464.method_125(var10, var11).method_161(false);
                     this.field_2464.method_125(var10, var11).method_163(true);
                  } else if (var8 >= 245 && var8 <= 255) {
                     this.field_2464.method_125(var10, var11).method_161(true);
                     this.field_2464.method_125(var10, var11).method_163(false);
                  }

                  switch (var8) {
                     case 255:
                        this.field_2464.method_125(var10, var11).method_157(this.field_2456.method_504("en", 534));
                        this.field_2464.method_125(var10, var11).method_159(255);
                        break;
                  }
               }
            }
         }

         class_62.method_563("map created");
      } catch (IOException var17) {
         class_62.method_563(var17.getMessage());
      }
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   @Override
   public void method_677(MouseEvent var1) {
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   @Override
   public void method_678(MouseEvent var1) {
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
