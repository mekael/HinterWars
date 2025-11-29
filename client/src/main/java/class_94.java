import javax.sound.sampled.Clip;

// $VF: renamed from: L
class class_94 extends Thread {
   class_94(class_3 var1, Clip var2, double var3) {
      this.field_3135 = var1;
      this.field_3133 = var2;
      this.field_3134 = var3;
   }

   // $VF: renamed from: run () void
   @Override
   public void run() {
      class_3.method_29(this.field_3135, this.field_3133, this.field_3134);
      this.field_3133.setFramePosition(0);
      this.field_3133.loop(0);
   }
}
