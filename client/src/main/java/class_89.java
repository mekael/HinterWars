import java.util.Enumeration;
import java.util.Vector;

// $VF: renamed from: az
public class class_89 extends class_86 {
   public class_89() {
      this.a = new Vector();
   }

   // $VF: renamed from: a () int
   @Override
   public int method_784() {
      int var1 = 0;
      Enumeration var2 = this.a.elements();

      while (var2.hasMoreElements()) {
         class_86 var3 = (class_86)var2.nextElement();
         var1 += var3.method_784();
      }

      return var1;
   }

   // $VF: renamed from: a (ac) boolean
   @Override
   public boolean method_785(class_86 var1) {
      var1.method_788(this);
      return this.a.add(var1);
   }

   // $VF: renamed from: b (ac) boolean
   @Override
   public boolean method_786(class_86 var1) {
      return this.a.remove(var1);
   }

   // $VF: renamed from: m () void
   public void method_811() {
      Enumeration var1 = this.a.elements();

      while (var1.hasMoreElements()) {
         ((class_86)var1.nextElement()).method_798();
      }

      this.a.clear();
   }

   // $VF: renamed from: b () java.util.Enumeration
   @Override
   public Enumeration method_787() {
      return this.a.elements();
   }
}
