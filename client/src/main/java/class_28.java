import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

// $VF: renamed from: U
public class class_28 {
   // $VF: renamed from: a java.lang.String
   String field_177;
   // $VF: renamed from: b java.lang.String
   String field_178;
   // $VF: renamed from: c java.lang.String
   String field_179;
   // $VF: renamed from: d java.lang.String
   String field_180;
   // $VF: renamed from: e java.util.Hashtable
   Hashtable field_181;
   // $VF: renamed from: f D
   class_29 field_182;
   // $VF: renamed from: g java.lang.String[][]
   String[][] field_183;
   // $VF: renamed from: h int
   int field_184 = 0;
   // $VF: renamed from: i int
   int field_185 = 0;
   // $VF: renamed from: v byte
   private final byte field_186 = 0;
   // $VF: renamed from: w byte
   private final byte field_187 = 1;
   // $VF: renamed from: x byte
   private final byte field_188 = 2;
   // $VF: renamed from: y byte
   private final byte field_189 = 3;
   // $VF: renamed from: z byte
   private final byte field_190 = 4;
   // $VF: renamed from: A byte
   private final byte field_191 = 5;
   // $VF: renamed from: B byte
   private final byte field_192 = 6;
   // $VF: renamed from: C byte
   private final byte field_193 = 7;
   // $VF: renamed from: D byte
   private final byte field_194 = 8;
   // $VF: renamed from: E byte
   private final byte field_195 = 9;
   // $VF: renamed from: F byte
   private final byte field_196 = 10;
   // $VF: renamed from: G byte
   private final byte field_197 = 11;
   // $VF: renamed from: H byte
   private final byte field_198 = 12;
   // $VF: renamed from: I byte
   private final byte field_199 = 13;
   // $VF: renamed from: J byte
   private final byte field_200 = 14;
   // $VF: renamed from: K byte
   private final byte field_201 = 15;
   // $VF: renamed from: L byte
   private final byte field_202 = 16;
   // $VF: renamed from: M byte
   private final byte field_203 = 17;
   // $VF: renamed from: N byte
   private final byte field_204 = 18;
   // $VF: renamed from: O byte
   private final byte field_205 = 19;
   // $VF: renamed from: P byte
   private final byte field_206 = 20;
   // $VF: renamed from: Q byte
   private final byte field_207 = 21;
   // $VF: renamed from: R byte
   private final byte field_208 = 22;
   // $VF: renamed from: j byte
   public static final byte field_209 = 1;
   // $VF: renamed from: k byte
   public static final byte field_210 = 2;
   // $VF: renamed from: l byte
   public static final byte field_211 = 3;
   // $VF: renamed from: m byte
   public static final byte field_212 = 4;
   // $VF: renamed from: n byte
   public static final byte field_213 = 5;
   // $VF: renamed from: o byte
   public static final byte field_214 = 6;
   // $VF: renamed from: p byte
   public static final byte field_215 = 7;
   // $VF: renamed from: q byte
   public static final byte field_216 = 8;
   // $VF: renamed from: r byte
   public static final byte field_217 = 9;
   // $VF: renamed from: s byte
   public static final byte field_218 = 10;
   // $VF: renamed from: t byte
   public static final byte field_219 = 0;
   // $VF: renamed from: u byte
   public static final byte field_220 = 15;

   public class_28(String var1, String var2, String var3, String var4) {
      try {
         InputStream var5 = this.getClass().getResourceAsStream(var1 + var2);
         if (var5 == null) {
            class_62.method_563("graphics mapping null");
         } else {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();

            int var7;
            while ((var7 = var5.read()) != -1) {
               var6.write(var7);
            }

            var5.close();
            this.field_178 = new String(var6.toByteArray(), "utf-8");
            class_62.method_563(this.field_178);
         }

         var5 = this.getClass().getResourceAsStream(var1 + var3);
         if (var5 == null) {
            class_62.method_563("item class mapping null");
         } else {
            ByteArrayOutputStream var11 = new ByteArrayOutputStream();

            int var13;
            while ((var13 = var5.read()) != -1) {
               var11.write(var13);
            }

            var5.close();
            this.field_179 = new String(var11.toByteArray(), "utf-8");
         }

         var5 = this.getClass().getResourceAsStream(var1 + var4);
         if (var5 != null) {
            ByteArrayOutputStream var12 = new ByteArrayOutputStream();

            int var14;
            while ((var14 = var5.read()) != -1) {
               var12.write(var14);
            }

            var5.close();
            this.field_180 = new String(var12.toByteArray(), "utf-8");
         } else {
            class_62.method_563("item class mapping null");
         }
      } catch (IOException var8) {
         class_62.method_563(var8.getMessage());
      }

      this.field_177 = var1;
      this.field_181 = new Hashtable();
   }

