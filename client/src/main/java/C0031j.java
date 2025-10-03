

import java.awt.Graphics;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/* renamed from: j  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:j.class */
public class C0031j {
    private static C0031j b = null;
    private Vector[] d;
    private boolean c = false;
    private Vector e = new Vector();
    private Vector f = new Vector();
    protected aE a = null;

    public static C0031j a() {
        if (b == null) {
            b = new C0031j();
        }
        return b;
    }

    private C0031j() {
    }

    public void a(aE aEVar) {
        this.a = aEVar;
    }

    public aE b() {
        return this.a;
    }

    public AbstractC0003ac a(Class cls) {
        try {
            Enumeration elements = this.e.elements();
            while (elements.hasMoreElements()) {
                AbstractC0003ac abstractC0003ac = (AbstractC0003ac) elements.nextElement();
                if (abstractC0003ac.f() && abstractC0003ac.getClass() == cls) {
                    abstractC0003ac.i = 0;
                    abstractC0003ac.d();
                    return abstractC0003ac;
                }
            }
            AbstractC0003ac abstractC0003ac2 = (AbstractC0003ac) cls.newInstance();
            abstractC0003ac2.i = 0;
            abstractC0003ac2.d();
            this.e.addElement(abstractC0003ac2);
            return abstractC0003ac2;
        } catch (Exception e) {
            C0032k.a("spawnEntity exception: " + e.getMessage());
            return null;
        }
    }

    public void c() {
        this.e.removeAllElements();
        this.f.removeAllElements();
    }

    public void b(Class cls) {
        Enumeration elements = this.e.elements();
        while (elements.hasMoreElements()) {
            AbstractC0003ac abstractC0003ac = (AbstractC0003ac) elements.nextElement();
            if (abstractC0003ac.e() && abstractC0003ac.getClass() == cls) {
                abstractC0003ac.h();
            }
        }
    }

    public void a(aN aNVar) {
        this.f.addElement(aNVar);
    }

    public void a(int i, AbstractC0003ac abstractC0003ac) {
        Enumeration elements = this.f.elements();
        while (elements.hasMoreElements()) {
            ((aN) elements.nextElement()).a(i, abstractC0003ac);
        }
    }

    public void a(long j) {
        for (int i = 0; i < this.e.size(); i++) {
            try {
                AbstractC0003ac abstractC0003ac = (AbstractC0003ac) this.e.elementAt(i);
                if (abstractC0003ac.e()) {
                    abstractC0003ac.a(j);
                }
            } catch (ClassNotFoundException e) {
                C0032k.a("class not found!!!");
                return;
            }
        }
        for (int i2 = 0; i2 < this.e.size() - 2; i2++) {
            AbstractC0003ac abstractC0003ac2 = (AbstractC0003ac) this.e.elementAt(i2);
            if (abstractC0003ac2.e()) {
                for (int i3 = i2 + 1; i3 < this.e.size(); i3++) {
                    AbstractC0003ac abstractC0003ac3 = (AbstractC0003ac) this.e.elementAt(i3);
                    if (abstractC0003ac3.e() && abstractC0003ac2.getClass() != Class.forName("az") && abstractC0003ac3.getClass() != Class.forName("az") && abstractC0003ac2.getClass() != Class.forName("af") && abstractC0003ac3.getClass() != Class.forName("af") && a(abstractC0003ac2, abstractC0003ac3)) {
                        abstractC0003ac2.d(abstractC0003ac3);
                        abstractC0003ac3.d(abstractC0003ac2);
                    }
                }
            }
        }
    }

    public void a(String str, boolean z) {
        if (z) {
            C0032k.a(str);
        } else {
            C0032k.a(str);
        }
    }

