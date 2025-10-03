package defpackage;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;

/* renamed from: H  reason: default package */
/* loaded from: hinterwars.jar:H.class */
public class H extends AbstractC0003ac {
    Icon j;
    Icon k;
    Icon l;
    int m;
    int n;
    Vector o;
    Vector p;
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
        this.m = 0;
        this.n = 0;
        this.q = -1;
        this.o = new Vector();
        this.p = new Vector();
    }

    public void a(Icon icon, Icon icon2, Icon icon3) {
        this.j = icon;
        this.k = icon2;
        this.l = icon3;
    }

    public void a(int i, int i2) {
        if (i < 207) {
            this.m = i + 200;
        } else {
            this.m = i;
        }
        this.n = i2;
    }

    public void a(String str, Object obj) {
        String substring;
        if (str != null) {
            if (MastersOfDestiny.A.stringWidth(str) > 175) {
                int i = 1;
                while (true) {
                    FontMetrics fontMetrics = MastersOfDestiny.A;
                    substring = str.substring(0, str.length() - i);
                    if (fontMetrics.stringWidth(substring) <= 175) {
                        break;
                    }
                    i++;
                }
                this.o.add(substring + "..");
            } else {
                this.o.add(str);
            }
        }
        if (obj != null) {
            this.p.add(obj);
        }
    }

    public void a(int i) {
        this.q = i;
    }

    public int m() {
        return this.q;
    }

    public Object n() {
        if (this.p != null && this.q >= 0 && this.q < this.p.size()) {
            return this.p.elementAt(this.q);
        }
        return null;
    }

    public Object o() {
        if (this.k != null && this.q >= 0 && this.q < this.o.size()) {
            return this.o.elementAt(this.q);
        }
        return null;
    }

    public boolean b(int i, int i2) {
        if (this.o.size() == 0 || this.p.size() == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            if (i > this.m + 5 && i < this.m + 5 + this.k.getIconWidth() && i2 > this.n + this.j.getIconHeight() + (i3 * this.k.getIconHeight()) && i2 < this.n + this.j.getIconHeight() + ((i3 + 1) * this.k.getIconHeight())) {
                a(i3);
                return true;
            }
        }
        a(-1);
        return false;
    }

    @Override // defpackage.AbstractC0003ac
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        int i = this.n;
        this.j.paintIcon(mastersOfDestiny, graphics, this.m, i);
        int iconHeight = i + this.j.getIconHeight();
        if (this.o != null) {
            Enumeration elements = this.o.elements();
            int i2 = 0;
            while (elements.hasMoreElements()) {
                this.k.paintIcon(mastersOfDestiny, graphics, this.m, iconHeight);
                graphics.setColor(new Color(0));
                graphics.setFont(MastersOfDestiny.z);
                graphics.drawString(elements.nextElement().toString(), this.m + 9, (iconHeight + this.k.getIconHeight()) - 5);
                if (this.q == i2) {
                    graphics.setColor(new Color(4247250));
                    graphics.drawRect(this.m + 5, iconHeight, this.k.getIconWidth() - 11, this.k.getIconHeight() - 1);
                }
                iconHeight += this.k.getIconHeight();
                i2++;
            }
        }
        this.l.paintIcon(mastersOfDestiny, graphics, this.m, iconHeight);
    }

    @Override // defpackage.AbstractC0003ac
    public void h() {
        this.i = 2;
        this.m = 0;
        this.n = 0;
        this.q = -1;
        this.o.clear();
        this.p.clear();
    }
}
