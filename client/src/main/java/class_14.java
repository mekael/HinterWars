import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

// $VF: renamed from: al
public class class_14 {
   // $VF: renamed from: a al
   private static class_14 field_131;
   // $VF: renamed from: b java.util.Hashtable
   private Hashtable field_132 = new Hashtable();
   // $VF: renamed from: c java.lang.String
   private String field_133;

   public class_14(String var1) {
      this.field_133 = var1;
   }

   // $VF: renamed from: a (java.lang.String) al
   public static class_14 method_118(String var0) {
      if (field_131 == null) {
         field_131 = new class_14(var0);
      }

      return field_131;
   }

   // $VF: renamed from: a (long) java.lang.String
   public String method_119(long var1) {
      String var3 = (String)this.field_132.get(var1);
      if (var3 == null) {
         try {
            InputStream var4 = this.getClass().getResourceAsStream(this.field_133 + var1 + ".txt");
            if (var4 != null) {
               ByteArrayOutputStream var5 = new ByteArrayOutputStream();

               int var6;
               while ((var6 = var4.read()) != -1) {
                  var5.write(var6);
               }

               var4.close();
               var3 = new String(var5.toByteArray(), "utf-8");
            }
         } catch (IOException var7) {
         }

         if (var3 != null) {
            this.field_132.put(var1, var3);
         } else {
            class_62.method_563("MonsterDetailsManager.getMonsterDetails: Error! - Problem loading monster details string");
         }
      }

      return var3;
   }
}
