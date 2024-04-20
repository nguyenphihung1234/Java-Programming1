package session6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayExample2 {
    public static void main(String[] args) {
        //Kiểu nguyên thủy(primitive) , nguyên bản:int,float,double, string
        //Kiểu Class(reference): Kiểu "bao bọc"  Integer,Float,DOuble, String
        int[] numbers = new int[]{25,35,12,3,43,55};
        Integer[] nums = {25,35,12,3,43,55};
        Arrays.sort(nums, Collections.reverseOrder());
        Arrays.sort(numbers,2,4);
        //foreach: Lặp trong 1 tập hợp các collection(objects)
        for (int num : numbers){
           System.out.println("Numbers: " + num);
        }
//        String [] students = new String[]{"H","V","N","P"};
//        //forech
//        for (String stu :students){
//            System.out.println(stu);
//        }
    }
}
