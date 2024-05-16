package session13;

public class RunnableTest {
    public static void main(String[] args) throws  InterruptedException {
        System.out.println("Main thread running...");
        Thread thread = new Thread(new RunnableDemo());
        thread.start();
        thread.setDaemon(true );// set thread thanh Daemon: luong uu tien thap
        Thread.sleep(3000);
        System.out.println("Main Thread stopped");
    }
}
