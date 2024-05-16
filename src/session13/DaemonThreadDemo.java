package session13;

public class DaemonThreadDemo extends Thread {
    @Override
    public void run() {
        int count = 1;
        while (true) {
            System.out.println("hi Daemon thread" + count);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
