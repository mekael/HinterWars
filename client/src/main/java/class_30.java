import javax.swing.Icon;

// $VF: renamed from: av
public class class_30 implements Cloneable {
   // $VF: renamed from: a D
   class_29 field_322;
   // $VF: renamed from: b int
   int field_323;
   // $VF: renamed from: c long
   long field_324;
   // $VF: renamed from: d int
   int field_325;
   // $VF: renamed from: e int
   int field_326;
   // $VF: renamed from: f byte
   static final byte field_327 = 0;
   // $VF: renamed from: g byte
   static final byte field_328 = 1;

   // $VF: renamed from: a (D) void
   public void method_233(class_29 var1) {
      this.field_322 = var1;
   }

   // $VF: renamed from: a () D
   public class_29 method_234() {
      return this.field_322;
   }

   // $VF: renamed from: a (int) void
   public void method_235(int var1) {
      this.field_323 = var1;
   }

   // $VF: renamed from: b () int
   public int method_236() {
      return this.field_323;
   }

   // $VF: renamed from: a (long) void
   public void method_237(long var1) {
      this.field_324 = var1;
   }

   // $VF: renamed from: c () long
   public long method_238() {
      return this.field_324;
   }

   // $VF: renamed from: a (int, byte) javax.swing.Icon[][]
   public Icon[][] method_239(int var1, byte var2) {
      this.field_325 = var1;
      this.field_326 = var1;
      return var1 <= 0 || var2 != 0 || var1 != 1 && var1 != 2 ? (Icon[][])null : this.field_322.method_220();
   }

   // $VF: renamed from: d () int
   public int method_240() {
      return this.field_325;
   }

   // $VF: renamed from: b (int) void
   public void method_241(int var1) {
      this.field_326 = var1;
   }

   // $VF: renamed from: e () int
   public int method_242() {
      return this.field_326;
   }

   // $VF: renamed from: f () java.lang.String
   public String method_243() {
      return this.field_322.method_232();
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public String method_244(String var1) {
      String var2 = this.field_322.method_232() + "Qty: ";
      if (this.field_323 == -1) {
         var2 = var2 + "∞";
      } else if (this.field_323 == 0) {
         var2 = var2 + var1;
      } else {
         var2 = var2 + "" + this.field_323;
      }

      return var2;
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String
   public String method_245(String var1) {
      return this.method_243() + "\n" + "Price: " + this.field_324 + " sidos";
   }

   @Override
   public Object clone() {
      class_30 var1 = null;

      try {
         var1 = (class_30)super.clone();
      } catch (CloneNotSupportedException var3) {
      }

      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1.getClass() != this.getClass()) {
         class_62.method_563("not true not same class");
         return false;
      } else {
         class_30 var2 = (class_30)var1;
         return this.field_322.method_179() == var2.field_322.method_179();
      }
   }
}
