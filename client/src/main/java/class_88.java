import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Enumeration;
import javax.swing.Icon;

// $VF: renamed from: C
public class class_88 extends class_86 {
   // $VF: renamed from: j javax.swing.Icon
   Icon field_3011;
   // $VF: renamed from: k java.awt.image.BufferedImage
   BufferedImage field_3012;
   // $VF: renamed from: l byte
   byte field_3013;
   // $VF: renamed from: m int
   int field_3014;
   // $VF: renamed from: n int
   int field_3015;
   // $VF: renamed from: o boolean
   boolean field_3016;

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

   // $VF: renamed from: d () void
   @Override
   public void method_790() {
      this.field_3011 = null;
      this.field_3014 = 0;
      this.field_3015 = 0;
      this.field_3013 = -1;
      this.field_3016 = false;
   }

   // $VF: renamed from: a (byte) void
   void method_806(byte var1) {
      this.field_3013 = var1;
   }

   // $VF: renamed from: a (int, int) void
   void method_807(int var1, int var2) {
      this.field_3014 = var1;
      this.field_3015 = var2;
   }

   // $VF: renamed from: a (javax.swing.Icon, java.awt.image.BufferedImage) void
   void method_808(Icon var1, BufferedImage var2) {
      this.field_3011 = var1;
      this.field_3012 = var2;
   }

   // $VF: renamed from: m () byte
   public byte method_809() {
      return this.field_3013;
   }

   // $VF: renamed from: i () int
   @Override
   public int method_799() {
      return this.field_3011 != null ? this.field_3011.getIconWidth() : 0;
   }

   // $VF: renamed from: j () int
   @Override
   public int method_800() {
      return this.field_3011 != null ? this.field_3011.getIconHeight() : 0;
   }

   // $VF: renamed from: k () int
   @Override
   public int method_801() {
      return this.field_3014;
   }

   // $VF: renamed from: l () int
   @Override
   public int method_802() {
      return this.field_3015;
   }

   // $VF: renamed from: a (long) void
   @Override
   public void method_791(long var1) {
      this.field_3016 = false;
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_793(Graphics var1, MastersOfDestiny var2) {
      if (this.field_3016) {
         this.field_3011.paintIcon(GameStates.field_1274, var1, this.field_3014, this.field_3015);
      }
   }

   // $VF: renamed from: a (int, int, int, int) void
   public void method_810(int var1, int var2, int var3, int var4) {
      try {
         if (var1 > this.field_3014 && var2 > this.field_3015) {
            int[] var5 = new int[var3 * var4];
            var1 -= this.field_3014;
            var2 -= this.field_3015;
            this.field_3016 = false;
            this.field_3012.getRGB(var1, var2, var3, var4, var5, 0, var3);

            for (int var6 = 0; var6 < var5.length; var6++) {
               if (var5[var6] != -1) {
                  this.field_3016 = true;
               }
            }
         }
      } catch (ArrayIndexOutOfBoundsException var7) {
      }
   }
}
