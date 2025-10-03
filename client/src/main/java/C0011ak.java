

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: ak  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ak.class */
public class C0011ak extends AbstractC0003ac {
    String j;
    private Vector A = new Vector();
    int k;
    int l;
    int m;
    int n;
    int o;
    Icon p;
    static Vector q = new Vector();
    static final byte r = -1;
    static final byte s = 0;
    static final byte t = 1;
    static final byte u = 2;
    static final byte v = 3;
    static final byte w = 4;
    static final byte x = 5;
    static final byte y = 6;
    byte z;

    public static C0011ak m() {
        Enumeration elements = q.elements();
        while (elements.hasMoreElements()) {
            AbstractC0003ac abstractC0003ac = (AbstractC0003ac) elements.nextElement();
            if (abstractC0003ac.f()) {
                abstractC0003ac.i = 0;
                abstractC0003ac.d();
                return (C0011ak) abstractC0003ac;
            }
        }
        C0011ak c0011ak = new C0011ak();
        c0011ak.i = 0;
        c0011ak.d();
        q.addElement(c0011ak);
        return c0011ak;
    }

    public void a(byte b) {
        this.z = b;
    }

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

    public void a(String str, int i, int i2, int i3, int i4, FontMetrics fontMetrics, String str2) {
        this.j = str;
        this.A.removeAllElements();
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        if (str2 != null) {
            this.p = new ImageIcon(getClass().getResource(str2));
        }
        boolean z = false;
        int i5 = 0;
        if (str == null) {
            z = true;
        }
        while (!z) {
            int i6 = 0;
            int i7 = i5;
            while (true) {
                if (i5 >= str.length()) {
                    this.A.addElement(new Integer(i7));
                    this.A.addElement(new Integer(str.length() - 1));
                    z = true;
                    break;
                }
                char charAt = str.charAt(i5);
                if ('\n' != charAt) {
                    int charWidth = fontMetrics.charWidth(charAt);
                    if (i6 + charWidth <= i3) {
                        i6 += charWidth;
                        i5++;
                    } else if (str.charAt(i5) != ' ') {
                        int i8 = i5;
                        while (i8 > i7) {
                            i8--;
                            if (str.charAt(i8) == ' ') {
                                break;
                            }
                        }
                        if (i8 != i7) {
                            this.A.addElement(new Integer(i7));
                            this.A.addElement(new Integer(i8));
                            i5 = i8 + 1;
                        } else {
                            this.A.addElement(new Integer(i7));
                            this.A.addElement(new Integer(i5));
                        }
                    } else {
                        this.A.addElement(new Integer(i7));
                        this.A.addElement(new Integer(i5));
                        i5++;
                    }
                } else if (this.z != 1) {
                    this.A.addElement(new Integer(i7));
                    this.A.addElement(new Integer(i5));
                    i5++;
                    break;
                }
            }
        }
        this.o = ((this.A.size() >> 1) * fontMetrics.getHeight()) + 4;
    }

