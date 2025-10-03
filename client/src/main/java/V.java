package defpackage;

/* renamed from: V  reason: default package */
/* loaded from: hinterwars.jar:V.class */
public class V implements Comparable {
    protected V a;
    protected V b;
    int c;
    int d;
    int e;
    private C0002ab f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(C0002ab c0002ab, V v) {
        this.f = c0002ab;
        this.a = v;
    }

    public C0002ab a() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            V v = (V) obj;
            return v.a().f() == this.f.f() && v.a().g() == this.f.g();
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        V v = (V) obj;
        if (this == v) {
            return 0;
        }
        if (v != null && this.e <= v.e) {
            return this.e == v.e ? 0 : -1;
        }
        return 1;
    }

    void a(V v) {
        this.c = v.c;
        this.d = v.d;
        this.e = v.e;
    }
}
