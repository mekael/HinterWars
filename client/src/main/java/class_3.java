import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.FloatControl.Type;

// $VF: renamed from: aw
class class_3 {
   // $VF: renamed from: c javax.sound.sampled.Clip
   private Clip field_15 = null;
   // $VF: renamed from: d java.util.Hashtable
   private Hashtable field_16 = new Hashtable();
   // $VF: renamed from: e int
   private int field_17;
   // $VF: renamed from: f int
   private int field_18;
   // $VF: renamed from: a java.lang.String
   String field_19 = "config.conf";
   // $VF: renamed from: b aw
   public static final class_3 field_20 = new class_3();

   public class_3() {
      this.method_28();
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_17(String var1) {
      class_62.method_563("SYSTEM MEMORY LEFT =>" + Runtime.getRuntime().freeMemory() + " of " + Runtime.getRuntime().maxMemory());
      Object var2 = null;
      Vector var3 = new Vector();
      class_62.method_563("SoundManager(playSoundEffect): Attempting to play file =>" + var1);
      if (this.field_16.containsKey(var1)) {
         var3 = (Vector)this.field_16.get(var1);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            Clip var5 = (Clip)var3.get(var4);
            if (!var5.isRunning() && !var5.isActive()) {
               class_62.method_563("SoundManager(playSoundEffect): Now playing clip number =>" + var4);
               this.method_24(var5, this.field_17 * 0.1);
               return;
            }
         }
      }

      var2 = this.method_25(var1);
      if (var2 != null) {
         this.method_24((Clip)var2, this.field_17 * 0.1);
         var3.add(var2);
         this.field_16.put(var1, var3);
      } else {
         class_62.method_563("SoundManager(playSoundEffect): Could not play " + var1);
      }
   }

   // $VF: renamed from: a (java.lang.String, boolean) void
   public void method_18(String var1, boolean var2) {
      this.method_19();
      this.field_15 = this.method_25(var1);
      this.method_27(this.field_15, this.field_18 * 0.1);
      this.field_15.loop(-1);
      if (var2) {
         this.method_26();
      }
   }

   // $VF: renamed from: a () void
   public void method_19() {
      if (this.field_15 != null && this.field_15.isRunning()) {
         this.field_15.stop();
         this.field_15.close();
         this.field_15 = null;
      }
   }

   // $VF: renamed from: a (int) void
   public void method_20(int var1) {
      this.field_17 = var1;
      this.method_17("res/sound/mouse_effects/mouseclick_success.wav");
      class_56.field_1522.method_497(var1 + "");
   }

   // $VF: renamed from: b (int) void
   public void method_21(int var1) {
      this.field_18 = var1;
      this.method_27(this.field_15, var1 * 0.1);
      class_56.field_1522.method_498(var1 + "");
   }

   // $VF: renamed from: b () int
   public int method_22() {
      return this.field_17;
   }

   // $VF: renamed from: c () int
   public int method_23() {
      return this.field_18;
   }

   // $VF: renamed from: a (javax.sound.sampled.Clip, double) void
   private void method_24(Clip var1, double var2) {
      class_94 var7 = new class_94(this, var1, var2);
      var7.start();
   }

   // $VF: renamed from: b (java.lang.String) javax.sound.sampled.Clip
   private Clip method_25(String var1) {
      Clip var2 = null;

      try {
         InputStream var3 = field_20.getClass().getClassLoader().getResource(var1).openStream();
         AudioInputStream var4 = AudioSystem.getAudioInputStream(var3);
         Info var5 = new Info(Clip.class, var4.getFormat());
         var2 = (Clip)AudioSystem.getLine(var5);
         var2.open(var4);
      } catch (Exception var6) {
         class_62.method_563("SoundManager(playSoundEffect): " + var6);
      }

      return var2;
   }

   // $VF: renamed from: d () void
   private void method_26() {
      Enumeration var1 = this.field_16.elements();

      while (var1.hasMoreElements()) {
         Vector var2 = (Vector)var1.nextElement();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            ((Clip)var2.get(var3)).close();
         }
      }

      this.field_16 = null;
      this.field_16 = new Hashtable();
   }

   // $VF: renamed from: b (javax.sound.sampled.Clip, double) void
   private void method_27(Clip var1, double var2) {
      FloatControl var4 = (FloatControl)var1.getControl(Type.MASTER_GAIN);
      float var7 = (float)(Math.log(var2) / Math.log(10.0) * 20.0);
      var4.setValue(var7);
      BooleanControl var8 = (BooleanControl)var1.getControl(javax.sound.sampled.BooleanControl.Type.MUTE);
      var8.setValue(false);
   }

   // $VF: renamed from: e () void
   private void method_28() {
      this.field_17 = class_56.field_1522.method_494();
      this.field_18 = class_56.field_1522.method_495();
   }
}