    public void a(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        try {
            Enumeration elements = this.e.elements();
            while (elements.hasMoreElements()) {
                AbstractC0003ac abstractC0003ac = (AbstractC0003ac) elements.nextElement();
                if (abstractC0003ac.getClass() == Class.forName("az") && abstractC0003ac.e()) {
                    Enumeration b2 = abstractC0003ac.b();
                    if (b2.hasMoreElements()) {
                        Object nextElement = b2.nextElement();
                        if (nextElement.getClass() == Class.forName("ad")) {
                            Map synchronizedMap = Collections.synchronizedMap(new TreeMap(new C0041v(this)));
                            C0004ad c0004ad = (C0004ad) nextElement;
                            if (c0004ad.e()) {
                                synchronizedMap.put(new Integer(c0004ad.l()), c0004ad);
                            }
                            while (b2.hasMoreElements()) {
                                C0004ad c0004ad2 = (C0004ad) b2.nextElement();
                                if (c0004ad2.e()) {
                                    Vector vector = new Vector();
                                    vector.add(c0004ad2);
                                    Object put = synchronizedMap.put(new Integer(c0004ad2.l()), vector);
                                    if (put != null) {
                                        if (put.getClass() == Class.forName("ad")) {
                                            vector.add((C0004ad) put);
                                            synchronizedMap.put(new Integer(c0004ad2.l()), vector);
                                        } else {
                                            Enumeration elements2 = ((Vector) put).elements();
                                            while (elements2.hasMoreElements()) {
                                                vector.add((C0004ad) elements2.nextElement());
                                                synchronizedMap.put(new Integer(c0004ad2.l()), vector);
                                            }
                                        }
                                    }
                                }
                            }
                            for (Object obj : synchronizedMap.values()) {
                                if (obj.getClass() == Class.forName("ad")) {
                                    ((C0004ad) obj).a(graphics, mastersOfDestiny);
                                } else {
                                    Enumeration elements3 = ((Vector) obj).elements();
                                    while (elements3.hasMoreElements()) {
                                        ((C0004ad) elements3.nextElement()).a(graphics, mastersOfDestiny);
                                    }
                                }
                            }
                        } else {
                            AbstractC0003ac abstractC0003ac2 = (AbstractC0003ac) nextElement;
                            if (abstractC0003ac2.e()) {
                                abstractC0003ac2.a(graphics, mastersOfDestiny);
                            }
                            while (b2.hasMoreElements()) {
                                AbstractC0003ac abstractC0003ac3 = (AbstractC0003ac) b2.nextElement();
                                if (abstractC0003ac3.e()) {
                                    abstractC0003ac3.a(graphics, mastersOfDestiny);
                                }
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
        }
    }

    public void b(Graphics graphics, MastersOfDestiny mastersOfDestiny) {
        Enumeration elements = this.e.elements();
        while (elements.hasMoreElements()) {
            AbstractC0003ac abstractC0003ac = (AbstractC0003ac) elements.nextElement();
            if (abstractC0003ac.e()) {
                abstractC0003ac.b(graphics, mastersOfDestiny);
            }
        }
    }

    boolean a(AbstractC0003ac abstractC0003ac, AbstractC0003ac abstractC0003ac2) {
        if (abstractC0003ac.i() == 0 || abstractC0003ac.j() == 0 || abstractC0003ac2.i() == 0 || abstractC0003ac2.j() == 0) {
            return false;
        }
        int k = abstractC0003ac2.k();
        int i = k + abstractC0003ac2.i();
        int l = abstractC0003ac2.l();
        int j = l + abstractC0003ac2.j();
        int k2 = abstractC0003ac.k();
        int i2 = k2 + abstractC0003ac.i();
        int l2 = abstractC0003ac.l();
        int j2 = l2 + abstractC0003ac.j();
        if ((k2 < k || k2 > i) && ((i2 < k || i2 > i) && (k2 > k || i2 < i))) {
            return false;
        }
        if (l2 < l || l2 > j) {
            if (j2 < l || j2 > j) {
                return l2 <= l && j2 >= j;
            }
            return true;
        }
        return true;
    }
}
