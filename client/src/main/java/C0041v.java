package defpackage;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:v.class */
public class C0041v implements Comparator {
    final /* synthetic */ C0031j a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0041v(C0031j c0031j) {
        this.a = c0031j;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Integer) obj).compareTo((Integer) obj2);
    }
}
