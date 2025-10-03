

/* renamed from: s  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:s.class */
public class C0039s {
    private String a;
    private long[] b;
    private long c;
    private boolean d;
    private long e;
    private boolean f;

    public C0039s(String str) {
        String[] split = str.split("\\|");
        this.a = split[0].trim();
        this.e = Long.parseLong(split[1].trim());
        this.c = 1L;
        this.d = false;
        this.f = false;
        String[] split2 = split[2].trim().split("\\;");
        this.b = new long[split2.length];
        for (int i = 0; i < split2.length; i++) {
            this.b[i] = Long.parseLong(split2[i].trim());
        }
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.e;
    }

    public long c() {
        return this.c;
    }

    public void a(long j) {
        this.c = j;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public boolean e() {
        return this.f;
    }

    public long[] f() {
        return this.b;
    }

    public long a(int i) {
        return this.b[i];
    }
}
