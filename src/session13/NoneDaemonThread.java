package session13;

public class NoneDaemonThread extends Thread{
    @Override
    public void run() {
    //super.run();
        int i = 1;
        while (i < 10){
            System.out.println("Hi from None daemon thread");
            try {
                sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n=>None Daemon Thread ending");
    }
}
