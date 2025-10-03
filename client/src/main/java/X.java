package defpackage;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Hashtable;

/* renamed from: X  reason: default package */
/* loaded from: hinterwars.jar:X.class */
public class X {
    public AbstractC0026e a;
    private boolean h;
    private byte i;
    private GameStates j;
    private C0001aa k;
    private Hashtable b = new Hashtable();
    private int c = 0;
    private int d = -1;
    private int e = 0;
    private boolean f = true;
    private B g = new B();

    public X(GameStates gameStates) {
        this.j = gameStates;
        this.g.a(C0002ab.m, 260, 289, 80, C0031j.a().b().d("en", 0) + C0031j.a().b().d("en", 128), 250, 254);
        this.h = false;
    }

    public void a(String str, byte b) {
        this.g.a(str, MastersOfDestiny.D, MastersOfDestiny.E);
        this.i = b;
        this.h = true;
    }

    public boolean a() {
        return this.h;
    }

    public void a(int i, AbstractC0026e abstractC0026e) {
        this.b.put(new Integer(i), abstractC0026e);
    }

    public int a(C0001aa c0001aa, long j) {
        this.k = c0001aa;
        if (this.e != this.d) {
            this.f = true;
            if (this.a != null) {
                this.a.a();
            }
            this.a = (AbstractC0026e) this.b.get(new Integer(this.e));
            if (this.a == null) {
                C0032k.a("Invalid state");
                return 0;
            }
            this.a.a(c0001aa, j);
            this.c = this.d;
            this.d = this.e;
            this.f = false;
        }
        return this.a.b(c0001aa, j);
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        if (!this.f && this.a != null) {
            this.a.a(graphics, mastersOfDestiny);
        }
        if (this.h) {
            this.g.a(graphics, mastersOfDestiny);
        }
    }

    public void a(String[] strArr) {
        C0032k.a("----------------" + strArr[0] + "-------------------");
        if (strArr[0].equals(C0000a.H)) {
            C0032k.a("----------------" + strArr[0] + "in-------------------");
            try {
                this.k.aD.close();
            } catch (IOException e) {
            }
            C0032k.a("----------------here------------------");
            C0032k.a("----------------here---2---------------");
        }
        if (this.a != null) {
            this.a.a(strArr);
        }
    }

    public void a(int i, Object obj) {
        if (this.a != null) {
            this.a.a(i, obj);
        }
    }

    public void a(MouseEvent mouseEvent) {
        if (this.h || this.f || this.a == null) {
            return;
        }
        this.a.a(mouseEvent);
    }

    public void b(MouseEvent mouseEvent) {
        if (this.h || this.f || this.a == null) {
            return;
        }
        this.a.b(mouseEvent);
    }

    public void c(MouseEvent mouseEvent) {
        if (this.h || this.f || this.a == null) {
            return;
        }
        this.a.c(mouseEvent);
    }

    public void d(MouseEvent mouseEvent) {
        if (this.h || this.f || this.a == null) {
            return;
        }
        this.a.d(mouseEvent);
    }

    public void e(MouseEvent mouseEvent) {
        if (this.h || this.f || this.a == null) {
            return;
        }
        this.a.e(mouseEvent);
    }

    public void a(KeyEvent keyEvent) {
        if (this.h) {
            this.a.a(this.i);
            this.h = false;
        } else if (this.f || this.a == null) {
        } else {
            this.a.a(keyEvent);
        }
    }

    public void b(KeyEvent keyEvent) {
        if (this.h || this.f || this.a == null) {
            return;
        }
        this.a.b(keyEvent);
    }

    public void c(KeyEvent keyEvent) {
        if (this.h || this.f || this.a == null) {
            return;
        }
        this.a.c(keyEvent);
    }
}
