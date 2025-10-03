

import java.awt.Graphics;
import java.util.Enumeration;
import javax.swing.Icon;

/* renamed from: af  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:af.class */
public class C0006af extends AbstractC0003ac {
    Icon j;
    Icon[] k;
    int l;
    long m;
    int n;
    int o;
    int p;
    int q;

    @Override // defpackage.AbstractC0003ac
    public int a() {
        return 1;
    }

    @Override // defpackage.AbstractC0003ac
    public boolean a(AbstractC0003ac abstractC0003ac) {
        return false;
    }

    @Override // defpackage.AbstractC0003ac
    public boolean b(AbstractC0003ac abstractC0003ac) {
        return false;
    }

    @Override // defpackage.AbstractC0003ac
    public Enumeration b() {
        return null;
    }

    @Override // defpackage.AbstractC0003ac
    public void d() {
        this.j = null;
        this.k = null;
        this.l = 0;
        this.m = 0L;
        this.n = 0;
        this.o = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        this.n = i;
        this.o = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Icon icon) {
        this.j = icon;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Icon[] iconArr, int i, int i2) {
        this.k = iconArr;
        this.l = 0;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.AbstractC0003ac
    public int i() {
        if (this.j != null) {
            return this.j.getIconWidth();
        }
        return 0;
    }

    public int a(int i) {
        if (this.k[i] != null) {
            return this.k[i].getIconWidth();
        }
        return 0;
    }

    @Override // defpackage.AbstractC0003ac
    public int j() {
        if (this.j != null) {
            return this.j.getIconHeight();
        }
        return 0;
    }

    public int b(int i) {
        if (this.k[i] != null) {
            return this.k[i].getIconHeight();
        }
        return 0;
    }

    @Override // defpackage.AbstractC0003ac
    public int k() {
        return this.n;
    }

    @Override // defpackage.AbstractC0003ac
    public int l() {
        return this.o;
    }

    @Override // defpackage.AbstractC0003ac
    public void a(long j) {
        if (this.k != null && System.currentTimeMillis() > this.m) {
            this.l = (this.l + 1) % this.k.length;
            this.m = System.currentTimeMillis() + 200;
        }
    }

    @Override // defpackage.AbstractC0003ac
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        if (this.j != null) {
            this.j.paintIcon(GameStates.pS, graphics, this.n, this.o);
        }
        if (this.k != null) {
            this.k[this.l].paintIcon(GameStates.pS, graphics, this.p, this.q);
        }
    }
}
