import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

// $VF: renamed from: G
public class class_18 {
   // $VF: renamed from: a java.lang.String
   String field_143;
   // $VF: renamed from: b java.util.Hashtable
   Hashtable field_144;
   // $VF: renamed from: c n
   class_19 field_145;
   // $VF: renamed from: d byte
   private final byte field_146 = 0;
   // $VF: renamed from: e byte
   private final byte field_147 = 1;

   public class_18(String var1) {
      this.field_143 = var1;
      this.field_144 = new Hashtable();
   }

   // $VF: renamed from: a (long) n
   public class_19 method_136(long var1) {
      if (!this.field_144.containsKey(var1)) {
         this.field_145 = new class_19(var1);

         try {
            InputStream var4 = this.getClass().getResourceAsStream(this.field_143 + var1 + ".txt");
            if (var4 != null) {
               ByteArrayOutputStream var5 = new ByteArrayOutputStream();

               int var6;
               while ((var6 = var4.read()) != -1) {
                  var5.write(var6);
               }

               var4.close();
               String var3 = new String(var5.toByteArray(), "utf-8");
               String[] var7 = var3.split("\r\n", 2);
               class_62.method_563("read from item file = " + var7[0]);
               class_62.method_563("read from item file = " + var7[1]);
               this.method_137(var7[0], 0);
               this.method_137(var7[1], 1);
            } else {
               class_62.method_563("null");
            }
         } catch (IOException var8) {
            class_62.method_563(var8.getMessage());
         }

         this.field_144.put(new Long(var1), this.field_145);
         return this.field_145;
      } else {
         return (class_19)this.field_144.get(new Long(var1));
      }
   }

   // $VF: renamed from: a (java.lang.String, int) boolean
   public boolean method_137(String var1, int var2) {
      switch (var2) {
         case 0:
            this.field_145.method_139(var1);
            return true;
         case 1:
            this.field_145.method_141(var1);
            return true;
         default:
            return true;
      }
   }
}
