import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

// $VF: renamed from: K
public class class_5 {
   // $VF: renamed from: a java.lang.String
   String field_60;
   // $VF: renamed from: b java.lang.String
   String field_61;
   // $VF: renamed from: c java.util.Hashtable
   Hashtable field_62;
   // $VF: renamed from: d aQ
   class_7 field_63;
   // $VF: renamed from: e byte
   private final byte field_64 = 0;
   // $VF: renamed from: f byte
   private final byte field_65 = 1;
   // $VF: renamed from: g byte
   private final byte field_66 = 2;
   // $VF: renamed from: h byte
   private final byte field_67 = 3;
   // $VF: renamed from: i byte
   private final byte field_68 = 4;
   // $VF: renamed from: j byte
   private final byte field_69 = 5;
   // $VF: renamed from: k byte
   private final byte field_70 = 6;
   // $VF: renamed from: l byte
   private final byte field_71 = 7;
   // $VF: renamed from: m byte
   private final byte field_72 = 8;
   // $VF: renamed from: n byte
   private final byte field_73 = 9;
   // $VF: renamed from: o byte
   private final byte field_74 = 10;
   // $VF: renamed from: p byte
   private final byte field_75 = 11;
   // $VF: renamed from: q byte
   private final byte field_76 = 12;
   // $VF: renamed from: r byte
   private final byte field_77 = 13;
   // $VF: renamed from: s byte
   private final byte field_78 = 14;

   public class_5(String var1, String var2) {
      try {
         InputStream var3 = this.getClass().getResourceAsStream(var1 + var2);
         if (var3 != null) {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();

            int var5;
            while ((var5 = var3.read()) != -1) {
               var4.write(var5);
            }

            var3.close();
            this.field_61 = new String(var4.toByteArray(), "utf-8");
            class_62.method_563(this.field_61);
         } else {
            class_62.method_563("graphics mapping null");
         }
      } catch (IOException var6) {
         class_62.method_563(var6.getMessage());
      }

      this.field_60 = var1;
      this.field_62 = new Hashtable();
   }

   // $VF: renamed from: a (long) aQ
   public class_7 method_30(long var1) {
      if (!this.field_62.containsKey(var1)) {
         this.field_63 = new class_7(var1);

         try {
            InputStream var4 = this.getClass().getResourceAsStream(this.field_60 + var1 + ".txt");
            if (var4 != null) {
               ByteArrayOutputStream var5 = new ByteArrayOutputStream();

               int var6;
               while ((var6 = var4.read()) != -1) {
                  var5.write(var6);
               }

               var4.close();
               String var3 = new String(var5.toByteArray(), "utf-8");
               int var7 = 0;
               int var8 = 0;

               for (int var9 = 0; var9 < var3.length(); var9++) {
                  if (var3.charAt(var9) == '\n') {
                     class_62.method_563("read from item file = " + var3.substring(var8, var9));
                     boolean var10 = this.method_32(var3.substring(var8, var9 - 1), var7);
                     var8 = var9 + 1;
                     if (var10) {
                        var7++;
                     }
                  }
               }
            } else {
               class_62.method_563("null");
            }
         } catch (IOException var11) {
            class_62.method_563(var11.getMessage());
         }

         this.field_62.put(new Long(var1), this.field_63);
         return this.field_63;
      } else {
         return (class_7)this.field_62.get(new Long(var1));
      }
   }

