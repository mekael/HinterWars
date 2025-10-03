package defpackage;

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

/* renamed from: an  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:an.class */
public class C0013an extends Canvas implements MouseMotionListener, MouseListener, KeyListener {
    private GameStates c;
    private BufferedImage e;
    public static Font a;
    public static FontMetrics b;
    private int h;
    private int i;
    private Image j;
    private Graphics k;
    private int d = -1;
    private BufferedImage[] f = new BufferedImage[5];
    private int[] g = new int[2];

    public C0013an(GameStates gameStates) {
        this.c = gameStates;
        a = new Font((String) null, 1, 12);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
    }

    public void a(int i) {
    }

    public void a(int i, int i2) {
        this.g[0] = i;
        this.g[1] = i2;
    }

    public void mouseMoved(MouseEvent mouseEvent) {
        this.c.ax(mouseEvent);
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        this.c.ay(mouseEvent);
    }

    public void mousePressed(MouseEvent mouseEvent) {
        this.c.az(mouseEvent);
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        this.c.aA(mouseEvent);
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        this.c.aB(mouseEvent);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        this.c.aC(mouseEvent);
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        this.c.aD(mouseEvent);
    }

    public void keyPressed(KeyEvent keyEvent) {
        this.c.o(keyEvent);
    }

    public void keyReleased(KeyEvent keyEvent) {
        C0032k.a("screen..release");
        this.c.p(keyEvent);
    }

    public void keyTyped(KeyEvent keyEvent) {
        this.c.q(keyEvent);
    }

    public void update(Graphics graphics) {
        paint(graphics);
    }

    public void paint(Graphics graphics) {
        b = graphics.getFontMetrics(a);
        if (this.h != getSize().width || this.i != getSize().height || this.j == null || this.k == null) {
            a();
        }
        if (this.k != null) {
            this.k.clearRect(0, 0, this.h, this.i);
            a(this.k);
            graphics.drawImage(this.j, 0, 0, this);
        }
    }

    public void a(Graphics graphics) {
        b = graphics.getFontMetrics(a);
        ((Graphics2D) graphics).setFont(a);
        this.c.z(graphics);
    }

    private void a() {
        this.h = getSize().width;
        this.i = getSize().height;
        if (this.k != null) {
            this.k.dispose();
            this.k = null;
        }
        if (this.j != null) {
            this.j.flush();
            this.j = null;
        }
        System.gc();
        this.j = createImage(this.h, this.i);
        this.k = this.j.getGraphics();
    }

    public Image a(String str, String str2) {
        Image image;
        C0032k.a("loading:" + str + str2);
        try {
            FileInputStream fileInputStream = new FileInputStream(str + str2);
            byte[] bArr = new byte[14];
            fileInputStream.read(bArr, 0, 14);
            byte[] bArr2 = new byte[40];
            fileInputStream.read(bArr2, 0, 40);
            int i = ((bArr[5] & 255) << 24) | ((bArr[4] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[2] & 255);
            int i2 = ((bArr2[3] & 255) << 24) | ((bArr2[2] & 255) << 16) | ((bArr2[1] & 255) << 8) | (bArr2[0] & 255);
            int i3 = ((bArr2[7] & 255) << 24) | ((bArr2[6] & 255) << 16) | ((bArr2[5] & 255) << 8) | (bArr2[4] & 255);
            int i4 = ((bArr2[11] & 255) << 24) | ((bArr2[10] & 255) << 16) | ((bArr2[9] & 255) << 8) | (bArr2[8] & 255);
            int i5 = ((bArr2[13] & 255) << 8) | (bArr2[12] & 255);
            int i6 = ((bArr2[15] & 255) << 8) | (bArr2[14] & 255);
            int i7 = (bArr2[19] << 24) | (bArr2[18] << 16) | (bArr2[17] << 8) | bArr2[16];
            int i8 = ((bArr2[23] & 255) << 24) | ((bArr2[22] & 255) << 16) | ((bArr2[21] & 255) << 8) | (bArr2[20] & 255);
            int i9 = ((bArr2[27] & 255) << 24) | ((bArr2[26] & 255) << 16) | ((bArr2[25] & 255) << 8) | (bArr2[24] & 255);
            int i10 = ((bArr2[31] & 255) << 24) | ((bArr2[30] & 255) << 16) | ((bArr2[29] & 255) << 8) | (bArr2[28] & 255);
            int i11 = ((bArr2[35] & 255) << 24) | ((bArr2[34] & 255) << 16) | ((bArr2[33] & 255) << 8) | (bArr2[32] & 255);
            int i12 = ((bArr2[39] & 255) << 24) | ((bArr2[38] & 255) << 16) | ((bArr2[37] & 255) << 8) | (bArr2[36] & 255);
            if (i6 == 24) {
                int i13 = (i8 / i4) - (i3 * 3);
                int[] iArr = new int[i4 * i3];
                byte[] bArr3 = new byte[(i3 + i13) * 3 * i4];
                fileInputStream.read(bArr3, 0, (i3 + i13) * 3 * i4);
                int i14 = 0;
                for (int i15 = 0; i15 < i4; i15++) {
                    for (int i16 = 0; i16 < i3; i16++) {
                        iArr[(i3 * ((i4 - i15) - 1)) + i16] = (-16777216) | ((bArr3[i14 + 2] & 255) << 16) | ((bArr3[i14 + 1] & 255) << 8) | (bArr3[i14] & 255);
                        i14 += 3;
                    }
                    i14 += i13;
                }
                image = createImage(new MemoryImageSource(i3, i4, iArr, 0, i3));
            } else if (i6 == 8) {
                int i17 = i11 > 0 ? i11 : 1 << i6;
                if (i8 == 0) {
                    i8 = ((((i3 * i6) + 31) & (-32)) >> 3) * i4;
                }
                int[] iArr2 = new int[i17];
                byte[] bArr4 = new byte[i17 * 4];
                fileInputStream.read(bArr4, 0, i17 * 4);
                int i18 = 0;
                for (int i19 = 0; i19 < i17; i19++) {
                    iArr2[i19] = (-16777216) | ((bArr4[i18 + 2] & 255) << 16) | ((bArr4[i18 + 1] & 255) << 8) | (bArr4[i18] & 255);
                    i18 += 4;
                }
                int i20 = (i8 / i4) - i3;
                int[] iArr3 = new int[i3 * i4];
                byte[] bArr5 = new byte[(i3 + i20) * i4];
                fileInputStream.read(bArr5, 0, (i3 + i20) * i4);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    for (int i23 = 0; i23 < i3; i23++) {
                        iArr3[(i3 * ((i4 - i22) - 1)) + i23] = iArr2[bArr5[i21] & 255];
                        i21++;
                    }
                    i21 += i20;
                }
                image = createImage(new MemoryImageSource(i3, i4, iArr3, 0, i3));
            } else {
                C0032k.a("Not a 24-bit or 8-bit Windows Bitmap, aborting...");
                image = null;
            }
            fileInputStream.close();
            return image;
        } catch (Exception e) {
            C0032k.a("Caught exception in loadbitmap!");
            return null;
        }
    }
}
