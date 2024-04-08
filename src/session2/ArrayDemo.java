package session2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void createArray(){
        Scanner sc = new Scanner(System.in);
        int size =0;
        //Nếu nhập dữ liệu nhỏ hơn 0 thì nhập lại
        while ((size <= 0)) {
            boolean check = false;
            while (!check) {//Vòng lăp while để lặp khi nhảy vào khối catch
                try {
                    System.out.println("Nhap vao so luong cua mang");
                    size = Integer.parseInt(sc.nextLine());
                    check = true;
                } catch (ArithmeticException sql) {
                    System.out.println("Arithmetic");
                } catch (OutOfMemoryError io) {
                    System.out.println("Ofmen");
                } catch (InputMismatchException input) {
                    System.out.println("Input data wrong!!!");
                } catch (NumberFormatException e) {
                    System.out.println("Nhap sai , Vui long nhap lai");
                }
            }
        }
    }
}
