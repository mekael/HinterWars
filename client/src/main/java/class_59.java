import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aG
public class class_59 {
   // $VF: renamed from: a javax.swing.Icon
   private Icon field_1635 = null;
   // $VF: renamed from: b int
   private int field_1636;
   // $VF: renamed from: c int
   private int field_1637;
   // $VF: renamed from: d ak
   private class_87 field_1638 = null;
   // $VF: renamed from: e java.lang.String
   private String field_1639 = null;
   // $VF: renamed from: f int
   private int field_1640;
   // $VF: renamed from: g int
   private int field_1641;
   // $VF: renamed from: h int
   private int field_1642;
   // $VF: renamed from: i int
   private int field_1643;
   // $VF: renamed from: j java.awt.FontMetrics
   private FontMetrics field_1644 = null;
   // $VF: renamed from: k javax.swing.Icon[]
   private Icon[] field_1645 = null;
   // $VF: renamed from: l int[]
   private int[] field_1646 = null;
   // $VF: renamed from: m int[]
   private int[] field_1647 = null;
   // $VF: renamed from: n int[]
   private int[] field_1648;
   // $VF: renamed from: o java.lang.Object[]
   private Object[] field_1649;

   // $VF: renamed from: a (java.lang.String) void
   public void method_522(String var1) {
      this.field_1635 = new ImageIcon(this.getClass().getResource(var1));
   }

   // $VF: renamed from: a () javax.swing.Icon
   public Icon method_523() {
      return this.field_1635;
   }

   // $VF: renamed from: a (int) void
   public void method_524(int var1) {
      this.field_1636 = var1;
   }

   // $VF: renamed from: b () int
   public int method_525() {
      return this.field_1636;
   }

   // $VF: renamed from: b (int) void
   public void method_526(int var1) {
      this.field_1637 = var1;
   }

   // $VF: renamed from: c () int
   public int method_527() {
      return this.field_1637;
   }

   // $VF: renamed from: d () int
   public int method_528() {
      return this.field_1635 != null ? this.field_1635.getIconWidth() : 0;
   }

   // $VF: renamed from: e () int
   public int method_529() {
      return this.field_1635 != null ? this.field_1635.getIconHeight() : 0;
   }

   // $VF: renamed from: a (int, int, int, int, java.awt.FontMetrics) void
   public void method_530(int var1, int var2, int var3, int var4, FontMetrics var5) {
      this.field_1638 = new class_87();
      this.field_1638.method_804((byte)-1);
      this.field_1640 = var1;
      this.field_1641 = var2;
      this.field_1642 = var3;
      this.field_1643 = var4;
      this.field_1644 = var5;
      if (this.field_1639 != null) {
         this.field_1638.method_805(this.field_1639, var1, var2, var3, var4, var5, null);
      }
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_531(String var1) {
      this.field_1639 = var1;
      if (this.field_1638 != null) {
         this.field_1638.method_805(var1, this.field_1640, this.field_1641, this.field_1642, this.field_1643, this.field_1644, null);
      }
   }

   // $VF: renamed from: f () java.lang.String
   public String method_532() {
      return this.field_1639;
   }

   // $VF: renamed from: g () ak
   public class_87 method_533() {
      return this.field_1638;
   }

   // $VF: renamed from: a (java.lang.String[]) void
   public void method_534(String[] var1) {
      this.field_1645 = new Icon[var1.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.field_1645[var2] = new ImageIcon(this.getClass().getResource(var1[var2]));
      }

      this.field_1646 = new int[this.field_1645.length];
      this.field_1647 = new int[this.field_1645.length];
   }

   // $VF: renamed from: h () javax.swing.Icon[]
   public Icon[] method_535() {
      return this.field_1645;
   }

   // $VF: renamed from: c (int) javax.swing.Icon
   public Icon method_536(int var1) {
      return this.field_1645[var1];
   }

   // $VF: renamed from: a (int[]) void
   public void method_537(int[] var1) {
      this.field_1646 = var1;
   }

   // $VF: renamed from: a (int, int) void
   public void method_538(int var1, int var2) {
      this.field_1646[var2] = var1;
   }

   // $VF: renamed from: i () int[]
   public int[] method_539() {
      return this.field_1646;
   }

   // $VF: renamed from: d (int) int
   public int method_540(int var1) {
      return this.field_1646[var1];
   }

   // $VF: renamed from: b (int[]) void
   public void method_541(int[] var1) {
      this.field_1647 = var1;
   }

   // $VF: renamed from: b (int, int) void
   public void method_542(int var1, int var2) {
      this.field_1646[var2] = var1;
   }

   // $VF: renamed from: j () int[]
   public int[] method_543() {
      return this.field_1647;
   }

   // $VF: renamed from: e (int) int
   public int method_544(int var1) {
      return this.field_1647[var1];
   }

   // $VF: renamed from: a (int[], java.lang.Object[]) void
   public void method_545(int[] var1, Object[] var2) {
      this.field_1648 = var1;
      this.field_1649 = var2;
   }

   // $VF: renamed from: k () int[]
   public int[] method_546() {
      return this.field_1648;
   }

   // $VF: renamed from: f (int) java.lang.Object
   public Object method_547(int var1) {
      return this.field_1649[var1];
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_548(Graphics var1, MastersOfDestiny var2) {
      if (this.field_1635 != null) {
         this.field_1635.paintIcon(var2, var1, this.field_1636, this.field_1637);
      }

      var1.setColor(new Color(13619151));
      var1.setFont(MastersOfDestiny.field_2808);
      if (this.field_1638 != null) {
         this.field_1638.method_793(var1, var2);
      }

      for (int var3 = 0; var3 < this.field_1648.length; var3++) {
         this.field_1645[this.field_1648[var3]]
            .paintIcon(var2, var1, this.field_1636 + this.field_1646[this.field_1648[var3]], this.field_1637 + this.field_1647[this.field_1648[var3]]);
      }
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) int
   public int method_549(MouseEvent var1) {
      for (int var2 = 0; var2 < this.field_1648.length; var2++) {
         if (var1.getX() > this.field_1636 + this.field_1646[this.field_1648[var2]]
            && var1.getX() < this.field_1636 + this.field_1646[this.field_1648[var2]] + this.field_1645[this.field_1648[var2]].getIconWidth()
            && var1.getY() > this.field_1637 + this.field_1647[this.field_1648[var2]]
            && var1.getY() < this.field_1637 + this.field_1647[this.field_1648[var2]] + this.field_1645[this.field_1648[var2]].getIconHeight()) {
            return var2;
         }
      }

      return -1;
   }
}
