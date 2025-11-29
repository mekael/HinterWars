import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;

// $VF: renamed from: W
public class class_58 {
   // $VF: renamed from: i java.util.Vector
   private Vector field_1621 = new Vector();
   // $VF: renamed from: j int
   private int field_1622;
   // $VF: renamed from: k int
   private int field_1623;
   // $VF: renamed from: l byte
   private byte field_1624;
   // $VF: renamed from: a byte
   public static final byte field_1625 = 0;
   // $VF: renamed from: b byte
   public static final byte field_1626 = 1;
   // $VF: renamed from: c byte
   public static final byte field_1627 = 2;
   // $VF: renamed from: d byte
   public static final byte field_1628 = 3;
   // $VF: renamed from: m byte
   private byte field_1629;
   // $VF: renamed from: e byte
   public static final byte field_1630 = 0;
   // $VF: renamed from: f byte
   public static final byte field_1631 = 1;
   // $VF: renamed from: g byte
   public static final byte field_1632 = 2;
   // $VF: renamed from: h byte
   public static final byte field_1633 = 3;
   // $VF: renamed from: n aG
   private class_59 field_1634;

   public class_58(int var1, int var2, byte var3, byte var4) {
      this.field_1622 = var1;
      this.field_1623 = var2;
      this.field_1624 = var3;
      this.field_1629 = var4;
      this.field_1634 = null;
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, int, int, int, int, java.awt.FontMetrics, java.lang.String[], int[], int[], int[], java.lang.Object[]) void
   public void method_515(
      String var1, String var2, int var3, int var4, int var5, int var6, FontMetrics var7, String[] var8, int[] var9, int[] var10, int[] var11, Object[] var12
   ) {
      int var13 = this.field_1622;
      int var14 = this.field_1623;
      Enumeration var15 = this.field_1621.elements();
      boolean var16 = true;

      while (var15.hasMoreElements()) {
         class_59 var17 = (class_59)var15.nextElement();
         class_62.method_563("test 1: x=" + var13 + "; y=" + var14);
         if (var16) {
            class_62.method_563("test 2: x=" + var13 + "; y=" + var14);
            var16 = false;
            class_62.method_563("test 3: x=" + var13 + "; y=" + var14);
            switch (this.field_1624) {
               case 0:
               default:
                  break;
               case 1:
                  var13 -= var17.method_528();
                  class_62.method_563("test 4: x=" + var13 + "; y=" + var14);
                  break;
               case 2:
                  var14 -= var17.method_529();
                  break;
               case 3:
                  var13 -= var17.method_528();
                  var14 -= var17.method_529();
            }
         }

         class_62.method_563("test 5: x=" + var13 + "; y=" + var14);
         switch (this.field_1629) {
            case 0:
               var13 -= var17.method_528();
               break;
            case 1:
               var13 += var17.method_528();
               break;
            case 2:
               var14 -= var17.method_529();
               break;
            case 3:
               var14 += var17.method_529();
         }
      }

      class_62.method_563("test 6: x=" + var13 + "; y=" + var14);
      class_59 var19 = new class_59();
      var19.method_522(var1);
      if (var16) {
         var16 = false;
         switch (this.field_1624) {
            case 0:
            default:
               break;
            case 1:
               var13 -= var19.method_528();
               break;
            case 2:
               var14 -= var19.method_529();
               break;
            case 3:
               var13 -= var19.method_528();
               var14 -= var19.method_529();
         }
      }

      var19.method_524(var13);
      var19.method_526(var14);
      var19.method_530(var13 + var3, var14 + var4, var5, var6, var7);
      class_62.method_563("FeedBack test: x=" + var13 + "; y=" + var14 + "; textX=" + var13 + var3 + "; textY=" + var14 + var4);
      var19.method_531(var2);
      var19.method_534(var8);
      var19.method_537(var9);
      var19.method_541(var10);
      var19.method_545(var11, var12);
      this.field_1621.add(var19);
   }

   // $VF: renamed from: a (aG) void
   public void method_516(class_59 var1) {
      this.field_1621.removeElement(var1);
      int var2 = this.field_1622;
      int var3 = this.field_1623;
      Enumeration var4 = this.field_1621.elements();
      boolean var5 = true;

      while (var4.hasMoreElements()) {
         class_59 var6 = (class_59)var4.nextElement();
         if (var5) {
            var5 = false;
            switch (this.field_1624) {
               case 0:
               default:
                  break;
               case 1:
                  var2 -= var6.method_528();
                  break;
               case 2:
                  var3 -= var6.method_529();
                  break;
               case 3:
                  var2 -= var6.method_528();
                  var3 -= var6.method_529();
            }

            var6.method_524(var2);
            var6.method_526(var3);
         } else {
            switch (this.field_1629) {
               case 0:
                  var2 -= var6.method_528();
                  break;
               case 1:
                  var2 += var6.method_528();
                  break;
               case 2:
                  var3 -= var6.method_529();
                  break;
               case 3:
                  var3 += var6.method_529();
            }

            var6.method_524(var2);
            var6.method_526(var3);
         }
      }
   }

   // $VF: renamed from: a (int) void
   public void method_517(int var1) {
      this.field_1621.removeElementAt(var1);
      int var2 = this.field_1622;
      int var3 = this.field_1623;
      Enumeration var4 = this.field_1621.elements();
      boolean var5 = true;

      while (var4.hasMoreElements()) {
         class_59 var6 = (class_59)var4.nextElement();
         if (var5) {
            var5 = false;
            switch (this.field_1624) {
               case 0:
               default:
                  break;
               case 1:
                  var2 -= var6.method_528();
                  break;
               case 2:
                  var3 -= var6.method_529();
                  break;
               case 3:
                  var2 -= var6.method_528();
                  var3 -= var6.method_529();
            }

            var6.method_524(var2);
            var6.method_526(var3);
         } else {
            switch (this.field_1629) {
               case 0:
                  var2 -= var6.method_528();
                  break;
               case 1:
                  var2 += var6.method_528();
                  break;
               case 2:
                  var3 -= var6.method_529();
                  break;
               case 3:
                  var3 += var6.method_529();
            }

            var6.method_524(var2);
            var6.method_526(var3);
         }
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_518(Graphics var1, MastersOfDestiny var2) {
      Enumeration var3 = this.field_1621.elements();

      while (var3.hasMoreElements()) {
         ((class_59)var3.nextElement()).method_548(var1, var2);
      }
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) java.lang.Object
   public Object method_519(MouseEvent var1) {
      Enumeration var3 = this.field_1621.elements();

      for (int var4 = 0; var3.hasMoreElements(); var4++) {
         class_59 var5 = (class_59)var3.nextElement();
         int var2 = var5.method_549(var1);
         if (var2 != -1) {
            Object var6 = var5.method_547(var2);
            if (var6 == null) {
               this.method_517(var4);
            }

            this.field_1634 = var5;
            return var6;
         }
      }

      return null;
   }

   // $VF: renamed from: a () java.util.Vector
   public Vector method_520() {
      return this.field_1621;
   }

   // $VF: renamed from: b () aG
   public class_59 method_521() {
      return this.field_1634;
   }
}
