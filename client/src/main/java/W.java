package defpackage;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: W  reason: default package */
/* loaded from: hinterwars.jar:W.class */
public class W {
    private int j;
    private int k;
    private byte l;
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    private byte m;
    public static final byte e = 0;
    public static final byte f = 1;
    public static final byte g = 2;
    public static final byte h = 3;
    private Vector i = new Vector();
    private aG n = null;

    public W(int i, int i2, byte b2, byte b3) {
        this.j = i;
        this.k = i2;
        this.l = b2;
        this.m = b3;
    }

    public void a(String str, String str2, int i, int i2, int i3, int i4, FontMetrics fontMetrics, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, Object[] objArr) {
        int i5 = this.j;
        int i6 = this.k;
        Enumeration elements = this.i.elements();
        boolean z = true;
        while (elements.hasMoreElements()) {
            aG aGVar = (aG) elements.nextElement();
            C0032k.a("test 1: x=" + i5 + "; y=" + i6);
            if (z) {
                C0032k.a("test 2: x=" + i5 + "; y=" + i6);
                z = false;
                C0032k.a("test 3: x=" + i5 + "; y=" + i6);
                switch (this.l) {
                    case 1:
                        i5 -= aGVar.d();
                        C0032k.a("test 4: x=" + i5 + "; y=" + i6);
                        break;
                    case 2:
                        i6 -= aGVar.e();
                        break;
                    case 3:
                        i5 -= aGVar.d();
                        i6 -= aGVar.e();
                        break;
                }
            }
            C0032k.a("test 5: x=" + i5 + "; y=" + i6);
            switch (this.m) {
                case 0:
                    i5 -= aGVar.d();
                    break;
                case 1:
                    i5 += aGVar.d();
                    break;
                case 2:
                    i6 -= aGVar.e();
                    break;
                case 3:
                    i6 += aGVar.e();
                    break;
            }
        }
        C0032k.a("test 6: x=" + i5 + "; y=" + i6);
        aG aGVar2 = new aG();
        aGVar2.a(str);
        if (z) {
            switch (this.l) {
                case 1:
                    i5 -= aGVar2.d();
                    break;
                case 2:
                    i6 -= aGVar2.e();
                    break;
                case 3:
                    i5 -= aGVar2.d();
                    i6 -= aGVar2.e();
                    break;
            }
        }
        aGVar2.a(i5);
        aGVar2.b(i6);
        aGVar2.a(i5 + i, i6 + i2, i3, i4, fontMetrics);
        C0032k.a("FeedBack test: x=" + i5 + "; y=" + i6 + "; textX=" + i5 + i + "; textY=" + i6 + i2);
        aGVar2.b(str2);
        aGVar2.a(strArr);
        aGVar2.a(iArr);
        aGVar2.b(iArr2);
        aGVar2.a(iArr3, objArr);
        this.i.add(aGVar2);
    }

    public void a(aG aGVar) {
        this.i.removeElement(aGVar);
        int i = this.j;
        int i2 = this.k;
        Enumeration elements = this.i.elements();
        boolean z = true;
        while (elements.hasMoreElements()) {
            aG aGVar2 = (aG) elements.nextElement();
            if (z) {
                z = false;
                switch (this.l) {
                    case 1:
                        i -= aGVar2.d();
                        break;
                    case 2:
                        i2 -= aGVar2.e();
                        break;
                    case 3:
                        i -= aGVar2.d();
                        i2 -= aGVar2.e();
                        break;
                }
                aGVar2.a(i);
                aGVar2.b(i2);
            } else {
                switch (this.m) {
                    case 0:
                        i -= aGVar2.d();
                        break;
                    case 1:
                        i += aGVar2.d();
                        break;
                    case 2:
                        i2 -= aGVar2.e();
                        break;
                    case 3:
                        i2 += aGVar2.e();
                        break;
                }
                aGVar2.a(i);
                aGVar2.b(i2);
            }
        }
    }

    public void a(int i) {
        this.i.removeElementAt(i);
        int i2 = this.j;
        int i3 = this.k;
        Enumeration elements = this.i.elements();
        boolean z = true;
        while (elements.hasMoreElements()) {
            aG aGVar = (aG) elements.nextElement();
            if (z) {
                z = false;
                switch (this.l) {
                    case 1:
                        i2 -= aGVar.d();
                        break;
                    case 2:
                        i3 -= aGVar.e();
                        break;
                    case 3:
                        i2 -= aGVar.d();
                        i3 -= aGVar.e();
                        break;
                }
                aGVar.a(i2);
                aGVar.b(i3);
            } else {
                switch (this.m) {
                    case 0:
                        i2 -= aGVar.d();
                        break;
                    case 1:
                        i2 += aGVar.d();
                        break;
                    case 2:
                        i3 -= aGVar.e();
                        break;
                    case 3:
                        i3 += aGVar.e();
                        break;
                }
                aGVar.a(i2);
                aGVar.b(i3);
            }
        }
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        Enumeration elements = this.i.elements();
        while (elements.hasMoreElements()) {
            ((aG) elements.nextElement()).a(graphics, mastersOfDestiny);
        }
    }

    public Object a(MouseEvent mouseEvent) {
        Enumeration elements = this.i.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            aG aGVar = (aG) elements.nextElement();
            int a2 = aGVar.a(mouseEvent);
            if (a2 != -1) {
                Object f2 = aGVar.f(a2);
                if (f2 == null) {
                    a(i);
                }
                this.n = aGVar;
                return f2;
            }
            i++;
        }
        return null;
    }

    public Vector a() {
        return this.i;
    }

    public aG b() {
        return this.n;
    }
}
