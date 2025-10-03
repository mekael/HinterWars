package defpackage;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: aG  reason: default package */
/* loaded from: hinterwars.jar:aG.class */
public class aG {
    private int b;
    private int c;
    private int f;
    private int g;
    private int h;
    private int i;
    private int[] n;
    private Object[] o;
    private Icon a = null;
    private C0011ak d = null;
    private String e = null;
    private FontMetrics j = null;
    private Icon[] k = null;
    private int[] l = null;
    private int[] m = null;

    public void a(String str) {
        this.a = new ImageIcon(getClass().getResource(str));
    }

    public Icon a() {
        return this.a;
    }

    public void a(int i) {
        this.b = i;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.c = i;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        if (this.a != null) {
            return this.a.getIconWidth();
        }
        return 0;
    }

    public int e() {
        if (this.a != null) {
            return this.a.getIconHeight();
        }
        return 0;
    }

    public void a(int i, int i2, int i3, int i4, FontMetrics fontMetrics) {
        this.d = new C0011ak();
        this.d.a((byte) -1);
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = fontMetrics;
        if (this.e != null) {
            this.d.a(this.e, i, i2, i3, i4, fontMetrics, null);
        }
    }

    public void b(String str) {
        this.e = str;
        if (this.d != null) {
            this.d.a(str, this.f, this.g, this.h, this.i, this.j, null);
        }
    }

    public String f() {
        return this.e;
    }

    public C0011ak g() {
        return this.d;
    }

    public void a(String[] strArr) {
        this.k = new Icon[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.k[i] = new ImageIcon(getClass().getResource(strArr[i]));
        }
        this.l = new int[this.k.length];
        this.m = new int[this.k.length];
    }

    public Icon[] h() {
        return this.k;
    }

    public Icon c(int i) {
        return this.k[i];
    }

    public void a(int[] iArr) {
        this.l = iArr;
    }

    public void a(int i, int i2) {
        this.l[i2] = i;
    }

    public int[] i() {
        return this.l;
    }

    public int d(int i) {
        return this.l[i];
    }

    public void b(int[] iArr) {
        this.m = iArr;
    }

    public void b(int i, int i2) {
        this.l[i2] = i;
    }

    public int[] j() {
        return this.m;
    }

    public int e(int i) {
        return this.m[i];
    }

    public void a(int[] iArr, Object[] objArr) {
        this.n = iArr;
        this.o = objArr;
    }

    public int[] k() {
        return this.n;
    }

    public Object f(int i) {
        return this.o[i];
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        if (this.a != null) {
            this.a.paintIcon(mastersOfDestiny, graphics, this.b, this.c);
        }
        graphics.setColor(new Color(13619151));
        graphics.setFont(MastersOfDestiny.B);
        if (this.d != null) {
            this.d.a(graphics, mastersOfDestiny);
        }
        for (int i = 0; i < this.n.length; i++) {
            this.k[this.n[i]].paintIcon(mastersOfDestiny, graphics, this.b + this.l[this.n[i]], this.c + this.m[this.n[i]]);
        }
    }

    public int a(MouseEvent mouseEvent) {
        for (int i = 0; i < this.n.length; i++) {
            if (mouseEvent.getX() > this.b + this.l[this.n[i]] && mouseEvent.getX() < this.b + this.l[this.n[i]] + this.k[this.n[i]].getIconWidth() && mouseEvent.getY() > this.c + this.m[this.n[i]] && mouseEvent.getY() < this.c + this.m[this.n[i]] + this.k[this.n[i]].getIconHeight()) {
                return i;
            }
        }
        return -1;
    }
}
