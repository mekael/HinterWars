package defpackage;

import javax.swing.Icon;

/* renamed from: av  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:av.class */
public class C0020av implements Cloneable {
    D a;
    int b;
    long c;
    int d;
    int e;
    static final byte f = 0;
    static final byte g = 1;

    public void a(D d) {
        this.a = d;
    }

    public D a() {
        return this.a;
    }

    public void a(int i) {
        this.b = i;
    }

    public int b() {
        return this.b;
    }

    public void a(long j) {
        this.c = j;
    }

    public long c() {
        return this.c;
    }

    public Icon[][] a(int i, byte b) {
        this.d = i;
        this.e = i;
        if (i > 0 && b == 0 && (i == 1 || i == 2)) {
            return this.a.s();
        }
        return null;
    }

    public int d() {
        return this.d;
    }

    public void b(int i) {
        this.e = i;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.a.z();
    }

    public String a(String str) {
        String str2 = this.a.z() + "Qty: ";
        return this.b == -1 ? str2 + "∞" : this.b == 0 ? str2 + str : str2 + "" + this.b;
    }

    public String b(String str) {
        return f() + C0000a.w + "Price: " + this.c + " sidos";
    }

    public Object clone() {
        C0020av c0020av = null;
        try {
            c0020av = (C0020av) super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return c0020av;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() == getClass()) {
            return this.a.a() == ((C0020av) obj).a.a();
        }
        C0032k.a("not true not same class");
        return false;
    }
}
