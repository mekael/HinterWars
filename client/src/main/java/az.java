

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: az  reason: default package */
/* loaded from: hinterwars.jar:az.class */
public class az extends AbstractC0003ac {
    public az() {
        this.a = new Vector();
    }

    @Override // defpackage.AbstractC0003ac
    public int a() {
        int i = 0;
        Enumeration elements = this.a.elements();
        while (elements.hasMoreElements()) {
            i += ((AbstractC0003ac) elements.nextElement()).a();
        }
        return i;
    }

    @Override // defpackage.AbstractC0003ac
    public boolean a(AbstractC0003ac abstractC0003ac) {
        abstractC0003ac.c(this);
        return this.a.add(abstractC0003ac);
    }

    @Override // defpackage.AbstractC0003ac
    public boolean b(AbstractC0003ac abstractC0003ac) {
        return this.a.remove(abstractC0003ac);
    }

    public void m() {
        Enumeration elements = this.a.elements();
        while (elements.hasMoreElements()) {
            ((AbstractC0003ac) elements.nextElement()).h();
        }
        this.a.clear();
    }

    @Override // defpackage.AbstractC0003ac
    public Enumeration b() {
        return this.a.elements();
    }
}
