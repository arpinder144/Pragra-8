package jan13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    String name;
    int age;

//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }

//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
