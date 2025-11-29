import java.io.IOException;

// $VF: renamed from: d
public class class_95 extends Thread {
   // $VF: renamed from: a boolean
   private boolean field_3136;
   // $VF: renamed from: b GameStates
   private GameStates field_3137;
   // $VF: renamed from: c int
   private int field_3138;

   public class_95(GameStates var1) {
      this.field_3137 = var1;
      this.field_3138 = 0;
      this.field_3136 = false;
   }

   // $VF: renamed from: a () void
   public void method_889() {
      this.field_3136 = true;
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public synchronized String method_890(String var1) {
      class_62.method_563("line = " + var1);
      String[] var2 = var1.split("\\|");
      if (!var2[0].equals("KA") && (!var2[0].equals("WK") || this.field_3137.field_1300 == 22) && !var2[0].equals("KO")) {
         this.field_3137.field_435.write("ACK|" + var2[1] + "\n");
         this.field_3137.field_435.flush();
         class_62.method_563("sent: ACK|" + var2[1] + "\n");
         var1 = "";
         if (this.field_3138 < Integer.parseInt(var2[1]) || this.field_3138 == 255 && Integer.parseInt(var2[1]) == 1) {
            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var3 != 1) {
                  var1 = var1 + var2[var3];
                  if (var3 != var2.length - 1) {
                     var1 = var1 + "|";
                  }
               }
            }

            this.field_3138 = Integer.parseInt(var2[1]);
         }

         class_62.method_563("current msgID = " + this.field_3138 + " sent ACK" + var2[1] + ".. line = " + var1);
         return var1;
      } else {
         return var1;
      }
   }

   // $VF: renamed from: run () void
   @Override
   public void run() {
      while (!this.field_3136) {
         try {
            String var1 = this.field_3137.field_434.readLine();
            if (var1 == null) {
               class_62.method_563("colony: read null, exiting");
               break;
            }

            var1 = this.method_890(var1);
            class_62.method_563(var1);
            this.field_3137.method_481(var1);
            Thread.sleep(100L);
         } catch (IOException var2) {
            class_62.method_563("colony: Read failed");
            break;
         } catch (InterruptedException var3) {
            class_62.method_563(var3.getMessage());
            break;
         }
      }

      if (!this.field_3136) {
         this.field_3137.method_487("Connection with the server is lost.\nPlease try again.\n[Press Any Key]", (byte)8, null);
      }
   }
}
