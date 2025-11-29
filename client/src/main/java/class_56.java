import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

// $VF: renamed from: aB
public class class_56 {
   // $VF: renamed from: b java.io.File
   private File field_1520 = new File("config.conf");
   // $VF: renamed from: c java.util.Properties
   private Properties field_1521 = new Properties();
   // $VF: renamed from: a aB
   public static final class_56 field_1522 = new class_56();

   public class_56() {
      try {
         FileInputStream var1 = new FileInputStream(this.field_1520);
         this.field_1521.load(var1);
         var1.close();
         Object var3 = null;
      } catch (Exception var2) {
         class_62.method_563("GameSettings(Constructor): Problem initializing settings, using defaults");
         this.method_491();
      }
   }

   // $VF: renamed from: d () void
   private void method_491() {
      this.field_1521.setProperty("USERNAME", "");
      this.field_1521.setProperty("SFX_VOLUME", "5");
      this.field_1521.setProperty("MUSIC_VOLUME", "5");
      this.method_492();
   }

   // $VF: renamed from: e () void
   private void method_492() {
      try {
         FileOutputStream var1 = new FileOutputStream(this.field_1520);
         this.field_1521.store(var1, "");
         var1.close();
         Object var3 = null;
      } catch (Exception var2) {
         class_62.method_563("GameSettings(saveChanges): Problem saving changes =>" + var2);
      }
   }

   // $VF: renamed from: a () java.lang.String
   public String method_493() {
      return this.field_1521.getProperty("USERNAME");
   }

   // $VF: renamed from: b () int
   public int method_494() {
      return Integer.parseInt(this.field_1521.getProperty("SFX_VOLUME"));
   }

   // $VF: renamed from: c () int
   public int method_495() {
      return Integer.parseInt(this.field_1521.getProperty("MUSIC_VOLUME"));
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_496(String var1) {
      this.field_1521.setProperty("USERNAME", var1);
      this.method_492();
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_497(String var1) {
      this.field_1521.setProperty("SFX_VOLUME", var1);
      this.method_492();
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_498(String var1) {
      this.field_1521.setProperty("MUSIC_VOLUME", var1);
      this.method_492();
   }
}
