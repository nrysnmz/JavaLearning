package array;

class Student
{
    int rollno;
    String name;
    int marks;
}
public class ArrayOfStudents2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 78;
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Kavin";
        s2.marks = 65;
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Raven";
        s3.marks = 55;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (Student stud : students)         //Enhanced for loop or for each loop
        {
            System.out.println(stud.rollno + "." + stud.name + " : " + stud.marks);
        }
    }
}