import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: ak
public class class_87 extends class_86 {
   // $VF: renamed from: j java.lang.String
   String field_2993;
   // $VF: renamed from: A java.util.Vector
   private Vector field_2994 = new Vector();
   // $VF: renamed from: k int
   int field_2995;
   // $VF: renamed from: l int
   int field_2996;
   // $VF: renamed from: m int
   int field_2997;
   // $VF: renamed from: n int
   int field_2998;
   // $VF: renamed from: o int
   int field_2999;
   // $VF: renamed from: p javax.swing.Icon
   Icon field_3000;
   // $VF: renamed from: q java.util.Vector
   static Vector field_3001 = new Vector();
   // $VF: renamed from: r byte
   static final byte field_3002 = -1;
   // $VF: renamed from: s byte
   static final byte field_3003 = 0;
   // $VF: renamed from: t byte
   static final byte field_3004 = 1;
   // $VF: renamed from: u byte
   static final byte field_3005 = 2;
   // $VF: renamed from: v byte
   static final byte field_3006 = 3;
   // $VF: renamed from: w byte
   static final byte field_3007 = 4;
   // $VF: renamed from: x byte
   static final byte field_3008 = 5;
   // $VF: renamed from: y byte
   static final byte field_3009 = 6;
   // $VF: renamed from: z byte
   byte field_3010;

   // $VF: renamed from: m () ak
   public static class_87 method_803() {
      class_86 var0 = null;
      Enumeration var1 = field_3001.elements();

      while (var1.hasMoreElements()) {
         var0 = (class_86)var1.nextElement();
         if (var0.method_796()) {
            var0.field_2992 = 0;
            var0.method_790();
            return (class_87)var0;
         }
      }

      class_87 var3 = new class_87();
      var3.field_2992 = 0;
      var3.method_790();
      field_3001.addElement(var3);
      return var3;
   }

   // $VF: renamed from: a (byte) void
   public void method_804(byte var1) {
      this.field_3010 = var1;
   }

   // $VF: renamed from: a () int
   @Override
   public int method_784() {
      return 1;
   }

   // $VF: renamed from: a (ac) boolean
   @Override
   public boolean method_785(class_86 var1) {
      return false;
   }

   // $VF: renamed from: b (ac) boolean
   @Override
   public boolean method_786(class_86 var1) {
      return false;
   }

   // $VF: renamed from: b () java.util.Enumeration
   @Override
   public Enumeration method_787() {
      return null;
   }

