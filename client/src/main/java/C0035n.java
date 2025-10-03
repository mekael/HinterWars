package defpackage;

/* renamed from: n  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:n.class */
public class C0035n {
    private long a;
    private String b;
    private String c;

    public C0035n(long j) {
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

    public void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.c += C0000a.w + str;
    }

    public String c() {
        return this.c;
    }

    public String[] d() {
        return new String[]{"Mission Description: \n" + c()};
    }
}
