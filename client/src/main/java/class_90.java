import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;

// $VF: renamed from: ad
public class class_90 extends class_86 {
   // $VF: renamed from: aC int
   private int field_3017;
   // $VF: renamed from: aD int
   private int field_3018;
   // $VF: renamed from: aE int
   private int field_3019;
   // $VF: renamed from: aF long
   private long field_3020;
   // $VF: renamed from: aG long
   private long field_3021;
   // $VF: renamed from: aH long
   private long field_3022;
   // $VF: renamed from: aI long
   private long field_3023;
   // $VF: renamed from: aJ long
   private long field_3024;
   // $VF: renamed from: aK long
   private long field_3025;
   // $VF: renamed from: aL long
   private long field_3026;
   // $VF: renamed from: aM long
   private long field_3027;
   // $VF: renamed from: aN long
   private long field_3028;
   // $VF: renamed from: aO long
   private long field_3029;
   // $VF: renamed from: aP long
   private long field_3030;
   // $VF: renamed from: aQ long
   private long field_3031;
   // $VF: renamed from: aR long
   private long field_3032;
   // $VF: renamed from: aS long
   private long field_3033;
   // $VF: renamed from: aT long
   private long field_3034;
   // $VF: renamed from: j int
   static final int field_3035 = 0;
   // $VF: renamed from: k int
   static final int field_3036 = 1;
   // $VF: renamed from: l int
   static final int field_3037 = 2;
   // $VF: renamed from: m int
   static final int field_3038 = 3;
   // $VF: renamed from: n int
   static final int field_3039 = 4;
   // $VF: renamed from: o int
   static final int field_3040 = 5;
   // $VF: renamed from: p int
   static final int field_3041 = 6;
   // $VF: renamed from: q int
   static final int field_3042 = 7;
   // $VF: renamed from: r int
   static final int field_3043 = 8;
   // $VF: renamed from: s int
   static final int field_3044 = 9;
   // $VF: renamed from: t int
   static final int field_3045 = 10;
   // $VF: renamed from: u int
   static final int field_3046 = 11;
   // $VF: renamed from: v int
   static final int field_3047 = 12;
   // $VF: renamed from: w int
   static final int field_3048 = 13;
   // $VF: renamed from: x int
   static final int field_3049 = 14;
   // $VF: renamed from: y int
   static final int field_3050 = 15;
   // $VF: renamed from: z byte
   final byte field_3051 = 16;
   // $VF: renamed from: A byte
   final byte field_3052 = 17;
   // $VF: renamed from: B int
   int field_3053 = 132;
   // $VF: renamed from: C int
   int field_3054 = 172;
   // $VF: renamed from: D long
   long field_3055;
   // $VF: renamed from: E java.lang.String
   String field_3056;
   // $VF: renamed from: F java.awt.Color
   Color field_3057;
   // $VF: renamed from: G java.io.PrintWriter
   PrintWriter field_3058;
   // $VF: renamed from: H java.util.Vector[]
   Vector[] field_3059;
   // $VF: renamed from: I byte
   static final byte field_3060 = 0;
   // $VF: renamed from: J byte
   static final byte field_3061 = 1;
   // $VF: renamed from: K byte
   static final byte field_3062 = 2;
   // $VF: renamed from: L byte
   static final byte field_3063 = 3;
   // $VF: renamed from: M java.util.Vector
   Vector field_3064;
   // $VF: renamed from: N javax.swing.Icon[][]
   Icon[][] field_3065;
   // $VF: renamed from: O int
   int field_3066;
   // $VF: renamed from: P int
   int field_3067;
   // $VF: renamed from: Q int
   int field_3068;
   // $VF: renamed from: R javax.swing.Icon[][]
   Icon[][] field_3069;
   // $VF: renamed from: S int
   int field_3070;
   // $VF: renamed from: T int
   int field_3071;
   // $VF: renamed from: U int
   int field_3072;
   // $VF: renamed from: V java.awt.image.BufferedImage
   BufferedImage field_3073;
   // $VF: renamed from: W javax.swing.Icon
   Icon field_3074;
   // $VF: renamed from: X javax.swing.Icon[]
   Icon[] field_3075;
   // $VF: renamed from: Y int
   int field_3076;
   // $VF: renamed from: Z long
   long field_3077;
   // $VF: renamed from: aa long
   long field_3078;
   // $VF: renamed from: ab boolean
   boolean field_3079;
   // $VF: renamed from: ac long
   long field_3080;
   // $VF: renamed from: ad ak
   class_87 field_3081;
   // $VF: renamed from: ae int
   int field_3082;
   // $VF: renamed from: af java.lang.String
   String field_3083 = "";
   // $VF: renamed from: ag long
   long field_3084;
   // $VF: renamed from: ah boolean
   boolean field_3085;
   // $VF: renamed from: ai int
   int field_3086;
   // $VF: renamed from: aj long
   long field_3087;
   // $VF: renamed from: ak boolean
   boolean field_3088;
   // $VF: renamed from: al int
   int field_3089;
   // $VF: renamed from: am int
   int field_3090;
   // $VF: renamed from: an int
   int field_3091;
   // $VF: renamed from: ao int
   int field_3092;
   // $VF: renamed from: ap int
   int field_3093;
   // $VF: renamed from: aq int
   int field_3094;
   // $VF: renamed from: ar int
   int field_3095;
   // $VF: renamed from: as int
   int field_3096;
   // $VF: renamed from: at int
   int field_3097;
   // $VF: renamed from: au int
   int field_3098;
   // $VF: renamed from: av int
   int field_3099;
   // $VF: renamed from: aw int
   int field_3100;
   // $VF: renamed from: ax int
   int field_3101;
   // $VF: renamed from: ay int
   int field_3102;
   // $VF: renamed from: az java.util.Vector
   Vector field_3103 = new Vector();
   // $VF: renamed from: aA int
   int field_3104;
   // $VF: renamed from: aB int
   int field_3105;

