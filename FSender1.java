import java.util.List;

/*
Name: NGUYEN, Minh Tien
ID  : 1810445
Time: 2020/02/01
*/

public class FSender1<E> extends Thread {
    private FMonitorBBuf1<E> buf;
    private List<E> msgs;

    public FSender1(FMonitorBBuf1<E> buf, List<E> msgs) {
        this.buf = buf;
        this.msgs = msgs;
    }

    public void run() {
        for (int i = 0; i < msgs.size(); i++){
            try {
                buf.put(msgs.get(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}