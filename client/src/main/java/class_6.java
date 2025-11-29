// $VF: renamed from: s
public class class_6 {
   // $VF: renamed from: a java.lang.String
   private String field_79;
   // $VF: renamed from: b long[]
   private long[] field_80;
   // $VF: renamed from: c long
   private long field_81;
   // $VF: renamed from: d boolean
   private boolean field_82;
   // $VF: renamed from: e long
   private long field_83;
   // $VF: renamed from: f boolean
   private boolean field_84;

   public class_6(String var1) {
      String[] var2 = var1.split("\\|");
      this.field_79 = var2[0].trim();
      this.field_83 = Long.parseLong(var2[1].trim());
      this.field_81 = 1L;
      this.field_82 = false;
      this.field_84 = false;
      String[] var3 = var2[2].trim().split("\\;");
      this.field_80 = new long[var3.length];

      for (int var4 = 0; var4 < var3.length; var4++) {
         this.field_80[var4] = Long.parseLong(var3[var4].trim());
      }
   }

   // $VF: renamed from: a () java.lang.String
   public String method_33() {
      return this.field_79;
   }

   // $VF: renamed from: b () long
   public long method_34() {
      return this.field_83;
   }

   // $VF: renamed from: c () long
   public long method_35() {
      return this.field_81;
   }

   // $VF: renamed from: a (long) void
   public void method_36(long var1) {
      this.field_81 = var1;
   }

   // $VF: renamed from: d () boolean
   public boolean method_37() {
      return this.field_82;
   }

   // $VF: renamed from: a (boolean) void
   public void method_38(boolean var1) {
      this.field_82 = var1;
   }

   // $VF: renamed from: b (boolean) void
   public void method_39(boolean var1) {
      this.field_84 = var1;
   }

   // $VF: renamed from: e () boolean
   public boolean method_40() {
      return this.field_84;
   }

   // $VF: renamed from: f () long[]
   public long[] method_41() {
      return this.field_80;
   }

   // $VF: renamed from: a (int) long
   public long method_42(int var1) {
      return this.field_80[var1];
   }
}
