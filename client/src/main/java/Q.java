package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: Q  reason: default package */
/* loaded from: hinterwars.jar:Q.class */
public class Q {
    private Hashtable a = new Hashtable();

    public void a(String str, String str2) {
        this.a.put(str, str2);
    }

    public void a(String str) {
        this.a.remove(str);
    }

    public String b(String str) {
        return ((String) this.a.get(str)).split("\\|")[0];
    }

    public String[] a() {
        Vector vector = new Vector();
        Enumeration keys = this.a.keys();
        while (keys.hasMoreElements()) {
            vector.add((String) keys.nextElement());
        }
        String[] strArr = new String[vector.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public String[] b() {
        Vector vector = new Vector();
        Enumeration keys = this.a.keys();
        while (keys.hasMoreElements()) {
            vector.add((String) this.a.get((String) keys.nextElement()));
        }
        String[] strArr = new String[vector.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public int c() {
        return this.a.size();
    }

    public void d() {
        this.a.clear();
    }
}
