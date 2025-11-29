import java.io.IOException;

// $VF: renamed from: Y
public class class_96 extends Thread {
   // $VF: renamed from: a boolean
   private boolean field_3139;
   // $VF: renamed from: b GameStates
   private GameStates field_3140;
   // $VF: renamed from: c int
   private int field_3141;

   public class_96(GameStates var1) {
      this.field_3140 = var1;
      this.field_3141 = 0;
      this.field_3139 = false;
   }

   // $VF: renamed from: a () void
   public void method_891() {
      this.field_3139 = true;
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public String method_892(String var1) {
      class_62.method_563("test " + var1);
      String[] var2 = var1.split("\\|");
      this.field_3140.field_1234.write("ACK|" + var2[1] + "\n");
      this.field_3140.field_1234.flush();
      class_62.method_563("sent ACK to " + var1);
      var1 = "";
      if (this.field_3141 < Integer.parseInt(var2[1]) || this.field_3141 == 255 && Integer.parseInt(var2[1]) == 1) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var3 != 1) {
               var1 = var1 + var2[var3];
               if (var3 != var2.length - 1) {
                  var1 = var1 + "|";
               }
            }
         }

         this.field_3141 = Integer.parseInt(var2[1]);
      }

      return var1;
   }

   // $VF: renamed from: run () void
   @Override
   public void run() {
      while (!this.field_3139) {
         try {
            String var1 = this.field_3140.field_1233.readLine();
            if (var1 == null) {
               class_62.method_563("auth: read null, exiting");
               break;
            }

            var1 = this.method_892(var1);
            class_62.method_563(var1);
            this.field_3140.method_480(var1);
            Thread.sleep(100L);
         } catch (IOException var2) {
            class_62.method_563("auth: Read failed");
            return;
         } catch (InterruptedException var3) {
            class_62.method_563(var3.getMessage());
            return;
         }
      }

      if (!this.field_3139) {
         this.field_3140.method_487("Connection with the server is lost.\nPlease try again.\n[Press Any Key]", (byte)8, null);
      }
   }
}
