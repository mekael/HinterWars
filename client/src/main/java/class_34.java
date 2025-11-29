import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// $VF: renamed from: aU
public class class_34 {
   // $VF: renamed from: c aU
   private static class_34 field_333 = null;
   // $VF: renamed from: d javax.swing.Icon
   private Icon field_334;
   // $VF: renamed from: e int[]
   private int[] field_335;
   // $VF: renamed from: f int
   private int field_336;
   // $VF: renamed from: g int
   private int field_337;
   // $VF: renamed from: h int
   private int field_338;
   // $VF: renamed from: i javax.swing.Icon
   private Icon field_339;
   // $VF: renamed from: j javax.swing.Icon
   private Icon field_340;
   // $VF: renamed from: k byte
   private byte field_341;
   // $VF: renamed from: l byte
   private final byte field_342 = -1;
   // $VF: renamed from: m byte
   private final byte field_343 = 0;
   // $VF: renamed from: n byte
   private final byte field_344 = 1;
   // $VF: renamed from: o byte
   private final byte field_345 = 2;
   // $VF: renamed from: p byte
   private final byte field_346 = 3;
   // $VF: renamed from: q byte
   private final byte field_347 = 4;
   // $VF: renamed from: r byte
   private final byte field_348 = 5;
   // $VF: renamed from: s boolean
   private static boolean field_349;
   // $VF: renamed from: t javax.swing.Icon
   private Icon field_350;
   // $VF: renamed from: u boolean
   private static boolean field_351;
   // $VF: renamed from: v javax.swing.Icon
   private Icon field_352;
   // $VF: renamed from: w boolean
   private static boolean field_353;
   // $VF: renamed from: x javax.swing.Icon
   private Icon field_354;
   // $VF: renamed from: y boolean
   private static boolean field_355;
   // $VF: renamed from: z javax.swing.Icon
   private Icon field_356;
   // $VF: renamed from: A boolean
   private static boolean field_357;
   // $VF: renamed from: B javax.swing.Icon
   private Icon field_358;
   // $VF: renamed from: C boolean
   private static boolean field_359;
   // $VF: renamed from: D javax.swing.Icon
   private Icon field_360;
   // $VF: renamed from: E javax.swing.Icon
   private Icon field_361;
   // $VF: renamed from: F javax.swing.Icon
   private Icon field_362;
   // $VF: renamed from: G javax.swing.Icon
   private Icon field_363;
   // $VF: renamed from: H javax.swing.Icon
   private Icon field_364;
   // $VF: renamed from: I javax.swing.Icon
   private Icon field_365;
   // $VF: renamed from: J javax.swing.Icon
   private Icon field_366;
   // $VF: renamed from: K boolean
   private boolean field_367;
   // $VF: renamed from: a boolean
   public boolean field_368;
   // $VF: renamed from: L int
   private int field_369;
   // $VF: renamed from: M int
   private int field_370;
   // $VF: renamed from: N boolean
   private boolean field_371;
   // $VF: renamed from: b boolean
   public boolean field_372;
   // $VF: renamed from: O int
   private int field_373;
   // $VF: renamed from: P int
   private int field_374;
   // $VF: renamed from: Q int
   private int field_375;
   // $VF: renamed from: R int
   private int field_376;
   // $VF: renamed from: S int
   private int field_377;
   // $VF: renamed from: T int
   private int field_378;
   // $VF: renamed from: U int
   private int field_379;
   // $VF: renamed from: V int
   private int field_380;
   // $VF: renamed from: W int
   private int field_381;
   // $VF: renamed from: X int
   private int field_382;
   // $VF: renamed from: Y int
   private int field_383;
   // $VF: renamed from: Z int
   private int field_384;
   // $VF: renamed from: aa int
   private int field_385;
   // $VF: renamed from: ab int
   private int field_386;
   // $VF: renamed from: ac int
   private int field_387;
   // $VF: renamed from: ad int
   private int field_388;

