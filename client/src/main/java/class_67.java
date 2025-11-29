import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

// $VF: renamed from: T
public class class_67 {
   // $VF: renamed from: a java.util.Hashtable
   Hashtable field_1860;
   // $VF: renamed from: b java.util.Hashtable
   Hashtable field_1861;
   // $VF: renamed from: c java.lang.String
   String field_1862;
   // $VF: renamed from: d java.lang.String
   String field_1863;
   // $VF: renamed from: e java.lang.String
   String field_1864;
   // $VF: renamed from: f java.util.Hashtable
   Hashtable field_1865;
   // $VF: renamed from: g java.lang.String
   String field_1866;
   // $VF: renamed from: h java.util.Hashtable
   Hashtable field_1867;
   // $VF: renamed from: i java.lang.String
   String field_1868;

   public class_67(String var1, String var2, String var3, String var4) {
      this.field_1862 = var1;
      this.field_1864 = var2;
      this.field_1866 = var3;
      this.field_1868 = var4;
      this.field_1860 = new Hashtable();
      this.field_1861 = new Hashtable();
      this.field_1865 = new Hashtable();
      this.field_1867 = new Hashtable();
   }

   // $VF: renamed from: a (long, java.lang.String, java.lang.String, java.lang.String) am
   public class_13 method_614(long var1, String var3, String var4, String var5) {
      class_13 var6 = (class_13)this.field_1860.get(var1);
      if (var6 == null) {
         var6 = new class_13(var1, var3, var4, var5);
         this.field_1860.put(var1, var6);
      }

      return var6;
   }

   // $VF: renamed from: a (long) java.lang.String
   public String method_615(long var1) {
      String var3 = (String)this.field_1861.get(var1);
      if (var3 == null) {
         try {
            InputStream var5 = this.getClass().getResourceAsStream(this.field_1862 + var1 + ".txt");
            if (var5 == null) {
               class_62.method_563("null");
            } else {
               ByteArrayOutputStream var6 = new ByteArrayOutputStream();

               int var7;
               while ((var7 = var5.read()) != -1) {
                  var6.write(var7);
               }

               var5.close();
               String var4 = new String(var6.toByteArray(), "utf-8");
               var3 = var4;
            }
         } catch (IOException var8) {
            class_62.method_563(var8.getMessage());
         }

         this.field_1861.put(var1, var3);
      }

      return var3;
   }

   // $VF: renamed from: b (long) java.lang.String
   public String method_616(long var1) {
      String var3 = null;

      try {
         InputStream var4 = this.getClass().getResourceAsStream(this.field_1864 + var1 + ".txt");
         if (var4 != null) {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();

            int var6;
            while ((var6 = var4.read()) != -1) {
               var5.write(var6);
            }

            var4.close();
            var3 = new String(var5.toByteArray(), "utf-8");
         } else {
            class_62.method_563("CafeObjectManager(newTrigger): Unable to create InputStream");
         }
      } catch (IOException var7) {
         class_62.method_563(var7.getMessage());
      }

      return var3;
   }

   // $VF: renamed from: c (long) java.lang.String
   public String method_617(long var1) {
      String var3 = (String)this.field_1867.get(var1);
      if (var3 == null) {
         try {
            InputStream var5 = this.getClass().getResourceAsStream(this.field_1868 + var1 + ".txt");
            if (var5 == null) {
               class_62.method_563("null");
            } else {
               ByteArrayOutputStream var6 = new ByteArrayOutputStream();

               int var7;
               while ((var7 = var5.read()) != -1) {
                  var6.write(var7);
               }

               var5.close();
               String var4 = new String(var6.toByteArray(), "utf-8");
               var3 = var4;
            }
         } catch (IOException var8) {
            class_62.method_563(var8.getMessage());
         }

         this.field_1867.put(var1, var3);
      }

      return var3;
   }
}
