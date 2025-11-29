import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: B
public class class_91 extends class_86 {
   // $VF: renamed from: j java.lang.String
   private String field_3106;
   // $VF: renamed from: k java.util.Vector
   private Vector field_3107 = new Vector();
   // $VF: renamed from: l java.awt.FontMetrics
   private FontMetrics field_3108;
   // $VF: renamed from: m java.awt.Font
   private Font field_3109;
   // $VF: renamed from: n int
   private int field_3110;
   // $VF: renamed from: o int
   private int field_3111;
   // $VF: renamed from: p int
   private int field_3112;
   // $VF: renamed from: q int
   private int field_3113;
   // $VF: renamed from: r javax.swing.Icon
   private Icon field_3114;
   // $VF: renamed from: s int
   private int field_3115;
   // $VF: renamed from: t int
   private int field_3116;

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

   // $VF: renamed from: a (int, int, int, int, java.lang.String, int, int) void
   public void method_874(int var1, int var2, int var3, int var4, String var5, int var6, int var7) {
      this.field_3110 = var1;
      this.field_3111 = var2;
      this.field_3112 = var3;
      this.field_3113 = var4;
      this.field_3114 = new ImageIcon(this.getClass().getResource(var5));
      this.field_3115 = var6;
      this.field_3116 = var7;
   }

   // $VF: renamed from: a (java.lang.String, java.awt.Font, java.awt.FontMetrics) void
   public void method_875(String var1, Font var2, FontMetrics var3) {
      this.field_3106 = var1;
      this.field_3109 = var2;
      this.field_3108 = var3;
      this.field_3107.removeAllElements();
      boolean var4 = false;
      int var5 = 0;
      int var6 = 0;
      boolean var7 = false;
      if (var1 == null) {
         var4 = true;
      }

      label49:
      while (!var4) {
         int var8 = 0;

         for (var6 = var5; var5 < var1.length(); var5++) {
            char var9 = var1.charAt(var5);
            if ('\n' == var9) {
               this.field_3107.addElement(new Integer(var6));
               this.field_3107.addElement(new Integer(var5));
               var5++;
               continue label49;
            }

            int var10 = var3.charWidth(var9);
            if (var8 + var10 > this.field_3112) {
               if (var1.charAt(var5) == ' ') {
                  this.field_3107.addElement(new Integer(var6));
                  this.field_3107.addElement(new Integer(var5));
                  var5++;
                  continue label49;
               }

               int var11 = var5;

               while (true) {
                  if (var11 > var6) {
                     if (var1.charAt(--var11) != ' ') {
                        continue;
                     }
                  }

                  if (var11 != var6) {
                     this.field_3107.addElement(new Integer(var6));
                     this.field_3107.addElement(new Integer(var11));
                     var5 = var11 + 1;
                  } else {
                     this.field_3107.addElement(new Integer(var6));
                     this.field_3107.addElement(new Integer(var5));
                  }
                  continue label49;
               }
            }

            var8 += var10;
         }

         this.field_3107.addElement(new Integer(var6));
         this.field_3107.addElement(new Integer(var1.length() - 1));
         var4 = true;
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_793(Graphics var1, MastersOfDestiny var2) {
      this.field_3114.paintIcon(var2, var1, this.field_3115, this.field_3116);
      var1.setFont(this.field_3109);
      var1.setColor(new Color(8838126));
      int var3 = this.field_3108.getHeight();
      int var5 = this.field_3111 + (this.field_3113 - this.field_3107.size() / 2 * var3) / 2;

      for (Enumeration var6 = this.field_3107.elements(); var6.hasMoreElements(); var5 += var3) {
         int var7 = (Integer)var6.nextElement();
         int var8 = (Integer)var6.nextElement();
         int var4 = (this.field_3112 - this.field_3108.stringWidth(this.field_3106.substring(var7, var8))) / 2 + this.field_3110;

         for (int var9 = var7; var9 <= var8; var9++) {
            var1.drawString(Character.toString(this.field_3106.charAt(var9)), var4, var5);
            var4 += this.field_3108.charWidth(this.field_3106.charAt(var9));
         }
      }
   }
}
