// $VF: renamed from: i
public class class_21 {
   // $VF: renamed from: a long
   private long field_156;
   // $VF: renamed from: b java.lang.String
   private String field_157;
   // $VF: renamed from: c java.lang.String
   private String field_158;

   public class_21(long var1) {
      this.field_156 = var1;
   }

   // $VF: renamed from: a () long
   public long method_147() {
      return this.field_156;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_148(String var1) {
      this.field_157 = var1;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_149() {
      return this.field_157;
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_150(String var1) {
      this.field_158 = var1;
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_151(String var1) {
      this.field_158 = this.field_158 + "\n" + var1;
   }

   // $VF: renamed from: c () java.lang.String
   public String method_152() {
      return this.field_158;
   }

   // $VF: renamed from: d () java.lang.String[]
   public String[] method_153() {
      return new String[]{"Mission Area: " + this.method_149(), "Details: " + this.method_152()};
   }
}
