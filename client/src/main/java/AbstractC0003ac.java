package defpackage;

import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: ac  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ac.class */
public abstract class AbstractC0003ac {
    Vector a;
    AbstractC0003ac b;
    static int c = 0;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    protected static C0031j h;
    public int i = 0;
    public int d = c;

    public abstract int a();

    public abstract boolean a(AbstractC0003ac abstractC0003ac);

    public abstract boolean b(AbstractC0003ac abstractC0003ac);

    public abstract Enumeration b();

    public void c(AbstractC0003ac abstractC0003ac) {
        this.b = abstractC0003ac;
    }

    public AbstractC0003ac c() {
        return this.b;
    }

    public AbstractC0003ac() {
        c++;
    }

    public void d() {
    }

    public void a(long j) {
    }

    public void d(AbstractC0003ac abstractC0003ac) {
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
    }

    public void b(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
    }

    public boolean e() {
        return this.i == 1;
    }

    public boolean f() {
        return this.i == 2;
    }

    public void g() {
        this.i = 1;
    }

    public void h() {
        this.i = 2;
    }

    public int i() {
        return 0;
    }

    public int j() {
        return 0;
    }

    public int k() {
        return 0;
    }

    public int l() {
        return 0;
    }
}
