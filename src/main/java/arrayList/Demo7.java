package arrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Student that) {
        if(this.age>that.age)
            return 1;
        else
            return -1;
    }
}

public class Demo7 {
    public static void main(String[] args) {

        List<Student>students = new ArrayList<>();
        students.add(new Student(21, "Fatih"));
        students.add(new Student(18, "Leyla"));
        students.add(new Student(12,"Melih"));
        students.add(new Student(20,"Nail"));

        Collections.sort(students);

        for (Student student : students)

        System.out.println(student);

    }
}