   // $VF: renamed from: a (int) void
   public void method_812(int var1) {
      this.field_3017 = var1;
   }

   // $VF: renamed from: m () int
   public int method_813() {
      return this.field_3017;
   }

   // $VF: renamed from: b (long) void
   public void method_814(long var1) {
      this.field_3020 = var1;
   }

   // $VF: renamed from: n () long
   public long method_815() {
      return this.field_3020;
   }

   // $VF: renamed from: c (long) void
   public void method_816(long var1) {
      this.field_3021 = var1;
   }

   // $VF: renamed from: o () long
   public long method_817() {
      return this.field_3021;
   }

   // $VF: renamed from: d (long) void
   public void method_818(long var1) {
      this.field_3031 = var1;
   }

   // $VF: renamed from: p () long
   public long method_819() {
      return this.field_3031;
   }

   // $VF: renamed from: e (long) void
   public void method_820(long var1) {
      this.field_3030 = var1;
   }

   // $VF: renamed from: q () long
   public long method_821() {
      return this.field_3030;
   }

   // $VF: renamed from: f (long) void
   public void method_822(long var1) {
      this.field_3023 = var1;
   }

   // $VF: renamed from: r () long
   public long method_823() {
      return this.field_3023;
   }

   // $VF: renamed from: g (long) void
   public void method_824(long var1) {
      this.field_3022 = var1;
   }

   // $VF: renamed from: s () long
   public long method_825() {
      return this.field_3022;
   }

   // $VF: renamed from: h (long) void
   public void method_826(long var1) {
      this.field_3025 = var1;
   }

   // $VF: renamed from: t () long
   public long method_827() {
      return this.field_3025;
   }

   // $VF: renamed from: i (long) void
   public void method_828(long var1) {
      this.field_3026 = var1;
   }

   // $VF: renamed from: u () long
   public long method_829() {
      return this.field_3026;
   }

   // $VF: renamed from: j (long) void
   public void method_830(long var1) {
      this.field_3029 = var1;
   }

   // $VF: renamed from: v () long
   public long method_831() {
      return this.field_3029;
   }

   // $VF: renamed from: k (long) void
   public void method_832(long var1) {
      this.field_3024 = var1;
   }

   // $VF: renamed from: w () long
   public long method_833() {
      return this.field_3024;
   }

