package ClassAssignment_2;

import java.util.ArrayList;

public class Student extends Person {
    private String school;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String gender, int age, int height, String school) {
        super(name, gender, age, height);
        this.school = school;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str = str.substring(0, str.length()-1);
        str += ", School: " + school + ", Courses: " + courses + ")";
        return str;
    }

    public void takeCourse(String course) {
        // System.out.println(name + " takes " + course);
        courses.add(course);
    }
}
