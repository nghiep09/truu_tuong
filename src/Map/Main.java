package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Binh", 20, "Hoa Binh");
        Student student1 = new Student("Long", 28, "Nam Dinh");
        Student student2 = new Student("Son", 25, "Hai Phong");
        Student student3 = new Student("Quang", 30, "Ha Giang");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list);
        for (Student st : list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh tuoi");
        for (Student st:list) {
            System.out.println(st.toString());

        }
    }
}
