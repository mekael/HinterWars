import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.io.FileInputStream;

// $VF: renamed from: an
public class class_83 extends Canvas implements MouseMotionListener, MouseListener, KeyListener {
   // $VF: renamed from: c GameStates
   private GameStates field_2849;
   // $VF: renamed from: d int
   private int field_2850 = -1;
   // $VF: renamed from: e java.awt.image.BufferedImage
   private BufferedImage field_2851;
   // $VF: renamed from: f java.awt.image.BufferedImage[]
   private BufferedImage[] field_2852 = new BufferedImage[5];
   // $VF: renamed from: a java.awt.Font
   public static Font field_2853;
   // $VF: renamed from: b java.awt.FontMetrics
   public static FontMetrics field_2854;
   // $VF: renamed from: g int[]
   private int[] field_2855 = new int[2];
   // $VF: renamed from: h int
   private int field_2856;
   // $VF: renamed from: i int
   private int field_2857;
   // $VF: renamed from: j java.awt.Image
   private Image field_2858;
   // $VF: renamed from: k java.awt.Graphics
   private Graphics field_2859;

   public class_83(GameStates var1) {
      this.field_2849 = var1;
      field_2853 = new Font(null, 1, 12);
      this.addMouseListener(this);
      this.addMouseMotionListener(this);
      this.addKeyListener(this);
   }

   // $VF: renamed from: a (int) void
   public void method_764(int var1) {
   }

   // $VF: renamed from: a (int, int) void
   public void method_765(int var1, int var2) {
      this.field_2855[0] = var1;
      this.field_2855[1] = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      this.field_2849.method_468(var1);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.field_2849.method_469(var1);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.field_2849.method_470(var1);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      this.field_2849.method_471(var1);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.field_2849.method_472(var1);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.field_2849.method_473(var1);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.field_2849.method_474(var1);
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      this.field_2849.method_475(var1);
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      class_62.method_563("screen..release");
      this.field_2849.method_476(var1);
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      this.field_2849.method_477(var1);
   }

   @Override
   public void update(Graphics var1) {
      this.paint(var1);
   }

   @Override
   public void paint(Graphics var1) {
      field_2854 = var1.getFontMetrics(field_2853);
      if (this.field_2856 != this.getSize().width || this.field_2857 != this.getSize().height || this.field_2858 == null || this.field_2859 == null) {
         this.method_767();
      }

      if (this.field_2859 != null) {
         this.field_2859.clearRect(0, 0, this.field_2856, this.field_2857);
         this.method_766(this.field_2859);
         var1.drawImage(this.field_2858, 0, 0, this);
      }
   }

   // $VF: renamed from: a (java.awt.Graphics) void
   public void method_766(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      field_2854 = var1.getFontMetrics(field_2853);
      var2.setFont(field_2853);
      this.field_2849.method_479(var1);
   }

