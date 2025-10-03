package defpackage;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Vector;

/* renamed from: aP  reason: default package */
/* loaded from: hinterwars.jar:aP.class */
public class aP {
    private int[] a;
    private int[] b;
    private Vector c;
    private int d;
    private int[] e;
    private final byte f = 0;
    private final byte g = 1;
    private int h;
    private int i;
    private int j;
    private boolean k;

    public aP(int[] iArr, int[] iArr2, Vector vector) {
        this.a = iArr;
        this.b = iArr2;
        this.c = vector;
    }

    public void a(int i, int[] iArr, int i2, int i3) {
        this.d = i;
        this.e = iArr;
        this.h = i2;
        this.i = i3;
        this.j = 0;
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        int length = this.j * this.a.length;
        for (int i = 0; i < this.b.length; i++) {
            for (int i2 = 0; i2 < this.a.length; i2++) {
                if (length < this.c.size()) {
                    length++;
                }
            }
        }
    }

    public void a(MouseEvent mouseEvent) {
        for (int i = 0; i < this.e.length; i++) {
            if (mouseEvent.getX() >= this.d && mouseEvent.getX() <= this.d + this.h && mouseEvent.getY() >= this.e[i] && mouseEvent.getY() <= this.e[i] + this.i) {
                switch (i) {
                    case 0:
                        if (this.j > 0) {
                            this.j--;
                            return;
                        }
                        return;
                    case 1:
                        if (this.a.length * (this.j + this.b.length) < this.c.size()) {
                            this.j++;
                            return;
                        }
                        return;
                }
            }
        }
    }

    public void a() {
    }
}
