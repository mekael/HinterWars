import java.util.Hashtable;

// $VF: renamed from: h
public class class_84 {
   // $VF: renamed from: a java.util.Hashtable[]
   Hashtable[] field_2860;
   // $VF: renamed from: b java.util.Hashtable[]
   Hashtable[] field_2861;
   // $VF: renamed from: c byte
   public static final byte field_2862 = 0;
   // $VF: renamed from: d byte
   public static final byte field_2863 = 1;
   // $VF: renamed from: e byte
   public static final byte field_2864 = 2;
   // $VF: renamed from: f byte
   public static final byte field_2865 = 3;
   // $VF: renamed from: g byte
   public static final byte field_2866 = 0;
   // $VF: renamed from: h byte
   public static final byte field_2867 = 1;
   // $VF: renamed from: i byte
   public static final byte field_2868 = 2;
   // $VF: renamed from: j byte
   public static final byte field_2869 = 0;
   // $VF: renamed from: k byte
   public static final byte field_2870 = 1;
   // $VF: renamed from: l byte
   public static final byte field_2871 = 2;
   // $VF: renamed from: m byte
   public static final byte field_2872 = 0;
   // $VF: renamed from: n byte
   public static final byte field_2873 = 1;
   // $VF: renamed from: o byte
   public static final byte field_2874 = 2;
   // $VF: renamed from: p byte
   public static final byte field_2875 = 0;
   // $VF: renamed from: q byte
   public static final byte field_2876 = 1;
   // $VF: renamed from: r byte
   public static final byte field_2877 = 2;
   // $VF: renamed from: s byte
   public static final byte field_2878 = 0;
   // $VF: renamed from: t byte
   public static final byte field_2879 = 1;
   // $VF: renamed from: u byte
   public static final byte field_2880 = 2;
   // $VF: renamed from: v byte
   public static final byte field_2881 = 0;
   // $VF: renamed from: w byte
   public static final byte field_2882 = 1;
   // $VF: renamed from: x byte
   public static final byte field_2883 = 2;
   // $VF: renamed from: y byte
   public static final byte field_2884 = 0;
   // $VF: renamed from: z byte
   public static final byte field_2885 = 1;
   // $VF: renamed from: A byte
   public static final byte field_2886 = 2;
   // $VF: renamed from: B byte
   public static final byte field_2887 = 0;
   // $VF: renamed from: C byte
   public static final byte field_2888 = 1;
   // $VF: renamed from: D byte
   public static final byte field_2889 = 2;
   // $VF: renamed from: E java.lang.String[][]
   private final String[][] field_2890 = new String[][]{
      {"res/items/humanHeadBlue.txt", "res/items/humanHeadRed.txt", "res/items/humanHeadYellow.txt"},
      {"res/items/taikusHeadPurple.txt", "res/items/taikusHeadRed.txt", "res/items/taikusHeadGreen.txt"},
      {"res/items/firanHeadPink.txt", "res/items/firanHeadPurple.txt", "res/items/firanHeadOrange.txt"},
      {"res/items/brucianHeadBlue.txt", "res/items/brucianHeadRed.txt", "res/items/brucianHeadGreen.txt"}
   };
   // $VF: renamed from: F java.lang.String[][]
   private final String[][] field_2891 = new String[][]{
      {"res/items/humanArmorBlue.txt", "res/items/humanArmorRed.txt", "res/items/humanArmorGreen.txt"},
      {"res/items/taikusArmorPurple.txt", "res/items/taikusArmorRed.txt", "res/items/taikusArmorGreen.txt"},
      {"res/items/firanArmorPink.txt", "res/items/firanArmorBlue.txt", "res/items/firanArmorGreen.txt"},
      {"res/items/brucianArmorBlue.txt", "res/items/brucianArmorPurple.txt", "res/items/brucianArmorOrange.txt"}
   };

   public class_84() {
      this.field_2860 = new Hashtable[4];
      this.field_2860[0] = new Hashtable();
      this.field_2860[1] = new Hashtable();
      this.field_2860[2] = new Hashtable();
      this.field_2860[3] = new Hashtable();
      this.field_2861 = new Hashtable[4];
      this.field_2861[0] = new Hashtable();
      this.field_2861[1] = new Hashtable();
      this.field_2861[2] = new Hashtable();
      this.field_2861[3] = new Hashtable();
   }

   // $VF: renamed from: a (int, int) S
   public class_85 method_769(int var1, int var2) {
      int var3 = var1 - 1;
      class_85 var4 = (class_85)this.field_2860[var3].get(new Integer(var2));
      if (var4 == null) {
         var4 = new class_85(this.field_2890[var3][var2]);
         this.field_2860[var3].put(new Integer(var2), var4);
      }

      return var4;
   }

   // $VF: renamed from: b (int, int) S
   public class_85 method_770(int var1, int var2) {
      int var3 = var1 - 1;
      class_85 var4 = (class_85)this.field_2861[var3].get(new Integer(var2));
      if (var4 == null) {
         var4 = new class_85(this.field_2891[var3][var2]);
         this.field_2861[var3].put(new Integer(var2), var4);
      }

      return var4;
   }
}