    @Override // defpackage.AbstractC0003ac
    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        int i;
        int charWidth;
        int height = this.z == 0 ? MastersOfDestiny.E.getHeight() : graphics.getFontMetrics(graphics.getFont()).getHeight();
        int i2 = this.k;
        int i3 = this.l;
        int i4 = this.m;
        switch (this.z) {
            case 0:
                this.p.paintIcon(GameStates.pS, graphics, i2, i3);
                graphics.setColor(new Color(8838126));
                i3 += 30;
                break;
            case 1:
                graphics.setColor(new Color(0));
                break;
            case 2:
                graphics.setColor(new Color(0));
                graphics.fillRect(i2, i3, i4 + 20, this.o);
                graphics.setColor(new Color(3305332));
                graphics.drawRect(i2, i3, i4 + 20, this.o);
                graphics.drawRect(i2 + 1, i3 + 1, i4 + 18, this.o - 2);
                graphics.setColor(new Color(16777215));
                i3 += height;
                break;
            case 3:
                graphics.setColor(new Color(0));
                graphics.fillRect(i2, i3, i4 + 151, this.o);
                graphics.setColor(new Color(5761261));
                graphics.drawRect(i2, i3, i4 + 151, this.o);
                graphics.drawRect(i2 + 1, i3 + 1, i4 + 149, this.o - 2);
                graphics.setColor(new Color(3305332));
                graphics.drawLine(i2 + i4, i3 + 2, i2 + i4, (i3 + this.o) - 2);
                graphics.drawLine((i2 + i4) - 1, i3 + 2, (i2 + i4) - 1, (i3 + this.o) - 2);
                graphics.setColor(new Color(16777215));
                i3 += height;
                break;
            case 4:
                graphics.setColor(new Color(0));
                graphics.fillRect(i2 - 18, i3, i4 + 20, this.o);
                graphics.setColor(new Color(3305332));
                graphics.drawRect(i2 - 18, i3, i4 + 20, this.o);
                graphics.drawRect(i2 - 17, i3 + 1, i4 + 18, this.o - 2);
                graphics.setColor(new Color(16777215));
                i3 += height;
                break;
            case 5:
                graphics.setColor(new Color(6710886));
                break;
            case 6:
                graphics.setColor(new Color(0));
                graphics.fillRect(i2 - 18, i3, i4 + 20, this.o);
                graphics.setColor(new Color(3305332));
                graphics.drawRect(i2 - 18, i3, i4 + 20, this.o);
                graphics.drawRect(i2 - 17, i3 + 1, i4 + 18, this.o - 2);
                graphics.setColor(new Color(16777215));
                i3 += height;
                break;
        }
        if (this.z != 1) {
            Enumeration elements = this.A.elements();
            while (elements.hasMoreElements()) {
                int intValue = ((Integer) elements.nextElement()).intValue();
                int intValue2 = ((Integer) elements.nextElement()).intValue();
                int i5 = i2;
                if (this.z == 0) {
                    i5 = i2 + 50;
                } else if (this.z == 2 || this.z == 3) {
                    i5 = i2 + (graphics.getFontMetrics(graphics.getFont()).getHeight() / 2);
                }
                for (int i6 = intValue; i6 <= intValue2; i6++) {
                    graphics.drawString(Character.toString(this.j.charAt(i6)), i5, i3);
                    if (this.z == 0) {
                        i = i5;
                        charWidth = MastersOfDestiny.E.charWidth(this.j.charAt(i6));
                    } else {
                        i = i5;
                        charWidth = graphics.getFontMetrics(graphics.getFont()).charWidth(this.j.charAt(i6));
                    }
                    i5 = i + charWidth;
                }
                i3 += height;
            }
            return;
        }
        graphics.setFont(MastersOfDestiny.ao);
        if (this.A.size() <= 4) {
            Enumeration elements2 = this.A.elements();
            while (elements2.hasMoreElements()) {
                int intValue3 = ((Integer) elements2.nextElement()).intValue();
                int intValue4 = ((Integer) elements2.nextElement()).intValue();
                int i7 = i2;
                for (int i8 = intValue3; i8 <= intValue4; i8++) {
                    graphics.drawString(Character.toString(this.j.charAt(i8)), i7, i3);
                    i7 += graphics.getFontMetrics(graphics.getFont()).charWidth(this.j.charAt(i8));
                }
                i3 += height;
            }
            return;
        }
        int intValue5 = ((Integer) this.A.get(0)).intValue();
        int intValue6 = ((Integer) this.A.get(1)).intValue();
        int i9 = intValue6 - intValue5;
        int i10 = i2;
        for (int i11 = intValue5; i11 <= intValue6; i11++) {
            graphics.drawString(Character.toString(this.j.charAt(i11)), i10, i3);
            i10 += graphics.getFontMetrics(graphics.getFont()).charWidth(this.j.charAt(i11));
        }
        int i12 = i3 + height;
        int intValue7 = ((Integer) this.A.get(2)).intValue();
        int intValue8 = ((Integer) this.A.get(3)).intValue();
        int i13 = i2;
        if (intValue8 - intValue7 >= i9 - 3) {
            intValue8 -= 3;
        }
        for (int i14 = intValue7; i14 <= intValue8; i14++) {
            graphics.drawString(Character.toString(this.j.charAt(i14)), i13, i12);
            i13 += graphics.getFontMetrics(graphics.getFont()).charWidth(this.j.charAt(i14));
        }
        for (int i15 = 0; i15 < 3; i15++) {
            graphics.drawString(".", i13, i12);
            i13 += graphics.getFontMetrics(graphics.getFont()).charWidth(this.j.charAt(i15));
        }
        int i16 = i12 + height;
    }
}
