import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

// $VF: renamed from: Q
public class class_10 {
   // $VF: renamed from: a java.util.Hashtable
   private Hashtable field_117 = new Hashtable();

   // $VF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_92(String var1, String var2) {
      this.field_117.put(var1, var2);
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_93(String var1) {
      this.field_117.remove(var1);
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String
   public String method_94(String var1) {
      String var2 = (String)this.field_117.get(var1);
      String[] var3 = var2.split("\\|");
      return var3[0];
   }

   // $VF: renamed from: a () java.lang.String[]
   public String[] method_95() {
      Vector var1 = new Vector();
      Enumeration var2 = this.field_117.keys();

      while (var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         var1.add(var3);
      }

      String[] var5 = new String[var1.size()];

      for (int var4 = 0; var4 < var5.length; var4++) {
         var5[var4] = (String)var1.elementAt(var4);
      }

      return var5;
   }

   // $VF: renamed from: b () java.lang.String[]
   public String[] method_96() {
      Vector var1 = new Vector();
      Enumeration var2 = this.field_117.keys();

      while (var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         String var4 = (String)this.field_117.get(var3);
         var1.add(var4);
      }

      String[] var5 = new String[var1.size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = (String)var1.elementAt(var6);
      }

      return var5;
   }

   // $VF: renamed from: c () int
   public int method_97() {
      return this.field_117.size();
   }

   // $VF: renamed from: d () void
   public void method_98() {
      this.field_117.clear();
   }
}
