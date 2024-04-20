package session6;

public class StringExample {
    //String: Khoong theer thay doi(immutable), ít dữ liệu, nhanh 3
    String message = "Hello java";//primitive; lưu trũ trong stack
            String objecString = new String("Hello java");//Class, Lưu ở Heap
    //====================================
    //StringBuffer: mutable có thể thay đổi; cho nhiều luồng(Thread),nhanh nhì
    //StringBuilder:mutable có thể thay đổi; cho 1 luồng(Thread),nhanh nhất
    //Phù hợp với dữ liệu lớn, để đạt dc hiệu năng cao nhất
    //String trong java dc sử dụng đặc biệt dc ué nhiều nhất trong java
    // vì vậy  nó cânf dc hiệu suất cao và tối ưu chính vì thế mà string classvừa là class vừa là primitive
}
