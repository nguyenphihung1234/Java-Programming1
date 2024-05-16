package session13;

//Thread.join();
//Thong bao rang hay cho thread hoan thanhf roi thread cha moi chayj tiep
//chay tiep. Thread cha can phai doi cho toi khi Thread ket thuc
//moi dc chay tiep
public class JoinThreadDemo extends  Thread{
    private String threadName;
    private int count ;
    public JoinThreadDemo (String threadName, int count){
        this.threadName = threadName;
        this.count = count;
    }
    //Noi viet code quy dinh cho Thread
    @Override
    public void run() {
        for (int i = 1; i < count; i++) {
            System.out.println("Hi from " + this.threadName + " " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("");
        }
    }
}