   // $VF: renamed from: a (aa, byte) aU
   public static class_34 method_263(class_57 var0, byte var1) {
      if (field_333 == null) {
         field_333 = new class_34(var0);
      }

      method_264(var1);
      return field_333;
   }

   private class_34(class_57 var1) {
      this.field_334 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 540)));
      this.field_335 = new int[6];
      this.field_335[0] = var1.method_502("en", 630);
      this.field_335[1] = var1.method_502("en", 631);
      this.field_335[2] = var1.method_502("en", 632);
      this.field_335[3] = var1.method_502("en", 633);
      this.field_335[4] = var1.method_502("en", 634);
      this.field_335[5] = var1.method_502("en", 635);
      this.field_336 = var1.method_502("en", 637);
      this.field_337 = var1.method_502("en", 638);
      this.field_338 = var1.method_502("en", 639);
      this.field_339 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 609)));
      this.field_340 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 610)));
      this.field_341 = -1;
      field_349 = true;
      field_351 = true;
      field_353 = true;
      field_355 = true;
      field_357 = true;
      field_359 = true;
      this.method_281(var1);
   }

   // $VF: renamed from: a (byte) void
   private static void method_264(byte var0) {
      switch (var0) {
         case 22:
            field_349 = false;
            field_351 = false;
            field_353 = false;
            field_355 = false;
            field_357 = false;
            field_359 = true;
            break;
         default:
            field_349 = true;
            field_351 = true;
            field_353 = true;
            field_355 = true;
            field_357 = true;
            field_359 = false;
      }
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   public void method_265(MouseEvent var1) {
   }

   // $VF: renamed from: b (java.awt.event.MouseEvent) void
   public void method_266(MouseEvent var1) {
      if (var1.getY() >= this.field_336 && var1.getY() <= this.field_336 + this.field_338) {
         if (field_349 && var1.getX() >= this.field_335[0] && var1.getX() <= this.field_335[0] + this.field_337) {
            this.field_341 = 0;
            return;
         }

         if (field_351 && var1.getX() >= this.field_335[1] && var1.getX() <= this.field_335[1] + this.field_337) {
            this.field_341 = 1;
            return;
         }

         if (field_353 && var1.getX() >= this.field_335[2] && var1.getX() <= this.field_335[2] + this.field_337) {
            this.field_341 = 2;
            return;
         }

         if (field_355 && var1.getX() >= this.field_335[3] && var1.getX() <= this.field_335[3] + this.field_337) {
            this.field_341 = 3;
            return;
         }

         if (field_357 && var1.getX() >= this.field_335[4] && var1.getX() <= this.field_335[4] + this.field_337) {
            this.field_341 = 4;
            return;
         }

         if (field_359 && var1.getX() >= this.field_335[5] && var1.getX() <= this.field_335[5] + this.field_337) {
            this.field_341 = 5;
            return;
         }
      }

      switch (this.field_341) {
         case 0:
            this.method_271(var1);
            break;
         case 1:
            this.method_273(var1);
            break;
         case 2:
            this.method_275(var1);
            break;
         case 3:
            this.method_277(var1);
            break;
         case 4:
            this.method_279(var1);
            break;
         case 5:
            this.method_282(var1);
      }
   }

   // $VF: renamed from: c (java.awt.event.MouseEvent) void
   public void method_267(MouseEvent var1) {
   }

   // $VF: renamed from: d (java.awt.event.MouseEvent) void
   public void method_268(MouseEvent var1) {
   }

   // $VF: renamed from: e (java.awt.event.MouseEvent) void
   public void method_269(MouseEvent var1) {
   }

   // $VF: renamed from: a (java.awt.Graphics, MastersOfDestiny) void
   public void method_270(Graphics var1, MastersOfDestiny var2) {
      this.field_334.paintIcon(var2, var1, 0, var2.getHeight() - this.field_334.getIconHeight());
      switch (this.field_341) {
         case 0:
            this.method_272(var1, var2);
            break;
         case 1:
            this.method_274(var1, var2);
            break;
         case 2:
            this.method_276(var1, var2);
            break;
         case 3:
            this.method_278(var1, var2);
            break;
         case 4:
            this.method_280(var1, var2);
            break;
         case 5:
            this.method_283(var1, var2);
      }
   }

   // $VF: renamed from: f (java.awt.event.MouseEvent) void
   private void method_271(MouseEvent var1) {
   }

   // $VF: renamed from: b (java.awt.Graphics, MastersOfDestiny) void
   private void method_272(Graphics var1, MastersOfDestiny var2) {
   }

   // $VF: renamed from: g (java.awt.event.MouseEvent) void
   private void method_273(MouseEvent var1) {
   }

   // $VF: renamed from: c (java.awt.Graphics, MastersOfDestiny) void
   private void method_274(Graphics var1, MastersOfDestiny var2) {
   }

   // $VF: renamed from: h (java.awt.event.MouseEvent) void
   private void method_275(MouseEvent var1) {
   }

   // $VF: renamed from: d (java.awt.Graphics, MastersOfDestiny) void
   private void method_276(Graphics var1, MastersOfDestiny var2) {
   }

   // $VF: renamed from: i (java.awt.event.MouseEvent) void
   private void method_277(MouseEvent var1) {
   }

   // $VF: renamed from: e (java.awt.Graphics, MastersOfDestiny) void
   private void method_278(Graphics var1, MastersOfDestiny var2) {
   }

   // $VF: renamed from: j (java.awt.event.MouseEvent) void
   private void method_279(MouseEvent var1) {
   }

   // $VF: renamed from: f (java.awt.Graphics, MastersOfDestiny) void
   private void method_280(Graphics var1, MastersOfDestiny var2) {
   }

   // $VF: renamed from: a (aa) void
   private void method_281(class_57 var1) {
      this.field_360 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 547)));
      this.field_361 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 605)));
      this.field_362 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 606)));
      this.field_363 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 607)));
      this.field_364 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 608)));
      this.field_365 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 611)));
      this.field_366 = new ImageIcon(this.getClass().getResource(var1.method_504("en", 618)));
      this.field_367 = true;
      this.field_368 = false;
      this.field_369 = var1.method_502("en", 552);
      this.field_370 = var1.method_502("en", 553);
      this.field_371 = true;
      this.field_373 = var1.method_502("en", 554);
      this.field_374 = var1.method_502("en", 555);
      this.field_375 = var1.method_502("en", 556);
      this.field_376 = var1.method_502("en", 557);
      this.field_377 = var1.method_502("en", 548);
      this.field_378 = var1.method_502("en", 549);
      this.field_379 = var1.method_502("en", 558);
      this.field_380 = var1.method_502("en", 559);
      this.field_381 = var1.method_502("en", 560);
      this.field_382 = var1.method_502("en", 561);
      this.field_383 = var1.method_502("en", 562);
      this.field_384 = var1.method_502("en", 563);
      this.field_385 = var1.method_502("en", 564);
      this.field_386 = var1.method_502("en", 565);
      this.field_387 = var1.method_502("en", 550);
      this.field_388 = var1.method_502("en", 551);
   }

   // $VF: renamed from: k (java.awt.event.MouseEvent) void
   private void method_282(MouseEvent var1) {
      if (var1.getX() >= this.field_369
         && var1.getX() <= this.field_369 + this.field_377
         && var1.getY() >= this.field_370
         && var1.getY() <= this.field_370 + this.field_378) {
      }
   }

   // $VF: renamed from: g (java.awt.Graphics, MastersOfDestiny) void
   private void method_283(Graphics var1, MastersOfDestiny var2) {
      this.field_360.paintIcon(var2, var1, var2.getWidth() - this.field_360.getIconWidth(), var2.getHeight() - this.field_360.getIconHeight());
   }
}
