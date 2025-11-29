import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aJ
public class class_75 extends class_74 {
   // $VF: renamed from: g aa
   private class_57 field_2081;
   // $VF: renamed from: h byte
   private byte field_2082;
   // $VF: renamed from: i javax.swing.Icon
   private Icon field_2083;
   // $VF: renamed from: j javax.swing.Icon
   private Icon field_2084;
   // $VF: renamed from: k int
   private int field_2085;
   // $VF: renamed from: l int
   private int field_2086;
   // $VF: renamed from: a boolean
   boolean field_2087;
   // $VF: renamed from: m int
   private int field_2088;
   // $VF: renamed from: n int
   private int field_2089;
   // $VF: renamed from: o int
   private int field_2090;
   // $VF: renamed from: p int
   private int field_2091;
   // $VF: renamed from: q byte
   private final byte field_2092 = 0;
   // $VF: renamed from: r byte
   private final byte field_2093 = 1;
   // $VF: renamed from: s byte
   private final byte field_2094 = 2;
   // $VF: renamed from: t javax.swing.Icon[]
   private Icon[] field_2095;
   // $VF: renamed from: u int
   private int field_2096;
   // $VF: renamed from: v int
   private int field_2097;
   // $VF: renamed from: w java.lang.String[]
   private String[] field_2098;
   // $VF: renamed from: b java.util.Vector
   public Vector field_2099;
   // $VF: renamed from: x int
   private int field_2100;
   // $VF: renamed from: y int
   private int field_2101;
   // $VF: renamed from: z int
   private int field_2102;
   // $VF: renamed from: A int
   private int field_2103;
   // $VF: renamed from: B int
   private int field_2104;
   // $VF: renamed from: C int
   private int field_2105;
   // $VF: renamed from: D int
   private int field_2106;
   // $VF: renamed from: E int[]
   private int[] field_2107;
   // $VF: renamed from: F int
   private int field_2108;
   // $VF: renamed from: G int
   private int field_2109;
   // $VF: renamed from: H int
   private int field_2110;
   // $VF: renamed from: c java.util.Vector
   public Vector field_2111;
   // $VF: renamed from: I int
   private int field_2112;
   // $VF: renamed from: J int
   private int field_2113;
   // $VF: renamed from: K int
   private int field_2114;
   // $VF: renamed from: L int
   private int field_2115;
   // $VF: renamed from: M int
   private int field_2116;
   // $VF: renamed from: N int
   private int field_2117;
   // $VF: renamed from: O int
   private int field_2118;
   // $VF: renamed from: P int[]
   private int[] field_2119;
   // $VF: renamed from: Q int
   private int field_2120;
   // $VF: renamed from: R int
   private int field_2121;
   // $VF: renamed from: S int
   private int field_2122;
   // $VF: renamed from: T java.util.Vector
   private Vector field_2123;
   // $VF: renamed from: U java.util.Vector
   private Vector field_2124;
   // $VF: renamed from: V byte
   private final byte field_2125 = -1;
   // $VF: renamed from: W byte
   private final byte field_2126 = 0;
   // $VF: renamed from: X byte
   private final byte field_2127 = 1;
   // $VF: renamed from: Y byte
   private final byte field_2128 = 2;
   // $VF: renamed from: Z int
   private int field_2129;
   // $VF: renamed from: aa int
   private int field_2130;
   // $VF: renamed from: ab int
   private int field_2131;
   // $VF: renamed from: ac int
   private int field_2132;
   // $VF: renamed from: ad int
   private int field_2133;
   // $VF: renamed from: ae int
   private int field_2134;
   // $VF: renamed from: af javax.swing.Icon
   private Icon field_2135;
   // $VF: renamed from: ag int
   private int field_2136;
   // $VF: renamed from: ah javax.swing.Icon[]
   private Icon[] field_2137;
   // $VF: renamed from: ai int
   private int field_2138;
   // $VF: renamed from: aj int[]
   private int[] field_2139;
   // $VF: renamed from: ak int
   private int field_2140;
   // $VF: renamed from: al int
   private int field_2141;
   // $VF: renamed from: am int
   private int field_2142;
   // $VF: renamed from: an int
   private int field_2143;
   // $VF: renamed from: ao int
   private int field_2144;
   // $VF: renamed from: ap int
   private int field_2145;
   // $VF: renamed from: aq int
   private int field_2146;
   // $VF: renamed from: ar int
   private int field_2147;
   // $VF: renamed from: as int
   private int field_2148;
   // $VF: renamed from: at int
   private int field_2149;
   // $VF: renamed from: au int
   private int field_2150;
   // $VF: renamed from: av int
   private int field_2151;
   // $VF: renamed from: aw int
   private int field_2152;
   // $VF: renamed from: ax int
   private int field_2153;
   // $VF: renamed from: ay int
   private int field_2154;
   // $VF: renamed from: az long
   private long field_2155;
   // $VF: renamed from: aA int
   private int field_2156;
   // $VF: renamed from: aB int
   private int field_2157;
   // $VF: renamed from: aC long
   private long field_2158;
   // $VF: renamed from: aD int
   private final int field_2159 = 300;
   // $VF: renamed from: aE int
   private int field_2160;
   // $VF: renamed from: aF int
   private int field_2161;
   // $VF: renamed from: aG int
   private int field_2162;
   // $VF: renamed from: aH int
   private int field_2163;
   // $VF: renamed from: aI javax.swing.Icon[]
   private Icon[] field_2164;
   // $VF: renamed from: aJ int
   private int field_2165;
   // $VF: renamed from: aK int
   private int field_2166;
   // $VF: renamed from: aL int
   private int field_2167;
   // $VF: renamed from: aM GameStates
   private GameStates field_2168;
   // $VF: renamed from: d long
   public static long field_2169;
   // $VF: renamed from: e java.lang.String
   public static String field_2170;
   // $VF: renamed from: f int
   public static int field_2171;

