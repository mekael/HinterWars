package defpackage;

import java.io.IOException;

/* renamed from: Y  reason: default package */
/* loaded from: hinterwars.jar:Y.class */
public class Y extends Thread {
    private GameStates b;
    private int c = 0;
    private boolean a = false;

    public Y(GameStates gameStates) {
        this.b = gameStates;
    }

    public void a() {
        this.a = true;
    }

    public String a(String str) {
        C0032k.a("test " + str);
        String[] split = str.split("\\|");
        this.b.pe.write("ACK|" + split[1] + C0000a.w);
        this.b.pe.flush();
        C0032k.a("sent ACK to " + str);
        String str2 = "";
        if (this.c < Integer.parseInt(split[1]) || (this.c == 255 && Integer.parseInt(split[1]) == 1)) {
            for (int i = 0; i < split.length; i++) {
                if (i != 1) {
                    str2 = str2 + split[i];
                    if (i != split.length - 1) {
                        str2 = str2 + C0000a.v;
                    }
                }
            }
            this.c = Integer.parseInt(split[1]);
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        defpackage.C0032k.a("auth: read null, exiting");
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        while (true) {
            if (this.a) {
                break;
            }
            try {
                String readLine = this.b.pd.readLine();
                if (readLine == null) {
                    break;
                }
                String a = a(readLine);
                C0032k.a(a);
                this.b.c(a);
                Thread.sleep(100L);
            } catch (IOException e) {
                C0032k.a("auth: Read failed");
                return;
            } catch (InterruptedException e2) {
                C0032k.a(e2.getMessage());
                return;
            }
        }
        if (this.a) {
            return;
        }
        this.b.a("Connection with the server is lost.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
    }
}
