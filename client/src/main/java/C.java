

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Enumeration;
import javax.swing.Icon;

/* renamed from: C  reason: default package */
/* loaded from: hinterwars.jar:C.class */
public class C extends AbstractC0003ac {
    Icon j;
    BufferedImage k;
    byte l;
    int m;
    int n;
    boolean o;

    @Override // defpackage.AbstractC0003ac
    public int a() {
        return 1;
    }

    @Override // defpackage.AbstractC0003ac
    public boolean a(AbstractC0003ac abstractC0003ac) {
        return false;
    }

    @Override // defpackage.AbstractC0003ac
    public boolean b(AbstractC0003ac abstractC0003ac) {
        return false;
    }

    @Override // defpackage.AbstractC0003ac
    public Enumeration b() {
        return null;
    }

    @Override // defpackage.AbstractC0003ac
    public void d() {
        this.j = null;
        this.m = 0;
        this.n = 0;
        this.l = (byte) -1;
        this.o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(byte b) {
        this.l = b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        this.m = i;
        this.n = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Icon icon, BufferedImage bufferedImage) {
        this.j = icon;
        this.k = bufferedImage;
    }

    public byte m() {
        return this.l;
    }

    @Override // defpackage.AbstractC0003ac
    public int i() {
        if (this.j != null) {
            return this.j.getIconWidth();
        }
        return 0;
    }

    @Override // defpackage.AbstractC0003ac
    public int j() {
        if (this.j != null) {
            return this.j.getIconHeight();
        }
        return 0;
    }

    @Override // defpackage.AbstractC0003ac
    public int k() {
        return this.m;
    }

    @Override // defpackage.AbstractC0003ac
    public int l() {
        return this.n;
    }

    @Override // defpackage.AbstractC0003ac
    public void a(long j) {
        this.o = false;
    }

    @Override // defpackage.AbstractC0003ac
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        if (this.o) {
            this.j.paintIcon(GameStates.pS, graphics, this.m, this.n);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        try {
            if (i > this.m && i2 > this.n) {
                int[] iArr = new int[i3 * i4];
                this.o = false;
                this.k.getRGB(i - this.m, i2 - this.n, i3, i4, iArr, 0, i3);
                for (int i5 : iArr) {
                    if (i5 != -1) {
                        this.o = true;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}
