import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

// $VF: renamed from: ai
public class class_63 {
   // $VF: renamed from: a byte
   public static final byte field_1658 = 0;
   // $VF: renamed from: b byte
   public static final byte field_1659 = 1;
   // $VF: renamed from: c byte
   public static final byte field_1660 = 2;
   // $VF: renamed from: d byte
   public static final byte field_1661 = 3;
   // $VF: renamed from: e java.util.Vector
   Vector field_1662 = new Vector();
   // $VF: renamed from: f java.lang.String
   String field_1663;
   // $VF: renamed from: g int
   int field_1664;
   // $VF: renamed from: h int
   int field_1665;
   // $VF: renamed from: i int
   int field_1666;
   // $VF: renamed from: j int
   int field_1667;
   // $VF: renamed from: k int
   final int field_1668 = 200;
   // $VF: renamed from: l int
   int field_1669;
   // $VF: renamed from: m java.awt.Font
   Font field_1670;
   // $VF: renamed from: n java.awt.FontMetrics
   FontMetrics field_1671;
   // $VF: renamed from: o int
   int field_1672;
   // $VF: renamed from: p int
   int field_1673;

   // $VF: renamed from: a () void
   public void method_566() {
      this.field_1662.removeAllElements();
      this.field_1673 = 0;
   }

   // $VF: renamed from: a (int, int, int, int, java.awt.Font, java.awt.FontMetrics) void
   public void method_567(int var1, int var2, int var3, int var4, Font var5, FontMetrics var6) {
      this.field_1664 = var1;
      this.field_1665 = var2;
      this.field_1666 = var3;
      this.field_1667 = var4;
      this.field_1670 = var5;
      this.field_1671 = var6;
      this.field_1669 = var4 / var6.getHeight();
      if (this.field_1669 > 200) {
         this.field_1669 = 200;
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   private void method_568(String var1) {
      if (this.field_1662.size() > 200) {
         this.field_1662.removeElementAt(0);
      }

      this.field_1662.addElement(var1);
      this.field_1672 = this.field_1662.size() - this.field_1669;
      if (this.field_1672 < 0) {
         this.field_1672 = 0;
      }
   }

   // $VF: renamed from: a (java.lang.String, int, int) void
   public void method_569(String var1, int var2, int var3) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = true;
      int var7 = 0;
      boolean var8 = false;

      label72:
      while (!var4) {
         int var9 = 0;

         for (var7 = var5; var5 < var1.length(); var5++) {
            char var10 = var1.charAt(var5);
            if ('\n' == var10) {
               String var16 = var1.substring(var7, var5);
               if (var6) {
                  this.method_568(var2 + "|" + var3 + "|" + var16);
               } else {
                  this.method_568(var3 + "|" + var3 + "|" + var16);
               }

               var6 = false;
               var5++;
               continue label72;
            }

            int var11 = this.field_1671.charWidth(var10);
            if (var9 + var11 > this.field_1666 - 15) {
               if (var1.charAt(var5) == ' ') {
                  String var17 = var1.substring(var7, var5);
                  if (var6) {
                     this.method_568(var2 + "|" + var3 + "|" + var17);
                  } else {
                     this.method_568(var3 + "|" + var3 + "|" + var17);
                  }

                  var6 = false;
                  var5++;
                  continue label72;
               }

               int var12 = var5;

               while (true) {
                  if (var12 > var7) {
                     if (var1.charAt(--var12) != ' ') {
                        continue;
                     }
                  }

                  if (var12 != var7) {
                     String var13 = var1.substring(var7, var12);
                     if (var6) {
                        this.method_568(var2 + "|" + var3 + "|" + var13);
                     } else {
                        this.method_568(var3 + "|" + var3 + "|" + var13);
                     }

                     var6 = false;
                     var5 = var12 + 1;
                  } else {
                     String var18 = var1.substring(var7, var5);
                     if (var6) {
                        this.method_568(var2 + "|" + var3 + "|" + var18);
                     } else {
                        this.method_568(var3 + "|" + var3 + "|" + var18);
                     }

                     var6 = false;
                  }
                  continue label72;
               }
            }

            var9 += var11;
         }

         String var15 = var1.substring(var7, var1.length());
         if (var6) {
            this.method_568(var2 + "|" + var3 + "|" + var15);
         } else {
            this.method_568(var3 + "|" + var3 + "|" + var15);
         }

         var6 = false;
         var4 = true;
      }
   }

   // $VF: renamed from: b () void
   public void method_570() {
      this.field_1662.removeAllElements();
   }

   // $VF: renamed from: a (byte) boolean
   public boolean method_571(byte var1) {
      switch (var1) {
         case 0:
            this.field_1673++;
            if (this.field_1673 > this.field_1672) {
               this.field_1673 = this.field_1672;
               return false;
            }

            return true;
         case 1:
            this.field_1673--;
            if (this.field_1673 < 0) {
               this.field_1673 = 0;
               return false;
            }

            return true;
         case 2:
            this.field_1673 = this.field_1672;
            return true;
         case 3:
            this.field_1673 = 0;
            return true;
         default:
            class_62.method_563("ConsoleEntity.scroll - error: invalid scroll id");
            return true;
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_572(Graphics var1, MastersOfDestiny var2) {
      int var3 = this.field_1671.getHeight();
      int var4 = this.field_1664;
      int var5 = this.field_1665 + var3;
      var1.setFont(this.field_1670);
      int var6 = this.field_1662.size() - this.field_1669 - this.field_1673;
      if (var6 < 0) {
         var6 = 0;
      }

      for (int var7 = var6; var7 < this.field_1662.size(); var7++) {
         int var8 = var4;
         String var9 = (String)this.field_1662.elementAt(var7);
         String[] var10 = var9.split("\\|");

         try {
            byte[] var11 = var10[2].getBytes();
            var10[2] = new String(var11, "UTF-8");
         } catch (UnsupportedEncodingException var13) {
            class_62.method_563(var13);
         }

         if (var10[2].indexOf(":") != -1) {
            var1.setColor(new Color(Integer.parseInt(var10[0])));
            String var14 = var10[2].substring(0, var10[2].indexOf(":") + 1);

            for (int var12 = 0; var12 < var14.length(); var12++) {
               var1.drawString(Character.toString(var14.charAt(var12)), var8, var5);
               var8 += this.field_1671.charWidth(var14.charAt(var12));
            }

            var1.setColor(new Color(Integer.parseInt(var10[1])));
            var14 = var10[2].substring(var10[2].indexOf(":") + 1);

            for (int var17 = 0; var17 < var14.length(); var17++) {
               var1.drawString(Character.toString(var14.charAt(var17)), var8, var5);
               var8 += this.field_1671.charWidth(var14.charAt(var17));
            }
         } else {
            var1.setColor(new Color(Integer.parseInt(var10[1])));

            for (int var16 = 0; var16 < var10[2].length(); var16++) {
               var1.drawString(Character.toString(var10[2].charAt(var16)), var8, var5);
               var8 += this.field_1671.charWidth(var10[2].charAt(var16));
            }
         }

         var5 += var3;
         if (var7 == var6 + this.field_1669 - 1) {
            break;
         }
      }
   }
}
