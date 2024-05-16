package session13;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nMain Thread starting...");
        Thread joinThreadA = new JoinThreadDemo("A*",2);
        Thread joinThreadB = new JoinThreadDemo("B*",3 );

        //Thread nay ko dung join
        Thread noJoinThreadC = new JoinThreadDemo("C*",5);
        joinThreadA.start();
        joinThreadB.start();
        noJoinThreadC.start();
        //su dung join()
        joinThreadA.join();
        joinThreadB.join();

        //Doan code duoi day se phai cho cho toi khi 2ThradA,B hoan thanh moi chay tiep

        System.out.println("Hi from main thrad...");
        System.out.println("thread A isLive  " +joinThreadA.isAlive());
    }
}
