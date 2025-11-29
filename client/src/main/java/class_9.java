import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

// $VF: renamed from: aA
public class class_9 {
   // $VF: renamed from: a java.util.Hashtable
   private Hashtable field_113 = new Hashtable();
   // $VF: renamed from: b java.util.Hashtable
   private Hashtable field_114 = new Hashtable();
   // $VF: renamed from: c java.lang.String
   private String field_115 = "res/cafe/Quest/";
   // $VF: renamed from: d java.lang.String
   private String field_116 = "res/cafe/SubQuest/Log/";

   // $VF: renamed from: a (long, long, long, java.lang.String) void
   public void method_82(long var1, long var3, long var5, String var7) {
      String[] var8 = new String[2];
      var8 = this.method_91(var1, var3, var5);
      if (var7.equalsIgnoreCase("current")) {
         this.field_113.put(var1, var8);
      } else if (var7.equalsIgnoreCase("completed")) {
         this.field_114.put(var1, var8);
      }
   }

   // $VF: renamed from: a (long) java.lang.String
   public String method_83(long var1) {
      String var3 = null;
      if (this.field_113.containsKey(var1)) {
         var3 = ((String[])this.field_113.get(var1))[1];
      } else if (this.field_114.containsKey(var1)) {
         var3 = ((String[])this.field_114.get(var1))[1];
      }

      return var3;
   }

   // $VF: renamed from: a (java.util.Vector) java.lang.String[]
   public String[] method_84(Vector var1) {
      return this.method_90(this.field_113, var1);
   }

   // $VF: renamed from: b (java.util.Vector) java.lang.String[]
   public String[] method_85(Vector var1) {
      return this.method_90(this.field_114, var1);
   }

   // $VF: renamed from: a () int
   public int method_86() {
      return this.field_113.size();
   }

   // $VF: renamed from: b () int
   public int method_87() {
      return this.field_114.size();
   }

   // $VF: renamed from: c () void
   public void method_88() {
      this.field_113.clear();
      this.field_114.clear();
   }

   // $VF: renamed from: a (java.io.InputStream) java.lang.String
   private String method_89(InputStream var1) {
      String var2 = "";
      if (var1 != null) {
         try {
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();

            int var4;
            while ((var4 = var1.read()) != -1) {
               var3.write(var4);
            }

            var1.close();
            var2 = new String(var3.toByteArray(), "utf-8");
         } catch (Exception var5) {
            class_62.method_563("QuestLog(processInputStream): Error =>" + var5);
         }
      }

      return var2;
   }

   // $VF: renamed from: a (java.util.Hashtable, java.util.Vector) java.lang.String[]
   private String[] method_90(Hashtable var1, Vector var2) {
      String[] var3 = new String[var2.size()];

      for (int var4 = 0; var4 < var2.size(); var4++) {
         Long var5 = (Long)var2.get(var4);
         var3[var4] = ((String[])var1.get(var5))[0];
      }

      return var3;
   }

   // $VF: renamed from: a (long, long, long) java.lang.String[]
   private String[] method_91(long var1, long var3, long var5) {
      InputStream var7 = this.getClass().getResourceAsStream(this.field_115 + var1 + ".txt");
      String[] var8 = new String[]{this.method_89(var7), null};
      var7 = this.getClass().getResourceAsStream(this.field_116 + var3 + ".txt");
      String var9 = this.method_89(var7);
      String[] var10 = var9.split("\\|");
      class_62.method_563("QuestLog(makeQuestLogEntry): QuestLog =>" + var10[0]);
      if (var5 == 1L) {
         var8[1] = var10[0];
      }

      if (var5 == 2L) {
         var8[1] = var10[1];
      }

      return var8;
   }
}
