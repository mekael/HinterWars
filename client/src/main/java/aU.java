

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* renamed from: aU  reason: default package */
/* loaded from: hinterwars.jar:aU.class */
public class aU {
    private static aU c = null;
    private Icon d;
    private int f;
    private int g;
    private int h;
    private Icon i;
    private Icon j;
    private byte k;
    private static boolean s;
    private Icon t;
    private static boolean u;
    private Icon v;
    private static boolean w;
    private Icon x;
    private static boolean y;
    private Icon z;
    private static boolean A;
    private Icon B;
    private static boolean C;
    private Icon D;
    private Icon E;
    private Icon F;
    private Icon G;
    private Icon H;
    private Icon I;
    private Icon J;
    private boolean K;
    public boolean a;
    private int L;
    private int M;
    private boolean N;
    public boolean b;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private final byte l = -1;
    private final byte m = 0;
    private final byte n = 1;
    private final byte o = 2;
    private final byte p = 3;
    private final byte q = 4;
    private final byte r = 5;
    private int[] e = new int[6];

    public static aU a(C0001aa c0001aa, byte b) {
        if (c == null) {
            c = new aU(c0001aa);
        }
        a(b);
        return c;
    }

    private aU(C0001aa c0001aa) {
        this.d = new ImageIcon(getClass().getResource(c0001aa.f("en", 540)));
        this.e[0] = c0001aa.d("en", 630);
        this.e[1] = c0001aa.d("en", 631);
        this.e[2] = c0001aa.d("en", 632);
        this.e[3] = c0001aa.d("en", 633);
        this.e[4] = c0001aa.d("en", 634);
        this.e[5] = c0001aa.d("en", 635);
        this.f = c0001aa.d("en", 637);
        this.g = c0001aa.d("en", 638);
        this.h = c0001aa.d("en", 639);
        this.i = new ImageIcon(getClass().getResource(c0001aa.f("en", 609)));
        this.j = new ImageIcon(getClass().getResource(c0001aa.f("en", 610)));
        this.k = (byte) -1;
        s = true;
        u = true;
        w = true;
        y = true;
        A = true;
        C = true;
        a(c0001aa);
    }

    private static void a(byte b) {
        switch (b) {
            case C0000a.bh /* 22 */:
                s = false;
                u = false;
                w = false;
                y = false;
                A = false;
                C = true;
                return;
            default:
                s = true;
                u = true;
                w = true;
                y = true;
                A = true;
                C = false;
                return;
        }
    }

    public void a(MouseEvent mouseEvent) {
    }

    public void b(MouseEvent mouseEvent) {
        if (mouseEvent.getY() >= this.f && mouseEvent.getY() <= this.f + this.h) {
            if (s && mouseEvent.getX() >= this.e[0] && mouseEvent.getX() <= this.e[0] + this.g) {
                this.k = (byte) 0;
                return;
            } else if (u && mouseEvent.getX() >= this.e[1] && mouseEvent.getX() <= this.e[1] + this.g) {
                this.k = (byte) 1;
                return;
            } else if (w && mouseEvent.getX() >= this.e[2] && mouseEvent.getX() <= this.e[2] + this.g) {
                this.k = (byte) 2;
                return;
            } else if (y && mouseEvent.getX() >= this.e[3] && mouseEvent.getX() <= this.e[3] + this.g) {
                this.k = (byte) 3;
                return;
            } else if (A && mouseEvent.getX() >= this.e[4] && mouseEvent.getX() <= this.e[4] + this.g) {
                this.k = (byte) 4;
                return;
            } else if (C && mouseEvent.getX() >= this.e[5] && mouseEvent.getX() <= this.e[5] + this.g) {
                this.k = (byte) 5;
                return;
            }
        }
        switch (this.k) {
            case 0:
                f(mouseEvent);
                return;
            case 1:
                g(mouseEvent);
                return;
            case 2:
                h(mouseEvent);
                return;
            case 3:
                i(mouseEvent);
                return;
            case 4:
                j(mouseEvent);
                return;
            case 5:
                k(mouseEvent);
                return;
            default:
                return;
        }
    }

    public void c(MouseEvent mouseEvent) {
    }

    public void d(MouseEvent mouseEvent) {
    }

    public void e(MouseEvent mouseEvent) {
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        this.d.paintIcon(mastersOfDestiny, graphics, 0, mastersOfDestiny.getHeight() - this.d.getIconHeight());
        switch (this.k) {
            case 0:
                b(graphics, mastersOfDestiny);
                return;
            case 1:
                c(graphics, mastersOfDestiny);
                return;
            case 2:
                d(graphics, mastersOfDestiny);
                return;
            case 3:
                e(graphics, mastersOfDestiny);
                return;
            case 4:
                f(graphics, mastersOfDestiny);
                return;
            case 5:
                g(graphics, mastersOfDestiny);
                return;
            default:
                return;
        }
    }

    private void f(MouseEvent mouseEvent) {
    }

    private void b(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
    }

    private void g(MouseEvent mouseEvent) {
    }

    private void c(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
    }

    private void h(MouseEvent mouseEvent) {
    }

    private void d(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
    }

    private void i(MouseEvent mouseEvent) {
    }

    private void e(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
    }

    private void j(MouseEvent mouseEvent) {
    }

    private void f(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
    }

    private void a(C0001aa c0001aa) {
        this.D = new ImageIcon(getClass().getResource(c0001aa.f("en", 547)));
        this.E = new ImageIcon(getClass().getResource(c0001aa.f("en", 605)));
        this.F = new ImageIcon(getClass().getResource(c0001aa.f("en", 606)));
        this.G = new ImageIcon(getClass().getResource(c0001aa.f("en", 607)));
        this.H = new ImageIcon(getClass().getResource(c0001aa.f("en", 608)));
        this.I = new ImageIcon(getClass().getResource(c0001aa.f("en", 611)));
        this.J = new ImageIcon(getClass().getResource(c0001aa.f("en", 618)));
        this.K = true;
        this.a = false;
        this.L = c0001aa.d("en", 552);
        this.M = c0001aa.d("en", 553);
        this.N = true;
        this.O = c0001aa.d("en", 554);
        this.P = c0001aa.d("en", 555);
        this.Q = c0001aa.d("en", 556);
        this.R = c0001aa.d("en", 557);
        this.S = c0001aa.d("en", 548);
        this.T = c0001aa.d("en", 549);
        this.U = c0001aa.d("en", 558);
        this.V = c0001aa.d("en", 559);
        this.W = c0001aa.d("en", 560);
        this.X = c0001aa.d("en", 561);
        this.Y = c0001aa.d("en", 562);
        this.Z = c0001aa.d("en", 563);
        this.aa = c0001aa.d("en", 564);
        this.ab = c0001aa.d("en", 565);
        this.ac = c0001aa.d("en", 550);
        this.ad = c0001aa.d("en", 551);
    }

    private void k(MouseEvent mouseEvent) {
        if (mouseEvent.getX() < this.L || mouseEvent.getX() > this.L + this.S || mouseEvent.getY() < this.M || mouseEvent.getY() <= this.M + this.T) {
        }
    }

    private void g(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        this.D.paintIcon(mastersOfDestiny, graphics, mastersOfDestiny.getWidth() - this.D.getIconWidth(), mastersOfDestiny.getHeight() - this.D.getIconHeight());
    }
}
