

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;

/* renamed from: I  reason: default package */
/* loaded from: hinterwars.jar:I.class */
public class I {
    private Icon a;
    private C0002ab[][] b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g = 1;

    public I(int i, int i2, int i3, int i4, int i5, int i6) {
        this.e = i;
        this.f = i2;
        this.b = new C0002ab[i][i2];
        for (int i7 = 0; i7 < i; i7++) {
            for (int i8 = 0; i8 < i2; i8++) {
                C0002ab c0002ab = new C0002ab();
                c0002ab.b(i7);
                c0002ab.c(i8);
                c0002ab.d(i3 + ((i7 - i8) * (i5 / 2)));
                c0002ab.e(i4 + ((i7 + i8) * (i6 / 2)));
                c0002ab.f(c0002ab.h() + (i5 / 2));
                c0002ab.g(c0002ab.i() + (i6 / 2));
                c0002ab.a(true);
                c0002ab.b(false);
                this.b[i7][i8] = c0002ab;
            }
        }
    }

    public int a() {
        return this.b.length;
    }

    public int b() {
        return this.b[0].length;
    }

    public Vector c() {
        Vector vector = new Vector();
        for (int i = 0; i < this.e; i++) {
            for (int i2 = 0; i2 < this.f; i2++) {
                if (!this.b[i][i2].d() && this.b[i][i2].e()) {
                    vector.add(this.b[i][i2]);
                }
            }
        }
        return vector;
    }

    public void a(Icon icon) {
        this.a = icon;
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        this.a.paintIcon(mastersOfDestiny, graphics, 0, 0);
    }

    public C0002ab a(int i, int i2) {
        if (i >= this.e || i2 >= this.f || i < 0 || i2 < 0) {
            return null;
        }
        return this.b[i][i2];
    }

    public void a(int i, int i2, C0002ab c0002ab) {
        if (i >= this.e || i2 >= this.f || i < 0 || i2 < 0) {
            return;
        }
        this.b[i][i2] = c0002ab;
    }

    public Object b(int i, int i2) {
        if (i >= this.e || i2 >= this.f) {
            return null;
        }
        return a(i, i2).a();
    }

    public void a(int i, int i2, Object obj) {
        if (i >= this.e || i2 >= this.f || i < 0 || i2 < 0) {
            return;
        }
        a(i, i2).a(obj);
    }

    public int a(C0002ab c0002ab, C0002ab c0002ab2) {
        int f = c0002ab.f() > c0002ab2.f() ? c0002ab.f() - c0002ab2.f() : c0002ab2.f() - c0002ab.f();
        return (c0002ab.g() > c0002ab2.g() ? f + (c0002ab.g() - c0002ab2.g()) : f + (c0002ab2.g() - c0002ab.g())) * this.g;
    }

    public void a(C0002ab c0002ab, C0002ab c0002ab2, ArrayList arrayList) {
        if (b(c0002ab.f() - 1, c0002ab.g(), c0002ab2)) {
            arrayList.add(this.b[c0002ab.f() - 1][c0002ab.g()]);
        }
        if (b(c0002ab.f(), c0002ab.g() - 1, c0002ab2)) {
            arrayList.add(this.b[c0002ab.f()][c0002ab.g() - 1]);
        }
        if (b(c0002ab.f() + 1, c0002ab.g(), c0002ab2)) {
            arrayList.add(this.b[c0002ab.f() + 1][c0002ab.g()]);
        }
        if (b(c0002ab.f(), c0002ab.g() + 1, c0002ab2)) {
            arrayList.add(this.b[c0002ab.f()][c0002ab.g() + 1]);
        }
    }

    public boolean b(C0002ab c0002ab, C0002ab c0002ab2) {
        if (c0002ab.f() - 1 == c0002ab2.f() && c0002ab.g() == c0002ab2.g()) {
            return true;
        }
        if (c0002ab.f() + 1 == c0002ab2.f() && c0002ab.g() == c0002ab2.g()) {
            return true;
        }
        if (c0002ab.f() == c0002ab2.f() && c0002ab.g() + 1 == c0002ab2.g()) {
            return true;
        }
        return c0002ab.f() == c0002ab2.f() && c0002ab.g() - 1 == c0002ab2.g();
    }

    public boolean b(int i, int i2, C0002ab c0002ab) {
        if (i < 0 || i >= this.e || i2 < 0 || i2 >= this.f || !this.b[i][i2].d()) {
            return false;
        }
        return (c0002ab != null && i == c0002ab.f() && i2 == c0002ab.g()) ? false : true;
    }

    public int c(C0002ab c0002ab, C0002ab c0002ab2) {
        int f = c0002ab.f() > c0002ab2.f() ? c0002ab.f() - c0002ab2.f() : c0002ab2.f() - c0002ab.f();
        return (c0002ab.g() > c0002ab2.g() ? f + (c0002ab.g() - c0002ab2.g()) : f + (c0002ab2.g() - c0002ab.g())) * this.g;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }
}
