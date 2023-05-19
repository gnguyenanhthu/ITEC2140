package ClassAssignment_2;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Female", 18, 65, "GGC");
        student.takeCourse("ITEC 2140");
        student.takeCourse("ITEC 2150");
        student.takeCourse("ITEC 3150");
        System.out.println(student);
    }
}
