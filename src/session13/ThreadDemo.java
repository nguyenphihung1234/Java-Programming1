package session13;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        int idx =1;
        for (int i =0;i<2;i++){
            System.out.println("Main thread running...." + idx++);
            Thread.sleep(2024);
        }
        HiThread hiThread =new HiThread();
        //chạy Thread
        hiThread.start();
        for (int i = 0;i< 10; i++){
            System.out.println("Main thread running" +idx);
            //ngủ trong
            Thread.sleep(2020);
            System.out.println(":=> HiThread stopped");
        }
    }
}
