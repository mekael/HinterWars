package defpackage;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: aQ  reason: default package */
/* loaded from: hinterwars.jar:aQ.class */
public class aQ {
    private long a;
    private String b;
    private long c;
    private String d;
    private long e;
    private int[] f;
    private long g;
    private String h;
    private Icon i;
    private String j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private boolean q = false;

    public aQ(long j) {
        this.a = j;
    }

    public long a() {
        return this.a;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.b;
    }

    public void a(long j) {
        this.c = j;
    }

    public long c() {
        return this.c;
    }

    public void b(String str) {
        this.d = str;
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return this.d.startsWith("A");
    }

    public void b(long j) {
        this.e = j;
    }

    public long f() {
        return this.e;
    }

    public void c(long j) {
        this.p = j;
    }

    public long g() {
        return this.p;
    }

    public void d(long j) {
        this.o = j;
    }

    public long h() {
        return this.o;
    }

    public void c(String str) {
        String[] split = str.split("\\|");
        for (int i = 0; i < split.length; i++) {
            C0032k.a(i + "=" + split[i]);
        }
        this.f = new int[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            this.f[i2] = Integer.parseInt(split[i2]);
        }
    }

    public int[] i() {
        return this.f;
    }

    public void e(long j) {
        this.g = j;
    }

    public long j() {
        return this.g;
    }

    public void f(long j) {
        this.n = j;
    }

    public long k() {
        return this.n;
    }

    public void d(String str) {
        this.h = str;
    }

    public String l() {
        return this.h;
    }

    public void e(String str) {
        this.i = new ImageIcon(getClass().getResource(str));
        C0032k.a("skill icon = " + this.i);
    }

    public Icon m() {
        return this.i;
    }

    public void f(String str) {
        this.j = str;
    }

    public String n() {
        return this.j;
    }

    public void g(long j) {
        this.k = j;
    }

    public long o() {
        return this.k;
    }

    public void h(long j) {
        this.l = j;
    }

    public long p() {
        return this.l;
    }

    public void i(long j) {
        this.m = j;
    }

    public long q() {
        return this.m;
    }

    public boolean r() {
        return this.q;
    }

    public void a(boolean z) {
        this.q = z;
    }

    public String s() {
        return b().toUpperCase() + C0000a.w + C0000a.w + "Skill Level: " + c() + C0000a.w + "Skill range: " + (f() == -1 ? "Depends on weapon" : String.valueOf(f()) + " tiles") + C0000a.w + "Skill Area: " + p() + " tiles\nRequired Level: " + j() + C0000a.w + "Required Energy: " + o() + C0000a.w + "Required SP: " + k() + C0000a.w + "Skill Type: " + n() + C0000a.w + "Desc: " + l();
    }
}
