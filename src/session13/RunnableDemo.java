package session13;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        int idx =1;
        for(int i=0; i< 5; i++){
            System.out.println("Hi from RunnableDemo"+ idx);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
