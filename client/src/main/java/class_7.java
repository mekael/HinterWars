import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aQ
public class class_7 {
   // $VF: renamed from: a long
   private long field_85;
   // $VF: renamed from: b java.lang.String
   private String field_86;
   // $VF: renamed from: c long
   private long field_87;
   // $VF: renamed from: d java.lang.String
   private String field_88;
   // $VF: renamed from: e long
   private long field_89;
   // $VF: renamed from: f int[]
   private int[] field_90;
   // $VF: renamed from: g long
   private long field_91;
   // $VF: renamed from: h java.lang.String
   private String field_92;
   // $VF: renamed from: i javax.swing.Icon
   private Icon field_93;
   // $VF: renamed from: j java.lang.String
   private String field_94;
   // $VF: renamed from: k long
   private long field_95;
   // $VF: renamed from: l long
   private long field_96;
   // $VF: renamed from: m long
   private long field_97;
   // $VF: renamed from: n long
   private long field_98;
   // $VF: renamed from: o long
   private long field_99;
   // $VF: renamed from: p long
   private long field_100;
   // $VF: renamed from: q boolean
   private boolean field_101;

   public class_7(long var1) {
      this.field_85 = var1;
      this.field_101 = false;
   }

   // $VF: renamed from: a () long
   public long method_43() {
      return this.field_85;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_44(String var1) {
      this.field_86 = var1;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_45() {
      return this.field_86;
   }

   // $VF: renamed from: a (long) void
   public void method_46(long var1) {
      this.field_87 = var1;
   }

   // $VF: renamed from: c () long
   public long method_47() {
      return this.field_87;
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_48(String var1) {
      this.field_88 = var1;
   }

   // $VF: renamed from: d () java.lang.String
   public String method_49() {
      return this.field_88;
   }

   // $VF: renamed from: e () boolean
   public boolean method_50() {
      return this.field_88.startsWith("A");
   }

   // $VF: renamed from: b (long) void
   public void method_51(long var1) {
      this.field_89 = var1;
   }

   // $VF: renamed from: f () long
   public long method_52() {
      return this.field_89;
   }

   // $VF: renamed from: c (long) void
   public void method_53(long var1) {
      this.field_100 = var1;
   }

   // $VF: renamed from: g () long
   public long method_54() {
      return this.field_100;
   }

   // $VF: renamed from: d (long) void
   public void method_55(long var1) {
      this.field_99 = var1;
   }

   // $VF: renamed from: h () long
   public long method_56() {
      return this.field_99;
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_57(String var1) {
      String[] var2 = var1.split("\\|");

      for (int var3 = 0; var3 < var2.length; var3++) {
         class_62.method_563(var3 + "=" + var2[var3]);
      }

      this.field_90 = new int[var2.length];

      for (int var4 = 0; var4 < var2.length; var4++) {
         this.field_90[var4] = Integer.parseInt(var2[var4]);
      }
   }

   // $VF: renamed from: i () int[]
   public int[] method_58() {
      return this.field_90;
   }

   // $VF: renamed from: e (long) void
   public void method_59(long var1) {
      this.field_91 = var1;
   }

   // $VF: renamed from: j () long
   public long method_60() {
      return this.field_91;
   }

   // $VF: renamed from: f (long) void
   public void method_61(long var1) {
      this.field_98 = var1;
   }

   // $VF: renamed from: k () long
   public long method_62() {
      return this.field_98;
   }

   // $VF: renamed from: d (java.lang.String) void
   public void method_63(String var1) {
      this.field_92 = var1;
   }

   // $VF: renamed from: l () java.lang.String
   public String method_64() {
      return this.field_92;
   }

   // $VF: renamed from: e (java.lang.String) void
   public void method_65(String var1) {
      this.field_93 = new ImageIcon(this.getClass().getResource(var1));
      class_62.method_563("skill icon = " + this.field_93);
   }

   // $VF: renamed from: m () javax.swing.Icon
   public Icon method_66() {
      return this.field_93;
   }

   // $VF: renamed from: f (java.lang.String) void
   public void method_67(String var1) {
      this.field_94 = var1;
   }

   // $VF: renamed from: n () java.lang.String
   public String method_68() {
      return this.field_94;
   }

   // $VF: renamed from: g (long) void
   public void method_69(long var1) {
      this.field_95 = var1;
   }

   // $VF: renamed from: o () long
   public long method_70() {
      return this.field_95;
   }

   // $VF: renamed from: h (long) void
   public void method_71(long var1) {
      this.field_96 = var1;
   }

   // $VF: renamed from: p () long
   public long method_72() {
      return this.field_96;
   }

   // $VF: renamed from: i (long) void
   public void method_73(long var1) {
      this.field_97 = var1;
   }

   // $VF: renamed from: q () long
   public long method_74() {
      return this.field_97;
   }

   // $VF: renamed from: r () boolean
   public boolean method_75() {
      return this.field_101;
   }

   // $VF: renamed from: a (boolean) void
   public void method_76(boolean var1) {
      this.field_101 = var1;
   }

   // $VF: renamed from: s () java.lang.String
   public String method_77() {
      String var1 = String.valueOf(this.method_52());
      if (this.method_52() == -1L) {
         var1 = "Depends on weapon";
      } else {
         var1 = var1 + " tiles";
      }

      return this.method_45().toUpperCase()
         + "\n"
         + "\n"
         + "Skill Level: "
         + this.method_47()
         + "\n"
         + "Skill range: "
         + var1
         + "\n"
         + "Skill Area: "
         + this.method_72()
         + " tiles\n"
         + "Required Level: "
         + this.method_60()
         + "\n"
         + "Required Energy: "
         + this.method_70()
         + "\n"
         + "Required SP: "
         + this.method_62()
         + "\n"
         + "Skill Type: "
         + this.method_68()
         + "\n"
         + "Desc: "
         + this.method_64();
   }
}
