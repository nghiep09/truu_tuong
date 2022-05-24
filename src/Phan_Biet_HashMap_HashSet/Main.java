package Phan_Biet_HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20,"Ha Noi");
        Student student2 = new Student("Nghiep",18,"Ha Nam");
        Student student3 = new Student("Dat",28,"Bac Giang");
        Student student4 = new Student("Dung", 26, "Nam Dinh");

        Map<Integer, Student>studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("..........Set");
        HashSet<Student> students= new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student:students){
            System.out.println(student.toString());
        }
    }
}
