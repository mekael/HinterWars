import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;

// $VF: renamed from: ac
public abstract class class_86 {
   // $VF: renamed from: a java.util.Vector
   Vector field_2984;
   // $VF: renamed from: b ac
   class_86 field_2985;
   // $VF: renamed from: c int
   static int field_2986 = 0;
   // $VF: renamed from: d int
   public int field_2987;
   // $VF: renamed from: e int
   public static final int field_2988 = 0;
   // $VF: renamed from: f int
   public static final int field_2989 = 1;
   // $VF: renamed from: g int
   public static final int field_2990 = 2;
   // $VF: renamed from: h j
   protected static class_60 field_2991;
   // $VF: renamed from: i int
   public int field_2992 = 0;

   // $VF: renamed from: a () int
   public abstract int method_784();

   // $VF: renamed from: a (ac) boolean
   public abstract boolean method_785(class_86 var1);

   // $VF: renamed from: b (ac) boolean
   public abstract boolean method_786(class_86 var1);

   // $VF: renamed from: b () java.util.Enumeration
   public abstract Enumeration method_787();

   // $VF: renamed from: c (ac) void
   public void method_788(class_86 var1) {
      this.field_2985 = var1;
   }

   // $VF: renamed from: c () ac
   public class_86 method_789() {
      return this.field_2985;
   }

   public class_86() {
      this.field_2987 = field_2986++;
   }

   // $VF: renamed from: d () void
   public void method_790() {
   }

   // $VF: renamed from: a (long) void
   public void method_791(long var1) {
   }

   // $VF: renamed from: d (ac) void
   public void method_792(class_86 var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_793(Graphics var1, MastersOfDestiny var2) {
   }

   // $VF: renamed from: b (java.awt.Graphics, MastersOfDestiny) void
   public void method_794(Graphics var1, MastersOfDestiny var2) {
   }

   // $VF: renamed from: e () boolean
   public boolean method_795() {
      return this.field_2992 == 1;
   }

   // $VF: renamed from: f () boolean
   public boolean method_796() {
      return this.field_2992 == 2;
   }

   // $VF: renamed from: g () void
   public void method_797() {
      this.field_2992 = 1;
   }

   // $VF: renamed from: h () void
   public void method_798() {
      this.field_2992 = 2;
   }

   // $VF: renamed from: i () int
   public int method_799() {
      return 0;
   }

   // $VF: renamed from: j () int
   public int method_800() {
      return 0;
   }

   // $VF: renamed from: k () int
   public int method_801() {
      return 0;
   }

   // $VF: renamed from: l () int
   public int method_802() {
      return 0;
   }
}