   // $VF: renamed from: a (java.lang.String, int, int, int, int, java.awt.FontMetrics, java.lang.String) void
   public void method_805(String var1, int var2, int var3, int var4, int var5, FontMetrics var6, String var7) {
      this.field_2993 = var1;
      this.field_2994.removeAllElements();
      this.field_2995 = var2;
      this.field_2996 = var3;
      this.field_2997 = var4;
      this.field_2998 = var5;
      if (var7 != null) {
         this.field_3000 = new ImageIcon(this.getClass().getResource(var7));
      }

      boolean var8 = false;
      int var9 = 0;
      int var10 = 0;
      boolean var11 = false;
      if (var1 == null) {
         var8 = true;
      }

      label55:
      while (!var8) {
         int var12 = 0;
         var10 = var9;

         while (var9 < var1.length()) {
            char var13 = var1.charAt(var9);
            if ('\n' == var13) {
               if (this.field_3010 != 1) {
                  this.field_2994.addElement(new Integer(var10));
                  this.field_2994.addElement(new Integer(var9));
                  var9++;
                  continue label55;
               }
            } else {
               int var14 = var6.charWidth(var13);
               if (var12 + var14 > var4) {
                  if (var1.charAt(var9) == ' ') {
                     this.field_2994.addElement(new Integer(var10));
                     this.field_2994.addElement(new Integer(var9));
                     var9++;
                     continue label55;
                  }

                  int var15 = var9;

                  while (true) {
                     if (var15 > var10) {
                        if (var1.charAt(--var15) != ' ') {
                           continue;
                        }
                     }

                     if (var15 != var10) {
                        this.field_2994.addElement(new Integer(var10));
                        this.field_2994.addElement(new Integer(var15));
                        var9 = var15 + 1;
                     } else {
                        this.field_2994.addElement(new Integer(var10));
                        this.field_2994.addElement(new Integer(var9));
                     }
                     continue label55;
                  }
               }

               var12 += var14;
               var9++;
            }
         }

         this.field_2994.addElement(new Integer(var10));
         this.field_2994.addElement(new Integer(var1.length() - 1));
         var8 = true;
      }

      this.field_2999 = (this.field_2994.size() >> 1) * var6.getHeight() + 4;
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_793(Graphics var1, MastersOfDestiny var2) {
      int var3 = 10;
      if (this.field_3010 == 0) {
         var3 = MastersOfDestiny.field_2811.getHeight();
      } else {
         var3 = var1.getFontMetrics(var1.getFont()).getHeight();
      }

      int var4 = this.field_2995;
      int var5 = this.field_2996;
      int var6 = this.field_2997;
      switch (this.field_3010) {
         case 0:
            this.field_3000.paintIcon(GameStates.field_1274, var1, var4, var5);
            var1.setColor(new Color(8838126));
            var5 += 30;
            break;
         case 1:
            var1.setColor(new Color(0));
            break;
         case 2:
            var1.setColor(new Color(0));
            var1.fillRect(var4, var5, var6 + 20, this.field_2999);
            var1.setColor(new Color(3305332));
            var1.drawRect(var4, var5, var6 + 20, this.field_2999);
            var1.drawRect(var4 + 1, var5 + 1, var6 + 18, this.field_2999 - 2);
            var1.setColor(new Color(16777215));
            var5 += var3;
            break;
         case 3:
            var1.setColor(new Color(0));
            var1.fillRect(var4, var5, var6 + 151, this.field_2999);
            var1.setColor(new Color(5761261));
            var1.drawRect(var4, var5, var6 + 151, this.field_2999);
            var1.drawRect(var4 + 1, var5 + 1, var6 + 149, this.field_2999 - 2);
            var1.setColor(new Color(3305332));
            var1.drawLine(var4 + var6, var5 + 2, var4 + var6, var5 + this.field_2999 - 2);
            var1.drawLine(var4 + var6 - 1, var5 + 2, var4 + var6 - 1, var5 + this.field_2999 - 2);
            var1.setColor(new Color(16777215));
            var5 += var3;
            break;
         case 4:
            var1.setColor(new Color(0));
            var1.fillRect(var4 - 18, var5, var6 + 20, this.field_2999);
            var1.setColor(new Color(3305332));
            var1.drawRect(var4 - 18, var5, var6 + 20, this.field_2999);
            var1.drawRect(var4 - 17, var5 + 1, var6 + 18, this.field_2999 - 2);
            var1.setColor(new Color(16777215));
            var5 += var3;
            break;
         case 5:
            var1.setColor(new Color(6710886));
            break;
         case 6:
            var1.setColor(new Color(0));
            var1.fillRect(var4 - 18, var5, var6 + 20, this.field_2999);
            var1.setColor(new Color(3305332));
            var1.drawRect(var4 - 18, var5, var6 + 20, this.field_2999);
            var1.drawRect(var4 - 17, var5 + 1, var6 + 18, this.field_2999 - 2);
            var1.setColor(new Color(16777215));
            var5 += var3;
      }

      if (this.field_3010 == 1) {
         var1.setFont(MastersOfDestiny.field_2847);
         if (this.field_2994.size() > 4) {
            int var7 = (Integer)this.field_2994.get(0);
            int var8 = (Integer)this.field_2994.get(1);
            int var9 = var8 - var7;
            int var10 = var4;

            for (int var11 = var7; var11 <= var8; var11++) {
               var1.drawString(Character.toString(this.field_2993.charAt(var11)), var10, var5);
               var10 += var1.getFontMetrics(var1.getFont()).charWidth(this.field_2993.charAt(var11));
            }

            var5 += var3;
            var7 = (Integer)this.field_2994.get(2);
            var8 = (Integer)this.field_2994.get(3);
            var10 = var4;
            if (var8 - var7 >= var9 - 3) {
               var8 -= 3;
            }

            for (int var26 = var7; var26 <= var8; var26++) {
               var1.drawString(Character.toString(this.field_2993.charAt(var26)), var10, var5);
               var10 += var1.getFontMetrics(var1.getFont()).charWidth(this.field_2993.charAt(var26));
            }

            for (int var27 = 0; var27 < 3; var27++) {
               var1.drawString(".", var10, var5);
               var10 += var1.getFontMetrics(var1.getFont()).charWidth(this.field_2993.charAt(var27));
            }

            var5 += var3;
         } else {
            for (Enumeration var16 = this.field_2994.elements(); var16.hasMoreElements(); var5 += var3) {
               int var19 = (Integer)var16.nextElement();
               int var21 = (Integer)var16.nextElement();
               int var24 = var4;

               for (int var28 = var19; var28 <= var21; var28++) {
                  var1.drawString(Character.toString(this.field_2993.charAt(var28)), var24, var5);
                  var24 += var1.getFontMetrics(var1.getFont()).charWidth(this.field_2993.charAt(var28));
               }
            }
         }
      } else {
         for (Enumeration var17 = this.field_2994.elements(); var17.hasMoreElements(); var5 += var3) {
            int var20 = (Integer)var17.nextElement();
            int var22 = (Integer)var17.nextElement();
            int var25 = var4;
            if (this.field_3010 == 0) {
               var25 = var4 + 50;
            } else if (this.field_3010 == 2 || this.field_3010 == 3) {
               var25 = var4 + var1.getFontMetrics(var1.getFont()).getHeight() / 2;
            }

            for (int var29 = var20; var29 <= var22; var29++) {
               var1.drawString(Character.toString(this.field_2993.charAt(var29)), var25, var5);
               if (this.field_3010 == 0) {
                  var25 += MastersOfDestiny.field_2811.charWidth(this.field_2993.charAt(var29));
               } else {
                  var25 += var1.getFontMetrics(var1.getFont()).charWidth(this.field_2993.charAt(var29));
               }
            }
         }
      }
   }
}
