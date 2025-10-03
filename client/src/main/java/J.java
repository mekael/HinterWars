

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J  reason: default package */
/* loaded from: hinterwars.jar:J.class */
public class J implements Comparator {
    final /* synthetic */ C0040t a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(C0040t c0040t) {
        this.a = c0040t;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Integer) obj).compareTo((Integer) obj2);
    }
}