   // $VF: renamed from: l (long) void
   public void method_834(long var1) {
      this.field_3027 = var1;
   }

   // $VF: renamed from: x () long
   public long method_835() {
      return this.field_3027;
   }

   // $VF: renamed from: m (long) void
   public void method_836(long var1) {
      this.field_3032 = var1;
   }

   // $VF: renamed from: y () long
   public long method_837() {
      return this.field_3032;
   }

   // $VF: renamed from: n (long) void
   public void method_838(long var1) {
      this.field_3033 = var1;
   }

   // $VF: renamed from: z () long
   public long method_839() {
      return this.field_3033;
   }

   // $VF: renamed from: o (long) void
   public void method_840(long var1) {
      this.field_3034 = var1;
   }

   // $VF: renamed from: A () long
   public long method_841() {
      return this.field_3034;
   }

   // $VF: renamed from: p (long) void
   public void method_842(long var1) {
      this.field_3028 = var1;
   }

   // $VF: renamed from: B () long
   public long method_843() {
      return this.field_3028;
   }

   // $VF: renamed from: C () int
   public int method_844() {
      return this.field_3018;
   }

   // $VF: renamed from: b (int) void
   public void method_845(int var1) {
      this.field_3018 = var1;
   }

   // $VF: renamed from: D () int
   public int method_846() {
      return this.field_3019;
   }

   // $VF: renamed from: c (int) void
   public void method_847(int var1) {
      this.field_3019 = var1;
   }

   // $VF: renamed from: a () int
   @Override
   public int method_784() {
      return 1;
   }

   // $VF: renamed from: a (ac) boolean
   @Override
   public boolean method_785(class_86 var1) {
      return false;
   }

   // $VF: renamed from: b (ac) boolean
   @Override
   public boolean method_786(class_86 var1) {
      return false;
   }

