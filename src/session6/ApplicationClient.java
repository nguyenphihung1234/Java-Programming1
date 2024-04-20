package session6;

import session3.Student;

import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
        System.out.println("Ban muon luu tru bao nhieu phan tu mang :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int intArray[] = new int[size];//Mảng "tạm"
        //truyền mảng tạo cho hàm createArray(int[] arr)
        arrayExample.createArray(intArray);
        System.out.println("Mang vua nhap la:");
        arrayExample.showArray(intArray);
        System.out.println("Mang sau khi sap xep:");
        arrayExample.ascSort(intArray);
        arrayExample.showArray(intArray);



//        String name[] = new String[10];//String type
//        boolean gender[];//0,1 type
//  //    Student st[];//object type


    }
}
