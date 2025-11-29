// $VF: renamed from: n
public class class_19 {
   // $VF: renamed from: a long
   private long field_148;
   // $VF: renamed from: b java.lang.String
   private String field_149;
   // $VF: renamed from: c java.lang.String
   private String field_150;

   public class_19(long var1) {
      this.field_148 = var1;
   }

   // $VF: renamed from: a () long
   public long method_138() {
      return this.field_148;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_139(String var1) {
      this.field_149 = var1;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_140() {
      return this.field_149;
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_141(String var1) {
      this.field_150 = var1;
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_142(String var1) {
      this.field_150 = this.field_150 + "\n" + var1;
   }

   // $VF: renamed from: c () java.lang.String
   public String method_143() {
      return this.field_150;
   }

   // $VF: renamed from: d () java.lang.String[]
   public String[] method_144() {
      return new String[]{"Mission Description: \n" + this.method_143()};
   }
}
