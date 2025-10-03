package defpackage;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ae  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:ae.class */
public class C0005ae implements Comparator {
    final /* synthetic */ C0040t a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0005ae(C0040t c0040t) {
        this.a = c0040t;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Integer) obj).compareTo((Integer) obj2);
    }
}