   // $VF: renamed from: a (java.lang.String) D
   public class_29 method_177(String var1) {
      if (!this.field_181.containsKey(new Long(var1))) {
         this.field_182 = new class_29(Long.parseLong(var1));
         this.field_183 = new String[16][6];
         this.field_184 = 0;
         this.field_185 = 0;

         try {
            InputStream var3 = this.getClass().getResourceAsStream(this.field_177 + var1 + ".txt");
            if (var3 != null) {
               ByteArrayOutputStream var4 = new ByteArrayOutputStream();

               int var5;
               while ((var5 = var3.read()) != -1) {
                  var4.write(var5);
               }

               var3.close();
               String var2 = new String(var4.toByteArray(), "utf-8");
               int var6 = 0;
               int var7 = 0;

               for (int var8 = 0; var8 < var2.length(); var8++) {
                  if (var2.charAt(var8) == '\n') {
                     class_62.method_563("read from item file = " + var2.substring(var7, var8));
                     boolean var9 = this.method_178(var2.substring(var7, var8 - 1), var6);
                     var7 = var8 + 1;
                     if (var9) {
                        var6++;
                     }
                  }
               }
            } else {
               class_62.method_563("null");
            }
         } catch (IOException var10) {
            class_62.method_563(var10.getMessage());
         }

         this.field_181.put(new Long(var1), this.field_182);
         return this.field_182;
      } else {
         return (class_29)this.field_181.get(new Long(var1));
      }
   }

   // $VF: renamed from: a (java.lang.String, int) boolean
   public boolean method_178(String var1, int var2) {
      switch (var2) {
         case 0:
            String var5 = null;
            int var13 = 1;
            int var15 = 0;
            int var6 = Integer.parseInt(var1);
            class_62.method_563("set details graphics = " + var6);
            int var16 = 0;

            for (; var16 < this.field_178.length(); var16++) {
               if (this.field_178.charAt(var16) == '\n') {
                  if (var13 == var6) {
                     String var17 = this.field_178.substring(var15, var16 - 1);
                     var5 = var17.substring(var1.length() + 1, var17.length());
                     break;
                  }

                  var13++;
                  var15 = var16 + 1;
               }
            }

            this.field_182.method_180(var5);
            return true;
         case 1:
            this.field_182.method_182(var1);
            return true;
         case 2:
            this.field_182.method_188(var1);
            return true;
         case 3:
            this.field_182.method_190(var1);
            return true;
         case 4:
            int var7 = -1;
            String[] var8 = var1.split("\\|");
            int var12 = 1;
            int var14 = 0;

            for (int var18 = 0; var18 < this.field_179.length(); var18++) {
               if (this.field_179.charAt(var18) == '\n') {
                  String var20 = this.field_179.substring(var14, var18 - 1);
                  if (var20.startsWith(var8[0])) {
                     var7 = Integer.parseInt(var20.substring(var8[0].length() + 1, var20.length()).trim());
                     break;
                  }

                  var12++;
                  var14 = var18 + 1;
               }
            }

            this.field_182.method_194(var8[1]);
            this.field_182.method_192(var7);
            return true;
         case 5:
            int var9 = -1;
            int var3 = 1;
            int var4 = 0;

            for (int var19 = 0; var19 < this.field_180.length(); var19++) {
               if (this.field_180.charAt(var19) == '\n') {
                  String var11 = this.field_180.substring(var4, var19 - 1);
                  if (var11.startsWith(var1)) {
                     var9 = Integer.parseInt(var11.substring(var1.length() + 1, var11.length()).trim());
                     break;
                  }

                  var3++;
                  var4 = var19 + 1;
               }
            }

            this.field_182.method_196(var9);
            return true;
         case 6:
            this.field_182.method_198(Integer.parseInt(var1));
            return true;
         case 7:
            this.field_182.method_200(var1);
            return true;
         case 8:
            this.field_182.method_202(var1);
            return true;
         case 9:
            this.field_182.method_204(var1);
            return true;
         case 10:
            this.field_182.method_206(var1);
            return true;
         case 11:
            this.field_182.method_208(var1);
            return true;
         case 12:
            this.field_182.method_184(var1);
            return true;
         case 13:
            this.field_182.method_186(var1);
            return true;
         case 14:
            this.field_182.method_222(var1);
            return true;
         case 15:
            this.field_182.method_224(var1);
            return true;
         case 16:
            this.field_182.method_226(var1);
            return true;
         case 17:
            this.field_182.method_228(var1);
            return true;
         case 18:
            this.field_182.method_210(Integer.parseInt(var1));
            return true;
         case 19:
            return this.field_182.method_211(Integer.parseInt(var1));
         case 20:
            String[] var10 = var1.split(",");
            this.field_182.method_212(Integer.parseInt(var10[0]), Integer.parseInt(var10[1]));
            return true;
         case 21:
            return this.field_182.method_213(var1);
         case 22:
            if (!var1.equals("")) {
               this.field_182.method_230(Integer.parseInt(var1));
            }

            return true;
         default:
            class_62.method_563("ItemDetailsManager.setDetails: Error! - invalid details index");
            return true;
      }
   }
}
