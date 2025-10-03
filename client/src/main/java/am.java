package defpackage;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: am  reason: default package */
/* loaded from: hinterwars.jar:am.class */
public class am {
    private long a;
    private String b;
    private Icon c;
    private Icon d;

    public am(long j, String str, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = new ImageIcon(getClass().getResource(str2));
        this.d = new ImageIcon(getClass().getResource(str3));
    }

    public long a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return 69;
    }

    public int d() {
        return 149;
    }

    public Icon e() {
        return this.c;
    }

    public Icon f() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return obj.getClass() == getClass() && this.a == ((am) obj).a();
    }
}
