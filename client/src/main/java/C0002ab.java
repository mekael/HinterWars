

import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: ab  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ab.class */
public class C0002ab {
    Icon a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    Object h;
    Vector i;
    boolean j;
    boolean k;
    int l;
    public static final int m = 255;

    public C0002ab() {
        this.h = null;
        this.i = new Vector();
        this.l = -1;
    }

    public C0002ab(int i, int i2) {
        this.d = i;
        this.e = i2;
        this.h = null;
        this.i = new Vector();
    }

    public Object a() {
        return this.h;
    }

    public void a(Object obj) {
        this.h = obj;
    }

    public Icon b() {
        return this.a;
    }

    public void a(String str) {
        this.a = new ImageIcon(getClass().getResource(str));
    }

    public int c() {
        return this.l;
    }

    public void a(int i) {
        this.l = i;
    }

    public boolean d() {
        return this.j;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public boolean e() {
        return this.k;
    }

    public void b(boolean z) {
        this.k = z;
    }

    public int f() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public int g() {
        return this.c;
    }

    public void c(int i) {
        this.c = i;
    }

    public int h() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int i() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int j() {
        return this.f;
    }

    public void f(int i) {
        this.f = i;
    }

    public int k() {
        return this.g;
    }

    public void g(int i) {
        this.g = i;
    }

    public Vector l() {
        return this.i;
    }
}
