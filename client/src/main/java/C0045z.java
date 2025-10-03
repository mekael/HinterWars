package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: z  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:z.class */
public class C0045z {
    private Hashtable c = new Hashtable();
    public static final byte a = 0;
    public static final byte b = 1;

    public void a(String str, String str2, String str3) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, new aD(this, c(str2), str3));
            return;
        }
        aD aDVar = (aD) this.c.get(str);
        aDVar.a(str3);
        aDVar.a(c(str2));
    }

    public void a(String str) {
        this.c.remove(str);
    }

    private byte c(String str) {
        if (str.equalsIgnoreCase("online")) {
            return (byte) 0;
        }
        return str.equalsIgnoreCase("offline") ? (byte) 1 : (byte) -1;
    }

    public String b(String str) {
        return ((aD) this.c.get(str)).b();
    }

    public String[] a() {
        Vector vector = new Vector();
        Enumeration keys = this.c.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            switch (((aD) this.c.get(str)).a()) {
                case 0:
                    vector.add(str);
                    break;
            }
        }
        String[] strArr = new String[vector.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public String[] b() {
        Vector vector = new Vector();
        Enumeration keys = this.c.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            switch (((aD) this.c.get(str)).a()) {
                case 1:
                    vector.add(str);
                    break;
            }
        }
        String[] strArr = new String[vector.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public int c() {
        return this.c.size();
    }

    public void d() {
        this.c.clear();
    }
}
