import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Hashtable;

// $VF: renamed from: X
public class class_2 {
   // $VF: renamed from: b java.util.Hashtable
   private Hashtable field_4 = new Hashtable();
   // $VF: renamed from: c int
   private int field_5 = 0;
   // $VF: renamed from: d int
   private int field_6 = -1;
   // $VF: renamed from: e int
   private int field_7 = 0;
   // $VF: renamed from: a e
   public class_74 field_8;
   // $VF: renamed from: f boolean
   private boolean field_9 = true;
   // $VF: renamed from: g B
   private class_91 field_10;
   // $VF: renamed from: h boolean
   private boolean field_11;
   // $VF: renamed from: i byte
   private byte field_12;
   // $VF: renamed from: j GameStates
   private GameStates field_13;
   // $VF: renamed from: k aa
   private class_57 field_14;

   public class_2(GameStates var1) {
      this.field_13 = var1;
      this.field_10 = new class_91();
      this.field_10
         .method_874(
            255, 260, 289, 80, class_60.method_550().method_552().method_256("en", 0) + class_60.method_550().method_552().method_256("en", 128), 250, 254
         );
      this.field_11 = false;
   }

   // $VF: renamed from: a (java.lang.String, byte) void
   public void method_1(String var1, byte var2) {
      this.field_10.method_875(var1, MastersOfDestiny.field_2810, MastersOfDestiny.field_2811);
      this.field_12 = var2;
      this.field_11 = true;
   }

   // $VF: renamed from: a () boolean
   public boolean method_2() {
      return this.field_11;
   }

   // $VF: renamed from: a (int, e) void
   public void method_3(int var1, class_74 var2) {
      this.field_4.put(new Integer(var1), var2);
   }

   // $VF: renamed from: a (aa, long) int
   public int method_4(class_57 var1, long var2) {
      this.field_14 = var1;
      if (this.field_7 != this.field_6) {
         this.field_9 = true;
         if (this.field_8 != null) {
            this.field_8.method_676();
         }

         this.field_8 = (class_74)this.field_4.get(new Integer(this.field_7));
         if (this.field_8 == null) {
            class_62.method_563("Invalid state");
            return 0;
         }

         this.field_8.method_670(var1, var2);
         this.field_5 = this.field_6;
         this.field_6 = this.field_7;
         this.field_9 = false;
      }

      return this.field_8.method_671(var1, var2);
   }

   // $VF: renamed from: a (int) void
   public void method_5(int var1) {
      this.field_7 = var1;
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_6(Graphics var1, MastersOfDestiny var2) {
      if (!this.field_9 && this.field_8 != null) {
         this.field_8.method_673(var1, var2);
      }

      if (this.field_11) {
         this.field_10.method_793(var1, var2);
      }
   }

   // $VF: renamed from: a (java.lang.String[]) void
   public void method_7(String[] var1) {
      class_62.method_563("----------------" + var1[0] + "-------------------");
      if (var1[0].equals("SI")) {
         class_62.method_563("----------------" + var1[0] + "in-------------------");

         try {
            this.field_14.field_1610.close();
         } catch (IOException var3) {
         }

         class_62.method_563("----------------here------------------");
         class_62.method_563("----------------here---2---------------");
      }

      if (this.field_8 != null) {
         this.field_8.method_675(var1);
      }
   }

   // $VF: renamed from: a (int, java.lang.Object) void
   public void method_8(int var1, Object var2) {
      if (this.field_8 != null) {
         this.field_8.method_674(var1, var2);
      }
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   public void method_9(MouseEvent var1) {
      if (!this.field_11) {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_677(var1);
         }
      }
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   public void method_10(MouseEvent var1) {
      if (!this.field_11) {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_678(var1);
         }
      }
   }

   // $VF: renamed from: c (java.awt.event.MouseEvent) void
   public void method_11(MouseEvent var1) {
      if (!this.field_11) {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_679(var1);
         }
      }
   }

   // $VF: renamed from: d (java.awt.event.MouseEvent) void
   public void method_12(MouseEvent var1) {
      if (!this.field_11) {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_680(var1);
         }
      }
   }

   // $VF: renamed from: e (java.awt.event.MouseEvent) void
   public void method_13(MouseEvent var1) {
      if (!this.field_11) {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_681(var1);
         }
      }
   }

   // $VF: renamed from: a (java.awt.event.KeyEvent) void
   public void method_14(KeyEvent var1) {
      if (this.field_11) {
         this.field_8.method_672(this.field_12);
         this.field_11 = false;
      } else {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_682(var1);
         }
      }
   }

   // $VF: renamed from: b (java.awt.event.KeyEvent) void
   public void method_15(KeyEvent var1) {
      if (!this.field_11) {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_683(var1);
         }
      }
   }

   // $VF: renamed from: c (java.awt.event.KeyEvent) void
   public void method_16(KeyEvent var1) {
      if (!this.field_11) {
         if (!this.field_9 && this.field_8 != null) {
            this.field_8.method_684(var1);
         }
      }
   }
}