   // $VF: renamed from: b () java.util.Enumeration
   @Override
   public Enumeration method_787() {
      return null;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_790() {
      this.field_3059 = new Vector[4];
      this.field_3059[0] = new Vector();
      this.field_3059[1] = new Vector();
      this.field_3059[2] = new Vector();
      this.field_3059[3] = new Vector();
      this.field_3064 = new Vector();
   }

   // $VF: renamed from: a (javax.swing.Icon[][], int, int, int, javax.swing.Icon[][], int, int, int, java.awt.image.BufferedImage, javax.swing.Icon, javax.swing.Icon[]) void
   public void method_848(
      Icon[][] var1, int var2, int var3, int var4, Icon[][] var5, int var6, int var7, int var8, BufferedImage var9, Icon var10, Icon[] var11
   ) {
      this.field_3065 = var1;
      this.field_3066 = var3;
      this.field_3067 = var4;
      this.field_3068 = var2;
      this.field_3069 = var5;
      this.field_3070 = var7;
      this.field_3071 = var8;
      this.field_3072 = var6;
      this.field_3073 = var9;
      this.field_3074 = var10;
      this.field_3075 = var11;
      this.field_3081 = class_87.method_803();
      this.field_3081.method_804((byte)1);
      this.field_3076 = 0;
      this.field_3077 = 0L;
      this.field_3078 = 0L;
      this.field_3079 = false;
      this.field_3080 = 0L;
   }

   // $VF: renamed from: d (int) void
   void method_849(int var1) {
      this.field_3082 = var1;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_850(String var1) {
      class_62.method_563("ID - " + this.field_3055 + " says:" + var1);
      this.field_3083 = var1;
      this.field_3084 = System.currentTimeMillis() + 5000L;
      this.field_3085 = true;
   }

   // $VF: renamed from: e (int) void
   public void method_851(int var1) {
      this.field_3086 = var1;
      this.field_3087 = System.currentTimeMillis() + 5000L;
      this.field_3088 = true;
   }

   // $VF: renamed from: k () int
   @Override
   public int method_801() {
      return this.field_3093;
   }

   // $VF: renamed from: l () int
   @Override
   public int method_802() {
      return this.field_3094;
   }

   // $VF: renamed from: i () int
   @Override
   public int method_799() {
      return this.field_3095;
   }

   // $VF: renamed from: j () int
   @Override
   public int method_800() {
      return this.field_3096;
   }

   // $VF: renamed from: f (int) int
   int method_852(int var1) {
      return 0 - var1 + this.field_3053;
   }

   // $VF: renamed from: g (int) int
   int method_853(int var1) {
      return 0 - var1 + this.field_3054;
   }

   // $VF: renamed from: h (int) int
   int method_854(int var1) {
      return 0 - this.field_3089 + this.field_3053;
   }

   // $VF: renamed from: i (int) int
   int method_855(int var1) {
      return 0 - this.field_3090 + this.field_3054 - 13;
   }

   // $VF: renamed from: a (int, int) void
   void method_856(int var1, int var2) {
      this.field_3091 = var1;
      this.field_3092 = var2;
   }

   // $VF: renamed from: b (int, int) void
   void method_857(int var1, int var2) {
      this.field_3095 = var1;
      this.field_3096 = var2;
   }

   // $VF: renamed from: E () void
   void method_858() {
      this.field_3093 = this.field_3089 + this.field_3091;
      this.field_3094 = this.field_3090 + this.field_3092 + 12;
      this.field_3097 = this.field_3093 + this.field_3095 / 2;
      this.field_3098 = this.field_3094 + this.field_3096 / 2;
   }

   // $VF: renamed from: c (int, int) void
   void method_859(int var1, int var2) {
      Dimension var3 = new Dimension(var1 + this.field_3091 + this.field_3095 / 2, var2 + this.field_3092 + this.field_3096 / 2);
      this.field_3103.add(var3);
      if (this.field_3103.size() == 1) {
         this.method_861();
      }
   }

   // $VF: renamed from: d (int, int) void
   void method_860(int var1, int var2) {
      this.field_3101 = var1;
      this.field_3102 = var2;
      this.field_3099 = this.field_3101 - this.field_3095 / 2;
      this.field_3100 = this.field_3102 - this.field_3096 / 2;
   }

   // $VF: renamed from: F () void
   void method_861() {
      if (this.field_3103.size() != 0) {
         Dimension var1 = (Dimension)this.field_3103.get(0);
         this.method_860(var1.width, var1.height);
         this.field_3103.remove(0);
      } else {
         this.field_3079 = false;
         switch (this.field_3082) {
            case 8:
               this.field_3082 = 0;
               break;
            case 9:
               this.field_3082 = 1;
               break;
            case 10:
               this.field_3082 = 2;
               break;
            case 11:
               this.field_3082 = 3;
               break;
            case 12:
               this.field_3082 = 4;
               break;
            case 13:
               this.field_3082 = 5;
               break;
            case 14:
               this.field_3082 = 6;
               break;
            case 15:
               this.field_3082 = 7;
         }

         this.field_3076 = 0;
         this.method_860(this.field_3097, this.field_3098);
         if (this.field_3058 != null) {
            this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
            this.field_3058.flush();
         }
      }
   }

   // $VF: renamed from: G () void
   void method_862() {
      this.field_3102 = this.field_3102 - (this.field_3096 / 2 + 4);
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: H () void
   void method_863() {
      this.field_3102 = this.field_3102 + this.field_3096 / 2 + 4;
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: I () void
   void method_864() {
      this.field_3101 = this.field_3101 - (this.field_3095 / 2 + 4);
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: J () void
   void method_865() {
      this.field_3101 = this.field_3101 + this.field_3095 / 2 + 4;
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: K () void
   void method_866() {
      this.method_862();
      this.method_865();
      this.field_3102 += 4;
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: L () void
   void method_867() {
      this.method_862();
      this.method_864();
      this.field_3102 += 4;
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: M () void
   void method_868() {
      this.method_863();
      this.method_865();
      this.field_3102 -= 4;
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: N () void
   void method_869() {
      this.method_863();
      this.method_864();
      this.field_3102 -= 4;
      this.method_860(this.field_3101, this.field_3102);
   }

   // $VF: renamed from: e (int, int) void
   public void method_870(int var1, int var2) {
      this.field_3104 = var1;
      this.field_3105 = var2;
   }

   // $VF: renamed from: f (int, int) boolean
   private boolean method_871(int var1, int var2) {
      int[] var3 = new int[this.field_3104 * this.field_3105];
      this.method_858();
      this.field_3073
         .getRGB(
            this.field_3093 - this.field_3104 / 2 + var1,
            this.field_3094 - this.field_3105 / 2 + var2,
            this.field_3104,
            this.field_3105,
            var3,
            0,
            this.field_3104
         );

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var3[var4] != -16777216) {
            return false;
         }
      }

      return true;
   }

   // $VF: renamed from: a (long) void
   @Override
   public void method_791(long var1) {
      if (this.field_3099 <= this.field_3097
         && this.field_3099 + this.field_3095 >= this.field_3093
         && this.field_3100 <= this.field_3098
         && this.field_3100 + this.field_3096 >= this.field_3098) {
         this.field_3079 = false;
         switch (this.field_3082) {
            case 8:
               this.field_3082 = 0;
               break;
            case 9:
               this.field_3082 = 1;
               break;
            case 10:
               this.field_3082 = 2;
               break;
            case 11:
               this.field_3082 = 3;
               break;
            case 12:
               this.field_3082 = 4;
               break;
            case 13:
               this.field_3082 = 5;
               break;
            case 14:
               this.field_3082 = 6;
               break;
            case 15:
               this.field_3082 = 7;
         }

         this.field_3076 = 0;
         this.method_860(this.field_3097, this.field_3098);
      } else {
         if (var1 > this.field_3078) {
            if ((this.field_3099 > this.field_3097 || this.field_3099 + this.field_3095 < this.field_3093)
               && (this.field_3100 > this.field_3098 || this.field_3100 + this.field_3096 < this.field_3098)) {
               if (this.field_3099 > this.field_3097 && this.field_3100 > this.field_3098) {
                  if (this.method_871(8, 4)) {
                     this.field_3089 += 8;
                     this.field_3090 += 4;
                  }

                  if (this.field_3082 != 11) {
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }

                     this.field_3082 = 11;
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }
                  }
               } else if (this.field_3099 > this.field_3097 && this.field_3100 + this.field_3096 < this.field_3098) {
                  if (this.method_871(8, -4)) {
                     this.field_3089 += 8;
                     this.field_3090 -= 4;
                  }

                  if (this.field_3082 != 8) {
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }

                     this.field_3082 = 8;
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }
                  }
               } else if (this.field_3099 + this.field_3095 < this.field_3097 && this.field_3100 > this.field_3098) {
                  if (this.method_871(-8, 4)) {
                     this.field_3089 -= 8;
                     this.field_3090 += 4;
                  }

                  if (this.field_3082 != 10) {
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }

                     this.field_3082 = 10;
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }
                  }
               } else if (this.field_3099 + this.field_3095 < this.field_3097 && this.field_3100 + this.field_3096 < this.field_3098) {
                  if (this.method_871(-8, -4)) {
                     this.field_3089 -= 8;
                     this.field_3090 -= 4;
                  }

                  if (this.field_3082 != 9) {
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }

                     this.field_3082 = 9;
                     if (this.field_3058 != null) {
                        this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                        this.field_3058.flush();
                     }
                  }
               } else {
                  class_62.method_563("WHAT THE ?!!!! *cross eyed* ");
               }
            } else if (this.field_3100 > this.field_3098) {
               if (this.method_871(0, 8)) {
                  this.field_3090 += 8;
               }

               if (this.field_3082 != 13) {
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }

                  this.field_3082 = 13;
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }
               }
            } else if (this.field_3100 + this.field_3096 < this.field_3098) {
               if (this.method_871(0, -8)) {
                  this.field_3090 -= 8;
               }

               if (this.field_3082 != 12) {
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }

                  this.field_3082 = 12;
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }
               }
            } else if (this.field_3099 > this.field_3097) {
               if (this.method_871(8, 0)) {
                  this.field_3089 += 8;
               }

               if (this.field_3082 != 15) {
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }

                  this.field_3082 = 15;
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }
               }
            } else if (this.field_3099 + this.field_3095 < this.field_3097) {
               if (this.method_871(-8, 0)) {
                  this.field_3089 -= 8;
               }

               if (this.field_3082 != 14) {
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }

                  this.field_3082 = 14;
                  if (this.field_3058 != null) {
                     this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
                     this.field_3058.flush();
                  }
               }
            }

            this.method_858();
            if (!this.field_3079 && this.field_3055 == GameStates.field_436) {
               this.field_3080 = var1 + 1000L;
               this.field_3079 = true;
            }

            this.field_3078 = var1 + 60L;
         }

         if (var1 > this.field_3077) {
            this.field_3076 = (this.field_3076 + 1) % 4;
            this.field_3077 = var1 + 100L;
         }
      }

      if (var1 > this.field_3084 && this.field_3085) {
         this.field_3085 = false;
      }

      if (var1 > this.field_3087 && this.field_3088) {
         this.field_3088 = false;
      }

      if (var1 > this.field_3080 && this.field_3079) {
         this.field_3080 = var1 + 1000L;
         if (this.field_3058 != null) {
            class_62.method_563("send update");
            this.field_3058.write("WK|" + this.method_854(this.field_3089) + "|" + this.method_855(this.field_3090) + "|" + this.field_3082 + "\n");
            this.field_3058.flush();
         }
      }
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_793(Graphics var1, MastersOfDestiny var2) {
      this.method_873(var1);
      this.method_872(var1);
   }

   // $VF: renamed from: a (java.awt.Graphics) void
   public void method_872(Graphics var1) {
      this.field_3065[this.field_3082][this.field_3076 % this.field_3068]
         .paintIcon(GameStates.field_1274, var1, this.field_3089 + this.field_3066, this.field_3090 + this.field_3067);
   }

   // $VF: renamed from: b (java.awt.Graphics) void
   public void method_873(Graphics var1) {
      this.field_3069[this.field_3082][this.field_3076 % this.field_3072]
         .paintIcon(GameStates.field_1274, var1, this.field_3089 + this.field_3070, this.field_3090 + this.field_3071);
   }

   // $VF: renamed from: d (ac) void
   @Override
   public void method_792(class_86 var1) {
      try {
         if (var1.getClass() == Class.forName("C")) {
            class_88 var2 = (class_88)var1;
            var2.method_810(this.field_3093, this.field_3094, this.field_3095, this.field_3096);
            if (this.field_3058 != null) {
               class_60.method_550().method_557(101, var2);
            }
         }
      } catch (ClassNotFoundException var3) {
      }
   }

   // $VF: renamed from: b (java.awt.Graphics, MastersOfDestiny) void
   @Override
   public void method_794(Graphics var1, MastersOfDestiny var2) {
      this.field_3090 += 10;
      if (this.field_3088) {
         this.field_3075[this.field_3086]
            .paintIcon(
               GameStates.field_1274,
               var1,
               this.field_3089 + this.field_3065[0][0].getIconWidth() / 2 - this.field_3075[this.field_3086].getIconWidth() / 2 + 8,
               this.field_3090 - this.field_3075[this.field_3086].getIconHeight()
            );
      }

      if (this.field_3085) {
         int var3 = this.field_3089 + this.field_3065[0][0].getIconWidth() / 2 - this.field_3074.getIconWidth() / 2 + 5;
         int var4 = this.field_3090 - this.field_3074.getIconHeight();
         this.field_3074.paintIcon(GameStates.field_1274, var1, var3, var4);
         var1.setColor(Color.BLACK);
         this.field_3081.method_805(this.field_3083, var3 + 5, var4 + 10, 163, 17, MastersOfDestiny.field_2848, null);
         this.field_3081.method_793(var1, var2);
      }

      var1.setFont(new Font(null, 0, 9));
      var1.setColor(this.field_3057);
      var1.drawString(
         this.field_3056,
         this.field_3089 + this.field_3065[0][0].getIconWidth() / 2 - var1.getFontMetrics().stringWidth(this.field_3056) / 2 + 8,
         this.field_3090 + 1
      );
      this.field_3090 -= 10;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1.getClass() != this.getClass()) {
         return false;
      } else {
         class_90 var2 = (class_90)var1;
         return this.field_3055 == var2.field_3055;
      }
   }
}
