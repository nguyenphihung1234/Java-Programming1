package session13;

public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=>Main thread running.....\n");
        //Tao mot thread
        Thread daemonThread = new DaemonThreadDemo();
        //Set no la Daemon Thread
        daemonThread.setDaemon(true);
        daemonThread.start();
//        new HiThread().start();
        new NoneDaemonThread().start();
        Thread.sleep(5000);

        System.out.println("=>Main thread stopped ");
    }
}
