package session13;

public class HiThread extends Thread{
    @Override
    public void run(){
        int index = 1;
        for (int i=0; i< 5; i++){
            System.out.println("HiThread running...");
            try {
                Thread.sleep(1024);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(":=> HiThread stopped");
    }
}
