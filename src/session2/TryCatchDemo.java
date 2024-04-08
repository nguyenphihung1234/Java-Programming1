package session2;

public class TryCatchDemo {
    public static void tryCatchDemo(){
        int a =20;
        int b =0;
        try{
            int c =a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Khong the chia cho 0." +e.getMessage());
        }finally {
            System.out.println("Khoi lenh nay luon dc thuc thi");
        }

    }
    public static void tryCatchFinallyDemo(){}
    /*try-catch lồngnhau , khi khối try-catch lồng tronh 1 khối try-catch khác
    * sử dungj khi tình huống có thể phát sinh trong đó có 1 phần của khối có  thể gây ra lỗi
    *
    *
     */
    public static void nestedTryCatchDemo(){
       try {
           try {
               System.out.println("Thuc hien phep chia");
               int b = 1000/0;

           }catch (ArithmeticException e){
               System.out.println(e.getMessage());
           }
           try {
               int a[] = new int[10];
               a[10] = 20;
           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println(e.getMessage());
           }

       }catch (Exception e){
           System.out.println("Kieemr tra dc loi");
       }

    }
}
