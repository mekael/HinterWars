// $VF: renamed from: P
public class class_71 extends class_68 {
   // $VF: renamed from: a java.lang.String
   public static final String field_2050 = "N5";
   // $VF: renamed from: b java.lang.String
   public static final String field_2051 = "N7";
   // $VF: renamed from: c java.lang.String
   public static final String field_2052 = "N6";
   // $VF: renamed from: d java.lang.String
   public static final String field_2053 = "N8";
   // $VF: renamed from: e java.lang.String
   public static final String field_2054 = "N9";
   // $VF: renamed from: f java.lang.String
   public static final String field_2055 = "Q1";
   // $VF: renamed from: g java.lang.String
   public static final String field_2056 = "Q2";
   // $VF: renamed from: h java.lang.String
   public static final String field_2057 = "Q3";
   // $VF: renamed from: i java.lang.String
   public static final String field_2058 = "Q27";
   // $VF: renamed from: j java.lang.String
   public static final String field_2059 = "Q28";
   // $VF: renamed from: k java.lang.String
   public static final String field_2060 = "Q29";
   // $VF: renamed from: l java.lang.String
   public static final String field_2061 = "Q30";
   // $VF: renamed from: m java.lang.String
   public static final String field_2062 = "Q7";
   // $VF: renamed from: n java.lang.String
   public static final String field_2063 = "Q9";
   // $VF: renamed from: o java.lang.String
   public static final String field_2064 = "Q10";
   // $VF: renamed from: p byte
   public static final byte field_2065 = 1;
   // $VF: renamed from: q byte
   public static final byte field_2066 = 2;
   // $VF: renamed from: r byte
   public static final byte field_2067 = 3;
   // $VF: renamed from: s byte
   public static final byte field_2068 = 4;
   // $VF: renamed from: t byte
   public static final byte field_2069 = 5;
   // $VF: renamed from: u byte
   public static final byte field_2070 = 6;
   // $VF: renamed from: bR byte
   public static final byte field_2071 = 7;
   // $VF: renamed from: bS byte
   public static final byte field_2072 = 8;
   // $VF: renamed from: bT byte
   public static final byte field_2073 = 9;
   // $VF: renamed from: bU byte
   public static final byte field_2074 = 10;

   // $VF: renamed from: a (java.lang.String[]) byte
   public static byte method_618(String[] var0) {
      byte var1 = 0;
      if (var0.length < 1) {
         return 0;
      } else {
         String var2 = var0[0];
         if (var2.equalsIgnoreCase("KA")) {
            var1 = -1;
         } else if (var2.equalsIgnoreCase("N7")) {
            var1 = 1;
         } else if (var2.equalsIgnoreCase("N6")) {
            var1 = 2;
         } else if (var2.equalsIgnoreCase("N8")) {
            var1 = 3;
         } else if (var2.equalsIgnoreCase("Q2")) {
            var1 = 4;
         } else if (var2.equalsIgnoreCase("Q3")) {
            var1 = 5;
         } else if (var2.equalsIgnoreCase("Q27")) {
            var1 = 6;
         } else if (var2.equalsIgnoreCase("Q9")) {
            var1 = 7;
         } else if (var2.equalsIgnoreCase("Q10")) {
            var1 = 8;
         } else if (var2.equalsIgnoreCase("Q29")) {
            var1 = 9;
         } else if (var2.equalsIgnoreCase("Q30")) {
            var1 = 10;
         }

         return var1;
      }
   }

   // $VF: renamed from: e () java.lang.String
   public static String method_653() {
      return "N5\n";
   }

   // $VF: renamed from: f () java.lang.String
   public static String method_654() {
      return "N9\n";
   }

   // $VF: renamed from: a (long) java.lang.String
   public static String method_655(long var0) {
      return "Q1|" + var0 + "\n";
   }

   // $VF: renamed from: b (long) java.lang.String
   public static String method_656(long var0) {
      return "Q7|" + var0 + "\n";
   }

   // $VF: renamed from: a (long, long) java.lang.String
   public static String method_657(long var0, long var2) {
      return "Q28|" + var0 + "|" + var2 + "\n";
   }
}
