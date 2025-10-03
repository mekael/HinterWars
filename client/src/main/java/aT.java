

import java.util.Arrays;

/* renamed from: aT  reason: default package */
/* loaded from: hinterwars.jar:aT.class */
public class aT {
    final V[] a;
    int b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aT(int i) {
        this.a = new V[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(V v) {
        if (this.b == this.a.length) {
            return false;
        }
        this.c = false;
        if (a(v.a().f(), v.a().g()) == -1) {
            V[] vArr = this.a;
            int i = this.b;
            this.b = i + 1;
            vArr[i] = v;
            return true;
        }
        V c = c(v.a().f(), v.a().g());
        if (v.e < c.e) {
            b(c.a().f(), c.a().g());
            V[] vArr2 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            vArr2[i2] = v;
            return true;
        }
        return true;
    }

    int a(int i, int i2) {
        for (int i3 = 0; i3 < this.b; i3++) {
            if (this.a[i3].a().f() == i && this.a[i3].a().g() == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i, int i2) {
        int a = a(i, i2);
        if (a != -1) {
            this.c = false;
            V[] vArr = this.a;
            V[] vArr2 = this.a;
            int i3 = this.b - 1;
            this.b = i3;
            vArr[a] = vArr2[i3];
            this.a[this.b] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V c(int i, int i2) {
        int a = a(i, i2);
        if (a == -1) {
            return null;
        }
        return this.a[a];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        for (int i = 0; i < this.b; i++) {
            this.a[i] = null;
        }
        this.b = 0;
    }

    int b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.b == 0;
    }

    V d() {
        if (this.b > 0 && !this.c) {
            Arrays.sort(this.a, 0, this.b);
            this.c = true;
        }
        V v = this.a[0];
        V[] vArr = this.a;
        V[] vArr2 = this.a;
        int i = this.b - 1;
        this.b = i;
        vArr[0] = vArr2[i];
        this.a[this.b] = null;
        return v;
    }

    public V e() {
        V v = null;
        if (this.b > 0 && !this.c) {
            Arrays.sort(this.a, 0, this.b);
            this.c = true;
        }
        if (this.b > 0) {
            v = this.a[0];
            int i = v.e;
            for (int i2 = 0; i2 < this.b && this.a[i2].e <= v.e; i2++) {
                v = this.a[i2].e == v.e ? a(this.a[i2], v) : this.a[i2];
            }
            b(v.a().f(), v.a().g());
        }
        return v;
    }

    public V a(V v, V v2) {
        return v.a().f() != v2.a().f() ? v.a().f() < v2.a().f() ? v : v2 : v.a().g() < v2.a().g() ? v : v2;
    }

    public void f() {
        for (int i = 0; i < this.b; i++) {
            V v = this.a[i];
            C0032k.a("Pop head in open list x=" + v.a().f() + " y=" + v.a().g() + " f=" + v.e + " g=" + v.c + " h=" + v.d);
        }
    }
}
