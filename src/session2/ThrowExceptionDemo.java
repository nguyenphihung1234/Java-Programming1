package session2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExceptionDemo {
    public static void validate(){
        try {
            int age = inputAge();
            if(age < 18)
                throw  new ArithmeticException("Ban chua du tuoi di lam");
            else
                System.out.println("Da du tuoi di lam");
        }catch (InputMismatchException e){
            System.out.println("Nhap so tuoi hop le");
        }
    }
    public static int inputAge(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Input your age:");
        int age = sc.nextInt();
        return age;
    }

}
