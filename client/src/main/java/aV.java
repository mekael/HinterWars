package defpackage;

import java.util.ArrayList;

/* renamed from: aV  reason: default package */
/* loaded from: hinterwars.jar:aV.class */
public class aV {
    private final int f;
    private final aT g;
    private final aT h;
    private final I i;
    private V k;
    private V l;
    private int m;
    private ArrayList n;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private ArrayList j = new ArrayList(4);
    private int o = 0;

    public aV(I i, int i2) {
        this.i = i;
        this.f = i2;
        this.g = new aT(i2);
        this.h = new aT(i2);
    }

    public synchronized void a(C0002ab c0002ab, C0002ab c0002ab2) {
        d();
        this.m = 0;
        this.n = new ArrayList(this.i.d() * this.i.e());
        this.o = 1;
        this.l = new V(c0002ab, null);
        this.g.a(this.l);
        this.l.c = 0;
        this.l.d = this.i.a(c0002ab, c0002ab2);
        this.l.e = this.l.d;
        this.k = new V(c0002ab2, null);
    }

    public ArrayList a() {
        return this.n;
    }

    public synchronized void b() {
        this.o = 4;
        d();
    }

    private void d() {
        this.g.a();
        this.h.a();
        this.j.clear();
    }

    public synchronized int c() {
        if (this.o == 2 || this.o == 3 || this.o == 4) {
            return this.o;
        }
        if (this.o == 1) {
            if (this.g.c()) {
                this.o = 2;
                C0032k.a("search has failed");
                d();
                return this.o;
            }
            this.m++;
            V e2 = this.g.e();
            if (e2.equals(this.k)) {
                a(e2);
            } else {
                b(e2);
            }
        }
        return this.o;
    }

    private void a(V v) {
        this.k.a = v.a;
        this.n.clear();
        if (v == this.l) {
            this.o = 3;
            d();
        }
        V v2 = v;
        V v3 = v.a;
        do {
            v3.b = v2;
            v2 = v3;
            v3 = v3.a;
        } while (!v2.equals(this.l));
        V v4 = this.l;
        do {
            v4 = v4.b;
            if (v4 != null) {
                this.n.add(v4);
            }
        } while (!v4.equals(this.k));
        this.o = 3;
        d();
    }

    private void b(V v) {
        V c2;
        this.i.a(v.a(), v.a != null ? v.a.a() : null, this.j);
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C0002ab c0002ab = (C0002ab) this.j.get(i);
            int c3 = v.c + this.i.c(v.a(), c0002ab);
            V c4 = this.g.c(c0002ab.f(), c0002ab.g());
            if ((c4 == null || c4.c > c3) && ((c2 = this.h.c(c0002ab.f(), c0002ab.g())) == null || c2.c > c3)) {
                if (c2 != null) {
                    this.h.b(c2.a().f(), c2.a().g());
                }
                if (c4 != null) {
                    this.g.b(c4.a().f(), c4.a().g());
                }
                V v2 = new V(c0002ab, v);
                v2.c = c3;
                v2.d = this.i.a(c0002ab, this.k.a());
                v2.e = v2.c + v2.d;
                if (!this.g.a(v2)) {
                    this.o = 2;
                    d();
                    break;
                }
            }
            i++;
        }
        this.j.clear();
        if (this.h.a(v)) {
            return;
        }
        this.o = 2;
        d();
    }
}
