package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: aA  reason: default package */
/* loaded from: hinterwars.jar:aA.class */
public class aA {
    private Hashtable a = new Hashtable();
    private Hashtable b = new Hashtable();
    private String c = "res/cafe/Quest/";
    private String d = "res/cafe/SubQuest/Log/";

    public void a(long j, long j2, long j3, String str) {
        String[] strArr = new String[2];
        String[] a = a(j, j2, j3);
        if (str.equalsIgnoreCase("current")) {
            this.a.put(Long.valueOf(j), a);
        } else if (str.equalsIgnoreCase("completed")) {
            this.b.put(Long.valueOf(j), a);
        }
    }

    public String a(long j) {
        String str = null;
        if (this.a.containsKey(Long.valueOf(j))) {
            str = ((String[]) this.a.get(Long.valueOf(j)))[1];
        } else if (this.b.containsKey(Long.valueOf(j))) {
            str = ((String[]) this.b.get(Long.valueOf(j)))[1];
        }
        return str;
    }

    public String[] a(Vector vector) {
        return a(this.a, vector);
    }

    public String[] b(Vector vector) {
        return a(this.b, vector);
    }

    public int a() {
        return this.a.size();
    }

    public int b() {
        return this.b.size();
    }

    public void c() {
        this.a.clear();
        this.b.clear();
    }

    private String a(InputStream inputStream) {
        String str = "";
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = inputStream.read();
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(read);
                }
                inputStream.close();
                str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            } catch (Exception e) {
                C0032k.a("QuestLog(processInputStream): Error =>" + e);
            }
        }
        return str;
    }

    private String[] a(Hashtable hashtable, Vector vector) {
        String[] strArr = new String[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            strArr[i] = ((String[]) hashtable.get((Long) vector.get(i)))[0];
        }
        return strArr;
    }

    private String[] a(long j, long j2, long j3) {
        String[] strArr = new String[2];
        strArr[0] = a(getClass().getResourceAsStream(this.c + j + ".txt"));
        String[] split = a(getClass().getResourceAsStream(this.d + j2 + ".txt")).split("\\|");
        C0032k.a("QuestLog(makeQuestLogEntry): QuestLog =>" + split[0]);
        if (j3 == 1) {
            strArr[1] = split[0];
        }
        if (j3 == 2) {
            strArr[1] = split[1];
        }
        return strArr;
    }
}