   // $VF: renamed from: a (java.lang.String) java.util.Vector
   public Vector method_31(String var1) {
      Vector var2 = new Vector();

      try {
         InputStream var3 = this.getClass().getResourceAsStream(this.field_60 + var1);
         if (var3 != null) {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();

            int var6;
            while ((var6 = var3.read()) != -1) {
               var5.write(var6);
            }

            var3.close();
            String var4 = new String(var5.toByteArray(), "utf-8");
            int var7 = 0;
            Vector var8 = new Vector();

            for (int var9 = 0; var9 < var4.length(); var9++) {
               if (var4.charAt(var9) == '\n') {
                  class_62.method_563("read from item file = " + var4.substring(var7, var9));
                  class_6 var10 = new class_6(var4.substring(var7, var9 - 1));
                  if (!var10.method_33().contains("llama")) {
                     var8.add(var10);
                  }

                  var7 = var9 + 1;
               }
            }

            String[] var19 = new String[var8.size()];
            int var20 = 0;

            for (int var11 = 0; var11 < var8.size(); var11++) {
               class_6 var12 = (class_6)var8.get(var11);
               String var13 = var12.method_33();
               class_62.method_563("skill name = " + var13);
               int var14 = 0;

               for (int var15 = 0; var15 < var20; var15++) {
                  if (var13.compareToIgnoreCase(var19[var15]) < 0) {
                     var14 = var15;
                     break;
                  }

                  var14 = var15 + 1;
               }

               class_62.method_563("total skills = " + (var20 + 1) + "; skill order = " + var14);
               String var25 = var19[var14];
               var19[var14] = var13;

               for (int var16 = var14 + 1; var16 < var20 + 1; var16++) {
                  if (var25 != null) {
                     String var17 = var19[var16];
                     var19[var16] = var25;
                     var25 = var17;
                  }
               }

               var20++;
            }

            class_62.method_563("skill name order:");

            for (int var21 = 0; var21 < var19.length; var21++) {
               String var22 = var19[var21];
               class_62.method_563(var21 + ". " + var22);

               for (int var23 = 0; var23 < var8.size(); var23++) {
                  class_6 var24 = (class_6)var8.get(var23);
                  if (var22.compareToIgnoreCase(var24.method_33()) == 0) {
                     var2.add(var24);
                     break;
                  }
               }
            }
         }
      } catch (IOException var18) {
         class_62.method_563(var18.getMessage());
      }

      return var2;
   }

   // $VF: renamed from: a (java.lang.String, int) boolean
   public boolean method_32(String var1, int var2) {
      switch (var2) {
         case 0:
            this.field_63.method_44(var1);
            return true;
         case 1:
            this.field_63.method_46(Long.parseLong(var1));
            return true;
         case 2:
            this.field_63.method_48(var1);
            return true;
         case 3:
            this.field_63.method_51(Long.parseLong(var1));
            return true;
         case 4:
            this.field_63.method_57(var1);
            return true;
         case 5:
            this.field_63.method_59(Long.parseLong(var1));
            return true;
         case 6:
            this.field_63.method_63(var1);
            return true;
         case 7:
            String var6 = null;
            long var3 = 1L;
            int var5 = 0;
            long var7 = Long.parseLong(var1);
            class_62.method_563("set details graphics = " + var7);
            int var9 = 0;

            for (; var9 < this.field_61.length(); var9++) {
               if (this.field_61.charAt(var9) == '\n') {
                  if (var3 == var7) {
                     String var10 = this.field_61.substring(var5, var9 - 1);
                     var6 = var10.substring(var1.length() + 1, var10.length());
                     break;
                  }

                  var3++;
                  var5 = var9 + 1;
               }
            }

            class_62.method_563("graphics of skill = " + var6);
            this.field_63.method_65(var6);
            return true;
         case 8:
            this.field_63.method_67(var1);
            return true;
         case 9:
            this.field_63.method_69(Long.parseLong(var1));
            return true;
         case 10:
            this.field_63.method_71(Long.parseLong(var1));
            return true;
         case 11:
            this.field_63.method_73(Long.parseLong(var1));
            return true;
         case 12:
            this.field_63.method_61(Long.parseLong(var1));
            return true;
         case 13:
            this.field_63.method_55(Long.parseLong(var1));
            return true;
         case 14:
            this.field_63.method_53(Long.parseLong(var1));
            return true;
         default:
            class_62.method_563("ItemDetailsManager.setDetails: Error! - invalid details index");
            return true;
      }
   }
}