   public class_75(GameStates var1) {
      this.field_2168 = var1;
   }

   // $VF: renamed from: a (aa, long) void
   @Override
   public void method_670(class_57 var1, long var2) {
      this.field_2081 = var1;
      this.field_2082 = 20;
      switch (GameStates.field_437) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            this.field_2083 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1245)));
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            this.field_2083 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1164)));
            break;
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            this.field_2083 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1070)));
            break;
         case 16:
         case 17:
         case 18:
         case 19:
            this.field_2083 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1171)));
      }

      this.field_2164 = new Icon[4];
      this.field_2164[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1224)));
      this.field_2164[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1223)));
      this.field_2164[2] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1301)));
      this.field_2164[3] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 1302)));
      this.field_2087 = false;
      this.field_2088 = var1.method_502("en", 1303);
      this.field_2089 = var1.method_502("en", 1304);
      this.field_2090 = var1.method_502("en", 1305);
      this.field_2091 = var1.method_502("en", 1306);
      this.field_2095 = new ImageIcon[4];
      this.field_2095[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 483)));
      this.field_2095[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 484)));
      this.field_2095[2] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 485)));
      this.field_2095[3] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 486)));
      this.field_2096 = var1.method_502("en", 487);
      this.field_2097 = var1.method_502("en", 488);
      this.field_2098 = this.field_2168.field_1271.method_662();
      this.field_2099 = new Vector();
      this.field_2100 = var1.method_502("en", 1307);
      this.field_2101 = var1.method_502("en", 1308);
      this.field_2102 = var1.method_502("en", 1309);
      this.field_2103 = var1.method_502("en", 1310);
      this.field_2104 = var1.method_502("en", 1311);
      this.field_2105 = -1;
      this.field_2106 = var1.method_502("en", 1312);
      this.field_2107 = var1.method_503("en", 1313);
      this.field_2108 = var1.method_502("en", 1314);
      this.field_2109 = var1.method_502("en", 1315);
      this.field_2110 = 0;
      this.field_2111 = new Vector();
      this.field_2112 = var1.method_502("en", 1316);
      this.field_2113 = var1.method_502("en", 1317);
      this.field_2114 = var1.method_502("en", 1318);
      this.field_2115 = var1.method_502("en", 1319);
      this.field_2116 = var1.method_502("en", 1320);
      this.field_2117 = 0;
      this.field_2118 = var1.method_502("en", 1321);
      this.field_2119 = var1.method_503("en", 1322);
      this.field_2120 = var1.method_502("en", 1323);
      this.field_2121 = var1.method_502("en", 1324);
      this.field_2122 = 0;
      this.field_2123 = new Vector();
      this.field_2124 = new Vector();
      this.field_2129 = var1.method_502("en", 1325);
      this.field_2130 = var1.method_502("en", 1326);
      this.field_2131 = var1.method_502("en", 1327);
      this.field_2132 = var1.method_502("en", 1328);
      this.field_2133 = var1.method_502("en", 1346);
      this.field_2134 = 0;
      this.field_2135 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 512)));
      this.field_2136 = var1.method_502("en", 1329);
      this.field_2137 = new Icon[3];
      this.field_2137[0] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 514)));
      this.field_2137[1] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 516)));
      this.field_2137[2] = new ImageIcon(this.getClass().getResource(var1.method_504("en", 515)));
      this.field_2138 = var1.method_502("en", 1330);
      this.field_2139 = var1.method_503("en", 1331);
      this.field_2140 = var1.method_502("en", 1332);
      this.field_2141 = var1.method_502("en", 1333);
      this.field_2142 = 0;
      this.field_2143 = var1.method_502("en", 1334);
      this.field_2144 = var1.method_502("en", 1335);
      this.field_2145 = var1.method_502("en", 1336);
      this.field_2146 = var1.method_502("en", 1337);
      this.field_2147 = var1.method_502("en", 1338);
      this.field_2148 = var1.method_502("en", 1339);
      this.field_2149 = var1.method_502("en", 1340);
      this.field_2150 = var1.method_502("en", 1341);
      this.field_2151 = var1.method_502("en", 1342);
      this.field_2152 = var1.method_502("en", 1343);
      this.field_2153 = var1.method_502("en", 1344);
      this.field_2154 = var1.method_502("en", 1345);
      this.field_2160 = var1.method_502("en", 1347);
      this.field_2161 = var1.method_502("en", 1348);
      this.field_2162 = var1.method_502("en", 1349);
      this.field_2163 = var1.method_502("en", 1350);
      this.field_2166 = 0;
      this.field_2167 = 0;
      this.field_2165 = -1;
      this.field_2155 = 18L;
      this.method_685(class_70.method_635());
   }

   // $VF: renamed from: b (aa, long) int
   @Override
   public int method_671(class_57 var1, long var2) {
      return this.field_2082;
   }

   // $VF: renamed from: a (byte) void
   @Override
   public void method_672(byte var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_673(Graphics var1, MastersOfDestiny var2) {
      this.field_2083.paintIcon(var2, var1, 0, 0);
      var1.setColor(new Color(8092539));
      var1.setFont(MastersOfDestiny.field_2814);
      int var3 = this.field_2101;

      for (int var4 = this.field_2110; var4 < this.field_2099.size(); var4++) {
         if (this.field_2105 == var4) {
            var1.setColor(new Color(10461087));
            var1.fillRect(this.field_2100, var3, this.field_2102, this.field_2103);
         }

         var1.setColor(Color.BLACK);
         String[] var5 = ((String)this.field_2099.elementAt(var4)).split("\\|");
         this.field_2095[Integer.parseInt(var5[0]) - 1]
            .paintIcon(var2, var1, this.field_2100 + 1, var3 + (this.field_2103 - this.field_2095[Integer.parseInt(var5[0]) - 1].getIconHeight()) / 2);
         var1.setFont(MastersOfDestiny.field_2841);
         var1.drawString(
            var5[1],
            this.field_2100 + 1 + this.field_2096 + (this.field_2097 - var1.getFontMetrics().stringWidth(var5[1])) / 2,
            var3 + 4 * (this.field_2103 / 5)
         );
         var1.setFont(MastersOfDestiny.field_2808);
         if (this.field_2123.contains(this.field_2099.elementAt(var4))) {
            var1.setFont(MastersOfDestiny.field_2810);
         }

         var1.drawString(var5[2], this.field_2100 + 1 + this.field_2095[Integer.parseInt(var5[0]) - 1].getIconWidth() + 2, var3 + 4 * (this.field_2103 / 5));
         var3 += this.field_2103;
         if (var3 >= this.field_2104) {
            break;
         }
      }

      int var9 = this.field_2113;

      for (int var10 = this.field_2122; var10 < this.field_2111.size(); var10++) {
         if (this.field_2117 == var10) {
            var1.setColor(new Color(10461087));
            var1.fillRect(this.field_2112, var9, this.field_2114, this.field_2115);
         }

         var1.setColor(Color.BLACK);
         String[] var6 = ((String)this.field_2111.elementAt(var10)).split("\\|");
         this.field_2095[Integer.parseInt(var6[0]) - 1]
            .paintIcon(var2, var1, this.field_2112 + 1, var9 + (this.field_2115 - this.field_2095[Integer.parseInt(var6[0]) - 1].getIconHeight()) / 2);
         var1.setFont(MastersOfDestiny.field_2841);
         var1.drawString(
            var6[1],
            this.field_2112 + 1 + this.field_2096 + (this.field_2097 - var1.getFontMetrics().stringWidth(var6[1])) / 2,
            var9 + 4 * (this.field_2115 / 5)
         );
         var1.setFont(MastersOfDestiny.field_2808);
         if (this.field_2123.contains(this.field_2111.elementAt(var10))) {
            var1.setFont(MastersOfDestiny.field_2810);
         }

         var1.drawString(var6[2], this.field_2112 + 1 + this.field_2095[Integer.parseInt(var6[0]) - 1].getIconWidth() + 2, var9 + 4 * (this.field_2115 / 5));
         var9 += this.field_2115;
         if (var9 >= this.field_2116) {
            break;
         }
      }

      int var11 = this.field_2130;

      for (int var12 = this.field_2142; var12 < this.field_2123.size(); var12++) {
         if (this.field_2134 == var12) {
            var1.setColor(new Color(10461087));
            var1.fillRect(this.field_2129, var11, this.field_2131, this.field_2132);
         }

         var1.setColor(Color.BLACK);
         String[] var7 = ((String)this.field_2123.elementAt(var12)).split("\\|");
         this.field_2095[Integer.parseInt(var7[0]) - 1]
            .paintIcon(var2, var1, this.field_2129 + 3, var11 + (this.field_2132 - this.field_2095[Integer.parseInt(var7[0]) - 1].getIconHeight()) / 2);
         var1.setFont(MastersOfDestiny.field_2841);
         var1.drawString(
            var7[1],
            this.field_2129 + 3 + this.field_2096 + (this.field_2097 - var1.getFontMetrics().stringWidth(var7[1])) / 2,
            var11 + 4 * (this.field_2132 / 5)
         );
         var1.setFont(MastersOfDestiny.field_2808);
         var1.drawString(var7[2], this.field_2129 + 3 + this.field_2095[Integer.parseInt(var7[0]) - 1].getIconWidth() + 2, var11 + 4 * (this.field_2132 / 5));
         this.field_2135.paintIcon(var2, var1, this.field_2136, var11 + (this.field_2132 - this.field_2135.getIconHeight()) / 2);
         byte var8 = (Byte)this.field_2124.elementAt(var12);
         if (var8 != -1) {
            this.field_2137[var8]
               .paintIcon(
                  var2,
                  var1,
                  this.field_2136 + (this.field_2135.getIconWidth() - this.field_2137[var8].getIconWidth()) / 2,
                  var11 + (this.field_2132 - this.field_2137[var8].getIconHeight()) / 2
               );
         }

         var11 += this.field_2132;
         if (var11 >= this.field_2133) {
            break;
         }
      }

      if (this.field_2165 != -1) {
         this.field_2164[this.field_2165].paintIcon(var2, var1, this.field_2166, this.field_2167);
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
            this.method_685(class_68.method_622(Long.toString(class_57.field_1525), this.field_2081.field_1526));
         case 0:
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 8:
         default:
            break;
         case 3:
            class_62.method_563("avail players: " + var1[1]);
            int var2 = Integer.parseInt(var1[2]);
            int var3 = Integer.parseInt(var1[3]);
            this.field_2098 = this.field_2168.field_1271.method_662();

            for (int var8 = 0; var8 < this.field_2098.length; var8++) {
               class_62.method_563("buddies " + var8 + " : " + this.field_2098[var8]);
               if (this.field_2098[var8].equalsIgnoreCase(var1[1])) {
                  this.field_2099.add(var2 + "|" + var3 + "|" + this.field_2098[var8]);
                  return;
               }
            }

            this.field_2111.add(var2 + "|" + var3 + "|" + var1[1]);
            break;
         case 4:
            field_2169 = Long.parseLong(var1[1]);
            field_2170 = var1[2];
            field_2171 = Integer.parseInt(var1[3]);
            this.method_685(class_70.method_651());
            break;
         case 9:
            if (var1[4].equalsIgnoreCase("Y")) {
               class_62.method_563("ok.." + var1[1] + " accepted");
               Enumeration var6 = this.field_2123.elements();
               int var9 = 0;

               while (var6.hasMoreElements() && !((String)var6.nextElement()).endsWith(var1[1])) {
                  var9++;
               }

               this.field_2124.removeElementAt(var9);
               this.field_2124.insertElementAt((byte)0, var9);
            } else if (var1[4].equalsIgnoreCase("N")) {
               class_62.method_563("ok.." + var1[1] + " declined");
               Enumeration var7 = this.field_2123.elements();
               int var10 = 0;

               while (var7.hasMoreElements() && !((String)var7.nextElement()).endsWith(var1[1])) {
                  var10++;
               }

               this.field_2124.removeElementAt(var10);
               this.field_2124.insertElementAt((byte)1, var10);
            }
            break;
         case 10:
            class_62.method_563("ok.." + var1[1] + " declined");
            Enumeration var4 = this.field_2123.elements();
            int var5 = 0;

            while (var4.hasMoreElements() && !((String)var4.nextElement()).endsWith(var1[1])) {
               var5++;
            }

            class_62.method_563("hq test: index=" + var5);
            this.field_2124.removeElementAt(var5);
            this.field_2124.insertElementAt((byte)1, var5);
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_685(String var1) {
      this.field_2168.field_435.write(var1);
      this.field_2168.field_435.flush();
      class_62.method_563("sent: " + var1);
   }

   // $VF: renamed from: a () void
   @Override
   public void method_676() {
   }

   // $VF: renamed from: a (long) java.lang.String
   private String method_686(long var1) {
      return this.field_2081.field_1542.method_136(var1).method_140();
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   @Override
   public void method_677(MouseEvent var1) {
      int var2 = this.field_2101;

      for (int var3 = this.field_2110; var3 < this.field_2099.size(); var3++) {
         if (var1.getX() > this.field_2100 && var1.getX() < this.field_2100 + this.field_2102 && var1.getY() > var2 && var1.getY() < var2 + this.field_2103) {
            this.field_2105 = var3;
            this.field_2117 = -1;
            break;
         }

         var2 += this.field_2103;
         if (var2 >= this.field_2104) {
            break;
         }
      }

      if (var1.getX() > this.field_2106
         && var1.getX() < this.field_2106 + this.field_2108
         && var1.getY() > this.field_2107[0]
         && var1.getY() < this.field_2107[0] + this.field_2109) {
         if (this.field_2110 > 0) {
            this.field_2110--;
         }
      } else if (var1.getX() > this.field_2106
         && var1.getX() < this.field_2106 + this.field_2108
         && var1.getY() > this.field_2107[1]
         && var1.getY() < this.field_2107[1] + this.field_2109) {
         if (this.field_2099.size() - this.field_2110 > (this.field_2104 - this.field_2101) / this.field_2103) {
            this.field_2110++;
         }
      } else {
         int var8 = this.field_2113;

         for (int var4 = this.field_2122; var4 < this.field_2111.size(); var4++) {
            if (var1.getX() > this.field_2112 && var1.getX() < this.field_2112 + this.field_2114 && var1.getY() > var8 && var1.getY() < var8 + this.field_2115) {
               this.field_2117 = var4;
               this.field_2105 = -1;
               break;
            }

            var8 += this.field_2115;
            if (var8 >= this.field_2116) {
               break;
            }
         }

         if (var1.getX() > this.field_2118
            && var1.getX() < this.field_2118 + this.field_2120
            && var1.getY() > this.field_2119[0]
            && var1.getY() < this.field_2119[0] + this.field_2121) {
            if (this.field_2122 > 0) {
               this.field_2122--;
            }
         } else if (var1.getX() > this.field_2118
            && var1.getX() < this.field_2118 + this.field_2120
            && var1.getY() > this.field_2119[1]
            && var1.getY() < this.field_2119[1] + this.field_2121) {
            if (this.field_2111.size() - this.field_2122 > (this.field_2116 - this.field_2113) / this.field_2115) {
               this.field_2122++;
            }
         } else {
            int var9 = this.field_2130;

            for (int var5 = this.field_2142; var5 < this.field_2123.size(); var5++) {
               if (var1.getX() > this.field_2129
                  && var1.getX() < this.field_2129 + this.field_2131
                  && var1.getY() > var9
                  && var1.getY() < var9 + this.field_2132) {
                  this.field_2134 = var5;
                  class_62.method_563("selectedPartySelection = " + this.field_2134);
                  return;
               }

               var9 += this.field_2132;
               if (var9 >= this.field_2133) {
                  break;
               }
            }

            if (var1.getX() > this.field_2138
               && var1.getX() < this.field_2138 + this.field_2140
               && var1.getY() > this.field_2139[0]
               && var1.getY() < this.field_2139[0] + this.field_2141) {
               if (this.field_2142 > 0) {
                  this.field_2142--;
               }
            } else if (var1.getX() > this.field_2138
               && var1.getX() < this.field_2138 + this.field_2140
               && var1.getY() > this.field_2139[1]
               && var1.getY() < this.field_2139[1] + this.field_2141) {
               if (this.field_2123.size() - this.field_2142 > (this.field_2133 - this.field_2130) / this.field_2132 + 1) {
                  this.field_2142++;
               }
            } else {
               if (var1.getX() > this.field_2143
                  && var1.getX() < this.field_2143 + this.field_2145
                  && var1.getY() > this.field_2144
                  && var1.getY() < this.field_2144 + this.field_2146) {
                  if (this.field_2117 >= 0) {
                     if (!this.field_2123.contains((String)this.field_2111.elementAt(this.field_2117))) {
                        String[] var12 = ((String)this.field_2111.elementAt(this.field_2117)).split("\\|");
                        this.method_685(class_70.method_640(var12[2], "P", this.field_2155));
                        this.field_2123.add((String)this.field_2111.elementAt(this.field_2117));
                        this.field_2124.add((byte)-1);
                     }

                     return;
                  }

                  if (this.field_2105 >= 0) {
                     if (!this.field_2123.contains((String)this.field_2099.elementAt(this.field_2105))) {
                        String[] var11 = ((String)this.field_2099.elementAt(this.field_2105)).split("\\|");
                        this.method_685(class_70.method_640(var11[2], "P", this.field_2155));
                        this.field_2123.add((String)this.field_2099.elementAt(this.field_2105));
                        this.field_2124.add((byte)-1);
                     }

                     return;
                  }
               }

               if (var1.getX() > this.field_2147
                  && var1.getX() < this.field_2147 + this.field_2149
                  && var1.getY() > this.field_2148
                  && var1.getY() < this.field_2148 + this.field_2150) {
                  this.field_2111.clear();
                  this.field_2099.clear();
                  this.method_685(class_70.method_651());
               } else if (var1.getX() > this.field_2151
                  && var1.getX() < this.field_2151 + this.field_2153
                  && var1.getY() > this.field_2152
                  && var1.getY() < this.field_2152 + this.field_2154) {
                  class_62.method_563("sorry no remove protocol yet");
                  int var10 = this.field_2130;

                  for (int var6 = this.field_2142; var6 < this.field_2123.size(); var6++) {
                     if (this.field_2134 == var6) {
                        if ((Byte)this.field_2124.elementAt(var6) == -1 || (Byte)this.field_2124.elementAt(var6) == 0) {
                           String[] var7 = ((String)this.field_2123.elementAt(var6)).split("\\|");
                           this.method_685(class_70.method_652(var7[2], "P", this.field_2155));
                        }

                        this.field_2123.removeElementAt(var6);
                        this.field_2124.removeElementAt(var6);
                     }

                     var10 += this.field_2132;
                     if (var10 >= this.field_2133) {
                        break;
                     }
                  }
               } else if (!this.field_2087
                  && var1.getX() >= this.field_2088
                  && var1.getX() <= this.field_2088 + this.field_2090
                  && var1.getY() >= this.field_2089
                  && var1.getY() <= this.field_2089 + this.field_2091) {
                  this.method_685(class_70.method_637(field_2169, this.field_2155));
                  this.method_685(class_70.method_639(field_2169));
                  this.field_2087 = true;
               } else if (var1.getX() > this.field_2160
                  && var1.getX() < this.field_2160 + this.field_2162
                  && var1.getY() > this.field_2161
                  && var1.getY() < this.field_2161 + this.field_2163) {
                  this.method_685(class_70.method_647(field_2169));
                  this.method_685(class_70.method_646(field_2169));
                  this.field_2165 = -1;
                  this.field_2082 = 5;
               } else if (var1.getX() == this.field_2156 && var1.getY() == this.field_2157 && this.field_2158 >= System.currentTimeMillis()) {
                  this.method_687(var1);
                  this.field_2156 = 0;
                  this.field_2157 = 0;
                  this.field_2158 = 0L;
               } else {
                  this.field_2156 = var1.getX();
                  this.field_2157 = var1.getY();
                  this.field_2158 = System.currentTimeMillis() + 300L;
               }
            }
         }
      }
   }

   // $VF: renamed from: f (java.awt.event.MouseEvent) void
   private void method_687(MouseEvent var1) {
      int var2 = this.field_2101;

      for (int var3 = this.field_2110; var3 < this.field_2099.size(); var3++) {
         if (var1.getX() > this.field_2100 && var1.getX() < this.field_2100 + this.field_2102 && var1.getY() > var2 && var1.getY() < var2 + this.field_2103) {
            class_62.method_563("invite players double click");
            String[] var4 = ((String)this.field_2099.elementAt(var3)).split("\\|");
            this.method_685(class_70.method_640(var4[2], "P", this.field_2155));
            this.field_2123.add((String)this.field_2099.elementAt(var3));
            this.field_2124.add((byte)-1);
            return;
         }

         var2 += this.field_2103;
         if (var2 >= this.field_2104) {
            break;
         }
      }

      int var6 = this.field_2113;

      for (int var7 = this.field_2122; var7 < this.field_2111.size(); var7++) {
         if (var1.getX() > this.field_2112 && var1.getX() < this.field_2112 + this.field_2114 && var1.getY() > var6 && var1.getY() < var6 + this.field_2115) {
            class_62.method_563("avail players double click");
            String[] var5 = ((String)this.field_2111.elementAt(var7)).split("\\|");
            this.method_685(class_70.method_640(var5[2], "P", this.field_2155));
            this.field_2123.add((String)this.field_2111.elementAt(var7));
            this.field_2124.add((byte)-1);
            return;
         }

         var6 += this.field_2115;
         if (var6 >= this.field_2116) {
            break;
         }
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   @Override
   public void method_678(MouseEvent var1) {
      this.field_2165 = -1;
      if (var1.getX() > this.field_2160
         && var1.getX() < this.field_2160 + this.field_2162
         && var1.getY() > this.field_2161
         && var1.getY() < this.field_2161 + this.field_2163) {
         this.field_2165 = 0;
         this.field_2166 = this.field_2160;
         this.field_2167 = this.field_2161;
      } else if (!this.field_2087
         && var1.getX() >= this.field_2088
         && var1.getX() <= this.field_2088 + this.field_2090
         && var1.getY() >= this.field_2089
         && var1.getY() <= this.field_2089 + this.field_2091) {
         this.field_2165 = 3;
         this.field_2166 = this.field_2088;
         this.field_2167 = this.field_2089;
      } else if (var1.getX() > this.field_2143
         && var1.getX() < this.field_2143 + this.field_2145
         && var1.getY() > this.field_2144
         && var1.getY() < this.field_2144 + this.field_2146) {
         this.field_2165 = 1;
         this.field_2166 = this.field_2143;
         this.field_2167 = this.field_2144;
      } else if (var1.getX() > this.field_2147
         && var1.getX() < this.field_2147 + this.field_2149
         && var1.getY() > this.field_2148
         && var1.getY() < this.field_2148 + this.field_2150) {
         this.field_2165 = 1;
         this.field_2166 = this.field_2147;
         this.field_2167 = this.field_2148;
      } else if (var1.getX() > this.field_2151
         && var1.getX() < this.field_2151 + this.field_2153
         && var1.getY() > this.field_2152
         && var1.getY() < this.field_2152 + this.field_2154) {
         this.field_2165 = 2;
         this.field_2166 = this.field_2151;
         this.field_2167 = this.field_2152;
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
