package session2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationDemo1 {
    public static void main(String[] args) {
        //TryCatchDemo.tryCatchDemo();
        //ThrowExceptionDemo.validate();
        try {
            int age = inputAge();
            System.out.println("Tuoi vua nhap:" + age);
        }catch (AgeCheckingException e){
            System.out.println(e.getMessage());
        }
    }
static int inputAge() throws AgeCheckingException,InputMismatchException,ArithmeticException,OutOfMemoryError{
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap tuoi cua nhan vien");
    int age =0;
    try {
        age = sc.nextInt();
        if(age < 0) throw  new AgeCheckingException("Tuoi ko dc < 0");
    }catch (InputMismatchException e){
        throw new AgeCheckingException("Tuoi nhap la number");
    }
    return age;
}
}
