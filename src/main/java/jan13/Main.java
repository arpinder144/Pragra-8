package jan13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Arpinder", 25));
        studentList.add(new Student("Surinder", 27));
        studentList.add(new Student("Pankaj", 28));
        studentList.add(new Student("Rajan", 24));
        studentList.add(new Student("Sukhjit", 30));

        List<Student> collect = studentList.stream().filter((s -> s.getAge() > 26)).collect(Collectors.toList());
        System.out.println(collect);


    }
        //System.out.println(studentList);

   // public static
}