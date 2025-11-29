// $VF: renamed from: ax
public class class_70 extends class_68 {
   // $VF: renamed from: a java.lang.String
   public static final String field_2016 = "AM";
   // $VF: renamed from: b java.lang.String
   public static final String field_2017 = "MX";
   // $VF: renamed from: c java.lang.String
   public static final String field_2018 = "AA";
   // $VF: renamed from: d java.lang.String
   public static final String field_2019 = "AC";
   // $VF: renamed from: e java.lang.String
   public static final String field_2020 = "RP";
   // $VF: renamed from: f java.lang.String
   public static final String field_2021 = "PC";
   // $VF: renamed from: g java.lang.String
   public static final String field_2022 = "CI1";
   // $VF: renamed from: h java.lang.String
   public static final String field_2023 = "MR";
   // $VF: renamed from: i java.lang.String
   public static final String field_2024 = "SB";
   // $VF: renamed from: j java.lang.String
   public static final String field_2025 = "BF";
   // $VF: renamed from: k java.lang.String
   public static final String field_2026 = "CM";
   // $VF: renamed from: l java.lang.String
   public static final String field_2027 = "CA";
   // $VF: renamed from: m java.lang.String
   public static final String field_2028 = "EC";
   // $VF: renamed from: n java.lang.String
   public static final String field_2029 = "SM";
   // $VF: renamed from: o java.lang.String
   public static final String field_2030 = "SR";
   // $VF: renamed from: p java.lang.String
   public static final String field_2031 = "ME";
   // $VF: renamed from: q java.lang.String
   public static final String field_2032 = "IP";
   // $VF: renamed from: r java.lang.String
   public static final String field_2033 = "AI";
   // $VF: renamed from: s java.lang.String
   public static final String field_2034 = "TG";
   // $VF: renamed from: t java.lang.String
   public static final String field_2035 = "BP";
   // $VF: renamed from: u java.lang.String
   public static final String field_2036 = "RM";
   // $VF: renamed from: bR java.lang.String
   public static final String field_2037 = "BC";
   // $VF: renamed from: bS java.lang.String
   public static final String field_2038 = "MC";
   // $VF: renamed from: bT java.lang.String
   public static final String field_2039 = "LO";
   // $VF: renamed from: bU byte
   public static final byte field_2040 = 1;
   // $VF: renamed from: bV byte
   public static final byte field_2041 = 2;
   // $VF: renamed from: bW byte
   public static final byte field_2042 = 3;
   // $VF: renamed from: bX byte
   public static final byte field_2043 = 4;
   // $VF: renamed from: bY byte
   public static final byte field_2044 = 5;
   // $VF: renamed from: bZ byte
   public static final byte field_2045 = 6;
   // $VF: renamed from: ca byte
   public static final byte field_2046 = 7;
   // $VF: renamed from: cb byte
   public static final byte field_2047 = 8;
   // $VF: renamed from: cc byte
   public static final byte field_2048 = 9;
   // $VF: renamed from: cd byte
   public static final byte field_2049 = 10;

   // $VF: renamed from: a (java.lang.String[]) byte
   public static byte method_618(String[] var0) {
      byte var1 = 0;
      if (var0.length < 1) {
         return 0;
      } else {
         String var2 = var0[0];
         if (var2.equalsIgnoreCase("KA")) {
            var1 = -1;
         } else if (var2.equalsIgnoreCase("MX")) {
            var1 = 1;
         } else if (var2.equalsIgnoreCase("PC")) {
            var1 = 3;
         } else if (var2.equalsIgnoreCase("SB")) {
            var1 = 4;
         } else if (var2.equalsIgnoreCase("BF")) {
            var1 = 5;
         } else if (var2.equalsIgnoreCase("SR")) {
            var1 = 6;
         } else if (var2.equalsIgnoreCase("ME")) {
            var1 = 7;
         } else if (var2.equalsIgnoreCase("IP")) {
            var1 = 8;
         } else if (var2.equalsIgnoreCase("AI")) {
            var1 = 9;
         } else if (var2.equalsIgnoreCase("AC")) {
            var1 = 2;
         } else if (var2.equalsIgnoreCase("RM")) {
            var1 = 10;
         }

         return var1;
      }
   }

   // $VF: renamed from: e () java.lang.String
   public static String method_635() {
      return "MR\n";
   }

   // $VF: renamed from: a (long, long) java.lang.String
   public static String method_636(long var0, long var2) {
      return "CM|" + var0 + "|" + var2 + "\n";
   }

   // $VF: renamed from: b (long, long) java.lang.String
   public static String method_637(long var0, long var2) {
      return "CA|" + var0 + "|" + var2 + "\n";
   }

   // $VF: renamed from: a (long, java.lang.String) java.lang.String
   public static String method_638(long var0, String var2) {
      return "EC|" + var0 + "|" + var2 + "\n";
   }

   // $VF: renamed from: a (long) java.lang.String
   public static String method_639(long var0) {
      return "SM|" + var0 + "\n";
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, long) java.lang.String
   public static String method_640(String var0, String var1, long var2) {
      return "IP|" + var0 + "|" + var1 + "|" + var2 + "\n";
   }

   // $VF: renamed from: b (java.lang.String, java.lang.String, long) java.lang.String
   public static String method_641(String var0, String var1, long var2) {
      return "AI|" + var0 + "|" + var1 + "|" + var2 + "|" + "Y" + "\n";
   }

   // $VF: renamed from: c (java.lang.String, java.lang.String, long) java.lang.String
   public static String method_642(String var0, String var1, long var2) {
      return "AI|" + var0 + "|" + var1 + "|" + var2 + "|" + "N" + "\n";
   }

   // $VF: renamed from: d (java.lang.String, java.lang.String, long) java.lang.String
   public static String method_643(String var0, String var1, long var2) {
      return "RM|" + var0 + "|" + var1 + "|" + var2 + "|" + "N" + "\n";
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, long, java.lang.String, int) java.lang.String
   public static String method_644(String var0, String var1, long var2, String var4, int var5) {
      return "TG|" + var0 + "|" + var1 + "|" + var2 + "|" + var4 + "|" + var5 + "\n";
   }

   // $VF: renamed from: f () java.lang.String
   public static String method_645() {
      return "BP\n";
   }

   // $VF: renamed from: b (long) java.lang.String
   public static String method_646(long var0) {
      return "BC|" + var0 + "\n";
   }

   // $VF: renamed from: c (long) java.lang.String
   public static String method_647(long var0) {
      return "MC|" + var0 + "\n";
   }

   // $VF: renamed from: g () java.lang.String
   public static String method_648() {
      return "LO\n";
   }

   // $VF: renamed from: h () java.lang.String
   public static String method_649() {
      return "AM\n";
   }

   // $VF: renamed from: i () java.lang.String
   public static String method_650() {
      return "AA\n";
   }

   // $VF: renamed from: j () java.lang.String
   public static String method_651() {
      return "RP\n";
   }

   // $VF: renamed from: e (java.lang.String, java.lang.String, long) java.lang.String
   public static String method_652(String var0, String var1, long var2) {
      return "CI1|" + var0 + "|" + var1 + "|" + var2 + "\n";
   }
}
