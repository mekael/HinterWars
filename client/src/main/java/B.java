

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: B  reason: default package */
/* loaded from: hinterwars.jar:B.class */
public class B extends AbstractC0003ac {
    private String j;
    private Vector k = new Vector();
    private FontMetrics l;
    private Font m;
    private int n;
    private int o;
    private int p;
    private int q;
    private Icon r;
    private int s;
    private int t;

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

    public void a(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = new ImageIcon(getClass().getResource(str));
        this.s = i5;
        this.t = i6;
    }

    public void a(String str, Font font, FontMetrics fontMetrics) {
        this.j = str;
        this.m = font;
        this.l = fontMetrics;
        this.k.removeAllElements();
        boolean z = false;
        int i = 0;
        if (str == null) {
            z = true;
        }
        while (!z) {
            int i2 = 0;
            int i3 = i;
            while (true) {
                if (i >= str.length()) {
                    this.k.addElement(new Integer(i3));
                    this.k.addElement(new Integer(str.length() - 1));
                    z = true;
                    break;
                }
                char charAt = str.charAt(i);
                if ('\n' == charAt) {
                    this.k.addElement(new Integer(i3));
                    this.k.addElement(new Integer(i));
                    i++;
                    break;
                }
                int charWidth = fontMetrics.charWidth(charAt);
                if (i2 + charWidth <= this.p) {
                    i2 += charWidth;
                    i++;
                } else if (str.charAt(i) != ' ') {
                    int i4 = i;
                    while (i4 > i3) {
                        i4--;
                        if (str.charAt(i4) == ' ') {
                            break;
                        }
                    }
                    if (i4 != i3) {
                        this.k.addElement(new Integer(i3));
                        this.k.addElement(new Integer(i4));
                        i = i4 + 1;
                    } else {
                        this.k.addElement(new Integer(i3));
                        this.k.addElement(new Integer(i));
                    }
                } else {
                    this.k.addElement(new Integer(i3));
                    this.k.addElement(new Integer(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.AbstractC0003ac
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        this.r.paintIcon(mastersOfDestiny, graphics, this.s, this.t);
        graphics.setFont(this.m);
        graphics.setColor(new Color(8838126));
        int height = this.l.getHeight();
        int size = this.o + ((this.q - ((this.k.size() / 2) * height)) / 2);
        Enumeration elements = this.k.elements();
        while (elements.hasMoreElements()) {
            int intValue = ((Integer) elements.nextElement()).intValue();
            int intValue2 = ((Integer) elements.nextElement()).intValue();
            int stringWidth = ((this.p - this.l.stringWidth(this.j.substring(intValue, intValue2))) / 2) + this.n;
            for (int i = intValue; i <= intValue2; i++) {
                graphics.drawString(Character.toString(this.j.charAt(i)), stringWidth, size);
                stringWidth += this.l.charWidth(this.j.charAt(i));
            }
            size += height;
        }
    }
}
