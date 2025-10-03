package defpackage;

import java.io.IOException;

/* renamed from: d  reason: default package and case insensitive filesystem */
/* loaded from: hinterwars.jar:d.class */
public class C0025d extends Thread {
    private GameStates b;
    private int c = 0;
    private boolean a = false;

    public C0025d(GameStates gameStates) {
        this.b = gameStates;
    }

    public void a() {
        this.a = true;
    }

    public synchronized String a(String str) {
        C0032k.a("line = " + str);
        String[] split = str.split("\\|");
        if (split[0].equals(C0000a.aF) || ((split[0].equals(C0000a.an) && this.b.qm != 22) || split[0].equals("KO"))) {
            return str;
        }
        this.b.U.write("ACK|" + split[1] + C0000a.w);
        this.b.U.flush();
        C0032k.a("sent: ACK|" + split[1] + C0000a.w);
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
        C0032k.a("current msgID = " + this.c + " sent ACK" + split[1] + ".. line = " + str2);
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        defpackage.C0032k.a("colony: read null, exiting");
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
                String readLine = this.b.T.readLine();
                if (readLine == null) {
                    break;
                }
                String a = a(readLine);
                C0032k.a(a);
                this.b.d(a);
                Thread.sleep(100L);
            } catch (IOException e) {
                C0032k.a("colony: Read failed");
            } catch (InterruptedException e2) {
                C0032k.a(e2.getMessage());
            }
        }
        if (this.a) {
            return;
        }
        this.b.a("Connection with the server is lost.\nPlease try again.\n[Press Any Key]", (byte) 8, (Object) null);
    }
}
