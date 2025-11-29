import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

// $VF: renamed from: aE
public class class_33 {
   // $VF: renamed from: a java.lang.String
   String field_332;

   public class_33(String var1) {
      try {
         class_62.method_563("Trying to load " + var1);
         InputStream var2 = this.getClass().getResourceAsStream(var1);
         if (var2 != null) {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();

            int var4;
            while ((var4 = var2.read()) != -1) {
               var3.write(var4);
            }

            var2.close();
            this.field_332 = new String(var3.toByteArray(), "utf-8");
         } else {
            class_62.method_563("is = null");
         }
      } catch (IOException var5) {
         class_62.method_563(var5.toString());
      }
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   String method_252(String var1) {
      if ('"' == var1.charAt(0) && '"' == var1.charAt(var1.length() - 1)) {
         var1 = var1.substring(1, var1.length() - 1);
      }

      return var1;
   }

   // $VF: renamed from: a (java.lang.String, int) java.lang.String
   public String method_253(String var1, int var2) {
      return this.method_252(this.method_256(var1, var2));
   }

   // $VF: renamed from: b (java.lang.String, int) int
   public int method_254(String var1, int var2) {
      return Integer.parseInt(this.method_256(var1, var2));
   }

   // $VF: renamed from: c (java.lang.String, int) char
   public char method_255(String var1, int var2) {
      return this.method_256(var1, var2).charAt(0);
   }

   // $VF: renamed from: d (java.lang.String, int) java.lang.String
   public String method_256(String var1, int var2) {
      String var3 = Integer.toString(var2);
      if (this.field_332 == null) {
         return null;
      } else {
         String var4 = new String("[" + var1.trim() + "]");
         int var5 = 0;

         while (var5 < this.field_332.length() && !this.field_332.regionMatches(true, var5, var4, 0, var4.length())) {
            var5++;
         }

         if (var5 == this.field_332.length()) {
            return "String not defined";
         } else {
            String var6 = var3.trim() + "=";
            var5 += var4.length();

            while (var5 < this.field_332.length() && !this.field_332.regionMatches(true, var5, var6, 0, var6.length())) {
               var5++;
            }

            if (var5 == this.field_332.length()) {
               class_62.method_563("Key not found");
               return "String not defined";
            } else {
               String var7 = this.field_332.substring(var5 + var6.length(), this.field_332.indexOf(10, var5 + var6.length()) - 1);
               return var7.trim();
            }
         }
      }
   }

   // $VF: renamed from: e (java.lang.String, int) int[]
   public int[] method_257(String var1, int var2) {
      String[] var3 = this.method_260(var1, var2, 0, 0);
      int[] var4 = new int[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4[var5] = Integer.parseInt(var3[var5]);
      }

      return var4;
   }

   // $VF: renamed from: a (java.lang.String, int, int) int
   public int method_258(String var1, int var2, int var3) {
      int[] var4 = this.method_257(var1, var2);
      return var4[var3];
   }

   // $VF: renamed from: b (java.lang.String, int, int) java.lang.String
   public String method_259(String var1, int var2, int var3) {
      String[] var4 = this.method_260(var1, var2, 0, 0);
      return var4[var3];
   }

   // $VF: renamed from: a (java.lang.String, int, int, int) java.lang.String[]
   public String[] method_260(String var1, int var2, int var3, int var4) {
      if (this.field_332 == null) {
         return null;
      } else {
         String var5 = this.method_256(var1, var2);
         if (null == var5) {
            return null;
         } else {
            int var6 = 0;
            int var7 = 0;
            Vector var9 = new Vector();

            for (int var10 = 0; var10 < var5.length(); var10++) {
               boolean var8 = false;
               if ('"' == var5.charAt(var10)) {
                  var6++;
               } else if (',' == var5.charAt(var10) && 0 == var6 % 2) {
                  var8 = true;
               }

               if (var10 == var5.length() - 1) {
                  var10++;
                  var8 = true;
               }

               if (var8) {
                  String var11 = var5.substring(var7, var10);
                  var7 = var10 + 1;
                  var11 = var11.trim();
                  var9.addElement(this.method_252(var11));
               }
            }

            String[] var14;
            if (var4 == -1) {
               var14 = new String[var9.size() - 1 - var3];
            } else if (var4 != 0 && var4 <= var9.size()) {
               var14 = new String[var4 - var3];
            } else {
               var14 = new String[var9.size() - var3];
            }

            var4 = var14.length;

            for (int var16 = 0; var16 < var4; var16++) {
               var14[var16] = (String)var9.elementAt(var3);
               var3++;
            }

            var9.removeAllElements();
            Object var13 = null;
            return var14;
         }
      }
   }

   // $VF: renamed from: b (java.lang.String) int[]
   public int[] method_261(String var1) {
      String[] var2 = this.method_262(var1);
      int[] var3 = new int[var2.length];

      for (int var4 = 0; var4 < var2.length; var4++) {
         var3[var4] = Integer.parseInt(var2[var4]);
      }

      return var3;
   }

   // $VF: renamed from: c (java.lang.String) java.lang.String[]
   public String[] method_262(String var1) {
      if (this.field_332 == null) {
         return null;
      } else {
         class_62.method_563("finding section");
         String var2 = new String("[" + var1.trim() + "]");
         int var3 = 0;

         while (var3 < this.field_332.length() && !this.field_332.regionMatches(true, var3, var2, 0, var2.length())) {
            var3++;
         }

         if (var3 == this.field_332.length()) {
            class_62.method_563("Section not found");
            return null;
         } else {
            String var5 = "\n[";
            int var4 = var3 + var2.length();

            while (var4 < this.field_332.length() && !this.field_332.regionMatches(true, var4, var5, 0, var5.length())) {
               var4++;
            }

            String var6 = this.field_332.substring(var3 + var2.length() + 2, var4 - 1);
            class_62.method_563(var6);
            int var7 = Integer.parseInt(var6.substring(var6.lastIndexOf(10, var4) + 1, var6.lastIndexOf(61, var4))) + 1;
            String[] var8 = new String[var7];
            int var9 = 0;
            int var10 = 0;

            while (var10 < var6.length()) {
               int var11 = var6.indexOf(10, var10);
               class_62.method_564(var11);
               if (var11 == -1) {
                  var11 = var6.length() + 1;
               }

               var8[var9] = var6.substring(var6.indexOf(61, var10) + 1, var11 - 1);
               var9++;
               var10 = var11 + 1;
            }

            return var8;
         }
      }
   }
}
