import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

// $VF: renamed from: z
public class class_72 {
   // $VF: renamed from: c java.util.Hashtable
   private Hashtable field_2075 = new Hashtable();
   // $VF: renamed from: a byte
   public static final byte field_2076 = 0;
   // $VF: renamed from: b byte
   public static final byte field_2077 = 1;

   // $VF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) void
   public void method_658(String var1, String var2, String var3) {
      if (this.field_2075.containsKey(var1)) {
         class_73 var4 = (class_73)this.field_2075.get(var1);
         var4.method_669(var3);
         var4.method_668(this.method_660(var2));
      } else {
         class_73 var5 = new class_73(this, this.method_660(var2), var3);
         this.field_2075.put(var1, var5);
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_659(String var1) {
      this.field_2075.remove(var1);
   }

   // $VF: renamed from: c (java.lang.String) byte
   private byte method_660(String var1) {
      if (var1.equalsIgnoreCase("online")) {
         return 0;
      } else {
         return (byte)(var1.equalsIgnoreCase("offline") ? 1 : -1);
      }
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String
   public String method_661(String var1) {
      class_73 var2 = (class_73)this.field_2075.get(var1);
      return var2.method_667();
   }

   // $VF: renamed from: a () java.lang.String[]
   public String[] method_662() {
      Vector var1 = new Vector();
      Enumeration var2 = this.field_2075.keys();

      while (var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         switch (((class_73)this.field_2075.get(var3)).method_666()) {
            case 0:
               var1.add(var3);
         }
      }

      String[] var5 = new String[var1.size()];

      for (int var4 = 0; var4 < var5.length; var4++) {
         var5[var4] = (String)var1.elementAt(var4);
      }

      return var5;
   }

   // $VF: renamed from: b () java.lang.String[]
   public String[] method_663() {
      Vector var1 = new Vector();
      Enumeration var2 = this.field_2075.keys();

      while (var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         switch (((class_73)this.field_2075.get(var3)).method_666()) {
            case 1:
               var1.add(var3);
         }
      }

      String[] var5 = new String[var1.size()];

      for (int var4 = 0; var4 < var5.length; var4++) {
         var5[var4] = (String)var1.elementAt(var4);
      }

      return var5;
   }

   // $VF: renamed from: c () int
   public int method_664() {
      return this.field_2075.size();
   }

   // $VF: renamed from: d () void
   public void method_665() {
      this.field_2075.clear();
   }
}