   // $VF: renamed from: a () void
   private void method_767() {
      this.field_2856 = this.getSize().width;
      this.field_2857 = this.getSize().height;
      if (this.field_2859 != null) {
         this.field_2859.dispose();
         this.field_2859 = null;
      }

      if (this.field_2858 != null) {
         this.field_2858.flush();
         this.field_2858 = null;
      }

      System.gc();
      this.field_2858 = this.createImage(this.field_2856, this.field_2857);
      this.field_2859 = this.field_2858.getGraphics();
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) java.awt.Image
   public Image method_768(String var1, String var2) {
      class_62.method_563("loading:" + var1 + var2);

      try {
         FileInputStream var4 = new FileInputStream(var1 + var2);
         byte var5 = 14;
         byte[] var6 = new byte[var5];
         var4.read(var6, 0, var5);
         byte var7 = 40;
         byte[] var8 = new byte[var7];
         var4.read(var8, 0, var7);
         int var9 = (var6[5] & 255) << 24 | (var6[4] & 255) << 16 | (var6[3] & 255) << 8 | var6[2] & 255;
         int var10 = (var8[3] & 255) << 24 | (var8[2] & 255) << 16 | (var8[1] & 255) << 8 | var8[0] & 255;
         int var11 = (var8[7] & 255) << 24 | (var8[6] & 255) << 16 | (var8[5] & 255) << 8 | var8[4] & 255;
         int var12 = (var8[11] & 255) << 24 | (var8[10] & 255) << 16 | (var8[9] & 255) << 8 | var8[8] & 255;
         int var13 = (var8[13] & 255) << 8 | var8[12] & 255;
         int var14 = (var8[15] & 255) << 8 | var8[14] & 255;
         int var15 = var8[19] << 24 | var8[18] << 16 | var8[17] << 8 | var8[16];
         int var16 = (var8[23] & 255) << 24 | (var8[22] & 255) << 16 | (var8[21] & 255) << 8 | var8[20] & 255;
         int var17 = (var8[27] & 255) << 24 | (var8[26] & 255) << 16 | (var8[25] & 255) << 8 | var8[24] & 255;
         int var18 = (var8[31] & 255) << 24 | (var8[30] & 255) << 16 | (var8[29] & 255) << 8 | var8[28] & 255;
         int var19 = (var8[35] & 255) << 24 | (var8[34] & 255) << 16 | (var8[33] & 255) << 8 | var8[32] & 255;
         int var20 = (var8[39] & 255) << 24 | (var8[38] & 255) << 16 | (var8[37] & 255) << 8 | var8[36] & 255;
         Image var3;
         if (var14 == 24) {
            int var21 = var16 / var12 - var11 * 3;
            int[] var22 = new int[var12 * var11];
            byte[] var23 = new byte[(var11 + var21) * 3 * var12];
            var4.read(var23, 0, (var11 + var21) * 3 * var12);
            int var24 = 0;

            for (int var25 = 0; var25 < var12; var25++) {
               for (int var26 = 0; var26 < var11; var26++) {
                  var22[var11 * (var12 - var25 - 1) + var26] = 0xFF000000 | (var23[var24 + 2] & 255) << 16 | (var23[var24 + 1] & 255) << 8 | var23[var24] & 255;
                  var24 += 3;
               }

               var24 += var21;
            }

            var3 = this.createImage(new MemoryImageSource(var11, var12, var22, 0, var11));
         } else if (var14 == 8) {
            int var32 = 0;
            if (var19 > 0) {
               var32 = var19;
            } else {
               var32 = 1 << var14;
            }

            if (var16 == 0) {
               var16 = (var11 * var14 + 31 & -32) >> 3;
               var16 *= var12;
            }

            int[] var34 = new int[var32];
            byte[] var35 = new byte[var32 * 4];
            var4.read(var35, 0, var32 * 4);
            int var36 = 0;

            for (int var38 = 0; var38 < var32; var38++) {
               var34[var38] = 0xFF000000 | (var35[var36 + 2] & 255) << 16 | (var35[var36 + 1] & 255) << 8 | var35[var36] & 255;
               var36 += 4;
            }

            int var39 = var16 / var12 - var11;
            int[] var40 = new int[var11 * var12];
            byte[] var27 = new byte[(var11 + var39) * var12];
            var4.read(var27, 0, (var11 + var39) * var12);
            var36 = 0;

            for (int var28 = 0; var28 < var12; var28++) {
               for (int var29 = 0; var29 < var11; var29++) {
                  var40[var11 * (var12 - var28 - 1) + var29] = var34[var27[var36] & 255];
                  var36++;
               }

               var36 += var39;
            }

            var3 = this.createImage(new MemoryImageSource(var11, var12, var40, 0, var11));
         } else {
            class_62.method_563("Not a 24-bit or 8-bit Windows Bitmap, aborting...");
            var3 = (Image)null;
         }

         var4.close();
         return var3;
      } catch (Exception var30) {
         class_62.method_563("Caught exception in loadbitmap!");
         return (Image)null;
      }
   }
}
