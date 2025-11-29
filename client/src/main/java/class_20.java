import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

// $VF: renamed from: ah
public class class_20 {
   // $VF: renamed from: a java.lang.String
   String field_151;
   // $VF: renamed from: b java.util.Hashtable
   Hashtable field_152;
   // $VF: renamed from: c i
   class_21 field_153;
   // $VF: renamed from: d byte
   private final byte field_154 = 0;
   // $VF: renamed from: e byte
   private final byte field_155 = 1;

   public class_20(String var1) {
      this.field_151 = var1;
      this.field_152 = new Hashtable();
   }

   // $VF: renamed from: a (long) i
   public class_21 method_145(long var1) {
      if (!this.field_152.containsKey(var1)) {
         this.field_153 = new class_21(var1);

         try {
            InputStream var4 = this.getClass().getResourceAsStream(this.field_151 + var1 + ".txt");
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
               this.method_146(var7[0], 0);
               this.method_146(var7[1], 1);
            } else {
               class_62.method_563("null");
            }
         } catch (IOException var8) {
            class_62.method_563(var8.getMessage());
         }

         this.field_152.put(new Long(var1), this.field_153);
         return this.field_153;
      } else {
         return (class_21)this.field_152.get(new Long(var1));
      }
   }

   // $VF: renamed from: a (java.lang.String, int) boolean
   public boolean method_146(String var1, int var2) {
      switch (var2) {
         case 0:
            this.field_153.method_148(var1);
            return true;
         case 1:
            this.field_153.method_150(var1);
            return true;
         default:
            this.field_153.method_151(var1);
            return true;
      }
   }
}
