package session3;

import javax.xml.namespace.QName;

public class ApplicationDemo {
    public static void main(String[] args) {
        // tao doi tuong
        Student student= new Student("Diep","Bac Ninh","2005");
        System.out.println("Student info:"+student.toString());
        // student1
        Student student1 = new Student();
        student1.setName("Hung");
        student1.setAddress("Vinh Phuc");
        student1.setBornYear("2005");
        System.out.println("student1 info: "+ student1.toString());
        System.out.println("name: "+student1.getName());
        // student2
        Student student2 = new Student("Hung");
        System.out.println("student2 info" +student2.toString());
    }
}
